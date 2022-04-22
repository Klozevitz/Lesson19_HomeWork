public class Homework19 {
    public static double task1(List list){
        int sum = 0;
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()) {
            sum += (int) listIterator.getNodeTmp().getValue();
            listIterator.next();
        }
        return (double) sum / list.getLength();
    }

    private static boolean isFirstLastSameLetterTask5(Node node) {
        return (Character.toLowerCase(node.getValue().toString().charAt(0)) ==
                Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1)));
    }

    public static int task5(List list) {
        int counter = 0;
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()){
            if(isFirstLastSameLetterTask5(listIterator.getNodeTmp())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    private static boolean isLastFirstSameLetterTask6(Node node) {
        return (Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1)) ==
                Character.toLowerCase(node.getNextNode().getValue().toString().charAt(0)));
    }

    public static boolean task6(List list) {
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.getNodeTmp().getNextNode() != null) {
            if(!isLastFirstSameLetterTask6(listIterator.getNodeTmp())) {
                return false;
            }
            listIterator.next();
        }
        return true;
    }

    private static int equalsFirstLastCounterTask7(ListIterator listIterator, Object value){
        int counter = 0;
        while (listIterator.hasNext()) {
            if (value.toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    public static int task7(List list, boolean isFirst) {
        ListIterator listIterator = new ListIterator(list);
        if (isFirst) {
            return equalsFirstLastCounterTask7(listIterator, listIterator.getList().getHead().getValue());
        }
        else {
            return equalsFirstLastCounterTask7(listIterator, listIterator.getList().getLast().getValue());
        }
    }

    public static boolean isAlphabetTask8(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (Character.toLowerCase(word1.charAt(i)) != Character.toLowerCase(word2.charAt(i))) {
                return ((Character.toLowerCase(word1.charAt(i)) < Character.toLowerCase(word2.charAt(i))));
            }
        }
        return (word1.length() < word2.length());
    }

    public static boolean task8(List list){
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.getNodeTmp().getNextNode() != null) {
            if (!isAlphabetTask8(listIterator.getNodeTmp().getValue().toString(),
                    listIterator.getNodeTmp().getNextNode().getValue().toString())) {
                return false;
            }
            listIterator.next();
        }
        return true;
    }

    private static void stringBuilderInitializeTask9(StringBuilder stringBuilder, ListIterator listIterator) {
        while (listIterator.hasNext()) {
            stringBuilder.append(listIterator.getNodeTmp().getValue().toString());
            listIterator.next();
        }
    }

    private static void stringBuilderInitializeTask91(StringBuilder stringBuilder, ListIterator listIterator) {
        listIterator.forEachRemaining(node -> stringBuilder.append(node.getValue().toString()));
    }

    public static boolean task9(List listBig, List listSmall) {
        StringBuilder stringBuilderBig = new StringBuilder();
        StringBuilder stringBuilderSmall = new StringBuilder();

        ListIterator listIterator = new ListIterator(listBig);
        stringBuilderInitializeTask91(stringBuilderBig, listIterator);
        listIterator = new ListIterator(listSmall);
        stringBuilderInitializeTask91(stringBuilderSmall, listIterator);

        return (stringBuilderBig.toString().contains(stringBuilderSmall.toString()));
    }

    //Понять, есть ли смысл решать через итератор задачи 2, 3, 4, 10

}

/*private static int equalsFirstCounterTask7(ListIterator listIterator) {
        int counter = 0;
        while (listIterator.hasNext()) {
            if (listIterator.getList().getHead().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    private static int equalsLastCounterTask7(ListIterator listIterator) {
        int counter = 0;
        while (listIterator.hasNext()) {
            if (listIterator.getList().getLast().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }*/