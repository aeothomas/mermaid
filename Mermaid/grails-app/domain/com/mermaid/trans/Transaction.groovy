package com.mermaid.trans

import com.mermaid.emp.Employee

import com.mermaid.store.Store

/**
 *
 */
class Transaction {

    /**
     *  The unique order number
     *
     */
    String transNum

    /**
     * The order number
     */
    String orderNum

    /**
     * The of transaction
     */
    Date date

    /**
     *
     */
    String storeCode

    String registerCode

    Employee cashier

    Store store

    double amount

    Payment payment

    double tax

    OperationType operationType

    static constraints = {
    }
}
