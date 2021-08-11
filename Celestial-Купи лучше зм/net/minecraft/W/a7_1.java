/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import java.util.Iterator;
import net.minecraft.U.A;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bA;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.k;

public class a7
extends k {
    public static boolean a(j j2, z z2, n n2) {
        boolean bl2;
        block3: {
            A a10 = A.b(z2, n2);
            boolean bl3 = false;
            double d10 = 7.0;
            int n3 = n2.e();
            int n4 = n2.b();
            int n5 = bl.g();
            int n6 = n2.a();
            Iterator<C> iterator = z2.a(C.class, new net.minecraft.k.k((double)n3 - 7.0, (double)n4 - 7.0, (double)n6 - 7.0, (double)n3 + 7.0, (double)n4 + 7.0, (double)n6 + 7.0)).iterator();
            while (iterator.hasNext()) {
                block5: {
                    C c10;
                    block7: {
                        A a11;
                        block6: {
                            x x2;
                            block4: {
                                x2 = c10 = iterator.next();
                                if (n5 == 0) break block4;
                                bl2 = x2.O();
                                if (n5 == 0) break block3;
                                if (!bl2) break block5;
                                x2 = c10.e();
                            }
                            if (x2 != j2) break block5;
                            a11 = a10;
                            if (n5 == 0) break block6;
                            if (a11 != null) break block7;
                            a11 = A.a(z2, n2);
                        }
                        a10 = a11;
                    }
                    c10.a((x)a10, true);
                    bl3 = true;
                }
                if (n5 != 0) continue;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a7() {
        this.a(net.minecraft.ad.a.d);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        K k2 = z2.d(n2).b();
        int n3 = bl.c();
        boolean bl2 = k2 instanceof bA;
        if (n3 == 0) {
            if (!bl2) {
                return aX.PASS;
            }
            bl2 = z2.C;
        }
        if (n3 == 0 && !bl2) {
            bl2 = a7.a(j2, z2, n2);
        }
        return aX.SUCCESS;
    }
}

