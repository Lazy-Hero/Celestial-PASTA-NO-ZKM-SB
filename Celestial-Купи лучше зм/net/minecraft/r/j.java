/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class j
implements a {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        r r3;
        block6: {
            block5: {
                boolean bl2;
                block4: {
                    String string = m.b();
                    bl2 = "minecraft:shulker".equals(r2.j("id"));
                    if (string != null) break block4;
                    if (!bl2) break block5;
                    r3 = r2;
                    if (string != null) break block6;
                    bl2 = r3.a("Color", 99);
                }
                if (!bl2) {
                    r2.a("Color", (byte)10);
                }
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public int a() {
        return 808;
    }
}

