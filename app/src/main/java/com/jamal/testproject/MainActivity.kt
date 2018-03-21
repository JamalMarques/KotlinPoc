package com.jamal.testproject

import android.app.Activity
import android.os.Bundle
import com.jamal.testproject.models.Car

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carOne = Car("Peugeot 408",2012, "Gray")

        carOne.some(max = 20)

        carOne hello "asd"

    }
}
