/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.f.f;
import net.minecraft.client.f.g;
import net.minecraft.client.y.b;
import net.minecraft.k.m;

public class c
implements g {
    private final /* synthetic */ Q a;

    @Override
    public void a(float f10, long l2) {
        block21: {
            int n2;
            int n3;
            double d10;
            double d11;
            double d12;
            I i2;
            W w2;
            block19: {
                int n4;
                double d13;
                double d14;
                block18: {
                    block17: {
                        block16: {
                            block14: {
                                int n5;
                                net.minecraft.client.q.c c10 = this.a.s;
                                w2 = W.c();
                                i2 = w2.b();
                                double d15 = c10.am + (c10.a - c10.am) * (double)f10;
                                d12 = c10.af + (c10.aF - c10.af) * (double)f10;
                                int n6 = f.c();
                                double d16 = c10.n + (c10.ax - c10.n) * (double)f10;
                                d14 = 0.0 - d12;
                                d13 = 256.0 - d12;
                                v.L();
                                v.f();
                                d11 = (double)(c10.v << 4) - d15;
                                d10 = (double)(c10.y << 4) - d16;
                                n3 = n6;
                                v.d(1.0f);
                                i2.a(3, b.i);
                                n2 = -16;
                                while (n2 <= 32) {
                                    block15: {
                                        n5 = -16;
                                        if (n3 == 0) break block14;
                                        for (int i3 = v665889; i3 <= 32; i3 += 16) {
                                            i2.c(d11 + (double)n2, d14, d10 + (double)i3).a(1.0f, 0.0f, 0.0f, 0.0f).d();
                                            i2.c(d11 + (double)n2, d14, d10 + (double)i3).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                                            i2.c(d11 + (double)n2, d13, d10 + (double)i3).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                                            i2.c(d11 + (double)n2, d13, d10 + (double)i3).a(1.0f, 0.0f, 0.0f, 0.0f).d();
                                            if (n3 != 0) {
                                                if (n3 != 0) continue;
                                                m.b(!m.c());
                                                break;
                                            }
                                            break block15;
                                        }
                                        n2 += 16;
                                    }
                                    if (n3 != 0) continue;
                                }
                                n5 = n2 = 2;
                            }
                            while (n2 < 16) {
                                i2.c(d11 + (double)n2, d14, d10).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                                i2.c(d11 + (double)n2, d14, d10).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                                i2.c(d11 + (double)n2, d13, d10).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                                i2.c(d11 + (double)n2, d13, d10).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                                i2.c(d11 + (double)n2, d14, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                                i2.c(d11 + (double)n2, d14, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                                i2.c(d11 + (double)n2, d13, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                                i2.c(d11 + (double)n2, d13, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                                n2 += 2;
                                if (n3 != 0) {
                                    if (n3 != 0) continue;
                                }
                                break block16;
                            }
                            n2 = 2;
                        }
                        while (n2 < 16) {
                            i2.c(d11, d14, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                            i2.c(d11, d14, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                            i2.c(d11, d13, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                            i2.c(d11, d13, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                            i2.c(d11 + 16.0, d14, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                            i2.c(d11 + 16.0, d14, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                            i2.c(d11 + 16.0, d13, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                            i2.c(d11 + 16.0, d13, d10 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                            n2 += 2;
                            if (n3 != 0) {
                                if (n3 != 0) continue;
                            }
                            break block17;
                        }
                        n2 = 0;
                    }
                    while (n2 <= 256) {
                        double d17 = (double)n2 - d12;
                        i2.c(d11, d17, d10).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                        i2.c(d11, d17, d10).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                        i2.c(d11, d17, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                        i2.c(d11 + 16.0, d17, d10 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                        i2.c(d11 + 16.0, d17, d10).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                        i2.c(d11, d17, d10).a(1.0f, 1.0f, 0.0f, 1.0f).d();
                        i2.c(d11, d17, d10).a(1.0f, 1.0f, 0.0f, 0.0f).d();
                        n2 += 2;
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block18;
                    }
                    w2.a();
                    v.d(2.0f);
                    i2.a(3, b.i);
                }
                n2 = 0;
                while (n2 <= 16) {
                    block20: {
                        n4 = 0;
                        if (n3 == 0) break block19;
                        for (int i4 = v666289; i4 <= 16; i4 += 16) {
                            i2.c(d11 + (double)n2, d14, d10 + (double)i4).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                            i2.c(d11 + (double)n2, d14, d10 + (double)i4).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                            i2.c(d11 + (double)n2, d13, d10 + (double)i4).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                            i2.c(d11 + (double)n2, d13, d10 + (double)i4).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                            if (n3 != 0) {
                                if (n3 != 0) continue;
                            }
                            break block20;
                        }
                        n2 += 16;
                    }
                    if (n3 != 0) continue;
                }
                n4 = n2 = 0;
            }
            while (n2 <= 256) {
                double d18 = (double)n2 - d12;
                i2.c(d11, d18, d10).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                i2.c(d11, d18, d10).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                i2.c(d11, d18, d10 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                i2.c(d11 + 16.0, d18, d10 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                i2.c(d11 + 16.0, d18, d10).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                i2.c(d11, d18, d10).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                i2.c(d11, d18, d10).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                n2 += 16;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block21;
            }
            w2.a();
            v.d(1.0f);
            v.a();
            v.x();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public c(Q q2) {
        this.a = q2;
    }
}

