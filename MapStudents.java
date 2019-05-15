package CollectionsMapStudents;

// Example to show usage of HAshmMap

import java.util.*;

public class MapStudents {

    public static void main(String args[]) {

        String[] ignitestudents = {"Umar", "Suprith", "Shashank", "Sindhu", "Pooja"};
        String[] propelstudents = {"Varun", "Sharath", "Ganesh", "Manjunath", "Mallikarjun", "Akash"};
        String[] traineestudents = {"Chandana", "chandan", "varshini", "Priya", "Shivesh", "Bharath", "Spoorthi", "Haithaishi"};

        ArrayList<String> ignite = new ArrayList<String>();
        ArrayList<String> propel = new ArrayList<String>();
        ArrayList<String> trainee = new ArrayList<>();

        ignite.addAll(Arrays.asList(ignitestudents));
        propel.addAll(Arrays.asList(propelstudents));
        trainee.addAll(Arrays.asList(traineestudents));

        ArrayList<String> intern = new ArrayList<String>();
        intern.add("Amit");
        intern.add("Anusha");
        intern.add("Smaran");
        intern.add("Rohit");
        intern.add("Adithya");
        intern.add("Surabhi");

        System.out.println("\n*** Show usage of HashMap ***");
        System.out.println("------------------------------ ");
        // hashmap syntax is HashMap(Key, Value); Key has to be Unique. So you have to put all students in that batch
        // in this case key value 1 which is batch 1 - ignite and value will be list of students

        HashMap<Integer, List<String>> hashstudentmap = new HashMap<Integer, List<String>>();
        // Key, Value ; Value is ArrayList <String>.
        // SO when you get the value thruough key, t returns ArrayList<String>.

        hashstudentmap.put(255, propel);
        hashstudentmap.put(11, ignite);
        hashstudentmap.put(355, intern);
        hashstudentmap.put(555, trainee);
        // For small key vlaues hashmap sorts,. so give big key vlaues to understand.
        //hashstudentmap.put(255, intern); // referred propel value changed to refer to intern value - Dont do this.

        /* hashstudentmap.put(255, propel);
        hashstudentmap.put(11, propel);
        hashstudentmap.put(355, propel);
        //hashstudentmap.put(255, intern); // referred propel value changed to refer to intern value - Dont do this.
        hashstudentmap.put(555, propel); */
        // Same values can be associated with different keys also. But dont do this.

        System.out.println("HashMap");
        System.out.println(hashstudentmap);

        System.out.println("List 1= " + "ignite Students thru HashMap: " + hashstudentmap.get(11));
        System.out.println("List 2= " + "propel Students thru HashMap: " + hashstudentmap.get(255));
        System.out.println("List 3= " + "intern Students thru HashMap: " + hashstudentmap.get(355));
        System.out.println("List 4= " + "trainee Students thru HashMap: " + hashstudentmap.get(555));
        System.out.println();

        Collections.sort(hashstudentmap.get(11));
        System.out.println("HashMap : List 1 - ignite Students List sorted thru collections.sort ");
        System.out.println(hashstudentmap.get(11));
        System.out.println();

    }
}


