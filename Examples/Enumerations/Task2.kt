// Enumerations/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package enumerationsExercise2
import atomictest.eq
import enumerationsExercise2.Month.*
import enumerationsExercise2.Season.*

enum class Month {
  January, February, March, April,
  May, June, July, August,
  September, October, November, December
}

enum class Season {
  Winter, Spring, Summer, Autumn
}

fun Month.getAustralianSeason(): Season = when (this) {
  December, January, February -> Summer
  March, April, May -> Autumn
  June, July, August -> Winter
  September, October, November -> Spring
}

fun Month.getDays(leapYear: Boolean = false): Int = when (this) {
  January, March, May, July,
  August, October, December -> 31

  April, June, September, November -> 30

  February -> if (leapYear) 29 else 28
}

fun main() {
  January.getAustralianSeason() eq Summer
  May.getAustralianSeason() eq Autumn

  January.getDays() eq 31
  February.getDays(leapYear = false) eq 28
  February.getDays(leapYear = true) eq 29
}
