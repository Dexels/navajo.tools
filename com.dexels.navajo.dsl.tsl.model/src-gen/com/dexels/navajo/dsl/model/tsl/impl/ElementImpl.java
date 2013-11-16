/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl.impl;

import com.dexels.navajo.dsl.model.expression.TopLevel;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.dexels.navajo.dsl.model.tsl.Element;
import com.dexels.navajo.dsl.model.tsl.PossibleExpression;
import com.dexels.navajo.dsl.model.tsl.TslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getContent <em>Content</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#isSplitTag <em>Split Tag</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#isClosedTag <em>Closed Tag</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.ElementImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> children;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleExpression> attributes;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSplitTag() <em>Split Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitTag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_TAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSplitTag() <em>Split Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitTag()
	 * @generated
	 * @ordered
	 */
	protected boolean splitTag = SPLIT_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isClosedTag() <em>Closed Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosedTag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSED_TAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosedTag() <em>Closed Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosedTag()
	 * @generated
	 * @ordered
	 */
	protected boolean closedTag = CLOSED_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected TopLevel condition;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TopLevel value;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected TopLevel filter;

	/**
	 * The default value of the '{@link #getNameAttribute() <em>Name Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameAttribute() <em>Name Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAttribute()
	 * @generated
	 * @ordered
	 */
	protected String nameAttribute = NAME_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TslPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Element>(Element.class, this, TslPackage.ELEMENT__CHILDREN, TslPackage.ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		if (eContainerFeatureID() != TslPackage.ELEMENT__PARENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, TslPackage.ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TslPackage.ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TslPackage.ELEMENT__CHILDREN, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleExpression> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<PossibleExpression>(PossibleExpression.class, this, TslPackage.ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSplitTag() {
		return splitTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitTag(boolean newSplitTag) {
		boolean oldSplitTag = splitTag;
		splitTag = newSplitTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__SPLIT_TAG, oldSplitTag, splitTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosedTag() {
		return closedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedTag(boolean newClosedTag) {
		boolean oldClosedTag = closedTag;
		closedTag = newClosedTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__CLOSED_TAG, oldClosedTag, closedTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevel getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(TopLevel newCondition, NotificationChain msgs) {
		TopLevel oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(TopLevel newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevel getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(TopLevel newValue, NotificationChain msgs) {
		TopLevel oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(TopLevel newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevel getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(TopLevel newFilter, NotificationChain msgs) {
		TopLevel oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(TopLevel newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TslPackage.ELEMENT__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameAttribute() {
		return nameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAttribute(String newNameAttribute) {
		String oldNameAttribute = nameAttribute;
		nameAttribute = newNameAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__NAME_ATTRIBUTE, oldNameAttribute, nameAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.ELEMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int calculateDepth() {
		EObject parent = eContainer();
		if(parent instanceof Element) {
			return ((Element)parent).calculateDepth()+1;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TslPackage.ELEMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case TslPackage.ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Element)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TslPackage.ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case TslPackage.ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case TslPackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TslPackage.ELEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case TslPackage.ELEMENT__VALUE:
				return basicSetValue(null, msgs);
			case TslPackage.ELEMENT__FILTER:
				return basicSetFilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TslPackage.ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, TslPackage.ELEMENT__CHILDREN, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TslPackage.ELEMENT__CHILDREN:
				return getChildren();
			case TslPackage.ELEMENT__PARENT:
				return getParent();
			case TslPackage.ELEMENT__ATTRIBUTES:
				return getAttributes();
			case TslPackage.ELEMENT__CONTENT:
				return getContent();
			case TslPackage.ELEMENT__SPLIT_TAG:
				return isSplitTag();
			case TslPackage.ELEMENT__CLOSED_TAG:
				return isClosedTag();
			case TslPackage.ELEMENT__CONDITION:
				return getCondition();
			case TslPackage.ELEMENT__VALUE:
				return getValue();
			case TslPackage.ELEMENT__FILTER:
				return getFilter();
			case TslPackage.ELEMENT__NAME_ATTRIBUTE:
				return getNameAttribute();
			case TslPackage.ELEMENT__COMMENT:
				return getComment();
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
			case TslPackage.ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Element>)newValue);
				return;
			case TslPackage.ELEMENT__PARENT:
				setParent((Element)newValue);
				return;
			case TslPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends PossibleExpression>)newValue);
				return;
			case TslPackage.ELEMENT__CONTENT:
				setContent((String)newValue);
				return;
			case TslPackage.ELEMENT__SPLIT_TAG:
				setSplitTag((Boolean)newValue);
				return;
			case TslPackage.ELEMENT__CLOSED_TAG:
				setClosedTag((Boolean)newValue);
				return;
			case TslPackage.ELEMENT__CONDITION:
				setCondition((TopLevel)newValue);
				return;
			case TslPackage.ELEMENT__VALUE:
				setValue((TopLevel)newValue);
				return;
			case TslPackage.ELEMENT__FILTER:
				setFilter((TopLevel)newValue);
				return;
			case TslPackage.ELEMENT__NAME_ATTRIBUTE:
				setNameAttribute((String)newValue);
				return;
			case TslPackage.ELEMENT__COMMENT:
				setComment((String)newValue);
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
			case TslPackage.ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case TslPackage.ELEMENT__PARENT:
				setParent((Element)null);
				return;
			case TslPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TslPackage.ELEMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case TslPackage.ELEMENT__SPLIT_TAG:
				setSplitTag(SPLIT_TAG_EDEFAULT);
				return;
			case TslPackage.ELEMENT__CLOSED_TAG:
				setClosedTag(CLOSED_TAG_EDEFAULT);
				return;
			case TslPackage.ELEMENT__CONDITION:
				setCondition((TopLevel)null);
				return;
			case TslPackage.ELEMENT__VALUE:
				setValue((TopLevel)null);
				return;
			case TslPackage.ELEMENT__FILTER:
				setFilter((TopLevel)null);
				return;
			case TslPackage.ELEMENT__NAME_ATTRIBUTE:
				setNameAttribute(NAME_ATTRIBUTE_EDEFAULT);
				return;
			case TslPackage.ELEMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case TslPackage.ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case TslPackage.ELEMENT__PARENT:
				return getParent() != null;
			case TslPackage.ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TslPackage.ELEMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case TslPackage.ELEMENT__SPLIT_TAG:
				return splitTag != SPLIT_TAG_EDEFAULT;
			case TslPackage.ELEMENT__CLOSED_TAG:
				return closedTag != CLOSED_TAG_EDEFAULT;
			case TslPackage.ELEMENT__CONDITION:
				return condition != null;
			case TslPackage.ELEMENT__VALUE:
				return value != null;
			case TslPackage.ELEMENT__FILTER:
				return filter != null;
			case TslPackage.ELEMENT__NAME_ATTRIBUTE:
				return NAME_ATTRIBUTE_EDEFAULT == null ? nameAttribute != null : !NAME_ATTRIBUTE_EDEFAULT.equals(nameAttribute);
			case TslPackage.ELEMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", splitTag: ");
		result.append(splitTag);
		result.append(", closedTag: ");
		result.append(closedTag);
		result.append(", nameAttribute: ");
		result.append(nameAttribute);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
