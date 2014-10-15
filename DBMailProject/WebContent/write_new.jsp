<html >
<head>
	<meta name="viewport" content="width=device-width" />
	<link rel="stylesheet" type="text/css" href="css/dbmail_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_navbar_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_login_design.css">
	<link rel="stylesheet" type="text/css" href="css/dbmail_email_design.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/writer.js"></script>

</head>
<body style="padding-top: 160px; padding-bottom: 30px;">
<div class="navbar navbar_wide">
<img src="images/dbmail_logo.png" class="dbmail_logo">
<div class="sub_navbar sub_navbar_wide">
<ul class="navigation_menu">
<li><a href="write_new.jsp">
<table class="navigation_table navigation_table_active">
<tr>
	<td><img src="images/icons/compose.png" style="height: 20px;"></td>
	<td>Compose</td>
</tr>
</table></a>
</li>
<li><a href="inbox.jsp">
<table class="navigation_table">
<tr>
	<td><img src="images/icons/folder.png" style="height: 20px;"></td>
	<td>Inbox</td>
</tr>
</table></a>
</li>
<li><a href="outbox.jsp">
<table class="navigation_table">
<tr>
	<td><img src="images/icons/gps.png" style="height: 20px;"></td>
	<td>Outbox</td>
</tr>
</table></a>
</li>
<li><a href="logout.jsp">
<table class="navigation_table">
<tr>
	<td><img src="images/icons/power.png" style="height: 20px;"></td>
	<td>Logout</td>
</tr>
</table></a>
</li>
</ul>
</div>

</div>

<div class="email_creator">
	<form class="email_form">
		<input class="email_input" type="text" placeholder="Send To">
		<input class="email_input" type="text" placeholder="Bcc">
		<input class="email_input" type="text" placeholder="Subject">
		<textarea class="email_textarea" placeholder="Email"></textarea>
		<input class="submit_button" type="submit" value="Send">
	</form>
</div>

<div class="credits_navbar">
DBMail &copy; 2014
</div>
</body>
</html>