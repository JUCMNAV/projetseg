/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jucm_OneFileWorkaround.grl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contribution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jucm_OneFileWorkaround.grl.GrlPackage#getContributionType()
 * @model
 * @generated
 */
public enum ContributionType implements Enumerator {
	/**
	 * The '<em><b>Make</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE(0, "Make", "Make"),

	/**
	 * The '<em><b>Help</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
	HELP(1, "Help", "Help"),

	/**
	 * The '<em><b>Some Positive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOME_POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SOME_POSITIVE(2, "SomePositive", "SomePositive"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(3, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Some Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOME_NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SOME_NEGATIVE(4, "SomeNegative", "SomeNegative"),

	/**
	 * The '<em><b>Hurt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HURT_VALUE
	 * @generated
	 * @ordered
	 */
	HURT(5, "Hurt", "Hurt"),

	/**
	 * The '<em><b>Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BREAK(6, "Break", "Break");

	/**
	 * The '<em><b>Make</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Make</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAKE
	 * @model name="Make"
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_VALUE = 0;

	/**
	 * The '<em><b>Help</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Help</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @model name="Help"
	 * @generated
	 * @ordered
	 */
	public static final int HELP_VALUE = 1;

	/**
	 * The '<em><b>Some Positive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Some Positive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOME_POSITIVE
	 * @model name="SomePositive"
	 * @generated
	 * @ordered
	 */
	public static final int SOME_POSITIVE_VALUE = 2;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 3;

	/**
	 * The '<em><b>Some Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Some Negative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOME_NEGATIVE
	 * @model name="SomeNegative"
	 * @generated
	 * @ordered
	 */
	public static final int SOME_NEGATIVE_VALUE = 4;

	/**
	 * The '<em><b>Hurt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hurt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HURT
	 * @model name="Hurt"
	 * @generated
	 * @ordered
	 */
	public static final int HURT_VALUE = 5;

	/**
	 * The '<em><b>Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Break</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @model name="Break"
	 * @generated
	 * @ordered
	 */
	public static final int BREAK_VALUE = 6;

	/**
	 * An array of all the '<em><b>Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContributionType[] VALUES_ARRAY =
		new ContributionType[] {
			MAKE,
			HELP,
			SOME_POSITIVE,
			UNKNOWN,
			SOME_NEGATIVE,
			HURT,
			BREAK,
		};

	/**
	 * A public read-only list of all the '<em><b>Contribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContributionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contribution Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContributionType get(int value) {
		switch (value) {
			case MAKE_VALUE: return MAKE;
			case HELP_VALUE: return HELP;
			case SOME_POSITIVE_VALUE: return SOME_POSITIVE;
			case UNKNOWN_VALUE: return UNKNOWN;
			case SOME_NEGATIVE_VALUE: return SOME_NEGATIVE;
			case HURT_VALUE: return HURT;
			case BREAK_VALUE: return BREAK;
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
	private ContributionType(int value, String name, String literal) {
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
	
} //ContributionType
