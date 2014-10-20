$(function(){
	$('#show_outbox').click(function(){
		animateLists('outbox_data');
		get_outbox();
		$('#inbox_nav_button').addClass('navigation_table_active');
		$('#inbox_nav_button').removeClass('navigation_table_active');
		
		$('#outbox_nav_button').addClass('navigation_table_active');
	});
	function create_outbox_panel(){
		
	}
	function get_outbox(){
		$.ajax({
			url: 'OutboxHandler',
			type: 'POST',
			dataType: 'json',
			success: function(data) {
			//called when successful
			var data_out = "";
			jQuery.each(data["outbox"], function() {
				data_out += create_outbox_panel();
			});
			$('#outbox_data').html(data_out);
		},
		error: function(e) {
			//called when there is an error
			//console.log(e.message);
		}
		});
	}

});	