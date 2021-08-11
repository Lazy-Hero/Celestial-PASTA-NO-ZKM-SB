/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.C;

public final class F
extends RuntimeException {
    public static final /* synthetic */ F a;

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    static {
        a = new F();
    }

    private F() {
        this.setStackTrace(new StackTraceElement[0]);
    }
}

