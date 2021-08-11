/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.L.b;
import net.minecraft.U.x;
import net.minecraft.aj.k;
import net.minecraft.aj.t;
import net.minecraft.g.d;
import net.minecraft.g.f;

public class e
implements d {
    private final /* synthetic */ b[] a;
    private final /* synthetic */ t b;

    static b[] a(e e10) {
        return e10.a;
    }

    public e(b[] arrb, t t2) {
        this.a = arrb;
        this.b = t2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static t b(e e10) {
        return e10.b;
    }

    @Override
    public boolean a(Random random, k k2) {
        boolean bl2;
        block5: {
            x x2 = k2.a(this.b);
            int[] arrn = f.b();
            if (x2 == null) {
                return false;
            }
            b[] arrb = this.a;
            int n2 = arrb.length;
            int n3 = 0;
            while (n3 < n2) {
                b b10 = arrb[n3];
                if (arrn != null) {
                    bl2 = b10.a(random, x2);
                    if (arrn == null) break block5;
                    if (!bl2) {
                        return false;
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }
}

