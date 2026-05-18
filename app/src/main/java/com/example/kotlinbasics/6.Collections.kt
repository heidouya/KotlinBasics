package com.example.kotlinbasics
/*
集合：List、Set、Map
- List：有序的集合，可以包含重复元素
    - listOf()：创建只读列表，不能添加或删除元素
    - mutableListOf()：创建可变列表，可以添加或删除元素
    - first()：获取集合中的第一个元素
    - last()：获取集合中的最后一个元素
    - count()：获取集合中元素的个数
    - in：检查某个元素是否在集合中
    - contains()：检查某个元素是否在集合中
    - isEmpty()：检查集合是否为空
    - isNotEmpty()：检查集合是否不为空
    - size：获取集合中元素的个数

- Set：无序的集合，不能包含重复元素
    - setOf()：创建只读集合，不能添加或删除元素
    - mutableSetOf()：创建可变集合，可以添加或删除元素

- Map：键值对的集合，键是唯一的，值可以重复
    - mapOf()：创建只读映射，不能添加或删除元素
    - mutableMapOf()：创建可变映射，可以添加或删除元素
*/

//-----------------------List-----------------------
// fun main() {
//     // Read only list
//     // 可以存放不同数据类型
//     val readOnlyShapes = listOf("triangle", "square", "circle", 1,1, false)
//     println(readOnlyShapes)
//
//     // 使用索引访问
//     val res = readOnlyShapes[0]
//     println("The first item in the list is: $res")
//
//     // 获取第一个元素
//     val firstItem = readOnlyShapes.first()
//     // 获取最后一个元素
//     val lastItem = readOnlyShapes.last()
//     // 集合中元素数量 count() 支持条件过滤
//     val count = readOnlyShapes.count{it == 1}
//     val size = readOnlyShapes.size
//     // 某个元素是否存在集合中
//     val isExist = "circle" in readOnlyShapes
//
//     println("$firstItem $lastItem count=$count $isExist")
//
//     // Mutable list with explicit type declaration
//     val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
//
//     // 添加元素
//     shapes.add("pentagon")
//     // 移除指定元素
//     shapes.remove("pentagon")
//     // 修改元素
//     shapes[0] = "aaa"
//
//     println(shapes)
//     println(shapes.size)
//     println(shapes.count())
//     println(shapes.isEmpty())
//     println(shapes.isNotEmpty())
// }

//-----------------------Array-----------------------
// kotlin中的数组：固定不变，创建后不能增删
fun main() {
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // 修改元素
    arr[0] = 0

   //  报错，没有add方法
   // arr.add()
   // 报错 Index 5 out of bounds for length 5
   // arr[5] = 6;

    println(arr.size) // 输出数组的大小

    // 遍历数组
    for (i in arr) println(i)
    // 哈哈哈
    print("Array elements: ")
}