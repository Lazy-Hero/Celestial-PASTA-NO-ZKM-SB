/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.A;

import net.minecraft.k.m;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e UNOBTAINED;
    private static /* synthetic */ m[] b;
    private static final /* synthetic */ e[] d;
    public static final /* synthetic */ /* enum */ e OBTAINED;
    private final /* synthetic */ int c;

    public static m[] b() {
        return b;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private e(int n3) {
        this.c = n3;
    }

    static {
        OBTAINED = new e(0);
        e.b(new m[5]);
        UNOBTAINED = new e(1);
        d = new e[]{OBTAINED, UNOBTAINED};
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public int a() {
        return this.c;
    }

    public static e[] values() {
        return (e[])d.clone();
    }
}

