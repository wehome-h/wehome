package com.wehome.p7;

public class StringTools {

    String concat(char seperator, String... args) {
        String str = "";

        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                str += args[i];
            } else {
                str += seperator + args[i];
            }
        }

        return str;
    }

}
