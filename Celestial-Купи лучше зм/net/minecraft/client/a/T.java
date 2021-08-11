/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aA;
import net.minecraft.client.a.I;
import net.minecraft.client.k.s;

public class T {
    /* synthetic */ boolean b;
    /* synthetic */ aA c;
    /* synthetic */ s a;
    /* synthetic */ int d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public T(s s2, aA aA2, int n2) {
        this.b = false;
        this.a = s2;
        this.c = aA2;
        this.d = n2;
    }

    public void a(byte by2, aA aA2) {
        this.d = this.d | by2 | 1 << aA2.ordinal();
    }

    public boolean a(aA aA2) {
        String string = I.j();
        boolean bl2 = this.d & 1 << aA2.ordinal();
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    private void a(s s2, aA aA2, int n2) {
        this.a = s2;
        this.c = aA2;
        this.d = n2;
    }

    static void a(T t2, s s2, aA aA2, int n2) {
        t2.a(s2, aA2, n2);
    }
}

