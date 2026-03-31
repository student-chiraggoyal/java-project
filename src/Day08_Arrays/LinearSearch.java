package Day08_Arrays;

import java.util.Objects;
import java.util.Scanner;

public class LinearSearch {

    //linear search for numbers
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key)
                return i;
        }
        return -1;
    }

    //linear search for character items
    public static int linearserach2(String menuitems[], String item){
        for(int i=0; i<menuitems.length; i++){
            if(Objects.equals(menuitems[i], item))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //linear search for numbers
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.print("enter the number you want to search: ");
        int key = sc.nextInt();
        int index = linearSearch(numbers, key);
        if(index==-1)
            System.out.println("the number you want to search is not found");
        else
            System.out.println("number found at index: " + index);


        //linear search for character items
        String menuitems[] = {"pizza", "orange juice", "sandwich", "samosa", "burger"};
        System.out.println("enter the item you want to search: ");
        String item = sc.next();
        int index2 = linearserach2(menuitems, item);
        if(index2==-1)
            System.out.println("the item you want to search is not found");
        else
            System.out.println("item found at index: " + index2);
    }
}
