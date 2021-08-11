/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.e;

public class G {
    private final /* synthetic */ String c;
    private final /* synthetic */ e d;
    private static /* synthetic */ int[] b;

    public static int[] c() {
        return b;
    }

    public e a() {
        return this.d;
    }

    static {
        if (G.c() != null) {
            G.b(new int[2]);
        }
    }

    public String toString() {
        return this.c;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public String b() {
        return this.c;
    }

    public G(e e10, String string) {
        this.d = e10;
        this.c = string;
    }
}

