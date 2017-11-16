

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Participa Registro</title>

        <style type="text/css">
            body  { background: "blue"}
            table {
                border-width:1; 
            }
            td {
                text-align:right;
            }
        </style>
    </head>
    <body>

        <jsp:include page="banner.jsp" flush="true"/>
        <h1>Participa Registro</h1>
       </p>
    <form action="participantes" method="get">
        <table>
            <tr>
                <td>Id Matricula</td>
                <td><input type="text" name="idMatricula" required="required"></td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="Nombre" required="required"></td>
            </tr>
            <tr>
                <td>Apellido Paterno:</td>
                <td><input type="text" name="ApellidoP" required></td>
            </tr>
            <tr>
                <td>Apellido Materno: </td>
                <td><input type="text" name="ApellidoM"></td>
            </tr>
            <tr>
                <td>Correo:</td>
                <td><input type="email" name="Correo"></td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td><input type="text" name="Edad"></td>
            </tr>
            <tr>
                <td>Genero:</td>
                        <td><select>
                                <option disabled selected> Seleccion su Genero</option>
                                <option>Masculino</option>
                                <option>Femenino</option>
                            </select></td>
            </tr>
        <tr>
                <td>Teléfono:</td>
                <td><input type="tel" name="Telefono"></td>
            </tr>
            <tr>
                 <td>Nivel de Estudios:</td>
                        <td><select>
                                <option disabled selected> Selecciona tu Nivel de Estudios</option>
                                <option>Bachillerato</option>
                                <option>Licenciatura</option>
                                <option>Maestría</option>
                                <option>Doctorado</option>
                            </select></td>
            </tr>
            <tr>
                <td></td>
                <td><br>
                    <input type="submit" value="Submit"></td>
            </tr>
        </table>
        <h4>
            <a href="index.html">Return to Main page</a>
        </h4>
    </form>
</body>
</html>
