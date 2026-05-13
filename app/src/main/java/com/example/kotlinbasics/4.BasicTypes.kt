package com.example.kotlinbasics
/*
 整型  Byte, Short, Int, Long
 无符号整型 UByte, UShort, UInt, ULong
 浮点型  Float, Double

 类型            位数               范围
 Byte           8 位         (-128) ~ (127)
 UByte          8 位         0 ~ (255)
 Short          16 位        (-32768) ~ (32767)
 UShort         16 位        0 ~ (65535)
 Int            32 位        (-2147483648) ~ (2147483647)
 UInt           32 位        0 ~ (4294967295)
 Long           64 位        (-9223372036854775808) ~ (9223372036854775807)
 ULong          64 位        0 ~ (18446744073709551615)
 Float          32 位        (-3.4028235E+38) ~ (3.4028235E+38)
 Double         64 位        (-1.7976931348623157E+308) ~ (1.7976931348623157E+308)

 布尔 Boolean：true 或者 false

 字符 Char

 字符串 String
*/
fun main(){
    // val a: Byte = 10
    // val b = 20
    // val c = a * b
    //
    // val d = "1"
    // val e = "2"
    // val f = d * e

    val age: Byte = 100

    // 整型
    val year: Int = 2020

    // 无符号整型
    val score: UInt = 100u

    // 单精度
    val currentTemp: Float = 24.5f
    // 双精度
    val price: Double = 19.99

    // 布尔类型
    val isEnabled: Boolean = true

    // 字符类型 单引号包裹且里面只能有一个字符
    val separator: Char = 'c'

    // 字符串
    val message: String = "Hello, world!"
    // 多行字符串 会保留所有缩进空白，包括空格和换行
    val msg = """
     test
     demo one
    """

    println(age)
    println(year)
    println(score)
    println(currentTemp)
    println(price)
    println(isEnabled)
    println(separator)
    println(message)
    println(msg)
}