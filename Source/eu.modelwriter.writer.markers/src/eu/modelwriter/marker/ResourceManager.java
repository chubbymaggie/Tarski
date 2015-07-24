package eu.modelwriter.marker;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;

// plug-in must be loaded for resource change listener to work
class ResourceManager implements IResourceChangeListener {
  private static ResourceManager manager;

  public ResourceManager(int eventMask) {
    ResourcesPlugin.getWorkspace().addResourceChangeListener(this, eventMask);
  }

  public static void shutdown() {
    if (manager != null) {
      ResourcesPlugin.getWorkspace().removeResourceChangeListener(manager);
      manager = null;
    }
  }

  public static ResourceManager getManager(int eventMask) {
    if (manager == null)
      manager = new ResourceManager(eventMask);
    return manager;
  }

  public void printAllResourceChanges() {
    new ResourceDeltaPrinter();
  }

  @Override
  public void resourceChanged(IResourceChangeEvent event) {
    throw new UnsupportedOperationException();
  }

}
