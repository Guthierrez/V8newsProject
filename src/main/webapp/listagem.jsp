<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
 		<title>Listagem de Notícias</title>
 		<meta charset="utf-8">
	</head>
	<body>
		<table border="2px"  style="padding:0px;">
			<tr>
				<th>Nome</th>		
				<th>Data</th>
				<th>Categoria</th>
				<th>Editar</th>
				<th>Excluir</th>
			</tr>
		<c:forEach items="${noticias}" var="noticia" begin="0" end="10" >
			<tr>
				<td>${noticia.nome}</td>		
				<td>${noticia.data}</td>
				<td>${noticia.categoria}</td>
				<td><a href="EditarNoticia?ID=${noticia.id}">Editar</a></td>
				<td><a href="ExcluirNoticia?ID=${noticia.id}">Excluir</a></td>
			</tr>
 		</c:forEach>
 		</table>
	</body>
</html>