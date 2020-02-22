// CompanionObjects/CompanionEx1.kt
package companionobjectex1
import atomictest.*

private val trace = Trace()

interface Service {
  fun function1()
  fun function2()
}

interface ServiceFactory {
  val service: Service
}

class Implementation1 private constructor() : Service {
  override fun function1() {
    trace("Implementation1 function1")
  }
  override fun function2() {
    trace("Implementation1 function2")
  }
  companion object {
    var factory: ServiceFactory = object : ServiceFactory {
      override val service: Service
        get() {
          return Implementation1()
        }
    }
  }
}

class Implementation2 private constructor() : Service {
  override fun function1() {
    trace("Implementation2 function1")
  }
  override fun function2() {
    trace("Implementation2 function2")
  }
  companion object {
    var factory: ServiceFactory = object : ServiceFactory {
      override val service: Service
        get() {
          return Implementation2()
        }
    }
  }
}

fun serviceConsumer(fact: ServiceFactory) {
  val s = fact.service
  s.function1()
  s.function2()
}

fun main() {
  serviceConsumer(Implementation1.factory)
  // Implementations are interchangeable:
  serviceConsumer(Implementation2.factory)
}
