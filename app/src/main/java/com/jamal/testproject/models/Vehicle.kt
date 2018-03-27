package com.jamal.testproject.models

/**
 * Created by Jamal on 20/03/2018.
 */

import com.jamal.testproject.masterFunction

abstract class Vehicle(code: String){

    val code = code

    open val baseName: String = "- Vehicle"
    abstract val doorsNumber: Int?
    abstract val wheelsNumber: Int?

    init {
        System.out.println("Init from ${Vehicle::class.java.canonicalName}")
    }


    fun noHeritageFun(): String{
        return "No heritance fun"
    }

    open fun heritageFun() : Int{
        return 500
    }

    open fun duplicateFun(){
        println("Duplicate fun call from Vehicle class")
    }

    fun accessExtended(){
        var someCar = Car("a23123s","RCZ",2016,"Light Blue",0)
        println(someCar.masterFunction())
    }

}