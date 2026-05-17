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
object MyObject : MyInterface {
    override fun myMethod() {
        println("MyObject myMethod")
    }
}
interface MyInterface {
    fun myMethod()
}


