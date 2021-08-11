/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.P.r;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class q
implements a {
    @Override
    public int a() {
        return 700;
    }

    @Override
    public r a(r r2) {
        block5: {
            String string;
            r r3;
            block6: {
                boolean bl2;
                block4: {
                    String string2 = m.b();
                    bl2 = "Guardian".equals(r2.j("id"));
                    if (string2 != null) break block4;
                    if (!bl2) break block5;
                    r3 = r2;
                    string = "Elder";
                    if (string2 != null) break block6;
                    bl2 = r3.f(string);
                }
                if (bl2) {
                    r2.a("id", "ElderGuardian");
                }
                r3 = r2;
                string = "Elder";
            }
            r3.k(string);
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

