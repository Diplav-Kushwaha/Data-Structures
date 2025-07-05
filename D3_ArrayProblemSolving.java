package DataStructures;

//1. Target Sum problem: Sum of Pairs, Sum of Triplets
//2. Array Manipulation : Find unique numbers in array
//3. Second Max Number: Find Second maximum number in array
import java.util.Scanner;
class TargetSumProblem{
    Scanner sc=new Scanner(System.in);
    public void TargetSum(int[] arr){
        System.out.println("Target Sum Problem===========================");
        System.out.print(">>>Enter target number :");
        int count1=0;
        int count2=0;
        int n=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==n){
                    count1++;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==n){
                        count2++;
                    }
                }
            }
        }
        System.out.println(">>>Pairs   in  array : "+count1);
        System.out.println(">>>Triplets in array : "+count2);
    }
}
class ArrayManipulation{
    public void Manipulation(int[] arr){
        for(int i=0; i<arr.length; i++){
            int n=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(n==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        System.out.println(">>>Unique numbers :");
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
public class D3_ArrayProblemSolving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TargetSumProblem targetSumProblem=new TargetSumProblem();
        ArrayManipulation arrayManipulation=new ArrayManipulation();

        System.out.print(">>>Enter size of array :");
        int n=sc.nextInt();
        System.out.println(">>>Enter elements of array :");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        targetSumProblem.TargetSum(arr);
        arrayManipulation.Manipulation(arr);

    }
}
