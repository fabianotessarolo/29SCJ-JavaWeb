<jsp:useBean id="usuario" scope="session" class="br.com.fiap.javanaweb.aula2.PopulaBean">
</jsp:useBean>

<header>
Este é o Header.

Primeiro Acesso: <jsp:getProperty property="primeiroAcesso" name="usuario"/>
<br>
Ultimo Acesso: ${usuario.ultimoAcesso}

<%=session.hashCode() %>

</header>