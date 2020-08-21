// Composition/Embedding.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package composition

class Features {
  fun f1() = "feature1"
  fun f2() = "feature2"
}

class Form {
  private val features = Features()
  fun operation1() =
    features.f2() + features.f1()
  fun operation2() =
    features.f1() + features.f2()
}
