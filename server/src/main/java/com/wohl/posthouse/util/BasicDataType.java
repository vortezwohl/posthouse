package com.wohl.posthouse.util;

public enum BasicDataType {

    STRING("STRING"), HASH("HASH"), DEQUE("DEQUE"), SET("SET");

    private String type;

    public static String delimiter = ":";

    BasicDataType(String type) {
        this.type = type;
    }

    //字符串转换为相应的枚举实例
    public static BasicDataType parse(String string) {
        switch (string) {
            case "STRING":
                return BasicDataType.STRING;
            case "HASH":
                return BasicDataType.HASH;
            case "DEQUE":
                return BasicDataType.DEQUE;
            case "SET":
                return BasicDataType.SET;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return type;
    }
}
