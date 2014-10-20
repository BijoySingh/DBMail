$(function(){
	$('#show_inbox').click(function(){
		animateLists('inbox_data');
		get_inbox();
		$('#outbox_nav_button').addClass('navigation_table_active');
		$('#outbox_nav_button').removeClass('navigation_table_active');
		
		$('#inbox_nav_button').addClass('navigation_table_active');
	});
	function create_panel(source,id,subject,interval,email_read){
		if(email_read == "true")
			email_read = "email_read";
		else
			email_read = "";
		return '<div class="show_thread" id="email_' + id + '">'+
		'<table class=" email_table '+ email_read +'">'+
		'<tr class="email_item">'+
		'<td class="email_source">' + source + '</td>'+
		'<td class="email_time">' + interval + '</td>'+
		'</tr><tr class="email_item">'+
		'<td class="email_subject" colspan="3">'+ decodeURI(subject) +'</td>'+
		'</tr>'+
		'</table>' 
		+'</div>'
		;
	}
	function get_inbox(){
		$.ajax({
			url: 'InboxHandler',
			type: 'POST',
			dataType: 'json',
			success: function(data) {
			//called when successful
			var data_out = "";
			jQuery.each(data["inbox"], function() {
				data_out += create_panel(
						this["email_source"],
						this["thread_id"],
						this["email_subject"],
						this["email_interval"],
						this["email_read"]
				);
			});
			$('#inbox_data').html(data_out);
			$('#outbox_data').html(data_out);
			$('#thread_data').html(data_out);
		},
		error: function(e) {
			//called when there is an error
			//console.log(e.message);
		}
		});
	}

});	