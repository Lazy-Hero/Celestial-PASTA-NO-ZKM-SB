/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.w;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.a3;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class aS
extends a3 {
    private static final /* synthetic */ Set<K> x;

    private static gP a(gP gP2) {
        return gP2;
    }

    public aS(a8 a82) {
        super(1.5f, -3.0f, a82, x);
    }

    @Override
    public aX a(j j2, z z2, n n2, net.minecraft.ar.a3 a32, aA aA2, float f10, float f11, float f12) {
        block4: {
            block7: {
                d d10;
                block6: {
                    K k2;
                    int n3;
                    block5: {
                        d10 = j2.c(a32);
                        n3 = bl.c();
                        if (!j2.a(n2.a(aA2), aA2, d10)) {
                            return aX.FAIL;
                        }
                        i i2 = z2.d(n2);
                        K k3 = i2.b();
                        if (aA2 == aA.DOWN || z2.d(n2.a()).o() != c.A) break block4;
                        k2 = k3;
                        if (n3 != 0) break block5;
                        if (k2 != g.aU) break block4;
                        k2 = g.ci;
                    }
                    i i3 = k2.d();
                    z2.a(j2, n2, E.hm, ay.BLOCKS, 1.0f, 1.0f);
                    boolean bl2 = z2.C;
                    if (n3 != 0) break block6;
                    if (bl2) break block7;
                    bl2 = z2.a(n2, i3, 11);
                }
                d10.a(1, (B)j2);
            }
            return aX.SUCCESS;
        }
        return aX.PASS;
    }

    static {
        x = Sets.newHashSet((Object[])new K[]{g.d, g.bv, g.cU, g.aU, g.di, g.a8, g.aO, g.da, g.o, g.br, g.ci, g.aw});
    }

    @Override
    public boolean a(i i2) {
        K k2 = i2.b();
        int n2 = bl.g();
        K k3 = k2;
        K k4 = g.o;
        if (n2 != 0) {
            if (k3 == k4) {
                return true;
            }
            k3 = k2;
            k4 = g.da;
        }
        return k3 == k4;
    }
}

