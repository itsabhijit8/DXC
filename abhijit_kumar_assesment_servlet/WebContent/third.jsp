<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<form action="result">
Question Id : ${qid3};

Question: </br>
${question3};</br>
<input type="radio" name="answer3" value="yes"> Yes </br>
<input type="radio" name="answer3" value="no"> No </br>
</br>

</br>

<input type="submit" value="Finish">
</form>
<form action="second.jsp">
 <input type="submit" value="Back"> 
 </form>
</body>
</html>