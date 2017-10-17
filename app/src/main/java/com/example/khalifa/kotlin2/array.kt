package com.example.khalifa.kotlin2

/**
 * Created by khalifa on 17/10/17.
 */
fun main(args: Array<String>) {
    var arraylist = ArrayList<String> ()
    arraylist.add("cakra")
    arraylist.add("aji")
    arraylist.add("jepara")

    println("First name:" + arraylist.get(0))

    println("all element by object")
    for (item in arraylist) {
        println(item)
    }
}