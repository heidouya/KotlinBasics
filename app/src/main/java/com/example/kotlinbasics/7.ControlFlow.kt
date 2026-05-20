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
fun main() {
    val a = 1
    // 单分支
    if (a == 1) {
        print("a is one")
    }

    // 双分支
    if (a == 1) {
        print("a is one")
    } else {
        print("a is not one")
    }

    // 多分支
    if (a == 1) {
        print("a is one")
    } else if (a == 2) {
        print("a is two")
    } else {
        print("a is something else")
    }
}

