package br.com.facesBank.dao;

import org.springframework.stereotype.Repository;

import br.com.facesBank.domain.UsuarioEntity;

@Repository
public class UsuarioDaoImpl extends AbstractDao<UsuarioEntity, Long> implements UsuarioDao {

	@Override
	public UsuarioEntity findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
