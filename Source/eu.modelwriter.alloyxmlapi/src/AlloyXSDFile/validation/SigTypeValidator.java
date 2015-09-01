/**
 *
 * $Id$
 */
package AlloyXSDFile.validation;

import AlloyXSDFile.AtomType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link AlloyXSDFile.SigType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SigTypeValidator {
  boolean validate();

  boolean validateMixed(FeatureMap value);
  boolean validateAtom(EList<AtomType> value);
  boolean validateAbstract(String value);
  boolean validateBuiltin(String value);
  boolean validateEnum(String value);
  boolean validateID(byte value);
  boolean validateLabel(String value);
  boolean validateLocation(Object value);
  boolean validateLone(String value);
  boolean validateMeta(String value);
  boolean validateOne(String value);
  boolean validateParentID(byte value);
  boolean validatePrivate(String value);
  boolean validateSome(String value);
  boolean validateSubset(String value);
  boolean validateSubsig(String value);
}
