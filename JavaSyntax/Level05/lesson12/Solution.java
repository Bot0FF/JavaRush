package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

    public static void main(String[] args) {

        Man alex = new Man("Alex", 21, "Moscow");
        Man max = new Man("Max", 25, "Volgograd");
        Woman anna = new Woman("Anna", 18, "Moscow");
        Woman kate = new Woman("Kate", 20, "Volgograd");

        System.out.println(alex.name + " " + alex.age + " " + alex.address);
        System.out.println(max.name + " " + max.age + " " + max.address);
        System.out.println(anna.name + " " + anna.age + " " + anna.address);
        System.out.println(kate.name + " " + kate.age + " " + kate.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
