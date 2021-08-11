/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.D;
import net.minecraft.ak.h;
import net.minecraft.e.k;
import net.minecraft.k.n;
import net.minecraft.y.d;
import net.minecraft.y.g;

public class R
extends h {
    private /* synthetic */ d c;
    private final /* synthetic */ D d;

    @Override
    public void b() {
        this.c.h();
    }

    @Override
    public boolean c() {
        double d10;
        String string;
        block9: {
            boolean bl2;
            block8: {
                string = h.h();
                bl2 = this.d.aG.R();
                if (string != null) break block8;
                if (!bl2) break block9;
                bl2 = false;
            }
            return bl2;
        }
        n n2 = new n(this.d);
        g g10 = this.d.aG.n().a(n2, 16);
        if (string == null) {
            if (g10 == null) {
                return false;
            }
            this.c = g10.a(n2);
        }
        d d11 = this.c;
        if (string == null) {
            if (d11 == null) {
                return false;
            }
            d11 = this.c;
        }
        double d12 = (d10 = (double)d11.c(n2) - 2.25) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (string == null) {
            d12 = d12 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    @Override
    public void g() {
        ((k)this.d.l()).d(true);
        ((k)this.d.l()).c(true);
        this.c = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.d.aG.R();
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = this.c.a();
        }
        if (string == null) {
            if (bl2) return false;
            bl2 = this.c.b(new n(this.d));
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void a() {
        ((k)this.d.l()).d(false);
        ((k)this.d.l()).c(false);
    }

    public R(D d10) {
        this.d = d10;
        if (!(d10.l() instanceof k)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

