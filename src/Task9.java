public class Task9 {
    private static boolean ifEqualNodeValues(Node nodeBig, Node nodeSmall) {
        return (nodeBig.getValue().toString().equals(nodeSmall.getValue().toString()));
    }

    private static boolean ifListPartContains(ListIterator listIteratorBig, ListIterator listIteratorSmall) {
        int counter = 0;
        while (listIteratorSmall.hasNext() && listIteratorBig.getNodeTmp() != null) {
            if (ifEqualNodeValues(listIteratorBig.getNodeTmp(),listIteratorSmall.getNodeTmp())) {
                counter++;
                System.out.println(listIteratorBig.getNodeTmp().getValue().toString() + listIteratorSmall.getNodeTmp().getValue().toString() + " " + counter);
            } else {
                counter = 0;
            }
            listIteratorBig.next();
            listIteratorSmall.next();
        }
        return (counter == listIteratorSmall.getList().getLength());
    }

    private static boolean ifListContains(ListIterator listIteratorBig, ListIterator listIteratorSmall) {
        while (listIteratorBig.hasNext()) {
            if (ifEqualNodeValues(listIteratorBig.getNodeTmp(), listIteratorSmall.getList().getHead())) {
                System.out.println("Натолкнулись на первое слово маленького списка- смотрим дальше остаток:");
                new List(listIteratorBig.getNodeTmp()).printList();
                System.out.println();
                if (ifListPartContains(new ListIterator(new List(listIteratorBig.getNodeTmp())),
                                       new ListIterator(listIteratorSmall.getList()))) {
                    return true;
                }
            }
            listIteratorBig.next();
        }
        return false;
    }

    public static boolean task9(List listBig, List listSmall) {
        return ifListContains(new ListIterator(listBig), new ListIterator(listSmall));
    }

    public static void main(String[] args) {
        String[] arrayOfStringsBigTask9 = {"alpha", "crash", "Java", "brandy", "crash", "Java", "lie",
                "opportunity", "rock", "towel", "Uranus", "victory", "zoo"};
        String[] arrayOfStringsSmall1Task9 = {"crash", "Java", "lie", "opportunity", "rock", "towel"};
        String[] arrayOfStringsSmall2Task9 = {"crash", "Java", "lie", "rock", "towel"};
        String[] arrayOfStringsSmall3Task9 = {"towel", "Uranus", "victory", "zoo", "zebra"};


        System.out.println("Task9");                                            //Task09
        List list9L1 = new List(arrayOfStringsBigTask9);
        list9L1.printList();
        System.out.println();
        List list9L2 = new List(arrayOfStringsSmall1Task9);
        list9L2.printList();
        System.out.println();
        System.out.println("Первый массив содержит второй массив: " + task9(list9L1, list9L2));
        System.out.println();

        list9L1.printList();
        System.out.println();
        list9L2 = new List(arrayOfStringsSmall2Task9);
        list9L2.printList();
        System.out.println();
        System.out.println("Первый массив содержит второй массив: " + task9(list9L1, list9L2));
        System.out.println();

        list9L1.printList();
        System.out.println();
        list9L2 = new List(arrayOfStringsSmall3Task9);
        list9L2.printList();
        System.out.println();
        System.out.println("Первый массив содержит второй массив: " + task9(list9L1, list9L2));
        System.out.println();
    }
}
