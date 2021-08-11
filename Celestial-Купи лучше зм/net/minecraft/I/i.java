/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.P.r;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.i.g;

final class i
implements net.minecraft.av.g {
    @Override
    public r a(c c10, r r2, int n2) {
        r r3;
        block4: {
            block5: {
                r r4;
                String string = g.b();
                r3 = r2;
                if (string != null) break block4;
                if (!r3.a("RootVehicle", 10)) break block5;
                r3 = r4 = r2.h("RootVehicle");
                if (string != null) break block4;
                if (r3.a("Entity", 10)) {
                    r4.a("Entity", c10.a(f.ENTITY, r4.h("Entity"), n2));
                }
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    i() {
    }
}

