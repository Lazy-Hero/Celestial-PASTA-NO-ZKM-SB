/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ap;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ap.g;
import net.minecraft.av.c;
import net.minecraft.av.f;

final class b
implements net.minecraft.av.g {
    b() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block13: {
            r r4;
            int n3;
            u u2;
            boolean bl2;
            int[] arrn;
            block12: {
                arrn = g.c();
                bl2 = r2.a("entities", 9);
                if (arrn == null) break block12;
                if (bl2) {
                    u2 = r2.c("entities", 10);
                    n3 = 0;
                    while (n3 < u2.b()) {
                        r4 = (r)u2.b(n3);
                        if (arrn != null) {
                            bl2 = r4.a("nbt", 10);
                            if (arrn == null) break block12;
                            if (bl2) {
                                r4.a("nbt", c10.a(f.ENTITY, r4.h("nbt"), n2));
                            }
                            ++n3;
                        }
                        if (arrn != null) continue;
                    }
                }
                r3 = r2;
                if (arrn == null) break block13;
                bl2 = r3.a("blocks", 9);
            }
            if (bl2) {
                u2 = r2.c("blocks", 10);
                n3 = 0;
                while (n3 < u2.b()) {
                    r4 = (r)u2.b(n3);
                    if (arrn != null) {
                        r3 = r4;
                        if (arrn == null) break block13;
                        if (r3.a("nbt", 10)) {
                            r4.a("nbt", c10.a(f.BLOCK_ENTITY, r4.h("nbt"), n2));
                        }
                        ++n3;
                    }
                    if (arrn != null) continue;
                }
            }
            r3 = r2;
        }
        return r3;
    }
}

