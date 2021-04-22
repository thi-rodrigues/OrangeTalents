package com.zup.exceptions;

public class ResourceConstraintViolation extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceConstraintViolation(Object o) {
		super("Usuário já cadastrado!");
	}
}
