/**
 */
package org.dataCentricDSL.impl;

import java.util.Collection;

import org.dataCentricDSL.Condition;
import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.StatementCondition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.StatementConditionImpl#getStatementCondition <em>Statement Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementConditionImpl extends MinimalEObjectImpl.Container implements StatementCondition
{
  /**
   * The cached value of the '{@link #getStatementCondition() <em>Statement Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> statementCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DataCentricDSLPackage.Literals.STATEMENT_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getStatementCondition()
  {
    if (statementCondition == null)
    {
      statementCondition = new EObjectContainmentEList<Condition>(Condition.class, this, DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION);
    }
    return statementCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION:
        return ((InternalEList<?>)getStatementCondition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION:
        return getStatementCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION:
        getStatementCondition().clear();
        getStatementCondition().addAll((Collection<? extends Condition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION:
        getStatementCondition().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.STATEMENT_CONDITION__STATEMENT_CONDITION:
        return statementCondition != null && !statementCondition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatementConditionImpl