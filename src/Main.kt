package main

import java.util.*

fun solution(arr: Array<Int>): Array<Int> {
    // Create a new array to store the result
    val result = Array(arr.size) { 0 }
    var index = 0

    // Loop through each element in the input array
    for (value in arr) {
        // If the element is non-zero, add it to the result array
        if (value != 0) {
            result[index] = value
            index++
        }
    }

    // The remaining positions in result array are already 0, so we don't need to modify them

    return result
}

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter the number of elements in the array:")
    val n = reader.nextInt()

    println("Enter the elements of the array:")
    val arr = Array(n) { reader.nextInt() }

    // Call the solution function and get the result
    val resultArr = solution(arr)

    // Print the resulting array
    println("Array after moving zero values to the end: ${resultArr.joinToString(", ")}")
}
