package Week3;

import Week4.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Eva6 {

    public static void main(String[] args){

        ArrayList<Integer> secrets = new ArrayList();
        int secretNumber = 0;
        int idx=0;
        while (secrets.size()<8){
            while( !hasClicked(idx, secretNumber) ){
                if(secretNumber==100){
                    secretNumber=0;
                }
                secretNumber = (secretNumber+1);
            }
            secrets.add(secretNumber);
            idx=idx+1;
            while( !hasClicked(idx, secretNumber) ){
                if(secretNumber==-1){
                    secretNumber=99;
                }
                secretNumber = (secretNumber-1);
            }
            secrets.add(secretNumber);
            idx=idx+1;
        }

        System.out.println(secrets);

    }

    //hasClicked function receives two integers as an index and the value that we want to check.
    //function returns true if the value is in the secretNumber array.
    public static Boolean hasClicked(int idx, int value) {

        List<Integer> scrt = Main.getRandomNumbers(8);
        if(scrt.get(idx)==value){
            return true;
        }
        return false;
    }
}

