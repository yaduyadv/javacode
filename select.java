import java.util.Scanner;
class select{
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    int n;
    select( int n1 ){
        n = n1;
        for(int i = 0; i < n; i++){
            a[i] = 0;
        }
    }
    void Accept(){
        System.out.println("Enter the elements for the array ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    }
    
}