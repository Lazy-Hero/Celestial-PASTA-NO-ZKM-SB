/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.Comparator;
import net.minecraft.U.x;
import net.minecraft.ak.h;

public class f
implements Comparator<x> {
    private final /* synthetic */ x a;

    public int a(x x2, x x3) {
        double d10 = this.a.s(x2);
        double d11 = this.a.s(x3);
        String string = h.h();
        double d12 = d10 == d11 ? 0 : (d10 < d11 ? -1 : 1);
        if (string == null) {
            if (d12 < 0) {
                return -1;
            }
            d12 = d10 == d11 ? 0 : (d10 > d11 ? 1 : -1);
        }
        if (string == null) {
            d12 = d12 > 0 ? 1.0 : 0.0;
        }
        return (int)d12;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public f(x x2) {
        this.a = x2;
    }
}

