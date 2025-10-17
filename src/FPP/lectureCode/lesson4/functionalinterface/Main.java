package FPP.lectureCode.lesson4.functionalinterface;

class Test implements MyFunctional{
    @Override
    public void myMethod(String t) {
        System.out.println(" DESDE LA CLASE TEST: " + t);
    }
}
public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.myMethod("HOLA MUNDO");

        MyFunctional f = new  MyFunctional (){
            @Override
            public void myMethod(String t) {
                System.out.println(t);
            }

        };
        f.myMethod("functiontional Interface HOLA MUNDO");

        MyFunctional f2 = (t) -> {
            System.out.println(t);
        };
        f2.myMethod("LAMBDA HOLA MUNDO");


    }
}
