package com.example.kotlinbasics

/*
声明接口使用关键字interface。接口可以包含抽象方法和默认方法。抽象方法没有实现，而默认方法有实现。接口不能包含构造函数，因为它们不能被实例化。接口可以包含属性，但它们必须是抽象的。

一个类可以实现多个接口，多个接口之间用逗号分隔。

实现多个接口的语法：
class ClassName : InterfaceName1, InterfaceName2
*/

fun main() {
    val button = Button()
    button.isClickable = true
    button.click()
    button.showOff()
}

interface Clickable {
     var isClickable: Boolean
    // 禁止接口中的属性初始化项
    // var isClickable1: Boolean = false
    fun click() // 抽象方法
    fun showOff() = println("I'm clickable!")  // 带默认实现的方法
}

class Button : Clickable {
    override var isClickable = false
    override fun click() = println("I was clicked!")
}

