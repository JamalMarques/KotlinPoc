package com.jamal.testproject

import android.app.Activity
import android.os.Bundle
import com.jamal.testproject.models.Car

/** NOTE: all extensions lives inside the package and can be accessed only there
 * We can import they if necessary -> see {@see #Vehicle.kt}
 * Normally they are set at the top of the file, like here! */

/*Extension function*/
fun Car.getExtendedName(): String{
    return this.model
}

fun Any?.masterFunction(): String{
    if (this == null){
        return "NULL!"
    }
    return "Mater Function"
}

/*Extension properties*/
val Car.country: String
    get() {
        return "USA"  /*Note: always get is used and backing fields are not allowed. That's because the init cannot be an extended property*/
    }

/*On companion object...*/
val  Car.Companion.wheelSize: Int
    get() = 16



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Classes and constructors
        carWorkBasicClassesAndConstructors()

        //Properties and fields
        propertiesAndFields()

        //Extensions (functions & properties)
        var extensionCar = Car("a23123s","RCZ",2016,"Light Blue",0)
        println("Car model: ${extensionCar.getExtendedName()}")
        println("Master function: ${extensionCar.masterFunction()}")
        println("Country: ${extensionCar.country}")
        println("Wheel Size: ${Car.wheelSize}")
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
