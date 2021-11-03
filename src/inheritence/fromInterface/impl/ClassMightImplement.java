package inheritence.fromInterface.impl;

import inheritence.fromInterface.ClassInterface;

/**
 * @Author: utsab
 * @For: Classroom
 * @At: 11/3/21
 */

public class ClassMightImplement implements ClassInterface {
    @Override
    public void hasBalance() {
        System.out.println("Might Implement");
    }
}
