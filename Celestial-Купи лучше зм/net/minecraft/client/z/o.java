/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.A.J;
import net.minecraft.W.aX;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ah.q;
import net.minecraft.ah.t;
import net.minecraft.client.z.m;
import net.minecraft.client.z.w;
import net.minecraft.k.n;

final class o
implements w {
    private static gP a(gP gP2) {
        return gP2;
    }

    o() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int a(i var1_1, @Nullable t var2_2, @Nullable n var3_3, int var4_4) {
        var5_5 = m.b();
        if (var2_2 != null) {
            v0 = var3_3;
            if (var5_5 != 0) {
                if (v0 != null) {
                    return J.a(var2_2, var3_3);
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var1_1.b(aX.B);
        }
        if (v0 == e.DEAD_BUSH) {
            return 0xFFFFFF;
        }
        v1 = q.a(0.5, 1.0);
        return v1;
    }
}

