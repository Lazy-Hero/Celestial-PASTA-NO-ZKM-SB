/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.ah.z;
import net.minecraft.ar.aC;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.aZ;
import net.minecraft.client.k.m;
import net.minecraft.client.k.s;

public class t
extends s {
    private final /* synthetic */ int z;

    public int a(aC aC2, m m2) {
        int[] arrn = s.r();
        int n2 = m2.d(aC2);
        if (arrn != null) {
            n2 = n2 == 0 ? this.z + aC2.ordinal() : -1;
        }
        return n2;
    }

    @Override
    public void e() {
        super.e();
        aZ.a(this.z, aC.values().length);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public t(z z2, aF aF2, int n2) {
        super(z2, aF2, n2);
        this.z = aZ.c(aC.values().length);
    }
}

