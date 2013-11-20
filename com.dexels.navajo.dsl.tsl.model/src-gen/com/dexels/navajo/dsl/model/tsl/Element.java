/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl;

import com.dexels.navajo.dsl.model.expression.TopLevel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getChildren <em>Children</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getParent <em>Parent</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getContent <em>Content</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#isSplitTag <em>Split Tag</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#isClosedTag <em>Closed Tag</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getValue <em>Value</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getComment <em>Comment</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.Element#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link com.dexels.navajo.dsl.model.tsl.Element}.
	 * It is bidirectional and its opposite is '{@link com.dexels.navajo.dsl.model.tsl.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Children()
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Element> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.dexels.navajo.dsl.model.tsl.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Parent()
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Element value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.dexels.navajo.dsl.model.tsl.PossibleExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PossibleExpression> getAttributes();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute list.
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Content()
	 * @model
	 * @generated
	 */
	EList<String> getContent();

	/**
	 * Returns the value of the '<em><b>Split Tag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Tag</em>' attribute.
	 * @see #setSplitTag(boolean)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_SplitTag()
	 * @model default="false"
	 * @generated
	 */
	boolean isSplitTag();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#isSplitTag <em>Split Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Tag</em>' attribute.
	 * @see #isSplitTag()
	 * @generated
	 */
	void setSplitTag(boolean value);

	/**
	 * Returns the value of the '<em><b>Closed Tag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Tag</em>' attribute.
	 * @see #setClosedTag(boolean)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_ClosedTag()
	 * @model default="false"
	 * @generated
	 */
	boolean isClosedTag();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#isClosedTag <em>Closed Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Tag</em>' attribute.
	 * @see #isClosedTag()
	 * @generated
	 */
	void setClosedTag(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TopLevel)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	TopLevel getCondition();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TopLevel value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TopLevel)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Value()
	 * @model containment="true"
	 * @generated
	 */
	TopLevel getValue();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TopLevel value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(TopLevel)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Filter()
	 * @model containment="true"
	 * @generated
	 */
	TopLevel getFilter();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(TopLevel value);

	/**
	 * Returns the value of the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attribute</em>' attribute.
	 * @see #setNameAttribute(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_NameAttribute()
	 * @model
	 * @generated
	 */
	String getNameAttribute();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getNameAttribute <em>Name Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Attribute</em>' attribute.
	 * @see #getNameAttribute()
	 * @generated
	 */
	void setNameAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Value</em>' attribute.
	 * @see #setRawValue(String)
	 * @see com.dexels.navajo.dsl.model.tsl.TslPackage#getElement_RawValue()
	 * @model
	 * @generated
	 */
	String getRawValue();

	/**
	 * Sets the value of the '{@link com.dexels.navajo.dsl.model.tsl.Element#getRawValue <em>Raw Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Value</em>' attribute.
	 * @see #getRawValue()
	 * @generated
	 */
	void setRawValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calculateDepth();

} // Element
