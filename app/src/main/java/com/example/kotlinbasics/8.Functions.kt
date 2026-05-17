package com.example.kotlinbasics

/*
函数
函数用于执行特定任务并可能返回结果。函数可以接受参数并可以有返回值。函数可以是命名的，也可以是匿名的。

声明函数使用 fun 关键字，后跟函数名、参数列表和返回类型，函数的参数使用括号括起来，参数之间用逗号分隔如：
fun sum(x: Int, y: Int): Int {
    return x + y
}
*/
// fun main() {
//    val res = sum(1, 2)
//    println(res)
// }
//
// // 函数如果有返回值，返回值类型不能省略
// fun sum(x: Int, y: Int): Int {
//    return x + y
// }
//---------------具名参数----------------
fun main() {
    printMessageWithPrefix("Hello", "Log")

    // 使用具名参数可以改变参数的顺序
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}


