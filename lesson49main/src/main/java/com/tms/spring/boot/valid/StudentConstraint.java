package com.tms.spring.boot.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentConstraint {

    String message() default "pass validation failed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
