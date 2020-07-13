package com.example.warehouse.model

import com.example.warehouse.model.types.MaterialItemTypes
import java.io.Serializable

data class MaterialItem(
    var id: Long,
    var type: MaterialItemTypes,
    var name: String,
    var description: String,
    var icon: String
) : Serializable