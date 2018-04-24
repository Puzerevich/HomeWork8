package Task2and3;

/**
 * Created by Konstantin on 24.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        // BlackList
        BlackList blackList = new BlackList();
        blackList.addToBlackList(boolean.class);
        System.out.println("BlackList:");
        System.out.println(blackList);

        // Stack
        Stack stek = new Stack();

        stek.addStack("StackInfo1", blackList);
        stek.addStack(5, blackList);
        stek.addStack("StackInfo2", blackList);
        stek.addStack(true, blackList);
        stek.addStack("StackInfo3", blackList);
        stek.addStack(8, blackList);

        // Print info from stack
        System.out.println("Stack:");
        System.out.println(stek);
        System.out.println("*************");
        System.out.println("Top value from stack:");
        stek.getTopStack();

        System.out.println("Delete value from stack:");
        stek.getRemoveStack("StackInfo2");
        System.out.println("Stack after delete value:");
        System.out.println(stek);

    }
}
