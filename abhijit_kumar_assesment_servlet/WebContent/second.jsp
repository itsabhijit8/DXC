<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<form action="Q3retrieveController">

<body>
Question Id : ${qid2};

Question: </br>
${question2};</br>
<input type="radio" name="answer2" value="yes"> Yes </br>
<input type="radio" name="answer2" value="no"> No </br>
</br>

</br>

<input type="submit" value="Next">
</form>
<form action="first.jsp">
 <input type="submit" value="Back"> 
 </form>
 </body>
</html>