/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.J.l;
import net.minecraft.J.m;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class aC
extends k {
    private final /* synthetic */ Class<? extends net.minecraft.U.z> s;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    private net.minecraft.U.z a(z z2, n n2, aA aA2) {
        int n3 = bl.g();
        Class<? extends net.minecraft.U.z> class_ = this.s;
        Class class_2 = m.class;
        if (n3 != 0) {
            if (class_ == class_2) {
                return new m(z2, n2, aA2);
            }
            class_ = this.s;
            class_2 = l.class;
        }
        return class_ == class_2 ? new l(z2, n2, aA2) : null;
    }

    public aC(Class<? extends net.minecraft.U.z> class_) {
        this.s = class_;
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block5: {
            block7: {
                boolean bl2;
                net.minecraft.U.z z3;
                int n3;
                d d10;
                block8: {
                    net.minecraft.U.z z4;
                    block6: {
                        aA aA3;
                        aA aA4;
                        n n4;
                        block4: {
                            d10 = j2.c(a32);
                            n3 = bl.g();
                            n4 = n2.a(aA2);
                            aA4 = aA2;
                            aA3 = aA.DOWN;
                            if (n3 == 0) break block4;
                            if (aA4 == aA3) break block5;
                            aA4 = aA2;
                            aA3 = aA.UP;
                        }
                        if (aA4 == aA3 || !j2.a(n4, aA2, d10)) break block5;
                        z4 = z3 = this.a(z2, n4, aA2);
                        if (n3 == 0) break block6;
                        if (z4 == null) break block7;
                        z4 = z3;
                    }
                    bl2 = z4.b();
                    if (n3 == 0) break block8;
                    if (!bl2) break block7;
                    bl2 = z2.C;
                }
                if (n3 != 0 && !bl2) {
                    z3.d();
                    bl2 = z2.f(z3);
                }
                d10.b(1);
            }
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }
}

