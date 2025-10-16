package com.ismayilov.spring.mvc.controller.validation;


import javax.validation.Constraint;
import javax.validation.Validation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    String value() default "abc.com";

    String message() default "email must be ends with abc.com";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
