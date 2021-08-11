/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.Y;
import net.minecraft.ao.b;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class al
extends Y {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        this.a(z2, b10, 0, 3, 0, 2, 3, 7, n, n, false);
        String[] arrstring = u.b();
        this.a(z2, b10, 5, 3, 0, 7, 3, 7, n, n, false);
        String[] arrstring2 = arrstring;
        this.a(z2, b10, 0, 2, 0, 1, 2, 7, n, n, false);
        this.a(z2, b10, 6, 2, 0, 7, 2, 7, n, n, false);
        this.a(z2, b10, 0, 1, 0, 0, 1, 7, n, n, false);
        this.a(z2, b10, 7, 1, 0, 7, 1, 7, n, n, false);
        this.a(z2, b10, 0, 1, 7, 7, 3, 7, n, n, false);
        this.a(z2, b10, 1, 1, 0, 2, 3, 0, n, n, false);
        this.a(z2, b10, 5, 1, 0, 6, 3, 0, n, n, false);
        boolean bl2 = this.p.c[aA.NORTH.f()];
        if (arrstring2 != null) {
            if (bl2) {
                this.a(z2, b10, 3, 1, 7, 4, 2, 7, false);
            }
            bl2 = this.p.c[aA.WEST.f()];
        }
        if (arrstring2 != null) {
            if (bl2) {
                this.a(z2, b10, 0, 1, 3, 1, 2, 4, false);
            }
            bl2 = this.p.c[aA.EAST.f()];
        }
        if (arrstring2 != null) {
            if (bl2) {
                this.a(z2, b10, 6, 1, 3, 7, 2, 4, false);
            }
            bl2 = true;
        }
        return bl2;
    }

    public al(aA aA2, s s2) {
        super(1, aA2, s2, 1, 1, 1);
    }

    public al() {
    }
}

