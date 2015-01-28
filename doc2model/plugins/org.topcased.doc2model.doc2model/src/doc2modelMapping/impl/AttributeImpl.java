/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeImpl.java,v 1.3 2009/05/11 06:38:57 tfaure Exp $
 */
package doc2modelMapping.impl;

import doc2modelMapping.Attribute;
import doc2modelMapping.DependantInjection;
import doc2modelMapping.Doc2modelMappingPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link doc2modelMapping.impl.AttributeImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeImpl extends DynamicElementImpl implements Attribute
{
    /**
     * The default value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeValue()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_VALUE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeValue()
     * @generated
     * @ordered
     */
    protected String attributeValue = ATTRIBUTE_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return Doc2modelMappingPackage.Literals.ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttributeValue()
    {
        return attributeValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeValue(String newAttributeValue)
    {
        String oldAttributeValue = attributeValue;
        attributeValue = newAttributeValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Doc2modelMappingPackage.ATTRIBUTE__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case Doc2modelMappingPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
                return getAttributeValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case Doc2modelMappingPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
                setAttributeValue((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case Doc2modelMappingPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
                setAttributeValue(ATTRIBUTE_VALUE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case Doc2modelMappingPackage.ATTRIBUTE__ATTRIBUTE_VALUE:
                return ATTRIBUTE_VALUE_EDEFAULT == null ? attributeValue != null : !ATTRIBUTE_VALUE_EDEFAULT.equals(attributeValue);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (attributeValue: ");
        result.append(attributeValue);
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
