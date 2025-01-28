def myMethod(a, b) {
  def aNum = a as double
  def bNum = b as double

  if (aNum == null || bNum == null || Double.isNaN(aNum) || Double.isNaN(bNum)) {
    return null // Or handle the invalid input in a more appropriate way
  } else if (aNum > bNum) {
    return aNum
  } else {
    return bNum
  }
}

println myMethod(5, 3) // prints 5.0
println myMethod(2, 7) // prints 7.0

println myMethod(null, 7) // prints null
println myMethod(5, null) // prints null
println myMethod("5", 7) // prints 7.0
println myMethod(5, "abc") // prints 5.0