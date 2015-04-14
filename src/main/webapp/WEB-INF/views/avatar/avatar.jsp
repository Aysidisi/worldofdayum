<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<body>
		<table>
			<tr>
				<td>
					Name:
				</td>
				<td>
					 ${avatar.name}
				</td>
			</tr>
			<tr>
				<td>
					Geschlecht:
				</td>
				<td>
					<c:choose>
							<c:when test="${avatar.male}">
								M�nnlich
							</c:when>
							<c:otherwise>
								Weiblich
							</c:otherwise>
						</c:choose>
				</td>
			</tr>
			<tr>
				<td>
					<a href="${pageContext.request.contextPath}/avatars/select/${avatar.id}"><button>Ausw�hlen</button></a>
				</td>
				<td>
					<a href="${pageContext.request.contextPath}/avatars/"><button>Zur�ck</button></a>
				</td>
			</tr>
		</table>
	</body>
</html>