package eu.modelwriter.marker.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import eu.modelwriter.marker.MarkerActivator;
import eu.modelwriter.marker.internal.MarkerFactory;
import eu.modelwriter.marker.ui.internal.wizards.mappingwizard.MappingWizard;
import eu.modelwriter.marker.ui.internal.wizards.markerwizard.MarkerWizard;

public class MarkWithTypeHandler extends AbstractHandler {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    ISelection selection = MarkerFactory.getSelection();
    IFile file = (IFile) MarkerActivator.getEditor().getEditorInput().getAdapter(IFile.class);
    IEditorPart editor =
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

    if (selection instanceof TextSelection) {
      TextSelection textSelection = (TextSelection) selection;

      MarkerWizard markerWizard = new MarkerWizard(selection, file);

      WizardDialog dialog = new WizardDialog(MarkerActivator.getShell(), markerWizard);

      if (dialog.open() == org.eclipse.jface.window.Window.OK) {
        System.out.println("Ok pressed");
      } else {
        System.out.println("Cancel pressed");
      }

    } else if (selection instanceof TreeSelection) {
      ITreeSelection treeSelection = (ITreeSelection) selection;
      if (selection != null && editor instanceof EcoreEditor) {
        if (treeSelection.getFirstElement() instanceof ENamedElement
            && ((ENamedElement) treeSelection.getFirstElement()).getName() != null
            && !((ENamedElement) treeSelection.getFirstElement()).getName().isEmpty()) {
          try {
            URI uri = EcoreUtil.getURI((ENamedElement) treeSelection.getFirstElement());

            IMarker marker;

            marker = MarkerFactory.findMarkersByUri(file, uri.toString());

            if (marker != null && marker.exists()) {
              MappingWizard mappingWizard = new MappingWizard(marker);

              WizardDialog dialog = new WizardDialog(MarkerActivator.getShell(), mappingWizard);

              if (dialog.open() == org.eclipse.jface.window.Window.OK) {
                System.out.println("Ok pressed");
              } else {
                System.out.println("Cancel pressed");
              }
            } else {
              MessageDialog dialog = new MessageDialog(MarkerActivator.getShell(),
                  "There is no marker in this position", null, "Please select valid marker",
                  MessageDialog.INFORMATION, new String[] {"OK"}, 0);
              dialog.open();
            }
          } catch (CoreException e) {
            e.printStackTrace();
          }
        } else if (!((EObject) treeSelection.getFirstElement() instanceof EModelElement)) {
          try {
            URI uri = EcoreUtil.getURI((EObject) treeSelection.getFirstElement());

            IMarker marker;
            marker = MarkerFactory.findMarkersByUri(file, uri.toString());

            if (marker != null && marker.exists()) {
              MappingWizard mappingWizard = new MappingWizard(marker);

              WizardDialog dialog = new WizardDialog(MarkerActivator.getShell(), mappingWizard);

              if (dialog.open() == org.eclipse.jface.window.Window.OK) {
                System.out.println("Ok pressed");
              } else {
                System.out.println("Cancel pressed");
              }
            } else {
              MessageDialog dialog = new MessageDialog(MarkerActivator.getShell(),
                  "There is no marker in this position", null, "Please select valid marker",
                  MessageDialog.INFORMATION, new String[] {"OK"}, 0);
              dialog.open();
            }
          } catch (CoreException e) {
            e.printStackTrace();
          }
        }
      }
    }

    return null;
  }
}
