package com.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.dto.EnderecoDTO;
import com.zup.model.Endereco;
import com.zup.model.Usuario;
import com.zup.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private UsuarioService usuarioService;

	public Endereco save(EnderecoDTO dto) {
		Usuario usuario = usuarioService.findById(dto.getUsuarioId());
		
		Endereco endereco = new Endereco(null, dto.getLogradouro(), dto.getNumero(), dto.getComplemento(), dto.getBairro(), 
				dto.getCidade(), dto.getEstado(), dto.getCep(), usuario);

		return new Endereco(enderecoRepository.save(endereco));
	}
}


