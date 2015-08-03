package eu.modelwriter.marker.ui.internal.hyperlinkdetectors;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import eu.modelwriter.marker.MarkerActivator;
import eu.modelwriter.marker.Serialization;
import eu.modelwriter.marker.internal.MarkElement;
import eu.modelwriter.marker.internal.MarkerFactory;
import eu.modelwriter.marker.ui.internal.views.mappingview.SourceView;

public class SourceViewHyperlink implements IHyperlink {

  private final IRegion fUrlRegion;

  public SourceViewHyperlink(IRegion urlRegion) {
    fUrlRegion = urlRegion;
  }

  @Override
  public IRegion getHyperlinkRegion() {
    return fUrlRegion;
  }

  @Override
  public String getTypeLabel() {
    return null;
  }

  @Override
  public String getHyperlinkText() {
    return "Open Source Mappings";
  }

  @Override
  public void open() {
    try {
      IFile file = (IFile) MarkerActivator.getEditor().getEditorInput().getAdapter(IFile.class);

      IMarker beMapped = MarkerFactory.findMarkerByOffset(file, fUrlRegion.getOffset());

      PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(SourceView.ID);

      ArrayList<MarkElement> sourceElements = null;
      try {
        if ((beMapped != null)
            && (beMapped.getAttribute(MarkElement.getSourceAttributeName()) != null)) {
          sourceElements = Serialization.getInstance()
              .fromString((String) beMapped.getAttribute(MarkElement.getSourceAttributeName()));
          SourceView.setColumns(sourceElements);
        } else {
          SourceView.setColumns(new ArrayList<MarkElement>());
        }
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (CoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    } catch (PartInitException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}