public class Person {

    private String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printNameAndSecondName(){
        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: "+ sekondName);
    }
}
