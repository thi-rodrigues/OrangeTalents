package com.zup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.zup.exceptions.ResourceConstraintViolation;
import com.zup.exceptions.ResourceNotFoundException;
import com.zup.model.Usuario;
import com.zup.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void save(Usuario usuario) {
		usuario.setId(null);
		try {
			usuarioRepository.save(usuario);
		} catch (DataIntegrityViolationException e) {
			throw new ResourceConstraintViolation(e);
		}
	}

	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id));
	}
}
