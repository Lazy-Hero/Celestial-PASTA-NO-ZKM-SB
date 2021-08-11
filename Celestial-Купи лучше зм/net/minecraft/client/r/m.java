/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.r;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aW;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.d;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class m
extends b<r> {
    public void a(r r2, double d10, double d11, double d12, float f10, float f11) {
        block9: {
            i i2;
            z z2;
            i i3;
            net.minecraft.k.m[] arrm;
            block10: {
                i i4;
                block8: {
                    arrm = b.b();
                    i4 = r2.c();
                    if (arrm != null) break block8;
                    if (i4 == null) break block9;
                    i4 = r2.c();
                }
                if ((i3 = i4).n() != aW.MODEL) break block9;
                z2 = r2.a();
                i2 = i3;
                if (arrm != null) break block10;
                if (i2 == z2.d(new n(r2))) break block9;
                i2 = i3;
            }
            if (i2.n() != aW.INVISIBLE) {
                this.b(j.x);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.y();
                W w2 = W.c();
                I i5 = w2.b();
                if (arrm == null) {
                    if (this.g) {
                        net.minecraft.client.a.v.r();
                        net.minecraft.client.a.v.m(this.a(r2));
                    }
                    i5.a(7, net.minecraft.client.y.b.s);
                }
                n n2 = new n(r2.a, r2.m().a, r2.ax);
                net.minecraft.client.a.v.b((float)(d10 - (double)n2.e() - 0.5), (float)(d11 - (double)n2.b()), (float)(d12 - (double)n2.a() - 0.5));
                d d13 = Q.P().W();
                d13.a().a(z2, d13.a(i3), i3, n2, i5, false, net.minecraft.k.h.a(r2.b()));
                w2.a();
                m m2 = this;
                if (arrm == null) {
                    if (m2.g) {
                        net.minecraft.client.a.v.s();
                        net.minecraft.client.a.v.h();
                    }
                    net.minecraft.client.a.v.j();
                    net.minecraft.client.a.v.B();
                    m2 = this;
                }
                super.d(r2, d10, d11, d12, f10, f11);
            }
        }
    }

    public m(a4 a42) {
        super(a42);
        this.a = 0.5f;
    }

    protected v a(r r2) {
        return j.x;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

