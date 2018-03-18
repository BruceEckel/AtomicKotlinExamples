// FunctionReferences/MemberReference.kt
import atomictest.eq

class ClassScope {
  fun memberFunc() = "memberFunc"
}

fun main(args: Array<String>) {
  val cs = ClassScope()
  val mf = cs::memberFunc
  mf() eq "memberFunc"
}
