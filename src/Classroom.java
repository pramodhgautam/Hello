/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/2/21
 */

class Classroom {

    Classroom2 classroom2 = new Classroom2();

    void getvar() {
        classroom2.getvar();
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.getvar();
    }

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
