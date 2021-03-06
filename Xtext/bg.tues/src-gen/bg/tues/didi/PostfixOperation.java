/**
 */
package bg.tues.didi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bg.tues.didi.PostfixOperation#getCall <em>Call</em>}</li>
 *   <li>{@link bg.tues.didi.PostfixOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see bg.tues.didi.DidiPackage#getPostfixOperation()
 * @model
 * @generated
 */
public interface PostfixOperation extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(VariableCall)
   * @see bg.tues.didi.DidiPackage#getPostfixOperation_Call()
   * @model containment="true"
   * @generated
   */
  VariableCall getCall();

  /**
   * Sets the value of the '{@link bg.tues.didi.PostfixOperation#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(VariableCall value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see bg.tues.didi.DidiPackage#getPostfixOperation_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link bg.tues.didi.PostfixOperation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // PostfixOperation
