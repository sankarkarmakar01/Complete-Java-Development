package oop;

class HumanDemo {
    String name;
    int age;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        HumanDemo h = new HumanDemo();
        h.setName("Sankar");
        h.setAge(21);
        h.setEmail("sankar@gmail.com");
        System.out.println(h.getName() + " | " + h.getAge() + " | " + h.getEmail());
    }
}
