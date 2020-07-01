// BuildingMaps/ImmutableBlendMap.kt
package buildmaps

class BlendMap {
  @ExperimentalStdlibApi
  val map: Map<Pair<Color, Color>, Color> =
    buildMap {
      for (a in Color.values()) {
        for (b in Color.values()) {
          this[a to b] = buildmaps.blend(a, b)
        }
      }
    }
  @ExperimentalStdlibApi
  fun blend(a: Color, b: Color): Color =
    map.getOrDefault(a to b, Color.Brown)
}

@ExperimentalStdlibApi
fun main() {
  colorBlendTest(BlendMap()::blend)
}
