/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.cZ;
import net.minecraft.ah.z;
import net.minecraft.ao.aF;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.u.g;

public class aT
extends aH {
    private /* synthetic */ boolean h;

    public aT() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        boolean bl2 = this.a(z2, b10);
        if (arrstring != null) {
            if (bl2) {
                return false;
            }
            this.a(z2, b10, 0, 0, 0, 4, 10, 4, true, random, b7.b());
            this.a(z2, random, b10, this.g, 1, 7, 0);
            this.a(z2, random, b10, ai.OPENING, 1, 1, 4);
            this.a(z2, net.minecraft.u.g.ay.d(), 2, 6, 1, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 1, 5, 1, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 1, 6, 1, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 1, 5, 2, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 1, 4, 3, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 1, 5, 3, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 2, 4, 3, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 3, 3, 3, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 3, 4, 3, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 3, 3, 2, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 3, 2, 1, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 3, 3, 1, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 2, 2, 1, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 1, 1, 1, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 1, 2, 1, b10);
            this.a(z2, net.minecraft.u.g.ay.d(), 1, 1, 2, b10);
            this.a(z2, net.minecraft.u.g.bO.c(cZ.STONE.b()), 1, 1, 3, b10);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        String[] arrstring = u.b();
        u u3 = this;
        if (arrstring != null) {
            if (u3.h) {
                b7.a(aF.class);
            }
            u3 = this.a((aV)u2, list, random, 1, 1);
        }
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Source", this.h);
    }

    public aT(int n2, Random random, int n3, int n4) {
        block4: {
            block2: {
                aT aT2;
                block3: {
                    String[] arrstring = u.b();
                    super(n2);
                    this.h = true;
                    this.a(av.HORIZONTAL.a(random));
                    String[] arrstring2 = arrstring;
                    this.g = ai.OPENING;
                    aT2 = this;
                    if (arrstring2 == null) break block2;
                    if (aT2.e().g() != Q.Z) break block3;
                    this.e = new b(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
                    if (arrstring2 != null) break block4;
                }
                aT2 = this;
            }
            aT2.e = new b(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("Source");
    }

    public static aT a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, aA2);
        return aT.a(b10) && u.a(list, b10) == null ? new aT(n5, random, b10, aA2) : null;
    }

    public aT(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.h = false;
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
    }
}

