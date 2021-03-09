<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta charset="UTF-8">
    <title>部門查詢結果</title>
    <style>
		  <%--insert css here--%>
		  <%--@import url('');--%>
	</style>
	<script>
		  <%--insert JScript here--%>
		  <%--<script src=""></script>--%>
	</script>
  </head>
  <body>
      <table border="1">
      	 <tr><th>deptno</th><th>dname</th><th>loc</th></tr>
      	 <c:forEach var="deptVO" items="${deptList}">      	 
	      	 <tr>
	      	 	<td>${deptVO.deptNo}</td>
	      	 	<td>${deptVO.deptName}</td>
	      	 	<td>${deptVO.deptLoc}</td>
	      	 </tr>
      	 </c:forEach>
      </table>
  </body>
</html>
