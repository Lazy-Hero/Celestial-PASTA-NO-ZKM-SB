/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

public enum b {
    FULL(0, "options.chat.visibility.full"),
    SYSTEM(1, "options.chat.visibility.system"),
    HIDDEN(2, "options.chat.visibility.hidden");

    private static final /* synthetic */ b[] a;
    private final /* synthetic */ String c;
    private final /* synthetic */ int d;

    private b(int n3, String string2) {
        this.d = n3;
        this.c = string2;
    }

    public static b a(int n2) {
        return a[n2 % a.length];
    }

    static {
        a = new b[net.minecraft.i.b.values().length];
        b[] arrb = net.minecraft.i.b.values();
        int n2 = arrb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            b b10;
            net.minecraft.i.b.a[b10.d] = b10 = arrb[i2];
        }
    }

    public int b() {
        return this.d;
    }

    public String a() {
        return this.c;
    }
}

