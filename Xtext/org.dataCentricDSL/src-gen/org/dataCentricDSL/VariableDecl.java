/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.VariableDecl#isGloval <em>Gloval</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.dataCentricDSL.VariableDecl#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Gloval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gloval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gloval</em>' attribute.
   * @see #setGloval(boolean)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_Gloval()
   * @model
   * @generated
   */
  boolean isGloval();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#isGloval <em>Gloval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gloval</em>' attribute.
   * @see #isGloval()
   * @generated
   */
  void setGloval(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Value</em>' containment reference.
   * @see #setVariableValue(SimpleStatement)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getVariableDecl_VariableValue()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getVariableValue();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.VariableDecl#getVariableValue <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Value</em>' containment reference.
   * @see #getVariableValue()
   * @generated
   */
  void setVariableValue(SimpleStatement value);

} // VariableDecl
