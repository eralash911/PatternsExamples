package ComparatorExample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//class Person  implements Comparable<Person> {
//    int age;
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Person p) {
//        return this.age - p.age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                '}';
//    }
//}

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
 class ComparePerson implements Comparator<Person> {
     int age;

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}



public class Example {
    public static void main(String[] args) {
        ComparePerson comparePerson = new ComparePerson();
        Set set = new TreeSet(comparePerson);
        set.add(new Person(87));
        set.add(new Person(45));
        set.add(new Person(87));
        set.add(new Person(847));
        set.add(new Person(7));

        for (Object o :
                set) {
            System.out.println(o);
        }
    }
}
