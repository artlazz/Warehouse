package com.example.warehouse.model

import java.io.Serializable

private const val MAX_MATERIAL_ITEMS_COUNT = 5000

data class MaterialCountItem(
    val materialItemsList: List<MaterialItem>
) : Serializable {
    val currentCount: Int
        get() = materialItemsList.size
    val maxCount: Int
        get() = MAX_MATERIAL_ITEMS_COUNT
}