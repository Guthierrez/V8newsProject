<html>
	<head>
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
		<form action="ImageUploader" method="post" enctype="multipart/form-data">
		Nome: <input type="text" name="nome" required="required"><br />
		Resumo: <input type="text" name="resumo" required="required"><br />
		Assunto: <input type="text" name="assunto"><br />
		Categoria: <input type="radio" name="categoria" value="noticia">Notícias
		      	   <input type="radio" name="categoria" value="esporte">Esportes
		      	   <input type="radio" name="categoria" value="tecnologia">Tecnologia
		      	   <input type="radio" name="categoria" value="variedades">Variedades
		<br>      	   
		Fonte: <input type="text" name="fonte"><br />
		Data: <input type="date" name="data"><br />
		Imagem: <input type="file" name="img"><br />
		<textarea id="elm1" name="conteudo" style="width:100px;"></textarea>
		<input type="submit" value="Enviar">
		</form>
	</body>
</html>