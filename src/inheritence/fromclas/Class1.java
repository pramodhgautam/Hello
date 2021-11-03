package inheritence.fromclas;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/2/21
 */

public class Class1  extends Class2 {
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

    protected void feature2(){
//        super.feature2();
        System.out.println("Feature 2 from Feature 1 accessed!!!");

    }
}
