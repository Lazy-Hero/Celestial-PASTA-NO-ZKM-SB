/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.av.c;
import net.minecraft.av.g;
import net.minecraft.t.f;

final class h
implements g {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block9: {
            block8: {
                int n3;
                u u2;
                boolean bl2;
                r r4;
                int n4;
                block10: {
                    n4 = f.e();
                    r3 = r2;
                    if (n4 != 0) break block9;
                    if (!r3.a("Level", 10)) break block8;
                    r4 = r2.h("Level");
                    bl2 = r4.a("Entities", 9);
                    if (n4 != 0) break block10;
                    if (bl2) {
                        u2 = r4.c("Entities", 10);
                        for (n3 = 0; n3 < u2.b(); ++n3) {
                            u2.a(n3, c10.a(net.minecraft.av.f.ENTITY, (r)u2.b(n3), n2));
                            if (n4 == 0) {
                                if (n4 == 0) continue;
                            }
                            break block8;
                        }
                    }
                    r3 = r4;
                    if (n4 != 0) break block9;
                    bl2 = r3.a("TileEntities", 9);
                }
                if (bl2) {
                    u2 = r4.c("TileEntities", 10);
                    for (n3 = 0; n3 < u2.b(); ++n3) {
                        u2.a(n3, c10.a(net.minecraft.av.f.BLOCK_ENTITY, (r)u2.b(n3), n2));
                        if (n4 == 0) continue;
                    }
                }
            }
            r3 = r2;
        }
        return r3;
    }

    h() {
    }
}

