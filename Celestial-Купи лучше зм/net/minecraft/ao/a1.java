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

public class a1
extends Y {
    public a1() {
    }

    public a1(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 1, 2, 1);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block17: {
            String[] arrstring = u.b();
            s s2 = this.p;
            if (arrstring != null) {
                if (s2.d / 25 > 0) {
                    this.a(z2, b10, 0, 0, this.p.c[aA.DOWN.f()]);
                }
                s2 = this.p.f[aA.UP.f()];
            }
            s s3 = s2;
            s s4 = s3.f[aA.UP.f()];
            if (arrstring != null) {
                if (s4 == null) {
                    this.a(z2, b10, 1, 8, 1, 6, 8, 6, l);
                }
                this.a(z2, b10, 0, 4, 0, 0, 4, 7, n, n, false);
                this.a(z2, b10, 7, 4, 0, 7, 4, 7, n, n, false);
                this.a(z2, b10, 1, 4, 0, 6, 4, 0, n, n, false);
                this.a(z2, b10, 1, 4, 7, 6, 4, 7, n, n, false);
                this.a(z2, b10, 2, 4, 1, 2, 4, 2, n, n, false);
                this.a(z2, b10, 1, 4, 2, 1, 4, 2, n, n, false);
                this.a(z2, b10, 5, 4, 1, 5, 4, 2, n, n, false);
                this.a(z2, b10, 6, 4, 2, 6, 4, 2, n, n, false);
                this.a(z2, b10, 2, 4, 5, 2, 4, 6, n, n, false);
                this.a(z2, b10, 1, 4, 5, 1, 4, 5, n, n, false);
                this.a(z2, b10, 5, 4, 5, 5, 4, 6, n, n, false);
                this.a(z2, b10, 6, 4, 5, 6, 4, 5, n, n, false);
                s4 = this.p;
            }
            s s5 = s4;
            for (int i2 = 1; i2 <= 5; i2 += 4) {
                block29: {
                    int n2;
                    block27: {
                        block28: {
                            block26: {
                                block24: {
                                    block25: {
                                        block23: {
                                            int n3;
                                            block21: {
                                                block22: {
                                                    block20: {
                                                        block18: {
                                                            block19: {
                                                                n3 = 0;
                                                                if (arrstring == null) break block18;
                                                                bl2 = s5.c[aA.SOUTH.f()];
                                                                if (arrstring == null) break block17;
                                                                if (!bl2) break block19;
                                                                this.a(z2, b10, 2, i2, n3, 2, i2 + 2, n3, n, n, false);
                                                                this.a(z2, b10, 5, i2, n3, 5, i2 + 2, n3, n, n, false);
                                                                this.a(z2, b10, 3, i2 + 2, n3, 4, i2 + 2, n3, n, n, false);
                                                                if (arrstring != null) break block20;
                                                            }
                                                            this.a(z2, b10, 0, i2, n3, 7, i2 + 2, n3, n, n, false);
                                                        }
                                                        this.a(z2, b10, 0, i2 + 1, n3, 7, i2 + 1, n3, l, l, false);
                                                    }
                                                    n3 = 7;
                                                    if (arrstring == null) break block21;
                                                    if (!s5.c[aA.NORTH.f()]) break block22;
                                                    this.a(z2, b10, 2, i2, n3, 2, i2 + 2, n3, n, n, false);
                                                    this.a(z2, b10, 5, i2, n3, 5, i2 + 2, n3, n, n, false);
                                                    this.a(z2, b10, 3, i2 + 2, n3, 4, i2 + 2, n3, n, n, false);
                                                    if (arrstring != null) break block23;
                                                }
                                                this.a(z2, b10, 0, i2, n3, 7, i2 + 2, n3, n, n, false);
                                            }
                                            this.a(z2, b10, 0, i2 + 1, n3, 7, i2 + 1, n3, l, l, false);
                                        }
                                        n2 = 0;
                                        if (arrstring == null) break block24;
                                        if (!s5.c[aA.WEST.f()]) break block25;
                                        this.a(z2, b10, n2, i2, 2, n2, i2 + 2, 2, n, n, false);
                                        this.a(z2, b10, n2, i2, 5, n2, i2 + 2, 5, n, n, false);
                                        this.a(z2, b10, n2, i2 + 2, 3, n2, i2 + 2, 4, n, n, false);
                                        if (arrstring != null) break block26;
                                    }
                                    this.a(z2, b10, n2, i2, 0, n2, i2 + 2, 7, n, n, false);
                                }
                                this.a(z2, b10, n2, i2 + 1, 0, n2, i2 + 1, 7, l, l, false);
                            }
                            n2 = 7;
                            if (arrstring == null) break block27;
                            if (!s5.c[aA.EAST.f()]) break block28;
                            this.a(z2, b10, n2, i2, 2, n2, i2 + 2, 2, n, n, false);
                            this.a(z2, b10, n2, i2, 5, n2, i2 + 2, 5, n, n, false);
                            this.a(z2, b10, n2, i2 + 2, 3, n2, i2 + 2, 4, n, n, false);
                            if (arrstring != null) break block29;
                        }
                        this.a(z2, b10, n2, i2, 0, n2, i2 + 2, 7, n, n, false);
                    }
                    this.a(z2, b10, n2, i2 + 1, 0, n2, i2 + 1, 7, l, l, false);
                }
                s5 = s3;
                if (arrstring != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

