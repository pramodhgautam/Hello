package inheritence.fromclas;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/2/21
 */

public class Class extends Class1 {
//    /**
//     * Feature 1, Feature 2
//     */
//    Class1 class1 = new Class1( );
//
//    /**
//     * Default Call
//     */
    Class(){
        this.feature2();
        super.feature2();
        System.out.println("Class Default Con Called");
    }

    public static void main(String[] args) {
        new Class().feature2();
    }
    /**
     * From this class Access Feature 2 without making any objects here.??????
     */
}
