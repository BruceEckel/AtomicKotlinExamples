// KotlinCollections/CollectionDeclarations.kt
// TODO replace with picture?

interface Collection<E>
interface List<E> : Collection<E>
interface Set<E> : Collection<E>
interface Map<K, V>

interface MutableCollection<E>
interface MutableList<E> : List<E>, MutableCollection<E>
interface MutableSet<E> : Set<E>, MutableCollection<E>
interface MutableMap<K, V> : Map<K, V>
