package com.sample;
//default import statement java.lang package

public class StringExample {
   //all wrapper classes(Integer,Double,Float) are final clases incluse String also
    double d=10.0;
    Double d1=20.9;
    String val="10";
    public static void main(String[] args) {
        StringExample stringExample=new StringExample();
        stringExample.hashCode();
        String val="nikhila";//literals--string constant pool
        //String name=new String("India");//new keyword-- SCP as well as in heap memory
        String val1="nikhil";
        String val2="nikhila";
        String val3="Nikhila";
        String name=new String("nikhila");//hashcode
        String name2=new String("nikhila");

        System.out.println(val.equals(val2));
        System.out.println(val.equals(val3));
        System.out.println(val.equalsIgnoreCase(val3));
        //equals-- content comparison
        System.out.println(name.equals(name2));
        //reference comparison
        System.out.println("--------------");
        System.out.println(val==val2);
        System.out.println(name==name2);
        System.out.println("--------");

        //String name2=new String("india");//ASCII codes
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        //String Buffer and String Builder--mutable classes
        //all 1.0version classes synchronized-- it wont support in the multithredaing
        StringBuffer stringBuffer=new StringBuffer("Nikhila");
        StringBuffer stringBuffer2=new StringBuffer("Nikhila");
        System.out.println("***********");
        System.out.println(stringBuffer.equals(stringBuffer2));
        System.out.println(stringBuffer==stringBuffer2);
        System.out.println("***********");


        StringBuffer s=new StringBuffer(stringBuffer);
        System.out.println(s.hashCode());

        StringBuilder stringBuilder=new StringBuilder("India");

        // 1 to 100 --1,2,3,....100 -- 10
        // 1 to 20   //21 to 40  // 41 to 60 // 60 to 80  //81 to 100 -- 2sec
    }
}


