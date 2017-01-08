public class PP6_6 {
    public static void main(String[] args) {
       int x = 0;
       int y = 0;
       int move;
       //0 is up
       //1 is down
       //2 is right
       //3 is left
       for (int i = 0; i < 100; i++) {
           move = (int)(Math.random() * 4);
           switch(move) {
               case 0:
                y++;
                break;
               case 1:
                y--;
                break;
               case 2:
                x++;
                break;
               case 3:
                x--;
                break;
           }
        }
       System.out.println("Final location is (" + x + ", " + y+ ").");
    }
}
