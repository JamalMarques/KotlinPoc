package com.jamal.testproject.models

/**
 * Created by Jamal on 20/03/2018.
 */
abstract class Vehicle{

    constructor(code: String){
        println("Running Vehicle constructor")
    }

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

}