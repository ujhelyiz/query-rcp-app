/**
 */
package picklist.model.picklist;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see picklist.model.picklist.PicklistPackage
 * @generated
 */
public interface PicklistFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicklistFactory eINSTANCE = picklist.model.picklist.impl.PicklistFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Picklist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picklist</em>'.
	 * @generated
	 */
	Picklist createPicklist();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PicklistPackage getPicklistPackage();

} //PicklistFactory
