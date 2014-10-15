<html >
<head>
	<meta name="viewport" content="width=device-width" />
	<link rel="stylesheet" type="text/css" href="css/dbmail_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_navbar_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_login_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_thread_design.css">

	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/writer.js"></script>

</head>
<body style="padding-top: 160px; padding-bottom: 30px;">
<div class="navbar navbar_wide">
<img src="images/dbmail_logo.png" class="dbmail_logo">

<div class="sub_navbar sub_navbar_wide">
<ul class="navigation_menu">
<li id="show_email_creator">
<table class="navigation_table">
<tr>
	<td class="nav_tr"><img src="images/icons/compose.png" style="height: 20px;"></td>
	<td class="nav_tr">Compose</td>
</tr>
</table>
</li>
<li><a href="inbox.jsp">
<table class="navigation_table">
<tr>
	<td class="nav_tr"><img src="images/icons/folder.png" style="height: 20px;"></td>
	<td class="nav_tr">Inbox</td>
</tr>
</table></a>
</li>
<li><a href="outbox.jsp">
<table class="navigation_table">
<tr>
	<td class="nav_tr"><img src="images/icons/gps.png" style="height: 20px;"></td>
	<td class="nav_tr">Outbox</td>
</tr>
</table></a>
</li>
<li><a href="logout.jsp">
<table class="navigation_table">
<tr>
	<td class="nav_tr"><img src="images/icons/power.png" style="height: 20px;"></td>
	<td class="nav_tr">Logout</td>
</tr>
</table></a>
</li>
</ul>
</div>
</div>

<div class="email_list">
	<table class="email_table">
		<tr class="email_item">
			<td class="email_source">Bijoy Singh Kochar</td>
			<td class="email_time">2 days ago</td>
		</tr>
		<tr class="email_item">
			<td class="email_subject" colspan="2">This is the email subject. Now that you are thinking about.</td>
		</tr>
		<tr class="email_item">
			<td class="email_content" colspan="2">This is the email content. Now that you are thinking about. 
			This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.</td>
		</tr>
	</table>
	

	<div class="email_creator">
		<form class="email_form">
			<input class="email_input" type="text" placeholder="Send To">
			<textarea class="email_textarea" placeholder="Message"></textarea> 
			<input class="submit_button" type="submit" value="Send">
			<input class="submit_button" type="reset" value="Discard">
	</div>

	<table class="email_table email_read">
		<tr class="email_item">
			<td class="email_source">Bijoy Singh Kochar</td>
			<td class="email_time">2 days ago</td>
		</tr>
		<tr class="email_item">
			<td class="email_subject" colspan="2">This is the email subject. Now that you are thinking about.</td>
		</tr>
		<tr class="email_item">
			<td class="email_content" colspan="2">This is the email content. Now that you are thinking about. 
			This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.</td>
		</tr>
	</table>
	<table class="email_table email_read">
		<tr class="email_item">
			<td class="email_source">Bijoy Singh Kochar</td>
			<td class="email_time">2 days ago</td>
		</tr>
		<tr class="email_item">
			<td class="email_subject" colspan="2">This is the email subject. Now that you are thinking about.</td>
		</tr>
		<tr class="email_item">
			<td class="email_content" colspan="2">This is the email content. Now that you are thinking about. 
			This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.
			This is the email content. Now that you are thinking about.This is the email content. Now that you are thinking about.</td>
		</tr>
	</table>

</div>

</div>
<div class="email_creator" id="email_creator">
<div class="email_creator_title">
Compose New Message
<span id="hide_email_creator" class="email_title_buttons">&#9747;</span>
<span id="minimise_email_creator" class="email_title_buttons">-</span>
</div>
<div id="email_creator_content" class="email_creator_content">
	<form class="email_form">
		<input class="email_input" type="text" placeholder="Send To">
		<input class="email_input" type="text" placeholder="Bcc">
		<input class="email_input" type="text" placeholder="Subject">
		<textarea class="email_textarea" placeholder="Email"></textarea>
	</form>
	<button class="submit_button" id="send_email">Send</button>
</div>
</div>

</body>
</html>