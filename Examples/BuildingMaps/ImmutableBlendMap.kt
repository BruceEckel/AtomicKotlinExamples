// BuildingMaps/ImmutableBlendMap.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
@file:OptIn(ExperimentalStdlibApi::class)
package buildingmaps

class BlendMap {
  val map: Map<Pair<Color, Color>, Color> =
    buildMap {
      for (a in Color.values()) {
        for (b in Color.values()) {
          this[a to b] =
            buildingmaps.blend(a, b)
        }
      }
    }
  fun blend(a: Color, b: Color): Color =
    map.getOrDefault(a to b, Color.Brown)
}

fun main() {
  colorBlendTest(BlendMap()::blend)
}
