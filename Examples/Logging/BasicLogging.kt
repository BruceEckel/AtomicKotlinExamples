// Logging/BasicLogging.kt
package logging
import mu.KLogging

private val log = KLogging().logger

fun main() {
  val msg = "Hello, Kotlin Logging!"
  log.trace(msg)
  log.debug(msg)
  log.info(msg)
  log.warn(msg)
  log.error(msg)
}
