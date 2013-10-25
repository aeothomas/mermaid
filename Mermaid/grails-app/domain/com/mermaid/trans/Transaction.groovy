package com.mermaid.trans

import com.mermaid.emp.Employee
import com.mermaid.global.PaymentType
import com.mermaid.store.Store

/**
 *
 */
class Transaction {

    Date date

    String storeCode

    String registerCode

    Employee cashier

    Store store

    double amount

    PaymentType paymentType

    static constraints = {
    }
}
