/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.T;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ar.v;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.k.m;

final class t
implements g {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public r a(c c10, r r2, int n2) {
        String string;
        r r3;
        block6: {
            boolean bl2;
            m[] arrm;
            block5: {
                arrm = j.f();
                bl2 = y.a(T.class).equals(new v(r2.j("id")));
                if (arrm != null) break block5;
                if (!bl2) return r2;
                r3 = r2;
                string = "SpawnPotentials";
                if (arrm != null) break block6;
                bl2 = r3.a(string, 9);
            }
            if (bl2) {
                u u2 = r2.c("SpawnPotentials", 10);
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    r r4 = u2.d(i2);
                    r4.a("Entity", c10.a(f.ENTITY, r4.h("Entity"), n2));
                    if (arrm != null) return r2;
                    if (arrm == null) continue;
                }
            }
            r3 = r2;
            string = "SpawnData";
        }
        r3.a(string, c10.a(f.ENTITY, r2.h("SpawnData"), n2));
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    t() {
    }
}

