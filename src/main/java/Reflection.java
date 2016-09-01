import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Alexandr on 26.08.2016.
 */
public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Dolly dolly = new Dolly("black", 4);
        System.out.println("class ->type of object:" + dolly.getClass().getName());

        Class dollyClass = dolly.getClass();

        System.out.println("Methods ---->>");

        Method[] methods = dollyClass.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
            if (method.getName().equals("Be"))
                method.setAccessible(true);
                method.invoke(dolly, null);
        }

        System.out.println("Fields ---->>");


        Field[] declaredFields = dollyClass.getDeclaredFields();
        for (Field field: declaredFields) {
            field.setAccessible(true);
            try {field.set (dolly,"new value");} catch (RuntimeException e){
                System.out.println("Wrong value");
            }
            System.out.println(field.get(dolly));
            System.out.println(field.getName());
        }

        System.out.println("Constructor ---->>");

        Constructor [] constructors = dollyClass.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
        }

        Constructor constructor = dollyClass.getConstructor(new Class[]{String.class, int.class});
        Dolly dolly2 = (Dolly) constructor.newInstance("dolly2", 3);
        System.out.println(dolly2);


    }
}
