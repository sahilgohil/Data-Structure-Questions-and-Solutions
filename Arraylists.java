import java.util.ArrayList;

/**
 * Arraylist basics
 */


public class Arraylists {

// is a dynamic array where you can specify the type or can put all types in an unspecified type of arraylist
// has a dynamic size

public static void main(String[] args) {
    

    // arraylist uses wrapper classes
    // wrapper classes = are all objects that are reference type of primitive data type
    // int - Integer
    // double - Double etc.
    
    //to initialize a wrapper class value

    Integer in = Integer.valueOf(10);

    // initialize Integer type of arraylist

    ArrayList <Integer> list = new ArrayList<>();

    // add items
    list.add(12); // auto boxes into wrapper class of Integer

    // add items at specific index
    list.add(1,10);

    // get the item at the specific index

    System.out.println(list.get(0));

    // print the list
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }

    // remove the element at the specific index
    list.remove(0);
    System.out.println(list);

    // remove the element by value
    list.remove(Integer.valueOf(10));
    System.out.println(list);

    // check if the list contains the value or not
    list.add(10);
    System.out.println(list.contains(10));

    // can initialize without the type

    // ArrayList dynamicList = new ArrayList<>();
    // dynamicList.add(true);
    // dynamicList.add("hellow arraylist");
    // System.out.println(dynamicList);


}
    
}