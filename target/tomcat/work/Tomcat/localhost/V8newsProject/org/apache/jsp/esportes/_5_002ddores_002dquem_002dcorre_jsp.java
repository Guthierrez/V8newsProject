/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-05-11 20:20:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.esportes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _5_002ddores_002dquem_002dcorre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/esportes.css\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<script src=\"../js/jquery-2.1.0.js\"></script>\r\n");
      out.write("\t\t<script src=\"../js/jquery.cycle.all.js\"></script>\r\n");
      out.write("\t\t<script src=\"../js/myScripts.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div id=\"fb-root\"></div>\r\n");
      out.write("\t\t<script>(function(d, s, id) {\r\n");
      out.write("\t\t  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("\t\t  if (d.getElementById(id)) return;\r\n");
      out.write("\t\t  js = d.createElement(s); js.id = id;\r\n");
      out.write("\t\t  js.src = \"//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.0\";\r\n");
      out.write("\t\t  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("\t\t}(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<img alt=\"logo\" class=\"logo\" src=\"../img/logos/logoVerde.png\">\r\n");
      out.write("\t\t\t<div class=\"barraBuscar\">Buscar: <input type=\"text\"></div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul id=\"menuTopo\">\r\n");
      out.write("\t\t\t\t<li><a href=\"../index.jsp\"><b class=\"home\">Início</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../noticias/index.jsp\"><b class=\"noticias\">Notícias</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../esportes/index.jsp\"><b class=\"esportes\">Esportes</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../tecnologia/index.jsp\"><b class=\"tecnologia\">Tecnologia</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../variedades/index.jsp\"><b class=\"variedades\">Variedades</b></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section>\r\n");
      out.write("\t\t\t<article>\r\n");
      out.write("\t\t\t\t<h2>As cinco maiores dores de quem corre</h2>\r\n");
      out.write("\t\t\t\t<h3>Atletas novatos estão acostumados e não sabem identificar gravidade das lesões causadas pela corrida. Especialista ajuda a lidar com problema</h3>\r\n");
      out.write("\t\t\t\t<h6>Postada em 05/03/2014           Fonte: G1</h6>\r\n");
      out.write("\t\t\t\t<img class=\"imgnew\" src=\"img/5-dores-quem-corre.jpg\" width=\"500\" height=\"375\">\r\n");
      out.write("\t\t\t\t<div class=\"new\">\r\n");
      out.write("\t\t\t\tQuando estamos correndo, podemos dar até 200 passos por minuto. Cada passo faz um impacto que envia uma forte energia através de seus pés, tornozelos, pernas, panturrilhas e joelhos. Essa  força é transmitida também aos quadris e até mesmo para o abdômen e região lombar. Eventualmente, todos esses impactos irão inevitavelmente causar um pouco de dor.\t\t\t\t\r\n");
      out.write("\t\t\t\t<br><br>Para alguns corredores profissionais, a dor é inevitável; já os corredores recreacionais têm  problemas para lidar com a dor, pois ainda não estão acostumados nem sabem identificar a gravidade das mesmas. Não se pode simplesmente \"ignorar\" a dor, no entanto, a chave para administrá-la é saber a diferença entre uma dor temporária, dor grave o suficiente para empregar gelo e compressão, e algo que requer uma visita ao ortopedista.\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br><br>1 - Acúmulo de ácido lático<br>\r\n");
      out.write("\t\t\t\tAo contrário da crença popular, o ácido láctico não é um produto residual que \"acumula\" nos músculos durante o exercício vigoroso, levando à fadiga, rigidez ,e dores musculares.  A dor vem de uma substância chamada lactato, que está envolvida na função muscular. Ao invés de um produto residual, o lactato é um passo importante na produção da energia necessária para alimentar o músculo. A degradação da glicose para produzir energia cria um ácido chamado piruvato, que eventualmente se transforma em lactato, que, em sua maioria, é convertido em energia. O restante se transforma em glicogênio, outro elemento-chave no processo de construção muscular.\r\n");
      out.write("\t\t\t\tOs problemas ocorrem quando o atleta se exercita muito e produz muito piruvato (e lactato) para o corpo converter rapido o suficiente. Ninguém está inteiramente certo de como isso faz com que a fadiga muscular ocorra durante o exercício, embora uma teoria comum sugira que os íons de hidrogênio liberados na corrente sanguínea aumentem a acidez, levando à fadiga. Uma coisa nós sabemos: o lactato não causa dor pós-exercício. Isso vem da lesão muscular que, naturalmente, resulta de exercícios intensos. Neste caso, é só reduzir a planilha de treinos até conseguir ganhar mais resistência e condicionamento.\r\n");
      out.write("\t\t\t\t<br><br>2- Dor muscular tardia<br>\r\n");
      out.write("\t\t\t\tA dor que o atleta costuma sentir no dia seguinte de uma atividade física vem de lesões microscópicas na fibra muscular. A reconstrução da lesão muscular cria músculos maiores e mais fortes. Em outras palavras, a dor não é apenas normal, é necessária.\r\n");
      out.write("\t\t\t\tPor vezes, no entanto, a dor parece especialmente grave e dura dias. Isso provavelmente é dor muscular tardia (DMT). Isso pode ser bastante desconfortável, mas não é um problema grave. É  causada pelos mesmos fatores como a dor normal, só que mais intensa. Isso geralmente acontece quando realiza-se novos exercícios de intensidade relativamente alta, o que tende a abater iniciantes. Os músculos constroem uma resistência à dor muscular tardia com várias sessões e exercícios.\r\n");
      out.write("\t\t\t\tCorredores iniciantes que não suportam a DMT após um ou dois dias podem tentar algumas massagens ou exercícios leves. Alguns corredores sugerem apenas correr um pouco mais, o que pode suprimir o desconforto e ajudar a construir a resistência dos músculos mais rapidamente.\r\n");
      out.write("\t\t\t\t<br><br>3- Dor na sola do pé<br>\r\n");
      out.write("\t\t\t\tA fascite plantar é uma condição que muitas vezes associamos à meia-idade, mas em alguns casos, certos exercícios - como a corrida - podem levar a essa dor no calcanhar, que se torna debilitante, muito cedo na vida de alguns atletas.\r\n");
      out.write("\t\t\t\tA condição geralmente mostra-se como uma grave, forte dor no calcanhar. É mais forte logo pela na manhã, mas melhora ao longo do dia. Passar longos períodos em pé ou sentado também pode agravá-la. A causa subjacente é muito estresse/ impacto sobre o tecido conjuntivo (e possivelmente nos músculos flexores), que se estende desde o calcanhar na parte inferior do seu pé até os dedos. A cirurgia pode corrigi-la, mas a maioria dos corredores pode evitar ou corrigir o problema usando sapatos e palmilhas. A curto prazo, devem descansar e elevar o pé e a panturrilha.\r\n");
      out.write("\t\t\t\t<br><br>4 - Canelite<br>\r\n");
      out.write("\t\t\t\tDores nas canelas descrevem uma condição dolorosa em que tanto o osso da canela quanto os tecidos conjuntivos ao lado sofrem danos causados pelo impacto. Se a dor afeta apenas o osso e é nítida e grave em um determinado local, o problema é provavelmente uma fratura por estresse da tíbia.\r\n");
      out.write("\t\t\t\tOs músculos podem estar inflamados e sendo pressionados contra a bainha muscular. Alguns especialistas em medicina esportiva suspeitam de que o tecido muscular e o conjuntivo da bainha possam lentamente se lesionar ou até mesmo avulsionar da tíbia. Em qualquer caso, os danos nos tecidos podem causar dor severa o suficiente para manter até mesmo os corredores mais dedicados fora dos treinos por meses.\r\n");
      out.write("\t\t\t\tResolver dores nas canelas requer repouso, juntamente com gelo e elevação para reduzir a inflamação. Alongamento das panturrilhas, músculos e ligamentos da canela também ajudam. Corredores com sobrepeso que sintam dores nas canelas podem tentar perder alguns quilos para aliviar o problema.\r\n");
      out.write("\t\t\t\t<br><br>5- Bolhas<br>\r\n");
      out.write("\t\t\t\tAs bolhas são a perdição dos corredores e de quem caminha. Elas se formam, inicialmente, desenvolvendo uma vermelhidão local na área de atrito, que acabará por se tornar uma bolha. Se o atleta não parar para cuidar do problema, em seguida ela irá se romper e a pele macia debaixo dela ficará exposta. Essa irritação da pele pode ser extremamente dolorosa, dificultando a corrida.\r\n");
      out.write("\t\t\t\tA melhor maneira de evitar bolhas é ter sapatos que se ajustem adequadamente, permitindo que sobre cerca de um polegar de espaço extra na caixa anterior dos dedos dos pés. Usar tênis novos antes de  começar a treinar ajuda  a amaciar.\r\n");
      out.write("\t\t\t\tÀs vezes, uma bolha começa a se formar, não importa que tipo de sapatos que você está vestindo. A solução é proteger a área de formação de bolhas com qualquer tipo de barreira que evite a pressão local. Também é possível reduzir o atrito com vaselina ou pomadas para os pés.\r\n");
      out.write("\t\t\t\tDepois de ter uma bolha, perfure com uma agulha estéril, mantenha o local limpo e coberto. Um pouco de pomada antibacteriana deve ajudar o processo de cicatrização. Se não melhorar, procure um médico!\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h4>Deixe seu comentário:</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"fb-comments\" data-href=\"http://example.com/comments\" data-width=\"800\" data-numposts=\"7\" data-colorscheme=\"light\"></div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t\t<div id=\"space\"></div>\r\n");
      out.write("\t\t\t<div class=\"maisLidas\">\r\n");
      out.write("\t\t\t\t<h3>Mais lidas da semana</h3>\r\n");
      out.write("\t\t\t\t<div class=\"rodapeDestaques\"></div>\r\n");
      out.write("\t\t\t\t<ol class=\"setaMaisLidas\">\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../esportes/5-dores-quem-corre.jsp\">As cinco maiores dores de quem corre</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../esportes/5-dores-quem-corre.jsp\">As cinco maiores dores de quem corre</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../esportes/5-dores-quem-corre.jsp\">As cinco maiores dores de quem corre</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../esportes/5-dores-quem-corre.jsp\">As cinco maiores dores de quem corre</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../esportes/5-dores-quem-corre.jsp\">As cinco maiores dores de quem corre</a></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"redessociais\">\r\n");
      out.write("\t\t\t\t<h3>Visite-nos nas redes sociais</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><img src=\"../img/logos/facebookicon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"../img/logos/googleplusicon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"../img/logos/twittericon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"../img/logos/youtubeicon.png\"></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div class=\"direitos\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"../img/logos/rodapePreto.png\">\r\n");
      out.write("\t\t\t\t<div class=\"copy\">© Copyright 2014</div>\r\n");
      out.write("\t\t\t\t<div class=\"sobre\">Sobre</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ol class=\"menuRodape\">\r\n");
      out.write("\t\t\t\t<li><a href=\"../index.jsp\">Início</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../noticias/index.jsp\" class=\"tituloNoticias\">Notícias</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../esportes/index.jsp\" class=\"tituloEsportes\">Esportes</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../tecnologia/index.jsp\" class=\"tituloTecnologia\">Tecnologia</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../variedades/index.jsp\" class=\"tituloVariedades\">Variedades</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Voltar ao topo</a></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
