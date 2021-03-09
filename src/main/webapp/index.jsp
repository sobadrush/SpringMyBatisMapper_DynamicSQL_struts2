<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%> 
 
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta charset="UTF-8">
    <title>index.jsp</title>
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
      <h1>Index.jsp</h1><p/>
      <c:url value="/deptNS/getAll.gg"/><p/>
      <s:url value="/deptNS/getAll.gg"/><p/>
      <a href="<s:url value='/deptNS/getAll.gg'/>">查詢部門</a><p/>
  </body>
</html>
