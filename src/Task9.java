public class Task9 {
    public static boolean task9(List listBig, List listSmall) {
        ListIterator listIteratorBig = new ListIterator(listBig);
        ListIterator listIteratorSmall = new ListIterator(listSmall);
        int counter = 0;

        while (listIteratorBig.hasNext()) {
            if (listIteratorBig.getNodeTmp().getValue().toString().equals(listIteratorSmall.getList().getHead().getValue().toString())) {
                List listPart = new List(listIteratorBig.getNodeTmp());
                ListIterator listIteratorSmallBuff = new ListIterator(listSmall);
                ListIterator listPartIterator = new ListIterator(listPart);
                while (listIteratorSmallBuff.hasNext()) {
                    if (listPartIterator.getNodeTmp().getValue().toString().equals(listIteratorSmallBuff.getNodeTmp().getValue().toString())) {
                        counter ++;
                    }
                    else {
                        counter = 0;
                    }
                    listPartIterator.next();
                    listIteratorSmallBuff.next();
                }
                if (counter == listSmall.getLength()) return true;
            }
            listIteratorBig.next();
        }
        return false;
    }

    public static void main(String[] args) {
        //String[] arrayOfStringsBigTask9 = {"alpha", "crash", "Java", "brandy", "crash", "Java", "lie", "opportunity", "rock",
        //        "towel", "Uranus", "victory", "zoo"};
        //String[] arrayOfStringsSmall1Task9 = {"crash", "Java", "lie", "opportunity", "rock", "towel"};
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
        System.out.println(Task9.task9(list9L1, list9L2));
        //System.out.println("Первый массив содержит второй массив: " + Task9.task9(list9L1, list9L2));
        System.out.println();
    }
}
