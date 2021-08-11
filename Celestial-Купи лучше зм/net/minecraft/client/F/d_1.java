/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.util.List;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.i.j;
import net.minecraft.k.k;

public class d
implements g {
    private /* synthetic */ j a;
    private final /* synthetic */ Q d;
    private /* synthetic */ double b;
    private /* synthetic */ double e;
    private /* synthetic */ double c;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, long l2) {
        block2: {
            this.a = this.d.s;
            this.b = this.a.am + (this.a.a - this.a.am) * (double)f10;
            this.e = this.a.af + (this.a.aF - this.a.af) * (double)f10;
            this.c = this.a.n + (this.a.ax - this.a.n) * (double)f10;
            z z2 = this.d.s.aG;
            int n2 = f.b();
            List<k> list = z2.a((x)this.a, this.a.m().a(6.0));
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            int n3 = n2;
            v.d(2.0f);
            v.L();
            v.a(false);
            for (k k2 : list) {
                aF.b(k2.a(0.002).c(-this.b, -this.e, -this.c), 1.0f, 1.0f, 1.0f, 1.0f);
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block2;
            }
            v.a(true);
            v.x();
            v.f();
        }
    }

    public d(Q q2) {
        this.d = q2;
    }
}

