package com.zup.exceptions;

import java.io.Serializable;

public class FieldMessages implements Serializable {
	private static final long serialVersionUID = 1L;

	private String field;

	private String defaultMessage;

	public FieldMessages() {
	}

	public FieldMessages(String field, String defaultMessage) {
		this.field = field;
		this.defaultMessage = defaultMessage;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}
}
