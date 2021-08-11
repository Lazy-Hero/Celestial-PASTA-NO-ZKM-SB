/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.k.m;

public class s
extends Exception {
    private static /* synthetic */ m[] b;
    private final /* synthetic */ Object[] a;

    public Object[] a() {
        return this.a;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public s(String string, Object ... arrobject) {
        super(string);
        this.a = arrobject;
    }

    public static m[] b() {
        return b;
    }

    static {
        if (s.b() == null) {
            s.b(new m[5]);
        }
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

