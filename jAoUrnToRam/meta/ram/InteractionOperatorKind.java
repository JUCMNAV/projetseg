/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Operator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ram.RamPackage#getInteractionOperatorKind()
 * @model
 * @generated
 */
public enum InteractionOperatorKind implements Enumerator {
	/**
	 * The '<em><b>Alt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(0, "alt", "alt"),

	/**
	 * The '<em><b>Opt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(1, "opt", "opt"),

	/**
	 * The '<em><b>Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP(2, "loop", "loop"),

	/**
	 * The '<em><b>Disruptable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISRUPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DISRUPTABLE(3, "disruptable", "disruptable"),

	/**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(4, "critical", "critical");

	/**
	 * The '<em><b>Alt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model name="alt"
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 0;

	/**
	 * The '<em><b>Opt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @model name="opt"
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 1;

	/**
	 * The '<em><b>Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @model name="loop"
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_VALUE = 2;

	/**
	 * The '<em><b>Disruptable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disruptable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISRUPTABLE
	 * @model name="disruptable"
	 * @generated
	 * @ordered
	 */
	public static final int DISRUPTABLE_VALUE = 3;

	/**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Interaction Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionOperatorKind[] VALUES_ARRAY =
		new InteractionOperatorKind[] {
			ALT,
			OPT,
			LOOP,
			DISRUPTABLE,
			CRITICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionOperatorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperatorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperatorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperatorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionOperatorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Operator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionOperatorKind get(int value) {
		switch (value) {
			case ALT_VALUE: return ALT;
			case OPT_VALUE: return OPT;
			case LOOP_VALUE: return LOOP;
			case DISRUPTABLE_VALUE: return DISRUPTABLE;
			case CRITICAL_VALUE: return CRITICAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InteractionOperatorKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InteractionOperatorKind
