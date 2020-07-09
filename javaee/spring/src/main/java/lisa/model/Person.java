package lisa.model;

public class Person {
    private Duck duck;

  /*  public Person(Duck duck) {
        this.duck = duck;
    }
*/
    public Person() {
    }

    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "Person{" +
                "duck=" + duck +
                '}';
    }
}
