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
		
		<!--  SLIDE DE DESTAQUES -->
		
		<section>
			<div class="titleDestaques">
			<h2>Últimos destaques</h2>
			</div>
			<div id="fotos">
				<div class="paginas">
				</div>
				<ul>
					<c:forEach items="${noticias}" var="noticia">
						<li>
						<img alt="img" src="${noticia.imagem}">
						<div class="barra_semi-transparente">
							<p><a href="LerNoticia?ID=${noticia.id}"><b>${noticia.nome}</b>
							<br>${noticia.resumo}</a></p>
						</div>
						</li>
					</c:forEach>
				</ul>
		    </div>
			
			<c:forEach items="${noticias}" var="noticia">
				<div class="maisNoticias">
					<h1 class="titleMaisNoticias"><b class="tituloVariedades">${noticia.categoria}</b></h1>
					<div class="rodapeDestaques"></div>
					<ul>
						<li>
						<p class="assunto">${noticia.assunto}</p>
						<a href="LerNoticia?ID=${noticia.id}"><img src="${noticia.imagem}" width="155" height="110">
						<b class="tituloVariedades">${noticia.nome}</b><br>
						<b class="descricao">${noticia.resumo}</b></a>
						</li>
					</ul>
				</div>
			</c:forEach>
		

			<div class="demaisNoticias">
				<h2 class="titleDestaques">Mais notícias</h2>
				<table>
					<c:forEach items="${noticias}" var="noticia">
					<tr>
					  <td>${noticia.data}</td>
					  <td><a href="LerNoticia?ID=${noticia.id}">${noticia.nome}</a></td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</section>
		
		<aside>
			
			<div class="clima">
			<h3>Clima</h3>
			<div class="rodapeDestaques"></div>
			<iframe allowtransparency="true" marginwidth="0" marginheight="0" hspace="0" vspace="0" frameborder="0" scrolling="no" src="http://www.cptec.inpe.br/widget/widget.php?p=230&w=n&c=909090&f=ffffff" height="46px" width="312px"></iframe><noscript>Previs&atilde;o de <a href="http://www.cptec.inpe.br/cidades/tempo/230">Goiânia/GO</a> oferecido por <a href="http://www.cptec.inpe.br">CPTEC/INPE</a></noscript><!-- Widget Previs&atilde;o de Tempo CPTEC/INPE -->		</div> 
		 
		
			<div class="maisLidas">
				<h3>Mais lidas da semana</h3>
				<div class="rodapeDestaques"></div>
				<ol class="setaMaisLidas">
					<c:forEach items="${noticias}" var="noticia">	
						<li><img alt="" src="img/logos/seta.png"><a href="LerNoticia?ID=${noticia.id}">${noticia.nome }</a></li>
					</c:forEach>
					<c:forEach items="${noticias}" var="noticia">	
						<li><img alt="" src="img/logos/seta.png"><a href="LerNoticia?ID=${noticia.id}">${noticia.nome }</a></li>
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
			
			<div class="videos">
				<b class="titleVideos">Entretenimento</b>
				<ul>
					<li>
						<h3><a class="mostraVideo" href="#">Porta dos fundos: Operação</a></h3>
						<div class="video" id="videoevidente">
							<iframe width="300" height="250" src="//www.youtube.com/embed/PkhuvejiDoI"></iframe>
						</div>
					</li>
					<li>
						<h3><a class="mostraVideo" href="#">Titulo do Video</a></h3>
						<div class="video">
						</div>
					</li>
					<li>
						<h3><a class="mostraVideo" href="#">Título do Video</a></h3>
						<div class="video">
							AQUI VAI O VIDEEEOOOOO
						</div>
					</li>
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