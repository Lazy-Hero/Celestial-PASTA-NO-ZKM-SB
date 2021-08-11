/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.u.E;
import net.minecraft.w.aw;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class al
extends aw {
    @Override
    public d a(d d10, z z2, B b10) {
        d d11;
        block9: {
            B b11;
            block12: {
                boolean bl2;
                block8: {
                    d11 = super.a(d10, z2, b10);
                    int n2 = bl.c();
                    if (z2.C) break block9;
                    double d12 = b10.a;
                    double d13 = b10.aF;
                    double d14 = b10.ax;
                    for (int i2 = 0; i2 < 16; ++i2) {
                        B b12;
                        block11: {
                            boolean bl3;
                            block10: {
                                double d15 = b10.a + (b10.f().nextDouble() - 0.5) * 16.0;
                                double d16 = net.minecraft.k.h.b(b10.aF + (double)(b10.f().nextInt(16) - 8), 0.0, (double)(z2.e() - 1));
                                double d17 = b10.ax + (b10.f().nextDouble() - 0.5) * 16.0;
                                bl2 = b10.N();
                                if (n2 != 0) break block8;
                                if (n2 != 0) break block10;
                                if (bl2) {
                                    b10.aO();
                                }
                                b12 = b10;
                                if (n2 != 0) break block11;
                                bl3 = b12.a(d15, d16, d17);
                            }
                            if (!bl3) continue;
                            z2.a(null, d12, d13, d14, E.d6, ay.PLAYERS, 1.0f, 1.0f);
                            b12 = b10;
                        }
                        b12.a(E.d6, 1.0f, 1.0f);
                        if (n2 == 0) break;
                        if (n2 == 0) continue;
                    }
                    b11 = b10;
                    if (n2 != 0) break block12;
                    bl2 = b11 instanceof j;
                }
                if (!bl2) break block9;
                b11 = b10;
            }
            ((j)b11).o().b(this, 20);
        }
        return d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public al(int n2, float f10) {
        super(n2, f10, false);
    }
}

