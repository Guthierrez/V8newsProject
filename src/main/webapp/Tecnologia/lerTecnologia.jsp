<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
	<head>
		<link rel="stylesheet" type="text/css" href="Tecnologia/css/tecnologia.css">
		<meta charset="utf-8">
		<script src="js/jquery-2.1.0.js"></script>
		<script src="js/jquery.cycle.all.js"></script>
		<script src="js/myScripts.js"></script>
	</head>
	<body>
	<div id="fb-root"></div>
		<script>(function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.0";
		  fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));</script>
		<header>
			<img alt="logo" class="logo" src="img/logos/logoAzul.png">
			<div class="barraBuscar">Buscar: <input type="text"></div>
		</header>
		
		
		<%@ include file="../menu.jsp" %>
			
		
		<section>
			<article>
				<h2>${noticia.nome}</h2>
				<h3>${noticia.resumo}</h3>
				<h6>${noticia.data}           ${noticia.fonte}</h6>
				<img class="imgnew" width="500" height="375" src="${noticia.imagem}">
				<div class="new">
					${noticia.conteudo}
				</div>
				
				<h4>Deixe seu comentário:</h4>
				
				<div class="fb-comments" data-href="http://example.com/comments" data-width="800" data-numposts="7" data-colorscheme="light"></div>
			</article>
		</section>
		
		<aside>
			<div id="space"></div>
			<div class="maisLidas">
				<h3>Mais lidas da semana</h3>
				<div class="rodapeDestaques"></div>
				<ol class="setaMaisLidas">
					<c:forEach items="${maisLidas}" var="lida">	
						<li><img alt="" src="img/logos/seta.png"><a href="LerNoticia?ID=${lida.id}">${lida.nome}</a></li>
					</c:forEach>
				</ol>
			</div>
			
			<%@ include file="../redessociais.jsp" %>
		</aside>
		
		<%@ include file="../rodape.jsp" %>
</html>