package com.jamal.testproject

import android.app.Activity
import android.os.Bundle
import com.jamal.testproject.models.Car

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Classes and constructors
        carWorkBasicClassesAndConstructors()

        //Properties and fields
        propertiesAndFields()


    }


    fun carWorkBasicClassesAndConstructors(){
        var carOne = Car("AFJPDDE349K","Peugeot 408",2012, "Gray")

        carOne.driveToLocation(545343.540, 5440504.523)
        carOne.duplicateFun()
    }

    fun propertiesAndFields(){

        //Cannot modify data
        val carNotMod = Car("34HSRE","Scirocco",2014,"Blue",45000)
        //carNotMod = Car() --> Not possible (cause its a val)

    }

}
