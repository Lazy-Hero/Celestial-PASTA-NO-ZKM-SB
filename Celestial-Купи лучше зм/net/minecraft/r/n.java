/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class n
implements a {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public r a(r var1_1) {
        var2_2 = m.b();
        v0 = "EntityHorse".equals(var1_1.j("id"));
        if (var2_2 == null) {
            if (v0 == 0) return var1_1;
            v0 = var3_3 = var1_1.m("Type");
        }
        if (var2_2 != null) ** GOTO lbl10
        switch (var3_3) {
            default: {
                var1_1.a("id", "Horse");
lbl10:
                // 2 sources

                if (var2_2 == null) break;
            }
            case 1: {
                var1_1.a("id", "Donkey");
                if (var2_2 == null) break;
            }
            case 2: {
                var1_1.a("id", "Mule");
                if (var2_2 == null) break;
            }
            case 3: {
                var1_1.a("id", "ZombieHorse");
                if (var2_2 == null) break;
            }
            case 4: {
                var1_1.a("id", "SkeletonHorse");
                break;
            }
        }
        var1_1.k("Type");
        return var1_1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 703;
    }
}

