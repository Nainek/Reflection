package ua.training.controller;

import ua.training.view.View;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ReflectionRunner {

    View view = new View();
    private  String className;
    private  Class clazz;
    private Object someObject;
    public ReflectionRunner() {
        className = "ua.training.model.windows.Window";
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            someObject =  clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectionRunner reflectionRunner = new ReflectionRunner();
        reflectionRunner.printSuperclassSimpleName();

//        reflectionRunner.printFieldsWithTypeAndAnnotations();
//        reflectionRunner.printModifiers();
//        reflectionRunner.printMethodsWithTypesAndAnnotations();
//        reflectionRunner.printAnnotations();
//        reflectionRunner.printImplementedInterfaces();
//        reflectionRunner.printConstructors();
//        reflectionRunner.printPackageAndSimpleName();
//        reflectionRunner.invokeMethodWithAnnotation();
    }

    public void printConstructors(){
        Constructor[] constructors = clazz.getConstructors();
        view.printInNewLineMessage("Constructors:");
        for(Constructor constructor : constructors){
            view.printMessage(constructor.toString());
        }
    }

    public void printModifiers(){
        view.printInNewLineMessage("Modifiers: ");
        int mods = clazz.getModifiers();
        if (Modifier.isPublic(mods)) {
            view.printMessage("public");
        }
        if (Modifier.isAbstract(mods)) {
            view.printMessage("abstract");
        }
        if (Modifier.isFinal(mods)) {
            view.printMessage("final");
        }
    }

    public void printPackageAndSimpleName(){
        Package aPackage = clazz.getPackage();
        view.printInNewLineMessage("Package:");
        view.printMessage(aPackage.toString());
        view.printInNewLineMessage("Simple Name:");
        view.printMessage(clazz.getSimpleName());
    }

    public void printSuperclassSimpleName(){
        view.printInNewLineMessage("Superclass Simple Name:");
        view.printMessage(clazz.getSuperclass().getSimpleName());

    }

    public void printAnnotations(){
        Annotation[] annotations = clazz.getAnnotations();
        view.printInNewLineMessage("Annotations:");
        for(Annotation annotation : annotations){
            view.printMessage(annotation.getClass().getSimpleName());
        }
    }

    public void printImplementedInterfaces(){
        Class [] interfaces = clazz.getInterfaces();
        view.printInNewLineMessage("Implemented Interfaces:");
        for(Class interf : interfaces){
            view.printMessage(interf.getSimpleName());
        }
    }

    public void printMethodsWithTypesAndAnnotations(){
        Method[] methods = clazz.getDeclaredMethods();
        view.printInNewLineMessage("Fields:");
        for(Method method : methods){
            view.printInNewLineMessage("Name:" + method.getName()+"Return Type: "+method.getReturnType());
            Annotation [] annotations = method.getAnnotations();
            TypeVariable<Method>[] parameters = method.getTypeParameters();
            for(TypeVariable parameter : parameters){
                view.printInNewLineMessage(parameter.getName());
            }
            for(Annotation annotation : annotations){
                view.printMessage("Annotation:" + annotation.getClass().getSimpleName());
            }
        }
    }

    public void printFieldsWithTypeAndAnnotations(){
        Field[] fields = clazz.getDeclaredFields();
        view.printInNewLineMessage("Fields:");
        for(Field field : fields){
            view.printInNewLineMessage("Field Name: " + field.getName()+" Type: "+ field.getType());
            Annotation [] annotations = field.getAnnotations();
            for(Annotation annotation : annotations){
                view.printMessage("Annotation:" + annotation.getClass().getSimpleName()+" ");
                view.printInNewLineMessage("");
            }
        }
    }

    public void invokeMethodWithAnnotation() {
        for( Method m : clazz.getMethods() ){
            if( m.isAnnotationPresent(RunnableMethod.class)){
                Object obj = null;
                try {
                    obj = m.invoke(someObject);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                if( obj!= null){
                    System.out.println(obj);
                }
            }
        }
    }

}