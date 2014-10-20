function animateLists(id){
	var list = ["inbox_data","outbox_data","thread_data"];
	for(var i =0; i<3; i++){
		if(list[i] == id){
			$('#' + id).slideDown(500);
		}
		else{
			$('#' + list[i]).slideUp(500);
		}
	}
}		
