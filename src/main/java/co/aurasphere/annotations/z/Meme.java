package co.aurasphere.annotations.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates a legacy method or class which exists mostly for historical
 * purposes, to remember our mistakes and prevent future generations from doing
 * making the same errors.
 * 
 * @author Donato Rimenti
 *
 */
@Lit
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.SOURCE)
public @interface Meme {

}
