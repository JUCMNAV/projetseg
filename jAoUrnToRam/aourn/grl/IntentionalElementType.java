/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Intentional Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see grl.GrlPackage#getIntentionalElementType()
 * @model
 * @generated
 */
public enum IntentionalElementType implements Enumerator {
	/**
	 * The '<em><b>Softgoal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTGOAL(0, "Softgoal", "Softgoal"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(1, "Goal", "Goal"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(2, "Task", "Task"),

	/**
	 * The '<em><b>Ressource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESSOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESSOURCE(3, "Ressource", "Ressource"),

	/**
	 * The '<em><b>Indicator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATOR(4, "Indicator", "Indicator");

	/**
	 * The '<em><b>Softgoal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Softgoal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL
	 * @model name="Softgoal"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTGOAL_VALUE = 0;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 1;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 2;

	/**
	 * The '<em><b>Ressource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ressource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESSOURCE
	 * @model name="Ressource"
	 * @generated
	 * @ordered
	 */
	public static final int RESSOURCE_VALUE = 3;

	/**
	 * The '<em><b>Indicator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indicator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICATOR
	 * @model name="Indicator"
	 * @generated
	 * @ordered
	 */
	public static final int INDICATOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Intentional Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntentionalElementType[] VALUES_ARRAY =
		new IntentionalElementType[] {
			SOFTGOAL,
			GOAL,
			TASK,
			RESSOURCE,
			INDICATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Intentional Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntentionalElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Intentional Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentionalElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntentionalElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intentional Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentionalElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntentionalElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intentional Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntentionalElementType get(int value) {
		switch (value) {
			case SOFTGOAL_VALUE: return SOFTGOAL;
			case GOAL_VALUE: return GOAL;
			case TASK_VALUE: return TASK;
			case RESSOURCE_VALUE: return RESSOURCE;
			case INDICATOR_VALUE: return INDICATOR;
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
	private IntentionalElementType(int value, String name, String literal) {
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
	
} //IntentionalElementType
