/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ucm.performance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arrival Process</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucm.performance.PerformancePackage#getArrivalProcess()
 * @model
 * @generated
 */
public enum ArrivalProcess implements Enumerator {
	/**
	 * The '<em><b>Poisson PDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSON_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	POISSON_PDF(0, "PoissonPDF", "PoissonPDF"),

	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC(1, "Periodic", "Periodic"),

	/**
	 * The '<em><b>Uniform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFORM(2, "Uniform", "Uniform"),

	/**
	 * The '<em><b>Phase Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE_TYPE(3, "PhaseType", "PhaseType");

	/**
	 * The '<em><b>Poisson PDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poisson PDF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISSON_PDF
	 * @model name="PoissonPDF"
	 * @generated
	 * @ordered
	 */
	public static final int POISSON_PDF_VALUE = 0;

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @model name="Periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_VALUE = 1;

	/**
	 * The '<em><b>Uniform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uniform</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFORM
	 * @model name="Uniform"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFORM_VALUE = 2;

	/**
	 * The '<em><b>Phase Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phase Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASE_TYPE
	 * @model name="PhaseType"
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TYPE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Arrival Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArrivalProcess[] VALUES_ARRAY =
		new ArrivalProcess[] {
			POISSON_PDF,
			PERIODIC,
			UNIFORM,
			PHASE_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Arrival Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArrivalProcess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arrival Process</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrivalProcess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrivalProcess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrival Process</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrivalProcess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArrivalProcess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arrival Process</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArrivalProcess get(int value) {
		switch (value) {
			case POISSON_PDF_VALUE: return POISSON_PDF;
			case PERIODIC_VALUE: return PERIODIC;
			case UNIFORM_VALUE: return UNIFORM;
			case PHASE_TYPE_VALUE: return PHASE_TYPE;
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
	private ArrivalProcess(int value, String name, String literal) {
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
	
} //ArrivalProcess
