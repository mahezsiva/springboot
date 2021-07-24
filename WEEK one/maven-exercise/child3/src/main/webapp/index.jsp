<html>
<body>
<h2>Displaying the date</h2>

<script>
function displayDate(){
	document.getElementById("showDate").innerHTML=Date();
}

</script>
<button type="button" onClick="displayDate()">Show date</button>
<p id="showDate"></p>

</body>
</html>
