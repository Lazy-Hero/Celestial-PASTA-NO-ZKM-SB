/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.G;
import net.minecraft.ah.p;
import net.minecraft.ah.z;

public class J
extends G {
    @Override
    public boolean c(int n2, int n3) {
        String string = z.I();
        boolean bl2 = this.e.e(n2, n3);
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public p r() {
        return p.OVERWORLD;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

