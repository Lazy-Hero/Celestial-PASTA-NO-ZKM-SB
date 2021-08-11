/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.ak.h;
import net.minecraft.ak.p;

public class r
extends p {
    /* synthetic */ boolean i;
    /* synthetic */ int j;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        int n2 = this.i;
        if (string == null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.j;
        }
        if (string == null) {
            if (n2 <= 0) return 0 != 0;
            n2 = super.e() ? 1 : 0;
        }
        if (string != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void b() {
        --this.j;
        super.b();
    }

    @Override
    public void a() {
        this.j = 20;
        this.h.a(this.e.aG, this.c, true);
    }

    public r(C c10, boolean bl2) {
        super(c10);
        this.e = c10;
        this.i = bl2;
    }

    @Override
    public void g() {
        block3: {
            r r2;
            block2: {
                String string = net.minecraft.ak.h.h();
                r2 = this;
                if (string != null) break block2;
                if (!r2.i) break block3;
                r2 = this;
            }
            r2.h.a(this.e.aG, this.c, false);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

