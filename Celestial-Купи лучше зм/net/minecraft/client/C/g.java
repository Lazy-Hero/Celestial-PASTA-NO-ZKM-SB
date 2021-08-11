/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.r.s;
import net.minecraft.client.w.c;
import net.minecraft.k.h;

public class g
implements w<B> {
    private final /* synthetic */ s<?> a;

    public g(s<?> s2) {
        this.a = s2;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block3: {
            int n2 = b10.I();
            boolean bl2 = m.c();
            if (n2 > 0) {
                net.minecraft.z.h h2 = new net.minecraft.z.h(b10.aG, b10.a, b10.aF, b10.ax);
                Random random = new Random(b10.W());
                a0.a();
                for (int i2 = 0; i2 < n2; ++i2) {
                    v.M();
                    c c10 = this.a.b().a(random);
                    net.minecraft.client.w.g g10 = c10.p.get(random.nextInt(c10.p.size()));
                    c10.a(0.0625f);
                    float f17 = random.nextFloat();
                    float f18 = random.nextFloat();
                    float f19 = random.nextFloat();
                    float f20 = (g10.d + (g10.a - g10.d) * f17) / 16.0f;
                    float f21 = (g10.b + (g10.c - g10.b) * f18) / 16.0f;
                    float f22 = (g10.h + (g10.f - g10.h) * f19) / 16.0f;
                    v.b(f20, f21, f22);
                    f17 = f17 * 2.0f - 1.0f;
                    f18 = f18 * 2.0f - 1.0f;
                    f19 = f19 * 2.0f - 1.0f;
                    float f23 = h.a((f17 *= -1.0f) * f17 + (f19 *= -1.0f) * f19);
                    h2.e = (float)(Math.atan2(f17, f19) * 57.29577951308232);
                    h2.at = (float)(Math.atan2(f18 *= -1.0f, f23) * 57.29577951308232);
                    h2.ak = h2.e;
                    h2.E = h2.at;
                    double d10 = 0.0;
                    double d11 = 0.0;
                    double d12 = 0.0;
                    this.a.f().a(h2, 0.0, 0.0, 0.0, 0.0f, f12, false);
                    v.B();
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block3;
                }
                a0.c();
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

