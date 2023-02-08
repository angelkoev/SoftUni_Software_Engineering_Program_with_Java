package E06_ObjectsAndClasses_Lab;

public class E00_ObjectAndClasses_Lecture {

    static class Student {
        String name;        // полета
        int id;
        int age;

        Student(String name, int id, int age) {  // конструктор !!!   тука this е важен, иначе нищо не правим !!!
            this.name = name;           // метод, който няма return и се вика с new
            this.id = id;               // връща обект с името на класа...
            this.age = age;             // може да имаме повече от един конструктор (overload на конструтор).
        }                               // примерно с или без параметри.

        void increaseAge() {
            this.age++;
        }

        String getnfo() {
            return "ID:" + this.id + ", " + "age:" + this.age + ", " + "name:" + this.name;
        }                               // става и без this отпред, но е добре да го пишем !!!
    }


    public static void main(String[] args) {

//        Student a = new Student(); // конструктор !!!
        Student a = new Student("Joro", 12345678, 30); // конструктор !!!
//        a.age = 30;
//        a.id = 12345678;
//        a.name = "Joro";

        System.out.println(a.getnfo());

//        Student b = new Student();
        Student b = new Student("Pesho", 10101010, 25);
//        b.age = 25;
//        b.id = 10101010;
//        b.name = "Pesho";

        System.out.println(b.getnfo());

    }
}
