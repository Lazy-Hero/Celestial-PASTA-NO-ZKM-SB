/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.aR;
import net.minecraft.ar.v;

public class t
implements aR {
    private static /* synthetic */ int b;
    private final /* synthetic */ v c;

    public String toString() {
        return "AbstractCriterionInstance{criterion=" + this.c + '}';
    }

    public static int c() {
        int n2 = t.b();
        if (n2 == 0) {
            return 41;
        }
        return 0;
    }

    public t(v v2) {
        this.c = v2;
    }

    @Override
    public v a() {
        return this.c;
    }

    static {
        if (t.c() == 0) {
            t.b(27);
        }
    }

    public static int b() {
        return b;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static void b(int n2) {
        b = n2;
    }
}

