package com.examples.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.examples.models.Employee;

@Component
public class NameValidator implements Validator {

	@Override
	public boolean supports(Class<?> obj) {
		return Employee.class.isAssignableFrom(obj);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"employeeName","name.required");
		Employee emp=(Employee)target;
		if(!emp.getEmployeeName().matches("Genji|Hanzo|Ana|Zarya|Reaper")){
			System.out.println("I m in if");
			errors.rejectValue("employeeName","name.correct");
		}
		else {
			System.out.println("I m in else");
		}
	}

}
