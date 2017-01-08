public class APCS_WL {
    public static void main(String[] args) {
        WordList list = new WordList();
        list.makeArray();
        System.out.print("The array is: ");
        list.printArray();
        System.out.println("The number of words with length 4 is: " + list.numWordsOfLength(4));
        System.out.println("The number of words with length 3 is: " + list.numWordsOfLength(3));
        System.out.println("The number of words with length 2 is: " + list.numWordsOfLength(2));
        System.out.println("Remove words with length of 4");
        list.removeWordsOfLength(4);
        System.out.println("Remove words with length of 3");
        list.removeWordsOfLength(3);   
        System.out.println("Remove words with length of 2");
        list.removeWordsOfLength(2); 
        System.out.print("The array is: ");
        list.printArray();
            
    }    
}
