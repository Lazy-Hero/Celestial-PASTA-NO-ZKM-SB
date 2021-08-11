/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.Q;
import net.minecraft.T.S;
import net.minecraft.T.aa;
import net.minecraft.T.ao;

class R
extends Q {
    final /* synthetic */ ao d;

    private static gP a(gP gP2) {
        return gP2;
    }

    private R(ao ao2) {
        this.d = ao2;
        super(ao2);
    }

    R(ao ao2, aa aa2) {
        this(ao2);
    }

    @Override
    public void b() {
        block4: {
            ao ao2;
            block5: {
                int[] arrn;
                block2: {
                    block3: {
                        arrn = S.f();
                        ao2 = this.d;
                        if (arrn == null) break block2;
                        if (ao2.J() == null) break block3;
                        this.d.I().a(this.d.J(), (float)this.d.p(), (float)this.d.j());
                        if (arrn != null) break block4;
                    }
                    ao2 = this.d;
                }
                if (arrn == null) break block5;
                if (ao.d(ao2) == null) break block4;
                ao2 = this.d;
            }
            ao2.I().a(ao.d(this.d), (float)this.d.p(), (float)this.d.j());
        }
    }
}

