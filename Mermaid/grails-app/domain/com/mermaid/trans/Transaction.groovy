package com.mermaid.trans

import com.mermaid.emp.Employee

import com.mermaid.store.Store

/**
 *
 */
class Transaction {

    /**
     *  The unique transaction number
     * TODO review String vs Long
     */
    String transNum

    /**
     * The order number
     * TODO review String vs Long
     */
    String orderNum

    /**
     * The of transaction
     */
    Date date

    /**
     * The unique code of store
     */
    String storeCode

    /**
     * The unique code of register code
     *  TODO review if we need to remove it
     */
    String registerCode

    /**
     * Cashier
     */
    Employee cashier

    /**
     * Store
     */
    Store store

    /**
     * Amount of the transaction in total
     */
    double amount

    /**
     *
     */
    Payment payment

    /**
     * Tax of taxes included in transaction
     */
    double tax

    /**
     * Indicate the type of transaction
     */
    OperationType operationType

    static hasMany = [lineItem: LineItem]

    static constraints = {

    }
}
