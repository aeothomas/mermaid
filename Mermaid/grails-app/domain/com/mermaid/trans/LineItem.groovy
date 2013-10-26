package com.mermaid.trans

/**
 * The line item
 */
class LineItem {

    /**
     * The name of the item
     */
    String name

    /**
     * The unique number of sku
     */
    String sku

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
    }
}
