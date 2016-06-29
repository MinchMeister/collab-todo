<ol>
	<g:each var="todo" in="${todos}">
		<li>${todo?.name}
			<g:if test="${todo.note}">- </g:if>
			${todo?.note}
		</li>
	</g:each>
</ol>