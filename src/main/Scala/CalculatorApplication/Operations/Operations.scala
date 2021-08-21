package CalculatorApplication.Operations
import CalculatorApplication.Calculator

class Operations {

    val result = 0

    def addition(Input1:Double, Input2:Double): Double = Input1 + Input2

    def subtraction(Input1:Double, Input2:Double): Double = Input1 - Input2

    def multiplication(Input1:Double, Input2:Double): Double = Input1 * Input2

    def division(Input1:Double, Input2:Double):Double= Input1 / Input2

    def power(Input1:Double, Input2:Double): Double = scala.math.pow(Input1,Input2)

    def absolute(Input1:Double): Double = Input1.abs

    def modulus(Input1:Double, Input2:Double):Double= {
      if(Input2==0){
        result
      }
      else{
        Input1 % Input2
      }
    }

    def maximum(Input1:Double, Input2:Double):Double= {
      if (Input1 > Input2) {
        Input1
      } else{
        Input2
      }
    }

    def minimum(Input1:Double, Input2:Double):Double= {
      if (Input1 < Input2) {
        Input1
      } else{
        Input2
      }
    }
}
