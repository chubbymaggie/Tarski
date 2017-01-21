/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017, Ferhat Erata <ferhat@computer.org>
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

package eu.modelwriter.core.alloyinecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class ModelIO<T extends EObject> {
  private ResourceSet resourceSet;

  public ResourceSet getResourceSet() {
    if (this.resourceSet == null) {
      this.resourceSet = new ResourceSetImpl();
      this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
          .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new EcoreResourceFactoryImpl());
      this.registerPackages(this.resourceSet.getPackageRegistry());
    }

    return this.resourceSet;
  }

  @SuppressWarnings("unchecked")
  public List<T> read(final URI uri) throws IOException {
    final Resource res = this.getResourceSet().createResource(uri);

    try {
      res.load(null);
    } catch (final IOException e) {
      throw new IOException();
    }
    final EList<EObject> contents = res.getContents();

    final List<T> list = new ArrayList<T>();
    for (final EObject content : contents) {

      try {
        list.add((T) content);
      } catch (final Exception e) {
        throw new RuntimeException("Unexpected resource type.");
      }
    }

    return list;
  }

  /**
   * ResourceSet'e paket kayit eder.
   *
   * <br>
   * <br>
   * Ornegin; <br>
   * <code>packageRegistry.put(ContentPackage.eNS_URI, ContentPackage.eINSTANCE);</code> <br>
   * <br>
   * Kendi modellerinizi kullanacaksaniz bu methodu gerceklestiriniz ve kendi paket arayuzunuzu
   * kayit ediniz. EMF metamodelleri kullanacaksaniz varsayilan gerceklestirim yeterlidir.
   *
   * @param packageRegistry ResourceSet'a ait paket kayitcisi.
   */
  protected void registerPackages(final EPackage.Registry packageRegistry) {}

  public void write(final URI uri, final T obj) {
    final Resource resource = this.getResourceSet().createResource(uri);

    resource.getContents().add(obj);

    final HashMap<Object, Object> options = new HashMap<>();
    try {
      resource.save(options);
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }
}
