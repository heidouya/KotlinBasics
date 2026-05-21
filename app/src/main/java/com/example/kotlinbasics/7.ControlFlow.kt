package com.example.kotlinbasics
/*
流程控制
1. if 表达式
if 表达式可以作为语句或表达式使用。当用作语句时，if 表达式执行一个块并忽略结果。当用作表达式时，if 表达式计算一个块并返回结果。

if 表达式可以用于单分支、双分支和多分支选择，形式如下：
if (expression) {
    result
} else {
    result
} else if (expression) {
    result
} else {
    result
}

2. when 表达式
when 表达式可以作为语句或表达式使用。当用作语句时，when 表达式执行一个块并忽略结果。当用作表达式时，when 表达式计算一个块并返回结果。

when 表达式可以用于多分支选择，形式如下：
when (expression) {
    branch1 -> result1
    branch2 -> result2
    ...
}

3. for 循环
for 循环可以用于遍历集合，例如数组、列表等。for 循环可以作为语句或表达式使用。当用作语句时，for 循环执行一个块并忽略结果。当用作表达式时，for 循环计算一个块并返回结果。

for形式如下：
for (element in collection) {
    body
}

4. while 循环
while 循环可以用于重复执行一段代码，直到条件不再满足。while 循环可以作为语句或表达式使用。当用作语句时，while 循环执行一个块并忽略结果。当用作表达式时，while 循环计算一个块并返回结果。

while形式如下：
while (condition) { body }

5. do...while 循环
do...while 循环可以用于重复执行一段代码，直到条件不再满足。do...while 循环可以作为语句或表达式使用。当用作语句时，do...while 循环执行一个块并忽略结果。当用作表达式时，do...while 循环计算一个块并返回结果。

do...while形式如下：
do { body } while (condition)

范围:
范围可以用于for循环中，表示一个值的集合。例如，1..5表示1到5的范围，1..<5表示1到5的范围（不包括5），4 downTo 1表示4到1的范围，1..5 step 2表示1到5的范围，步长为2。
*/
//------------if-----------
// fun main() {
//     val a = 1
//     // 单分支
//     if (a == 1) {
//         print("a is one")
//     }
//
//     // 双分支
//     if (a == 1) {
//         print("a is one")
//     } else {
//         print("a is not one")
//     }
//
//     // 多分支
//     if (a == 1) {
//         print("a is one")
//     } else if (a == 2) {
//         print("a is two")
//     } else {
//         print("a is something else")
//     }
// }

