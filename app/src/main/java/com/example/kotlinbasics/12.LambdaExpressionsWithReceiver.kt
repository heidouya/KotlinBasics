package com.example.kotlinbasics

//-------------带有接收者的拉姆达表达式--------------
/*
带有接收者的 Lambda 表达式（Lambda with Receiver）是 Kotlin 中的一个核心特性，它允许你在 Lambda 函数体内部通过 this 访问一个接收者对象，从而可以直接调用该对象的方法和属性，而无需每次都显式引用。

基本语法：
```kotlin
val lambda: ReceiverType.() -> Unit = {
    // 在这里，this 指向 ReceiverType 的实例
    // 可以直接调用 ReceiverType 的方法和属性
}
```
与普通 Lambda 的关键区别在于 ReceiverType. —— 它声明了一个接收者类型，即 Lambda 表达式将要操作的对象类型。

例如，假设我们有一个 Canvas 类，它有 drawCircle 和 drawSquare 方法，我们可以使用带有接收者的 Lambda 表达式来绘制图形，而无需每次都显式引用 Canvas 对象。

核心价值在于：让代码读起来像自然语言，这是 Kotlin 能够优雅构建 DSL 的基础。
*/
//-----------------------------------
// fun main() {
//     val stringBuilder = StringBuilder()
//     stringBuilder.buildString()
// }
//
// class StringBuilder {
//     fun append(text: String) {
//         print(text)
//     }
// }
//
// val buildString: StringBuilder.() -> Unit = {
//     append("Hello")   // 等价于 this.append("Hello")
//     append(" World")
// }
//----------------------------------
// fun main() {
//     val person = person {
//         name = "Alice"
//         age = 25
//     }
//     println(person.name)  // 输出: Alice
//     println(person.age)   // 输出: 25
// }
// class Person {
//     var name: String = ""
//     var age: Int = 0
// }
//
// /**
//  * 创建一个 Person 对象并执行 block
//  * @param block 对 Person 对象的扩展函数
//  * @return Person 对象
//  */
// fun person(block: Person.() -> Unit): Person {
//     val p = Person()
//     p.block()  // 在 p 的上下文中执行 block
//     return p
// }
//----------------------------------
// class Canvas {
//     fun drawCircle() = println("🟠 Drawing a circle")
//     fun drawSquare() = println("🟥 Drawing a square")
// }
//
// fun render(block: Canvas.() -> Unit): Canvas {
//     val canvas = Canvas()
//     canvas.block()
//     return canvas
// }
//
// fun main() {
//     render {
//         drawCircle()
//         drawSquare()
//     }
// }
//-----------------------------------------
// class MenuItem(val name: String)
//
// class Menu(val name: String) {
//     val items = mutableListOf<MenuItem>()
//
//     fun item(name: String) {
//         items.add(MenuItem(name))
//     }
// }
//
// fun menu(name: String, init: Menu.() -> Unit): Menu {
//     val menu = Menu(name)
//     menu.init()
//     return menu
// }
//
//
// fun printMenu(menu: Menu) {
//     println("Menu: ${menu.name}")
//     menu.items.forEach { println("  Item: ${it.name}") }
// }
//
// fun main() {
//     val mainMenu = menu("Main Menu") {
//         item("Home")
//         item("Settings")
//         item("Exit")
//     }
//
//     printMenu(mainMenu)
// }

