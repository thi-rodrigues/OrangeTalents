package com.zup.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrors extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessages> errors = new ArrayList<>();

	public ValidationErrors() {
	}

	public ValidationErrors(Long timeStamp, Integer status, String erro) {
		super(timeStamp, status, erro);
	}

	public List<FieldMessages> getErrors() {
		return errors;
	}

	public void setErrors(String field, String defaultMessage) {
		this.errors.add(new FieldMessages(field, defaultMessage));
	}
}
