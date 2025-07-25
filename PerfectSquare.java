class PerfectSquare{
	public static void main(String[] args) {
		int num=25;
		boolean flag=false;

		for(int i=1;i<=num;i++){
			System.out.println("i:"+i);
			if(i*i==num){
				flag=true;
				break;
				
			}
		}
			if(flag){
				System.out.println("PerfectSquare");
			}
			else{
				System.out.println("NOT PerfectSquare");
			}
			
		}

	}
