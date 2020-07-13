package com.example.warehouse.data

import com.example.warehouse.model.MaterialCountItem
import com.example.warehouse.model.MaterialItem
import com.example.warehouse.model.WarehouseItem
import com.example.warehouse.model.types.MaterialItemTypes

object Database {
    val data = ArrayList<WarehouseItem>()

    init {
        val materialItems1 = HashMap<MaterialItemTypes, MaterialCountItem>()
        materialItems1[MaterialItemTypes.IRON] = getIronList()
        materialItems1[MaterialItemTypes.BOLT] = getBoltList()
        materialItems1[MaterialItemTypes.COPPER] = getCopperList()

        val warehouseItem1 = WarehouseItem(0, materialItems1)

        val materialItems2 = HashMap<MaterialItemTypes, MaterialCountItem>()
        materialItems2[MaterialItemTypes.IRON] = getIronList()
        materialItems2[MaterialItemTypes.BOLT] = getBoltList()
        materialItems2[MaterialItemTypes.COPPER] = getCopperList()

        val warehouseItem2 = WarehouseItem(1, materialItems2)

        data.add(warehouseItem1)
        data.add(warehouseItem2)
    }

    private fun getIronList(): MaterialCountItem {
        val materialItem1 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")
        val materialItem2 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")
        val materialItem3 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")
        val materialItem4 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")
        val materialItem5 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")
        val materialItem6 =
            MaterialItem(0, MaterialItemTypes.IRON, "iron", "description iron", "icon")


        val ironList = ArrayList<MaterialItem>()
        ironList.add(materialItem1)
        ironList.add(materialItem2)
        ironList.add(materialItem3)
        ironList.add(materialItem4)
        ironList.add(materialItem5)
        ironList.add(materialItem6)
        return MaterialCountItem(ironList)
    }

    private fun getBoltList(): MaterialCountItem {
        val materialItem1 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")
        val materialItem2 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")
        val materialItem3 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")
        val materialItem4 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")
        val materialItem5 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")
        val materialItem6 =
            MaterialItem(0, MaterialItemTypes.BOLT, "bolt", "description bolt", "icon")


        val boltList = ArrayList<MaterialItem>()
        boltList.add(materialItem1)
        boltList.add(materialItem2)
        boltList.add(materialItem3)
        boltList.add(materialItem4)
        boltList.add(materialItem5)
        boltList.add(materialItem6)
        return MaterialCountItem(boltList)
    }

    private fun getCopperList(): MaterialCountItem {
        val materialItem1 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")
        val materialItem2 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")
        val materialItem3 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")
        val materialItem4 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")
        val materialItem5 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")
        val materialItem6 =
            MaterialItem(0, MaterialItemTypes.COPPER, "copper", "description copper", "icon")


        val copperList = ArrayList<MaterialItem>()
        copperList.add(materialItem1)
        copperList.add(materialItem2)
        copperList.add(materialItem3)
        copperList.add(materialItem4)
        copperList.add(materialItem5)
        copperList.add(materialItem6)
        return MaterialCountItem(copperList)
    }
}