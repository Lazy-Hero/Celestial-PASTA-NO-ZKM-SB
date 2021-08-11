/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.cV;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class ak
extends aH {
    private /* synthetic */ boolean h;
    private /* synthetic */ boolean i;

    public ak() {
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        block6: {
            u u3;
            boolean bl2;
            block5: {
                String[] arrstring = u.b();
                this.a((aV)u2, list, random, 1, 1);
                String[] arrstring2 = arrstring;
                bl2 = this.h;
                if (arrstring2 == null) break block5;
                if (bl2) {
                    this.c((aV)u2, list, random, 1, 2);
                }
                u3 = this;
                if (arrstring2 == null) break block6;
                bl2 = u3.i;
            }
            if (bl2) {
                u3 = this.b((aV)u2, list, random, 1, 2);
            }
        }
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        ak ak2 = this;
        z z3 = z2;
        b b11 = b10;
        if (arrstring != null) {
            if (ak2.a(z3, b11)) {
                return false;
            }
            ak2 = this;
            z3 = z2;
            b11 = b10;
        }
        ak2.a(z3, b11, 0, 0, 0, 4, 4, 6, true, random, b7.b());
        this.a(z2, random, b10, this.g, 1, 1, 0);
        this.a(z2, random, b10, ai.OPENING, 1, 1, 6);
        i i2 = net.minecraft.u.g.h.d().a(cV.z, aA.EAST);
        i i3 = net.minecraft.u.g.h.d().a(cV.z, aA.WEST);
        this.a(z2, b10, random, 0.1f, 1, 2, 1, i2);
        this.a(z2, b10, random, 0.1f, 3, 2, 1, i3);
        this.a(z2, b10, random, 0.1f, 1, 2, 5, i2);
        this.a(z2, b10, random, 0.1f, 3, 2, 5, i3);
        boolean bl2 = this.h;
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 1, 2, 0, 3, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            bl2 = this.i;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 4, 1, 2, 4, 3, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            bl2 = true;
        }
        return bl2;
    }

    public ak(int n2, Random random, b b10, aA aA2) {
        String[] arrstring = u.b();
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
        String[] arrstring2 = arrstring;
        int n3 = random.nextInt(2);
        if (arrstring2 != null) {
            n3 = n3 == 0 ? 1 : 0;
        }
        this.h = n3;
        int n4 = random.nextInt(2);
        if (arrstring2 != null) {
            n4 = n4 == 0 ? 1 : 0;
        }
        this.i = n4;
    }

    public static ak a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, aA2);
        return ak.a(b10) && u.a(list, b10) == null ? new ak(n5, random, b10, aA2) : null;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Left", this.h);
        r2.a("Right", this.i);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("Left");
        this.i = r2.f("Right");
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

