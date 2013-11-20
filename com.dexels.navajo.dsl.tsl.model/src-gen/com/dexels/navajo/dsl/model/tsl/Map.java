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
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Map#getMapName <em>Map Name</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Map#getMapClosingName <em>Map Closing Name</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Map#getObject <em>Object</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Map#getRef <em>Ref</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Map#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Element {
	/**
	 * Returns the value of the '<em><b>Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Name</em>' attribute.
	 * @see #setMapName(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap_MapName()
	 * @model
	 * @generated
	 */
	String getMapName();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Map#getMapName <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Name</em>' attribute.
	 * @see #getMapName()
	 * @generated
	 */
	void setMapName(String value);

	/**
	 * Returns the value of the '<em><b>Map Closing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Closing Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Closing Name</em>' attribute.
	 * @see #setMapClosingName(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap_MapClosingName()
	 * @model
	 * @generated
	 */
	String getMapClosingName();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Map#getMapClosingName <em>Map Closing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Closing Name</em>' attribute.
	 * @see #getMapClosingName()
	 * @generated
	 */
	void setMapClosingName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap_Object()
	 * @model
	 * @generated
	 */
	EList<String> getObject();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap_Ref()
	 * @model
	 * @generated
	 */
	EList<String> getRef();

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
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getMap_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopLevel> getExpressions();

} // Map
