<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
	<head>
		<link rel="stylesheet" type="text/css" href="css/mainStyle.css">
		<meta charset="utf-8">
		<script src="js/jquery-2.1.0.js"></script>
		<script src="js/jquery.cycle.all.js"></script>
		<script src="js/myScripts.js"></script>
	</head>
	<body>
		<header>
			<img alt="logo" class="logo" src="img/logos/logoPreto.png">
			<div class="barraBuscar">Buscar: <input type="text"></div>
		</header>
		
		
		<nav>
			<ul id="menuTopo">
				<li><a href="./index.jsp"><b class="home">Início</b></a></li>
				<li><a href="./noticias/index.jsp"><b class="noticias">Notícias</b></a></li>
				<li><a href="./esportes/index.jsp"><b class="esportes">Esportes</b></a></li>
				<li><a href="./tecnologia/index.jsp"><b class="tecnologia">Tecnologia</b></a></li>
				<li><a href="./variedades/index.jsp"><b class="variedades">Variedades</b></a></li>
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
						<img alt="new1" src="${noticia.imagem}">
						<div class="barra_semi-transparente">
							<p><a href="noticias/professor-ufg-mit.jsp"><b>${noticia.nome}</b>
							<br>${noticia.resumo}</a></p>
						</div>
						</li>
					</c:forEach>
				</ul>
		    </div>
		
			<div class="maisNoticias">
			<h1 class="titleMaisNoticias"><b class="TituloNoticias">Notícias</b></h1>
			<div class="rodapeDestaques"></div>
			<ul>
				<li>
				<p class="assunto">Reconhecimento</p>
				<a href="/noticias/professor-ufg-mit.jsp"><img src="noticias/img/professor-ufg-mit.jpg" width="155" height="110">
				<b class="tituloNoticias">MIT lista professor da UFG entre os dez brasileiros mais inovadores</b><br>
				<b class="descricao">Pesquisador desenvolveu teste de baixíssimo custo para análises clínicas.
				Entidade dos EUA pré-selecionou projeto para disputa internacional.</b></a>
				</li>
			</ul>
			</div>
		
		

		<!--  MAIS NOTICIAS DE ESPORTES -->		
			<div class="maisNoticias">
			<h1 class="titleMaisNoticias"><b class="tituloEsportes">Esportes</b></h1>
			<div class="rodapeDestaques"></div>
			<ul>
				<li>
				<p class="assunto">Atletismo</p>
				<a href="esportes/5-dores-quem-corre.jsp"><img src="esportes/img/5-dores-quem-corre.jpg" width="155" height="110">
				<b class="tituloEsportes">As cinco maiores dores de quem corre</b><br>
				<b class="descricao">Atletas novatos estão acostumados e não sabem identificar gravidade das lesões causadas pela corrida. Especialista ajuda a lidar com problema.</b></a>
				</li>	
			</ul>
			</div>

		<div class="maisNoticias">
			<h1 class="titleMaisNoticias"><b class="TituloTecnologia">Tecnologia</b></h1>
			<div class="rodapeDestaques"></div>
			<ul>
				<li>
				<p class="assunto">Inovação</p>
				<a href="tecnologia/olherao-3g-wifi.jsp"><img src="tecnologia/img/olherao-3g-wifi.jpg" width="155" height="110">
				<b class="tituloTecnologia">Começam a ser produzidos orelhões 3G</b><br>
				<b class="descricao">Parar tentar evitar desaparecimento, tecnologia é absorvida por aparelhos.
				Por dia, cerca de 120 orelhões, em média, somem das ruas do país</b></a>
				</li>
			</ul>
			</div>
			
			<div class="maisNoticias">
			<h1 class="titleMaisNoticias"><b class="TituloVariedades">Variedades</b></h1>
			<div class="rodapeDestaques"></div>
			<ul>
				<li>
				<p class="assunto">Saúde</p>
				<a href="variedades/saude-alimentos-coloridos.jsp"><img src="variedades/img/saude-alimentos-coloridos.jpg" width="155" height="110">
				<b class="tituloVariedades">Alimentos coloridos, tudo para uma alimentação balanceada</b><br>
				<b class="descricao">Os legumes, as frutas e oleaginosas favorecem a manutenção da saúde além de formar um prato mais bonito e atrativo.</b></a>
				</li>
			</ul>
			</div>
			<div class="demaisNoticias">
				<h2 class="titleDestaques">Mais notícias</h2>
				<table>
					<tr>
					  <td>05/06/2014 -</td>
					  <td><a href="variedades/saude-alimentos-coloridos.jsp">Alimentos coloridos, tudo para uma alimentação balanceada</a></td>
					</tr>
					<tr>
					  <td>11/06/2014 -</td>
					  <td><a href="noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></td>
					</tr>
					<tr>
					  <td>05/06/2014 -</td>
					  <td><a href="esportes/5-dores-quem-corre.jsp">As cinco maiores dores de quem corre</a></td>
					</tr>
					<tr>
					  <td>05/06/2014 -</td>
					  <td><a href="tecnologia/olherao-3g-wifi.jsp">Começam a ser produzidos orelhões 3G</a></td>
					</tr>
					<tr>
					  <td>05/06/2014 -</td>
					  <td><a href="variedades/saude-alimentos-coloridos.jsp">Alimentos coloridos, tudo para uma alimentação balanceada</a></td>
					</tr>
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
					<li><img alt="" src="img/logos/seta.png"><a href="noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="esportes/5-dores-quem-corre.jsp">As cinco maiores dores de quem corre</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="tecnologia/olherao-3g-wifi.jsp">Começam a ser produzidos alguns orelhões com tecnologia 3G</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="variedades/saude-alimentos-coloridos.jsp">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="noticias/professor-ufg-mit.jsp">MIT lista professor da UFG entre os dez brasileiros mais inovadores</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="esportes/5-dores-quem-corre.jsp">As cinco maiores dores de quem corre</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="tecnologia/olherao-3g-wifi.jsp">Começam a ser produzidos alguns orelhões com tecnologia 3G</a></li>
					<li><img alt="" src="img/logos/seta.png"><a href="variedades/saude-alimentos-coloridos.jsp">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>
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
				<li><a href="index.jsp">Início</a></li>
				<li><a href="noticias/index.jsp" class="tituloNoticias">Notícias</a></li>
				<li><a href="esportes/index.jsp" class="tituloEsportes">Esportes</a></li>
				<li><a href="tecnologia/index.jsp" class="tituloTecnologia">Tecnologia</a></li>
				<li><a href="variedades/index.jsp" class="tituloVariedades">Variedades</a></li>
				<li><a href="#">Voltar ao topo</a></li>
			</ol>
		</footer>
</html>