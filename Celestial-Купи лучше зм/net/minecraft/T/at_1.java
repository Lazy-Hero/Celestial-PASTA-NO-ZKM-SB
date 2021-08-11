/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.a9;
import net.minecraft.T.aC;
import net.minecraft.T.aG;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.e.i;
import net.minecraft.k.h;
import net.minecraft.q.m;
import net.minecraft.q.r;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class at
extends aG {
    protected /* synthetic */ int cA;
    private /* synthetic */ aC cy;
    private static final /* synthetic */ r<Byte> cz;

    @Override
    public void f(net.minecraft.P.r r2) {
        super.f(r2);
        r2.b("SpellTicks", this.cA);
    }

    protected int a() {
        return this.cA;
    }

    public boolean f() {
        int[] arrn = net.minecraft.T.S.f();
        int n2 = this.aG.C;
        if (arrn != null) {
            if (n2 != 0) {
                boolean bl2 = this.ap.b(cz).byteValue();
                if (arrn != null) {
                    bl2 = bl2 > false;
                }
                return bl2;
            }
            n2 = this.cA;
        }
        if (arrn != null) {
            n2 = n2 > 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cz, (byte)0);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected aC h() {
        aC aC2;
        int[] arrn = net.minecraft.T.S.f();
        int n2 = this.aG.C;
        if (arrn != null) {
            if (n2 == 0) {
                aC2 = this.cy;
                return aC2;
            }
            n2 = this.ap.b(cz).byteValue();
        }
        aC2 = aC.a(n2);
        return aC2;
    }

    private static gP d(gP gP2) {
        return gP2;
    }

    @Override
    public void ae() {
        block3: {
            at at2;
            block4: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.T.S.f();
                    super.ae();
                    int[] arrn2 = arrn;
                    bl2 = this.aG.C;
                    if (arrn2 == null) break block2;
                    if (!bl2) break block3;
                    at2 = this;
                    if (arrn2 == null) break block4;
                    bl2 = at2.f();
                }
                if (!bl2) break block3;
                at2 = this;
            }
            aC aC2 = at2.h();
            double d10 = aC.b(aC2)[0];
            double d11 = aC.b(aC2)[1];
            double d12 = aC.b(aC2)[2];
            float f10 = this.bf * ((float)Math.PI / 180) + h.c((float)this.H * 0.6662f) * 0.25f;
            float f11 = h.c(f10);
            float f12 = h.g(f10);
            this.aG.a(net.minecraft.ar.aH.SPELL_MOB, this.a + (double)f11 * 0.6, this.aF + 1.8, this.ax + (double)f12 * 0.6, d10, d11, d12, new int[0]);
            this.aG.a(net.minecraft.ar.aH.SPELL_MOB, this.a - (double)f11 * 0.6, this.aF + 1.8, this.ax - (double)f12 * 0.6, d10, d11, d12, new int[0]);
        }
    }

    public void a(aC aC2) {
        this.cy = aC2;
        this.ap.b(cz, (byte)aC.a(aC2));
    }

    static i a(at at2) {
        return at2.b7;
    }

    @Override
    public a9 a() {
        return this.f() ? net.minecraft.T.a9.SPELLCASTING : net.minecraft.T.a9.CROSSED;
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        super.a(r2);
        this.cA = r2.m("SpellTicks");
    }

    static {
        cz = net.minecraft.q.m.a(at.class, net.minecraft.q.h.m);
    }

    @Override
    protected void h() {
        block3: {
            at at2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.h();
                int[] arrn2 = arrn;
                at2 = this;
                if (arrn2 == null) break block2;
                if (at2.cA <= 0) break block3;
                at2 = this;
            }
            --at2.cA;
        }
    }

    public at(z z2) {
        super(z2);
        this.cy = aC.NONE;
    }

    protected abstract d g();
}

