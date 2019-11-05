package co.aurasphere.annotations.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates a method or a class which doesn't require any refactoring.
 * 
 * @author Donato Rimenti
 * @see T_H_I_C_C
 *
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.SOURCE)
public @interface S_N_A_C_C {

}
