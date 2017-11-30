// Logging/BasicLogging.kt
package logging

private val log = mu.KLogging().logger

fun main(args: Array<String>) {
  val msg = "Hello, Kotlin Logging!"
  log.trace(msg)
  log.debug(msg)
  log.info(msg)
  log.warn(msg)
  log.error(msg)
}
