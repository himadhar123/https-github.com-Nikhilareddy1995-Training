package com.sample;

//making parent and child relationship
public class Sample extends A{
    //auto boxing and auto un-boxing--1.5v
int a=10;
final int b=20;

String name="India";
//whenevr u are not satisfying with parent cls implementation I can give my own implematation
    //run time polymorphism
    @Override
    public void add(int a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        //some memory will allocate for u in heap memory
        //with parent ref we can create child obj
        A sampleObject = new Sample();
        Sample sample=new Sample();
        sample.add(1,2);
        sample.a=200;
        B b=new B();
       sample.sub();
        //final keywords we can't re-assign the values
        //sample.b=1000;

        //with child ref we can't create parent object
        //Sample sample=new A();
       /* A a=new A();
        sampleObject.add();*/


    }
}

class A{
    public void add(int nikhila, int b){
        System.out.println(nikhila+b);
    }
    //we can't overide the method
    public final void sub(){
        System.out.println("nikhila");
    }
}

//we can't inherit
final class B{
    public final void add(int nikhila, int b){
        System.out.println(nikhila+b);
    }
}


