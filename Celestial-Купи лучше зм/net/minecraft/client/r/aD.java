/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.J.C;
import net.minecraft.Z.i;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.d;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.at;
import net.minecraft.client.r.b;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.u.g;

public class aD
extends at<C> {
    public aD(a4 a42) {
        super(a42);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(C c10, float f10, i i2) {
        block12: {
            int n2;
            int n3;
            int n4;
            block11: {
                m[] arrm;
                block8: {
                    block10: {
                        block9: {
                            n4 = c10.e();
                            arrm = b.b();
                            n3 = n4;
                            n2 = -1;
                            if (arrm != null) break block8;
                            if (n3 <= n2) break block9;
                            float f11 = (float)n4 - f10 + 1.0f - 10.0f;
                            n3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                            if (arrm != null) break block10;
                            if (n3 < 0) {
                                float f12 = 1.0f - ((float)n4 - f10 + 1.0f) / 10.0f;
                                f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
                                f12 *= f12;
                                f12 *= f12;
                                float f13 = 1.0f + f12 * 0.3f;
                                v.d(f13, f13, f13);
                            }
                        }
                        super.a(c10, f10, i2);
                        n3 = n4;
                    }
                    n2 = -1;
                }
                if (arrm != null) break block11;
                if (n3 <= n2) break block12;
                n3 = n4 / 5;
                n2 = 2;
            }
            if (n3 % n2 == 0) {
                d d10 = Q.P().W();
                v.L();
                v.y();
                v.a();
                v.a(o.SRC_ALPHA, G.DST_ALPHA);
                v.b(1.0f, 1.0f, 1.0f, (1.0f - ((float)n4 - f10 + 1.0f) / 100.0f) * 0.8f);
                v.M();
                d10.a(net.minecraft.u.g.cR.d(), 1.0f);
                v.B();
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.f();
                v.j();
                v.x();
            }
        }
    }
}

