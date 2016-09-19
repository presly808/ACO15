package ua.artcode.home.json_converter;

import java.lang.reflect.Field;

public class ConverterUtils {

    public String convertToJson(Object obj)  {
        Class cl = obj.getClass();

        String toJson = "";

        for (Field field : cl.getFields()) {
            try {
                Class<?> fieldType = field.getType();
                if(!fieldType.isPrimitive() || !(fieldType == String.class)){ // це фігня тут треба спитати чи він вкладений і чи він не стандартний
                    String returnedResult = convertToJson(field);
                    toJson += returnedResult;
                } else {
                    toJson += "\"" + field.getName() + "\":" + "\"" + field.get(obj) + "\",";
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return toJson;
    }
}
