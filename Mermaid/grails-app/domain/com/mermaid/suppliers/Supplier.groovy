package com.mermaid.suppliers

import com.mermaid.global.Address
import com.mermaid.inventory.InventoryItem
import com.mermaid.inventory.StoreInventory
import com.mermaid.inventory.RawGoodItem


class Supplier {
	
	/**
	 * Supplier Name
	 */
	String name;
	
	/**
	 * Supplier Code 
	 */
	String code;
	
	/**
	 * Business address of the supplier
	 */
	Address address;
	
	
	static hasMany = [rawGood : RawGoodItem, inventoryItem: InventoryItem, storeInventory: StoreInventory]
	
	static belongsTo = [RawGoodItem, InventoryItem, StoreInventory]
	
    static constraints = {
    }
}
