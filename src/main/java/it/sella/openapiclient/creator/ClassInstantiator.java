package it.sella.openapiclient.creator;

public class ClassInstantiator {
    public static final String CLASS_INSTANTIATION_ERROR = "Could not instantiate class";
    public static final String TECHNICAL_PROBLEM = "Technical Problem Occured";
    
    public static <Type> Type createInstance(final String className) {
        try {
            return (Type) loadClass(className).newInstance();
        } catch (final IllegalAccessException e) {
            throw new ClassInstantiatorException(
                    CLASS_INSTANTIATION_ERROR, e);
        } catch (final InstantiationException e) {
            throw new ClassInstantiatorException(e.getMessage(), e);
        }
    }

    @SuppressWarnings("rawtypes")
    public static Class loadClass(final String className) {
        try {
            return Class.forName(className);
        } catch (final ClassNotFoundException e) {
            throw new ClassInstantiatorException(
                    TECHNICAL_PROBLEM, e);
        }
    }
}
