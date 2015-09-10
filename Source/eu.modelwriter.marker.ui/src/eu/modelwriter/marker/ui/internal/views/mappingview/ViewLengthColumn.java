/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D Ltd All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Ferhat Erata - initial API and implementation H. Emre Kirmizi - initial API and
 * implementation Serhat Celik - initial API and implementation U. Anil Ozturk - initial API and
 * implementation
 *******************************************************************************/
package eu.modelwriter.marker.ui.internal.views.mappingview;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;

public class ViewLengthColumn extends ViewColumn {

  @Override
  public String getText(Object element) {
    // if (element instanceof MarkElement) {
    // return Integer.toString(MarkElementUtilities.getLength(((MarkElement)
    // element).getiMarker()));
    // }
    // return "";
    if (element instanceof IMarker) {
      IMarker iMarker = (IMarker) element;
      try {
        int length = ((int) iMarker.getAttribute(IMarker.CHAR_END))
            - ((int) iMarker.getAttribute(IMarker.CHAR_START));
        return Integer.toString(length);
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    return "";
  }

  @Override
  public String getTitle() {
    return "Length";
  }

  @Override
  public int getWidth() {
    return 50;
  }
}
