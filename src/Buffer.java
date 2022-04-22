public class Buffer {
    /*private static void stringBuilderInitializeTask9(StringBuilder stringBuilder, ListIterator listIterator) {
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
    }*/


    public static void main(String[] args) {
        String[] arr = new String[] {"alpha", "crash", "Java", "brandy", "crash", "Java", "lie", "opportunity", "rock",
                "towel", "Uranus", "victory", "zoo"};
        List listArr = new List(arr);
        List listArrPart = new List(listArr.getHead().getNextNode().getNextNode());
        listArrPart.printList();
    }
}
