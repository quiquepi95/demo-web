<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<section>
			<article>
				<form action="hola.jsp" name="form" method="post"
					class="contact_form">

					<ul>
						<li class="ultima"><label for="user">Usuario:</label> <input
							type="user" name="NOM" id="user" required
							title="Tienes que escribir tu usuario"
							placeholder="Usuario" /></li>
						<li>
							<button class="submit" type="submit">Enviar</button>
						</li>
					</ul>
				</form>

			</article>
		</section>
	</div>
</body>
</html>