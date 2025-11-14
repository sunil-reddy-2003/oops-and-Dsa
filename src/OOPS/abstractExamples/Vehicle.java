package OOPS.abstractExamples;

public abstract class Vehicle {
    abstract void start();          // abstract, no body, must implement
    void stop() {                   // concrete, has body, can override
        System.out.println("Stop");
    }
    static void info() {}            // static, has body, cannot override
    private void helper() {}         // private, has body, cannot override
    private static void staticHelper() {} // private static, has body, cannot override
}
