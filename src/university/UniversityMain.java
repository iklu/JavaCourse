package university;

import java.util.*;

/**
 * Created by ovidiu on 10-Jan-17.
 */
public class UniversityMain
{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setGender(Gender.F);
        t1.setCnp("123456789");
        t1.setTitle("dir.");
        t1.setAge(20);

        Teacher t2 = new Teacher();
        t2.setGender(Gender.M);
        t2.setCnp("123456788");
        t2.setTitle("rector");
        t2.setAge(30);

        Teacher t3 = new Teacher();
        t3.setGender(Gender.M);
        t3.setCnp("123456788");
        t3.setTitle("rector3");
        t3.setAge(25);

        //Compare the teachers
        System.out.println(t1.compareTo(t2));

        Student s1 = new Student();
        s1.setGender(Gender.F);

        Student s2 = new Student();
        s2.setGender(Gender.M);

        University university = new University();


//
//        //create array without boundary
//        Student[] sArr = new Student[]{s1, s2};
//        university.setStudents(sArr);


        //convert to List
//        List<Teacher> tList = Arrays.asList(tArr);
//        tList.add(new Teacher());
//        university.setTeachers(tList);


        //ArrayList
        List<Teacher> tList = new ArrayList<Teacher>();
        tList.add(t1);
        tList.add(t2);
        tList.add(t3);
        System.out.println(tList.size());

        //Se apeleaza metoda equals() din AbstractPerson sa vada daca exista
        //Set
        Set<Teacher> tSet = new HashSet<>();
        tSet.add(t1);
        tSet.add(t2);
        tSet.add(t3);
        System.out.println(tSet.size());

        //se apeleaza compareTo()
        Set<Teacher> trSet = new TreeSet<>();
        trSet.add(t1);
        trSet.add(t2);
        trSet.add(t3);
        System.out.println(trSet.size());

        for(Teacher t: trSet){
            printlnTitle(t);
        }

        //Map
        //String = key , AbstractPerson = value
        Map<String, AbstractPerson> tMap = new HashMap<>();
        tMap.put("Nicky", t1);
        tMap.put("John", t2);
        tMap.put("George", t3);

        System.out.print(tMap.get("John").getTitle());
//
//        university.setTeachers(tList);
//
//        printlnTitle(university.getStudents()[0]);
//        printlnTitle(university.getTeachers().get(1));
//        printlnTitle(s1);
//        printlnTitle(s2);
//
//        //IMPORTANT egalitate intre obiecte hashcode
//        s1.hashCode();//transforma din mai multi biti in putini biti pastrand identitatea
//        s1.equals(s2);
//
//        //Copilatorul optimizeaza obiectele la fel (creeaza 2 referinte catre acelasi obiect)
//
////        String str1  = new String("Lect");
////        String str2  = new String("Lect");
////        String str3  = new String("Mr.");
//
//        String str1  = new String("Lect".getBytes());
//        String str2  = new String("Lect".getBytes());
//        String str3  = new String("Mr.");
//
//        Set<String> titleSet = new HashSet<>();
//
//        titleSet.add(str1);
//        titleSet.add(str2);
//        titleSet.add(str3);
//
//        System.out.print(titleSet);


    }

    private static void printlnTitle(AbstractPerson p){
        System.out.println(p.getTitle());
    }

}
