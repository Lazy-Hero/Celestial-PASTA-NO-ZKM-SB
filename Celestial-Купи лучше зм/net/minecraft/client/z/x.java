/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.z;

import javax.annotation.Nullable;
import net.minecraft.W.a7;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.client.z.w;
import net.minecraft.k.n;

final class x
implements w {
    x() {
    }

    @Override
    public int a(i i2, @Nullable t t2, @Nullable n n2, int n3) {
        int n4 = i2.b(a7.B);
        int n5 = n4 * 32;
        int n6 = 255 - n4 * 8;
        int n7 = n4 * 4;
        return n5 << 16 | n6 << 8 | n7;
    }
}

