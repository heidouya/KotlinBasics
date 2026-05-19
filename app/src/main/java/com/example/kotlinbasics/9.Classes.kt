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
//----------------------------继承-------------------------
/*
继承是面向对象编程中的一个重要概念，它允许一个类（子类）继承另一个类（父类）的属性和方法。通过继承，子类可以重用父类的代码，并且可以添加新的属性和方法，或者重写父类的方法。

单一继承：Kotlin中，一个类只能继承自一个父类，这就是所谓的单一继承。如果需要实现多继承，可以使用接口（interface）。

父类：被继承的类，也称为超类或基类。
子类：继承父类的类，也称为派生类。

Any类是Kotlin中所有类的超类，类似于Java中的Object类。它位于所有类的顶端，是所有类的父类。Any类包含三个成员函数：equals()、hashCode()和toString()。如果一个类没有显式地继承自另一个类，则它会隐式地继承自Any类。

Kotlin中的类默认是final的，不能被继承，需要使用open关键字定义可继承的类，否则会报错。

怎么继承一个类？使用 open关键字定义可继承的类，使用 : 符号继承，并调用父类构造函数，例如：
```kotlin
    open class Animal { }
    class Dog : Animal() { }
```
其中 Animal 是父类，Dog 是子类。
*/
// Kotlin中的类默认是final的，不能被继承，需要使用open关键字定义可继承的类
// fun main() {
//
//     val dog = Dog()
//
//     dog.age = 10
//     dog.name = "Buddy"
//     dog.makeSound()
// }
//
// open class Animal(var name: String) {
//     open fun makeSound() {
//         println("Some generic animal sound")
//     }
// }
// class Dog : Animal("Buddy") {
//     // 子类可以有自己的属性
//     var age: Int = 1
//     override fun makeSound() {
//         // 通过super调用父类的name属性，this调用当前对象的属性
//         println("Name: ${super.name}")
//         println("Age: ${this.age}")
//
//         println("Bark")
//     }
// }
//----------------------------继承注意事项------------------------
// 如果你的类继承自父类，那么它必须初始化父类头文件中声明的所有参数。
// open class Person(var name: String="", var age: Int=0)
//
// // 使用默认参数初始化父类构造函数参数
// class Worker(name: String, age: Int, val company: String) : Person()
// // 使用具名参数初始化父类构造函数参数
// class Student : Person(name = "", age = 0)
// // 使用子类构造函数参数初始化父类构造函数参数
// class Teacher(name: String, age: Int, val subject: String) : Person(name, age)
//
// fun main() {
//     val student = Student()
//     student.name = "John" // setName("John")
//     student.age = 20 // setAge(20)
//
//     val teacher = Teacher("Alice", 30, "Math")
//     println(teacher.name)
//     println(teacher.age)
//     println(teacher.subject)
//
//     val worker = Worker("Bob", 40, "Google")
//     println(worker.name)
//     println(worker.age)
//     println(worker.company)
// }
//-------------------------重写父类的方法、属性-----------------------
/*
1. 重写（override）：子类可以重写父类的方法、属性，但不建议重写父类的属性。
2. 使用override关键字重写父类方法，使用open关键字声明父类方法可被重写。
3. 重写方法时，方法名、参数列表必须与父类方法相同，返回类型可以不同。
4. 重写方法时，可以使用super关键字调用父类方法。
*/
open class Animal(var name: String) {
    // 使用open关键字声明父类属性可被子类重写
    open var age:Int = 0
    // 使用open关键字声明父类方法可被子类重写
    open fun makeSound() {
        println("Some generic animal sound")
    }
}
class Dog : Animal("Buddy") {
    // 使用override关键字，重写父类方法，但不建议重写父类的属性
    override var age:Int = 10
    // 使用override关键字，重写父类方法
    override fun makeSound() {
        println("Bark")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
    println(dog.age)
}

//-----------------------------抽象类--------------------------
/*
抽象类是不能被实例化的类，它通常用于定义子类的模板，子类需要实现抽象类中的抽象方法。抽象类使用abstract关键字定义，抽象方法使用abstract关键字定义。

抽象属性、抽象方法必须实现。

抽象类既可以包含具有实现的方法和属性，也可以包含不具有实现的方法和属性，后者被称为抽象方法和抽象属性。

抽象类（abstract class）无需 open，默认可继承。

抽象类的作用是定义一个模板，子类需要实现抽象类中的抽象方法，从而实现多态。

抽象类的本质就是一种约束机制。用编译器来保证代码的正确性，而不是依赖开发者"记得"去做某件事。 这在大型项目或团队协作中尤为重要。
*/
// fun main() {
//     val book = Books("1984", 10.99, "George Orwell")
//
//     book.id = 1
//
//     println(book.productInfo2())
//
//     val electronic = Electronic("Laptop", 1000.99, 12)
//     electronic.id = 2
//     println(electronic.productInfo2())
// }
//
// abstract class Product(val name: String, var price: Double) {
//     // 抽象属性，子类必须实现，不能有实现
//     abstract val category: String
//     // 抽象方法，子类必须实现，不能有实现
//     abstract fun productInfo1(): String
//
//     // 具体属性，子类可以继承
//     var id: Int = 0
//     // 具体方法，子类可以继承
//     fun productInfo2(): String {
//         return "Product: $name, Category: $category, Price: $price"
//     }
// }
//
// class Books(name: String, price: Double, val author: String) : Product(name, price) {
//     override val category: String = "Book"
//     override fun productInfo1(): String {
//         return "Product: $name, Category: $category, Price: $price, Author: $author"
//     }
// }
//
// class Electronic(name: String, price: Double, val warranty: Int) : Product(name, price) {
//     override val category = "Electronic"
//     override fun productInfo1(): String {
//         return "Product: $name, Category: $category, Price: $price, Warranty: $warranty"
//     }
// }
