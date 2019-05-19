<%--
  Created by IntelliJ IDEA.
  User: ko
  Date: 19/05/2019
  Time: 08:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form method="post" action="/calculate">
  <div class="contain">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>
            First Operand:
          </td>
          <td>
            <input type="text" name="first_operand" placeholder="First Operand">
          </td>
        </tr>
        <tr>
          <td>
            Operand:
          </td>
          <td>
            <select name="operand">
              <option value="+">Summation</option>
              <option value="-">Subtraction</option>
              <option value="*">Multiplication</option>
              <option value="/">Division</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            Second Operand:
          </td>
          <td>
            <input type="text" name="second_operand" placeholder="Second Operand">
          </td>
        </tr>
        <tr>
          <td></td>
          <td>
            <input type="submit" value="Calculate">
          </td>
        </tr>
      </table>
    </fieldset>
  </div>
</form>
</body>
</html>
