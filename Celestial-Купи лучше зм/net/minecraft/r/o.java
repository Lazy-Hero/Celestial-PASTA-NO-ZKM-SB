/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import java.util.UUID;
import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class o
implements a {
    @Override
    public int a() {
        return 108;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r a(r r2) {
        String string = m.b();
        r r3 = r2;
        if (string == null) {
            if (r3.a("UUID", 8)) {
                r2.a("UUID", UUID.fromString(r2.j("UUID")));
            }
            r3 = r2;
        }
        return r3;
    }
}

