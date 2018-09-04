/**
 * 
 */


function validate(){
	const form = document.getElementById('Formulario');
	    FormValidation.formValidation(form, {
	        fields: {
	            nome: {
	                validators: {
	                    notEmpty: {
	                        message: 'O nome é obrigatório'
	                    }
	                }
	            },
	            sexo: {
	                validators: {
	                    notEmpty: {
	                        message: 'O sexo é obrigatório'
	                    }
	                }
	            },
	            idade: {
	                validators: {
	                    notEmpty: {
	                        message: 'O sexo é obrigatório'
	                    }
	                }
	            }
	        }
	   }); 
}