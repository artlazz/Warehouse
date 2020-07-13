package com.example.warehouse.data

import com.example.warehouse.model.MaterialItem
import com.example.warehouse.model.WarehouseItem
import com.example.warehouse.model.exceptions.MaterialTransactionFailException
import com.example.warehouse.model.exceptions.NotEnoughPlaceInWarehouseException
import com.example.warehouse.model.types.MaterialItemTypes
import kotlin.random.Random

class DatabaseDao {

    /**
     * return all warehouse items
     */
    fun getWarehouses(): List<WarehouseItem> {

        // get all warehouses from the db
        return Database.data
    }

    /**
     * return warehouse item by id
     * @param id
     */
    fun getWarehouseById(id: Long): WarehouseItem? {

        // TODO return real warehouse item from db
        return null
    }

    /**
     * return material item by id
     * @param materialId
     * @param warehouseId
     */
    fun getMaterialById(materialId: Long, warehouseId: Long): MaterialItem? {

        // TODO get material item from db and return (return real material item)
        return null
    }

    /**
     * add material to the warehouse
     * throw NotEnoughPlaceInWarehouseException if current material count in the warehouse is max
     * @param material
     * @param toWarehouse
     */
    fun addMaterialToWarehouse(material: MaterialItem, toWarehouse: WarehouseItem): Boolean {
        // TODO fix if statement
        if (false){
            return throw NotEnoughPlaceInWarehouseException()
        }
        
        // return true if material item is added, else return false TODO add "add item" logic
        return true
    }

    /**
     * remove material from the warehouse
     * @param material
     * @param toWarehouse
     */
    fun removeMaterialFromWarehouse(material: MaterialItem, toWarehouse: WarehouseItem): Boolean {
        // return true if material item is removed, else return false TODO add "remove item" logic
        return true
    }

    /**
     * try to do transaction
     * throw MaterialTransactionFailException if transaction if failed
     * throw NotEnoughPlaceInWarehouseException if warehouse's material is full
     * @param materialItem
     * @param fromWarehouse warehouse from need to remove material item
     * @param toWarehouse warehouse where need to add material item
     */
    fun materialTransaction(
        materialItem: MaterialItem,
        fromWarehouse: WarehouseItem,
        toWarehouse: WarehouseItem
    ): Boolean {

        // TODO implement transaction (remove from one warehouse and add to another)
        val random = Random.nextInt(0, 2)
        return when (random) {
            0 -> throw MaterialTransactionFailException()
            1 -> throw NotEnoughPlaceInWarehouseException()
            else -> true
        }
    }
}