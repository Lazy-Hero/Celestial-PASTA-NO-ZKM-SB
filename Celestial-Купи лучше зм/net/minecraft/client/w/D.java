/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.h.d;

public class D
extends j {
    private final /* synthetic */ c s;
    private final /* synthetic */ c m;
    private final /* synthetic */ c u;
    private final /* synthetic */ c o;
    private final /* synthetic */ c j;
    private final /* synthetic */ c q;
    private final /* synthetic */ c n;
    private final /* synthetic */ c i;
    private final /* synthetic */ c r;
    private final /* synthetic */ c k;
    private final /* synthetic */ c t;
    private /* synthetic */ float l;
    private final /* synthetic */ c p;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block10: {
            double[] arrd;
            float f16;
            float f17;
            float f18;
            double[] arrd2;
            int[] arrn;
            float f19;
            float f20;
            float f21;
            d d10;
            block9: {
                float f22;
                float f23;
                float f24;
                block8: {
                    v.M();
                    d10 = (d)x2;
                    f21 = d10.cv + (d10.cC - d10.cv) * this.l;
                    this.o.y = (float)(Math.sin(f21 * ((float)Math.PI * 2)) + 1.0) * 0.2f;
                    int[] arrn2 = net.minecraft.client.w.j.b();
                    f24 = (float)(Math.sin(f21 * ((float)Math.PI * 2) - 1.0f) + 1.0);
                    f24 = (f24 * f24 + f24 * 2.0f) * 0.05f;
                    v.b(0.0f, f24 - 2.0f, -3.0f);
                    v.a(f24 * 2.0f, 1.0f, 0.0f, 0.0f);
                    f20 = -30.0f;
                    f19 = 0.0f;
                    float f25 = 1.5f;
                    arrn = arrn2;
                    arrd2 = d10.a(6, this.l);
                    f23 = this.a(d10.a(5, this.l)[0] - d10.a(10, this.l)[0]);
                    f18 = this.a(d10.a(5, this.l)[0] + (double)(f23 / 2.0f));
                    f17 = f21 * ((float)Math.PI * 2);
                    f20 = 20.0f;
                    f16 = -12.0f;
                    for (int i2 = 0; i2 < 5; ++i2) {
                        double[] arrd3 = d10.a(5 - i2, this.l);
                        f22 = (float)Math.cos((float)i2 * 0.45f + f17) * 0.15f;
                        this.k.e = this.a(arrd3[0] - arrd2[0]) * ((float)Math.PI / 180) * 1.5f;
                        this.k.y = f22 + d10.a(i2, arrd2, arrd3) * ((float)Math.PI / 180) * 1.5f * 5.0f;
                        this.k.r = -this.a(arrd3[0] - (double)f18) * ((float)Math.PI / 180) * 1.5f;
                        this.k.h = f20;
                        this.k.u = f16;
                        this.k.v = f19;
                        f20 = (float)((double)f20 + Math.sin(this.k.y) * 10.0);
                        f16 = (float)((double)f16 - Math.cos(this.k.e) * Math.cos(this.k.y) * 10.0);
                        f19 = (float)((double)f19 - Math.sin(this.k.e) * Math.cos(this.k.y) * 10.0);
                        this.k.b(f15);
                        if (arrn == null) {
                            if (arrn == null) continue;
                        }
                        break block8;
                    }
                    this.n.h = f20;
                    this.n.u = f16;
                    this.n.v = f19;
                }
                arrd = d10.a(0, this.l);
                this.n.e = this.a(arrd[0] - arrd2[0]) * ((float)Math.PI / 180);
                this.n.y = this.a(d10.a(6, arrd2, arrd)) * ((float)Math.PI / 180) * 1.5f * 5.0f;
                this.n.r = -this.a(arrd[0] - (double)f18) * ((float)Math.PI / 180);
                this.n.b(f15);
                v.M();
                v.b(0.0f, 1.0f, 0.0f);
                v.a(-f23 * 1.5f, 0.0f, 0.0f, 1.0f);
                v.b(0.0f, -1.0f, 0.0f);
                this.s.r = 0.0f;
                this.s.b(f15);
                int n2 = 0;
                while (n2 < 2) {
                    v.c();
                    f22 = f21 * ((float)Math.PI * 2);
                    this.q.y = 0.125f - (float)Math.cos(f22) * 0.2f;
                    this.q.e = 0.25f;
                    this.q.r = (float)(Math.sin(f22) + 0.125) * 0.8f;
                    this.u.r = -((float)(Math.sin(f22 + 2.0f) + 0.5)) * 0.75f;
                    this.p.y = 1.0f + f24 * 0.1f;
                    this.t.y = 0.5f + f24 * 0.1f;
                    this.r.y = 0.75f + f24 * 0.1f;
                    this.i.y = 1.3f + f24 * 0.1f;
                    this.j.y = -0.5f - f24 * 0.1f;
                    this.m.y = 0.75f + f24 * 0.1f;
                    this.q.b(f15);
                    this.i.b(f15);
                    this.p.b(f15);
                    v.d(-1.0f, 1.0f, 1.0f);
                    if (arrn == null) {
                        if (arrn == null) {
                            if (n2 == 0) {
                                v.a(ad.FRONT);
                            }
                            ++n2;
                        }
                        if (arrn == null) continue;
                    }
                    break block9;
                }
                v.B();
                v.a(ad.BACK);
                v.E();
            }
            float f26 = -((float)Math.sin(f21 * ((float)Math.PI * 2))) * 0.0f;
            f17 = f21 * ((float)Math.PI * 2);
            f20 = 10.0f;
            f16 = 60.0f;
            f19 = 0.0f;
            arrd2 = d10.a(11, this.l);
            for (int i3 = 0; i3 < 12; ++i3) {
                arrd = d10.a(12 + i3, this.l);
                f26 = (float)((double)f26 + Math.sin((float)i3 * 0.45f + f17) * (double)0.05f);
                this.k.e = (this.a(arrd[0] - arrd2[0]) * 1.5f + 180.0f) * ((float)Math.PI / 180);
                this.k.y = f26 + (float)(arrd[1] - arrd2[1]) * ((float)Math.PI / 180) * 1.5f * 5.0f;
                this.k.r = this.a(arrd[0] - (double)f18) * ((float)Math.PI / 180) * 1.5f;
                this.k.h = f20;
                this.k.u = f16;
                this.k.v = f19;
                f20 = (float)((double)f20 + Math.sin(this.k.y) * 10.0);
                f16 = (float)((double)f16 - Math.cos(this.k.e) * Math.cos(this.k.y) * 10.0);
                f19 = (float)((double)f19 - Math.sin(this.k.e) * Math.cos(this.k.y) * 10.0);
                this.k.b(f15);
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block10;
            }
            v.B();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public D(float f10) {
        this.g = 256;
        this.f = 256;
        this.a("body.body", 0, 0);
        this.a("wing.skin", -56, 88);
        this.a("wingtip.skin", -56, 144);
        this.a("rearleg.main", 0, 0);
        this.a("rearfoot.main", 112, 0);
        this.a("rearlegtip.main", 196, 0);
        this.a("head.upperhead", 112, 30);
        this.a("wing.bone", 112, 88);
        this.a("head.upperlip", 176, 44);
        this.a("jaw.jaw", 176, 65);
        this.a("frontleg.main", 112, 104);
        this.a("wingtip.bone", 112, 136);
        this.a("frontfoot.main", 144, 104);
        this.a("neck.box", 192, 104);
        this.a("frontlegtip.main", 226, 138);
        this.a("body.scale", 220, 53);
        this.a("head.scale", 0, 0);
        this.a("neck.scale", 48, 0);
        this.a("head.nostril", 112, 0);
        float f11 = -16.0f;
        this.n = new c(this, "head");
        this.n.a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16);
        this.n.a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.n.A = true;
        this.n.a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6);
        this.n.a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.n.A = false;
        this.n.a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6);
        this.n.a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.o = new c(this, "jaw");
        this.o.a(0.0f, 4.0f, -8.0f);
        this.o.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.n.a(this.o);
        this.k = new c(this, "neck");
        this.k.a("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.k.a("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.s = new c(this, "body");
        this.s.a(0.0f, 4.0f, 8.0f);
        this.s.a("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.s.a("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.s.a("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.s.a("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.q = new c(this, "wing");
        this.q.a(-12.0f, 5.0f, 2.0f);
        this.q.a("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.q.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.u = new c(this, "wingtip");
        this.u.a(-56.0f, 0.0f, 0.0f);
        this.u.a("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.u.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.q.a(this.u);
        this.i = new c(this, "frontleg");
        this.i.a(-12.0f, 20.0f, 2.0f);
        this.i.a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.j = new c(this, "frontlegtip");
        this.j.a(0.0f, 20.0f, -1.0f);
        this.j.a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.i.a(this.j);
        this.m = new c(this, "frontfoot");
        this.m.a(0.0f, 23.0f, 0.0f);
        this.m.a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.j.a(this.m);
        this.p = new c(this, "rearleg");
        this.p.a(-16.0f, 16.0f, 42.0f);
        this.p.a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.t = new c(this, "rearlegtip");
        this.t.a(0.0f, 32.0f, -4.0f);
        this.t.a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.p.a(this.t);
        this.r = new c(this, "rearfoot");
        this.r.a(0.0f, 31.0f, 4.0f);
        this.r.a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.t.a(this.r);
    }

    @Override
    public void a(B b10, float f10, float f11, float f12) {
        this.l = f12;
    }

    private float a(double d10) {
        double d11;
        block5: {
            block4: {
                int[] arrn = net.minecraft.client.w.j.b();
                while (d10 >= 180.0) {
                    d10 -= 360.0;
                    if (arrn == null) {
                        if (arrn == null) continue;
                    }
                    break block4;
                }
                while (d10 < -180.0) {
                    d11 = d10 + 360.0;
                    if (arrn == null) {
                        d10 = d11;
                        if (arrn == null) continue;
                    }
                    break block5;
                }
            }
            d11 = d10;
        }
        return (float)d11;
    }
}

