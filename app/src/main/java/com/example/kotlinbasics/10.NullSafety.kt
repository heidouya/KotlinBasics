package com.example.kotlinbasics
/*
空安全

Kotlin 中的空安全机制，避免空指针异常的发生。
1. 可空类型和非空类型
    - 可空类型：在类型后面加一个问号?，表示该类型可以是空的，即可以是null
    - 非空类型：在类型后面不加问号，表示该类型不能为空，即不能是null
2. 空安全调用
3. Elvis 运算符 ?: 用于提供默认值，当左边的表达式为 null 时，返回右边的值。
4. 空断言运算符 !!
5. 空条件运算符 ?.

is 检查对象是否具有该类型并返回一个布尔值。
!is 检查对象是否不具有该类型并返回一个布尔值。

as 进行类型转换，如果转换失败，则抛出 ClassCastException。
as? 进行类型转换，如果转换失败，则返回 null。
* */
//------------可空类型-------------
// fun main() {
//    var neverNull: String = "This can't be null"
//    // neverNull = null
//
//    var nullable: String? = "You can keep a null here"
//    nullable = null
//
//    fun strLength(notNull: String): Int {
//        return notNull.length
//    }
//
//    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error
// }
//---------------检查空值-------------------
//fun main() {
//    val nullString: String? = null
//    println(describeString(nullString)) // Empty or null string
//}
//fun describeString(maybeString: String?): String {
//    if (maybeString != null && maybeString.length > 0) {
//        return "String of length ${maybeString.length}"
//    } else {
//        return "Empty or null string"
//    }
//}
//-----------使用安全调用----------
//fun main() {
//    val nullString: String? = null
//    println(lengthString(nullString)) // null
//}
//
//fun lengthString(maybeString: String?): Int? = maybeString?.length
//----------使用Elvis操作符----------
//fun main() {
//    val nullString: String? = null
//    println(nullString?.length ?: 0) // 0
//}
//-----------------------is and !is----------
// fun main() {
//     // 使用 is 判断变量是否为某个类型
//     val any: Any = "This is a String"
//     if (any is String) {
//         println(any.length) // 16
//     }
//     // 使用 !is 判断变量是否不是某个类型
//     if (any !is String) {
//         println("any is not a String")
//     }
// }
//-------------------as and as?--------------------
// fun main() {
//     // 使用 as 进行类型转换，如果转换失败，则抛出 ClassCastException
//     val any: Any = "This is a String"
//     val string: String = any as String
//     println(string.length) // 16
//
//     // 使用 as? 进行类型转换，如果转换失败，则返回 null
//     val any2: Any = "This is a String"
//     val string2: String? = any2 as? String
//     println(string2?.length) // 16
// }
//-------------------空值与集合----------------------
// fun main() {
//     // 使用 filterNotNull() 过滤掉 null 值
//     val nullableList: List<String?> = listOf("apple", "banana", null, "cherry")
//     val nonNullList: List<String> = nullableList.filterNotNull()
//     println(nonNullList) // [apple, banana, cherry]
//
//     //------------------------------------------
//     // 使用 listOfNotNull() 过滤掉 null 值
//     val serverConfig = mapOf(
//         "appConfig.json" to "App Configuration",
//         "dbConfig.json" to "Database Configuration"
//     )
//
//     val requestedFile = "appConfig.json"
//     val configFiles = listOfNotNull(serverConfig[requestedFile])
//
//     println(configFiles)
//     //--------------------------------------------
//     val temperatures = listOf(15, 18, 21, 21, 19, 17, 16)
//
//     // maxOrNull() 找到集合中的最大值，如果集合为空，则返回 null
//     val maxTemperature = temperatures.maxOrNull()
//     println("Highest temperature recorded: ${maxTemperature ?: "No data"}") // Highest temperature recorded: 21
//
//     // minOrNull() 找到集合中的最小值，如果集合为空，则返回 null
//     val minTemperature = temperatures.minOrNull()
//     println("Lowest temperature recorded: ${minTemperature ?: "No data"}") // Lowest temperature recorded: 15
//
//     // singleOrNull() 找到集合中唯一的值，如果集合为空或包含多个值，则返回 null
//     val singleHotDay = temperatures.singleOrNull{ it == 30 }
//     println("Single hot day with 30 degrees: ${singleHotDay ?: "None"}") // Single hot day with 30 degrees: None
//
//     // maxOrNull、minOrNull、singleOrNull 不能用于包含 null 值的集合，否则会返回错误或不正确的结果。例如，对于包含 null 值的集合，maxOrNull 可能会返回 null 作为最大值，这显然是不正确的。因此，如果需要处理可能包含 null 值的集合，应该使用 filterNotNull() 或 listOfNotNull() 过滤掉 null 值，然后再使用 maxOrNull() 或 minOrNull()。
//
//     //------------------------------------
//     data class User(val name: String?, val age: Int?)
//
//     val users = listOf(
//         User(null, 25),
//         User("Alice", null),
//         User("Bob", 30)
//     )
//
//     // firstNotNullOfOrNull() 找到集合中第一个非 null 值，如果集合为空或所有元素都为 null，则返回 null
//     val firstNonNullName = users.firstNotNullOfOrNull { it.name }
//     println(firstNonNullName) // Alice
//
//     //----------------------------------------------
//     val itemPrices = listOf(20, 35, 15, 40, 10)
//     // reduceOrNull() 计算集合中所有元素的累积值，如果集合为空，则返回 null
//     val totalPrice = itemPrices.reduceOrNull { runningTotal, price -> runningTotal + price }
//     println("Total price of items in the cart: ${totalPrice ?: "No items"}") // Total price of items in the cart: 120
//
//     val emptyCart = listOf<Int>()
//     val emptyTotalPrice = emptyCart.reduceOrNull { runningTotal, price -> runningTotal + price }
//     println("Total price of items in the empty cart: ${emptyTotalPrice ?: "No items"}") // Total price of items in the empty cart: No items
// }
//-------------------提前返回与猫王运算符------------------
data class User(
    val id: Int,
    val name: String,
    val friends: List<Int>
)

fun getNumberOfFriends(users: Map<Int, User>, userId: Int): Int {
    val user = users[userId] ?: return -1
    return user.friends.size
}

fun main() {
    val user1 = User(1, "Alice", listOf(2, 3))
    val user2 = User(2, "Bob", listOf(1))
    val user3 = User(3, "Charlie", listOf(1))

    // Creates a map of users
    val users = mapOf(1 to user1, 2 to user2, 3 to user3)

    println(getNumberOfFriends(users, 1)) // 2
    println(getNumberOfFriends(users, 2)) // 1
    println(getNumberOfFriends(users, 4)) // -1
}