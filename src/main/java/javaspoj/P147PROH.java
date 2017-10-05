package javaspoj;

import java.util.*;

/**
 * Created by Administrator on 26/10/2016.
 */
public class P147PROH {
    //http://www.spoj.com/PTIT/problems/P147PROH/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "";
        String b = "";
        ArrayList<String> arrA = new ArrayList<>();
        ArrayList<String> arrB = new ArrayList<>();
        while (!a.equals("END") && !b.equals("END")) {
            a = input.nextLine().trim();
            b = input.nextLine().trim();
            if(!a.equals("END") && !b.equals("END")){
                arrA.add(a);
                arrB.add(b);
            }
        }
        for (int i=0;i<arrA.size();i++){
            if(arrA.get(i).length()!=arrB.get(i).length()){
                System.out.println("Case " + (i+1) + ": different");
            }else{
                String sA = arrA.get(i);
                String sB = arrB.get(i);
                char  arcA[]= new char[sA.length()];
                char  arcB[]= new char[sB.length()];
                for (int j=0;j<sA.length();j++){
                    arcA[j] = sA.charAt(j);
                    arcB[j] = sB.charAt(j);
                }
                gt(arcA,arcB,(i+1));
            }
        }
    }

    public static void gt(char a[], char b[], int dem){
        Arrays.sort(a);
        Arrays.sort(b);
        String sA = "";
        String sB = "";
        for(int i=0;i<a.length;i++){
            sA +="" + a[i];
            sB +="" + b[i];
        }
        if(sA.equals(sB)){
            System.out.println("Case " + dem + ": same");
        }else{
            System.out.println("Case " + dem + ": different");
        }
    }
}
