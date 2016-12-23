/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016, Ferhat Erata <ferhat@computer.org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package eu.modelwriter.core.alloyinecore.structure;

import java.util.HashMap;
import java.util.Map;

public class Document{

    public boolean isParsingCompleted() {
        return parsingCompleted;
    }

    private boolean parsingCompleted = false;

    private Package documentRoot;
    public Package getDocumentRoot() {
        return documentRoot;
    }
    public void setDocumentRoot(Package documentRoot) {
        this.documentRoot = documentRoot;
    }

    public void addReference(String fromQualifiedName, String toQualifiedName){
        referenceTable.put(fromQualifiedName, toQualifiedName);
    }

    private final Map<String, String> referenceTable = new HashMap<>();
    public String getReference(String qualifiedName){
        return referenceTable.get(qualifiedName);
    }
    public Map<String, String> getAllReferences(){
        return referenceTable;
    }

    private final Map<String, NamedElement> elements = new HashMap<>();
    private final Map<String, Class> classes = new HashMap<>();
    private final Map<String, DataType> dataTypes = new HashMap<>();

    public NamedElement getElement (String qualifiedName){
        return elements.get(qualifiedName);
    }
    public void addElement(NamedElement element){
        if (element instanceof Classifier) {
            elements.put(Document.getQualifiedName((Classifier) element), element);
            if (element instanceof Class)
                classes.put(Document.getQualifiedName((Class) element), (Class)element);
            else if (element instanceof DataType)
                dataTypes.put(Document.getQualifiedName((DataType) element), (DataType) element);
        }
        else if (element instanceof Package)
            elements.put(Document.getQualifiedName((Package)element), element);
        else if (element instanceof StructuralFeature)
            elements.put(Document.getQualifiedName((StructuralFeature)element), element);
        else if (element instanceof EnumLiteral)
            elements.put(Document.getQualifiedName((EnumLiteral)element), element);
        else if (element instanceof Operation)
            elements.put(Document.getQualifiedName((Operation)element), element);
        else if (element instanceof Parameter)
            elements.put(Document.getQualifiedName((Parameter)element), element);
    }

    public Class getClass (String qualifiedName){
        return classes.get(qualifiedName);
    }
    public DataType getDataType (String qualifiedName){
        return dataTypes.get(qualifiedName);
    }

    private static Document INSTANCE = new Document();
    public static Document getInstance() {
        return Document.INSTANCE;
    }

    private Document() {
        this.addElement(new DataType("Integer"));
        this.addElement(new DataType("String"));
        this.addElement(new DataType("Boolean"));
        this.addElement(new DataType("BigInteger"));
        this.addElement(new DataType("UnlimitedNatural"));
    }

    private static String getQualifiedName(Package p) {
        return p.getOwner() == null ? p.getName() : getQualifiedName(p.getOwner()) + "." + p.getName();
    }

    private static String getQualifiedName(Classifier c) {
        return getQualifiedName(c.getOwner()) + "." + c.getName();
    }

    private static String getQualifiedName(StructuralFeature f) {
        return getQualifiedName(f.getOwner()) + "::" + f.getName();
    }

    private static String getQualifiedName(Operation o) {
        return getQualifiedName(o.getOwner()) + "->" + o.getName();
    }

    private static String getQualifiedName(EnumLiteral l) {return getQualifiedName(l.getOwner()) + "::" + l.getName();}

    private static String getQualifiedName(Parameter p) {
        return getQualifiedName(p.getOwner()) + "::" + p.getName();
    }

}