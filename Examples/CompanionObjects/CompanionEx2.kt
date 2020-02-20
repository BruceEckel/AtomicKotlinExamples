// CompanionObjects/CompanionEx2.kt
package companionobjectsex2
import atomictest.*

private val trace = Trace()

interface Service {
  fun method1()
  fun method2()
}

interface ServiceFactory {
  val service: Service
}

class Implementation1 private constructor() : Service {
  override fun method1() {
    trace("Implementation1 method1")
  }
  override fun method2() {
    trace("Implementation1 method2")
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
  override fun method1() {
    trace("Implementation2 method1")
  }
  override fun method2() {
    trace("Implementation2 method2")
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
  s.method1()
  s.method2()
}

fun main() {
  serviceConsumer(Implementation1.factory)
  // Implementations are interchangeable:
  serviceConsumer(Implementation2.factory)
}
