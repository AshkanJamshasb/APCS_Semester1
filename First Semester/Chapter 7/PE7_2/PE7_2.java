public class PE7_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 7, 1, 4};
        ArrayMethods array = new ArrayMethods(arr);
        array.backup();
        System.out.print("Original: ") ;
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.print("\nSwap first and last: ");
        array.swapFirstAndLast();
        for (int e: arr) {
            System.out.print(e + " ");
        }
        array.reset();
        System.out.print("\nShift to right: ");
        array.shiftRight();
        for (int e: arr) {
            System.out.print(e + " ");
        }
        array.reset();
        System.out.print("\nReplace evens with 0: ");
        array.replaceEvenWithZero();
        for (int e: arr) {
            System.out.print(e + " ");
        }
        array.reset();
        System.out.print("\nBigger Number: ");
        array.biggerNum();
        for (int e: arr) {
            System.out.print(e + " ");
        }
        array.reset();
        System.out.print("\nRemove middle: ");
        array.removeMiddle();
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        array.reset();
        System.out.print("\nEven to front: ");
        array.evenToFront();
        for (int e: arr) {
            System.out.print(e + " ");
        }
    }
}