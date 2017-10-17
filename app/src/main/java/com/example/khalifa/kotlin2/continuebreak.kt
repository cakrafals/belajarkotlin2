package com.example.khalifa.kotlin2

/**
 * Created by khalifa on 17/10/17.
 */
fun main(args: Array<String>){
    for(count in 1..5){
        if(count==4)
            continue
        println("count: $count")
    }
}