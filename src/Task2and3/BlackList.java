package Task2and3;


public class BlackList {
    private Class[] blackListArray = new Class[0];

    public BlackList() {
        super();
    }

    public void addToBlackList(Class clas) {
        if (checkBlackList(clas)) {
            return;
        }
        Class[] temp = new Class[blackListArray.length + 1];
        System.arraycopy(blackListArray, 0, temp, 0, blackListArray.length);
        temp[temp.length - 1] = clas;
        blackListArray = temp;
    }

    private boolean checkBlackList(Class clas) {
        for (Class classOne : blackListArray) {
            if (classOne != null || classOne == clas) {
                return true;
            }
        }
        return false;
    }

    public boolean checkObject(Object obj) {
        if (obj == null) {
            return false;
        }
        Class clas = obj.getClass();
        return checkBlackList(clas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Class class1 : blackListArray) {
            sb.append(class1).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
