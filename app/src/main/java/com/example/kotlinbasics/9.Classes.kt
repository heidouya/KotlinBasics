package com.example.kotlinbasics
/*
类和对象
Kotlin中的类和对象的定义与Java类似，但Kotlin中的类默认是final的，不能被继承。
类定义的语法如下：
class ClassName {
}

数据类 自动实现 toString() equals() hashCode() copy()等函数，无需手动编写，简化代码，提高可读性，且可以比较对象是否相等，使用data关键字定义
*/
//---------类属性------------
// fun main() {
//     // 在类名后的括号()内定义声明属性
//     class Contact1(val id: Int, var email: String)
//     // 创建实例
//     val contact1 = Contact1(1, "mary@gmail.com")
//     // 访问属性
//     println(contact1.email)
//
//     //-----------------------------------
//     // 在括号内声明不带 val 或 var 的属性，这些属性在实例创建后无法被访问
//     class Contact2(id: Int, email:String)
//     val contact2 = Contact2(1, "mary@gmail.com")
//     // println(contact2.email)
//
//     //-------------类体中定义声明属性------------
//     class Contact3(val id: Int, var email: String) {
//         val category: String = ""
//     }
//     val contact3 = Contact3(1, "mary@gmail.com")
//     println(contact3.email)
//
//     //--------------带默认值的构造函数----------
//     class Contact4(val id: Int, var email: String = "example@gmail.com") {
//         val category: String = "work"
//     }
//     val contact4 = Contact4(1)
//     println(contact4.email)
// }
//--------------成员函数---------------
// fun main() {
//     class Contact(val id: Int, var email: String) {
//         // 成员函数
//         fun printId() {
//             println(id)
//         }
//     }
//
//     val contact = Contact(1, "mary@gmail.com")
//
//    contact.printId() // 1
// }
//-------------数据类--------------
// 数据类 自动实现 toString() equals() hashCode() copy()等函数，无需手动编写，简化代码，提高可读性，且可以比较对象是否相等，使用data关键字定义
fun main() {
    // 普通类，不使用data关键字定义
    class User1(val name: String, val id: Int)
    val user = User1("Alex", 1)
    println(user.toString())
    println(user)

    // 数据类，使用data关键字定义
    data class User2(val name: String, val id: Int)
    val user2 = User2("Alex", 1)
    println(user2.toString())
    println(user2) // User2(name=Alex, id=1)

    // == 比较对象是否相等
    val user3 = User1("Alex", 1)
    println(user3 == user2) // false

    // copy() 复制对象
    val user4 = user2.copy()
    println(user4 == user2) // true

    // copy() 复制对象，可以修改属性值
    val user5 = user2.copy(name = "Bob")
    println(user5 == user2) // false
    println(user5) // User2(name=Bob, id=1)
}
