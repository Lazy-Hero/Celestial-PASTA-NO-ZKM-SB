/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class G
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
                String string;
                block4: {
                    string = m.b();
                    bl2 = "EntityHorse".equals(r2.j("id"));
                    if (string != null) break block4;
                    if (!bl2) break block5;
                    r3 = r2;
                    if (string != null) break block6;
                    bl2 = r3.a("SaddleItem", 10);
                }
                if (bl2) break block5;
                r3 = r2;
                if (string != null) break block6;
                if (r3.f("Saddle")) {
                    r r4 = new r();
                    r4.a("id", "minecraft:saddle");
                    r4.a("Count", (byte)1);
                    r4.a("Damage", (short)0);
                    r2.a("SaddleItem", r4);
                    r2.k("Saddle");
                }
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public int a() {
        return 110;
    }
}

