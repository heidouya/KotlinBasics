package com.example.kotlinbasics

// -----------------作用域函数---------------------
/*
作用域函数是 Kotlin 中的一种功能，允许你在一个函数中访问另一个函数的成员。
Kotlin 中有五种作用域函数：
1. apply
2. run
3. with
4. let
5. also

全局作用域（Global Scope）是指在整个程序中都可以访问的作用域。全局作用域中的函数和属性可以通过它们的名称直接访问，而不需要使用任何前缀。全局作用域是 Kotlin 中最外层的作用域，它是所有其他作用域的父作用域。

局部作用域（Local Scope）是指在某个函数或代码块中可以访问的作用域。它包含该函数或代码块中定义的函数和属性。例如：函数参数、局部变量和局部属性，它们只能在该函数或代码块中被调用。
*/
//-----------------------let------------------------------
/*
let 函数是 Kotlin 中的一种作用域函数，它接受一个 lambda 表达式作为参数，并将调用该函数的对象作为参数传递给 lambda 表达式。let 函数的返回值是 lambda 表达式的返回值。

当你想在代码中执行空检查，之后再对返回的对象执行进一步操作时，请使用 let 作用域函数。
*/
// fun main() {
//     // 报错
//     // val address: String? = getNextAddress()
//     // sendNotification(address)
//
//     //--------------使用条件判断-----------------
//     // val address: String? = getNextAddress()
//     // val confirm = if(address != null) {
//     //     sendNotification(address)
//     // } else { null }
//     // println(confirm)
//
//     //--------------使用 let 函数-----------------
//     val address: String? = getNextAddress()
//     val confirm = address?.let {
//         sendNotification(it)
//     }
//
//     println(confirm)
// }
//
// fun sendNotification(recipientAddress: String): String {
//     println("Yo $recipientAddress!")
//     return "Notification sent!"
// }
//
// fun getNextAddress(): String {
//     return "sebastian@jetbrains.com"
// }
//--------------------apply--------------------
/*
apply 函数是 Kotlin 中的一种作用域函数，它接受一个 lambda 表达式作为参数，并将调用该函数的对象作为参数传递给 lambda 表达式。通常用于在代码中执行一些初始化操作，例如设置对象属性、调用对象方法等。apply 函数的返回值是调用该函数的对象，因此可以方便地链式调用。
*/
// val client = Client()

val client = Client().apply {
    token = "asdf"
}

fun main() {
    client.token = "asdf"
    client.getData()
}

class Client() {
    var token: String? = null
    fun getData() : String {
        println("getting data!")
        return "Mock data"
    }
}
