package Java.JavaPracticeSet1;
import java.util.*;

public class StringLookUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        input.nextLine();
        int sequenceNumber = -1;
        for(int i=1;i<=n;i++){
        String l = input.nextLine();
        String [] words = l.split(" ");
        for(String w:words){
            if(w.equals(s)){
                sequenceNumber =i;
                break;
            }
        }
        if(sequenceNumber != -1){
            break;
         }
        }
        if(sequenceNumber != -1){
            System.out.println(sequenceNumber);
        }else{
            System.out.println(-1);
        }
    }

    
}

// input:
// plays
// 3
// Raju is going to school
// Teja plays Cricker 
// Car has four wheels

//output: 
// 2