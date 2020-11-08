﻿﻿<%-- 
    Document   : MostraEventoCadastrado
    Created on : Oct 6, 2020, 8:55:50 AM
    Author     : RAF
--%>

﻿﻿<%-- 
    Document   : MostraCadastrado.jsp
    Created on : 28/09/2020, 17:33:36
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-16BE"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos - Página de Confirmação de Cadastro</title>
    </head>
    <body>
        <h1>O seguinte evento foi cadastrado:</h1>        
        <p>Id: <%= request.getAttribute("id") %></p>
        <p>Nome: <%= request.getParameter("nomeev") %></p>
        <p>Sigla: <%= request.getParameter("siglaev") %></p>
        <p>Area: <%= request.getParameter("areaev") %></p>
        <p>Instituição: <%= request.getParameter("instev") %></p></br>
        <p><a href="http://localhost:8080/Tarefa2/CreateEvent.html">Cadastrar outro</a></p>
        <p><a href="http://localhost:8080/Tarefa2/index.html">Voltar ao Início</a></p>
    </body>
</html>
