# KotlinBasics 🚀

> 一个循序渐进的 Kotlin 语法学习项目，通过简洁的示例代码掌握 Kotlin 核心知识。

## 📖 项目简介

KotlinBasics 是一个面向初学者的 Kotlin 语法学习开源项目。每个知识点对应一个独立的 Kotlin 文件，代码精炼、注释清晰，适合零基础入门或快速复习。项目基于 Android 工程搭建，使用 Gradle Kotlin DSL 与 Version Catalog 进行依赖管理，也可直接在 Android Studio 中运行和调试。

## 📂 内容目录

| 序号 | 主题 | 文件 | 核心内容 |
|:---:|------|------|----------|
| 01 | Hello World | `1.Hello.kt` | 程序入口、`main` 函数 |
| 02 | 变量 | `2.Variables﻿.kt` | `val` 与 `var`、只读变量与可变变量 |
| 03 | 字符串模板 | `3.StringTemplates.kt` | 字符串插值 `$`、`${}` 表达式 |
| 04 | 基本类型 | `4.BasicTypes.kt` | Int、Long、Float、Double、Boolean、Char |
| 05 | 类型推断 | `5.TypeInference.kt` | 编译器自动推导类型 |
| 06 | 集合 | `6.Collections.kt` | List、Set、Map 及只读与可变集合 |
| 07 | 控制流 | `7.ControlFlow.kt` | `if`/`when`/`for`/`while` 表达式 |
| 08 | 函数 | `8.Functions.kt` | 函数声明、默认参数、命名参数、单表达式函数 |
| 09 | 类 | `9.Classes.kt` | 类定义、构造函数、`init` 块 |
| 10 | 空安全 | `10.NullSafety.kt` | 可空类型 `?`、`?.`、`!!`、Elvis 运算符 |
| 11 | 扩展函数 | `11.ExtensionFunctions.kt` | 为已有类添加新方法 |
| 11 | 作用域函数 | `11.ScopeFunctions.kt` | `let`、`run`、`with`、`apply`、`also` |
| 12 | 带接收者的 Lambda | `12.LambdaExpressionsWithReceiver.kt` | Lambda 接收者、DSL 风格构建 |
| 14 | 接口 | `14.Interfaces.kt` | 接口定义、默认实现、多接口实现 |
| 15 | 对象 | `15.Objects.kt` | `object` 单例、伴生对象、对象表达式 |
| 16 | Open 与特殊类 | `16.OpenAndSpecialClasses.kt` | `open` 修饰符、`data`/`enum`/`sealed`/`inner` 类 |
| 17 | 属性 | `17.Properties.kt` | 幕后字段 `field`、自定义 Getter/Setter、委托属性 |

## 🛠️ 项目技术栈

- **语言**: Kotlin
- **构建工具**: Gradle (Kotlin DSL)
- **依赖管理**: Gradle Version Catalog (`libs.versions.toml`)
- **IDE**: Android Studio

## 🚀 快速开始

### 环境要求

- JDK 17+
- Android Studio Hedgehog | 2023.1.1 或更高版本
- Android SDK（API 34+）

### 运行方式

1. **克隆项目**
    ```bash
    git clone https://github.com/heidouya/KotlinBasics.git
    ```
2. **用 Android Studio 打开项目**

   选择 `File → Open → KotlinBasics`

3. **浏览与运行**

   在 `app/src/main/java/com/example/kotlinbasics/` 目录下找到对应的 `.kt` 文件，直接运行 `main` 函数即可查看输出。

> 💡 提示：部分文件包含 `main` 函数，可在 IDE 中直接点击运行；如需在 Android 设备上运行，可直接构建并安装 APK。

## 📚 学习路线建议
```text
基础语法
├── 01 Hello World
├── 02 变量
├── 03 字符串模板
├── 04 基本类型
├── 05 类型推断

控制与组织
├── 07 控制流
├── 08 函数
├── 06 集合

面向对象
├── 09 类
├── 14 接口
├── 15 对象
├── 16 Open 与特殊类
├── 17 属性

Kotlin 特色
├── 10 空安全
├── 11 扩展函数
├── 11 作用域函数
├── 12 带接收者的 Lambda
```
## 🤝 参与贡献

欢迎所有形式的贡献！

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/new-topic`)
3. 提交更改 (`git commit -m 'Add: 新增 XXX 知识点'`)
4. 推送分支 (`git push origin feature/new-topic`)
5. 发起 Pull Request

### 贡献方向

- ✏️ 修正现有代码中的错误或改进注释
- 📝 新增 Kotlin 知识点（如：协程、委托、泛型等）
- 🌍 完善文档（中英文双语支持）

## 📄 许可证

本项目基于 [MIT License](LICENSE) 开源。

---

⭐ 如果这个项目对你有帮助，欢迎 Star 支持！