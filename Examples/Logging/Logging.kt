// Logging/Basic.kt
package logging
import mu.KLogging

private val log = mu.KLogging().logger

fun main(args: Array<String>) {
  log.info("Hello, Kotlin Logging!")
}
