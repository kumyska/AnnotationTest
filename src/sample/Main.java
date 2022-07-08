package sample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class Main {
    public static void main(String[] args) {
        MyAnnot demo = new MyAnnot();
        final Class<?> cls = MyAnnot.class;
        Method[]methods = cls.getDeclaredMethods();
        for(Method method:methods){
            if(method.isAnnotationPresent(MyAnnot.Test.class)){
                MyAnnot.Test annot = method.getAnnotation((MyAnnot.Test.class));
                demo.summa(annot.a(), annot.b());

            }

        }
    }
}










