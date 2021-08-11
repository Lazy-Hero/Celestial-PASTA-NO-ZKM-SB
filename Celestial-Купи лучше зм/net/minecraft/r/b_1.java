/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class b
implements a {
    @Override
    public r a(r r2) {
        r r3;
        block2: {
            String string = m.b();
            while (r2.a("Riding", 10)) {
                r r4 = this.b(r2);
                this.a(r2, r4);
                r3 = r4;
                if (string == null) {
                    r2 = r3;
                    if (string == null) continue;
                }
                break block2;
            }
            r3 = r2;
        }
        return r3;
    }

    protected r b(r r2) {
        r r3 = r2.h("Riding");
        r2.k("Riding");
        return r3;
    }

    protected void a(r r2, r r3) {
        u u2 = new u();
        u2.a(r2);
        r3.a("Passengers", u2);
    }

    @Override
    public int a() {
        return 135;
    }
}

