package com.jamal.testproject.models

/**
 * Created by Jamal on 18/03/2018.
 */

fun hello2(s: String) : String?{
    return null
}

class Car (model: String , year: Int, color: String){

    //Helps to avoid the use of the dot to call the function -
    infix fun hello(s: String){ /*Do something*/}

    fun some(num: Int = 10, max: Int){
        /*Do something fun*/
        this hello "asd"
        hello("asd")
    }
}