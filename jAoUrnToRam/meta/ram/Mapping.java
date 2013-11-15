/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ram.Mapping#getToElements <em>To Elements</em>}</li>
 *   <li>{@link ram.Mapping#getFromElement <em>From Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ram.RamPackage#getMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validSourceModelElement sameTypesMapped validMapping'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validSourceModelElement='self.fromElement.oclIsTypeOf(Class) or self.fromElement.oclIsTypeOf(Operation)' validSourceModelElement$message='\'The source model element may only be of type Class or Operation\'' sameTypesMapped='self.toElements->forAll(element : MappableElement | if element.oclIsKindOf(Classifier) then self.fromElement.oclIsKindOf(Classifier) else element.oclIsTypeOf(self.fromElement.oclType()) endif)' sameTypesMapped$message='\'Mapping must be between same types of elements\'' validMapping='let clazz : Class = if fromElement.oclIsTypeOf(Operation) then fromElement.oclAsType(Operation).Classifier else fromElement endif in self.Instantiation.externalAspect.structuralView.classes->includes(clazz) and self.toElements->forAll(element : MappableElement | let clazz : Class = if element.oclIsTypeOf(Operation) then element.oclAsType(Operation).Classifier else element endif in if clazz.oclIsKindOf(PrimitiveType) then self.Instantiation.Aspect.structuralView.types->includes(clazz) else self.Instantiation.Aspect.structuralView.classes->includes(clazz) endif)' validMapping$message='\'Source must be from depending aspect and targets must be from current aspect\''"
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>To Elements</b></em>' reference list.
	 * The list contents are of type {@link ram.MappableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Elements</em>' reference list.
	 * @see ram.RamPackage#getMapping_ToElements()
	 * @model required="true"
	 * @generated
	 */
	EList<MappableElement> getToElements();

	/**
	 * Returns the value of the '<em><b>From Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Element</em>' reference.
	 * @see #setFromElement(MappableElement)
	 * @see ram.RamPackage#getMapping_FromElement()
	 * @model required="true"
	 * @generated
	 */
	MappableElement getFromElement();

	/**
	 * Sets the value of the '{@link ram.Mapping#getFromElement <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element</em>' reference.
	 * @see #getFromElement()
	 * @generated
	 */
	void setFromElement(MappableElement value);

} // Mapping
