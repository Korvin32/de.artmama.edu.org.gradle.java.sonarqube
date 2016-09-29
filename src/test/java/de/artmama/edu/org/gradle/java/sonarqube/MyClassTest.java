package de.artmama.edu.org.gradle.java.sonarqube;

import org.junit.Test;

public class MyClassTest {

    @Test
    public void testShowValue() {
        int value = 3;
        MyClass myClass = new MyClass(value);
        myClass.showValue();
    }

}