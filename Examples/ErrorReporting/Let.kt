// ErrorReporting/Let.kt
import atomictest.*

fun getURL(url: String) = url
fun process(url: String) = url
fun storeURL(url: String) = url

fun processURL(url: String?): String {
  return url?.let {
    getURL(it)
    process(it)
    storeURL(it)
  } ?:
    throw IllegalArgumentException("url")
}

fun main(args: Array<String>) {
  stacktrace1 {
    processURL(null)
  } eq "IllegalArgumentException: url"
  processURL("url") eq "url"
}
