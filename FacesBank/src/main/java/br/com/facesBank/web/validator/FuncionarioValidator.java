package br.com.facesBank.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.facesBank.domain.FuncionarioEntity;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return FuncionarioEntity.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		FuncionarioEntity f = (FuncionarioEntity) object;
		
		LocalDate entrada = f.getDataEntrada();
		
		if (f.getDataSaida() != null) {
			if (f.getDataSaida().isBefore(entrada)) {
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
			}
		}
	}

}
