/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class x
implements a {
    @Override
    public int a() {
        return 107;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        r r3;
        block11: {
            Object object;
            boolean bl2;
            String string;
            block12: {
                string = m.b();
                bl2 = "MobSpawner".equals(r2.j("id"));
                if (string == null) {
                    if (!bl2) {
                        return r2;
                    }
                    bl2 = r2.a("EntityId", 8);
                }
                if (string != null) break block12;
                if (bl2) {
                    object = r2.j("EntityId");
                    r r4 = r2.h("SpawnData");
                    Object object2 = object;
                    if (string == null) {
                        object2 = ((String)object2).isEmpty() ? "Pig" : object;
                    }
                    r4.a("id", (String)object2);
                    r2.a("SpawnData", r4);
                    r2.k("EntityId");
                }
                r3 = r2;
                if (string != null) break block11;
                bl2 = r3.a("SpawnPotentials", 9);
            }
            if (bl2) {
                object = r2.c("SpawnPotentials", 10);
                int n2 = 0;
                while (n2 < ((u)object).b()) {
                    r r5 = ((u)object).d(n2);
                    if (string == null) {
                        r3 = r5;
                        if (string != null) break block11;
                        if (r3.a("Type", 8)) {
                            r r6 = r5.h("Properties");
                            r6.a("id", r5.j("Type"));
                            r5.a("Entity", r6);
                            r5.k("Type");
                            r5.k("Properties");
                        }
                        ++n2;
                    }
                    if (string == null) continue;
                }
            }
            r3 = r2;
        }
        return r3;
    }
}

