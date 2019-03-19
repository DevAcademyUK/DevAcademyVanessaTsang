package Songs;

import java.util.Scanner;
public class FiveLittleDucks {
        public static void main(String[]args){
            FiveLittleDucks song = new FiveLittleDucks();
            song.ducks();
        }
        private void ducks() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println(" Five little ducks");
            int ducks = myScanner.nextInt();
            String word = " ducks";
            for (int i = ducks; i > 0; i--) {
                System.out.println(i + "" + word + " went out one day");
                System.out.println(i + "" + word + " over the hill and far away");
                System.out.println(" mother duck said");
                System.out.println(" Quark, quark, quark, quark");
                if (i == 1) {
                    word = " duck";
                }
                else {
                    int newNum = i - 1;
                    if (newNum == 1){
                        word = " ducks";
                    }
                    System.out.println(newNum + "" + word + "but only four ducks came back");
                    System.out.println();
                }
            }
        }
    }

