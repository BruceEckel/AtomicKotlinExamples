// baseClassInitialization/CallingNoArgConstructor.kt
open class Superclass1(val i: Int)
class Subclass1(i: Int) : Superclass1(i)

open class Superclass2
class Subclass2 : Superclass2()
