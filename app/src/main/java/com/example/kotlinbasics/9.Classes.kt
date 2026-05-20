package com.example.kotlinbasics

import android.R

/*
类和对象
Kotlin中的类和对象的定义与Java类似，但Kotlin中的类默认是final的，不能被继承。
类定义的语法如下：
class ClassName {
}

数据类 自动实现 toString() equals() hashCode() copy()等函数，无需手动编写，简化代码，提高可读性，且可以比较对象是否相等，使用data关键字定义
*/
//-----------------------类----------------------
/*
类是面向对象编程中的一个重要概念，它是一种数据结构，用于将数据（属性）和操作数据的方法（函数）封装在一起。类是对象的蓝图或模板，通过类可以创建对象（实例）。

类的定义使用class关键字，类名通常使用大写字母开头，例如：class MyClass { }
*/
//----------------------类----------------------
// fun main() {
//     val animal = Animal()
// }
//
// class Animal {}
//----------------------类成员属性和方法----------------------
// fun main() {
//     val animal = Animal()
//     animal.name = "Dog"
//     println(animal.name)
//     animal.makeSound()
// }
// class Animal {
//     var name: String = "Animal" // 类成员属性
//     // 类成员方法
//     fun makeSound() {
//         println("Some generic animal sound")
//     }
// }
//----------------构造函数------------------
/*
如果没有显式构造器，Kotlin 会自动生成一个无参构造器。
1. 构造函数的名称与类名相同，可以有参数，也可以没有参数。
2. 构造函数可以有实现，也可以没有实现。
3. 构造函数可以有多个，但只能有一个主构造函数，多个次构造函数需要有主构造函数。
4. 主构造函数写在类头，次构造函数写在类体中。
5. 构造函数可以有参数，也可以没有参数，参数可以有默认值。
6. 构造函数可以访问类的属性，但不能访问类的方法。
*/
// fun main() {
//     val person1 = Person1()
//
//     val person2 = Person2("Alice", 25)
//     person2.name = "Bob"
//     person2.age = 30
//
//     val person3 = Person3("Alice", 25)
//     person3.printInfo()
//
//     val person4 = Person4("Alice", 25)
//     person4.printInfo()
//
//     val person5 = Person5("Alice", 25)
// }
//
// // 不显示构造函数
// class Person1 {}
//
// // 只包含主构造函数的类
// class Person2(var name: String, var age: Int) {}
//
// // 次构造函数
// class Person3 {
//     var name: String = ""
//     var age: Int = 0
//     // 次构造函数参数不能使用var或val声明
//     constructor(name: String, age: Int) {
//         this.name = name
//         this.age = age
//     }
//
//     fun printInfo() {
//         // 成员方法内访问属性，可以使用this关键字，也可以不使用
//         println("Name3: $name, Age3: $age")
//         println("Name3: ${this.name}, Age3: ${this.age}")
//     }
// }
//
// // 包含主构造函数和次构造函数的类
// class Person4(var name: String = "") {
//     var age: Int = 0
//     // 次构造器必须委托给主构造器（this(...)）
//     constructor(name: String, age: Int = 10) : this(name) {
//         this.age = age
//     }
//     fun printInfo() {
//         println("Name4: $name, Age4: $age")
//     }
// }
//
// // 主构造函数内声明不带 val 或 var 的属性，这些属性在实例创建后无法被访问
// class Person5(name: String, age: Int) {
//     // fun printInfo() {
//     //     println("Name5: $name, Age5: $age")
//     // }
// }
//------------------多个构造函数------------------
/*
多个构造函数：
1. 一个类最多一个主构造器（声明在类头），可以有多个次构造器
2. 所有次构造器必须直接或间接委托给主构造器（使用 this(...)）
3. 主构造函数：写在类头，用于初始化对象的属性，只能有一个主构造函数，但可以有多个次构造函数。
4. 次构造函数：写在类体中，用于初始化对象的属性，可以有多个次构造函数，每个次构造函数都必须委托给主构造函数或另一个次构造函数。
*/

// fun main() {
//     val person1 = Person("Alice", 20)  // 主构造器
//     val person2 = Person("Bob")    // 次构造器1
//     val person3 = Person(25)   // 次构造器2
//     val person4 = Person() // 次构造器3
// }
//
// class Person(val name: String, val age: Int) {
//     // 次构造器1：只传名字，年龄默认18
//     constructor(name: String) : this(name, 18)
//
//     // 次构造器2：只传年龄，名字默认"Unknown"
//     constructor(age: Int) : this("Unknown", age)
//
//     // 次构造器3：无参，全部使用默认值
//     constructor() : this("Unknown", 0)
// }

//-------------数据类--------------
// 数据类 自动实现 toString() equals() hashCode() copy()等函数，无需手动编写，简化代码，提高可读性，且可以比较对象是否相等，使用data关键字定义
// fun main() {
//     // 普通类，不使用data关键字定义
//     class User1(val name: String, val id: Int)
//     val user = User1("Alex", 1)
//     println(user.toString())
//     println(user)
//
//     // 数据类，使用data关键字定义
//     data class User2(val name: String, val id: Int)
//     val user2 = User2("Alex", 1)
//     println(user2.toString())
//     println(user2) // User2(name=Alex, id=1)
//
//     // == 比较对象是否相等
//     val user3 = User1("Alex", 1)
//     println(user3 == user2) // false
//
//     // copy() 复制对象
//     val user4 = user2.copy()
//     println(user4 == user2) // true
//
//     // copy() 复制对象，可以修改属性值
//     val user5 = user2.copy(name = "Bob")
//     println(user5 == user2) // false
//     println(user5) // User2(name=Bob, id=1)
// }