// operators/Molecule.scala

class Molecule {
  var attached:Molecule = _
  def plus(other:Molecule) =
    attached = other
  def +(other:Molecule) =
    attached = other
}

var m1 = new Molecule
var m2 = new Molecule
m1.plus(m2)
m1.+(m2)
// Infix calls:
m1 plus m2
m1 + m2
