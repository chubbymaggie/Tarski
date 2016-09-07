package eu.modelwriter.configuration.emf2alloy;

import org.eclipse.jface.wizard.IWizardPage;

import eu.modelwriter.configuration.converter.AbstractConverter;
import eu.modelwriter.configuration.converter.ConverterWizard;
import eu.modelwriter.configuration.internal.EcoreUtilities;

public class EMFToAlloyWizard extends ConverterWizard {

  public EMFToAlloyWizard(AbstractConverter converter, String title) {
    super(converter, title);
  }

  @Override
  public void addPages() {
    super.addPages();
    addPage(new AliasSelectionPage(getConverter().getFileName()));
    addPage(new ContainerSelectionPage(getConverter().getAlias(),
        EcoreUtilities.getEMFClassesFromEObject(getConverter().getEcoreRoot())));
    addPage(new BoundSelectionPage(getConverter().getAlias(),
        EcoreUtilities.getEMFClassesFromEObject(getConverter().getEcoreRoot())));
    addPage(new FinishPage());
  }

  @Override
  public boolean performFinish() {
    getConverter().performFinish();
    return true;
  }

  @Override
  public boolean canFinish() {
    IWizardPage page = getContainer().getCurrentPage();
    boolean isLastPage = page.getName().equals("lastpage");
    if (isLastPage && getConverter().state == getConverter().NOT_STARTED) {
      getConverter().run();
      return false;
    }
    if (isLastPage && getConverter().state == getConverter().FINISHED) {
      return getConverter().isSaveLocationSet();
    }
    return false;
  }

  @Override
  public EMFToAlloy getConverter() {
    return (EMFToAlloy) super.getConverter();
  }

}