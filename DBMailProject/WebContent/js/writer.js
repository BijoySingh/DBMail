	$(function(){
		$('#email_creator').hide();
		$('#show_email_creator').click(function(){
			// $('#email_creator_content').show(250,function(){$('#email_creator').show(250);});
			$('#email_creator_content').show(500);
			$('#email_creator').show(500);
		}); 
		$('#hide_email_creator').click(function(){
			// $('#email_creator_content').show(1000);
			$('#email_creator').hide(500);
		}); 
		$('#minimise_email_creator').click(function(){
			$('#email_creator_content').toggle(300);
		}); 
		
		$('#send_email').click(function(){
			$('#email_creator').hide(500);
			var data = 
			'{"subject":"' + encodeURI( $("#email_subject").val() ) + '",'+
			 '"email" : "' + encodeURI( $("#email_text").val() ) + '",'+
			 '"cc":"' + encodeURI( $("#email_cc").val() ) + '",'+
			 '"bcc":"' + encodeURI( $("#email_bcc").val() ) + '"}';
			 send_email(data);
		});
		function send_email(data){
			$.ajax({
			    url: 'WriteHandler',
			    type: "POST",
			    data: data,
			    contentType: "application/json",
			    success: function(data) {
					alert(data);
				},
				error: function(e) {
				}
			});
		}
		
	});