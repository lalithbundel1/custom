<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>


<template:page pageTitle="${pageTitle}">

<style>

.right-panel{
margin-top:12em;
}

@media  (max-width: 639px){
		.right-panel{
		margin-top:0;
		}
}
</style>
	<div class="wrapper">
			<cms:pageSlot position="Section1" var="feature" element="div"
				class="left-article-panel blogPage  col-md-8 col-sm-8">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		
			<cms:pageSlot position="Section3" var="feature" element="div"
				class="right-panel  col-md-3 col-md-offset-1  col-sm-4 " >
				<cms:component component="${feature}" />
			</cms:pageSlot>
	</div>
	
</template:page>