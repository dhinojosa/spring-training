<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    Creating an artist
</head>
<body>
<div>
    <h2>Create an Artist</h2>
    <sf:form method="POST" modelAttribute="artist">
        <fieldset>
            <table cellspacing="0">
                <tr>
                    <th><label for="artist_firstName">First Name:</label></th>
                    <td><sf:input path="firstName" size="15" id="artist_firstName"/> <sf:errors path="firstName"/></td>
                </tr>
                <tr>
                    <th><label for="artist_lastName">Last Name:</label></th>
                    <td><sf:input path="lastName" size="15" id="artist_lastName"/> <sf:errors path="lastName"/></td>
                </tr>
            </table>
            <input type="submit" name="Operation" value="Insert">
        </fieldset>
    </sf:form>
</div>
</body>
</html>
