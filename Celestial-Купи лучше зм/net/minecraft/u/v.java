/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.a3;
import net.minecraft.ar.aA;
import net.minecraft.u.f;
import net.minecraft.w.aG;

final class v
extends d {
    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        net.minecraft.w.d d11;
        block6: {
            block4: {
                x x2;
                block5: {
                    aA aA2 = i2.b().b(a3.C);
                    double d12 = i2.a() + (double)aA2.r();
                    double d13 = (float)(i2.e().b() + aA2.p()) + 0.2f;
                    double d14 = i2.d() + (double)aA2.i();
                    boolean bl2 = f.f();
                    x2 = aG.a(i2.a(), aG.a(d10), d12, d13, d14);
                    if (bl2) break block4;
                    if (!(x2 instanceof B)) break block5;
                    d11 = d10;
                    if (bl2) break block6;
                    if (d11.c()) {
                        x2.a(d10.g());
                    }
                }
                aG.a(i2.a(), null, d10, x2);
                d10.b(1);
            }
            d11 = d10;
        }
        return d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    v() {
    }
}

