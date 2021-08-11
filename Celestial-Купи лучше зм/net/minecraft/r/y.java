/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;
import net.minecraft.w.bl;

public class y
implements a {
    @Override
    public r a(r r2) {
        r r3;
        block6: {
            block5: {
                short s2;
                block4: {
                    String string = m.b();
                    s2 = "minecraft:bed".equals(r2.j("id"));
                    if (string != null) break block4;
                    if (s2 == 0) break block5;
                    r3 = r2;
                    if (string != null) break block6;
                    s2 = r3.q("Damage");
                }
                if (s2 == 0) {
                    r2.a("Damage", (short)bl.RED.e());
                }
            }
            r3 = r2;
        }
        return r3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 1125;
    }
}

