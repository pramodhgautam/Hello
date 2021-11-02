package inheritence;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/2/21
 */

public class Class1  extends Class2{
    /**
     * I have this feature here
     */
    Class1() {
        System.out.println("Default 1 Cons Called");
    }

    Class1(String a) {
        System.out.println(a);
    }

    void feature1() {
        System.out.println("Method Default 1" );
    }

}
