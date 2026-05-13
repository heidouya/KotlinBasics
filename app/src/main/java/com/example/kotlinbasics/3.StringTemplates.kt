package com.example.kotlinbasics
/*
字符串模板：字符串模板是字符串中嵌入变量或表达式的一种方式。使用 $ 符号来嵌入变量或表达式。

如果要嵌入的变量名是单个字母或数字，可以省略大括号。如果要嵌入的变量名是多个字母或数字，或者包含特殊字符，必须使用大括号。
*/
fun main() {
    val apples = 12

//    println("There are " + apples + "!")
    println("There are $apples apples")
    println("There are ${apples + 10} apples")
}
