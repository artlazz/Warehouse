package com.example.warehouse.presentation.ui.main

import androidx.lifecycle.ViewModel
import com.example.warehouse.app.App

class MainActivityViewModel : ViewModel() {
    fun getData() {
        App.sDatabaseDao.getWarehouses()
        App.sDatabaseDao.getWarehouseById(0)
        App.sDatabaseDao.getMaterialById(0, 0)
    }

}