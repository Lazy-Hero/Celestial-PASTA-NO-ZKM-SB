/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import java.util.List;
import net.minecraft.N.K;
import net.minecraft.N.u;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.y.b;
import net.minecraft.k.m;

public class h
extends f<K> {
    public static final /* synthetic */ v a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(K k2, double d10, double d11, double d12, float f10, int n2, float f11) {
        this.a(d10, d11, d12, (double)f10, (double)k2.g(), k2.a(), (double)k2.d().r());
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, int n2, int n3, float[] arrf) {
        h.a(d10, d11, d12, d13, d14, d15, n2, n3, arrf, 0.2, 0.25);
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15, int n2, int n3, float[] arrf, double d16, double d17) {
        int n4 = n2 + n3;
        net.minecraft.client.a.v.c(3553, 10242, 10497);
        net.minecraft.client.a.v.c(3553, 10243, 10497);
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.E();
        net.minecraft.client.a.v.f();
        String[] arrstring = net.minecraft.client.F.f.b();
        net.minecraft.client.a.v.a(true);
        net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE, o.ONE, G.ZERO);
        String[] arrstring2 = arrstring;
        W w2 = W.c();
        I i2 = w2.b();
        double d18 = d15 + d13;
        double d19 = n3 < 0 ? d18 : -d18;
        double d20 = net.minecraft.k.h.a(d19 * 0.2 - (double)net.minecraft.k.h.f(d19 * 0.1));
        float f10 = arrf[0];
        float f11 = arrf[1];
        float f12 = arrf[2];
        double d21 = d18 * 0.025 * -1.5;
        double d22 = 0.5 + Math.cos(d21 + 2.356194490192345) * d16;
        double d23 = 0.5 + Math.sin(d21 + 2.356194490192345) * d16;
        double d24 = 0.5 + Math.cos(d21 + 0.7853981633974483) * d16;
        double d25 = 0.5 + Math.sin(d21 + 0.7853981633974483) * d16;
        double d26 = 0.5 + Math.cos(d21 + 3.9269908169872414) * d16;
        double d27 = 0.5 + Math.sin(d21 + 3.9269908169872414) * d16;
        double d28 = 0.5 + Math.cos(d21 + 5.497787143782138) * d16;
        double d29 = 0.5 + Math.sin(d21 + 5.497787143782138) * d16;
        double d30 = 0.0;
        double d31 = 1.0;
        double d32 = -1.0 + d20;
        double d33 = (double)n3 * d14 * (0.5 / d16) + d32;
        i2.a(7, b.t);
        i2.c(d10 + d22, d11 + (double)n4, d12 + d23).a(1.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d22, d11 + (double)n2, d12 + d23).a(1.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d24, d11 + (double)n2, d12 + d25).a(0.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d24, d11 + (double)n4, d12 + d25).a(0.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d28, d11 + (double)n4, d12 + d29).a(1.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d28, d11 + (double)n2, d12 + d29).a(1.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d26, d11 + (double)n2, d12 + d27).a(0.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d26, d11 + (double)n4, d12 + d27).a(0.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d24, d11 + (double)n4, d12 + d25).a(1.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d24, d11 + (double)n2, d12 + d25).a(1.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d28, d11 + (double)n2, d12 + d29).a(0.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d28, d11 + (double)n4, d12 + d29).a(0.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d26, d11 + (double)n4, d12 + d27).a(1.0, d33).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d26, d11 + (double)n2, d12 + d27).a(1.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d22, d11 + (double)n2, d12 + d23).a(0.0, d32).a(f10, f11, f12, 1.0f).d();
        i2.c(d10 + d22, d11 + (double)n4, d12 + d23).a(0.0, d33).a(f10, f11, f12, 1.0f).d();
        w2.a();
        net.minecraft.client.a.v.a();
        net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
        net.minecraft.client.a.v.a(false);
        d21 = 0.5 - d17;
        d22 = 0.5 - d17;
        d23 = 0.5 + d17;
        d24 = 0.5 - d17;
        d25 = 0.5 - d17;
        d26 = 0.5 + d17;
        d27 = 0.5 + d17;
        d28 = 0.5 + d17;
        d29 = 0.0;
        d30 = 1.0;
        d31 = -1.0 + d20;
        d32 = (double)n3 * d14 + d31;
        i2.a(7, b.t);
        i2.c(d10 + d21, d11 + (double)n4, d12 + d22).a(1.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d21, d11 + (double)n2, d12 + d22).a(1.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d23, d11 + (double)n2, d12 + d24).a(0.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d23, d11 + (double)n4, d12 + d24).a(0.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d27, d11 + (double)n4, d12 + d28).a(1.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d27, d11 + (double)n2, d12 + d28).a(1.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d25, d11 + (double)n2, d12 + d26).a(0.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d25, d11 + (double)n4, d12 + d26).a(0.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d23, d11 + (double)n4, d12 + d24).a(1.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d23, d11 + (double)n2, d12 + d24).a(1.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d27, d11 + (double)n2, d12 + d28).a(0.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d27, d11 + (double)n4, d12 + d28).a(0.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d25, d11 + (double)n4, d12 + d26).a(1.0, d32).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d25, d11 + (double)n2, d12 + d26).a(1.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d21, d11 + (double)n2, d12 + d22).a(0.0, d31).a(f10, f11, f12, 0.125f).d();
        i2.c(d10 + d21, d11 + (double)n4, d12 + d22).a(0.0, d32).a(f10, f11, f12, 0.125f).d();
        w2.a();
        net.minecraft.client.a.v.j();
        net.minecraft.client.a.v.x();
        net.minecraft.client.a.v.a(true);
        if (arrstring2 == null) {
            m.b(!m.c());
        }
    }

    public void a(double d10, double d11, double d12, double d13, double d14, List<u> list, double d15) {
        block11: {
            double d16;
            String[] arrstring;
            block12: {
                block10: {
                    arrstring = net.minecraft.client.F.f.b();
                    double d17 = d14 - 0.0;
                    d16 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                    if (arrstring == null) break block10;
                    if (d16 <= 0) break block11;
                    d16 = list.size();
                }
                if (arrstring == null) break block12;
                if (d16 <= 0) break block11;
                d16 = (double)fU.ag();
            }
            if (arrstring != null) {
                if (d16 != false) {
                    cS.J();
                }
                net.minecraft.client.a.v.a(516, 0.1f);
                this.b(a);
                double d18 = d14 - 0.0;
                d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
            }
            if (arrstring != null) {
                block9: {
                    if (d16 > 0) {
                        net.minecraft.client.a.v.C();
                        int n2 = 0;
                        for (int i2 = 0; i2 < list.size(); ++i2) {
                            u u2 = list.get(i2);
                            h.a(d10, d11, d12, d13, d14, d15, n2, u2.b(), u2.c());
                            n2 += u2.b();
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block9;
                        }
                        net.minecraft.client.a.v.o();
                    }
                }
                d16 = (double)fU.ag();
            }
            if (d16 != false) {
                cS.Z();
            }
        }
    }

    @Override
    public boolean a(K k2) {
        return true;
    }

    static {
        a = new v("textures/entity/beacon_beam.png");
    }
}

