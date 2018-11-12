
/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        Person p1 = new Person("ming", 23, "男");
        p1.addFirend("kebi");
        p1.addFirend("zms");
        p1.addFirend("yao");
        Person p2 = p1.clonePerson();
        System.out.println(p1.getFirends() == p2.getFirends());
        p1.println();
        p2.println();
        System.out.println(p1 == p2); // false
    }
}