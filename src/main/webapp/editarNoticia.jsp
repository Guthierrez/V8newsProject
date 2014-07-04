<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="css/adminStyle.css">
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
		
		
		<nav>
			<ul id="menuTopo">
				<li><a href="Inicio"><b class="home">Início</b></a></li>
				<li><a href="Ver?categoria=Noticia"><b class="noticias">Notícias</b></a></li>
				<li><a href="Ver?categoria=Esporte"><b class="esportes">Esportes</b></a></li>
				<li><a href="Ver?categoria=Tecnologia"><b class="tecnologia">Tecnologia</b></a></li>
				<li><a href="Ver?categoria=Variedades"><b class="variedades">Variedades</b></a></li>
			</ul>
		</nav>
		
		<section>
		
		<h1>Editar Notícia</h1>
		
		<form action="EditarNoticia" method="post">
			<div hidden><label for="IDD">Noticia</label>
				<input type="text" value="${noticia.id}" name="IDD" readonly="readonly"></div><br />
			<label for="nome">Nome:</label>
				<input type="text" name="nome" required="required" value="${noticia.nome}"><br />
			<label for="resumo">Resumo:</label>
				<input type="text" name="resumo" required="required" value="${noticia.resumo}"><br />
			<label for="assunto">Assunto:</label>
				<input type="text" name="assunto" required="required" value="${noticia.assunto}"><br /> 	   
			<label for="fonte">Fonte:</label>
				<input type="text" name="fonte" required="required" value="${noticia.fonte}"><br />
			<label for="data">Data:</label>
				<input type="date" name="data" required="required" value="${noticia.data }"><br /><br>
			<textarea id="elm1" name="conteudo" style="width:100px;">${noticia.conteudo}</textarea><br />
			<input type="submit" class="enviar" value="Salvar">
		</form>
		
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