import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int count=0;
        int top = 0;
       for(int i = 0; i < list.length; i++){
           count=0;
           if(top!=list[i]) {
               for (int j = 0; j < list.length; j++) {
                   if (list[i] == list[j]) {
                       top = list[i];
                       count++;
                   }
               }
               System.out.println(top + " Sayisi " + count + " kadar tekrar edildi. ");
           }
       }
    }
}