package com.example.imoveis_api.converter;

import com.example.imoveis_api.dto.UsuarioDto;
import com.example.imoveis_api.model.Usuario;

public class UsuarioConverter {
    public static UsuarioDto convertToDTO(Usuario usuario) {
        return new UsuarioDto(
                usuario.getId(),
                usuario.getNome(),
                usuario.getSobrenome(),
                usuario.getDataNascimento(),
                usuario.getProfissao(),
                usuario.getEmail(),
                usuario.getDdd(),
                usuario.getTelefone(),
                usuario.getSenha(),
                usuario.getWhatsapp(),
                usuario.getRecebeInfo(),
                usuario.getDivulgaImovel()  
        );
    }

    public static Usuario convertToEntity(UsuarioDto usuarioDTO) {
        return new Usuario(
                usuarioDTO.getNome(),
                usuarioDTO.getSobrenome(),
                usuarioDTO.getDataNascimento(),
                usuarioDTO.getProfissao(),
                usuarioDTO.getEmail(),
                usuarioDTO.getDdd(),
                usuarioDTO.getTelefone(),
                usuarioDTO.getSenha(),
                usuarioDTO.getWhatsapp(),
                usuarioDTO.getRecebeInfo(),
                usuarioDTO.getDivulgaImovel()
        );
    }
}
