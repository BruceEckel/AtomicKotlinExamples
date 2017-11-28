// Logging/BasicLogging.kt
package logging

private val log = mu.KLogging().logger

fun main(args: Array<String>) {
  log.info("Hello, Kotlin Logging!")
}
