class Demo {
	int a;
	int b;
			
	Demo(){
		this.a = 10;
		this.b = 20;
    }
	
	void display() {
		System.out.println(a + " " + b);
	}
			
}


class Test{
	public static void main(String[] args) {
		Demo in = new Demo();
		in.display();
				
	}

}


