package com.zup.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.dto.EnderecoDTO;
import com.zup.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;

	@PostMapping
	public ResponseEntity<EnderecoDTO> save(@RequestBody @Valid EnderecoDTO enderecoDTO) {
		enderecoService.save(enderecoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoDTO);
	}
}