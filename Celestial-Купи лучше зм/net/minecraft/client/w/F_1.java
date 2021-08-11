/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.q.a;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.l;

public class F
extends j {
    private final /* synthetic */ c i;
    private final /* synthetic */ c j;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block12: {
            float f16;
            block10: {
                float f17;
                float f18;
                block11: {
                    boolean bl2;
                    int[] arrn;
                    block9: {
                        float f19;
                        block8: {
                            block6: {
                                block7: {
                                    super.a(f10, f11, f12, f13, f14, f15, x2);
                                    f18 = 0.2617994f;
                                    arrn = net.minecraft.client.w.j.b();
                                    f17 = -0.2617994f;
                                    f19 = 0.0f;
                                    f16 = 0.0f;
                                    bl2 = x2 instanceof B;
                                    if (arrn != null) break block6;
                                    if (!bl2) break block7;
                                    bl2 = ((B)x2).aK();
                                    if (arrn != null) break block6;
                                    if (!bl2) break block7;
                                    float f20 = 1.0f;
                                    if (arrn == null) {
                                        if (x2.G < 0.0) {
                                            l l2 = new l(x2.aq, x2.G, x2.d).d();
                                            f20 = 1.0f - (float)Math.pow(-l2.d, 1.5);
                                        }
                                        f18 = f20 * 0.34906584f + (1.0f - f20) * f18;
                                        f17 = f20 * -1.5707964f + (1.0f - f20) * f17;
                                    }
                                    if (arrn == null) break block8;
                                }
                                bl2 = x2.a4();
                            }
                            if (arrn != null) break block9;
                            if (bl2) {
                                f18 = 0.69813174f;
                                f17 = -0.7853982f;
                                f19 = 3.0f;
                                f16 = 0.08726646f;
                            }
                        }
                        this.i.v = 5.0f;
                        this.i.h = f19;
                        if (arrn != null) break block10;
                        bl2 = x2 instanceof a;
                    }
                    if (!bl2) break block11;
                    a a10 = (a)x2;
                    a10.cC = (float)((double)a10.cC + (double)(f18 - a10.cC) * 0.1);
                    a10.cD = (float)((double)a10.cD + (double)(f16 - a10.cD) * 0.1);
                    a10.cE = (float)((double)a10.cE + (double)(f17 - a10.cE) * 0.1);
                    this.i.y = a10.cC;
                    this.i.e = a10.cD;
                    this.i.r = a10.cE;
                    if (arrn == null) break block12;
                }
                this.i.y = f18;
                this.i.r = f17;
            }
            this.i.e = f16;
        }
        this.j.v = -this.i.v;
        this.j.e = -this.i.e;
        this.j.h = this.i.h;
        this.j.y = this.i.y;
        this.j.r = -this.i.r;
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    v.u();
                    v.E();
                    int[] arrn2 = arrn;
                    if (arrn2 != null) break block2;
                    if (!(x2 instanceof B) || !((B)x2).Q()) break block3;
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 1.5f, -0.1f);
                    this.i.b(f15);
                    this.j.b(f15);
                    v.B();
                    if (arrn2 == null) break block4;
                }
                this.i.b(f15);
            }
            this.j.b(f15);
        }
    }

    public F() {
        this.i = new c(this, 22, 0);
        this.i.b(-10.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
        this.j = new c(this, 22, 0);
        this.j.A = true;
        this.j.b(0.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
    }
}

