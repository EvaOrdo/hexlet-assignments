package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static ArrayList<String> validate(Object obj) {
        var notValidFields = new ArrayList<String>();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (var field : fields) {
            var annotations = field.getDeclaredAnnotations();
            for (var annotation : annotations) {
                if (annotation instanceof NotNull) {
                    field.setAccessible(true);
                    try {
                        Object value = field.get(obj);
                        if (value == null) {
                            notValidFields.add(field.getName());
                        }
                    } catch (IllegalAccessException e) {
//                        continue;
                    }
                }
            }
        }

        return notValidFields;
    }
}
// END
