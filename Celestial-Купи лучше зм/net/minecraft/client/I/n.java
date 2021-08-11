/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.B.a;
import net.minecraft.ag.D;
import net.minecraft.ag.E;
import net.minecraft.ag.G;
import net.minecraft.client.I.g;
import net.minecraft.client.I.q;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;

public class n
extends g {
    private final /* synthetic */ a af;
    private final /* synthetic */ D ad;
    private final /* synthetic */ a ae;
    private static final /* synthetic */ net.minecraft.ar.v ac;
    private /* synthetic */ float ab;
    private /* synthetic */ float aa;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void b(int n2, int n3) {
        this.v.b(this.af.d().f(), 8.0f, 6.0f, 0x404040);
        this.v.b(this.ae.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.aa = n2;
        this.ab = n3;
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    static {
        ac = new net.minecraft.ar.v("textures/gui/container/horse.png");
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        block11: {
            block12: {
                n n7;
                block13: {
                    block14: {
                        int[] arrn;
                        block9: {
                            block10: {
                                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                int[] arrn2 = net.minecraft.client.I.v.a();
                                this.m.aN().b(ac);
                                n6 = (h - this.M) / 2;
                                arrn = arrn2;
                                n5 = (w - this.F) / 2;
                                this.a(n6, n5, 0, 0, this.M, this.F);
                                n4 = this.ad instanceof E;
                                if (arrn != null) break block9;
                                if (n4 == 0) break block10;
                                E e10 = (E)this.ad;
                                n4 = e10.F();
                                if (arrn != null) break block9;
                                if (n4 != 0) {
                                    this.a(n6 + 79, n5 + 17, 0, this.F, e10.a() * 18, 54);
                                }
                            }
                            n4 = this.ad.al();
                        }
                        if (arrn == null) {
                            if (n4 != 0) {
                                this.a(n6 + 7, n5 + 35 - 18, 18, this.F + 54, 18, 18);
                            }
                            n4 = this.ad.E();
                        }
                        if (arrn != null) break block11;
                        if (n4 == 0) break block12;
                        n7 = this;
                        if (arrn != null) break block13;
                        if (!(n7.ad instanceof G)) break block14;
                        this.a(n6 + 7, n5 + 35, 36, this.F + 54, 18, 18);
                        if (arrn == null) break block12;
                    }
                    n7 = this;
                }
                n7.a(n6 + 7, n5 + 35, 0, this.F + 54, 18, 18);
            }
            n4 = n6 + 51;
        }
        q.a((float)n4, (float)(n5 + 60), 17, (float)(n6 + 51) - this.aa, (float)(n5 + 75 - 50) - this.ab, this.ad);
    }

    public n(a a10, a a11, D d10) {
        super(new net.minecraft.B.v(a10, a11, d10, Q.P().s));
        this.ae = a10;
        this.af = a11;
        this.ad = d10;
        this.l = false;
    }
}

