/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a5
extends k {
    public static boolean b(r r2) {
        int n2;
        block8: {
            int n3 = bl.g();
            r r3 = r2;
            if (n3 != 0) {
                if (r3 == null) {
                    return false;
                }
                r3 = r2;
            }
            String string = "pages";
            int n4 = 9;
            if (n3 != 0) {
                if (!r3.a(string, n4)) {
                    return false;
                }
                r3 = r2;
                string = "pages";
                n4 = 8;
            }
            u u2 = r3.c(string, n4);
            int n5 = 0;
            while (n5 < u2.b()) {
                String string2 = u2.c(n5);
                if (n3 != 0) {
                    n2 = string2.length();
                    if (n3 == 0) break block8;
                    if (n2 > 32767) {
                        return false;
                    }
                    ++n5;
                }
                if (n3 != 0) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public a5() {
        this.b(1);
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10 = j2.c(a32);
        j2.a(d10, a32);
        j2.b(m.b(this));
        return new t<d>(aX.SUCCESS, d10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

