package com.example.kotlinbasics

//-------------------函数扩展-------------------
/*
函数扩展是 Kotlin 中的一种功能，允许你为一个已经存在的类添加新的功能，而不需要继承该类或使用设计模式。
函数扩展的语法是：fun receiverType.functionName(parameters): ReturnType { ... }
例如：
*/
// fun main() {
//     val str = "Hello, World!"
//     println(str.lastChar()) // 输出: d
// }
//
// fun String.lastChar(): Char {
//     return this[this.length - 1]
// }
// -------------------面向扩展的设计-------------
/*
面向扩展的设计是 Kotlin 中的一种设计思想，允许你为一个已经存在的类添加新的功能，而不需要继承该类或使用设计模式。
例如：
*/
// class HttpClient {
//     fun request(method: String, url: String, headers: Map<String, String>):String {
//         println("Requesting $method to $url with headers: $headers")
//         return "Response from $url"
//     }
// }
//
// fun HttpClient.get(url: String) = request("GET", url, emptyMap())
//
// fun main() {
//     val client = HttpClient()
//
//     val getResponseWithMember = client.request("GET", "https://example.com", emptyMap())
//     println("请求结果1：$getResponseWithMember")
//
//     val getResponseWithExtension = client.get("https://example.com")
//     println("请求结果2：$getResponseWithExtension")
// }