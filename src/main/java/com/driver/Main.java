package com.driver;

public class Main {
       public static void main(String[] args) {
              B obj = new B();
              String ans = obj.meth();

//              B b1 = new B();
//              String ans1 = b1.meth();
              System.out.println(ans);
       }

       public static class A{
              public String meth(){
                     return "Invoking method from class A";
              }
       }
       public static class B extends A{
             @Override
             public String meth(){
                    return "Method is overridden in Extendend class B";
             }
       }
}