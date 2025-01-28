def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // prints 5
println myMethod(2, 7) // prints 7

//The issue is that this code only works correctly if both parameters are numbers.
//If either parameter is null or not a number, it will cause an exception.
println myMethod(null, 7) // throws exception
println myMethod(5, null) // throws exception
println myMethod("5", 7) // throws exception