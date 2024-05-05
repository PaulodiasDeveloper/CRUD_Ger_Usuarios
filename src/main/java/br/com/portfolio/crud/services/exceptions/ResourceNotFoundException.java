package br.com.portfolio.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(Object id) {
		super("Não foi possível localizar o usuário com o id: " + id);
	}

}
