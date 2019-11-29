package br.com.facesBank.dao;

import java.util.List;

import br.com.facesBank.domain.CargoEntity;

public interface CargoDao {

    void save(CargoEntity cargo );

    void update(CargoEntity cargo);

    void delete(Long id);

    CargoEntity findById(Long id);

    List<CargoEntity> findAll();
}
