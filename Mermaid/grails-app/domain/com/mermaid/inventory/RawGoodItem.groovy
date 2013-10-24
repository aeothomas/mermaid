package com.mermaid.inventory


import com.mermaid.global.Unit
import com.mermaid.products.Product;
import com.mermaid.suppliers.Supplier

/**
 * 
 * <code>RawGoodItem</code> is the materials or ingredient to make up a inventory item. <br/>
 * It generally is used to generate the cost burn down report
 * 
 * @author wshao
 *
 */
class RawGoodItem {

	/**
	 * The name of the raw good
	 */
	String name
	
	/**
	 * The cost of the raw good
	 */
	double cost
	
	/**
	 * Quantity of the raw good on hand
	 */
	long quantity
	
	/**
	 * Measurement unit of the raw good
	 */
	Unit unit
	
	/**
	 * The suppliers
	 */
	static hasMany = [rawGoodSupplier: Supplier, product:Product]
	
	static belongsTo = Product

	
    static constraints = {
    }
}
