package co.aurasphere.annotations.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates a method with an high chance of failure.
 * 
 * @author Donato Rimenti
 * @see Gucci
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface YOLO {
}