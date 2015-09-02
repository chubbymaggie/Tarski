/**
 */
package eu.modelwriter.alloyxmlapi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.modelwriter.alloyxmlapi.TypeType#getValue <em>Value</em>}</li>
 *   <li>{@link eu.modelwriter.alloyxmlapi.TypeType#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see eu.modelwriter.alloyxmlapi.AlloyXSDFilePackage#getTypeType()
 * @model extendedMetaData="name='type_._type' kind='simple'"
 * @generated
 */
public interface TypeType extends EObject {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see eu.modelwriter.alloyxmlapi.AlloyXSDFilePackage#getTypeType_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="name=':0' kind='simple'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link eu.modelwriter.alloyxmlapi.TypeType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #isSetID()
   * @see #unsetID()
   * @see #setID(byte)
   * @see eu.modelwriter.alloyxmlapi.AlloyXSDFilePackage#getTypeType_ID()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
   *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
   * @generated
   */
  byte getID();

  /**
   * Sets the value of the '{@link eu.modelwriter.alloyxmlapi.TypeType#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #isSetID()
   * @see #unsetID()
   * @see #getID()
   * @generated
   */
  void setID(byte value);

  /**
   * Unsets the value of the '{@link eu.modelwriter.alloyxmlapi.TypeType#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetID()
   * @see #getID()
   * @see #setID(byte)
   * @generated
   */
  void unsetID();

  /**
   * Returns whether the value of the '{@link eu.modelwriter.alloyxmlapi.TypeType#getID <em>ID</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>ID</em>' attribute is set.
   * @see #unsetID()
   * @see #getID()
   * @see #setID(byte)
   * @generated
   */
  boolean isSetID();

} // TypeType