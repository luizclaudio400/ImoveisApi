package com.example.imoveis_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.imoveis_api.converter.ImovelConverter;
import com.example.imoveis_api.dto.ImovelDto;
import com.example.imoveis_api.model.Imovel;
import com.example.imoveis_api.service.ImovelService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @PostMapping
    public ImovelDto createImovel(@RequestBody ImovelDto imovelDto) {
        Imovel imovel = ImovelConverter.convertToEntity(imovelDto);
        Imovel savedImovel = imovelService.save(imovel);
        return ImovelConverter.convertToDTO(savedImovel);
    }

    @GetMapping("/cep/{cep}")
    public List<ImovelDto> getImoveisByCep(@PathVariable String cep) {
        return imovelService.findByCep(cep).stream()
                .map(ImovelConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/bairro/{bairro}")
    public List<ImovelDto> getImoveisByBairro(@PathVariable String bairro) {
        return imovelService.findByBairro(bairro).stream()
                .map(ImovelConverter::convertToDTO)
                .collect(Collectors.toList());
    }
}

