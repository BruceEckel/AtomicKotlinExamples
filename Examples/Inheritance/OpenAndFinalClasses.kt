// Inheritance/OpenAndFinalClasses.kt
package inheritance

// This class can be inherited:
open class Parent

class Child : Parent()

// Child is not open, so this fails:
// class GrandChild: Child()

// This class can't be inherited:
final class Single

// The same as using 'final':
class AnotherSingle
