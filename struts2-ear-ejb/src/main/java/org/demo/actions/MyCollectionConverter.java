package org.demo.actions;

import com.opensymphony.xwork2.conversion.TypeConverter;
//import com.opensymphony.xwork2.conversion.impl.CollectionConverter;

import java.lang.reflect.Member;
import java.util.Map;

//import com.opensymphony.xwork2.conversion.impl.CollectionConverter;

/**
 * TODO lukaszlenart: add a comment
 */
public class MyCollectionConverter implements TypeConverter {

    //private CollectionConverter conv;

    public MyCollectionConverter() {
        //conv = new CollectionConverter();
    }

    @Override
    public Object convertValue(Map<String, Object> context, Object target, Member member, String propertyName, Object value, Class toType) {
        //return conv.convertValue(context, target, member, propertyName, value, toType);
        return null;
    }

}
