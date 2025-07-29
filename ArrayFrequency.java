import java.util.*;


class ExampleDriver {
    public static void main(String[] args) {

       int []arr={1,4,2,3,5,7,9,1,2,3,4,4,5};
       boolean[]b=new boolean[arr.length];
       System.out.println(Arrays.toString(arr));

       for(int i=0;i<arr.length;i++){
         int count=0;
         for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]&&b[j]==false){
               count++;
               b[j]=true;
            }
         }
         if(count!=0){
            System.out.println(count);
         }
       }
    }
 }

       