/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getExpressionValue <em>Expression Value</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getType <em>Type</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getLength <em>Length</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getValueString <em>Value String</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Property#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Element {
	/**
	 * Returns the value of the '<em><b>Expression Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.dexels.navajo.dsl.model.tsl.ExpressionTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Value</em>' containment reference list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_ExpressionValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionTag> getExpressionValue();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigDecimal)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Length()
	 * @model
	 * @generated
	 */
	BigDecimal getLength();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' attribute.
	 * @see #setSubtypes(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Subtypes()
	 * @model
	 * @generated
	 */
	String getSubtypes();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getSubtypes <em>Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtypes</em>' attribute.
	 * @see #getSubtypes()
	 * @generated
	 */
	void setSubtypes(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_ValueString()
	 * @model
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Property#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Property
