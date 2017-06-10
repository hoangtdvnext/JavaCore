import java.util.Scanner;

/**
 * Created by ASUS on 6/6/2017.
 */
public class H {

    public static void main(String[] args) {
        int t,n,i,A[]=new int[10]; String S[]=new String[10];
        StringBuilder min;
        boolean X[]=new boolean[10];
        Scanner in = new Scanner(System.in);
        t=in.nextInt();
        while(t-- >0){
            min=new StringBuilder();
            n=in.nextInt();
            for(i=1;i<=n;i++){
                S[i]=in.next(); min.append(S[i]);
                X[i]=true;
            }
            Try(A,S,X,min,n,1);
            System.out.println(min);
        }
    }
    public static void Try(int A[], String S[],boolean X[], StringBuilder min, int n,int i){
        int j,k; StringBuilder s=new StringBuilder();
        for(j=1;j<=n;j++){
            if(X[j]){
                A[i]=j; X[j]=false;
                if(i==n){
                    for(k=1;k<=n;k++) s.append(S[A[k]]);
                    String s1=s.toString(), s2=min.toString();
                    if(s1.compareTo(s2)<0) min.replace(0, s1.length(), s1);
                } else Try(A,S,X,min,n,i+1);
                X[j]=true;
            }
        }
    }
}
