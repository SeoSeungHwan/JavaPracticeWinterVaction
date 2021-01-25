package MethodProgramming;

import java.util.function.Supplier;

public class SupplierExample {
    public static String executeSupplier (Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String version = "version 0.1";
        SupplierExample.executeSupplier(() -> {return version;});
    }
}
