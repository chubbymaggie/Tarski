package eu.modelwriter.marker.command;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

import eu.modelwriter.configuration.alloy.reasoning.AlloyNextSolution;
import eu.modelwriter.configuration.internal.AlloyUtilities;

public class UpdateSpecHandler extends AbstractHandler {

  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    IFile file = this.getFile();
    IEditorPart editor;

    if (file == null) {
      editor = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage()
          .getActiveEditor();
      file = ResourceUtil.getFile(editor.getEditorInput());
    } else {
      editor = ResourceUtil
          .findEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
    }

    if (editor == null) {
      return null;
    }

    if (editor.isDirty()) {
      final MessageDialog warningdialog =
          new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
              "Save Specification", null,
              file.getName()
                  + " has been modified. You must save file for update the specification. Do you want to save now?",
              MessageDialog.WARNING, new String[] {"Yes", "No"}, 0);
      if (warningdialog.open() != 0) {
        return null;
      }

      AlloyNextSolution.getInstance().finishNext();
      editor.doSave(new NullProgressMonitor());
    }

    final String content = this.getContent(file);
    if (content == null) {
      return null;
    }

    AlloyUtilities.updateSpec(file.getLocation().makeAbsolute().toOSString(), content);

    final MessageDialog dialog = new MessageDialog(
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Status Information", null,
        "Specification has been updated.", MessageDialog.INFORMATION, new String[] {"OK"}, 0);
    dialog.open();

    return null;
  }

  public String getContent(final IFile file) {
    try {
      final byte[] encoded = Files.readAllBytes(Paths.get(file.getLocationURI()));
      return new String(encoded, "UTF-8");
    } catch (final IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public IFile getFile() {
    IFile file = null;
    final ISelection selection =
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
    if (selection != null && selection instanceof TreeSelection) {
      final TreeSelection treeSelection = (TreeSelection) selection;
      file = (IFile) treeSelection.getFirstElement();
    }
    return file;
  }
}
