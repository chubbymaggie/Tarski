package eu.modelwriter.visualization.editor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import eu.modelwriter.visualization.editor.util.GraphUtil;
import eu.modelwriter.visualization.model.ModelBuilder;
import eu.modelwriter.visualization.model.Universe;

public class Frame extends JFrame {
  private static final long serialVersionUID = 1L;

  public static Frame getInstance(final Universe universe) {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | UnsupportedLookAndFeelException e) {
      e.printStackTrace();
    }
    final Frame instance = new Frame(universe);
    return instance;
  }

  private final Graph graph;
  private final GraphComponent graphComponent;

  public Frame(final Universe universe) {
    this.setTitle("Visualization");
    this.getContentPane().setLayout(new BorderLayout(0, 0));

    final GraphEditor vge = new GraphEditor();
    this.graph = vge.getGraph();
    this.graphComponent = vge.getGraphComponent();

    final ModelBuilder builder = new ModelBuilder(universe, this.graph);
    builder.build();

    GraphUtil.getInstance(this.graph, this.graphComponent).layout();

    // Initial validation
    this.graphComponent.validateGraph();

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
    // final JViewport viewport = Frame.this.graphComponent.getViewport();
    // }
    // }
    //
    // @Override
    // public void componentShown(final ComponentEvent e) {}
    // });

    this.getContentPane().add(vge, BorderLayout.CENTER);
  }


  public void showModel() {
    this.setSize((int) GraphUtil.width, (int) GraphUtil.height);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
