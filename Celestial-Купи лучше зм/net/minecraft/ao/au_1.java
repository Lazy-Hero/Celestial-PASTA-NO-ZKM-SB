/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.Y;
import net.minecraft.ao.b;
import net.minecraft.ao.s;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class au
extends Y {
    public au() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        s s2;
        s s3;
        s s4;
        String[] arrstring;
        s s5;
        block33: {
            s5 = this.p.f[aA.EAST.f()];
            arrstring = u.b();
            s4 = this.p;
            s3 = s4.f[aA.UP.f()];
            s2 = s5.f[aA.UP.f()];
            s s6 = this.p;
            if (arrstring != null) {
                if (s6.d / 25 > 0) {
                    this.a(z2, b10, 8, 0, s5.c[aA.DOWN.f()]);
                    this.a(z2, b10, 0, 0, s4.c[aA.DOWN.f()]);
                }
                s6 = s3.f[aA.UP.f()];
            }
            if (arrstring != null) {
                if (s6 == null) {
                    this.a(z2, b10, 1, 8, 1, 7, 8, 6, l);
                }
                s6 = s2.f[aA.UP.f()];
            }
            if (s6 == null) {
                this.a(z2, b10, 8, 8, 1, 14, 8, 6, l);
            }
            for (int i2 = 1; i2 <= 7; ++i2) {
                i i3;
                block36: {
                    block35: {
                        int n3;
                        int n4;
                        block34: {
                            i3 = n;
                            n2 = i2;
                            if (arrstring == null) break block33;
                            n4 = 2;
                            if (arrstring == null) break block34;
                            if (n2 == n4) break block35;
                            n3 = i2;
                            n4 = 6;
                        }
                        if (n3 != n4) break block36;
                    }
                    i3 = l;
                }
                this.a(z2, b10, 0, i2, 0, 0, i2, 7, i3, i3, false);
                this.a(z2, b10, 15, i2, 0, 15, i2, 7, i3, i3, false);
                this.a(z2, b10, 1, i2, 0, 15, i2, 0, i3, i3, false);
                this.a(z2, b10, 1, i2, 7, 14, i2, 7, i3, i3, false);
                if (arrstring != null) continue;
            }
            this.a(z2, b10, 2, 1, 3, 2, 7, 4, n, n, false);
            this.a(z2, b10, 3, 1, 2, 4, 7, 2, n, n, false);
            this.a(z2, b10, 3, 1, 5, 4, 7, 5, n, n, false);
            this.a(z2, b10, 13, 1, 3, 13, 7, 4, n, n, false);
            this.a(z2, b10, 11, 1, 2, 12, 7, 2, n, n, false);
            this.a(z2, b10, 11, 1, 5, 12, 7, 5, n, n, false);
            this.a(z2, b10, 5, 1, 3, 5, 3, 4, n, n, false);
            this.a(z2, b10, 10, 1, 3, 10, 3, 4, n, n, false);
            this.a(z2, b10, 5, 7, 2, 10, 7, 5, n, n, false);
            this.a(z2, b10, 5, 5, 2, 5, 7, 2, n, n, false);
            this.a(z2, b10, 10, 5, 2, 10, 7, 2, n, n, false);
            this.a(z2, b10, 5, 5, 5, 5, 7, 5, n, n, false);
            this.a(z2, b10, 10, 5, 5, 10, 7, 5, n, n, false);
            this.a(z2, n, 6, 6, 2, b10);
            this.a(z2, n, 9, 6, 2, b10);
            this.a(z2, n, 6, 6, 5, b10);
            this.a(z2, n, 9, 6, 5, b10);
            this.a(z2, b10, 5, 4, 3, 6, 4, 4, n, n, false);
            this.a(z2, b10, 9, 4, 3, 10, 4, 4, n, n, false);
            this.a(z2, m, 5, 4, 2, b10);
            this.a(z2, m, 5, 4, 5, b10);
            this.a(z2, m, 10, 4, 2, b10);
            this.a(z2, m, 10, 4, 5, b10);
            n2 = s4.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 3, 1, 0, 4, 2, 0, false);
            }
            n2 = s4.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 3, 1, 7, 4, 2, 7, false);
            }
            n2 = s4.c[aA.WEST.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 0, 1, 3, 0, 2, 4, false);
            }
            n2 = s5.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 11, 1, 0, 12, 2, 0, false);
            }
            n2 = s5.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 11, 1, 7, 12, 2, 7, false);
            }
            n2 = s5.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 15, 1, 3, 15, 2, 4, false);
            }
            n2 = s3.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 3, 5, 0, 4, 6, 0, false);
            }
            n2 = s3.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 3, 5, 7, 4, 6, 7, false);
            }
            n2 = s3.c[aA.WEST.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 0, 5, 3, 0, 6, 4, false);
            }
            n2 = s2.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 11, 5, 0, 12, 6, 0, false);
            }
            n2 = s2.c[aA.NORTH.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 11, 5, 7, 12, 6, 7, false);
            }
            n2 = s2.c[aA.EAST.f()];
        }
        if (arrstring != null) {
            if (n2 != 0) {
                this.a(z2, b10, 15, 5, 3, 15, 6, 4, false);
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public au(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 2, 2, 1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

