/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.util.List;
import net.minecraft.ar.aC;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aK;
import net.minecraft.client.a.v;
import net.minecraft.client.k.s;
import net.minecraft.client.k.t;

public class ar
extends aK {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(aC aC2) {
        block10: {
            block8: {
                List list;
                String string;
                block11: {
                    int n2;
                    block9: {
                        string = I.j();
                        n2 = this.d;
                        if (string != null) break block9;
                        if (n2 == 0) break block10;
                        list = this.b;
                        if (string != null) break block11;
                        n2 = list.size();
                    }
                    if (n2 == 0) {
                        return;
                    }
                    list = this.b;
                }
                for (s s2 : list) {
                    t t2 = (t)s2;
                    v.M();
                    this.a(s2);
                    v.s(t2.a(aC2, t2.b()));
                    v.B();
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block8;
                }
                if (fU.aR()) {
                    v.K();
                }
                v.p();
            }
            this.b.clear();
        }
    }
}

