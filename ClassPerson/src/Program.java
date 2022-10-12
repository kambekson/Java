public class Program {
    public static void main(String[] args) {

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
        Person tom = new Person("Tom", 18);
        tom.displayInfo();

    }
    static class Person{
        String fullName;
        int age;
        Person(String name, int age){
            this.fullName = name;
            this.age = age;

        }
        void displayInfo(){
            System.out.println("Это " + this.fullName + " ему " + this.age + " лет. ");
        }
    }
    }




