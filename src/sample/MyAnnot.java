package sample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class MyAnnot {
    @Test(a = 5, b = 5)
    public void summa(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    @Target(value = ElementType.METHOD)
    @Retention(value = RUNTIME)
    public @interface Test {
        int a();

        int b();
    }
}
