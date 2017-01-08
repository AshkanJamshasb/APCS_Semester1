public class PP6_8 {
    public static void main (String[] args) {
        
        Needle needle1 = new Needle();
        
        for (int i = 0; i <= 10000; i++)
        {
            needle1.drop();
        }
        
        double hits = needle1.getHits();
        double tries = needle1.getTries();
        double total = (tries/hits) + 1;
        System.out.println (total);
    }
}
