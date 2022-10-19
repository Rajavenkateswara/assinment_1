package Assignment_1;



public class prime_number_task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers from 1-1000 are ");
		for(int i=2;i<=1000;i++){
			int count =0;
			for(int j=1;j<=1000;j++){
				if(i%j==0)
					count++;
				}
			if(count==2)
				System.out.println(i);
			
			
		}
	}

}
