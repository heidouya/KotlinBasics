package com.example.kotlinbasics
/*
类型推断：Kotlin 编译器会根据变量的初始值自动推断出变量的类型，开发者不需要显式指定类型。
*/
fun main2() {
    var customers = 10

//    customers = ""

    customers = 8

    customers = customers + 3
    customers += 3
    println(customers)

    customers -= 3 // customers = customers - 3
    customers *= 3 // customers = customers * 3
    customers /= 3 // customers = customers /

    println(customers)

    // 没有初始化，必须指定类型
    var sum: Int;
    val a = 1
    val b = 2;

    sum = a + b;
    print(sum)
}