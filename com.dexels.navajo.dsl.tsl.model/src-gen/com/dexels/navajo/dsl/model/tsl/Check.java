/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl;

import com.dexels.navajo.dsl.model.expression.TopLevel;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Check#getCode <em>Code</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Check#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Check#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Element {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getCheck_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Check#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(TopLevel)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getCheck_Expression()
	 * @model containment="true"
	 * @generated
	 */
	TopLevel getExpression();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Check#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(TopLevel value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.dexels.navajo.dsl.model.expression.TopLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getCheck_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopLevel> getExpressions();

} // Check
