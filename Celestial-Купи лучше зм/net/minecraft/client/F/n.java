/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.H;
import net.minecraft.client.F.f;
import net.minecraft.client.a.v;
import net.minecraft.client.w.z;

public class n
extends f<H> {
    private static final /* synthetic */ net.minecraft.ar.v g;
    private final /* synthetic */ z a;

    static {
        g = new net.minecraft.ar.v("textures/entity/chest/ender.png");
    }

    @Override
    public void a(H h2, double d10, double d11, double d12, float f10, int n2, float f11) {
        block23: {
            int n3;
            block22: {
                int n4;
                String[] arrstring;
                block21: {
                    int n5;
                    int n6;
                    block20: {
                        int n7;
                        block19: {
                            block18: {
                                int n8;
                                block17: {
                                    n7 = 0;
                                    arrstring = net.minecraft.client.F.f.b();
                                    n8 = h2.h();
                                    if (arrstring != null) {
                                        if (n8 != 0) {
                                            n7 = h2.m();
                                        }
                                        n8 = n2;
                                    }
                                    if (arrstring == null) break block17;
                                    if (n8 < 0) break block18;
                                    this.b(c[n2]);
                                    v.q(5890);
                                    v.M();
                                    v.d(4.0f, 4.0f, 1.0f);
                                    v.b(0.0625f, 0.0625f, 0.0625f);
                                    n8 = 5888;
                                }
                                v.q(n8);
                                if (arrstring != null) break block19;
                            }
                            this.b(g);
                        }
                        v.M();
                        v.q();
                        v.b(1.0f, 1.0f, 1.0f, f11);
                        v.b((float)d10, (float)d11 + 1.0f, (float)d12 + 1.0f);
                        v.d(1.0f, -1.0f, -1.0f);
                        v.b(0.5f, 0.5f, 0.5f);
                        n6 = 0;
                        n4 = n7;
                        n5 = 2;
                        if (arrstring != null) {
                            if (n4 == n5) {
                                n6 = 180;
                            }
                            n4 = n7;
                            n5 = 3;
                        }
                        if (arrstring != null) {
                            if (n4 == n5) {
                                n6 = 0;
                            }
                            n4 = n7;
                            n5 = 4;
                        }
                        if (arrstring == null) break block20;
                        if (n4 == n5) {
                            n6 = 90;
                        }
                        n4 = n7;
                        if (arrstring == null) break block21;
                        n5 = 5;
                    }
                    if (n4 == n5) {
                        n6 = -90;
                    }
                    n4 = n6;
                }
                v.a((float)n4, 0.0f, 1.0f, 0.0f);
                v.b(-0.5f, -0.5f, -0.5f);
                float f12 = h2.l + (h2.k - h2.l) * f10;
                f12 = 1.0f - f12;
                f12 = 1.0f - f12 * f12 * f12;
                this.a.i.y = -(f12 * 1.5707964f);
                this.a.a();
                v.u();
                v.B();
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                n3 = n2;
                if (arrstring == null) break block22;
                if (n3 < 0) break block23;
                v.q(5890);
                v.B();
                n3 = 5888;
            }
            v.q(n3);
        }
    }

    public n() {
        this.a = new z();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