//---------if 带返回值-------------
// fun main() {
//     var d: Int
//     val check = true
//
//     // 没有三元运算符 ?:
//     val e = if (check) 1 else 2
//
//     println(e)
//
//     d = if (check) {
//         val a = 1
//         val b = 2
//         a + b
//     } else {
//         val c = 3
//         val d = 4
//         c + d
//     }
//
//     println(d)
// }
//-------------when 用作语句---------------
// fun main() {
//     val trafficLightState = "Red"
//
//     when (trafficLightState) {
//         "Green" -> println("Go")
//         "Yellow" -> println("Slow down")
//         "Red" -> println("Stop")
//         else -> println("Malfunction")
//     }
// }
//-------------when 做为表达式--------------
// fun main() {
//    val trafficLightState = "Red"
//
//    val trafficAction = when (trafficLightState) {
//        "Green" -> "Go"
//        "Yellow" -> "Slow down"
//        "Red" -> "Stop"
//        else -> "Malfunction"
//    }
//
//    println(trafficAction) // Stop
// }
//------------------when 多条件合并---------------
// fun main() {
//     val month = 5
//     when (month) {
//         1, 2, 3 -> println("第一季度")
//         4, 5, 6 -> println("第二季度")
//         7, 8, 9 -> println("第三季度")
//         10, 11, 12 -> println("第四季度")
//     }
// }
//-----------------范围匹配---------------
// fun main() {
//     val score = 85
//     when (score) {
//         in 90..100 -> println("优秀")
//         in 60..89  -> println("及格")
//         else -> println("不及格")
//     }
// }
//---------------范围表达式-------------------
/*
范围表达式用于表示一个连续的值区间。常用的范围表达式有：
1. .. 表示闭区间，包含两个端点
2. ..< 表示半开区间，包含左端点，不包含右端点
3. downTo 表示降序区间，包含两个端点
4. step 表示步长，用于指定区间内元素之间的间隔
5. until 表示半开区间，包含左端点，不包含右端点
例如：
1. 1..5 表示闭区间[1,5]也就是1，2，3，4，5，
2. 1..<5 表示半开区间[1,5)也就是1，2，3，4，
3. 1 until 5 表示半开区间[1,5)也就是1，2，3，4，
4. 4 downTo 1 表示闭区间[4,1]也就是4，3，2，1，
5. 1..5 step 2 表示闭区间[1,5]也就是1，3，5。

范围不仅支持数字，也支持字符，例如：
1. 'a'..'z' 表示闭区间[a,z]也就是a，b，c，...，z，
2. 'a'..<z' 表示半开区间[a,z)也就是a，b，c，...，y，
3. 'z' downTo 'a' 表示闭区间[z,a]也就是z，y，x，...，a，
4. 'a'..'z' step 2 表示闭区间[a,z]也就是a，c，e，...，z。

检查是否在范围内 in，如：
```kotlin
val x = 3
println(x in 1..5)
```
*/
// fun main() {
//     println((1..5))
//     println(1..<5)
//     println(4 downTo 1)
//     println(1..5 step 2)
//     println('a'..'z')
//     println('a'..'z' step 2)
//     println('z' downTo 'a')
//     println('a' in 'a'..'z')
// }
//---------------for...in 循环-------------------
/*
Kotlin 没有传统的三段式 for 循环(for(var i=0; i<5; i++))，而是使用 for...in 循环来遍历集合或区间。

for...in 循环的作用：依次取出一个集合/区间中的每个元素，逐一处理。

for...in 循环的语法：
for (变量 in 集合/区间) {
    // 循环体
    // 每次循环，变量 = 集合中的下一个元素
}
*/
// fun main() {
//     for (number in 1..5) {
//         println(number)
//     }
// }
//-------------for...in/forEach 遍历集合----------------
fun main() {
    // List集合
    val cakes1 = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes1) {
        println("Yummy, it's a $cake cake!")
    }
    // Set集合
    val cakes2 = setOf("carrot", "cheese", "chocolate")

    for (cake in cakes2) {
        println("Yummy, it's a $cake cake!")
    }

    // Map集合
    val cakes3 = mapOf("carrot" to "carrot cake", "cheese" to "cheese cake", "chocolate" to "chocolate cake")

    for ((key, value) in cakes3) {
        println("Yummy, it's a $value! The key is $key")
    }
/*
forEach 是 Kotlin 集合的一个扩展函数，作用和 for...in 类似，但写法更简洁，属于函数式风格。

forEach 的语法：
集合.forEach { 元素 ->
    // 处理每个元素
}
*/
    // 使用forEach遍历List集合
    println("-------------forEach-----------------")
    cakes1.forEach { cake ->
        println("Yummy, it's a $cake cake!")
    }
    // 使用forEach遍历Set集合
    cakes2.forEach { cake ->
        println("Yummy, it's a $cake cake!")
    }
    // 使用forEach遍历Map集合
    cakes3.forEach { (key, value) ->
        println("Yummy, it's a $value! The key is $key")
    }

    println("-------------forEach简写-----------------")
    // it 默认代表当前元素
    cakes1.forEach {
        println("Yummy, it's a $it cake!")
    }
    // forEach简写
    cakes2.forEach {
        println("Yummy, it's a $it cake!")
    }
    // forEach简写
    cakes3.forEach {
        println("Yummy, it's a ${it.value}! The key is ${it.key}")
    }
}
//--------------while-----------
// fun main() {
//    var cakesEaten = 0
//    while (cakesEaten < 3) {
//        println("Eat a cake")
//        cakesEaten++
//    }
// }

//-----------do...while---------
// fun main() {
//    var cakesBaked = 0
//
//    do {
//        println("Bake a cake")
//        cakesBaked++
//    } while (cakesBaked < 3)
// }




