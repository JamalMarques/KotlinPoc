package com.jamal.testproject.interfaces

/**
 * Created by Jamal on 20/03/2018.
 */
interface Transport {
    val numOfSeats: Int

    fun driveToLocation(long: Double, lat: Double){
        println("Driving to $long - $lat")
    }

    fun duplicateFun(){
        println("Duplicate fun call from Transport interface")
    }
}