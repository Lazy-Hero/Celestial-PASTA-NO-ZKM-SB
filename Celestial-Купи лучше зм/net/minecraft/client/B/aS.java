/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ac.a;
import net.minecraft.ar.v;
import net.minecraft.aw.i;
import net.minecraft.aw.s;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.b.af;
import net.minecraft.client.b.k;
import net.minecraft.client.b.q;
import net.minecraft.client.j.f;
import net.minecraft.client.y.b;

class aS {
    private final /* synthetic */ v a;
    private final /* synthetic */ int[] d;
    private final /* synthetic */ f c;
    final /* synthetic */ af e;
    private final /* synthetic */ s b;

    aS(af af2, s s2, k k2) {
        this(af2, s2);
    }

    private void a(boolean bl2) {
        block3: {
            boolean bl3 = false;
            boolean bl4 = false;
            W w2 = W.c();
            I i2 = w2.b();
            float f10 = 0.0f;
            String[] arrstring = q.b();
            af.a(this.e).b(this.a);
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.a(o.ONE, G.ONE_MINUS_SRC_ALPHA, o.ZERO, G.ONE);
            net.minecraft.client.a.v.v();
            i2.a(7, net.minecraft.client.y.b.m);
            i2.c(0.0, 128.0, (double)-0.01f).a(0.0, 1.0).d();
            i2.c(128.0, 128.0, (double)-0.01f).a(1.0, 1.0).d();
            i2.c(128.0, 0.0, (double)-0.01f).a(1.0, 0.0).d();
            i2.c(0.0, 0.0, (double)-0.01f).a(0.0, 0.0).d();
            w2.a();
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.f();
            af.a(this.e).b(af.a());
            int n2 = 0;
            for (i i3 : this.b.i.values()) {
                block6: {
                    int n3;
                    block4: {
                        block5: {
                            if (arrstring == null) break block3;
                            n3 = bl2;
                            if (arrstring == null) break block4;
                            if (n3 == 0) break block5;
                            n3 = i3.e() ? 1 : 0;
                            if (arrstring == null) break block4;
                            if (n3 == 0) break block6;
                        }
                        net.minecraft.client.a.v.M();
                        net.minecraft.client.a.v.b(0.0f + (float)i3.a() / 2.0f + 64.0f, 0.0f + (float)i3.c() / 2.0f + 64.0f, -0.02f);
                        net.minecraft.client.a.v.a((float)(i3.b() * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
                        net.minecraft.client.a.v.d(4.0f, 4.0f, 3.0f);
                        net.minecraft.client.a.v.b(-0.125f, 0.125f, 0.0f);
                        n3 = i3.d();
                    }
                    int n4 = n3;
                    float f11 = (float)(n4 % 4 + 0) / 4.0f;
                    float f12 = (float)(n4 / 4 + 0) / 4.0f;
                    float f13 = (float)(n4 % 4 + 1) / 4.0f;
                    float f14 = (float)(n4 / 4 + 1) / 4.0f;
                    i2.a(7, net.minecraft.client.y.b.m);
                    float f15 = -0.001f;
                    i2.c(-1.0, 1.0, (double)((float)n2 * -0.001f)).a(f11, f12).d();
                    i2.c(1.0, 1.0, (double)((float)n2 * -0.001f)).a(f13, f12).d();
                    i2.c(1.0, -1.0, (double)((float)n2 * -0.001f)).a(f13, f14).d();
                    i2.c(-1.0, -1.0, (double)((float)n2 * -0.001f)).a(f11, f14).d();
                    w2.a();
                    net.minecraft.client.a.v.B();
                    ++n2;
                }
                if (arrstring != null) continue;
            }
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b(0.0f, 0.0f, -0.04f);
            net.minecraft.client.a.v.d(1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.B();
        }
    }

    static void a(aS aS2, boolean bl2) {
        aS2.a(bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a() {
        block3: {
            String[] arrstring = q.b();
            for (int i2 = 0; i2 < 16384; ++i2) {
                int n2;
                block5: {
                    block4: {
                        n2 = this.b.l[i2] & 0xFF;
                        if (arrstring == null) break block3;
                        if (arrstring == null) break block4;
                        if (n2 / 4 != 0) break block5;
                        this.d[i2] = (i2 + i2 / 128 & 1) * 8 + 16 << 24;
                    }
                    if (arrstring != null) continue;
                }
                this.d[i2] = net.minecraft.ac.a.F[n2 / 4].a(n2 & 3);
                if (arrstring != null) continue;
            }
            this.c.d();
        }
    }

    static void a(aS aS2) {
        aS2.a();
    }

    private aS(af af2, s s2) {
        String[] arrstring = q.b();
        this.e = af2;
        String[] arrstring2 = arrstring;
        this.b = s2;
        this.c = new f(128, 128);
        this.d = this.c.a();
        this.a = af.a(af2).a("map/" + s2.b, this.c);
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = 0;
            if (arrstring2 != null) continue;
        }
    }

    static s b(aS aS2) {
        return aS2.b;
    }

    static v c(aS aS2) {
        return aS2.a;
    }
}

