import java.util.Scanner;

/**
 * interviewQuestion
 */
public class interviewQuestion {
   //the run time complexity is O(n*n)=O(n^2) as the method uses nested loops.
    public static int CountZeros(int[] A){ 
      int Counter = 0; 
      for (int i = 0; i<A.length;i++){ //O(n)
        if(A[i] == 0){ // O(n)
        Counter++;
}
}
    return Counter;
   }
       
   
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("The size of the array:");
    int size= sc.nextInt(); // input the size of the array
    int[] numarray = new int[size]; // the array will have 7 elements
    System.out.println("The elements in the array are:");
    for(int i =0; i<numarray.length; i++){
        numarray[i] =sc.nextInt(); // input the elements of the array
    }
    System.out.println("The number of 0's is: "+ CountZeros(numarray));
}
}