/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.P.r;
import net.minecraft.ag.A;
import net.minecraft.ag.R;
import net.minecraft.ah.z;
import net.minecraft.i.j;

public abstract class T
extends R {
    private /* synthetic */ int cK;

    private static gP b(gP gP2) {
        return gP2;
    }

    public boolean c(j j2) {
        r r2 = new r();
        String[] arrstring = net.minecraft.ag.A.b();
        r2.a("id", this.w());
        String[] arrstring2 = arrstring;
        this.b(r2);
        boolean bl2 = j2.f(r2);
        if (arrstring2 != null) {
            if (bl2) {
                this.aG.c(this);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void ae() {
        ++this.cK;
        super.ae();
    }

    public boolean b() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.cK;
        if (arrstring != null) {
            bl2 = bl2 > BADBOOL 100;
        }
        return bl2;
    }

    public T(z z2) {
        super(z2);
    }
}

