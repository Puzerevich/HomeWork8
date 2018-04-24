package Task1;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String askUser = "Y";
        Group grOne = new Group();
        grOne.setGrName("group");
        grOne.addStudent("Anna", 17, 'ж');
        grOne.addStudent("Tomas", 18, 'м');
        grOne.addStudent("Gina", 19, 'ж');
        grOne.addStudent("Pit", 20, 'м');

        System.out.println();
        System.out.println("Data base of Students:");
        System.out.println(grOne.getGrName());
        grOne.printgroup();
        System.out.println("\n");

        while (askUser.equalsIgnoreCase("Y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("For write data base of Students put W , for to read - put R");
            String action = sc.nextLine();

            if (action.equalsIgnoreCase("W")) {

                try (ObjectOutputStream OOS = new ObjectOutputStream(
                        new FileOutputStream(grOne.getGrName() + ".txt"))) {
                    OOS.writeObject(grOne);
                    System.out.println("File " + grOne.getGrName() + ".txt was saved");
                } catch (IOException e) {
                    System.out.println("ERROR! File wasn`t saved !!!");
                }

            } else if (action.equalsIgnoreCase("R")) {

                System.out.println("Input name of file");
                String file = sc.nextLine();

                Group grTwo = null;
                try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
                    grTwo = (Group) OIS.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("ERROR! Cant`t read a file " + file + "!!!");
                }
                System.out.println();
                System.out.println("List of Students from " + file);
                System.out.println();
                grTwo.printgroup();
            } else {
                System.out.println("Unknown type of action! Put R or W!");
            }

            System.out.println("Do you want to continue? (Y/N)");
            askUser = sc.nextLine();

        }

    }

}
