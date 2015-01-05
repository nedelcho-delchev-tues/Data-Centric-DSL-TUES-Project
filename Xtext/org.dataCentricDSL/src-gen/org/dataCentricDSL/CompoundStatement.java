/**
 */
package org.dataCentricDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.CompoundStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getCompoundStatement()
 * @model
 * @generated
 */
public interface CompoundStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.dataCentricDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.dataCentricDSL.DataCentricDSLPackage#getCompoundStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // CompoundStatement
