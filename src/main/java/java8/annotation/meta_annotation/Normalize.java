package java8.annotation.meta_annotation;

import java.lang.annotation.*;

/**
 * Created by hoangtd on 8/11/2017.
 */

@Documented
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Normalize {
}
