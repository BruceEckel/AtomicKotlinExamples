// Logging/BasicLogging.kt
package logging
import mu.*

private val log = KLogging().logger

fun KLogger.report(msg: String) {
  this.trace(msg)
  this.debug(msg)
  this.info(msg)
  this.warn(msg)
  this.error(msg)
}

fun main() {
  log.report("Hello, Kotlin Logging!")
}
