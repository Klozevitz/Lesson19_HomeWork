public class Buffer {
    public static void main(String[] args) {
        String[] arr = new String[] {"alpha", "crash", "Java", "brandy", "crash", "Java", "lie", "opportunity", "rock",
                "towel", "Uranus", "victory", "zoo"};
        List listArr = new List(arr);
        List listArrPart = new List(listArr.getHead().getNextNode().getNextNode());
        listArrPart.printList();
    }
}
