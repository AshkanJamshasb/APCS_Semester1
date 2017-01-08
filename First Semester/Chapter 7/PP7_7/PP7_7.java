import java.util.Arrays;
import java.util.Scanner;
public class PP7_7 {
    public static void main(String[] args) {
        Cards deck = new Cards();
        Scanner scan = new Scanner(System.in);
        String[] hand = new String[5];
        int choice;

        deck.shuffle();
        deck.print();
        deck.makeHand();
        System.out.print("Hand: ");
        deck.showHand();
        System.out.println();
        System.out.println("Keep hand(0), change some of hand(1) or change hand completely(2): ");
        choice = scan.nextInt();
        deck.change(choice);
        System.out.print("Hand: ");
        deck.showHand();
        System.out.println();
        System.out.println(deck.checkHand());
    }
}

class Cards {
    String[][] cards =  {{"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13"},  //spades
                         {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12", "h13"},  //hearts
                         {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "d11", "d12", "d13"},  //diamonds
                         {"c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13"}   //clubs
                        };
    String[] hand = new String[5];
    
    public void shuffle() {
        System.out.println("Shuffling...");
        for(int k = 0; k < 52; k++) {
            for (int i = cards.length - 1; i > 0; i--) {
                for (int j = cards.length - 1; j > 0; j--) {
                    int i1 = (int)(Math.random()*cards.length);
                    int j1 = (int)(Math.random()*cards[i].length);

                    String temp = cards[i][j];
                    cards[i][j] = cards[i1][j1];
                    cards[i1][j1] = temp;
                }
            }
        }
    }
    /*public String[] topFive() {
        for(int i = 0; i < hand.length; i++) {
            hand[i] = cards[3][12-i];
        }
        return hand;
    } */
    public void makeHand() {
        for(int i = 0; i < hand.length; i++) {
            hand[i] = cards[3][12-i];
        }
    }   
    public void showHand() {
        for(String e : hand) {
            System.out.print(e + " ");
        }
    }
    public void print() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                System.out.print(cards[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void change(int in) {
        Scanner scan = new Scanner(System.in);
        if(in == 1) { //Reject Some
            int num;
            System.out.print("How many cards would you like to change: ");
            num = scan.nextInt();
            for(int i = 0; i < num; i++) {
                hand[i] = cards[2][7-i];
            }
        } else if (in == 2) { //Reject All
            for(int i = 0; i < hand.length; i++) {
                hand[i] = cards[3][7-i];
            }
        }
    }
    public String checkHand() {
        if(hand[0].charAt(0) == hand[1].charAt(0) && hand[1].charAt(0) == hand[2].charAt(0) && hand[2].charAt(0) == hand[3].charAt(0)) { //Flush
                return "Flush";
        } else if (hand[0].charAt(1) == hand[1].charAt(1)&& hand[1].charAt(1) == hand[2].charAt(1)&& hand[2].charAt(1) == hand[3].charAt(1)||
                   hand[1].charAt(1) == hand[2].charAt(1)&& hand[2].charAt(1) == hand[3].charAt(1)&& hand[1].charAt(1) == hand[3].charAt(1)||
                   hand[2].charAt(1) == hand[3].charAt(1)&& hand[3].charAt(1) == hand[4].charAt(1)&& hand[1].charAt(1) == hand[3].charAt(1)) {
                       if(hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1) ||
                          hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1) ||
                          hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1)) {
                           return "Full House";
                        } else {
                            return "Three Of A Kind";
                        }
        } else if(hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1) ||
                  hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1) ||
                  hand[0].charAt(1) == hand[0].charAt(1)&& hand[0].charAt(1) == hand[0].charAt(1)) {
                       return "One Pair";
                  } else {
                        return "No Pair";
                  }
    }
}