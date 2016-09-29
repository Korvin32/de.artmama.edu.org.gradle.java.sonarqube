package de.artmama.edu.org.gradle.java.sonarqube;

public class MyClass {
    private int value;
    
    public MyClass(int value) {
        this.value = value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void showValue() {
        System.out.println("The value is: " + getValue());
    }
    
    public static void main(String[] args) {
        int inputValue = Integer.valueOf(args[0]);
        MyClass myClass = new MyClass(inputValue);
        myClass.showValue();
    }
}