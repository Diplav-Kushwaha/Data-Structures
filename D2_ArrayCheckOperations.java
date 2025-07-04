package DataStructures;

//Check same number in array
//Check Last occurrence of number in array
//Check strictly greater number in array
import java.util.Scanner;
class CheckSameNumber{
    Scanner sc=new Scanner(System.in);
    public void CountOfSameNumber(int[] arr){
        System.out.print("\nEnter number for check :");
        int n=sc.nextInt();
        int count=0;
        boolean check=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                count++;
                check=true;
            }
        }
        if(check){
            System.out.println("Number "+n+" present "+count+" times in array");
        }
        else{
            System.out.println("Number "+n+" is not present in array");
        }
    }
}
class CheckLastOccurrence{
    Scanner sc=new Scanner(System.in);
    public void CheckOccurrence(int[] arr){
        System.out.print("\nEnter number for check :");
        int n=sc.nextInt();
        int count = 0;
        boolean check=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                count=i+1;
                check=true;
            }
        }
        if(check){
            System.out.println("Number "+n+" present at "+count+"th position");
        }
        else{
            System.out.println("Number "+n+" is not present in array");
        }
    }
}
class CheckStrictlyGreaterNumbers{
    Scanner sc=new Scanner(System.in);
    public void CheckGreaterNumber(int[] arr){
        System.out.print("Enter number for compare :");
        int n=sc.nextInt();
        int count = 0;
        boolean check=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>n){
                count++;
                check=true;
            }
        }
        if(check){
            System.out.println("There are "+count+" values greater than "+n);
        }
        else{
            System.out.println("There is "+count+" values greater than "+n);
        }
    }
}
class CheckSortedArray{
    public void CheckSortedArray(int[] arr){
        int count=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                count=count+1;
            }
        }
        if(count==arr.length){
            System.out.println("Array is sorted ");
        }
        else{
            System.out.println("Array is not sorted ");

        }
    }
}
public class D2_ArrayCheckOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CheckSameNumber checkSameNumber=new CheckSameNumber();
        CheckLastOccurrence checkLastOccurrence=new CheckLastOccurrence();
        CheckStrictlyGreaterNumbers checkStrictlyGreaterNumbers=new CheckStrictlyGreaterNumbers();
        CheckSortedArray checkSortedArray=new CheckSortedArray();


        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array-------");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        checkSameNumber.CountOfSameNumber(arr);
        checkLastOccurrence.CheckOccurrence(arr);
        checkStrictlyGreaterNumbers.CheckGreaterNumber(arr);
        checkSortedArray.CheckSortedArray(arr);
    }
}
