package com.example.myfirstlibrary;

public class MyCustomClass {
    public static int plus(int a,int b)
    {
        return a+b;

    }

    public static int minus(int a ,int b)
    {
        return a-b;
    }
    public static int times(int a ,int b)
    {
        return a*b;
    }
    public static int div(int a ,int b)
    {
        if(b==0)
        {
            throw  new IllegalArgumentException("Div by Zero error");
        }
        return  a/b;
    }
}
