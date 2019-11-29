package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.DepartamentoDao;
import br.com.facesBank.domain.DepartamentoEntity;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<DepartamentoEntity, Long> implements DepartamentoDao {

}
