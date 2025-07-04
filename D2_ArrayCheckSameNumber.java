package DataStructures;

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
public class D2_ArrayCheckSameNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CheckSameNumber checkSameNumber=new CheckSameNumber();
        CheckLastOccurrence checkLastOccurrence=new CheckLastOccurrence();


        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array-------");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        checkSameNumber.CountOfSameNumber(arr);
        checkLastOccurrence.CheckOccurrence(arr);
    }
}
