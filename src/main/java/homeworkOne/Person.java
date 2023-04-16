package homeworkOne;

public class Person {

    String name;
    byte age;
    Address address;

    /* This is not needed because the compiler provides this by default */
    public Person(){
    }

    public Person (String name, byte age){
        this.name = name;
        this.age = age;
    }

    public Person (String name, byte age, Address address){
        this(name, age);
        this.address = address;
    }

    public void printDetails(){
        System.out.println(name + " " + age + " " + address);
    }

    public void printDetails(boolean shouldPrintDetails){
        if(shouldPrintDetails){
            this.printDetails();
        } else {
            System.out.println(name + " " + age);
        }
    }

}
