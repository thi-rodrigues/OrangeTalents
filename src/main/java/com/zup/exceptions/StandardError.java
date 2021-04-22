package com.zup.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long timeStamp;
	private Integer status;
	private String erro;

	public StandardError() {
	}

	public StandardError(Long timeStamp, Integer status, String erro) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.erro = erro;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}
}
