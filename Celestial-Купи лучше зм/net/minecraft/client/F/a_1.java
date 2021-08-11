/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.client.q.c;
import net.minecraft.client.y.b;
import net.minecraft.k.n;

public class a
implements g {
    private final /* synthetic */ Q a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public a(Q q2) {
        this.a = q2;
    }

    @Override
    public void a(float f10, long l2) {
        block3: {
            c c10 = this.a.s;
            l l3 = this.a.e;
            double d10 = c10.am + (c10.a - c10.am) * (double)f10;
            double d11 = c10.af + (c10.aF - c10.af) * (double)f10;
            double d12 = c10.n + (c10.ax - c10.n) * (double)f10;
            v.M();
            int n2 = f.c();
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            v.L();
            n n3 = new n(c10.a, 0.0, c10.ax);
            int n4 = n2;
            Iterable<n> iterable = n.b(n3.a(-40, 0, -40), n3.a(40, 0, 40));
            W w2 = W.c();
            I i2 = w2.b();
            i2.a(5, b.i);
            for (n n5 : iterable) {
                block6: {
                    int n6;
                    block5: {
                        block4: {
                            n6 = l3.c(n5.e(), n5.a());
                            if (n4 == 0) break block3;
                            if (n4 == 0) break block4;
                            if (l3.d(n5.a(0, n6, 0).k()) != net.minecraft.u.g.bf.d()) break block5;
                            aF.a(i2, (double)((float)n5.e() + 0.25f) - d10, (double)n6 - d11, (double)((float)n5.a() + 0.25f) - d12, (double)((float)n5.e() + 0.75f) - d10, (double)n6 + 0.09375 - d11, (double)((float)n5.a() + 0.75f) - d12, 0.0f, 0.0f, 1.0f, 0.5f);
                        }
                        if (n4 != 0) break block6;
                    }
                    aF.a(i2, (double)((float)n5.e() + 0.25f) - d10, (double)n6 - d11, (double)((float)n5.a() + 0.25f) - d12, (double)((float)n5.e() + 0.75f) - d10, (double)n6 + 0.09375 - d11, (double)((float)n5.a() + 0.75f) - d12, 0.0f, 1.0f, 0.0f, 0.5f);
                }
                if (n4 != 0) continue;
            }
            w2.a();
            v.x();
            v.B();
        }
    }
}

