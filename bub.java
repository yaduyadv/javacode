import java.util.Scanner;

class Main{
    Scanner sc = new Scanner(System.in);
    int n;
    Main(int n1){
        n = n1;
    }
    void accept(){
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
    }
    int[] createArray(){
        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }
    void printArray(int[] a){
        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}