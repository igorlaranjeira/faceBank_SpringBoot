package br.com.facesBank.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.facesBank.domain.CargoEntity;
import br.com.facesBank.service.CargoService;

@Component
public class StringToCargoConversor implements Converter<String, CargoEntity> {

	@Autowired
	private CargoService service;
	
	@Override
	public CargoEntity convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}
}
