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
import net.minecraft.u.g;

public class aC
extends Y {
    @Override
    public boolean a(z z2, Random random, b b10) {
        char n2;
        String[] arrstring;
        block11: {
            block14: {
                aC aC2;
                block13: {
                    s s2;
                    block12: {
                        arrstring = u.b();
                        s2 = this.p;
                        if (arrstring == null) break block12;
                        if (s2.d / 25 > 0) {
                            this.a(z2, b10, 0, 0, this.p.c[aA.DOWN.f()]);
                        }
                        aC2 = this;
                        if (arrstring == null) break block13;
                        s2 = aC2.p.f[aA.UP.f()];
                    }
                    if (s2 != null) break block14;
                    aC2 = this;
                }
                aC2.a(z2, b10, 1, 4, 1, 6, 4, 6, l);
            }
            int n3 = 1;
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 <= 6) {
                    n2 = '\u0001';
                    if (arrstring == null) break block11;
                    for (char i2 = v127370; i2 <= '\u0006'; ++i2) {
                        int n5;
                        n4 = random.nextInt(3);
                        if (arrstring == null) continue block1;
                        if (arrstring != null) {
                            if (n4 == 0) continue;
                            n5 = 2;
                        }
                        int n6 = random.nextInt(4);
                        if (arrstring != null) {
                            n6 = n6 == 0 ? 0 : 1;
                        }
                        int n7 = n5 + n6;
                        this.a(z2, b10, n3, n7, i2, n3, 3, i2, net.minecraft.u.g.a2.c(1), net.minecraft.u.g.a2.c(1), false);
                        if (arrstring != null) continue;
                    }
                    ++n3;
                    if (arrstring != null) continue block0;
                }
                break;
            }
            this.a(z2, b10, 0, 1, 0, 0, 1, 7, n, n, false);
            this.a(z2, b10, 7, 1, 0, 7, 1, 7, n, n, false);
            this.a(z2, b10, 1, 1, 0, 6, 1, 0, n, n, false);
            this.a(z2, b10, 1, 1, 7, 6, 1, 7, n, n, false);
            this.a(z2, b10, 0, 2, 0, 0, 2, 7, k, k, false);
            this.a(z2, b10, 7, 2, 0, 7, 2, 7, k, k, false);
            this.a(z2, b10, 1, 2, 0, 6, 2, 0, k, k, false);
            this.a(z2, b10, 1, 2, 7, 6, 2, 7, k, k, false);
            this.a(z2, b10, 0, 3, 0, 0, 3, 7, n, n, false);
            this.a(z2, b10, 7, 3, 0, 7, 3, 7, n, n, false);
            this.a(z2, b10, 1, 3, 0, 6, 3, 0, n, n, false);
            this.a(z2, b10, 1, 3, 7, 6, 3, 7, n, n, false);
            this.a(z2, b10, 0, 1, 3, 0, 2, 4, k, k, false);
            this.a(z2, b10, 7, 1, 3, 7, 2, 4, k, k, false);
            this.a(z2, b10, 3, 1, 0, 4, 2, 0, k, k, false);
            this.a(z2, b10, 3, 1, 7, 4, 2, 7, k, k, false);
            n2 = this.p.c[aA.SOUTH.f()];
        }
        if (arrstring != null) {
            if (n2 != '\u0000') {
                this.a(z2, b10, 3, 1, 0, 4, 2, 0, false);
            }
            n2 = '\u0001';
        }
        return n2 != '\u0000';
    }

    public aC(aA aA2, s s2, Random random) {
        super(1, aA2, s2, 1, 1, 1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aC() {
    }
}

