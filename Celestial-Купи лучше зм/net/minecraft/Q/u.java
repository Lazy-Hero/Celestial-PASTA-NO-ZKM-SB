/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class u
implements K<a> {
    private /* synthetic */ int[] a;

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a.length);
        int[] arrn = this.a;
        int n2 = arrn.length;
        boolean bl2 = aD.i();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn[i2];
            m2.d(n3);
            if (bl2) continue;
        }
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = new int[m2.a()];
        boolean bl2 = aD.i();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = m2.a();
            if (bl2) continue;
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public u(int ... arrn) {
        this.a = arrn;
    }

    public int[] a() {
        return this.a;
    }

    public u() {
    }
}

