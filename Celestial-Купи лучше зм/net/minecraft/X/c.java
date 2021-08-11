/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import net.minecraft.P.r;
import net.minecraft.av.e;
import net.minecraft.k.m;
import net.minecraft.x.b;

public class c
extends b {
    private final /* synthetic */ String[] c;

    @Override
    r b(net.minecraft.av.c c10, r r2, int n2) {
        r r3;
        block2: {
            String[] arrstring = this.c;
            String string = b.b();
            for (String string2 : arrstring) {
                r3 = e.b(c10, r2, n2, string2);
                if (string != null) {
                    r2 = r3;
                    if (string != null) continue;
                    m.b(!m.c());
                    break;
                }
                break block2;
            }
            r3 = r2;
        }
        return r3;
    }

    public c(Class<?> class_, String ... arrstring) {
        super(class_);
        this.c = arrstring;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

