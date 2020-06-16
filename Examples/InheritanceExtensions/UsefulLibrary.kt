// InheritanceExtensions/UsefulLibrary.kt
package usefullibrary

interface LibType {
  fun f1()
  fun f2()
}

fun utility1(lt: LibType) {
  lt.f1()
  lt.f2()
}

fun utility2(lt: LibType) {
  lt.f2()
  lt.f1()
}
