/**
 */
package picklist.model.picklist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see picklist.model.picklist.PicklistFactory
 * @model kind="package"
 * @generated
 */
public interface PicklistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "picklist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://picklist/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "picklist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicklistPackage eINSTANCE = picklist.model.picklist.impl.PicklistPackageImpl.init();

	/**
	 * The meta object id for the '{@link picklist.model.picklist.impl.PicklistImpl <em>Picklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see picklist.model.picklist.impl.PicklistImpl
	 * @see picklist.model.picklist.impl.PicklistPackageImpl#getPicklist()
	 * @generated
	 */
	int PICKLIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entry1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__ENTRY1 = 2;

	/**
	 * The feature id for the '<em><b>Entry2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__ENTRY2 = 3;

	/**
	 * The feature id for the '<em><b>Entry3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__ENTRY3 = 4;

	/**
	 * The number of structural features of the '<em>Picklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Picklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link picklist.model.picklist.Picklist <em>Picklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picklist</em>'.
	 * @see picklist.model.picklist.Picklist
	 * @generated
	 */
	EClass getPicklist();

	/**
	 * Returns the meta object for the attribute '{@link picklist.model.picklist.Picklist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see picklist.model.picklist.Picklist#getName()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Name();

	/**
	 * Returns the meta object for the attribute '{@link picklist.model.picklist.Picklist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see picklist.model.picklist.Picklist#getDescription()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Description();

	/**
	 * Returns the meta object for the attribute '{@link picklist.model.picklist.Picklist#getEntry1 <em>Entry1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry1</em>'.
	 * @see picklist.model.picklist.Picklist#getEntry1()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Entry1();

	/**
	 * Returns the meta object for the attribute '{@link picklist.model.picklist.Picklist#getEntry2 <em>Entry2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry2</em>'.
	 * @see picklist.model.picklist.Picklist#getEntry2()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Entry2();

	/**
	 * Returns the meta object for the attribute '{@link picklist.model.picklist.Picklist#getEntry3 <em>Entry3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry3</em>'.
	 * @see picklist.model.picklist.Picklist#getEntry3()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Entry3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PicklistFactory getPicklistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link picklist.model.picklist.impl.PicklistImpl <em>Picklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see picklist.model.picklist.impl.PicklistImpl
		 * @see picklist.model.picklist.impl.PicklistPackageImpl#getPicklist()
		 * @generated
		 */
		EClass PICKLIST = eINSTANCE.getPicklist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__NAME = eINSTANCE.getPicklist_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__DESCRIPTION = eINSTANCE.getPicklist_Description();

		/**
		 * The meta object literal for the '<em><b>Entry1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__ENTRY1 = eINSTANCE.getPicklist_Entry1();

		/**
		 * The meta object literal for the '<em><b>Entry2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__ENTRY2 = eINSTANCE.getPicklist_Entry2();

		/**
		 * The meta object literal for the '<em><b>Entry3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__ENTRY3 = eINSTANCE.getPicklist_Entry3();

	}

} //PicklistPackage
