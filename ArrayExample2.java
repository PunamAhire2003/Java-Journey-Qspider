class ArrayExample2{
	public static void main(String[] args) {
		int[]arr={10,25,30,47,50};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd");
			}
		}
	}
}