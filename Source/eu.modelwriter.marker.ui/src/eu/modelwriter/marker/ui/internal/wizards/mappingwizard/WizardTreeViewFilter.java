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
package eu.modelwriter.marker.ui.internal.wizards.mappingwizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import eu.modelwriter.configuration.internal.AlloyUtilities;
import eu.modelwriter.marker.internal.MarkElementUtilities;
import eu.modelwriter.marker.internal.MarkerFactory;

public class WizardTreeViewFilter extends ViewerFilter {
  private static ArrayList<String> suitableTypes;

  public WizardTreeViewFilter() {
    suitableTypes = AlloyUtilities.getSuitableSecondSideTypesOfRelation(
        RelationWizard.selectedRelation.substring(0, RelationWizard.selectedRelation.indexOf(" ")));
  }

  @Override
  public boolean select(Viewer viewer, Object parentElement, Object element) {

    if (element instanceof IProject) {
      IProject project = (IProject) element;
      if (!project.isOpen()) {
        return false;
      } else {
        List<IMarker> list = MarkerFactory.findMarkers(project);
        if (list.isEmpty()
            || (list.size() == 1 && list.get(0).equals(RelationWizard.selectedMarker))) {
          return false;
        }
      }
    } else if (element instanceof IFolder) {
      IFolder folder = (IFolder) element;
      List<IMarker> list = MarkerFactory.findMarkers(folder);
      if (list.isEmpty()
          || (list.size() == 1 && list.get(0).equals(RelationWizard.selectedMarker))) {
        return false;
      }
    } else if (element instanceof IFile) {
      IFile file = (IFile) element;
      List<IMarker> list = MarkerFactory.findMarkers(file);
      if (list.isEmpty()
          || (list.size() == 1 && list.get(0).equals(RelationWizard.selectedMarker))) {
        return false;
      }
    } else if (element instanceof IMarker
        && suitableTypes.contains("this/" + MarkElementUtilities.getType((IMarker) element)))
      return true;
    else
      return false;
    return true;
  }
}
