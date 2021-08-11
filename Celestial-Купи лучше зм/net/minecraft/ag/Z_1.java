/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.U.C;
import net.minecraft.ag.A;
import net.minecraft.ag.u;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.i.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Z
extends C
implements u {
    public Z(z z2) {
        super(z2);
    }

    @Override
    public int X() {
        return 120;
    }

    @Override
    public boolean X() {
        return true;
    }

    @Override
    protected boolean k() {
        return true;
    }

    @Override
    protected int a(j j2) {
        return 1 + this.aG.J.nextInt(3);
    }

    @Override
    public boolean u() {
        return this.aG.a(this.m(), this);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public boolean ah() {
        return false;
    }

    @Override
    public void a0() {
        block5: {
            Z z2;
            block2: {
                block3: {
                    String[] arrstring;
                    block4: {
                        String[] arrstring2 = net.minecraft.ag.A.b();
                        int n2 = this.P();
                        super.a0();
                        arrstring = arrstring2;
                        z2 = this;
                        if (arrstring == null) break block2;
                        if (!z2.aL()) break block3;
                        z2 = this;
                        if (arrstring == null) break block2;
                        if (z2.aj()) break block3;
                        this.i(--n2);
                        int n3 = this.P();
                        if (arrstring == null) break block4;
                        if (n3 != -20) break block5;
                        this.i(0);
                        n3 = this.a(net.minecraft.ar.G.u, 2.0f) ? 1 : 0;
                    }
                    if (arrstring != null) break block5;
                }
                z2 = this;
            }
            z2.i(300);
        }
    }

    @Override
    public boolean C() {
        return true;
    }
}

