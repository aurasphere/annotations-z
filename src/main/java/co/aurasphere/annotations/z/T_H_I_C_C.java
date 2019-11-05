package co.aurasphere.annotations.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates a method or a type that could use some refactoring to reduce
 * cyclomatic complexity.
 * 
 * @author Donato Rimenti
 * @see S_N_A_C_C
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface T_H_I_C_C {

}
