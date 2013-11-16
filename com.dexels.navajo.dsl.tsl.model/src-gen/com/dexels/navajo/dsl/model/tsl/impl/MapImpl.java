/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.dexels.navajo.dsl.model.tsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import com.dexels.navajo.dsl.model.tsl.Map;
import com.dexels.navajo.dsl.model.tsl.PossibleExpression;
import com.dexels.navajo.dsl.model.tsl.TslPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl#getMapName <em>Map Name</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl#getMapClosingName <em>Map Closing Name</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.dexels.navajo.dsl.model.tsl.impl.MapImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends ElementImpl implements Map {
	/**
	 * The default value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapName()
	 * @generated
	 * @ordered
	 */
	protected String mapName = MAP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapClosingName() <em>Map Closing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapClosingName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_CLOSING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapClosingName() <em>Map Closing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapClosingName()
	 * @generated
	 * @ordered
	 */
	protected String mapClosingName = MAP_CLOSING_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<String> object;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TslPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapName() {
		return mapName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapName(String newMapName) {
		String oldMapName = mapName;
		mapName = newMapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.MAP__MAP_NAME, oldMapName, mapName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapClosingName() {
		return mapClosingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapClosingName(String newMapClosingName) {
		String oldMapClosingName = mapClosingName;
		mapClosingName = newMapClosingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TslPackage.MAP__MAP_CLOSING_NAME, oldMapClosingName, mapClosingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObject() {
		if (object == null) {
			object = new EDataTypeUniqueEList<String>(String.class, this, TslPackage.MAP__OBJECT);
		}
		return object;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRef() {
		if (ref == null) {
			ref = new EDataTypeUniqueEList<String>(String.class, this, TslPackage.MAP__REF);
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TslPackage.MAP__MAP_NAME:
				return getMapName();
			case TslPackage.MAP__MAP_CLOSING_NAME:
				return getMapClosingName();
			case TslPackage.MAP__OBJECT:
				return getObject();
			case TslPackage.MAP__REF:
				return getRef();
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
			case TslPackage.MAP__MAP_NAME:
				setMapName((String)newValue);
				return;
			case TslPackage.MAP__MAP_CLOSING_NAME:
				setMapClosingName((String)newValue);
				return;
			case TslPackage.MAP__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends String>)newValue);
				return;
			case TslPackage.MAP__REF:
				getRef().clear();
				getRef().addAll((Collection<? extends String>)newValue);
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
			case TslPackage.MAP__MAP_NAME:
				setMapName(MAP_NAME_EDEFAULT);
				return;
			case TslPackage.MAP__MAP_CLOSING_NAME:
				setMapClosingName(MAP_CLOSING_NAME_EDEFAULT);
				return;
			case TslPackage.MAP__OBJECT:
				getObject().clear();
				return;
			case TslPackage.MAP__REF:
				getRef().clear();
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
			case TslPackage.MAP__MAP_NAME:
				return MAP_NAME_EDEFAULT == null ? mapName != null : !MAP_NAME_EDEFAULT.equals(mapName);
			case TslPackage.MAP__MAP_CLOSING_NAME:
				return MAP_CLOSING_NAME_EDEFAULT == null ? mapClosingName != null : !MAP_CLOSING_NAME_EDEFAULT.equals(mapClosingName);
			case TslPackage.MAP__OBJECT:
				return object != null && !object.isEmpty();
			case TslPackage.MAP__REF:
				return ref != null && !ref.isEmpty();
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
		result.append(" (mapName: ");
		result.append(mapName);
		result.append(", mapClosingName: ");
		result.append(mapClosingName);
		result.append(", object: ");
		result.append(object);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //MapImpl
