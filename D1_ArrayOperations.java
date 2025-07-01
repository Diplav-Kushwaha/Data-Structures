package DataStructures;
//Sum of array
//Insertion in array
//Traversal of array
//Deletion in array
//Search max or min value in array
//Search element x in array and return index

import java.util.Scanner;
class ArrayOperation{
    Scanner sc=new Scanner(System.in);

    public int[] InsertAtIndex(int[] arr){
        System.out.print("Enter value : ");
        int value=sc.nextInt();
        System.out.print("Enter index : ");
        int index=sc.nextInt();
        int n=arr.length-1;
        while(n>index){
            arr[n]=arr[n-1];
            n=n-1;
        }
        arr[index]=value;
        System.out.println("Insert Successfully");
        return arr;
    }
    public int[] DeletionAtIndex(int[] arr){
        System.out.print("Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ");
        System.out.print("Enter index : ");
        int index=sc.nextInt();
        int n=arr.length-1;
        while(index<n){
            arr[index]=arr[index+1];
            index=index+1;
        }
        System.out.println("Delete Successfully");
        return arr;
    }
    public int[] DeleteByValue(int[] arr){
        return arr;
    }
    public  void SearchMinimum(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(min>arr[i+1]){
                min=arr[i+1];
            }
        }
        System.out.println("Minimum in array : "+min);
    }
    public void SearchMaximum(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(max<arr[i+1]){
                max=arr[i+1];
            }
        }
        System.out.println("Minimum in array : "+max);
    }
    public void SearchNumber(int[] arr){
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        boolean found=false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Number found at index : "+i);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
    public void SumOfArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array : "+sum);
    }
    public void DisplayArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
public class D1_ArrayOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayOperation operation= new ArrayOperation();

        System.out.print("Enter size of array : ");
        int n=sc.nextInt();

        int[] array=new int[n];
        System.out.println("____Enter Integer Value____");
        sc.nextLine();

        for(int i=1; i<=n; i++){
            System.out.print("Value "+i+" :");
            array[i-1]=sc.nextInt();
        }
        int[] brr=new int[n+1];
        for(int i=0; i<array.length; i++){
            brr[i]=array[i];
        }
        while(true){
            System.out.println("\n____Select Operation____");
            System.out.println("1. Insert at index ");
            System.out.println("2. Delete at index ");
            System.out.println("3. Delete by value ");
            System.out.println("4. Search minimum ");
            System.out.println("5. Search maximum ");
            System.out.println("6. Search Number ");
            System.out.println("7. Sum of Numbers ");
            System.out.println("8. Display Array ");
            System.out.println("9. exit Code ");

            System.out.print("=========Your Input : ");
            int x=sc.nextInt();
            switch (x){
                case 1: operation.InsertAtIndex(brr);   break;
                case 2: operation.DeletionAtIndex(brr); break;
                case 3: operation.DeleteByValue(brr);   break;
                case 4: operation.SearchMinimum(array); break;
                case 5: operation.SearchMaximum(brr); break;
                case 6: operation.SearchNumber(brr);    break;
                case 7: operation.SumOfArray(brr);      break;
                case 8: operation.DisplayArray(brr);    break;
                case 9:
                    System.out.println("Exiting Program........");
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
