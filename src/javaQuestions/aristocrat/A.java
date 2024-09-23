package javaQuestions.aristocrat;

public abstract class A {
    abstract void displayA();
}

abstract class B extends A {
    abstract void displayB();
}

//compile time is thrown as this class c need to give the imp of display B and display A
//class C extends B {
//}