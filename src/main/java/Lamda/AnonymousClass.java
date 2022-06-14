package Lamda;


interface TurnOn {
    void on();
}

public class AnonymousClass{
    public static void main(String[] args) {
        // Создание анонимного класса и переопределение метода на одноразовое использование, вместо полноценного класса
        TurnOn onGeneral = new TurnOn() {
            @Override
            public void on() {
                System.out.println("Turn on the general light!");
            }
        };

        // Использование лямбды (если класс содержит лишь один метод)
        TurnOn onOther = (TurnOn) () -> System.out.println("Turn on the other light!");

//        onGeneral.on();
        onOther.on();
    }
}
