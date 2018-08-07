<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@page pageEncoding="UTF-8"%>

<style>

table th:last-child {
     text-align: left;
}

table {
    width: 50% !important;
}

#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}

img {
    width: 70px !important;
}

</style>





<div class="wrapper">
			<div class="yCmsContentSlot">
  <div align="center">
        <table border="1" cellpadding="5" id="customers">
            <caption><h2>List of Employees</h2></caption>
            <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>joining Date</th>
            </tr>
            <c:forEach var="user" items="${pressList}">
                <tr>

                    <td><img class="media-object" src="${user.empImage.url}" /></td>
                    <td><a href="Employee/${user.code}">${user.code}</a></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.designation}" /></td>
                    <td><c:out value="${user.joiningDate}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div></div>














