/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft;

import net.minecraft.aG;
import net.minecraft.at.l;

public enum a0 {
    TASK("task", 0, l.GREEN),
    CHALLENGE("challenge", 26, l.DARK_PURPLE),
    GOAL("goal", 52, l.GREEN);

    private final /* synthetic */ String b;
    private final /* synthetic */ l c;
    private final /* synthetic */ int a;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public String c() {
        return this.b;
    }

    public l a() {
        return this.c;
    }

    public static a0 a(String string) {
        a0[] arra0 = a0.values();
        int n2 = arra0.length;
        boolean bl2 = aG.a();
        int n3 = 0;
        while (n3 < n2) {
            a0 a02 = arra0[n3];
            if (!bl2) {
                if (a02.b.equals(string)) {
                    return a02;
                }
                ++n3;
            }
            if (!bl2) continue;
        }
        throw new IllegalArgumentException("Unknown frame type '" + string + "'");
    }

    private a0(String string2, int n3, l l2) {
        this.b = string2;
        this.a = n3;
        this.c = l2;
    }

    public int b() {
        return this.a;
    }
}

