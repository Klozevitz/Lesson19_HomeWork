public class HomeWork {
    public static double task1(List list) {
        int sum = 0;
        int listLength = 0;
        Node nodeTemp = list.getHead();

        while (nodeTemp != null) {
            sum += (int) nodeTemp.getValue();
            nodeTemp = nodeTemp.getNextNode();
            listLength ++;
        }
        return ((double) sum / listLength);
    }

    public static void task2(List list) {
        Node nodeTemp = list.getHead();

        while (nodeTemp.getNextNode() != null) {
            nodeTemp = nodeTemp.getNextNode();
        }
        list.push(nodeTemp.getValue(), 0);
        list.pop();
    }

    public static void task3(List list) {
        list.push(list.getHead().getValue());
        list.pop(0);
    }

    /*public static void task4(List list) {
        Node nodeTemp = list.getHead();
        Node nodeTemp1 = list.getHead();

        while (nodeTemp.getNextNode() != null) {
            nodeTemp = nodeTemp.getNextNode();
        }
        list.push(nodeTemp.getValue(), 0);
        list.pop(1);
        list.pop();
        list.push(nodeTemp1.getValue());
    }*/

    public static void task4 (List list) {
        Node nodeTmp = list.getHead();

        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        list.push(nodeTmp.getValue(), 0);
        list.pop();
        list.push(list.getHead().getNextNode().getValue());
        list.pop(1);
    }

    public static int task5(List list) {
        Node nodeTemp = list.getHead();
        int counter = 0;

        while (nodeTemp != null) {
            if (Character.toLowerCase(nodeTemp.getValue().toString().charAt(0)) ==
                Character.toLowerCase(nodeTemp.getValue().toString().charAt(nodeTemp.getValue().toString().length() - 1))) {
                counter++;
            }
            nodeTemp = nodeTemp.getNextNode();
        }
        return counter;
    }

    public static boolean task6(List list) {
        Node nodeTmp = list.getHead();

        while (nodeTmp.getNextNode() != null) {
            if (Character.toLowerCase(nodeTmp.getValue().toString().charAt(nodeTmp.getValue().toString().length() - 1)) !=
                Character.toLowerCase(nodeTmp.getNextNode().getValue().toString().charAt(0))) {
                return false;
            }
            nodeTmp = nodeTmp.getNextNode();
        }
        return true;
    }

    public static int task7(List list, boolean isFirst) {
        Node nodeTmp = list.getHead();
        Node nodeTmpFirstLast = list.getHead();
        int count = 0;

        if (isFirst) {
            while (nodeTmp != null) {
                if (nodeTmpFirstLast.getValue().toString().equalsIgnoreCase(nodeTmp.getValue().toString())) {
                    count ++;
                }
                nodeTmp = nodeTmp.getNextNode();
            }
        }
        else {
            while (nodeTmp.getNextNode() != null) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmpFirstLast = nodeTmp;
            nodeTmp = list.getHead();
            while (nodeTmp != null) {
                if (nodeTmpFirstLast.getValue().toString().equalsIgnoreCase(nodeTmp.getValue().toString())) {
                    count ++;
                }
                nodeTmp = nodeTmp.getNextNode();
            }
        }
        return count;
    }

    public static boolean isAlphabet(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (Character.toLowerCase(word1.charAt(i)) != Character.toLowerCase(word2.charAt(i))) {
                return ((Character.toLowerCase(word1.charAt(i)) < Character.toLowerCase(word2.charAt(i))));
            }
        }
        return (word1.length() < word2.length());
    }

    public static boolean task8(List list){
        Node nodeTmp = list.getHead();

        while (nodeTmp.getNextNode() != null) {
            if(!isAlphabet(nodeTmp.getValue().toString(),nodeTmp.getNextNode().getValue().toString())){
                return false;
            }
            nodeTmp = nodeTmp.getNextNode();
        }
        return true;
    }

    public static boolean task9(List listBig, List listSmall) {
        StringBuilder stringBuilderBig = new StringBuilder();
        StringBuilder stringBuilderSmall = new StringBuilder();
        Node nodeTmp = listBig.getHead();

        while (nodeTmp != null) {
            stringBuilderBig.append(nodeTmp.getValue().toString());
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp = listSmall.getHead();
        while (nodeTmp != null) {
            stringBuilderSmall.append(nodeTmp.getValue().toString());
            nodeTmp = nodeTmp.getNextNode();
        }
        return (stringBuilderBig.toString().contains(stringBuilderSmall.toString()));
    }

    public static void task10(List list) {
        Node nodeTmp = list.getHead();
        int count = 1;

        while (nodeTmp.getNextNode().getNextNode() != null) {
            count++;
            nodeTmp = nodeTmp.getNextNode();
        }
        for (int i = count; i > 0; i--) {
            nodeTmp = list.getHead();
            for (int j = 0; j < i - 1; j++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            list.push(nodeTmp.getValue());
            list.pop(i - 1);
        }
    }


    /*public void reverse(){//Перевернуть список наоборот.
        NodeGns nodeTmp = this.head;
        NodeGns tmpA = null;
        NodeGns tmpB = null;
        int j=0;
        while (nodeTmp != null) {
            tmpA = nodeTmp;
            nodeTmp = nodeTmp.getNextNode();
            tmpA.setNextNode(tmpB);
            tmpB=tmpA;
        }
        head=tmpA;
    }//reverse
*/
}
