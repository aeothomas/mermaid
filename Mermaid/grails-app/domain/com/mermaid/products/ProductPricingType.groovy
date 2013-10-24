package com.mermaid.products

class ProductPricingType {

	/**
	 * Name of product pricing type
	 */
	String name
	
    static constraints = {
		name unique:true, nullable:false, blank:false
    }
}
