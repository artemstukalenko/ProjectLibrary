<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<body>

<form:form action="en" modelAttribute="locale">

    <input type="submit" value="EN"/>

</form:form>

<br><br>

<form:form action="ua" modelAttribute="locale">

    <input type="submit" value="UA"/>

</form:form>

<br><br><br><br>

<br><br><br>

    <h3>${locale.howToLogin}</h3>

    <form:form action="asUser" modelAttribute="locale">

        <input type="submit" value=${locale.loginAsUser} style="width:200px;"/>

    </form:form>

    <br><br><br>

    <form:form action="asAdmin" modelAttribute="locale">

        <input type="submit" value=${locale.loginAsAdmin} style="width:200px;"/>

    </form:form>

</body>

</html>