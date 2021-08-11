/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.U.B;
import net.minecraft.U.c;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;

public class D
extends x {
    private /* synthetic */ int aL;
    @Nullable
    private /* synthetic */ B aK;
    private static final /* synthetic */ r<Integer> aM;

    @Override
    public void a(r<?> r2) {
        block0: {
            if (!aM.equals(r2)) break block0;
            this.aL = this.b();
        }
    }

    @Override
    protected void f(net.minecraft.P.r r2) {
        r2.a("Fuse", (short)this.a());
    }

    public int b() {
        return this.ap.b(aM);
    }

    @Override
    public boolean M() {
        int n2 = net.minecraft.J.j.d();
        boolean bl2 = this.P;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void a(int n2) {
        this.ap.b(aM, n2);
        this.aL = n2;
    }

    @Override
    @Nullable
    public B c() {
        return this.aK;
    }

    static {
        aM = net.minecraft.q.m.a(D.class, h.n);
    }

    @Override
    protected void a(net.minecraft.P.r r2) {
        this.a(r2.q("Fuse"));
    }

    @Override
    protected void ab() {
        this.ap.c(aM, 80);
    }

    public D(z z2, double d10, double d11, double d12, B b10) {
        this(z2);
        this.g(d10, d11, d12);
        float f10 = (float)(Math.random() * (Math.PI * 2));
        this.aq = -((float)Math.sin(f10)) * 0.02f;
        this.G = 0.2f;
        this.d = -((float)Math.cos(f10)) * 0.02f;
        this.a(80);
        this.N = d10;
        this.L = d11;
        this.k = d12;
        this.aK = b10;
    }

    private void d() {
        float f10 = 4.0f;
        this.aG.a(this, this.a, this.aF + (double)(this.aD / 16.0f), this.ax, 4.0f, true);
    }

    @Override
    public void ae() {
        block10: {
            block7: {
                int n2;
                block8: {
                    D d10;
                    int n3;
                    block9: {
                        this.N = this.a;
                        this.L = this.aF;
                        this.k = this.ax;
                        n3 = net.minecraft.J.j.d();
                        n2 = this.aI();
                        if (n3 != 0) {
                            if (n2 == 0) {
                                this.G -= (double)0.04f;
                            }
                            this.a(c.SELF, this.aq, this.G, this.d);
                            this.aq *= (double)0.98f;
                            this.G *= (double)0.98f;
                            this.d *= (double)0.98f;
                            n2 = this.A ? 1 : 0;
                        }
                        if (n3 != 0) {
                            if (n2 != 0) {
                                this.aq *= (double)0.7f;
                                this.d *= (double)0.7f;
                                this.G *= -0.5;
                            }
                            n2 = --this.aL;
                        }
                        if (n3 == 0) break block7;
                        if (n2 > 0) break block8;
                        this.a();
                        d10 = this;
                        if (n3 == 0) break block9;
                        if (d10.aG.C) break block10;
                        d10 = this;
                    }
                    d10.d();
                    if (n3 != 0) break block10;
                }
                n2 = this.t() ? 1 : 0;
            }
            this.aG.a(net.minecraft.ar.aH.SMOKE_NORMAL, this.a, this.aF + 0.5, this.ax, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public float l() {
        return 0.0f;
    }

    @Override
    protected boolean h() {
        return false;
    }

    public D(z z2) {
        super(z2);
        this.aL = 80;
        this.az = true;
        this.al = true;
        this.c(0.98f, 0.98f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.aL;
    }
}

