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
import net.minecraft.ar.ab;
import net.minecraft.o.a;
import net.minecraft.o.e;
import net.minecraft.o.i;

public class g
implements e {
    private final /* synthetic */ i b;
    private final /* synthetic */ int c;
    private final /* synthetic */ ab<net.minecraft.Z.i> a;

    @Override
    public void b(m m2) {
        int[] arrn = net.minecraft.o.a.k();
        this.a.c();
        int n2 = m2.a();
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.a(K.i.a(m2.a()));
            if (arrn2 != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(m m2) {
        int[] arrn = net.minecraft.o.a.k();
        int n2 = this.a.b();
        m2.d(n2);
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < n2; ++i2) {
            m2.d(K.i.a(this.a.a(i2)));
            if (arrn2 != null) continue;
        }
    }

    @Override
    public int a(net.minecraft.Z.i i2) {
        int n2;
        block4: {
            int n3;
            block5: {
                n3 = this.a.b(i2);
                int[] arrn = net.minecraft.o.a.k();
                n2 = n3;
                if (arrn == null) break block4;
                if (n2 != -1) break block5;
                n2 = n3 = this.a.a(i2);
                if (arrn == null) break block4;
                if (n2 >= 1 << this.c) {
                    n3 = this.b.a(this.c + 1, i2);
                }
            }
            n2 = n3;
        }
        return n2;
    }

    public g(int n2, i i2) {
        this.c = n2;
        this.b = i2;
        this.a = new ab(1 << n2);
    }

    @Override
    @Nullable
    public net.minecraft.Z.i a(int n2) {
        return this.a.a(n2);
    }

    @Override
    public int a() {
        int n2;
        block2: {
            int n3 = m.a(this.a.b());
            int[] arrn = net.minecraft.o.a.k();
            for (int i2 = 0; i2 < this.a.b(); ++i2) {
                n2 = n3 + m.a(K.i.a(this.a.a(i2)));
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
}

