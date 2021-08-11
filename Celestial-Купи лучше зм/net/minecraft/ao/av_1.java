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

public class av
extends Y {
    @Override
    public boolean a(z z2, Random random, b b10) {
        s s2 = this.p.f[aA.NORTH.f()];
        s s3 = this.p;
        String[] arrstring = u.b();
        s s4 = this.p;
        if (arrstring != null) {
            if (s4.d / 25 > 0) {
                this.a(z2, b10, 0, 8, s2.c[aA.DOWN.f()]);
                this.a(z2, b10, 0, 0, s3.c[aA.DOWN.f()]);
            }
            s4 = s3.f[aA.UP.f()];
        }
        if (arrstring != null) {
            if (s4 == null) {
                this.a(z2, b10, 1, 4, 1, 6, 4, 7, l);
            }
            s4 = s2.f[aA.UP.f()];
        }
        if (arrstring != null) {
            if (s4 == null) {
                this.a(z2, b10, 1, 4, 8, 6, 4, 14, l);
            }
            this.a(z2, b10, 0, 3, 0, 0, 3, 15, n, n, false);
            this.a(z2, b10, 7, 3, 0, 7, 3, 15, n, n, false);
            this.a(z2, b10, 1, 3, 0, 7, 3, 0, n, n, false);
            this.a(z2, b10, 1, 3, 15, 6, 3, 15, n, n, false);
            this.a(z2, b10, 0, 2, 0, 0, 2, 15, l, l, false);
            this.a(z2, b10, 7, 2, 0, 7, 2, 15, l, l, false);
            this.a(z2, b10, 1, 2, 0, 7, 2, 0, l, l, false);
            this.a(z2, b10, 1, 2, 15, 6, 2, 15, l, l, false);
            this.a(z2, b10, 0, 1, 0, 0, 1, 15, n, n, false);
            this.a(z2, b10, 7, 1, 0, 7, 1, 15, n, n, false);
            this.a(z2, b10, 1, 1, 0, 7, 1, 0, n, n, false);
            this.a(z2, b10, 1, 1, 15, 6, 1, 15, n, n, false);
            this.a(z2, b10, 1, 1, 1, 1, 1, 2, n, n, false);
            this.a(z2, b10, 6, 1, 1, 6, 1, 2, n, n, false);
            this.a(z2, b10, 1, 3, 1, 1, 3, 2, n, n, false);
            this.a(z2, b10, 6, 3, 1, 6, 3, 2, n, n, false);
            this.a(z2, b10, 1, 1, 13, 1, 1, 14, n, n, false);
            this.a(z2, b10, 6, 1, 13, 6, 1, 14, n, n, false);
            this.a(z2, b10, 1, 3, 13, 1, 3, 14, n, n, false);
            this.a(z2, b10, 6, 3, 13, 6, 3, 14, n, n, false);
            this.a(z2, b10, 2, 1, 6, 2, 3, 6, n, n, false);
            this.a(z2, b10, 5, 1, 6, 5, 3, 6, n, n, false);
            this.a(z2, b10, 2, 1, 9, 2, 3, 9, n, n, false);
            this.a(z2, b10, 5, 1, 9, 5, 3, 9, n, n, false);
            this.a(z2, b10, 3, 2, 6, 4, 2, 6, n, n, false);
            this.a(z2, b10, 3, 2, 9, 4, 2, 9, n, n, false);
            this.a(z2, b10, 2, 2, 7, 2, 2, 8, n, n, false);
            this.a(z2, b10, 5, 2, 7, 5, 2, 8, n, n, false);
            this.a(z2, m, 2, 2, 5, b10);
            this.a(z2, m, 5, 2, 5, b10);
            this.a(z2, m, 2, 2, 10, b10);
            this.a(z2, m, 5, 2, 10, b10);
            this.a(z2, n, 2, 3, 5, b10);
            this.a(z2, n, 5, 3, 5, b10);
            this.a(z2, n, 2, 3, 10, b10);
            this.a(z2, n, 5, 3, 10, b10);
            s4 = s3;
        }
        boolean bl2 = s4.c[aA.SOUTH.f()];
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 3, 1, 0, 4, 2, 0, false);
            }
            bl2 = s3.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 7, 1, 3, 7, 2, 4, false);
            }
            bl2 = s3.c[aA.WEST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 1, 3, 0, 2, 4, false);
            }
            bl2 = s2.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 3, 1, 15, 4, 2, 15, false);
            }
            bl2 = s2.c[aA.WEST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 1, 11, 0, 2, 12, false);
            }
            bl2 = s2.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 7, 1, 11, 7, 2, 12, false);
            }
            bl2 = true;
        }
        return bl2;
    }

    public av(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 1, 1, 2);
    }

    public av() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

