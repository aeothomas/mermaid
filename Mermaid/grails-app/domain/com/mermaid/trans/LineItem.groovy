package com.mermaid.trans

import com.mermaid.inventory.InventoryItem

/**
 * The line item
 */
class LineItem {


    /**
     * Inventory Item
     */
    InventoryItem inventoryItem

    /**
     * The number of quality orded
     */
    long quantity

    /**
     * Total number of sales
     */
    double total


    static belongsTo = [transaction: Transaction]

    static constraints = {
        inventoryItem blank : false
    }
}
