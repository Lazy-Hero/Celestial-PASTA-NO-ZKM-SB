/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.P.r;
import net.minecraft.U.M;
import net.minecraft.U.f;
import net.minecraft.U.x;

public class G
extends x {
    public final /* synthetic */ String aL;
    public final /* synthetic */ f aK;

    @Override
    protected void ab() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void f(r r2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(x x2) {
        int[] arrn = net.minecraft.U.M.b();
        G g10 = this;
        if (arrn != null) {
            if (g10 == x2) return true;
            g10 = this;
        }
        if (g10.aK != x2) return false;
        return true;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    protected void a(r r2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.a(g10);
        if (arrn != null) {
            if (bl2) return false;
            bl2 = this.aK.a(this, g10, f10);
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public G(f f10, String string, float f11, float f12) {
        super(f10.a());
        this.c(f11, f12);
        this.aK = f10;
        this.aL = string;
    }
}

