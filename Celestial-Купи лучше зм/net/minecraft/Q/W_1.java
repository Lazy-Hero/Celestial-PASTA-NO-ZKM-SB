/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.Q.a1;
import net.minecraft.Q.aD;
import net.minecraft.W.K;
import net.minecraft.k.f;
import net.minecraft.n.a;

public class W
implements net.minecraft.C.K<a> {
    private /* synthetic */ f b;
    private /* synthetic */ a1[] a;

    public a1[] a() {
        return this.a;
    }

    public W() {
    }

    public W(int n2, short[] arrs, net.minecraft.o.a a10) {
        boolean bl2 = aD.c();
        this.b = new f(a10.t, a10.i);
        boolean bl3 = bl2;
        this.a = new a1[n2];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new a1(this, arrs[i2], a10);
            if (!bl3) continue;
        }
    }

    static f a(W w2) {
        return w2.b;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = new f(m2.readInt(), m2.readInt());
        this.a = new a1[m2.a()];
        boolean bl2 = aD.i();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new a1(this, m2.readShort(), K.i.a(m2.a()));
            if (bl2) continue;
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.b.c);
        boolean bl2 = aD.i();
        m2.writeInt(this.b.b);
        m2.d(this.a.length);
        boolean bl3 = bl2;
        for (a1 a12 : this.a) {
            m2.writeShort(a12.b());
            m2.d(K.i.a(a12.c()));
            if (bl3) continue;
        }
    }
}

