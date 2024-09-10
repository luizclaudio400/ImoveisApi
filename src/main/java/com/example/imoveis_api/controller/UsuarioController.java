package com.example.imoveis_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.imoveis_api.converter.UsuarioConverter;
import com.example.imoveis_api.dto.UsuarioDto;
import com.example.imoveis_api.model.Usuario;
import com.example.imoveis_api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuarioDto createUsuario(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuario = UsuarioConverter.convertToEntity(usuarioDto);
        Usuario savedUsuario = usuarioService.save(usuario);
        return UsuarioConverter.convertToDTO(savedUsuario);
    }
}
