<html>
<head>
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Cálculo de Maioridade</title>
	<style type="text/css"></style>
	
<body>
	<div class ="row-fluid">		
		<div class="col-md-4 col-md-offset-4" id="painel-meio">
		    <div class="panel panel-default" style="margin-top: 84px;">
		    	<div class="panel-heading"> 
		    		<h1>Cálculo de Maioridade</h1>                               
		        </div>
		        <div class="panel-body">
		     
					<form id="Formulario"" role="form" action="CalculaMaioridadeCt" method="POST">
						<div class="form-group" >
							<label for="email">Nome:</label>
							<input class="form-control" type="text" name="nome"  placeholder="Nome" id="nome" required oninvalid="setCustomValidity('Por favor, informe seu nome')" onchange="try{setCustomValidity('')}catch(e){}" autofocus=""  style="margin-bottom: 10px;">
						</div>
						<div class="form-group">
							<label for="pwd">Sexo:</label>
							<input class="form-control" type="text" name="sexo"  placeholder="M ou F" id="sexo" required oninvalid="setCustomValidity('Por favor, informe seu sexo')" onchange="try{setCustomValidity('')}catch(e){}" autofocus="" style="margin-bottom: 10px;">						
						</div>
						<div class="form-group">
							<label for="pwd">Idade:</label>
							<input class="form-control" type="text" name="idade" placeholder="Idade" id="idade" required oninvalid="setCustomValidity('Por favor, informe sua idade')" onchange="try{setCustomValidity('')}catch(e){}" autofocus="" style="margin-bottom: 10px;">						
						</div>						
						<div class= "col-xs-12">
				        		<button type="submit" class="btn btn-primary btn-lg btn-block" name="btn-calc" value="calc">Calcular</button>			        		
				        </div> 
					</form>
				</div>
		    </div>
		    
		    			 	<div class="div col-xs-12">
		    					<%if(request.getAttribute("resultado")!=null){ %>
									<%=request.getAttribute("resultado")%>
								<% } %>
							</div> 
							
							
		</div>
	</div>	
<script src="js/validate.js"></script>
			
</body>
</html>