package com.module;

import static com.module.Constant.*;

public class Calculation {

  public static float calculation(float firstOperand, float secondOperand, char operator) {
    switch (operator) {
      case SUM:
        float sum = firstOperand + secondOperand;
        return sum;
      case SUB:
        float sub = firstOperand - secondOperand;
        return sub;
      case MUL:
        float mul = firstOperand * secondOperand;k
        return mul;
      case DIV:
        float div = firstOperand / secondOperand;
        if (secondOperand != 0)
          return div;
        else
          //bat ngoai le tra ve thong bao
          throw new RuntimeException("Can't divide by zero");
      default:
        //bat ngoai le tra ve thong bao
        throw new RuntimeException("Invalid operation");
    }
  }
}
