/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.client.u.av;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class a7
extends av {
    private /* synthetic */ int N;
    private final /* synthetic */ c M;

    protected a7(z z2, double d10, double d11, double d12, c c10) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = av.e();
                    super(z2, d10, d11, d12, 0.0, 0.0, 0.0);
                    int[] arrn2 = arrn;
                    this.s = 0.0;
                    this.n = 0.0;
                    this.I = 0.0;
                    if (arrn2 == null) break block2;
                    if (c10 != net.minecraft.ac.c.L) break block3;
                    this.B = 0.0f;
                    this.C = 0.0f;
                    this.p = 1.0f;
                    if (arrn2 != null) break block4;
                }
                this.B = 1.0f;
                this.C = 0.0f;
            }
            this.p = 0.0f;
        }
        this.a(113);
        this.a(0.01f, 0.01f);
        this.u = 0.06f;
        this.M = c10;
        this.N = 40;
        this.e = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.s = 0.0;
        this.n = 0.0;
        this.I = 0.0;
    }

    @Override
    public void i() {
        block29: {
            a7 a72;
            block30: {
                i i2;
                int[] arrn;
                block28: {
                    boolean bl2;
                    block27: {
                        block23: {
                            block26: {
                                a7 a73;
                                block24: {
                                    block25: {
                                        block22: {
                                            int n2;
                                            block21: {
                                                block20: {
                                                    int n3;
                                                    a7 a74;
                                                    block18: {
                                                        block19: {
                                                            block17: {
                                                                block15: {
                                                                    a7 a75;
                                                                    block16: {
                                                                        this.q = this.b;
                                                                        this.t = this.D;
                                                                        arrn = av.e();
                                                                        this.f = this.z;
                                                                        a75 = this;
                                                                        if (arrn == null) break block15;
                                                                        if (a75.M != net.minecraft.ac.c.L) break block16;
                                                                        this.B = 0.2f;
                                                                        this.C = 0.3f;
                                                                        this.p = 1.0f;
                                                                        if (arrn != null) break block17;
                                                                    }
                                                                    this.B = 1.0f;
                                                                    this.C = 16.0f / (float)(40 - this.N + 16);
                                                                    a75 = this;
                                                                }
                                                                a75.p = 4.0f / (float)(40 - this.N + 8);
                                                            }
                                                            this.n -= (double)this.u;
                                                            a7 a76 = this;
                                                            a74 = a76;
                                                            n3 = a76.N;
                                                            if (arrn == null) break block18;
                                                            a74.N = n3 - 1;
                                                            if (n3 <= 0) break block19;
                                                            this.s *= 0.02;
                                                            this.n *= 0.02;
                                                            this.I *= 0.02;
                                                            this.a(113);
                                                            if (arrn != null) break block20;
                                                        }
                                                        a74 = this;
                                                        n3 = 112;
                                                    }
                                                    a74.a(n3);
                                                }
                                                this.a(this.s, this.n, this.I);
                                                this.s *= (double)0.98f;
                                                this.n *= (double)0.98f;
                                                this.I *= (double)0.98f;
                                                int n4 = this.e;
                                                n2 = n4;
                                                this.e = n4 - 1;
                                                if (arrn == null) break block21;
                                                if (n2 <= 0) {
                                                    this.c();
                                                }
                                                a73 = this;
                                                if (arrn == null) break block22;
                                                n2 = a73.l ? 1 : 0;
                                            }
                                            if (n2 == 0) break block23;
                                            a73 = this;
                                        }
                                        if (arrn == null) break block24;
                                        if (a73.M != net.minecraft.ac.c.L) break block25;
                                        this.c();
                                        this.a.a(aH.WATER_SPLASH, this.b, this.D, this.z, 0.0, 0.0, 0.0, new int[0]);
                                        if (arrn != null) break block26;
                                    }
                                    a73 = this;
                                }
                                a73.a(114);
                            }
                            this.s *= (double)0.7f;
                            this.I *= (double)0.7f;
                        }
                        n n5 = new n(this.b, this.D, this.z);
                        i2 = this.a.d(n5);
                        c c10 = i2.o();
                        bl2 = c10.b();
                        if (arrn == null) break block27;
                        if (bl2) break block28;
                        bl2 = c10.d();
                    }
                    if (!bl2) break block29;
                }
                double d10 = 0.0;
                int n6 = i2.b() instanceof bq;
                if (arrn != null) {
                    if (n6 != 0) {
                        d10 = bq.a(i2.b(bq.z));
                    }
                    n6 = net.minecraft.k.h.f(this.D) + 1;
                }
                double d11 = (double)n6 - d10;
                a72 = this;
                if (arrn == null) break block30;
                if (!(a72.D < d11)) break block29;
                a72 = this;
            }
            a72.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(float f10) {
        int[] arrn = av.e();
        a7 a72 = this;
        if (arrn != null) {
            if (a72.M != net.minecraft.ac.c.L) return 257;
            a72 = this;
        }
        int n2 = super.a(f10);
        return n2;
    }
}

