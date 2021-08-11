/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.N.B;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.ar.v;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;

final class H
implements g {
    H() {
    }

    @Override
    public r a(c c10, r r2, int n2) {
        block3: {
            block2: {
                int n3 = j.c();
                if (n3 != 0) break block2;
                if (!y.a(B.class).equals(new v(r2.j("id")))) break block3;
                r2.a("id", "Control");
                c10.a(f.BLOCK_ENTITY, r2, n2);
            }
            r2.a("id", "MinecartCommandBlock");
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

