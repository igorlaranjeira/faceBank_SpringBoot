package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.DepartamentoEntity;

public interface DepartamentoDao {

    void save(DepartamentoEntity departamento);

    void update(DepartamentoEntity departamento);

    void delete(Long id);

    DepartamentoEntity findById(Long id);

    List<DepartamentoEntity> findAll();
}
