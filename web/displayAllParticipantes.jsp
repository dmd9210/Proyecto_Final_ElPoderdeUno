<!--  import packages and classes needed by scripts -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       

<!DOCTYPE HTML> 
<html>
    <head>
        <title>Lista Participantes</title>
        <style type = "text/css">
            body {     
                font-family: tahoma, helvetica, arial, sans-serif; 
            }
            table, tr, td, th { 
                text-align: center;
                font-size: .9em;
                border: 3px groove;
                padding: 5px;
                background-color: #dddddd;
            }
            p {
                font-size: 2em;
            }

        </style>
    </head>

    <%-- UserDao in dataAccess to obtain list --%>
    <body> 

        <p>Lista Participantes</p>

        <table>
            <thead>
                <tr>
                    <th style="width:100px;">Id Matricula</th>
                    <th style = "width: 100px;">Nombre</th>
                    <th style = "width: 200px;">Apellido Paterno</th>
                    <th style = "width: 200px;">Apellido Materno</th>
                    <th style = "width: 100px;">Correo</th>
                    <th style = "width:100px;">Edad</th>
                    <th style = "width:100px;">Genero</th>
                    <th style = "width: 300px;">Teléfono</th>
                    <th style = "width:100px;">Nivel de Estudio</th>
                </tr>
            </thead>

            <tbody>                                                                          
                <c:forEach var="participanteElement" items="${participanteList}" >                                      
                    <tr>
                        <td>${participanteElement.idMatricula}</td>
                        <td>${participanteElement.Nombre}</td>    
                        <td>${participanteElement.ApellidoP}</td>  
                        <td>${participanteElement.ApellidoM}</td>
                        <td>${participanteElement.Correo}</td>
                        <td>${participanteElement.Edad}</td>
                        <td>${participanteElement.Genero}</td>
                        <td>${participanteElement.Telefono}</td>
                        <td>${participanteElement.NivelEstudio}</td>
                        <td><li><a href=""> Actualizar Participantes</a></li></td>
        </tr>
    </c:forEach>  
</tbody>
</table>
<h4>
    <a href="index.jsp">Return to Main page</a>
</h4>

</body>    
</html>