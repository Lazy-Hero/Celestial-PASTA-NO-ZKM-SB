/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.o.a;
import net.minecraft.u.g;

public class l {
    private final /* synthetic */ char[] a;
    private static final /* synthetic */ i b;

    public void a(int n2, int n3, int n4, i i2) {
        this.a[l.a((int)n2, (int)n3, (int)n4)] = (char)K.i.a(i2);
    }

    public int a(int n2, int n3) {
        int n4 = (n2 << 12 | n3 << 8) + 256 - 1;
        int n5 = 255;
        int[] arrn = net.minecraft.o.a.k();
        while (n5 >= 0) {
            i i2 = K.i.a(this.a[n4 + n5]);
            if (arrn != null) {
                if (i2 != null && i2 != b) {
                    return n5;
                }
                --n5;
            }
            if (arrn != null) continue;
        }
        return 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static int a(int n2, int n3, int n4) {
        return n2 << 12 | n4 << 8 | n3;
    }

    public l() {
        this.a = new char[65536];
    }

    static {
        b = g.bf.d();
    }

    public i b(int n2, int n3, int n4) {
        i i2 = K.i.a(this.a[l.a(n2, n3, n4)]);
        int[] arrn = net.minecraft.o.a.k();
        i i3 = i2;
        if (arrn != null) {
            i3 = i3 == null ? b : i2;
        }
        return i3;
    }
}

