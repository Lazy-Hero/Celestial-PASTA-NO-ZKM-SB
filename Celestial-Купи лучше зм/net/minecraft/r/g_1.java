/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class g
implements a {
    @Override
    public int a() {
        return 147;
    }

    @Override
    public r a(r r2) {
        r r3;
        block6: {
            block5: {
                boolean bl2;
                String string;
                block4: {
                    string = m.b();
                    bl2 = "ArmorStand".equals(r2.j("id"));
                    if (string != null) break block4;
                    if (!bl2) break block5;
                    r3 = r2;
                    if (string != null) break block6;
                    bl2 = r3.f("Silent");
                }
                if (!bl2) break block5;
                r3 = r2;
                if (string != null) break block6;
                if (!r3.f("Marker")) {
                    r2.k("Silent");
                }
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

