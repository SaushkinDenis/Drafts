package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadObject {
    public static List<SimpleClass> read(String path){
        List<SimpleClass> result = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            int size = ois.readInt();
            for(int i = 0; i < size; i++){
                result.add((SimpleClass) ois.readObject());
           }
        } catch (FileNotFoundException e) {
           System.out.println("Файл не найден!");
        } catch (ClassNotFoundException e) {
           System.out.println("Ошибка класса!");
        } catch (IOException e) {
           e.printStackTrace();
        }
        return result;
    }
}
