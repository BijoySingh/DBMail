$(function(){

	$(document).on('click','div.show_thread',function(){
		animateLists('thread_data');
		get_thread(this.id);
		$('#outbox_nav_button').addClass('navigation_table_active');
		$('#outbox_nav_button').removeClass('navigation_table_active');
		$('#inbox_nav_button').addClass('navigation_table_active');
		$('#inbox_nav_button').removeClass('navigation_table_active');
	});
	function create_thread_panel(source,id,subject,interval,email_read){
		
	}
	function get_thread(id){
		$.ajax({
			url: 'ThreadHandler',
			type: 'POST',
			dataType: 'json',
			success: function(data) {
			//called when successful
			var data_out = "";
			jQuery.each(data["thread"], function() {
				data_out += create_thread_panel();
			});
			$('#thread_data').html(data_out);
		},
		error: function(e) {
			//called when there is an error
			//console.log(e.message);
		}
		});
	}
});	