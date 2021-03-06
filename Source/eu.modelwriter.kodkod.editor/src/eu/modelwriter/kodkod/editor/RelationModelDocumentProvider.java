package eu.modelwriter.kodkod.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

import eu.modelwriter.kodkod.editor.scanners.RelationModelPartitionScanner;

/**
 * Document provider is needed for document partitioning. In our editor, they are just Comment
 * Partition and Default Partition (for codes).
 *
 * @author anil.ozturk
 *
 */
public class RelationModelDocumentProvider extends FileDocumentProvider {

  @Override
  protected IDocument createDocument(final Object element) throws CoreException {
    final IDocument document = super.createDocument(element);
    if (document != null) {
      final IDocumentPartitioner partitioner = new FastPartitioner(
          new RelationModelPartitionScanner(), RelationModelPartitionScanner.PARTITION_TYPES);
      partitioner.connect(document);
      document.setDocumentPartitioner(partitioner);
    }
    return document;
  }
}
