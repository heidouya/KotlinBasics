package com.example.kotlinbasics

/*
声明接口使用关键字interface。接口可以包含抽象方法和默认方法。抽象方法没有实现，而默认方法有实现。接口不能包含构造函数，因为它们不能被实例化。接口可以包含属性，但它们必须是抽象的。

一个类可以实现多个接口，多个接口之间用逗号分隔。

实现多个接口的语法：
class ClassName : InterfaceName1, InterfaceName2
*/

// fun main() {
//     val button = Button()
//     button.isClickable = true
//     button.click()
//     button.showOff()
// }
//
// interface Clickable {
//      var isClickable: Boolean
//     // 禁止接口中的属性初始化项
//     // var isClickable1: Boolean = false
//     fun click() // 抽象方法
//     fun showOff() = println("I'm clickable!")  // 带默认实现的方法
// }
//
// class Button : Clickable {
//     override var isClickable = false
//     override fun click() = println("I was clicked!")
// }

//--------------多个接口冲突----------
/*
如果多个接口包含同名的默认方法，实现类必须覆盖这个方法并提供自己的实现。
调用父接口的实现方法，可以使用 super<InterfaceName>.methodName() 语法。
*/

fun main() {
    val button = Button()
    button.showOff()
}

interface Clickable {
    fun showOff() = println("Clickable!")
}

interface Focusable {
    fun showOff() = println("Focusable!")
}

class Button : Clickable, Focusable {
    override fun showOff() {
        // 调用父接口的实现方法
        super<Clickable>.showOff()  // 调用 Clickable 的实现
        super<Focusable>.showOff()  // 调用 Focusable 的实现
    }
}
// --------------------继承和接口-------------
/*
某个类可以继承一个父类并实现多个接口。这种情况下，必须先声明父类，在冒号之后，再列出接口，用逗号分隔。
*/
// interface EcoFriendly {
//     val emissionLevel: String
// }
//
// interface ElectricVehicle {
//     val batteryCapacity: Double
// }
//
// open class Vehicle(val make: String, val model: String)
//
// open class Car(make: String, model: String, val numberOfDoors: Int) : Vehicle(make, model)
//
// class ElectricCar(
//     make: String,
//     model: String,
//     numberOfDoors: Int,
//     val capacity: Double,
//     val emission: String
// ) : Car(make, model, numberOfDoors), EcoFriendly, ElectricVehicle {
//     override val batteryCapacity: Double = capacity
//     override val emissionLevel: String = emission
// }
//-----------------代理-----------------
// interface DrawingTool {
//     val color: String
//     fun draw(shape: String)
//     fun erase(area: String)
//     fun getToolInfo(): String
// }
//
// class PenTool(override val color: String = "black") : DrawingTool {
//     override fun draw(shape: String) = println("Drawing $shape using a pen in $color")
//     override fun erase(area: String) = println("Erasing $area with a pen.")
//     override fun getToolInfo(): String = "Pen color: $color"
// }
//
// class BrushTool1(override val color: String = "orange") : DrawingTool {
//     override fun draw(shape: String) = println("Drawing $shape using a brush in $color")
//     override fun erase(area: String) = println("Erasing $area with a brush.")
//     override fun getToolInfo(): String = "Brush color: $color"
// }
//
// class BrushTool2(val tool: DrawingTool) : DrawingTool by tool {
//     override val color: String = "blue"
// }
//
// fun main() {
//     val pen = PenTool()
//     val brush = BrushTool2(pen)
//
//     println("Pen color: ${pen.color}") // Pen color: black
//
//     println("Brush color: ${brush.color}") // Brush color: blue
//     brush.draw("circle") // Drawing circle using a pen in black
//     brush.erase("top-left corner") // Erasing top-left corner with pen tool
//     println(brush.getToolInfo()) // Pen color: black
// }

