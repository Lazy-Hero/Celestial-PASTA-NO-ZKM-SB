/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.u;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.aW;
import net.minecraft.client.u.A;
import net.minecraft.client.u.aa;
import net.minecraft.client.u.av;

public class X
implements A {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nullable
    public av a(int n2, z z2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
        i i2 = K.a(arrn[0]);
        return i2.n() == aW.INVISIBLE ? null : new aa(z2, d10, d11, d12, d13, d14, d15, i2).a();
    }
}

