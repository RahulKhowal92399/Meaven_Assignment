package CalculatorApplication.Calculator

import CalculatorApplication.Operations.Operations

object Calculator extends App {

  val calculator = new Operations()


      println("Addition of Inputs: "+calculator.addition(10.2,10.3))
      println("Subtraction of Inputs: "+calculator.subtraction(10,10))
      println("Multiple of Inputs: " + calculator.multiplication(10,10))
      println("Division of Inputs: " + calculator.division(10,10))
      println("Power of Inputs: " + calculator.power(10,10))
      println("Absolute of Inputs: " + calculator.absolute(10))
      println("Modulus of Inputs: " + calculator.modulus(10,10))
      println("Maximum of Inputs: " + calculator.maximum(11,10))
      println("Minimum of Inputs: " + calculator.minimum(10,11))

  }
