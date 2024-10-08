class FunctionOverloadingDemo {
    public void display(int num){
        System.out.println("The Number is :"+num);
    }
    public void display(int num1 ,int num2){
        System.out.println("The Number are :"+num1 + " and "+num2);

    }
    public void display(double num){
        System.out.println("The double Number is :"+num);
    }
    public void display(String message){
        System.out.println("The Message is :"+message);
    }
    public static void main(String[] args) {
        FunctionOverloadingDemo demo = new FunctionOverloadingDemo();
        demo.display(5);
        demo.display(10,20);
        demo.display(5.5);
        demo.display("Hello Ajay");
    }
}
