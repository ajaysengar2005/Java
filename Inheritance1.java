class A {

    void sum(int a, int b){
        System.out.println("Sum is : "+ (a+b) );
    }
}


class B extends A {
    void mul(int a, int b){
        System.out.println("Multiplication is : "+ a*b );
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.mul(2, 4);
        obj.sum(4,5);
    }
}
