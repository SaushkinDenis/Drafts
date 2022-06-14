package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteObject {
    public static void write(String path, List<SimpleClass> objects){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeInt(objects.size());
            for(Object ob:objects){
                oos.writeObject(ob);
            }
        } catch (FileNotFoundException e) { System.out.println("Файл не найден!");
        } catch (IOException e) { e.printStackTrace(); }
    }
}
