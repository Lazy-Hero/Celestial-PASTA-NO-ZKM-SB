/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.B;
import net.minecraft.J.j;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.h;
import net.minecraft.ar.v;
import net.minecraft.av.c;
import net.minecraft.av.f;
import net.minecraft.av.g;

final class b
implements g {
    @Override
    public r a(c c10, r r2, int n2) {
        block3: {
            String string;
            block2: {
                string = r2.j("id");
                int n3 = j.c();
                if (n3 != 0) break block2;
                if (!h.a(B.class).equals(new v(string))) break block3;
                r2.a("id", y.a(T.class).toString());
                c10.a(f.BLOCK_ENTITY, r2, n2);
            }
            r2.a("id", string);
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    b() {
    }
}

