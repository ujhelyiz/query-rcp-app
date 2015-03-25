/**
 */
package Picklist.model.picklist.impl;

import Picklist.model.picklist.Picklist;
import Picklist.model.picklist.PicklistFactory;
import Picklist.model.picklist.PicklistPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PicklistPackageImpl extends EPackageImpl implements PicklistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picklistEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Picklist.model.picklist.PicklistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PicklistPackageImpl() {
		super(eNS_URI, PicklistFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PicklistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PicklistPackage init() {
		if (isInited) return (PicklistPackage)EPackage.Registry.INSTANCE.getEPackage(PicklistPackage.eNS_URI);

		// Obtain or create and register package
		PicklistPackageImpl thePicklistPackage = (PicklistPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PicklistPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PicklistPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePicklistPackage.createPackageContents();

		// Initialize created meta-data
		thePicklistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePicklistPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PicklistPackage.eNS_URI, thePicklistPackage);
		return thePicklistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicklist() {
		return picklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicklist_Name() {
		return (EAttribute)picklistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicklist_Description() {
		return (EAttribute)picklistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicklist_Entry1() {
		return (EAttribute)picklistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicklist_Entry2() {
		return (EAttribute)picklistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicklist_Entry3() {
		return (EAttribute)picklistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicklistFactory getPicklistFactory() {
		return (PicklistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		picklistEClass = createEClass(PICKLIST);
		createEAttribute(picklistEClass, PICKLIST__NAME);
		createEAttribute(picklistEClass, PICKLIST__DESCRIPTION);
		createEAttribute(picklistEClass, PICKLIST__ENTRY1);
		createEAttribute(picklistEClass, PICKLIST__ENTRY2);
		createEAttribute(picklistEClass, PICKLIST__ENTRY3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(picklistEClass, Picklist.class, "Picklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPicklist_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Picklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicklist_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Picklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicklist_Entry1(), ecorePackage.getEString(), "Entry1", null, 0, 1, Picklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicklist_Entry2(), ecorePackage.getEString(), "Entry2", null, 0, 1, Picklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPicklist_Entry3(), ecorePackage.getEString(), "Entry3", null, 0, 1, Picklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PicklistPackageImpl
