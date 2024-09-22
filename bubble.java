import java.util.Scanner;
class bubble{
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    int n;
    bubble(int n1){
        n = n1;
        for(int i = 0; i < n; i++){
            a[i] = 0;
        }
    }
    void Accept(){
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    }
    void Bubsort(){
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n - 1 - i; k++){
                if(a[k] >a [k + 1]){
                    int temp = a[k];
                    a[k] = a[k + 1];
                    a[k+1] = temp;
                }
            }
        }
    }
    void Display(){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String args[]){
        bubble B = new bubble(5);
        B.Accept();
        B.Bubsort();
        B.Display();
    }
}