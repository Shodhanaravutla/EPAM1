package javaclasses;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        method();
        /*try
        {
            System.out.println(5/0);
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION");
        }
         */
        //throw new TestAutomationException("TestException");
    }
        public static void method() throws IOException {
            throw new IOException("TestException");//it is compiletime exception so it's showing the error
        }

    }

