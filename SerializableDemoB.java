import  java.io.ObjectOutputStream;
import  java.io.FileOutputStream;
import java.io.Serializable;

import java.io.IOException;;

class Student implements   Serializable{

    int id;
    String name;
    double marks;

    Student(int id, String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayData(){
        System.out.println("id " + id);
        System.out.println("name "+name);
        System.out.println("marks " + marks);
    }
}

public class SerializableDemoB{

    public static void main(String [] args) throws IOException{
        System.out.println("hi..");
        FileOutputStream fs = new FileOutputStream("objectstate.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fs);
        Student st = new Student(101,"bhakti",90.89);
        oos.writeObject(st);
        oos.close();
        System.out.println("object state created successfully");


    }
}