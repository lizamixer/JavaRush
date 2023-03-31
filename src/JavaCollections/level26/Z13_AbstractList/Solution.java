package JavaCollections.level26.Z13_AbstractList;

public class Solution {
    public static void main(String[] args) {
        CustomTree list = new CustomTree(); //4 заменили с List<String> list = new CustomTree(); и изменили конструктов

        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("The list size is " + list.size());
        System.out.println("The expected parent is 3. The actual parent is " + (list).getParent("8"));
        System.out.println("The expected parent is null. The actual parent is " + (list).getParent("20"));

        list.remove("3");
        System.out.println("The expected parent is null. The actual parent is " + (list).getParent("8"));

        list.add("16");
        System.out.println("The expected parent is 9. The actual parent is " + (list).getParent("16"));

        list.remove("4");
        System.out.println(list.size());
        list.remove("5");
        System.out.println(list.size());
        list.remove("6");
        System.out.println(list.size());
        System.out.println("Expected: true. Actual: " + list.add("20"));
        System.out.println("The expected parent is 1. The actual parent is " + (list).getParent("20"));
    }
}

