/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.o;

import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.W.K;
import net.minecraft.o.a;
import net.minecraft.o.e;
import net.minecraft.o.i;

public class c
implements e {
    private /* synthetic */ int d;
    private final /* synthetic */ net.minecraft.Z.i[] c;
    private final /* synthetic */ i a;
    private final /* synthetic */ int b;

    @Override
    public int a(net.minecraft.Z.i i2) {
        int n2;
        block8: {
            block9: {
                int n3;
                block7: {
                    int n4;
                    net.minecraft.Z.i[] arri;
                    n3 = 0;
                    int[] arrn = net.minecraft.o.a.k();
                    while (n3 < this.d) {
                        arri = this.c;
                        n4 = n3++;
                        if (arrn != null) {
                            if (arri[n4] == i2) {
                                return n3;
                            }
                            if (arrn != null) continue;
                        }
                        break block7;
                    }
                    n2 = n3 = this.d;
                    if (arrn == null) break block8;
                    if (n2 >= this.c.length) break block9;
                    arri = this.c;
                    n4 = n3;
                }
                arri[n4] = i2;
                ++this.d;
                return n3;
            }
            n2 = this.a.a(this.b + 1, i2);
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public net.minecraft.Z.i a(int n2) {
        int[] arrn = net.minecraft.o.a.k();
        int n3 = n2;
        if (arrn != null) {
            if (n3 < 0) return null;
            n3 = n2;
        }
        if (n3 >= this.d) return null;
        net.minecraft.Z.i i2 = this.c[n2];
        return i2;
    }

    @Override
    public int a() {
        int n2;
        block2: {
            int n3 = m.a(this.d);
            int[] arrn = net.minecraft.o.a.k();
            for (int i2 = 0; i2 < this.d; ++i2) {
                n2 = n3 + m.a(K.i.a(this.c[i2]));
                if (arrn != null) {
                    n3 = n2;
                    if (arrn != null) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public void b(m m2) {
        this.d = m2.a();
        int[] arrn = net.minecraft.o.a.k();
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.c[i2] = K.i.a(m2.a());
            if (arrn != null) continue;
        }
    }

    public c(int n2, i i2) {
        this.c = new net.minecraft.Z.i[1 << n2];
        this.b = n2;
        this.a = i2;
    }

    @Override
    public void a(m m2) {
        m2.d(this.d);
        int[] arrn = net.minecraft.o.a.k();
        for (int i2 = 0; i2 < this.d; ++i2) {
            m2.d(K.i.a(this.c[i2]));
            if (arrn != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

