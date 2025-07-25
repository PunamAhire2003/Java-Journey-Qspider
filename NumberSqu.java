class NumberSqu{
	public static void main(String[] args) {
		int num=9534621;
		int rem;
		int count=0;

		while(num>0){
			rem=num%10;
			if(rem%3==0||rem%5==0){
				count++;
			}
			num/=10;
		}
		System.out.println("number of 3 and 5 multiplyer " + count);


		
	}
}
			
			
				
			
		
	
