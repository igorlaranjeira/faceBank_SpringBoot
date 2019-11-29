package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.CargoDao;
import br.com.facesBank.domain.CargoEntity;

@Repository
public class CargoDaoImpl extends AbstractDao<CargoEntity, Long> implements CargoDao {

}
