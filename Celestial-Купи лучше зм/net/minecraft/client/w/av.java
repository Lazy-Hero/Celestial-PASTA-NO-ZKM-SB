/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.T.aF;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.k.h;

public class av
extends j {
    public /* synthetic */ c i;
    public final /* synthetic */ c j;
    public final /* synthetic */ c k;

    public av() {
        this.f = 64;
        this.g = 64;
        this.j = new c(this);
        this.k = new c(this);
        this.i = new c(this);
        this.j.b(0, 0).a(-8.0f, -16.0f, -8.0f, 16, 12, 16);
        this.j.a(0.0f, 24.0f, 0.0f);
        this.k.b(0, 28).a(-8.0f, -8.0f, -8.0f, 16, 8, 16);
        this.k.a(0.0f, 24.0f, 0.0f);
        this.i.b(0, 52).a(-3.0f, 0.0f, -3.0f, 6, 6, 6);
        this.i.a(0.0f, 12.0f, 0.0f);
    }

    @Override
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
        block7: {
            float f16;
            block5: {
                c c10;
                block6: {
                    float f17;
                    float f18;
                    int[] arrn;
                    block4: {
                        aF aF2 = (aF)x2;
                        arrn = net.minecraft.client.w.j.b();
                        float f19 = f12 - (float)aF2.H;
                        float f20 = (0.5f + aF2.a(f19)) * (float)Math.PI;
                        f18 = -1.0f + net.minecraft.k.h.g(f20);
                        float f21 = 0.0f;
                        float f22 = f20 - (float)Math.PI;
                        f17 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                        if (arrn != null) break block4;
                        if (f17 > 0) {
                            f21 = net.minecraft.k.h.g(f12 * 0.1f) * 0.7f;
                        }
                        c10 = this.j;
                        f16 = 0.0f;
                        if (arrn != null) break block5;
                        c10.a(f16, 16.0f + net.minecraft.k.h.g(f20) * 8.0f + f21, 0.0f);
                        float f23 = aF2.a(f19) - 0.3f;
                        f17 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                    }
                    if (f17 <= 0) break block6;
                    this.j.e = f18 * f18 * f18 * f18 * (float)Math.PI * 0.125f;
                    if (arrn == null) break block7;
                }
                c10 = this.j;
                f16 = 0.0f;
            }
            c10.e = f16;
        }
        this.i.y = f14 * ((float)Math.PI / 180);
        this.i.e = f13 * ((float)Math.PI / 180);
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.k.b(f15);
        this.j.b(f15);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

