package ParametrizedType;

// Обобщенный класс
class Param<T extends Number, V extends String>{
    T firstParam;
    V secondParam;

    Param(T firstObject, V secondObject){
        this.firstParam = firstObject;
        this.secondParam = secondObject;
    }

    T getFirstParam(){
        return firstParam;
    }

    V getSecondParam(){
        return secondParam;
    }

    void showTypes(){
        System.out.println("Type of first object" + firstParam.getClass().getName());
        System.out.println("Type of second object" + secondParam.getClass().getName());
    }

    int getCountSymbols(){
        return getSecondParam().length();
    }

    boolean comparisonStrings(Param<?, ?> object){
        return getCountSymbols() == object.getCountSymbols();
    }
}

// Обобщенные метод и конструктор
class ComparisonWith100 {
    int param;

    <T extends Number> ComparisonWith100(T object){
        this.param = object.intValue();
    }

    <T extends Number> boolean moreThan100(){
        return param > 100;
    }
}

// Обобщенный интерфейс
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

class realizeMinMax<T extends Comparable<T>> implements MinMax<T>{
    T[] list;

    realizeMinMax(T[] list){
        this.list = list;
    }

    @Override
    public T min() {
        T min = list[0];
        for(T item:list){
            if (item.compareTo(min) < 0) min = item;
        }
        return min;
    }

    @Override
    public T max() {
        T max = list[0];
        for(T item: list){
            if(item.compareTo(max) > 0) max = item;
        }
        return max;
    }
}



public class parametrized {
    public static void main(String[] args) {
//        createParametrizedClass();
//        createParametrizedMethodAndConstructor();
        createParametrizedInterface();
    }

    static void createParametrizedClass(){
        Param<Integer, String> firstObject;
        firstObject = new Param<>(9000, "Девять тысяч");

        firstObject.showTypes();
        int first = firstObject.getFirstParam();
        System.out.println(first);
        String second = firstObject.getSecondParam();
        System.out.println(second);


        Param<Double, String> secondObject = new Param<>(12.3, "Why don't you mind?");

        secondObject.showTypes();
        System.out.println(secondObject.getFirstParam());
        System.out.println(secondObject.getSecondParam());

        secondObject.comparisonStrings(firstObject);
    }

    static void createParametrizedMethodAndConstructor(){
        ComparisonWith100 object = new ComparisonWith100(100.1);
        System.out.println(object.moreThan100());
    }

    static void createParametrizedInterface(){
        Integer[] items = {1, 23, 4, 5, 21, 3};
        realizeMinMax<Integer> objectInt = new realizeMinMax<>(items);
        System.out.println(objectInt.min());
        System.out.println(objectInt.max());

        Character[] itemsChar = {'z', 'q', 'a', 's', 'c', 'v'};
        realizeMinMax<Character> objectChar = new realizeMinMax<>(itemsChar);
        System.out.println(objectChar.min());
        System.out.println(objectChar.max());

    }
}
