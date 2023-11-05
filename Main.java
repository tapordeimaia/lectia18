
//import customArrayList.CustomArrayList;

import customarraylist.CustomArrayList;

import java.util.*;

public class Main extends Object {
    public static void main(String[] args) {

// // ---------- Collection
//        // Array
//        // List
//        // Set
//        // Map
//        //Deque
//
//        String[] a = new String[2];
//
//        List<String> stringList = new ArrayList<String>(); // [32]
//
//        stringList.add("s");
//        stringList.add("s");
//        stringList.add("s");
//        stringList.add("s");
//        stringList.add("s");
//        stringList.add("s");
//
//        Set<String> b = new HashSet<>(); // valorile sunt unice
//        b.add("A");
//        b.add("A"); // se ingnora
//
//        Map<String, String> map = new HashMap<>(); // cheile sunt unice
//        map.put("A", "B");
//        map.put("A", "C"); // cheia nu se schimba, valoarea se modifica
//
//        System.out.println("Set: " + b);
//        System.out.println("Map: " + map);
//
//        // Deque
//
//
//        Deque<String> deque = new LinkedList<>();
//
//        // Coada, in fata si spate, stergem din fata sau spate, sa citim din fata sau spate
//
//
//
//        List<String> arrayList = new ArrayList<String>();
//        arrayList.add("SDS");
//        arrayList.add("asd");
////        arrayList.add(4545);
//        arrayList.add("Sffgf");
////        arrayList.add(2);
////        arrayList.add(new Object());
//
//        for (int i = 0; i < arrayList.size(); i++) {
//          String val = arrayList.get(i);
//            System.out.println(val);
//        }
//

//        CustomArrayList customArrayList = new CustomArrayList();
//        customArrayList.add("A");
//        customArrayList.add("B");
//        customArrayList.add("C");
//        customArrayList.add("D");
//        customArrayList.add("E");
//        customArrayList.add("F");
//        customArrayList.add("G");
//
//        System.out.println(customArrayList.get(0));
//        System.out.println(customArrayList.get(1));
//        System.out.println(customArrayList.get(2));
//        System.out.println(customArrayList.get(3));
//        System.out.println(customArrayList.get(4));
//        System.out.println(customArrayList.get(5));
//        System.out.println(customArrayList.get(6));



//        AfisareService afisareService = new AfisareService();
//        afisareService.afisare("Vasile", "Nicolae", "Ion");
//        afisareService.afisare(new String[]{"Vasile", "Nicolae", "Ion"});


//        String[] array = new String[] {"A", "C", "D"};
//
//        List<String> list = Arrays.asList("A"); // lista cu marime fixa
//        list.add("B");
//        list.set(0, "C");
//
//        List<String> list2 = new ArrayList<>(); // lista dinamica
//        list2.add("A");
//
//        for(String a : list) {
//            System.out.println(a);
//        }

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        Collections.sort(list);



        List<Person> personList = new ArrayList<>();
        personList.add(new Person(20, "Ion"));
        personList.add(new Person(30, "Andrei"));
        personList.add(new Person(25, "Vasile"));

//       Collections.sort(personList, Comparator.comparingInt((person) -> person.getAge()));

//       personList.sort(Comparator.comparingInt((person) -> person.getAge()));
//
//        System.out.println(personList);

//         personList.forEach((person -> person.setAge(person.getAge() + 1)));
//         personList.forEach((person -> System.out.println(person)));

//         personList.removeIf(person -> person.getAge() < 30);
//         personList.forEach(person -> System.out.println(person));

//        int count = 0;
//         while (count != personList.size()) {
//             System.out.println(personList.get(count));
//             count++;
//         }

//         Iterator<Person> iterator = personList.listIterator();
//
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next());
//         }




//       System.out.println(list);
        CustomArrayList list2 = new CustomArrayList();
        list2.add("la");
        list2.add("ba");
        list2.set(1, "Lia");
        System.out.println(list2.get(1));







    }
}