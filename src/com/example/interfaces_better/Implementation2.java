/**
 * File: interfaces
 * User: YcY
 * Date: 14-7-29
 * Time: обнГ11:56
 * Describetion:
 */
package com.example.interfaces_better;

public class Implementation2 implements Service {


    public void method1() {
        System.out.println("Implementation2 method1");
    }

    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
