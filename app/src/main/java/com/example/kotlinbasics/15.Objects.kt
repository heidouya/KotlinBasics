package com.example.kotlinbasics

/*
对象（Object）：单例模式的实现，Kotlin中对象的定义更加简洁明了，无需使用 companion object
*/
//-----------------------对象声明-----------------------
/*
对象声明：使用 object 关键字声明的对象是单例的，即在整个程序运行期间，该对象只有一个实例存在。
对象声明的语法如下：
object 对象名 {
    // 成员
}
对象声明的成员可以是属性、方法、构造函数等。
*/
// fun main() {
//     println(Singleton.name)
//     Singleton.sayHello()
// }
//
// object Singleton {
//     var name: String = "Singleton"
//     fun sayHello() {
//         println("Hello, $name")
//     }
// }
//-------------------------对象继承-------------------
/*
对象声明可以继承其他类，并实现接口。
对象声明的继承语法如下：
object 对象名 : 父类名, 接口名 {
    // 成员
}
*/
// object MyObject : MyInterface {
//     override fun myMethod() {
//         println("MyObject myMethod")
//     }
// }
// interface MyInterface {
//     fun myMethod()
// }
//-------------------数据对象-------------------
/*
数据对象：使用 data 关键字声明的对象，Kotlin 会自动为其实现 equals()、hashCode()、toString() 等方法。

数据对象的语法如下：
data object 对象名 {
    // 成员
}
*/
// fun main() {
//     println(Singleton) // Singleton
//     Singleton.sayHello() // Hello, Singleton
// }
//
// data object Singleton {
//     var name: String = "Singleton"
//     fun sayHello() {
//         println("Hello, $name")
//     }
// }
//-----------------伴生对象-------------------
/*
伴生对象：使用 companion object 关键字声明的对象，可以像访问静态成员一样访问对象的属性和方法。伴生对象中可以包含构造函数、属性、方法等。伴生对象的成员可以通过对象名直接访问。伴生对象是单例的，即在整个程序运行期间，该对象只有一个实例存在。每个类最多一个 companion object。

伴生对象的语法如下：
companion object 对象名 {
    // 成员
}

Kotlin 没有 static 关键字，用 companion object 替代
*/
class MyClass {
    // 如果未定义名称，默认名称为 Companion
    companion object {
        var name: String = "MyClass"
        fun sayHello() {
            println("Hello, $name")
        }
    }
}

fun main() {
    // 通过类名访问伴生对象的属性和方法
    println(MyClass.name)
    MyClass.sayHello()
}
