package com.module;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends javax.servlet.http.HttpServlet {

  protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    float firstOperand = getOperator(request, "first_operand");
    float secondOperand = getOperator(request, "second_operand");
    char operator = getOperand(request);

    showCalculate(response, firstOperand, secondOperand, operator);

  }

  private void showCalculate(HttpServletResponse response, float firstOperand, float secondOperand, char operator) throws IOException {
    PrintWriter writer = response.getWriter();
    writer.println("<h1>Result : </h1>");
    try {
      float result = Calculation.calculation(firstOperand, secondOperand, operator);
      writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
    } catch (Exception e) {
      //in ra thong bao loi
      writer.println("Error: " + e.getMessage());
    }
  }

  private char getOperand(HttpServletRequest request) {
    return request.getParameter("operand").charAt(0);
  }

  private float getOperator(HttpServletRequest request, String first_operand) {
    return Float.parseFloat((request.getParameter(first_operand)));
  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

  }
}
