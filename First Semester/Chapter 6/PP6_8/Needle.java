public class Needle {
    private int hits;
    private int tries;
    
    public Needle()
    {
        hits = 0;
        tries = 0;
    }
    
    public void drop()
    {
        double lower = (double)(Math.random() * 2);
        double angle = (double)(Math.random() * 180);
        
        double higher = lower + Math.sin(Math.toRadians(angle));
        if (higher >= 2)
        {
            hits++;
        }
        else 
        {
            tries++;
        }
        
    }
    
    public int getHits()
    {
        return hits;
    }
    
    public int getTries()
    {
        return tries;
    }
}
