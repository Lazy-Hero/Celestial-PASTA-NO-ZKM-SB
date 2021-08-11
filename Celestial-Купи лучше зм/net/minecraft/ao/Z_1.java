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

public class Z
extends Y {
    public Z(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 2, 1, 1);
    }

    public Z() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        s s2 = this.p.f[aA.EAST.f()];
        s s3 = this.p;
        String[] arrstring = u.b();
        s s4 = this.p;
        if (arrstring != null) {
            if (s4.d / 25 > 0) {
                this.a(z2, b10, 8, 0, s2.c[aA.DOWN.f()]);
                this.a(z2, b10, 0, 0, s3.c[aA.DOWN.f()]);
            }
            s4 = s3.f[aA.UP.f()];
        }
        if (arrstring != null) {
            if (s4 == null) {
                this.a(z2, b10, 1, 4, 1, 7, 4, 6, l);
            }
            s4 = s2.f[aA.UP.f()];
        }
        if (arrstring != null) {
            if (s4 == null) {
                this.a(z2, b10, 8, 4, 1, 14, 4, 6, l);
            }
            this.a(z2, b10, 0, 3, 0, 0, 3, 7, n, n, false);
            this.a(z2, b10, 15, 3, 0, 15, 3, 7, n, n, false);
            this.a(z2, b10, 1, 3, 0, 15, 3, 0, n, n, false);
            this.a(z2, b10, 1, 3, 7, 14, 3, 7, n, n, false);
            this.a(z2, b10, 0, 2, 0, 0, 2, 7, l, l, false);
            this.a(z2, b10, 15, 2, 0, 15, 2, 7, l, l, false);
            this.a(z2, b10, 1, 2, 0, 15, 2, 0, l, l, false);
            this.a(z2, b10, 1, 2, 7, 14, 2, 7, l, l, false);
            this.a(z2, b10, 0, 1, 0, 0, 1, 7, n, n, false);
            this.a(z2, b10, 15, 1, 0, 15, 1, 7, n, n, false);
            this.a(z2, b10, 1, 1, 0, 15, 1, 0, n, n, false);
            this.a(z2, b10, 1, 1, 7, 14, 1, 7, n, n, false);
            this.a(z2, b10, 5, 1, 0, 10, 1, 4, n, n, false);
            this.a(z2, b10, 6, 2, 0, 9, 2, 3, l, l, false);
            this.a(z2, b10, 5, 3, 0, 10, 3, 4, n, n, false);
            this.a(z2, m, 6, 2, 3, b10);
            this.a(z2, m, 9, 2, 3, b10);
            s4 = s3;
        }
        boolean bl2 = s4.c[aA.SOUTH.f()];
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 3, 1, 0, 4, 2, 0, false);
            }
            bl2 = s3.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 3, 1, 7, 4, 2, 7, false);
            }
            bl2 = s3.c[aA.WEST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 1, 3, 0, 2, 4, false);
            }
            bl2 = s2.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 11, 1, 0, 12, 2, 0, false);
            }
            bl2 = s2.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 11, 1, 7, 12, 2, 7, false);
            }
            bl2 = s2.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 15, 1, 3, 15, 2, 4, false);
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

