/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.ah.z;
import net.minecraft.client.u.A;
import net.minecraft.client.u.aE;
import net.minecraft.client.u.av;
import net.minecraft.w.k;

public class G
implements A {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public av a(int n2, z z2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        int[] arrn2 = av.e();
        int n3 = arrn.length;
        if (arrn2 != null) {
            n3 = n3 > 1 ? arrn[1] : 0;
        }
        int n4 = n3;
        return new aE(z2, d10, d11, d12, d13, d14, d15, k.a(arrn[0]), n4);
    }
}

