$(function(){
	$(document).ready(function(){
		var div = $('<div></div>').addClass('paginas');
		$('#fotos ul').before(div);
		$('#fotos ul').cycle({
			fx: 'fade',
			pager: 'div.paginas',
			speed: 1200,
			timeout: 2500,
			pause:true,
			pauseOnPagerHover:true,
			
			before: function(atual, proximo, opcoes, avancado){
				$('p, div.barra_semi-transparente', atual).slideUp('fast');
			},
		
			after: function(atual, proximo, opcoes, avancado){
				$('p, div.barra_semi-transparente', proximo).slideDown('fast');
			}			
		});		
	});
});


$(document).ready(function(){
    $(".video").hide();
    $("#videoevidente").show();
    $(".mostraVideo").click(function(){
       $(".video:visible").slideUp("slow");
       $(this).parent().next().slideDown("slow");
       return false;
    });
});