package co.aurasphere.annotations.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates an element which may have an excessive granularity (e.g.
 * nanoservices or anemic domain model anti-pattern).
 * 
 * @author Donato Rimenti
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.SOURCE)
public @interface Smol {
}