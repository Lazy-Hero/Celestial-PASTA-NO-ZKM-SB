/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.i;
import net.minecraft.B.n;

public enum X {
    MAINHAND(i.HAND, 0, 0, "mainhand"),
    OFFHAND(i.HAND, 1, 5, "offhand"),
    FEET(i.ARMOR, 0, 1, "feet"),
    LEGS(i.ARMOR, 1, 2, "legs"),
    CHEST(i.ARMOR, 2, 3, "chest"),
    HEAD(i.ARMOR, 3, 4, "head");

    private final /* synthetic */ int b;
    private final /* synthetic */ int a;
    private final /* synthetic */ String e;
    private final /* synthetic */ i d;

    public int d() {
        return this.a;
    }

    public static X a(String string) {
        X[] arrx = X.values();
        int n2 = n.b();
        int n3 = arrx.length;
        int n4 = 0;
        while (n4 < n3) {
            X x2 = arrx[n4];
            if (n2 != 0) {
                if (x2.c().equals(string)) {
                    return x2;
                }
                ++n4;
            }
            if (n2 != 0) continue;
        }
        throw new IllegalArgumentException("Invalid slot '" + string + "'");
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private X(i i2, int n3, int n4, String string2) {
        this.d = i2;
        this.b = n3;
        this.a = n4;
        this.e = string2;
    }

    public i b() {
        return this.d;
    }

    public int a() {
        return this.b;
    }

    public String c() {
        return this.e;
    }
}

