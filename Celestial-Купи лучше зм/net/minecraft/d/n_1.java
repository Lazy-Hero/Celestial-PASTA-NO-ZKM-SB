/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.at.k;
import net.minecraft.d.z;
import net.minecraft.k.m;
import net.minecraft.n.b;

public class n
implements K<b> {
    private /* synthetic */ String[] b;
    private /* synthetic */ net.minecraft.k.n a;

    public net.minecraft.k.n b() {
        return this.a;
    }

    public n() {
    }

    public String[] a() {
        return this.b;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        int[] arrn = z.b();
        m2.a(this.a);
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < 4; ++i2) {
            m2.a(this.b[i2]);
            if (arrn2 != null) continue;
        }
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.a = m2.l();
        this.b = new String[4];
        int[] arrn = z.b();
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b[i2] = m2.c(384);
            if (arrn != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public n(net.minecraft.k.n n2, k[] arrk) {
        block0: {
            this.a = n2;
            this.b = new String[]{arrk[0].f(), arrk[1].f(), arrk[2].f(), arrk[3].f()};
            int[] arrn = z.b();
            if (m.d()) break block0;
            z.b(new int[4]);
        }
    }
}

