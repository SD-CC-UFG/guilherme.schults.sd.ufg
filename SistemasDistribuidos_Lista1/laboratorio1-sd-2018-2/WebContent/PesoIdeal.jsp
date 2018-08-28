<!DOCTYPE html>
<html>
<head>
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Cálculo do Peso Ideal</title>
	<style type="text/css"></style>
	
<body>
	<div class ="row-fluid">		
		<div class="col-md-4 col-md-offset-4" id="painel-meio">
		    <div class="panel panel-default" style="margin-top: 84px;">
		    	<div class="panel-heading"> 
		    		<h1>Cálculo do Peso Ideal</h1>                               
		        </div>
		        <div class="panel-body">
		     		<div class="col-xs-2" style="margin-top: -15px;">
			        	<h3><small>Altura</small></h3>
			        	<h3><small>Sexo</small></h3>				         	 
			        </div>
			        <form action="PesoIdealCt" method="POST">
				        <div class="col-xs-8"> 
				        	<input class="form-control" type="text" name="altura"  placeholder="Nome" id= "altura" required oninvalid="setCustomValidity('Por favor, preencha o nome')" onchange="try{setCustomValidity('')}catch(e){}" autofocus="" style="margin-bottom: 10px;">
				        	<input class="form-control" type="text" name="sexo"  placeholder="Sexo" id = "sexo" required oninvalid="setCustomValidity('Por favor, informe o cargo')" onchange="try{setCustomValidity('')}catch(e){}" style="margin-bottom: 10px;">
				      	</div>
				      	<div class= "col-xs-12">
				        		<button type="submit" class="btn btn-primary btn-lg btn-block" name="btn-calc" value="calc">Calcular</button>
				        		
				        </div> 
			        </form>	 
		        </div>
		    </div>
		    
		    				<div class="div col-xs-12">
		    					<strong>
			    					<%if(request.getAttribute("resultado")!=null){ %>
										<%=request.getAttribute("resultado")%>
									<% } %>
								</strong>
							</div>
		</div>
	</div>		
</body>
</html>