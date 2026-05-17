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
// fun main() {
//     val res = sum2(1, 2)
//    println(res) // 3
// }
//
// fun sum1(x: Int, y: Int): Int {
//    return x + y;
// }
// // 可以省略返回值类型
// fun sum2(x: Int, y: Int) = x + y;
//----------------函数提前返回------------------
// fun main() {
//     println(isAuth(true))
// }
//
// fun isAuth(isAuth: Boolean): String {
//     if (isAuth) {
//         return "已经授权"
//     }
//     return "未授权"
// }
//-------------拉姆达表达式-----------------
// fun main() {
//     println(uppercaseString("hello")) // HELLO
//
//     val upperCaseString = { text: String -> text.uppercase() }
//     println(upperCaseString("hello"))
//
//     //------------多参拉姆达表达式-----------------
//     val sum1 = { x: Int, y: Int -> x + y }
//     println(sum1(1, 2))
//
//     //------------多参拉姆达表达式-----------------
//     val sum2 = { x: Int, y: Int ->
//         println(x)
//         println(y)
//         x + y
//     }
//
//     println(sum2(1, 3))
//
//     //------------无参数拉姆达表达式-----------------
//     val sayHello = { 1 + 5 }
//     val res = sayHello()
//     println(res)
// }
//
// fun uppercaseString(text: String): String {
//     return text.uppercase()
// }
//--------拉姆达表达式作为函数参数传递--------
// fun main() {
//     val numbers = listOf(1, -2, 3, -4, 5, -6)
//     val positives1 = numbers.filter { x -> x > 0 }
//     val isPositives: (Int) -> Boolean = { x: Int -> x > 0 }
//     val positives2 = numbers.filter(isPositives)
//     println(positives1) // [1, 3, 5]
//     println(positives2) // [1, 3, 5]
//
//     val isNegative = { x: Int -> x < 0 }
//     val negatives = numbers.filter(isNegative)
//     println(negatives) // [-2, -4, -6]
//
//     val numbers2 = listOf(1, -2, 3, -4, 5, -6)
//     val doubled = numbers2.map { x -> x * 2 }
//     println(doubled) // [2, -4, 6, -8, 10, -12]
//
//     val isTripled = { x: Int -> x * 3 }
//     val tripled = numbers.map(isTripled)
//     println(tripled) // [3, -6, 9, -12, 15, -18]
// }
//----------------函数类型----------------
/*
函数类型是 Kotlin 中的一种数据类型，表示一个函数的类型，函数类型由参数类型和返回值类型组成，用箭头 -> 分隔。

参数类型用括号括起来，多个参数类型用逗号分隔。返回值类型写在箭头 -> 的后面。
例如：(String) -> String 表示一个函数类型，该函数接受一个 String 类型的参数并返回一个 String 类型的值。

函数类型可以赋值给变量，也可以作为参数传递给函数，还可以作为函数的返回值。
 */
// fun main() {
//    val upperCaseString: (String) -> String = { text -> text.uppercase() }
//    println(upperCaseString("hello")) // HELLO
//
//     // 无参数函数类型
//     val noArgFunction: () -> String = { "Hello, World!" }
//     println(noArgFunction()) // Hello, World!
//
//     // 无参数、无返回值函数类型
//     val noReturnFunction: () -> Unit = { println("Hello, World!") }
//     noReturnFunction()
// }
//-------------从函数返回一个拉姆达表达式-------------------
// fun main() {
//     val fn: () -> (text: String) -> String = {
//         {text: String -> text.uppercase()}
//     }
//
//     val upperCaseString = fn()
//     println(upperCaseString("hello"))
// }
// fun fn(): (text: String) -> String {
//     return {text: String -> text.uppercase()}
// }
//-------------拉姆达表达式自调用--------------------
// fun main() {
//     val text = { text: String -> text.uppercase() }("hello")
//     println(text)
// }
// ------------尾随拉姆达表达式------------
// 尾随拉姆达表达式（Trailing Lambda Expressions）是 Kotlin 中的一种语法糖，用于简化代码，使代码更易读。当一个函数的最后一个参数是一个拉姆达表达式时，可以将拉姆达表达式移到函数括号之外。
fun main() {
    // 1. lambda表达式是唯一的函数参数，你可以去掉函数括号（）
    // listOf(1, -2, 3).filter({ x -> x > 0 })

    listOf(1, -2, 3).filter { x -> x > 0 }

    // 2. lambda表达式作为函数的最后一个参数传递，表达式可以写在函数括号（）之外。
    // listOf(1, 2, 3).fold(0, { x, item -> x + item })

    listOf(1, 2, 3).fold(0) { x, item -> x + item } // 6
}



