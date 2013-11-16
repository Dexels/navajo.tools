/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.dexels.navajo.dsl.model.tsl.ExpressionTag;
import com.dexels.navajo.dsl.model.tsl.PossibleExpression;
import com.dexels.navajo.dsl.model.tsl.Property;
import com.dexels.navajo.dsl.model.tsl.TslPackage;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends ElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getExpressionValue() <em>Expression Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionTag> expressionValue;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LENGTH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal length = LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubtypes() <em>Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected String subtypes = SUBTYPES_EDEFAULT;
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected String valueString = VALUE_STRING_EDEFAULT;
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TslPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionTag> getExpressionValue() {
		if (expressionValue == null) {
			expressionValue = new EObjectContainmentEList<ExpressionTag>(ExpressionTag.class, this, TslPackage.PROPERTY__EXPRESSION_VALUE);
		}
		return expressionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		for (PossibleExpression possibleExpression : getAttributes()) {
			if("type".equals(possibleExpression.getKey())) {
				if(possibleExpression.getValue()!=null) {
					return possibleExpression.getValue();
				} else {
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(BigDecimal newLength) {
		BigDecimal oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtypes() {
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypes(String newSubtypes) {
		String oldSubtypes = subtypes;
		subtypes = newSubtypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__SUBTYPES, oldSubtypes, subtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(String newValueString) {
		String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__VALUE_STRING, oldValueString, valueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.PROPERTY__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		for (PossibleExpression possibleExpression : getAttributes()) {
			if("name".equals(possibleExpression.getKey())) {
				if(possibleExpression.getValue()!=null) {
					return possibleExpression.getValue();
				} else {
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TslPackage.PROPERTY__EXPRESSION_VALUE:
				return ((InternalEList<?>)getExpressionValue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TslPackage.PROPERTY__EXPRESSION_VALUE:
				return getExpressionValue();
			case TslPackage.PROPERTY__TYPE:
				return getType();
			case TslPackage.PROPERTY__LENGTH:
				return getLength();
			case TslPackage.PROPERTY__SUBTYPES:
				return getSubtypes();
			case TslPackage.PROPERTY__CARDINALITY:
				return getCardinality();
			case TslPackage.PROPERTY__VALUE_STRING:
				return getValueString();
			case TslPackage.PROPERTY__DIRECTION:
				return getDirection();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TslPackage.PROPERTY__EXPRESSION_VALUE:
				getExpressionValue().clear();
				getExpressionValue().addAll((Collection<? extends ExpressionTag>)newValue);
				return;
			case TslPackage.PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case TslPackage.PROPERTY__LENGTH:
				setLength((BigDecimal)newValue);
				return;
			case TslPackage.PROPERTY__SUBTYPES:
				setSubtypes((String)newValue);
				return;
			case TslPackage.PROPERTY__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case TslPackage.PROPERTY__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case TslPackage.PROPERTY__DIRECTION:
				setDirection((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TslPackage.PROPERTY__EXPRESSION_VALUE:
				getExpressionValue().clear();
				return;
			case TslPackage.PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TslPackage.PROPERTY__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case TslPackage.PROPERTY__SUBTYPES:
				setSubtypes(SUBTYPES_EDEFAULT);
				return;
			case TslPackage.PROPERTY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case TslPackage.PROPERTY__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case TslPackage.PROPERTY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TslPackage.PROPERTY__EXPRESSION_VALUE:
				return expressionValue != null && !expressionValue.isEmpty();
			case TslPackage.PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TslPackage.PROPERTY__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case TslPackage.PROPERTY__SUBTYPES:
				return SUBTYPES_EDEFAULT == null ? subtypes != null : !SUBTYPES_EDEFAULT.equals(subtypes);
			case TslPackage.PROPERTY__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case TslPackage.PROPERTY__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case TslPackage.PROPERTY__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", length: ");
		result.append(length);
		result.append(", subtypes: ");
		result.append(subtypes);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", valueString: ");
		result.append(valueString);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
