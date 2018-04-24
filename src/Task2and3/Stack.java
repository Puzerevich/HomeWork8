package Task2and3;

public class Stack {
    private Object[] stek = new Object[0];

    public Stack() {
        super();
    }
    public void addStack(Object obj, BlackList blackList) {

        if (blackList.checkObject(obj)) {
            Object[] temp = new Object[stek.length + 1];
            System.arraycopy(stek, 0, temp, 0, stek.length);
            temp[temp.length - 1] = obj;
            stek = temp;
        } else
            System.out.println("Object " + obj.toString() + " in BlackList and can`t be add to Stack ");
    }

    public void getRemoveStack(Object obj) {
        int p = 0;
        for (int i = 0; i < stek.length; i++) {
            if (stek[i] == obj) {
                p++;
                System.out.println("Object " + stek[i] + " was found in stack on " + (i + 1)+ " position and successfully deleted!");
                Object[] tempOne = new Object[stek.length - 1];
                System.arraycopy(stek, 0, tempOne, 0, i);

                for (int z = i; z < tempOne.length; z++) {
                    tempOne[z] = stek[z + 1];
                }

                stek = tempOne;
            }
        }
        if (p == 0)
            System.out.println(obj.toString() + " was not found in stack!");
    }

    public void getTopStack() {
        if (stek.length > 0)
            System.out.println(stek[stek.length - 1]);
        else
            System.out.println("Stack is empty!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object obj1 : stek) {
            sb.append(obj1).append(System.lineSeparator());
        }
        return sb.toString();
    }

}