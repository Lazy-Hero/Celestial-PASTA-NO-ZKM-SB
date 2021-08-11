/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import java.util.Locale;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class r
implements a {
    @Override
    public int a() {
        return 816;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        String string = m.b();
        net.minecraft.P.r r3 = r2;
        if (string == null) {
            if (r3.a("lang", 8)) {
                r2.a("lang", r2.j("lang").toLowerCase(Locale.ROOT));
            }
            r3 = r2;
        }
        return r3;
    }
}

