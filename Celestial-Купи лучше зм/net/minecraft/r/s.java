/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.ar.v;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class s
implements a {
    private static final /* synthetic */ v a;

    static {
        a = new v("cooked_fished");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        String string = m.b();
        r r3 = r2;
        if (string == null) {
            if (r3.a("id", 8) && a.equals(new v(r2.j("id")))) {
                r2.a("id", "minecraft:cooked_fish");
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public int a() {
        return 502;
    }
}

