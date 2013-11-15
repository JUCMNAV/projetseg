/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.ucm.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aspect Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.ucm.map.MapPackage#getAspectKind()
 * @model
 * @generated
 */
public enum AspectKind implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(1, "Regular", "Regular"),

	/**
	 * The '<em><b>Entrance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRANCE(2, "Entrance", "Entrance"),

	/**
	 * The '<em><b>Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT(3, "Exit", "Exit"),

	/**
	 * The '<em><b>Conditional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITIONAL(4, "Conditional", "Conditional");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="Regular"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 1;

	/**
	 * The '<em><b>Entrance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entrance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRANCE
	 * @model name="Entrance"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRANCE_VALUE = 2;

	/**
	 * The '<em><b>Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @model name="Exit"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_VALUE = 3;

	/**
	 * The '<em><b>Conditional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conditional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL
	 * @model name="Conditional"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Aspect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AspectKind[] VALUES_ARRAY =
		new AspectKind[] {
			NONE,
			REGULAR,
			ENTRANCE,
			EXIT,
			CONDITIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Aspect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AspectKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aspect Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AspectKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aspect Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectKind get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case REGULAR_VALUE: return REGULAR;
			case ENTRANCE_VALUE: return ENTRANCE;
			case EXIT_VALUE: return EXIT;
			case CONDITIONAL_VALUE: return CONDITIONAL;
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
	private AspectKind(int value, String name, String literal) {
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
	
} //AspectKind
