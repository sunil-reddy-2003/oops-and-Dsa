package OOPS.interfaces.Machine;


interface Machine {
    void start();                    // abstract, no body, must implement
    default void shutdown() {        // default, has body, can override
        System.out.println("Shutdown");
    }
    static void info() {}             // static, has body, cannot override
    private void helper() {}          // private, has body, cannot override
    private static void staticHelper() {} // private static, has body, cannot override
}
