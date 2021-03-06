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
		
		<%@ include file="menu.jsp" %>
		
		<!--  SLIDE DE DESTAQUES -->
		
		<section>
			<div class="titleDestaques">
			<h2>�ltimos destaques</h2>
			</div>
			<div id="fotos">
				<div class="paginas">
				</div>
				<ul>
					<c:forEach items="${noticias}" var="noticia" begin="0" end="3">
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
			
			<c:forEach items="${noticias}" var="noticia" begin="4" end="7">
				<div class="maisNoticias">
					<h1 class="titleMaisNoticias"><b class="${noticia.categoria}">${noticia.categoria}</b></h1>
					<div class="rodapeDestaques"></div>
					<ul>
						<li>
						<p class="assunto">${noticia.assunto}</p>
						<a href="LerNoticia?ID=${noticia.id}"><img src="${noticia.imagem}" width="155" height="110">
						<b class="${noticia.categoria}">${noticia.nome}</b><br>
						<b class="descricao">${noticia.resumo}</b></a>
						</li>
					</ul>
				</div>
			</c:forEach>
		

			<div class="demaisNoticias">
				<h2 class="titleDestaques">Mais not�cias</h2>
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
			<iframe allowtransparency="true" marginwidth="0" marginheight="0" hspace="0" vspace="0" frameborder="0" scrolling="no" src="http://www.cptec.inpe.br/widget/widget.php?p=230&w=n&c=909090&f=ffffff" height="46px" width="312px"></iframe><noscript>Previs&atilde;o de <a href="http://www.cptec.inpe.br/cidades/tempo/230">Goi�nia/GO</a> oferecido por <a href="http://www.cptec.inpe.br">CPTEC/INPE</a></noscript><!-- Widget Previs&atilde;o de Tempo CPTEC/INPE -->		</div> 
		 
		
			<div class="maisLidas">
				<h3>Mais lidas da semana</h3>
				<div class="rodapeDestaques"></div>
				<ol class="setaMaisLidas">
					<c:forEach items="${maisLidas}" var="lida" begin="0" end="7">	
						<li><img alt="" src="img/logos/seta.png"><a href="LerNoticia?ID=${lida.id}">${lida.nome }</a></li>
					</c:forEach>
				</ol>
			</div>
			
			<%@ include file="../redessociais.jsp" %>
			
			<div class="videos">
				<b class="titleVideos">Entretenimento</b>
				<ul>
					<li>
						<h3><a class="mostraVideo" href="#">Porta dos fundos: Opera��o</a></h3>
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
						<h3><a class="mostraVideo" href="#">T�tulo do Video</a></h3>
						<div class="video">
						</div>
					</li>
				</ul>
			</div>
		</aside>
		
		<%@ include file="rodape.jsp" %>
</html>