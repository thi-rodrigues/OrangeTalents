package com.zup.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Usuario de ID: " + id + " não encontrado!");
	}
}
