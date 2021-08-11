/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.u;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.bw;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aW;
import net.minecraft.client.Q;
import net.minecraft.client.u.A;
import net.minecraft.client.u.ao;
import net.minecraft.client.u.av;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class Z
implements A {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nullable
    public av a(int n2, z z2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        int[] arrn2;
        i i2;
        block7: {
            i i3;
            block6: {
                i2 = K.a(arrn[0]);
                arrn2 = av.e();
                i3 = i2;
                if (arrn2 == null) break block6;
                if (i3.b() == g.bf) break block7;
                i3 = i2;
            }
            if (i3.n() == aW.INVISIBLE) {
                return null;
            }
        }
        int n3 = Q.P().U().a(i2, z2, new n(d10, d11, d12));
        int n4 = i2.b() instanceof bw;
        if (arrn2 != null) {
            if (n4 != 0) {
                n3 = ((bw)i2.b()).b(i2);
            }
            n4 = n3 >> 16 & 0xFF;
        }
        float f10 = (float)n4 / 255.0f;
        float f11 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n3 & 0xFF) / 255.0f;
        return new ao(z2, d10, d11, d12, f10, f11, f12);
    }
}

