package javaQuestions.aristocrat;

class Parent {
    public int a = 5;

    public void display() {
        System.out.println("Inside Parent");
    }
}

class Child extends Parent {
    public int a = 6;

    public void display() {
        System.out.println("Inside Child");
    }
}

class TestMain {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        System.out.println(p.a);
    }
}