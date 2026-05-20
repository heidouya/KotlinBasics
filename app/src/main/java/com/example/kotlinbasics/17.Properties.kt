package com.example.kotlinbasics

//----------------------幕后字段---------------
/*
在Kotlin中，属性访问器默认会自动生成一个幕后字段（backing field），并使用field关键字来引用它。

当我们自定义属性访问器时，可以使用field关键字来访问这个幕后字段。
*/
// fun main() {
//     val user = User()
//     user.name = "李四"
//     println(user.name)
// }
// class User {
//     var name: String = "张三"
//         set(value) {
//             println("设置name属性，新值为：$value，旧值为：$field")
//             field = value
//         }
//         get() {
//             println("获取name属性")
//             return field
//         }
// }
// ------------------------扩展属性---------------
/*
在Kotlin中，属性可以定义在类的外部，这种属性被称为扩展属性（extension properties）。

扩展属性允许我们在不修改类定义的情况下，为类添加新的属性。

扩展属性没有幕后字段，因此不能在扩展属性中使用field关键字。需要自己编写get()和set()函数来访问属性值。

扩展属性不能覆盖类的现有成员属性，扩展会被现有成员属性被遮蔽。
*/
// fun main() {
//     val person = Person("张", "三")
//
//     println(person.fullName) // 张 三
//
//     person.fullName = "李 四"
//     println(person.fullName) // 李 四
//     println(person.firstName) // 李
//     println(person.lastName) // 四
// }
//
// data class Person(var firstName: String, var lastName: String)
// var Person.fullName: String
//     get() = "$firstName $lastName"
//     set(value) {
//         this.firstName = value.split(" ")[0]
//         this.lastName = value.split(" ")[1]
//     }

//----------------------代理属性------------------------
/*
代理属性是将属性的 getter/setter 逻辑委托给另一个对象，由代理对象负责属性的读写行为。

基本语法：属性 by 代理对象
val prop: Type by Delegate()
by 关键字表示将属性的访问委托给后面的对象。

代理对象必须实现一个接口，该接口包含getValue和setValue函数。getValue函数用于获取属性值，setValue函数用于设置属性值。这两个函数都必须是operator函数。
1. operator fun getValue(thisRef: Any?, property: KProperty<*>): String {}
2. operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {}

thisRef：指代包含委托属性的对象（如 person.name 中的 person）
property：指代被访问或修改的属性（如 person.name 中的 name）
*/
// class CachedStringDelegate {
//     var cachedValue: String? = null
//
//     operator fun getValue(thisRef: User, property: Any?): String {
//         if (cachedValue == null) {
//             cachedValue = "${thisRef.firstName} ${thisRef.lastName}"
//             println("Computed and cached: $cachedValue")
//         } else {
//             println("Accessed from cache: $cachedValue")
//         }
//         return cachedValue ?: "Unknown"
//     }
// }
//
// class User(val firstName: String, val lastName: String) {
//     val displayName: String by CachedStringDelegate()
// }
//
// fun main() {
//     val user = User("John", "Doe")
//
//     println(user.displayName) // John Doe
//
//     println(user.displayName) // John Doe
// }
//------------------------------lazy属性委托--------------------
/*
在Kotlin中，lazy属性委托（lazy property delegate）是一种标准代理属性，它用于延迟初始化属性，即只有在第一次访问属性时才进行初始化。

lazy属性委托通过lazy函数来实现，该函数返回一个代理对象，该对象在第一次访问属性时才进行初始化。lazy属性委托通常用于延迟初始化昂贵的计算或资源。
*/

fun main() {
    fetchData()
    fetchData()
}

class Database {
    fun connect() {
        println("Connecting to the database...")
    }

    fun query(sql: String): List<String> {
        return listOf("Data1", "Data2", "Data3")
    }
}

val databaseConnection: Database by lazy {
    val db = Database()
    db.connect()
    db
}

fun fetchData() {
    val data = databaseConnection.query("SELECT * FROM data")
    println("Data: $data")
}
