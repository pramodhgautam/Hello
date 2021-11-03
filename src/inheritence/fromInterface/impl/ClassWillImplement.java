package inheritence.fromInterface.impl;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/3/21
 */

import inheritence.fromInterface.ClassInterface;

/**
 * Class Extends
 * Interface Implements, Interface and Interface- Extends
 */
public class ClassWillImplement implements ClassInterface {

    @Override
    public void hasBalance() {
        System.out.println("Will Implement");
    }
}
