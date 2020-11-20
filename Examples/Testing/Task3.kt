// Testing/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package testingExercise3

import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = h / 2.0 * (x + y)

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  rectangleArea(2, 2) eq 4
  rectangleArea(5, 4) eq 20
  trapezoidArea(2, 2, 4) eq 8.0
  trapezoidArea(3, 4, 1) eq 3.5
}
