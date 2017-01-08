import java.util.ArrayList;
public class WordList {
    private ArrayList<String> myList = new ArrayList<String>();

    public void makeArray() {
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");     
    }
    
    public int numWordsOfLength(int len) {
        int count = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                count++;
            }
        }
        return count;
    }
    
    public void printArray() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }        
        System.out.println();
    }
    
    public void removeWordsOfLength(int len) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
                i -= 1;
            }
        }
    }
}
