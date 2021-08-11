/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.ah;
import net.minecraft.Z.i;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.r.L;

public class d
implements w<ah> {
    private final /* synthetic */ L a;

    @Override
    public void a(ah ah2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        i i2 = ah2.Q();
        if (i2 != null) {
            net.minecraft.client.a.d d10 = Q.P().W();
            v.q();
            v.M();
            v.b(0.0f, 0.6875f, -0.75f);
            v.a(20.0f, 1.0f, 0.0f, 0.0f);
            v.a(45.0f, 0.0f, 1.0f, 0.0f);
            v.b(0.25f, 0.1875f, 0.25f);
            float f17 = 0.5f;
            v.d(-0.5f, -0.5f, 0.5f);
            int n2 = ah2.aS();
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            as.a(as.p, n3, (float)n4);
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.b(j.x);
            d10.a(i2, 1.0f);
            v.B();
            v.u();
        }
    }

    public d(L l2) {
        this.a = l2;
    }

    @Override
    public boolean a() {
        return false;
    }
}

