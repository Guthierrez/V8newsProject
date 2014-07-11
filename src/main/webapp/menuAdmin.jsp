<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
	<head>
		<link rel="stylesheet" type="text/css" href="css/adminStyle.css">
		<meta charset="utf-8">
		<script src="js/jquery-2.1.0.js"></script>
		<script src="js/jquery.cycle.all.js"></script>
		<script src="js/myScripts.js"></script>
		<meta charset="utf-8">
		<script type="text/javascript" src="js/tinymce/js/tinymce/tinymce.min.js"></script>
		<script>
			tinymce.init({
			    selector: "textarea#elm1",
			    theme: "modern",
			    width: 700,
			    height: 300,
			    plugins: [
			         "advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker",
			         "searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking",
			         "save table contextmenu directionality emoticons template paste textcolor"
			   ],
			   content_css: "css/content.css",
			   toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | l      ink image | print preview media fullpage | forecolor backcolor emoticons", 
			   style_formats: [
			        {title: 'Bold text', inline: 'b'},
			        {title: 'Red text', inline: 'span', styles: {color: '#ff0000'}},
			        {title: 'Red header', block: 'h1', styles: {color: '#ff0000'}},
			        {title: 'Example 1', inline: 'span', classes: 'example1'},
			        {title: 'Example 2', inline: 'span', classes: 'example2'},
			        {title: 'Table styles'},
			        {title: 'Table row 1', selector: 'tr', classes: 'tablerow1'}
			    ]
			 }); 
		</script>
	</head>
	<body>
		<header>
			<img alt="logo" class="logo" src="img/logos/logoPreto.png">
		</header>
		
		
		<%@ include file="../menu.jsp" %>
		
		<section>
			
			<div id="menu">
			<img alt="" src="img/logos/seta.png">
			<a href="#" class="cadastrar"id="cadastrar">Cadastrar nova notícia</a><br />
			<img alt="" src="img/logos/seta.png">
			<a href="#" class="listar" id="listar">Listar notícias</a>
			</div>
			
			<div id="listagem">
				<h1>Listagem</h1>
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
			</div>
			
			<div id="cadastro">
				<h1>Cadastro</h1>
				<form action="ImageUploader" method="post" enctype="multipart/form-data">
					<label for="nome">Nome:</label>
						<input type="text" name="nome" required="required"><br />
					<label for="resumo">Resumo:</label>
						<input type="text" name="resumo" required="required"><br />
					<label for="assunto">Assunto:</label>
						<input type="text" name="assunto"><br /> 	   
					<label for="fonte">Fonte:</label>
						<input type="text" name="fonte"><br />
					<label for="data">Data:</label>
						<input type="date" name="data"><br /><br>
					<label for="categoria">Categoria:</label>
						<input type="radio" name="categoria" class="categoria" value="Noticia">
						<label for="categoria">Noticia</label>
						<input type="radio" name="categoria" class="categoria" value="Esporte">
						<label for="categoria">Esporte</label>
						<input type="radio" name="categoria" class="categoria" value="Tecnologia">
						<label for="categoria">Tecnologia</label>
						<input type="radio" name="categoria" class="categoria" value="Variedades">
						<label for="categoria">Variedades</label><br /><br>
					<label for="img">Imagem:</label>
						<input type="file" name="img"><br /><br>
					<textarea id="elm1" name="conteudo" style="width:100px;"></textarea><br />
					<input type="submit" class="enviar" value="Enviar">
			 	</form>
			</div>
		</section>
		
		<footer>
			<div class="direitos">
				<img alt="" src="img/logos/rodapePreto.png">
				<div class="copy">© Copyright 2014</div>
				<div class="sobre">Sobre</div>
			</div>
		</footer>
	</body>
</html>
