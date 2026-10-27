package com.example.c13101a4

class Student(
    val name: String,
    val program: String,
    val isActive: Boolean
)

class User(
    val username: String,
    val isVerified: Boolean,
    val followers: Int
) {
    fun showProfile(){
        println("Username: $username")
        println("Followers: $followers")
        println("Verified user: $isVerified")
    }
}

class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun showBook(){
        println("Book Title: $title")
        println("Author: $author")
        println("Year Published: $year")
    }
}

class Employee(
    val name: String,
    val position: String,
    val salary: Int
) {
    fun employeeSummary(){
        println("Name: $name")
        println("Position: $position")
        println("Salary: $salary")
    }
}

fun main() {
    println("\n====== CHALLENGE 1 ======")
    val originalPrice = 99.99
    val discountPercentage = 15.0

    val finalPrice = calculateDiscount(originalPrice, discountPercentage)

    println("Original price: $originalPrice")
    println("Discount: $discountPercentage%")
    println("Final price: %.2f".format(finalPrice))

    println("\n====== LAMBDA FUNCTIONS ======")
    // Basic Lambda Example
    val sayHi = { println("Hi!") }
    sayHi()
    sayHi()

    // Lambda with Parameter Example
    val greet = { name:String -> println("Hello, $name") }
    greet("Jay")

    // Lambda that Returns a Value Example
    val multiply = { number1: Int, number2: Int -> number1 * number2}
    println(multiply(4,5))

    // Challenge 2 Session 4
    println("\n====== CHALLENGE 2 ======")
    val welcome = { println("Welcome") }
    welcome()

    val printCity = { city: String -> println("City: $city") }
    printCity("Pisgah")

    val addNumbers = { number1: Int, number2: Int -> number1 + number2 }
    val result = addNumbers(9,10)
    println("Total: $result")

    // Challenge 3 Session 4
    println("\n====== CHALLENGE 3 ======")
    val isEven = { number: Int -> number % 2 == 0}

    val result1 = isEven(2)
    val result2 = isEven(9)

    println("$result1, $result2")

    println("\n====== CLASSES AND OBJECTS ======")
    val student1 = Student( "Jay", "MDI2", true)

    println("Name: ${student1.name}")
    println("Program: ${student1.program}")
    println("Is an active student? ${student1.isActive}")

    println("\n====== CLASSES AND OBJECTS WITH FUNCTIONS======")
    val user1 = User("@jay.barrrrr", true, 1234)
    user1.showProfile()

    // Challenge 4 Session 4
    println("\n====== CHALLENGE 4 ======")
    val book1 = Book("Dracula", "Bram Stoker", 1897)
    book1.showBook()

    // Challenge 5 Session 4
    println("\n====== CHALLENGE 5 ======")
    val employee1 = Employee("Steve", "CEO", 1000000)
    val employee2 = Employee("Bob", "Manager", 100000)
    employee1.employeeSummary()
    employee2.employeeSummary()

    println("\n====== NULLABILITY ======")
    var middleName: String? = null
    println(middleName)

    var nickname: String? = null
    println(nickname?.length)

    val displayName = nickname ?: "No nickname"
    println(displayName)

    // Challenge 6 Session 4
    println("\n====== CHALLENGE 6 ======")
    val gpa: Double? = null
    // Safe Printing
    println("Middle name: ${middleName ?: "No middle name"}")
    println("GPA: ${gpa ?: "No GPA available"}")

    // Challenge 7 Session 4
    println("\n====== CHALLENGE 7 ======")
    val favoriteStreamingApp: String? = null
    println("${favoriteStreamingApp ?: "No streaming membership"}")

}

// Challenge 1 Session 4

fun calculateDiscount(price: Double, discount: Double): Double {
    val discountAmount = price * (discount / 100)
    val finalPrice = price - discountAmount

    return finalPrice
}
