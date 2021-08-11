/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.U.x;
import net.minecraft.client.C.f;
import net.minecraft.client.C.g;
import net.minecraft.client.C.i;
import net.minecraft.client.C.n;
import net.minecraft.client.C.u;
import net.minecraft.client.C.z;
import net.minecraft.client.a.aV;
import net.minecraft.client.a.v;
import net.minecraft.client.q.a;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.minecraft.client.w.e;
import net.minecraft.client.w.r;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.w.bE;
import net.minecraft.w.d;

public class ae
extends s<a> {
    private final /* synthetic */ boolean y;

    @Override
    protected void a(a a10, double d10, double d11, double d12, String string, double d13) {
        block4: {
            block5: {
                m[] arrm = b.b();
                if (arrm != null) break block4;
                if (!(d13 < 100.0)) break block5;
                net.minecraft.D.b b10 = a10.d();
                net.minecraft.D.h h2 = b10.b(2);
                if (arrm != null) break block4;
                if (h2 != null) {
                    net.minecraft.D.e e10 = b10.d(a10.g(), h2);
                    this.a(a10, e10.a() + " " + h2.b(), d10, d11, d12, 64);
                    d11 += (double)((float)this.d().p * 1.15f * 0.025f);
                }
            }
            super.a(a10, d10, d11, d12, string, d13);
        }
    }

    @Override
    public void a(a a10, double d10, double d11, double d12, float f10, float f11) {
        block7: {
            m[] arrm;
            block6: {
                x x2;
                block5: {
                    arrm = b.b();
                    x2 = a10;
                    if (arrm != null) break block5;
                    if (!x2.c()) break block6;
                    x2 = this.h.b;
                }
                if (x2 != a10) break block7;
            }
            double d13 = d11;
            if (arrm == null) {
                if (a10.a4()) {
                    d13 = d11 - 0.125;
                }
                this.c(a10);
                net.minecraft.client.a.v.b(aV.PLAYER_SKIN);
                super.a(a10, d10, d13, d12, f10, f11);
            }
            net.minecraft.client.a.v.a(aV.PLAYER_SKIN);
        }
    }

    @Override
    public void f() {
        net.minecraft.client.a.v.b(0.0f, 0.1875f, 0.0f);
    }

    protected void a(a a10, float f10) {
        float f11 = 0.9375f;
        net.minecraft.client.a.v.d(0.9375f, 0.9375f, 0.9375f);
    }

    public void b(a a10) {
        float f10 = 1.0f;
        net.minecraft.client.a.v.c(1.0f, 1.0f, 1.0f);
        float f11 = 0.0625f;
        r r2 = this.a();
        this.c(a10);
        net.minecraft.client.a.v.a();
        r2.a = 0.0f;
        r2.p = false;
        r2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a10);
        r2.o.y = 0.0f;
        r2.o.b(0.0625f);
        r2.u.y = 0.0f;
        r2.u.b(0.0625f);
        net.minecraft.client.a.v.f();
    }

    @Override
    protected void a(a a10, float f10, float f11, float f12) {
        block4: {
            block6: {
                m[] arrm;
                block8: {
                    double d10;
                    double d11;
                    l l2;
                    block9: {
                        double d12;
                        double d13;
                        double d14;
                        block7: {
                            int n2;
                            block5: {
                                block2: {
                                    block3: {
                                        arrm = b.b();
                                        n2 = a10.aL();
                                        if (arrm != null) break block2;
                                        if (n2 == 0) break block3;
                                        n2 = a10.as();
                                        if (arrm != null) break block2;
                                        if (n2 == 0) break block3;
                                        net.minecraft.client.a.v.a(a10.q(), 0.0f, 1.0f, 0.0f);
                                        net.minecraft.client.a.v.a(this.c(a10), 0.0f, 0.0f, 1.0f);
                                        net.minecraft.client.a.v.a(270.0f, 0.0f, 1.0f, 0.0f);
                                        if (arrm == null) break block4;
                                    }
                                    n2 = a10.aK();
                                }
                                if (arrm != null) break block5;
                                if (n2 == 0) break block6;
                                super.a(a10, f10, f11, f12);
                                n2 = a10.an();
                            }
                            float f13 = (float)n2 + f12;
                            float f14 = net.minecraft.k.h.c(f13 * f13 / 100.0f, 0.0f, 1.0f);
                            net.minecraft.client.a.v.a(f14 * (-90.0f - a10.at), 1.0f, 0.0f, 0.0f);
                            l2 = a10.b(f12);
                            d14 = a10.aq * a10.aq + a10.d * a10.d;
                            d13 = l2.e * l2.e + l2.b * l2.b;
                            double d12 = d14 - 0.0;
                            d12 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                            if (arrm != null) break block7;
                            if (d12 <= 0) break block8;
                            double d10 = d13;
                            d10 = 0.0;
                            if (arrm != null) break block9;
                            double d12 = d11 - d10;
                            d12 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                        }
                        if (d12 <= 0) break block8;
                        double d10 = a10.aq * l2.e + a10.d * l2.b;
                        d10 = Math.sqrt(d14) * Math.sqrt(d13);
                    }
                    double d17 = d11 / d10;
                    double d18 = a10.aq * l2.b - a10.d * l2.e;
                    net.minecraft.client.a.v.a((float)(Math.signum(d18) * Math.acos(d17)) * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
                }
                if (arrm == null) break block4;
            }
            super.a(a10, f10, f11, f12);
        }
    }

    private void c(a a10) {
        block10: {
            e e10;
            e e11;
            block18: {
                a a11;
                m[] arrm;
                block17: {
                    block16: {
                        bE bE2;
                        int n2;
                        d d10;
                        block15: {
                            block11: {
                                block12: {
                                    bE bE3;
                                    bE bE4;
                                    block13: {
                                        block14: {
                                            a a12;
                                            r r2;
                                            block8: {
                                                block9: {
                                                    r2 = this.a();
                                                    arrm = b.b();
                                                    a12 = a10;
                                                    if (arrm != null) break block8;
                                                    if (!a12.ae()) break block9;
                                                    r2.a(false);
                                                    r2.n.q = true;
                                                    r2.q.q = true;
                                                    if (arrm == null) break block10;
                                                }
                                                a12 = a10;
                                            }
                                            d d11 = a12.av();
                                            d10 = a10.b();
                                            r2.a(true);
                                            r2.q.q = a10.a(net.minecraft.i.a.HAT);
                                            r2.w.q = a10.a(net.minecraft.i.a.JACKET);
                                            r2.z.q = a10.a(net.minecraft.i.a.LEFT_PANTS_LEG);
                                            r2.v.q = a10.a(net.minecraft.i.a.RIGHT_PANTS_LEG);
                                            r2.s.q = a10.a(net.minecraft.i.a.LEFT_SLEEVE);
                                            r2.u.q = a10.a(net.minecraft.i.a.RIGHT_SLEEVE);
                                            r2.p = a10.a4();
                                            e11 = e.EMPTY;
                                            e10 = e.EMPTY;
                                            n2 = d11.G();
                                            if (arrm != null) break block11;
                                            if (n2 != 0) break block12;
                                            e11 = e.ITEM;
                                            n2 = a10.G();
                                            if (arrm != null) break block11;
                                            if (n2 <= 0) break block12;
                                            bE bE3 = bE2 = d11.h();
                                            bE3 = bE.BLOCK;
                                            if (arrm != null) break block13;
                                            if (bE4 != bE3) break block14;
                                            e11 = e.BLOCK;
                                            if (arrm == null) break block12;
                                        }
                                        bE bE3 = bE2;
                                        bE3 = bE.BOW;
                                    }
                                    if (bE4 == bE3) {
                                        e11 = e.BOW_AND_ARROW;
                                    }
                                }
                                n2 = d10.G();
                            }
                            if (arrm != null) break block15;
                            if (n2 != 0) break block16;
                            e10 = e.ITEM;
                            a11 = a10;
                            if (arrm != null) break block17;
                            n2 = a11.G();
                        }
                        if (n2 > 0 && (bE2 = d10.h()) == bE.BLOCK) {
                            e10 = e.BLOCK;
                        }
                    }
                    a11 = a10;
                }
                if (a11.al() != net.minecraft.ar.b.RIGHT) break block18;
                r2.r = e11;
                r2.l = e10;
                if (arrm == null) break block10;
            }
            r2.r = e10;
            r2.l = e11;
        }
    }

    public ae(a4 a42, boolean bl2) {
        super(a42, new r(0.0f, bl2), 0.5f);
        this.y = bl2;
        this.a(new n(this));
        this.a(new z(this));
        this.a(new g(this));
        this.a(new i(this));
        this.a(new net.minecraft.client.C.v(this));
        this.a(new u(this.a().n));
        this.a(new net.minecraft.client.C.e(this));
        this.a(new f(a42));
    }

    public void d(a a10) {
        float f10 = 1.0f;
        net.minecraft.client.a.v.c(1.0f, 1.0f, 1.0f);
        float f11 = 0.0625f;
        r r2 = this.a();
        this.c(a10);
        net.minecraft.client.a.v.a();
        r2.p = false;
        r2.a = 0.0f;
        r2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a10);
        r2.k.y = 0.0f;
        r2.k.b(0.0625f);
        r2.s.y = 0.0f;
        r2.s.b(0.0625f);
        net.minecraft.client.a.v.f();
    }

    public net.minecraft.ar.v a(a a10) {
        return a10.e();
    }

    public ae(a4 a42) {
        this(a42, false);
    }

    public r a() {
        return (r)super.b();
    }

    @Override
    protected void a(a a10, double d10, double d11, double d12) {
        block2: {
            block1: {
                boolean bl2;
                m[] arrm;
                block0: {
                    arrm = b.b();
                    bl2 = a10.aL();
                    if (arrm != null) break block0;
                    if (!bl2) break block1;
                    bl2 = a10.as();
                }
                if (!bl2) break block1;
                super.b(a10, d10 + (double)a10.b1, d11 + (double)a10.cA, d12 + (double)a10.b3);
                if (arrm == null) break block2;
            }
            super.b(a10, d10, d11, d12);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

