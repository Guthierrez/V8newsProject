<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
	<head>
		<link rel="stylesheet" type="text/css" href="Variedades/css/variedades.css">
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
			<img alt="logo" class="logo" src="img/logos/logoLaranja.png">
			<div class="barraBuscar">Buscar: <input type="text"></div>
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
						<li><img alt="" src="img/logos/seta.png"><a href="LerNoticia?ID=${lida.id}">${lida.nome }</a></li>
					</c:forEach>
				</ol>
			</div>
			
			<div class="redessociais">
				<h3>Visite-nos nas redes sociais</h3>
				<ul>
				<li><img src="img/logos/facebookicon.png"></li>
				<li><img src="img/logos/googleplusicon.png"></li>
				<li><img src="img/logos/twittericon.png"></li>
				<li><img src="img/logos/youtubeicon.png"></li>
				</ul>
			</div>
		</aside>
		
		<footer>
			<div class="direitos">
				<img alt="" src="img/logos/rodapePreto.png">
				<div class="copy">© Copyright 2014</div>
				<div class="sobre">Sobre</div>
			</div>
			<ol class="menuRodape">
				<li><a href="Inicio">Início</a></li>
				<li><a href="Ver?categoria=Noticia"><b class="tituloNoticias">Notícias</b></a></li>
				<li><a href="Ver?categoria=Esporte"><b class="tituloEsportes">Esportes</b></a></li>
				<li><a href="Ver?categoria=Tecnologia"><b class="tituloTecnologia">Tecnologia</b></a></li>
				<li><a href="Ver?categoria=Variedades"><b class="tituloVariedades">Variedades</b></a></li>
				<li><a href="#">Voltar ao topo</a></li>
			</ol>
		</footer>
</html>