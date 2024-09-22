import java.util.Scanner;
public class merge{
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    int n;
    merge(int n1){
        n = n1;
        for(int i = 0; i < n; i ++){
            a[i] = 0;
        }
    }
    void Accept(){
        System.out.println("Enter the number : ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    }
    merge join(merge z){
        int i = 0, j = 0, k = 0;
        int x = this.n + z.n;
        merge m = new merge(x);
        while(i < this.n && k < z.n){
            if(this.a[i] < z.a[k]){
                m.a[j] = this.a[i];
                j++;
                i++;
            }else{
                m.a[j] = z.a[k];
                j++;
                k++;
            }
        }
        while(i < this.n){
            m.a[j] = this.a[i];
            j++;
            i++;
        }
        while (k < z.n) {
            m.a[j] = z.a[k];
            j++;
            k++;
        }
        return m;
    }
    void Display(){
        int i;
        for(i = 0; i < this.n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        merge a1 = new merge(8);
        merge a2 = new merge (2);
        merge a3 = new merge(10);

        a1.Accept();
        a2.Accept();
        a3 = a1.join(a2);

        a1.Display();
        a2.Display();
        a3.Display();
    }
}