package com.mermaid.products

import com.mermaid.global.Unit;

class ProductUnitType {
	
	String name 
	
	/**
	 * TODO Review required to check if the de-normalization is needed here 
	 */
	Unit unit
	
	/**
	 * TODO adding constraints
	 */
    static constraints = {
    }
}
