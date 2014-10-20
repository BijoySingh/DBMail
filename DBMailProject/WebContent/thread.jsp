<%@ include file="header.jsp"  %>

<body style="padding-top: 160px; padding-bottom: 30px;">
<%@ include file="panel.jsp"  %>
<%@ include file="thread_panel.jsp"  %>

<div class="thread_email_list">
	<table class="thread_email_table">
		<tr class="thread_email_item">
			<td class="thread_email_source">Bijoy Singh Kochar</td>
			<td class="thread_email_time">2 days ago</td>
		</tr>
		<tr class="thread_email_item">
			<td class="thread_email_subject" colspan="2">This is the email subject. Now that you are thinking about.</td>
		</tr>
		<tr class="thread_email_item">
			<td class="thread_email_content" colspan="2">This is the email content. Now that you are thinking about. 
			This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.</td>
		</tr>
	</table>
	

	<div class="thread_email_creator">
		<form class="thread_email_form">
			<input class="thread_email_input" type="text" placeholder="Send To">
			<textarea class="thread_email_textarea" placeholder="Message"></textarea> 
			<input class="submit_button" type="submit" value="Send">
			<input class="submit_button" type="reset" value="Discard">
	</div>

	<table class="thread_email_table thread_email_read">
		<tr class="thread_email_item">
			<td class="thread_email_source">Bijoy Singh Kochar</td>
			<td class="thread_email_time">2 days ago</td>
		</tr>
		<tr class="thread_email_item">
			<td class="thread_email_subject" colspan="2">This is the email subject. Now that you are thinking about.</td>
		</tr>
		<tr class="thread_email_item">
			<td class="thread_email_content" colspan="2">This is the email content. Now that you are thinking about. 
			This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.</td>
		</tr>
	</table>


</div>

</div>

<%@ include file="writer_panel.jsp"  %>

</body>
</html>