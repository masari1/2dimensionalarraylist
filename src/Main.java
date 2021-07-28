import java.util.*;


public class Main {

    public static void main (String [] args){

        ArrayList<ArrayList<String>>  grocerylist = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("tomato");
        producelist.add("zuccini");
        producelist.add("pepper");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");





    grocerylist.add(bakeryList);
    grocerylist.add(producelist);
    grocerylist.add(drinkList);



        System.out.println(grocerylist.get(2).get(1));
















    }




}
