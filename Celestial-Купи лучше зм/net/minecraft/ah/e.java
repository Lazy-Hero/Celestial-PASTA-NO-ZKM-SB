/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

public enum e {
    PEACEFUL(0, "options.difficulty.peaceful"),
    EASY(1, "options.difficulty.easy"),
    NORMAL(2, "options.difficulty.normal"),
    HARD(3, "options.difficulty.hard");

    private final /* synthetic */ String d;
    private final /* synthetic */ int b;
    private static final /* synthetic */ e[] c;

    private e(int n3, String string2) {
        this.b = n3;
        this.d = string2;
    }

    public static e a(int n2) {
        return c[n2 % c.length];
    }

    public int a() {
        return this.b;
    }

    static {
        c = new e[e.values().length];
        e[] arre = e.values();
        int n2 = arre.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            e e10;
            e.c[e10.b] = e10 = arre[i2];
        }
    }

    public String b() {
        return this.d;
    }
}

