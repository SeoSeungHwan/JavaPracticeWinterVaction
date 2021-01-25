package MethodProgramming;

import java.util.function.Function;

public class FunctionExample {
    public static int excuteFunction(String context,
                                     Function<String, Integer> function){
        return function.apply(context);
    }

    public static void main(String[] args) {
        FunctionExample.excuteFunction("Hello Function Interface" ,
                (String context) -> context.length());
    }
}
