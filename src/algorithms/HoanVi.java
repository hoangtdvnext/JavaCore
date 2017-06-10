package algorithms;

/**
 * Created by ASUS on 6/9/2017.
 */
public class HoanVi {

    public static void main(String[] args) {
        int n = 4;
        int a[] = new int[n+1];
        createArr(a, n);
        hv(a, n);
    }

    public static void createArr(int a[], int n){
        for(int i=1;i<=n;i++){
            a[i] = i;
        }
    }

    public static void show(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int a[], int n, int vt){
        for (int i = vt; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]>=a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void hv(int a[], int n){
        while (true){
            int i;
            //1. duyet tu cuoi len dau
            for(i = n;i>0;i--){
                // neu day giam het roi  thi dung lai
                if(i==1) return;
                // thoat vi da tim duoc vi tri lam day mat tinh tang dan
                if(a[i-1]>a[i]) break;
            }

            for(int j = n;j>=i;j--){
                if(a[j]>a[i]){
                    // doi cho
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    // sap xep tang
                    sort(a,n,i);
                    // in cau hinh
                    show(a,n);
                    break;
                }
            }
        }
    }
}
