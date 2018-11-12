import java.util.ArrayList;
import java.util.List;

/**
 * Person
 */
public class Person implements Cloneable{

    private String name;
    private int age;
    private String sex;

    private List<String> firends = new ArrayList<>();

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param firends the firends to set
     */
    public void setFirends(List<String> firends) {
        this.firends = firends;
    }

    /**
     * @return the firends
     */
    public List<String> getFirends() {
        return firends;
    }

    public void addFirend(String f) {
        firends.add(f);
    }

    public Person clonePerson() {
        Person person = Person(super.clone());
        // 深度克隆
        List<String> f = firends.subList(0, firends.size());
        person.setFirends(f);
        return person;
    }

    public void println() {
        System.out.println("name is :" + name);
        System.out.println("age is :" + age);
        System.out.println("sex is :" + sex);

        System.out.println("firends is :" + firends.toString());
    }
}