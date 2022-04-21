public class Main {
    public static void main(String[] args) {
        Integer[] arrayTask1234 = new Integer[] {12, 43, 100, 4, 24, 6, 63};

        String[] arrayOfStringsTask5 = {"tube", "youtube", "alabama", "africa", "antarctica", "arctica", "rambler"};

        String[] arrayOfStrings1Task6 = {"tube", "elf", "fusion", "naiL", "lock", "key", "yellow"};
        String[] arrayOfStrings2Task6 = {"tube", "elf", "ghost", "nail", "lock", "key", "yellow"};

        String[] arrayOfStringsTask7 = {"tube", "year", "speed", "year", "tube", "range", "year", "tube", "tube",
                                            "stock", "object", "year"};

        String[] arrayOfStrings1Task8 = {"alpha", "brandy", "crash", "java", "lie", "Opportunity", "rock",
                                            "towel", "uranus", "Victory", "zoo"};
        String[] arrayOfStrings2Task8 = {"alpha", "brandy", "crash", "java", "lie", "opportunity", "Rocknroll", "rock",
                                            "towel", "uranus", "victory", "zoo"};

        String[] arrayOfStringsBigTask9 = {"alpha", "brandy", "crash", "Java", "lie", "opportunity", "rock",
                                            "towel", "Uranus", "victory", "zoo"};
        String[] arrayOfStringsSmall1Task9 = {"crash", "Java", "lie", "opportunity", "rock", "towel"};
        String[] arrayOfStringsSmall2Task9 = {"crash", "Java", "lie", "rock", "towel"};

        String[] arrayOrStringsTask10 = {"crash", "Java", "lie", "opportunity", "rock", "towel", "Uranus"};



        /*System.out.println("Task1");                                            //Task1
        List list1 = new List(arrayTask1234);
        System.out.print("Среднее арифметическое элементов списка ");
        list1.printList();
        System.out.println(" - " + Homework19.task1(list1) + "\n");



        System.out.println("Task2");                                            //Task2
        List list2 = new List(arrayTask1234);
        list2.printList();
        System.out.println();
        HomeWork.task2(list2);
        list2.printList();
        System.out.println("\n");

        System.out.println("Task3");                                            //Task3
        List list3 = new List(arrayTask1234);
        list3.printList();
        System.out.println();
        HomeWork.task3(list3);
        list3.printList();
        System.out.println("\n");

        System.out.println("Task4");                                            //Task4
        List list4 = new List(arrayTask1234);
        list4.printList();
        System.out.println();
        HomeWork.task4(list4);
        list4.printList();
        System.out.println("\n");

        System.out.println("Task5");                                            //Task5
        List list5 = new List(arrayOfStringsTask5);
        System.out.print("В массиве ");
        list5.printList();
        System.out.println(" " + Homework19.task5(list5) + " слов начинаются и заканчиваются на одну букву.");
        System.out.println();

        System.out.println("Task6");                                            //Task6
        List list16 = new List(arrayOfStrings1Task6);
        List list26 = new List(arrayOfStrings2Task6);
        list16.printList();
        System.out.println();
        System.out.println(Homework19.task6(list16));
        list26.printList();
        System.out.println();
        System.out.println(Homework19.task6(list26));
        System.out.println();*/

        System.out.println("Task7");                                            //Task07
        List list7 = new List(arrayOfStringsTask7);
        list7.printList();
        System.out.println();
        System.out.println("С первым словом " + Homework19.task7(list7, true) + " совпадений (c учетом слова).");
        System.out.println("С последним словом " + Homework19.task7(list7, false) + " совпадений (с учетом слова).");
        System.out.println();

        /*System.out.println("Task8");                                            //Task08
        List list18 = new List(arrayOfStrings1Task8);
        list18.printList();
        System.out.println();
        System.out.println(HomeWork.task8(list18));
        List list28 = new List(arrayOfStrings2Task8);
        list28.printList();
        System.out.println();
        System.out.println(HomeWork.task8(list28));
        System.out.println();

        System.out.println("Task9");                                            //Task09
        List list9L1 = new List(arrayOfStringsBigTask9);
        list9L1.printList();
        System.out.println();
        List list9L2 = new List(arrayOfStringsSmall1Task9);
        list9L2.printList();
        System.out.println();
        System.out.println("Первый массив содержит второй массив: " + Homework19.task9(list9L1, list9L2));
        System.out.println();

        list9L1.printList();
        System.out.println();
        list9L2 = new List(arrayOfStringsSmall2Task9);
        list9L2.printList();
        System.out.println();
        System.out.println("Первый массив содержит второй массив: " + Homework19.task9(list9L1, list9L2));
        System.out.println();

        System.out.println("Task10");                                           //Task10
        List list10 = new List(arrayOrStringsTask10);
        list10.printList();
        System.out.println();
        HomeWork.task10(list10);
        list10.printList();*/
    }
}
