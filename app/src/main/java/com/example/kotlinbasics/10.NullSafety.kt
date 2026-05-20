package com.example.kotlinbasics
/*
空安全

Kotlin 中的空安全机制，避免空指针异常的发生。
1. 可空类型和非空类型
    - 可空类型：在类型后面加一个问号?，表示该类型可以是空的，即可以是null
    - 非空类型：在类型后面不加问号，表示该类型不能为空，即不能是null
2. 空安全调用
3. Elvis 运算符 ?: 用于提供默认值，当左边的表达式为 null 时，返回右边的值。
4. 空断言运算符 !!
5. 空条件运算符 ?.

is 检查对象是否具有该类型并返回一个布尔值。
!is 检查对象是否不具有该类型并返回一个布尔值。

as 进行类型转换，如果转换失败，则抛出 ClassCastException。
as? 进行类型转换，如果转换失败，则返回 null。
* */
//------------可空类型-------------
fun main() {
   var neverNull: String = "This can't be null"
   // neverNull = null

   var nullable: String? = "You can keep a null here"
   nullable = null

   fun strLength(notNull: String): Int {
       return notNull.length
   }

   println(strLength(neverNull)) // 18
   println(strLength(nullable))  // Throws a compiler error
}
