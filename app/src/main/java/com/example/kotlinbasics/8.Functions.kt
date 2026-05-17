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
// fun main() {
//     printMessageWithPrefix("Hello", "Log")
//
//     // 使用具名参数可以改变参数的顺序
//     printMessageWithPrefix(prefix = "Log", message = "Hello")
// }
//
// fun printMessageWithPrefix(message: String, prefix: String) {
//     println("[$prefix] $message")
// }
//---------------默认参数-----------------
// 默认参数值允许在函数定义中为参数提供默认值，如果调用函数时没有提供该参数的值，则将使用默认值。
// fun main() {
//    printMessageWithPrefix("Hello") // Info Hello
// }
//
// fun printMessageWithPrefix(message: String="1", prefix: String = "Info") {
//    println("$prefix $message")
// }
//-------------无返回值函数--------------
// 函数可以没有返回值，这种函数的返回类型是 Unit，可以省略。例如：
// fun main() {
//    printMessage("Hello") // Hello
//    // `return Unit` or `return` is optional
// }
// fun printMessage(message: String) {
//    println(message)
// }
//----------------单一表达式函数-----------------
// 单一表达式函数是只包含一个表达式的函数，编译器会自动返回该表达式的值。
// 单一表达式函数的语法是：fun functionName(parameters): ReturnType = expression
// 例如：
fun main() {
    val res = sum2(1, 2)
   println(res) // 3
}

fun sum1(x: Int, y: Int): Int {
   return x + y;
}
// 可以省略返回值类型
fun sum2(x: Int, y: Int) = x + y;


