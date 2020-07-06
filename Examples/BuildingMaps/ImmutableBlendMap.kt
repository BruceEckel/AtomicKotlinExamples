// BuildingMaps/ImmutableBlendMap.kt
@file:OptIn(ExperimentalStdlibApi::class)
package buildmaps

class BlendMap {
  val map: Map<Pair<Color, Color>, Color> =
    buildMap {
      for (a in Color.values()) {
        for (b in Color.values()) {
          this[a to b] = buildmaps.blend(a, b)
        }
      }
    }
  fun blend(a: Color, b: Color): Color =
    map.getOrDefault(a to b, Color.Brown)
}

fun main() {
  colorBlendTest(BlendMap()::blend)
}
