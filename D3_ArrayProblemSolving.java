package DataStructures;

//1. Target Sum problem: Sum of Pairs, Sum of Triplets
//2. Array Manipulation : Find unique numbers in array
//3. Second Maximum Number: 
//4. Reverse of Array:
//5. Rotation of Array:

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
class SecondMaximumNumber{
    public void SecondMaximum(int[] arr){
        int maxNumber=arr[1];
        int secMaxNumber=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxNumber){
                maxNumber=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secMaxNumber){
                if(arr[i]==maxNumber){
                    arr[i]=-1;
                }else{
                    secMaxNumber=arr[i];
                }
            }
        }
        System.out.println(maxNumber);
        System.out.println(secMaxNumber);
    }
}
class ReverseAnArray{
    public void SwapArray(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void ReverseArray(int[] arr){
        System.out.println("Reversing an array========================");
        int i=0, j=arr.length-1;
        while(i<j){
            SwapArray(arr, i, j);
            i++;
            j--;
        }
        System.out.print(">>>Reverse Array :");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
class RotateAnArray{
    public void Rotation(int[] arr){
        System.out.println("Rotation of an array========================");
        Scanner sc=new Scanner(System.in);
        System.out.print(">>>Enter no. of rotation :");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int temp=arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.print(">>>Rotated Array :");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
public class D3_ArrayProblemSolving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TargetSumProblem targetSumProblem=new TargetSumProblem();
        ArrayManipulation arrayManipulation=new ArrayManipulation();
        SecondMaximumNumber secondMaximumNumber=new SecondMaximumNumber();
        ReverseAnArray reverseAnArray=new ReverseAnArray();
        RotateAnArray rotateAnArray=new RotateAnArray();

        System.out.print(">>>Enter size of array :");
        int n=sc.nextInt();
        System.out.println(">>>Enter elements of array :");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        targetSumProblem.TargetSum(arr);
        arrayManipulation.Manipulation(arr);
        secondMaximumNumber.SecondMaximum(arr);
        reverseAnArray.ReverseArray(arr);
        rotateAnArray.Rotation(arr);
    }
}
