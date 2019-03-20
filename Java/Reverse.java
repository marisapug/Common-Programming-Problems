public class Reverse {
    
    // Java program to reverse a string without allocating a new array
    
    // Helper function to swap i and j
    private static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    
    public static char[] reverse(char[] str){
        int i = 0;
        int j = str.length - 1;
        while (i < j){
            swap(str, i, j);
            i++;
            j--;
        }
        return str;
    }
    
    public static String getString(char[] str){
        String s = "";
        for (char c: str){
            s += c;
        }
        return s;
    }
    
    public static void main(String[] args){
        // Feel free to create new examples!
        char[] cat = {'c','a','t'};
        char[] dogs = {'d', 'o', 'g', 's'};
        System.out.println("The reverse of " + getString(cat) + " is " + getString(reverse(cat)));
        System.out.println("The reverse of " + getString(dogs) + " is " + getString(reverse(dogs)));
    }

}
