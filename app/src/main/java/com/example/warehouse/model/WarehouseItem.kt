package com.example.warehouse.model

import com.example.warehouse.model.types.MaterialItemTypes
import java.io.Serializable

data class WarehouseItem(
    val id: Long,
    val materialItems: Map<MaterialItemTypes, MaterialCountItem>
) : Serializable