class Prime{
	public static void prime(int a){
		for(int i=1;i<=a;i++){		
			if(a%a==0&&a%i==0){
				System.out.println("it is a Prime Number");
			}else{
				System.out.println("not a prime number");
			}
		}
	}
	public static void test(){
		int i = 9;
		if(i%i==0&&i%2==0){
			System.out.println("it is not a Prime, it's a lolai");
		}else{
			System.out.println("It is a Prime");
		}
	}
	public static void main(String[] args) {
		// test();
		prime(9);
	}
}