package Task1;

import java.io.Serializable;

public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    private String grName;
    private Student[] group;

    Group(){
        group=new Student[0];
    }

    public String getGrName() {
        return grName;
    }

    public void setGrName(String grName) {
        this.grName = grName;
    }

    public void addStudent(String name, int age, char sex){
        Student[] c= new Student[group.length+1];
        System.arraycopy(group, 0,c , 0, group.length);
        c[c.length-1]=new Student(name,age,sex);
        group=c;
    }

    public void printgroup(){
        for(Student k:group){
            System.out.println(k);
        }
    }
}