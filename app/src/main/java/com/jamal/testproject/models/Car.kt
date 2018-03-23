package com.jamal.testproject.models

import com.jamal.testproject.interfaces.Transport

/**
 * Created by Jamal on 18/03/2018.
 */

fun hello2(s: String) : String?{
    return null
}

class Car (code: String, model: String, year: Int, color: String): Vehicle(code), Transport {

    companion object {
        const val CAR_WHEELS_NUMBER: Int = 4
    }

    //lateinit - used for initialize a var in "not null" mode after the construction
    lateinit var someLateInitData: String
    fun lateInitFunCheck(){
        //To check we do it this way
        if(this::someLateInitData.isInitialized){
            //Now you can use it
        }
    }

    override val numOfSeats: Int = 5
    override val baseName: String get() = "Car" + super.baseName
    override val doorsNumber: Int? get() = null
    override val wheelsNumber: Int? get() = CAR_WHEELS_NUMBER

    var model = model

    //Make the set private - so the value cannot be changed without changing the default imp (var)
    var year = year
        private set

    //Custom propertie setter - backing field
    var color = color
        set(value) {
            field = "Color modified: $value"
        }

    private var engine: Engine = Engine(16)

    override fun heritageFun(): Int {
        println(super.heritageFun()) //calls super
        print(505) //do whatever
        return 505
    }

    constructor(code: String, model: String, year: Int, color: String, kmCount: Int): this(code, model, year, color){
        println("Running Car constructor")
    }

    init {
        System.out.println("Second initialization ${Car::class.java.canonicalName}")
    }

    //Helps to avoid the use of the dot to call the function -
    infix fun hello(s: String){ /*Do something*/}

    fun some(num: Int = 10, max: Int){
        /*Do something fun*/
        this hello "asd"
        hello("asd")
    }

    override fun duplicateFun() {
        super<Vehicle>.duplicateFun()
        super<Transport>.duplicateFun()
        println("My own duplicate fun!")
    }

    private inner class Engine(valvesNumber: Int){

        var valvesNumber: Int = valvesNumber

        fun doSomethingAwesome(){
            super@Car.heritageFun() //call super car implementation
            heritageFun() //call car implementation
        }
    }
}