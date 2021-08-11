/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.ai;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ad
extends ai {
    @Override
    protected d e(G g10) {
        return this.m() ? net.minecraft.u.E.fL : net.minecraft.u.E.es;
    }

    @Override
    protected void k() {
        this.G = 0.22f + (float)this.g() * 0.05f;
        this.aA = true;
    }

    @Override
    protected void c() {
        this.cu *= 0.9f;
    }

    @Override
    protected boolean e() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected d o() {
        return this.m() ? net.minecraft.u.E.eG : net.minecraft.u.E.hA;
    }

    @Override
    protected int b() {
        return super.b() * 4;
    }

    @Override
    public boolean C() {
        return this.aG.g() != net.minecraft.ah.e.PEACEFUL;
    }

    @Override
    protected ai n() {
        return new ad(this.aG);
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    protected d a() {
        return net.minecraft.u.E.et;
    }

    public ad(z z2) {
        super(z2);
        this.al = true;
    }

    @Override
    protected void b(int n2, boolean bl2) {
        super.b(n2, bl2);
        this.a(net.minecraft.U.M.i).a((double)(n2 * 3));
    }

    @Override
    public float S() {
        return 1.0f;
    }

    @Override
    protected aH p() {
        return net.minecraft.ar.aH.FLAME;
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.2f);
    }

    @Override
    protected d aI() {
        return this.m() ? net.minecraft.u.E.hI : net.minecraft.u.E.hp;
    }

    @Override
    protected int f() {
        return super.f() + 2;
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    @Override
    @Nullable
    protected v D() {
        return this.m() ? net.minecraft.aj.j.av : net.minecraft.aj.j.T;
    }

    @Override
    protected void aH() {
        this.G = 0.42f + (float)this.g() * 0.1f;
        this.aA = true;
    }

    public static void c(b b10) {
        C.a(b10, ad.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean u() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.aG.a(this.m(), this);
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a((x)this, this.m()).isEmpty();
        }
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.aG.a(this.m());
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }
}

