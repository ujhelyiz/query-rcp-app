/**
 */
package picklist.model.picklist.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import picklist.model.picklist.Picklist;
import picklist.model.picklist.PicklistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link picklist.model.picklist.impl.PicklistImpl#getName <em>Name</em>}</li>
 *   <li>{@link picklist.model.picklist.impl.PicklistImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link picklist.model.picklist.impl.PicklistImpl#getEntry1 <em>Entry1</em>}</li>
 *   <li>{@link picklist.model.picklist.impl.PicklistImpl#getEntry2 <em>Entry2</em>}</li>
 *   <li>{@link picklist.model.picklist.impl.PicklistImpl#getEntry3 <em>Entry3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicklistImpl extends MinimalEObjectImpl.Container implements Picklist {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntry1() <em>Entry1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry1()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry1() <em>Entry1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry1()
	 * @generated
	 * @ordered
	 */
	protected String entry1 = ENTRY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntry2() <em>Entry2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry2()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry2() <em>Entry2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry2()
	 * @generated
	 * @ordered
	 */
	protected String entry2 = ENTRY2_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntry3() <em>Entry3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry3()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry3() <em>Entry3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry3()
	 * @generated
	 * @ordered
	 */
	protected String entry3 = ENTRY3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicklistPackage.Literals.PICKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntry1() {
		return entry1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry1(String newEntry1) {
		String oldEntry1 = entry1;
		entry1 = newEntry1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__ENTRY1, oldEntry1, entry1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntry2() {
		return entry2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry2(String newEntry2) {
		String oldEntry2 = entry2;
		entry2 = newEntry2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__ENTRY2, oldEntry2, entry2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntry3() {
		return entry3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry3(String newEntry3) {
		String oldEntry3 = entry3;
		entry3 = newEntry3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__ENTRY3, oldEntry3, entry3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicklistPackage.PICKLIST__NAME:
				return getName();
			case PicklistPackage.PICKLIST__DESCRIPTION:
				return getDescription();
			case PicklistPackage.PICKLIST__ENTRY1:
				return getEntry1();
			case PicklistPackage.PICKLIST__ENTRY2:
				return getEntry2();
			case PicklistPackage.PICKLIST__ENTRY3:
				return getEntry3();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PicklistPackage.PICKLIST__NAME:
				setName((String)newValue);
				return;
			case PicklistPackage.PICKLIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PicklistPackage.PICKLIST__ENTRY1:
				setEntry1((String)newValue);
				return;
			case PicklistPackage.PICKLIST__ENTRY2:
				setEntry2((String)newValue);
				return;
			case PicklistPackage.PICKLIST__ENTRY3:
				setEntry3((String)newValue);
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
			case PicklistPackage.PICKLIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__ENTRY1:
				setEntry1(ENTRY1_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__ENTRY2:
				setEntry2(ENTRY2_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__ENTRY3:
				setEntry3(ENTRY3_EDEFAULT);
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
			case PicklistPackage.PICKLIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PicklistPackage.PICKLIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PicklistPackage.PICKLIST__ENTRY1:
				return ENTRY1_EDEFAULT == null ? entry1 != null : !ENTRY1_EDEFAULT.equals(entry1);
			case PicklistPackage.PICKLIST__ENTRY2:
				return ENTRY2_EDEFAULT == null ? entry2 != null : !ENTRY2_EDEFAULT.equals(entry2);
			case PicklistPackage.PICKLIST__ENTRY3:
				return ENTRY3_EDEFAULT == null ? entry3 != null : !ENTRY3_EDEFAULT.equals(entry3);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", Entry1: ");
		result.append(entry1);
		result.append(", Entry2: ");
		result.append(entry2);
		result.append(", Entry3: ");
		result.append(entry3);
		result.append(')');
		return result.toString();
	}

} //PicklistImpl
