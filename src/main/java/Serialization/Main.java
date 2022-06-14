package Serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String path = "src/main/resources/Serialization.bin";

    public static void main(String[] args) {
        write();
        read();
    }

    public static void write() {
        SimpleClass sc1 = new SimpleClass(1, "First");
        SimpleClass sc2 = new SimpleClass(2, "Second");

        List<SimpleClass> objects = new ArrayList<>();
        objects.add(sc1);
        objects.add(sc2);
        WriteObject.write(path, objects);
    }

    public static void read() {
        for (SimpleClass serializationObject : ReadObject.read(path)){
            System.out.println(serializationObject.toString());
        }
    }
}
