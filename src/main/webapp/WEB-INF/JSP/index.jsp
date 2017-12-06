<!doctype html>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang='nl'>
	<head>
		<title>Mijn Project</title>
		<link rel='icon' href='images/favicon.ico'>
		<meta name='viewport' content='width=device-width,initial-scale=1'>
		<link rel='stylesheet' href='styles/default.css'>
	</head>
	<body>
		<h2>Mijn Project</h2>
		<c:url value="/resultaat.htm" var="resultaatURL">
			<c:param name="straat" value="jules destréélaan"/>
			<c:param name="huisnummer" value="27"/>
			<c:param name="busnummer" value=""/>
			<c:param name="postcode" value="9050"/>
			<c:param name="gemeente" value="Gentbrugge"/>
		</c:url>
		<a href="${resultaatURL}" title="resultaat">Resultaat</a>
	</body>
</html>
