/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.g.d;

public abstract class m {
    private static /* synthetic */ net.minecraft.k.m[] b;
    private final /* synthetic */ d[] c;

    static {
        if (m.b() == null) {
            m.b(new net.minecraft.k.m[1]);
        }
    }

    protected m(d[] arrd) {
        this.c = arrd;
    }

    public static void b(net.minecraft.k.m[] arrm) {
        b = arrm;
    }

    public static net.minecraft.k.m[] b() {
        return b;
    }

    public abstract net.minecraft.w.d a(net.minecraft.w.d var1, Random var2, k var3);

    public d[] c() {
        return this.c;
    }
}

