package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Tính tổng thời gian đi lên của mọi người
        // và tìm min của đi xuống so sánh với tổng thời gian đi xuống
        // của mọi người và min min của đi lên cái nào bé hơn là kết quả
        long MinU = 50005;
        long MinD = 50005;
        long TU = 0, TD = 0;

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            //1. nhập số đầu vào
            int u= input.nextInt();
            int d = input.nextInt();
            //2,. tinh tong luc di len, va luc di xuong
            TU+=u;
            TD+=d;
            //3. tim min cua di len va di xuong
            if(MinU>u) MinU = u;
            if(MinD>d) MinD = d;
        }

        //4. check ket qua di len va di xuong
        TU+=MinD;
        TD+=MinU;

        if(TU>TD) System.out.println(TU);
        else System.out.println(TD);
    }

}
