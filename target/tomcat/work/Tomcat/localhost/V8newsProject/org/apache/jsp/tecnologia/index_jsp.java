/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-07-11 14:25:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Tecnologia;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Tecnologia/css/tecnologia.css\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<script src=\"js/jquery-2.1.0.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.cycle.all.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/myScripts.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<img alt=\"logo\" class=\"logo\" src=\"img/logos/logoAzul.png\">\r\n");
      out.write("\t\t\t<div class=\"barraBuscar\">Buscar: <input type=\"text\"></div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul id=\"menuTopo\">\r\n");
      out.write("\t\t\t\t<li><a href=\"Inicio\"><b class=\"home\">Início</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Noticia\"><b class=\"noticias\">Notícias</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Esporte\"><b class=\"esportes\">Esportes</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Tecnologia\"><b class=\"tecnologia\">Tecnologia</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Variedades\"><b class=\"variedades\">Variedades</b></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--  SLIDE DE DESTAQUES -->\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<section>\r\n");
      out.write("\t\t\t<div class=\"titleDestaques\">\r\n");
      out.write("\t\t\t<h2>Últimos destaques</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"fotos\">\r\n");
      out.write("\t\t\t\t<div class=\"paginas\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"demaisNoticias\">\r\n");
      out.write("\t\t\t\t<h2 class=\"titleDestaques\">Mais notícias</h2>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"clima\">\r\n");
      out.write("\t\t\t<h3>Clima</h3>\r\n");
      out.write("\t\t\t<div class=\"rodapeDestaques\"></div>\r\n");
      out.write("\t\t\t<iframe allowtransparency=\"true\" marginwidth=\"0\" marginheight=\"0\" hspace=\"0\" vspace=\"0\" frameborder=\"0\" scrolling=\"no\" src=\"http://www.cptec.inpe.br/widget/widget.php?p=230&w=n&c=909090&f=ffffff\" height=\"46px\" width=\"312px\"></iframe><noscript>Previs&atilde;o de <a href=\"http://www.cptec.inpe.br/cidades/tempo/230\">Goiânia/GO</a> oferecido por <a href=\"http://www.cptec.inpe.br\">CPTEC/INPE</a></noscript><!-- Widget Previs&atilde;o de Tempo CPTEC/INPE -->\t\t</div> \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"maisLidas\">\r\n");
      out.write("\t\t\t\t<h3>Mais lidas da semana</h3>\r\n");
      out.write("\t\t\t\t<div class=\"rodapeDestaques\"></div>\r\n");
      out.write("\t\t\t\t<ol class=\"setaMaisLidas\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"redessociais\">\r\n");
      out.write("\t\t\t\t<h3>Visite-nos nas redes sociais</h3>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><img src=\"img/logos/facebookicon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"img/logos/googleplusicon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"img/logos/twittericon.png\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"img/logos/youtubeicon.png\"></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"videos\">\r\n");
      out.write("\t\t\t\t<b class=\"titleVideos\">Entretenimento</b>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h3><a class=\"mostraVideo\" href=\"#\">Porta dos fundos: Operação</a></h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"video\" id=\"videoevidente\">\r\n");
      out.write("\t\t\t\t\t\t\t<iframe width=\"300\" height=\"250\" src=\"//www.youtube.com/embed/PkhuvejiDoI\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h3><a class=\"mostraVideo\" href=\"#\">Titulo do Video</a></h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"video\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h3><a class=\"mostraVideo\" href=\"#\">Título do Video</a></h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"video\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div class=\"direitos\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"img/logos/rodapePreto.png\">\r\n");
      out.write("\t\t\t\t<div class=\"copy\">© Copyright 2014</div>\r\n");
      out.write("\t\t\t\t<div class=\"sobre\">Sobre</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ol class=\"menuRodape\">\r\n");
      out.write("\t\t\t\t<li><a href=\"Inicio\">Início</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Noticia\"><b class=\"tituloNoticias\">Notícias</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Esporte\"><b class=\"tituloEsportes\">Esportes</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Tecnologia\"><b class=\"tituloTecnologia\">Tecnologia</b></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ver?categoria=Variedades\"><b class=\"tituloVariedades\">Variedades</b></a></li>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /Tecnologia/index.jsp(37,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Tecnologia/index.jsp(37,5) '${noticias}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${noticias}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Tecnologia/index.jsp(37,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("noticia");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<img alt=\"img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.imagem}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"barra_semi-transparente\">\r\n");
          out.write("\t\t\t\t\t\t\t<p><a href=\"LerNoticia?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</b>\r\n");
          out.write("\t\t\t\t\t\t\t<br>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.resumo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></p>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /Tecnologia/index.jsp(49,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/Tecnologia/index.jsp(49,3) '${noticias}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${noticias}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Tecnologia/index.jsp(49,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("noticia");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"maisNoticias\">\r\n");
          out.write("\t\t\t\t\t<h1 class=\"titleMaisNoticias\"><b class=\"TituloTecnologia\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.categoria}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</b></h1>\r\n");
          out.write("\t\t\t\t\t<div class=\"rodapeDestaques\"></div>\r\n");
          out.write("\t\t\t\t\t<ul>\r\n");
          out.write("\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t<p class=\"assunto\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.assunto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"LerNoticia?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.imagem}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"155\" height=\"110\">\r\n");
          out.write("\t\t\t\t\t\t<b class=\"tituloTecnologia\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</b><br>\r\n");
          out.write("\t\t\t\t\t\t<b class=\"descricao\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.resumo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</b></a>\r\n");
          out.write("\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /Tecnologia/index.jsp(68,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/Tecnologia/index.jsp(68,5) '${noticias}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${noticias}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Tecnologia/index.jsp(68,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("noticia");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t  <td><a href=\"LerNoticia?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${noticia.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /Tecnologia/index.jsp(90,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/Tecnologia/index.jsp(90,5) '${maisLidas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${maisLidas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /Tecnologia/index.jsp(90,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("lida");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\r\n");
          out.write("\t\t\t\t\t\t<li><img alt=\"\" src=\"img/logos/seta.png\"><a href=\"LerNoticia?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lida.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lida.nome }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }
}
