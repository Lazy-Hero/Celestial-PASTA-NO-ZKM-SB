/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.P.r;
import net.minecraft.av.c;
import net.minecraft.av.e;
import net.minecraft.av.f;
import net.minecraft.i.g;

final class d
implements net.minecraft.av.g {
    private static gP a(gP gP2) {
        return gP2;
    }

    d() {
    }

    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block6: {
            boolean bl2;
            block5: {
                String string = g.b();
                e.a(c10, r2, n2, "Inventory");
                String string2 = string;
                e.a(c10, r2, n2, "EnderItems");
                bl2 = r2.a("ShoulderEntityLeft", 10);
                if (string2 != null) break block5;
                if (bl2) {
                    r2.a("ShoulderEntityLeft", c10.a(f.ENTITY, r2.h("ShoulderEntityLeft"), n2));
                }
                r3 = r2;
                if (string2 != null) break block6;
                bl2 = r3.a("ShoulderEntityRight", 10);
            }
            if (bl2) {
                r2.a("ShoulderEntityRight", c10.a(f.ENTITY, r2.h("ShoulderEntityRight"), n2));
            }
            r3 = r2;
        }
        return r3;
    }
}

