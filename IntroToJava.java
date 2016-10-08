#HTMl 
<!-- This is my HTML note -->


<!-- Notes begin here -->
<!DOCTYPE html> <!--This is how to start a html doc. It lets the system know you're writing java -->

<html> </html>  <!--You need this right after the <!doctype html> -->

<head> </head> <!-- head contains information like title for eg. See lines 15 to 17 to see our title -->

<head> 
  <title> "This is a title" </title> 
</head>

<body> </body> <!-- This introduces the body of the program -->
<p> </p>  <!-- This creates a paragraph inside the body -->

<h1> </h1> <!-- This creates the boldest heading. Increase the number and have smaller headings-->

<a href ="link">description </a> <!-- This creates a link and a description of the link-->

<img src ="img link" /> <!-- This uploads an image-->

<a href ="link"> 
  <img src= "img link" />    <!-- Lines 28 to 30 makes the img clickable and redirects the image to the link -->
</a> 

<ol> </ol> <!-- creates ordered list -->
  <li></li> <!-- this wraps up the list -->
  
<ul> <ul> <!-- creates unordered list -->

<!-- Note that you can have UL nested inside OL and vice versa -->

<p style ="font-size: 10px"> text </p> <!--This makes the font size of text 10px-->
<p style ="color: red; font-size; 10px"> text </p> <!--This turns text to red and makes size 10px-->

<body style="background-color: green"> </body> <!-- This turns the background color of the page green-->
<h3 style="text-align: left">text </h3> <!--This aligns text to the left side of the page -->
<strong> </strong> <!--This makes the a text bold -->
<em> </em> <!--This italicizes a word-->

<!--TABLES -->
<table> </table> <!--Always add this tag before creating a table -->
  <tr> </tr> <!-- This is added in between table tags and it creates a row -->
  <tr> </tr> <!-- More tr you add, more rows you create -->
    <td> boy </td> <!--In between tr,you can add a table date "boy" using the <td> -->
    <td> frank </td> <!-- You can add another table data, making it a 2nd column -->
<thead> <!-- This formats the heading -->
<th> <!--This creates bold header-->
<tbody> <!-- creates body of table -->
<th colspan ="2"> <!-- Makes the header occupy two columns -->

<dv></dv> <!-- This divides webpage into containers (boxes). They can be styled up. Check following lines-->
<div style= "width: 10px; height: 10px; background color: red"> </div>
<a href>  <!-- put div in between this to link the container-->

<span> <!-- use span to style a text -->

<!-- SAMPLE PROJECT THAT CREATES A clickable PHOTO ALBUM -->
<!-- Add photo links and href to see magic-->

<!DOCTYPE html>
<html>
	<head>
		<link type="text/css" rel="stylesheet" href="stylesheet.css" />
		<title>My Photo Page</title>
	</head>
	<body>
	    <table>
	    <thead>
	        <th>Check</th>
	    </thead>
	        <tbody>
	            <tr>
	                <td></td><td></td><td></td>
	            </tr>
	            <tr>
	                <td></td><td></td><td></td>
	            </tr>
	            <tr>
	                <td></td><td></td><td></td>
	            </tr>
	        </tbody>
	    </table>
	</body>
</html>
	
<!-- HOW TO CREATE A WEBSITE-->
<!-- Use the format explained earlier -->
<!-- Open textedit, add your codes-->
<!-- Save as, select all files and save with .html-->
	
<input type=“email” placeholder=“Your email”> <!--This collects email information of users-->
<input type="Submit"> <!-- This is the submit button-->
