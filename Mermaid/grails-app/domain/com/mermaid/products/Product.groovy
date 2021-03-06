package com.mermaid.products

import com.mermaid.business.Department
import com.mermaid.inventory.InventoryItem
import com.mermaid.inventory.RawGoodItem


/**
 * The object represents a product in the inventory
 * @author wshao
 *
 */
class Product {

    /**
     * The product's name
     */
    static hasMany = [productUnitType: ProductUnitType, inventoryItem: InventoryItem, rawGoodItem: RawGoodItem, modifiers: Modifier, addon: Modifier, excludeOptions: Modifier]
    String name
    /**
     * The description of a product
     */
    String description

    /**
     * The pricing type of a product:
     * 1. The price is fixed for a product.And it can be decided on the back-office
     * 2. The product is sold by measurement unit, and the unit price is fixed on the back-office
     * 3. The sale price is provided on the register
     */
    ProductPricingType pricingType

    /**
     * The product category
     */
    ProductCategory category


    Department department

    /**
     * TODO Review required . Should it be StoreInventory or staying at the global level
     */
    double cost

    /**
     * Here, Product will have 0 or 1 product unit type. Enhance using a join table to save space
     * It will have a product unit type while the product pricing type is "sold by unit"
     * */
    static constraints = {
        name unique: true, nullable: false, blank: false
        category nullable: false, blank: false
        pricingType nullable: false, blank: false
    }
    static mapping = {

    }


}
