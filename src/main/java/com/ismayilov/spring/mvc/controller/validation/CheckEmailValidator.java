package com.ismayilov.spring.mvc.controller.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfMail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfMail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredEmail, ConstraintValidatorContext constraintValidatorContext) {
        return enteredEmail.endsWith(endOfMail);
    }
}
