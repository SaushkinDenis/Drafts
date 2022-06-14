package Draft;

public class Recursion {
    public static void main(String[] args) {
        int[] elements = {1,5,2,1,5,7,3,21,25};
        int result = sum(elements);
        System.out.println(result);
    }

    public static int sum(int[] elements){
        if (elements.length == 1){
            return elements[0];
        }
        else{
            int[] newElements = new int[elements.length - 1];
            System.arraycopy(elements, 1, newElements, 0, elements.length - 1);
            return elements[0] + sum(newElements);
        }
    }
}
