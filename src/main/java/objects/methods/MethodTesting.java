package main.java.objects.methods;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class MethodTesting {

    public static void staticHello() {
        System.out.println("ballons be all staticky");
    }

    public int multiply ( int a, int b) {
        return a * b;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public String getGreeting(){
        return "Hey, how are ya?";
    }

    public void customGreeting(String greeting) {
        System.out.println(greeting);
    }
}


