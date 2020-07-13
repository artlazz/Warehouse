package com.example.warehouse.app

import android.app.Application
import com.example.warehouse.data.DatabaseDao

class App : Application() {

    companion object {
        lateinit var sDatabaseDao: DatabaseDao
    }

    override fun onCreate() {
        super.onCreate()

        // create database single object TODO replace database fake object with real db implementation
        sDatabaseDao = DatabaseDao()

    }
}