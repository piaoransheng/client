package com.test.request;

import java.io.Serializable;

public class RpcInfo implements Serializable {

    private static final long serialVersionUID = 7187020518892137591L;
    /**
     * 包名
     * 类名
     * 方法名
     * 方法参数
     */
    private String packageName;
    private String clazzName;
    private String methodName;
    private Object[] args;

    public RpcInfo() {
    }

    public RpcInfo(String packageName, String clazzName, String methodName, Object[] args) {
        this.packageName = packageName;
        this.clazzName = clazzName;
        this.methodName = methodName;
        this.args = args;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
