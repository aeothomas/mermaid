package com.mermaid.inventory

import com.mermaid.products.Product
import com.mermaid.suppliers.Supplier

class InventoryItem{
	
	/**
	 * Product
	 */
	Product product
	
	/**
	 * Each InventoryItem has a unique sku id
	 */
	String sku
	
	/**
	 * The flag indicates if the items will be tracked inside the report
	 */
	boolean isTracked
	
	/**
	 * It's the global price for the inventory Item
	 */
	double price
	
	/**
	 * TODO Review required . Should it be StoreInventory or staying at the global level
	 */
	double cost
	
	static hasMany = [globalSupplier: Supplier]
	
	/**
	 * The IventoryItem is 1-to-many related with Product Entity. One Product can possible have multiple InventoryItem
	 */
	static belongsTo =  Product
	
    static constraints = {
		sku unique: true, nullable:false, blank:false
    }
}
