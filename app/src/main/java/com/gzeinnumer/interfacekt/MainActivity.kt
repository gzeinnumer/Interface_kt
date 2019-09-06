package com.gzeinnumer.interfacekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() , MyInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj = InterfaceImp()

        println(obj.prop) //23
    }
}

interface MyInterface {
    val prop: Int
    get()=23
}

class InterfaceImp:MyInterface{
    //
}
