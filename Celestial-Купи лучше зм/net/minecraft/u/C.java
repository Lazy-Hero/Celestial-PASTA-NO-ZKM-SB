/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.N.S;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.a3;
import net.minecraft.W.as;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.i;
import net.minecraft.u.x;
import net.minecraft.w.d;

class C
extends x {
    @Override
    protected d b(net.minecraft.O.i i2, d d10) {
        block7: {
            boolean bl2;
            n n2;
            aA aA2;
            z z2;
            boolean bl3;
            K k2;
            block6: {
                k2 = K.a(d10.w());
                bl3 = f.f();
                z2 = i2.a();
                aA2 = i2.b().b(a3.C);
                n2 = i2.e().a(aA2);
                bl2 = this.c = z2.a(k2, n2, false, aA.DOWN, null);
                if (bl3) break block6;
                if (!bl2) break block7;
                bl2 = z2.a(n2.k());
            }
            aA aA3 = bl2 ? aA2 : aA.UP;
            net.minecraft.Z.i i3 = k2.d().a(as.z, aA3);
            z2.a(n2, i3);
            y y2 = z2.b(n2);
            d d11 = d10.d(1);
            boolean bl4 = d11.x();
            if (!bl3) {
                if (bl4) {
                    ((S)y2).d(d11.v().h("BlockEntityTag"));
                }
                bl4 = d11.c();
            }
            if (bl4) {
                ((S)y2).a(d11.g());
            }
            z2.b(n2, i3.b());
        }
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    C(i i2) {
        this();
    }

    private C() {
    }
}

