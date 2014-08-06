/**
 * File: interfaces
 * User: YcY
 * Date: 14-7-29
 * Time: обнГ9:36
 * Describetion:
 */
package com.example.interfaces_better;

public class Implementation1 implements Service {

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}
