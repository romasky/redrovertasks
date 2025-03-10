package homeWork.HW11.HW113;

import java.util.Arrays;

public class correctMistakesCharacterRecognitionSoftware {


    public static String correct(String string) {
       char[] str = string.toCharArray();
       char[] res = new char[str.length];

        for (int i = 0; i < str.length; i++) {
            if(str[i]=='5') {
                str[i]='S';
            } else if(str[i]=='0') {
                str[i]='O';
            } else if(str[i]=='1') {
                str[i]='I';
            }
            res[i]=str[i];
        }

        return new String(res);
        //return string.replace("5","S").replace("0", "O").replace("1","I");
    }


    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }
}




/*Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.

When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.*/