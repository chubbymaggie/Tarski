package eu.modelwriter.visualization.build;

import javax.swing.JPanel;

import eu.modelwriter.model.ModelManager;
import eu.modelwriter.visualization.input.IGraphInput;
import eu.modelwriter.visualization.jgraphx.editor.GraphEditor;
import eu.modelwriter.visualization.jgraphx.editor.StaticEditorManager;
import eu.modelwriter.visualization.jgraphx.editor.util.GraphUtil;
import eu.modelwriter.visualization.jgraphx.model.GraphBuilder;

public class GraphBuilderJGraphx implements IGraphBuilder {
  private final ModelManager modelManager;

  public GraphBuilderJGraphx(final IGraphInput graphInput) {
    modelManager = (ModelManager) graphInput.get();
  }

  @Override
  public JPanel build() {
    final GraphEditor vge = new GraphEditor();

    StaticEditorManager.builder = new GraphBuilder(modelManager);
    StaticEditorManager.builder.build();

    GraphUtil.getInstance().layout();

    // Initial validation
    StaticEditorManager.graphComponent.validateGraph();

    // this.addComponentListener(new ComponentListener() {
    //
    // @Override
    // public void componentHidden(final ComponentEvent e) {}
    //
    // @Override
    // public void componentMoved(final ComponentEvent e) {}
    //
    // @Override
    // public void componentResized(final ComponentEvent e) {
    // if (e.getID() == ComponentEvent.COMPONENT_RESIZED) {
    // final Rectangle bounds = e.getComponent().getBounds();
    // final JViewport viewport = StaticEditorManager.graphComponent.getViewport();
    // }
    // }
    //
    // @Override
    // public void componentShown(final ComponentEvent e) {}
    // });

    return vge;
  }

}
