/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.v;
import net.minecraft.client.q.a;
import net.minecraft.client.r.ae;

public class i
implements w<a> {
    private final /* synthetic */ ae a;

    public i(ae ae2) {
        this.a = ae2;
    }

    @Override
    public void a(a a10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block4: {
            int n2;
            boolean bl2;
            block6: {
                int n3;
                block5: {
                    block3: {
                        bl2 = m.c();
                        n3 = "deadmau5".equals(a10.g());
                        if (!bl2) break block3;
                        if (n3 == 0) break block4;
                        n3 = a10.o();
                    }
                    if (!bl2) break block5;
                    if (n3 == 0) break block4;
                    n3 = a10.a3();
                }
                if (!bl2) break block6;
                if (n3 != 0) break block4;
                this.a.b(a10.e());
                n3 = n2 = 0;
            }
            while (n2 < 2) {
                float f17 = a10.ak + (a10.e - a10.ak) * f12 - (a10.aU + (a10.bf - a10.aU) * f12);
                float f18 = a10.E + (a10.at - a10.E) * f12;
                v.M();
                v.a(f17, 0.0f, 1.0f, 0.0f);
                v.a(f18, 1.0f, 0.0f, 0.0f);
                v.b(0.375f * (float)(n2 * 2 - 1), 0.0f, 0.0f);
                v.b(0.0f, -0.375f, 0.0f);
                v.a(-f18, 1.0f, 0.0f, 0.0f);
                v.a(-f17, 0.0f, 1.0f, 0.0f);
                float f19 = 1.3333334f;
                v.d(1.3333334f, 1.3333334f, 1.3333334f);
                this.a.a().b(0.0625f);
                v.B();
                ++n2;
                if (bl2) continue;
            }
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

