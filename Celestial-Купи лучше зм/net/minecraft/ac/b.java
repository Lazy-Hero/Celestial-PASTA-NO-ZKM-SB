/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ac;

import net.minecraft.k.m;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b BLOCK;
    public static final /* synthetic */ /* enum */ b NORMAL;
    public static final /* synthetic */ /* enum */ b IGNORE;
    private static final /* synthetic */ b[] a;
    private static /* synthetic */ m[] b;
    public static final /* synthetic */ /* enum */ b DESTROY;
    public static final /* synthetic */ /* enum */ b PUSH_ONLY;

    public static m[] b() {
        return b;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    static {
        NORMAL = new b();
        net.minecraft.ac.b.b(null);
        DESTROY = new b();
        BLOCK = new b();
        IGNORE = new b();
        PUSH_ONLY = new b();
        a = new b[]{NORMAL, DESTROY, BLOCK, IGNORE, PUSH_ONLY};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])a.clone();
    }
}

