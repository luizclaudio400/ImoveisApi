package com.example.imoveis_api.converter;

import com.example.imoveis_api.dto.ImovelDto;
import com.example.imoveis_api.model.Imovel;

public class ImovelConverter {
    public static ImovelDto convertToDTO(Imovel imovel) {
        return new ImovelDto(
                imovel.getId(),
                imovel.getCep(),
                imovel.getEndereco(),
                imovel.getBairro(),
                imovel.getCidade(),
                imovel.getEstado(),
                imovel.getDescricao(),
                imovel.getValor(),
                imovel.getAreaUtil(),
                imovel.getAreaTotal(),
                imovel.getQtdeQuartos(),
                imovel.getQtdeSuites(),
                imovel.getQtdeBanheiros(),
                imovel.getQtdeVagas(),
                imovel.getPiscina(),
                imovel.getAcademia(),
                imovel.getChurrasqueira(),
                imovel.getSalaoFestas(),
                imovel.getPortaria(),
                imovel.getTipoImovel(),
                imovel.getTipoNegocio(),
                imovel.getUsuario() != null ? imovel.getUsuario().getId() : null
        );
    }

    public static Imovel convertToEntity(ImovelDto imovelDTO) {
        return new Imovel(
                imovelDTO.getCep(),
                imovelDTO.getEndereco(),
                imovelDTO.getBairro(),
                imovelDTO.getCidade(),
                imovelDTO.getEstado(),
                imovelDTO.getDescricao(),
                imovelDTO.getValor(),
                imovelDTO.getAreaUtil(),
                imovelDTO.getAreaTotal(),
                imovelDTO.getQtdeQuartos(),
                imovelDTO.getQtdeSuites(),
                imovelDTO.getQtdeBanheiros(),
                imovelDTO.getQtdeVagas(),
                imovelDTO.getPiscina(),
                imovelDTO.getAcademia(),
                imovelDTO.getChurrasqueira(),
                imovelDTO.getSalaoFestas(),
                imovelDTO.getPortaria(),
                imovelDTO.getTipoImovel(),
                imovelDTO.getTipoNegocio()
        );
    }
}
