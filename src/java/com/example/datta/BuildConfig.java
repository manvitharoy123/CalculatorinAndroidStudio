
package com.example.datta;

public final class BuildConfig {
    public static final String APPLICATION_ID = "com.example.datta";
    public static final String BUILD_TYPE = "debug";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "1.0";

    static {
        DEBUG = Boolean.parseBoolean((String)"true");
    }
}

