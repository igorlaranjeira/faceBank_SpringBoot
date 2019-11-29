package br.com.facesBank.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.facesBank.dao.AbstractDao;
import br.com.facesBank.dao.UsuarioDao;
import br.com.facesBank.domain.UsuarioEntity;

@Repository
public class UsuarioDaoImpl extends AbstractDao<UsuarioEntity, Long> implements UsuarioDao {

	@Override
	public UsuarioEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
