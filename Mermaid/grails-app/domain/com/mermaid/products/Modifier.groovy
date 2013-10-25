package com.mermaid.products

/**
 * The addon can be added on the product one the sales
 * @author wshao
 *
 */
class Modifier {	
	/**
	 * Addon Name
	 */
	String name
	
	/**
	 * Addon Type
	 */
	ModifierType type

    static hasMany = [modifierOption: ModifierOption]
	
    static constraints = {
    }
}
