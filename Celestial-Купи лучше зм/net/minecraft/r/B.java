/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;

public class B
implements a {
    @Override
    public int a() {
        return 820;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        block0: {
            if (!"minecraft:totem".equals(r2.j("id"))) break block0;
            r2.a("id", "minecraft:totem_of_undying");
        }
        return r2;
    }
}

