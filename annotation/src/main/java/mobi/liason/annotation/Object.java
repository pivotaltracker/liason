package mobi.liason.annotation;

/**
 * Created by Emir Hasanbegovic on 09/10/14.
 */
public @interface Object {
    String value();
    boolean isArray() default false;
}
