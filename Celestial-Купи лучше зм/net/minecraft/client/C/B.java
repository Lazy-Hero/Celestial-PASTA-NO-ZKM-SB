/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import java.util.Random;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.y.b;
import net.minecraft.h.d;

public class B
implements w<d> {
    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void a(d d10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block7: {
            block6: {
                float f17;
                float f18;
                I i2;
                W w2;
                boolean bl2;
                block9: {
                    float f19;
                    float f20;
                    block8: {
                        bl2 = m.c();
                        if (d10.cG <= 0) break block7;
                        w2 = W.c();
                        i2 = w2.b();
                        a0.a();
                        f18 = ((float)d10.cG + f12) / 200.0f;
                        f17 = 0.0f;
                        f20 = f18;
                        f19 = 0.8f;
                        if (!bl2) break block8;
                        if (!(f20 > f19)) break block9;
                        f20 = f18 - 0.8f;
                        f19 = 0.2f;
                    }
                    f17 = f20 / f19;
                }
                Random random = new Random(432L);
                v.L();
                v.g(7425);
                v.a();
                v.a(o.SRC_ALPHA, G.ONE);
                v.v();
                v.c();
                v.a(false);
                v.M();
                v.b(0.0f, -1.0f, -2.0f);
                int n2 = 0;
                while ((float)n2 < (f18 + f18 * f18) / 2.0f * 60.0f) {
                    v.a(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                    v.a(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                    v.a(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                    v.a(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                    v.a(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                    v.a(random.nextFloat() * 360.0f + f18 * 90.0f, 0.0f, 0.0f, 1.0f);
                    float f21 = random.nextFloat() * 20.0f + 5.0f + f17 * 10.0f;
                    float f22 = random.nextFloat() * 2.0f + 1.0f + f17 * 2.0f;
                    i2.a(6, b.i);
                    i2.c(0.0, 0.0, 0.0).b(255, 255, 255, (int)(255.0f * (1.0f - f17))).d();
                    i2.c(-0.866 * (double)f22, (double)f21, (double)(-0.5f * f22)).b(255, 0, 255, 0).d();
                    i2.c(0.866 * (double)f22, (double)f21, (double)(-0.5f * f22)).b(255, 0, 255, 0).d();
                    i2.c(0.0, (double)f21, (double)(1.0f * f22)).b(255, 0, 255, 0).d();
                    i2.c(-0.866 * (double)f22, (double)f21, (double)(-0.5f * f22)).b(255, 0, 255, 0).d();
                    w2.a();
                    ++n2;
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block6;
                }
                v.B();
                v.a(true);
                v.E();
                v.f();
                v.g(7424);
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                v.x();
                v.e();
            }
            a0.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

