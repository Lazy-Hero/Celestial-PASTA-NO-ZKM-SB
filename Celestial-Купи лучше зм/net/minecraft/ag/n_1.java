/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.A;
import net.minecraft.ag.G;
import net.minecraft.ag.V;
import net.minecraft.ak.m;

class n<T extends x>
extends m<T> {
    private final /* synthetic */ V n;
    final /* synthetic */ V m;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public n(V v2, V v3, Class class_, float f10, double d10, double d11) {
        this.m = v2;
        super(v3, class_, f10, d10, d11);
        this.n = v3;
    }

    @Override
    public void b() {
        this.m.d((B)null);
        super.b();
    }

    @Override
    public void a() {
        this.m.d((B)null);
        super.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String[] arrstring = A.b();
        boolean bl2 = super.c();
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = this.g instanceof G;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        boolean bl3 = this.n.U();
        if (arrstring != null) {
            if (bl3) return false;
            bl3 = this.a((G)this.g);
        }
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private boolean a(G g10) {
        String[] arrstring = A.b();
        int n2 = g10.J();
        if (arrstring != null) {
            n2 = n2 >= V.a(this.m).nextInt(5) ? 1 : 0;
        }
        return n2 != 0;
    }
}

