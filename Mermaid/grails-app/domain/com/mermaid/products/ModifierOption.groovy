package com.mermaid.products

/**
 *  The option in the modifier
 */
class ModifierOption {

    String name

    double price

    static belongsTo = [modifier:Modifier]

    static constraints = {
    }
}
