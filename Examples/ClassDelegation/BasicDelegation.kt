// ClassDelegation/BasicDelegation.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package classdelegation

interface AI
class A : AI

class B(val a: A) : AI by a
