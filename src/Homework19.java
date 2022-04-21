import java.util.Calendar;

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

    private static boolean isFirstLastSameLetter(Node node) {
        return (Character.toLowerCase(node.getValue().toString().charAt(0)) ==
                Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1)));
    }

    public static int task5(List list) {
        int counter = 0;
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()){
            if(isFirstLastSameLetter(listIterator.getNodeTmp())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    private static boolean isLastFirstSameLetter(Node node) {
        return (Character.toLowerCase(node.getValue().toString().charAt(node.getValue().toString().length() - 1)) ==
                Character.toLowerCase(node.getNextNode().getValue().toString().charAt(0)));
    }

    public static boolean task6(List list) {
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.getNodeTmp().getNextNode() != null) {
            if(!isLastFirstSameLetter(listIterator.getNodeTmp())) {
                return false;
            }
            listIterator.next();
        }
        return true;
    }

    private static int equalsFirstCounter(ListIterator listIterator) {
        int counter = 0;
        while (listIterator.hasNext()) {
            if (listIterator.getList().getHead().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    private static int equalsLastCounter(ListIterator listIterator) {
        int counter = 0;
        while (listIterator.hasNext()) {
            if (listIterator.getList().getTail().getValue().toString().equalsIgnoreCase(listIterator.getNodeTmp().getValue().toString())) {
                counter++;
            }
            listIterator.next();
        }
        return counter;
    }

    public static int task7(List list, boolean isFirst) {
        ListIterator listIterator = new ListIterator(list);
        if (isFirst) {
            return equalsFirstCounter(listIterator);
        }
        else {
            return equalsLastCounter(listIterator);
        }
    }
}
