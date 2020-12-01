package additional_task;

public class Animal {
    String name;
    int age;
    Boolean tail ;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
    @Override
    public String toString() {

      return "Имя: " + name + " возраст: " + age + " хвост: " + tail;
    }

    @Override
     public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Animal anim = (Animal) obj;
            boolean resName = anim.name.equals(this.name);
            boolean resAge = anim.age == this.age;
            boolean resTail = anim.tail == this.tail;
            return resName && resAge && resTail;
        }
        return false;
    }

    @Override
    public int hashCode () {
        int result = 37;
        result = 37 + result + (name != null ? name.hashCode() : 1);
        result = 37 + result + age;

        result = 37 + result +(tail? 1:0);

      return result;
    }
}
