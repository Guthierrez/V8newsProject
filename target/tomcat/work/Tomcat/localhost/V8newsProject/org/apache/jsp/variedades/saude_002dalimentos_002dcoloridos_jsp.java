/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-05-19 13:20:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.variedades;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class saude_002dalimentos_002dcoloridos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/variedades.css\">\r\n");
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
      out.write("\t\t\t<img alt=\"logo\" class=\"logo\" src=\"../img/logos/logoLaranja.png\">\r\n");
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
      out.write("\t\t\t\t<h2>Alimentos coloridos no prato, passaporte para uma alimentação balanceada</h2>\r\n");
      out.write("\t\t\t\t<h3>Os legumes, as frutas e oleaginosas favorecem a manutenção da saúde além de formar um prato\r\n");
      out.write("\t\t\t\tmais bonito e atrativo</h3>\r\n");
      out.write("\t\t\t\t<h6>Postada em 05/03/2014           Fonte: G1</h6>\r\n");
      out.write("\t\t\t\t<img class=\"imgnew\" src=\"img/saude-alimentos-coloridos.jpg\" width=\"500\" height=\"375\">\r\n");
      out.write("\t\t\t\t<div class=\"new\">\r\n");
      out.write("\t\t\t\tComo dizia Hipócrates, considerado o pai da medicina: \"faça do alimento o seu medicamento e do medicamento o seu alimento\". É de conhecimento de todos que se nos alimentarmos de forma saudável, teremos mais energia, mais saúde e mais longevidade.\r\n");
      out.write("\t\t\t\tSegundo a nutricionista Nicole Trevisan, \"quando falamos em uma alimentação balanceada, podemos dizer os termos pratos coloridos, ou seja, que contenham todos os grupos alimentares como, carboidratos, proteínas e lipídios, além das fibras. Assim, com todos os nutrientes, o organismo funcionará regularmente, como também o seu humor. Por exemplo: quando a pessoa faz a dieta da proteína e elimina os carboidratos da refeição, ela pode até emagrecer, mas terá prejuízos, pois o carboidrato é o principal fornecedor da glicose para o organismo. E uma das partes do corpo que mais precisa desse combustível é o cérebro, assim como o estado emocional, através dos hormônios, precisamos de nutrientes adequados para serem modulados\".\t\t\t\t\r\n");
      out.write("\t\t\t\t<br><br>Quanto mais colorida a alimentação, mais rica em vitaminas e minerais para o bom funcionamento do organismo, incluindo trânsito intestinal, hormônios, etc.\"As pessoas devem seguir o conceito \"My Plate\", criado nos EUA, em que faz parte de uma campanha do presidente Obama contra a obesidade. O prato acompanha um copo de leite. No Brasil, esse leite foi substituído por uma fruta, seguindo uma adequação, harmonização e equilíbrio na alimentação\", explica Nicole.\r\n");
      out.write("\t\t\t\t<br><br>A iniciativa traz o conceito de proporção adequada e de variedade dos grupos de alimentos, além de um ajuste de quantidade - vários alimentos cabem em um único prato. \"Uma pessoa com diabetes poderá adequar sua dieta segundo esse conceito, só é necessário alinhar essa alimentação com uma nutricionista, para utilizar a quantidade de insulina adequada, alerta Nicole\".\r\n");
      out.write("\t\t\t\t<br><br>Por isso, a nutricionista fala dos benefícios desse conceito, quanto mais colorida a alimentação, mais rica em nutrientes. As cores dos alimentos definem o tipo de vitaminas e minerais que ele possui. Devemos, ao montar nosso prato, visualizar, se ele estiver em um mesmo tom é porque não está tão rico em nutrientes. Por isso:\r\n");
      out.write("\t\t\t\t<br><br>Alimentos vermelhos: ricos em licopeno são antioxidantes, atuam na circulação sanguínea, ajudam na prevenção de câncer de próstata. Ex: tomate, morango e goiaba.\r\n");
      out.write("\t\t\t\t<br><br>Alimentos brancos: ricos em cálcio e potássio. Minerais importantes para o funcionamento do organismo, formação e manutenção de ossos e dentes, são anti-inflamatórios e antifúngicos. Ex: banana, leite, couve flor, alho e cebola.\r\n");
      out.write("\t\t\t\t<br><br>Alimentos alaranjados: ricos em beta caroteno, precursor da vitamina A, ricos em vitaminas do complexo B, antioxidantes e colaboram na prevenção de diversos tipos de câncer. Ex: laranja, abóbora, cenoura e damasco.\r\n");
      out.write("\t\t\t\t<br><br>Alimentos verdes escuros: Fontes importantes de ácido fólico, importantíssimo nos primeiros meses de gestação, pois formam o tubo neural do bebê. Possuem vitaminas do complexo B, atuam na prevenção de câncer, principalmente de intestino, são antioxidantes e combatem os radicais livres.  Ex: vegetais folhosos, pimentão, salsão.\r\n");
      out.write("\t\t\t\t<br><br>Alimentos arroxeados. Contém anticioninas e flavonóides. Essencial na renovação celular, mediações químicas do organismo. Ex: uvas, repolho roxo e beterraba.\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
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
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../variedades/saude-alimentos-coloridos.jsp\">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../variedades/saude-alimentos-coloridos.jsp\">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../variedades/saude-alimentos-coloridos.jsp\">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../variedades/saude-alimentos-coloridos.jsp\">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img alt=\"\" src=\"../img/logos/seta.png\"><a href=\"../variedades/saude-alimentos-coloridos.jsp\">Alimentos coloridos, tudo para uma alimentação balanceada</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
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
