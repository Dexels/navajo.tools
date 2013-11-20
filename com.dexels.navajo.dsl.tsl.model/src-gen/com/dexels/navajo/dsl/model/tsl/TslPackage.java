/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dexels.navajo.dsl.model.tsl.TslFactory
 * @model kind="package"
 * @generated
 */
public interface TslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dexels.com/navajo/dsl/tsl/NavajoTsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TslPackage eINSTANCE = com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.ElementImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SPLIT_TAG = 4;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLOSED_TAG = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FILTER = 8;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = 10;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RAW_VALUE = 11;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.TmlImpl <em>Tml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TmlImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getTml()
	 * @generated
	 */
	int TML = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML__METHODS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TML_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MethodsImpl <em>Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.MethodsImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMethods()
	 * @generated
	 */
	int METHODS = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__METHOD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.MethodImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SCRIPT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PATH = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.PossibleExpressionImpl <em>Possible Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.PossibleExpressionImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getPossibleExpression()
	 * @generated
	 */
	int POSSIBLE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION__EXPRESSION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION__NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>End Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION__END_TOKEN = 4;

	/**
	 * The number of structural features of the '<em>Possible Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.MessageImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MODE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.MapImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Closing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_CLOSING_NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OBJECT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__REF = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__EXPRESSIONS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXPRESSION_VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LENGTH = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBTYPES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CARDINALITY = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_STRING = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DIRECTION = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.ParamImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CHILDREN = PROPERTY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__PARENT = PROPERTY__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__ATTRIBUTES = PROPERTY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CONTENT = PROPERTY__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__SPLIT_TAG = PROPERTY__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CLOSED_TAG = PROPERTY__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CONDITION = PROPERTY__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__FILTER = PROPERTY__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME_ATTRIBUTE = PROPERTY__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__COMMENT = PROPERTY__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__RAW_VALUE = PROPERTY__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__EXPRESSION_VALUE = PROPERTY__EXPRESSION_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__TYPE = PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__LENGTH = PROPERTY__LENGTH;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__SUBTYPES = PROPERTY__SUBTYPES;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CARDINALITY = PROPERTY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE_STRING = PROPERTY__VALUE_STRING;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__DIRECTION = PROPERTY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__DESCRIPTION = PROPERTY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ExpressionTagImpl <em>Expression Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.ExpressionTagImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getExpressionTag()
	 * @generated
	 */
	int EXPRESSION_TAG = 9;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TAG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.DebugTagImpl <em>Debug Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.DebugTagImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getDebugTag()
	 * @generated
	 */
	int DEBUG_TAG = 10;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Debug Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_TAG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MapMethodImpl <em>Map Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.MapMethodImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMapMethod()
	 * @generated
	 */
	int MAP_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__MAP_NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Closing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__METHOD_CLOSING_NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__METHOD_NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Closing Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__METHOD_CLOSING_METHOD = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD__EXPRESSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Map Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_METHOD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.RequiredImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 12;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.OptionImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 13;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.CheckImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 14;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__EXPRESSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ValidationsImpl <em>Validations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.ValidationsImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getValidations()
	 * @generated
	 */
	int VALIDATIONS = 15;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The number of structural features of the '<em>Validations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATIONS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.CommentImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 16;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.BreakImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 17;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.dexels.navajo.dsl.model.tsl.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.dexels.navajo.dsl.model.tsl.impl.FieldImpl
	 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 18;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CHILDREN = ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARENT = ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTENT = ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Split Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SPLIT_TAG = ELEMENT__SPLIT_TAG;

	/**
	 * The feature id for the '<em><b>Closed Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CLOSED_TAG = ELEMENT__CLOSED_TAG;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONDITION = ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FILTER = ELEMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME_ATTRIBUTE = ELEMENT__NAME_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__RAW_VALUE = ELEMENT__RAW_VALUE;

	/**
	 * The feature id for the '<em><b>Expression Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXPRESSION_VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Tml <em>Tml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tml</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Tml
	 * @generated
	 */
	EClass getTml();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Tml#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Tml#getMethods()
	 * @see #getTml()
	 * @generated
	 */
	EReference getTml_Methods();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Methods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methods</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Methods
	 * @generated
	 */
	EClass getMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Methods#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Methods#getMethod()
	 * @see #getMethods()
	 * @generated
	 */
	EReference getMethods_Method();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Method#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Method#getScript()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Script();

	/**
	 * Returns the meta object for the attribute list '{@link com.dexels.navajo.dsl.model.tsl.Method#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Method#getPath()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Path();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression <em>Possible Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Expression</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression
	 * @generated
	 */
	EClass getPossibleExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression#getKey()
	 * @see #getPossibleExpression()
	 * @generated
	 */
	EAttribute getPossibleExpression_Key();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression#getExpressionValue()
	 * @see #getPossibleExpression()
	 * @generated
	 */
	EReference getPossibleExpression_ExpressionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression#getValue()
	 * @see #getPossibleExpression()
	 * @generated
	 */
	EAttribute getPossibleExpression_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression#getNamespace()
	 * @see #getPossibleExpression()
	 * @generated
	 */
	EAttribute getPossibleExpression_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.PossibleExpression#getEndToken <em>End Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Token</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.PossibleExpression#getEndToken()
	 * @see #getPossibleExpression()
	 * @generated
	 */
	EAttribute getPossibleExpression_EndToken();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getChildren()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Children();

	/**
	 * Returns the meta object for the container reference '{@link com.dexels.navajo.dsl.model.tsl.Element#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getParent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link com.dexels.navajo.dsl.model.tsl.Element#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Content</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getContent()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Content();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Element#isSplitTag <em>Split Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Tag</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#isSplitTag()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_SplitTag();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Element#isClosedTag <em>Closed Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Tag</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#isClosedTag()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClosedTag();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.Element#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getCondition()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Value();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.Element#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getFilter()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Filter();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Element#getNameAttribute <em>Name Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Attribute</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getNameAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_NameAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Element#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getComment()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Comment();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Element#getRawValue <em>Raw Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Element#getRawValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_RawValue();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Message#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Message#getCount()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Message#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Message#getMode()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Mode();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Map#getMapName <em>Map Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Name</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map#getMapName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapName();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Map#getMapClosingName <em>Map Closing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Closing Name</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map#getMapClosingName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapClosingName();

	/**
	 * Returns the meta object for the attribute list '{@link com.dexels.navajo.dsl.model.tsl.Map#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map#getObject()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Object();

	/**
	 * Returns the meta object for the attribute list '{@link com.dexels.navajo.dsl.model.tsl.Map#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ref</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map#getRef()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Map#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Map#getExpressions()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Expressions();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Property#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getExpressionValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_ExpressionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getLength()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Length();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtypes</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getSubtypes()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Subtypes();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getCardinality()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getValueString()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ValueString();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getDirection()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Direction();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.ExpressionTag <em>Expression Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Tag</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.ExpressionTag
	 * @generated
	 */
	EClass getExpressionTag();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.ExpressionTag#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.ExpressionTag#getExpression()
	 * @see #getExpressionTag()
	 * @generated
	 */
	EReference getExpressionTag_Expression();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.DebugTag <em>Debug Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debug Tag</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.DebugTag
	 * @generated
	 */
	EClass getDebugTag();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.DebugTag#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.DebugTag#getExpression()
	 * @see #getDebugTag()
	 * @generated
	 */
	EReference getDebugTag_Expression();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.MapMethod <em>Map Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Method</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod
	 * @generated
	 */
	EClass getMapMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.MapMethod#getMapName <em>Map Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Name</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod#getMapName()
	 * @see #getMapMethod()
	 * @generated
	 */
	EAttribute getMapMethod_MapName();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodClosingName <em>Method Closing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Closing Name</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodClosingName()
	 * @see #getMapMethod()
	 * @generated
	 */
	EAttribute getMapMethod_MethodClosingName();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodName()
	 * @see #getMapMethod()
	 * @generated
	 */
	EAttribute getMapMethod_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodClosingMethod <em>Method Closing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Closing Method</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod#getMethodClosingMethod()
	 * @see #getMapMethod()
	 * @generated
	 */
	EAttribute getMapMethod_MethodClosingMethod();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.MapMethod#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.MapMethod#getExpression()
	 * @see #getMapMethod()
	 * @generated
	 */
	EReference getMapMethod_Expression();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Check#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Check#getCode()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Code();

	/**
	 * Returns the meta object for the containment reference '{@link com.dexels.navajo.dsl.model.tsl.Check#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Check#getExpression()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Expression();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Validations <em>Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validations</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Validations
	 * @generated
	 */
	EClass getValidations();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for class '{@link com.dexels.navajo.dsl.model.tsl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference list '{@link com.dexels.navajo.dsl.model.tsl.Field#getExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Value</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Field#getExpressionValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ExpressionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.dexels.navajo.dsl.model.tsl.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.dexels.navajo.dsl.model.tsl.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TslFactory getTslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.TmlImpl <em>Tml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TmlImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getTml()
		 * @generated
		 */
		EClass TML = eINSTANCE.getTml();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TML__METHODS = eINSTANCE.getTml_Methods();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MethodsImpl <em>Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.MethodsImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMethods()
		 * @generated
		 */
		EClass METHODS = eINSTANCE.getMethods();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODS__METHOD = eINSTANCE.getMethods_Method();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.MethodImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SCRIPT = eINSTANCE.getMethod_Script();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__PATH = eINSTANCE.getMethod_Path();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.PossibleExpressionImpl <em>Possible Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.PossibleExpressionImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getPossibleExpression()
		 * @generated
		 */
		EClass POSSIBLE_EXPRESSION = eINSTANCE.getPossibleExpression();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_EXPRESSION__KEY = eINSTANCE.getPossibleExpression_Key();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLE_EXPRESSION__EXPRESSION_VALUE = eINSTANCE.getPossibleExpression_ExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_EXPRESSION__VALUE = eINSTANCE.getPossibleExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_EXPRESSION__NAMESPACE = eINSTANCE.getPossibleExpression_Namespace();

		/**
		 * The meta object literal for the '<em><b>End Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_EXPRESSION__END_TOKEN = eINSTANCE.getPossibleExpression_EndToken();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.ElementImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT = eINSTANCE.getElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CONTENT = eINSTANCE.getElement_Content();

		/**
		 * The meta object literal for the '<em><b>Split Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SPLIT_TAG = eINSTANCE.getElement_SplitTag();

		/**
		 * The meta object literal for the '<em><b>Closed Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLOSED_TAG = eINSTANCE.getElement_ClosedTag();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONDITION = eINSTANCE.getElement_Condition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__FILTER = eINSTANCE.getElement_Filter();

		/**
		 * The meta object literal for the '<em><b>Name Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME_ATTRIBUTE = eINSTANCE.getElement_NameAttribute();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMMENT = eINSTANCE.getElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Raw Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RAW_VALUE = eINSTANCE.getElement_RawValue();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.MessageImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__COUNT = eINSTANCE.getMessage_Count();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MODE = eINSTANCE.getMessage_Mode();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.MapImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Map Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_NAME = eINSTANCE.getMap_MapName();

		/**
		 * The meta object literal for the '<em><b>Map Closing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_CLOSING_NAME = eINSTANCE.getMap_MapClosingName();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__OBJECT = eINSTANCE.getMap_Object();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__REF = eINSTANCE.getMap_Ref();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__EXPRESSIONS = eINSTANCE.getMap_Expressions();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.PropertyImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__EXPRESSION_VALUE = eINSTANCE.getProperty_ExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LENGTH = eINSTANCE.getProperty_Length();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SUBTYPES = eINSTANCE.getProperty_Subtypes();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CARDINALITY = eINSTANCE.getProperty_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE_STRING = eINSTANCE.getProperty_ValueString();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DIRECTION = eINSTANCE.getProperty_Direction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.ParamImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ExpressionTagImpl <em>Expression Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.ExpressionTagImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getExpressionTag()
		 * @generated
		 */
		EClass EXPRESSION_TAG = eINSTANCE.getExpressionTag();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TAG__EXPRESSION = eINSTANCE.getExpressionTag_Expression();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.DebugTagImpl <em>Debug Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.DebugTagImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getDebugTag()
		 * @generated
		 */
		EClass DEBUG_TAG = eINSTANCE.getDebugTag();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_TAG__EXPRESSION = eINSTANCE.getDebugTag_Expression();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.MapMethodImpl <em>Map Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.MapMethodImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getMapMethod()
		 * @generated
		 */
		EClass MAP_METHOD = eINSTANCE.getMapMethod();

		/**
		 * The meta object literal for the '<em><b>Map Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_METHOD__MAP_NAME = eINSTANCE.getMapMethod_MapName();

		/**
		 * The meta object literal for the '<em><b>Method Closing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_METHOD__METHOD_CLOSING_NAME = eINSTANCE.getMapMethod_MethodClosingName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_METHOD__METHOD_NAME = eINSTANCE.getMapMethod_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Closing Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_METHOD__METHOD_CLOSING_METHOD = eINSTANCE.getMapMethod_MethodClosingMethod();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_METHOD__EXPRESSION = eINSTANCE.getMapMethod_Expression();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.RequiredImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.OptionImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.CheckImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CODE = eINSTANCE.getCheck_Code();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__EXPRESSION = eINSTANCE.getCheck_Expression();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.ValidationsImpl <em>Validations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.ValidationsImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getValidations()
		 * @generated
		 */
		EClass VALIDATIONS = eINSTANCE.getValidations();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.CommentImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.BreakImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '{@link com.dexels.navajo.dsl.model.tsl.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.dexels.navajo.dsl.model.tsl.impl.FieldImpl
		 * @see com.dexels.navajo.dsl.model.tsl.impl.TslPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Expression Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__EXPRESSION_VALUE = eINSTANCE.getField_ExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

	}

} //TslPackage
