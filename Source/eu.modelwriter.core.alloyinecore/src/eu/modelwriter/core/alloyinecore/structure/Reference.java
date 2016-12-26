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

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EReferenceContext;

import java.lang.*;
import java.util.List;

public class Reference extends StructuralFeature<EReferenceContext>{
    public boolean composes = false;
    public boolean resolve = false;
    public Reference opposite = null;

    public Class referenceType = null;

    public Reference(String name, EReferenceContext context) {
        super(name, context);
        this.token = context.name.getStart();
    }

    @Override
    public Class getType() {
        return referenceType;
    }

    public void setQualifiers(List<String> qualifiers){
        for(String s: qualifiers){
            switch (s) {
                case "static":
                    static_ = true;
                    break;
                case "model":
                    model = true;
                    break;
                case "ghost":
                    ghost = true;
                    break;
                case "transient":
                    transient_ = true;
                    break;
                case "volatile":
                    volatile_ = true;
                    break;
                case "nullable":
                    nullable = true;
                    break;
                case "readonly":
                    readonly = true;
                    break;
                case "derived":
                    derived = true;
                    break;
                case "ordered":
                    ordered = true;
                    break;
                case "!unique":
                    unique = false;
                    break;
                case "composes":
                    composes = true;
                    break;
                case "resolve":
                    resolve = true;
                    break;
            }}
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reference{");
        sb.append("name=").append(qualifiedName);
        sb.append(", static=").append(static_);
        sb.append(", model=").append(model);
        sb.append(", ghost=").append(ghost);
        sb.append(", transient=").append(transient_);
        sb.append(", volatile=").append(volatile_);
        sb.append(", nullable=").append(nullable);
        sb.append(", readonly=").append(readonly);
        sb.append(", derived=").append(derived);
        sb.append(", ordered=").append(ordered);
        sb.append(", unique=").append(unique);
        sb.append(", composes=").append(composes);
        sb.append(", resolve=").append(resolve);
        sb.append(", referenceType=").append(referenceType);
        sb.append('}');
        return sb.toString();
    }
}
