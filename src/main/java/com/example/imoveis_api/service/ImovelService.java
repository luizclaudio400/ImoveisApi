package com.example.imoveis_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.imoveis_api.model.Imovel;
import com.example.imoveis_api.repository.ImovelRepository;

import java.util.List;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    public Imovel save(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public List<Imovel> findByCep(String cep) {
        return imovelRepository.findByCep(cep);
    }

    public List<Imovel> findByBairro(String bairro) {
        return imovelRepository.findByBairro(bairro);
    }
}
