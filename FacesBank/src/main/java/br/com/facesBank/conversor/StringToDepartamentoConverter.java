package br.com.facesBank.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.facesBank.domain.DepartamentoEntity;
import br.com.facesBank.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, DepartamentoEntity> {
	
	@Autowired
	private DepartamentoService service;

	@Override
	public DepartamentoEntity convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
