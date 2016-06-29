<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="layout" content="main" />
		<title>Todo Find</title>
		<g:javascript library="jquery" />
	</head>
	<body>
	
		<br/><br/>
		<h2>Post Search</h2>
	
		<g:form controller="todo" method="post" >
			<input type='text' name='value' value="${value}" />
			<g:actionSubmit value="Search" />
		</g:form>
	
		Results:
	
		<ol>
			<g:each var="todo" in="${todos}">
				<li>${todo?.name}
					<g:if test="${todo.note}">- </g:if>
					${todo?.note}
				</li>
			</g:each>
		</ol>
		
		<h2>Ajax Search</h2>
		
		<g:formRemote name="remoteSearch"
				url="[controller:'todo',action:'remoteSearch']"
				update="[success:'results', failure:'error']" >
			<input type='text' name='value' value="${value}" />
			<g:submitButton name="search" value="Search" />
		</g:formRemote>
		
		<div id="error"></div>
		Results:
		<div id="results"></div>
	
	</body>
</html