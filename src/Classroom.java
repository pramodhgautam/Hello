import inheritence.fromInterface.ClassInterface;
import inheritence.fromInterface.impl.ClassMightImplement;
import inheritence.fromInterface.impl.ClassWillImplement;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/2/21
 */

class Classroom {

    Classroom2 classroom2 = new Classroom2();
    static ClassInterface classInterface ;
    Classroom(){

    }

    void getvar() {
        classroom2.getvar();
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        if(args[0].equals("0"))
            Classroom.classInterface = new ClassWillImplement();
        else Classroom.classInterface = new ClassMightImplement();
        Classroom.classInterface.hasBalance();
        classroom.getvar();
    }
/**
 * 1. Fix this issue and make it run.?(Issue Solve)
 * 2. Extend Interface Class2Interface in ClassInterface with another method void isQualified()?
 */
    /**
     * Access Control
     *
     * @param args
     */
    static String a = "hello";

    class Classroom2 {

        void getvar() {
            System.out.println(Classroom.a);

            System.out.println(new Classroom().a);
        }


        /**
         * Keywords
         * Private, default , public & Protected
         * VAriables, Method access control
         */
        /**
         * what is static??
         *  Relation to class rather than object
         */
        //    public static void main(String[] args){
//      System.out.println(a);
//    }


    }


}
