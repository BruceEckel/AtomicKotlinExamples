// ErrorReporting/LetNotNull.kt
import atomictest.*

fun getURL(url: String) = url
fun process(url: String) = url
fun storeURL(url: String) = url

fun processURL(url: String?): String =
  url?.let {
    getURL(it)
    process(it)
    storeURL(it)
  } ?: throw IllegalArgumentException("url")

fun main() {
  capture {
    processURL(null)
  } eq "IllegalArgumentException: url"
  processURL("url") eq "url"
}
