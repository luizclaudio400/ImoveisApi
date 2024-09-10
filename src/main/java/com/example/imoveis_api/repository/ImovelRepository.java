package com.example.imoveis_api.repository;

import com.example.imoveis_api.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    List<Imovel> findByCep(String cep);
    List<Imovel> findByBairro(String bairro);
}
