package shivam.functionalinterface;

public class TestCalci{
       public static void main(String[] args) {
           FunctionalCalci calci=(x,y)->x+y;
           int add = calci.abstractMethod(3, 4);
           calci.display(add);

           FunctionalCalci.greet();

           MyFunctionalInterface func=()->System.out.println("lambda exp..");
           func.singleAbstractMethod();
       }
   }