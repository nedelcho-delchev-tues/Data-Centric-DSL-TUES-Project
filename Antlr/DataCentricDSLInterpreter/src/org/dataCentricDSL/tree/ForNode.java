package org.dataCentricDSL.tree;

import org.dataCentricDSL.Scope;
import org.dataCentricDSL.Value;

public class ForNode implements Node{
	
	Node initExpression;
	Node condition;
	Node aftExpression;
	
	Node block;
	Scope currentScope;
	
	public ForNode(Node exp, Node con, Node aftExpress, Node bl, Scope curr) {
		initExpression = exp;
		condition = con;
		aftExpression = aftExpress;

		currentScope = curr;
		block = bl;
	}
	
	@Override
	public Value evaluate() {
		initExpression.evaluate();
		Value value = condition.evaluate();
		
		if(!value.isBoolean()) {
			throw new RuntimeException("illegal boolean expression " + 
					"inside for-statement: " + value);
		}

		for (initExpression.evaluate(); condition.evaluate().asBoolean(); aftExpression.evaluate()) {
			block.evaluate();
		}
		
		return Value.VOID;
	}
}
