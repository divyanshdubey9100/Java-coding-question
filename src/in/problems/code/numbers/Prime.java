package in.problems.code.numbers;

public class Prime {
	
	public static boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}else if(num ==2) {
			return true;
		}
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num % i ==0) 
					return false;
			}
		return true;
	}
	public static void generatePrime(int size) {
		for(int i=1;i<=size;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Prime.generatePrime(50);
	}

}
