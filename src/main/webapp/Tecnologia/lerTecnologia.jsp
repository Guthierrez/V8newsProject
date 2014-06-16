<html lang="pt-br">
	<head>
		<link rel="stylesheet" type="text/css" href="Tecnologia/css/tecnologia.css">
		<meta charset="utf-8">
		<script src="../js/jquery-2.1.0.js"></script>
		<script src="../js/jquery.cycle.all.js"></script>
		<script src="../js/myScripts.js"></script>
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
		
		
		<nav>
			<ul id="menuTopo">
				<li><a href="../index.jsp"><b class="home">Início</b></a></li>
				<li><a href="../noticias/index.jsp"><b class="noticias">Notícias</b></a></li>
				<li><a href="../esportes/index.jsp"><b class="esportes">Esportes</b></a></li>
				<li><a href="../tecnologia/index.jsp"><b class="tecnologia">Tecnologia</b></a></li>
				<li><a href="../variedades/index.jsp"><b class="variedades">Variedades</b></a></li>
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
					<li><img alt="" src="img/logos/seta.png"><a href="../noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="../noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="../noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="../noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="../noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>

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
				<li><a href="../index.jsp">Início</a></li>
				<li><a href="../noticias/index.jsp" class="tituloNoticias">Notícias</a></li>
				<li><a href="../esportes/index.jsp" class="tituloEsportes">Esportes</a></li>
				<li><a href="../tecnologia/index.jsp" class="tituloTecnologia">Tecnologia</a></li>
				<li><a href="../variedades/index.jsp" class="tituloVariedades">Variedades</a></li>
				<li><a href="#">Voltar ao topo</a></li>
			</ol>
		</footer>
</html>