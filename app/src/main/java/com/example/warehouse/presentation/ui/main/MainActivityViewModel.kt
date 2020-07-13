package com.example.warehouse.presentation.ui.main

import androidx.lifecycle.ViewModel
import com.example.warehouse.app.App

class MainActivityViewModel : ViewModel() {
    fun getData() {
        App.sDatabaseDao.getWarehouses()
        App.sDatabaseDao.getWarehouseById(0)
        App.sDatabaseDao.getMaterialById(0, 0)
    }

    fun addData() {
//        App.sDatabaseDao.addMaterialToWarehouse() TODO implement add data
    }

    fun removeData() {
//        App.sDatabaseDao.removeMaterialFromWarehouse() TODO implement remove data
    }

    fun transitData() {
//        App.sDatabaseDao.materialTransaction() TODO implement transaction
    }

}