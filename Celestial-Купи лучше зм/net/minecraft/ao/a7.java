/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.cZ;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class a7
extends aH {
    private /* synthetic */ boolean h;

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("Chest");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Chest", this.h);
    }

    public static a7 a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, aA2);
        return a7.a(b10) && u.a(list, b10) == null ? new a7(n5, random, b10, aA2) : null;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.a((aV)u2, list, random, 1, 1);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block10: {
            block9: {
                int n2;
                String[] arrstring = u.b();
                int n3 = this.a(z2, b10);
                if (arrstring != null) {
                    if (n3 != 0) {
                        return false;
                    }
                    this.a(z2, b10, 0, 0, 0, 4, 4, 6, true, random, b7.b());
                    this.a(z2, random, b10, this.g, 1, 1, 0);
                    this.a(z2, random, b10, ai.OPENING, 1, 1, 6);
                    this.a(z2, b10, 3, 1, 2, 3, 1, 4, net.minecraft.u.g.ay.d(), net.minecraft.u.g.ay.d(), false);
                    this.a(z2, net.minecraft.u.g.bO.c(cZ.SMOOTHBRICK.b()), 3, 1, 1, b10);
                    this.a(z2, net.minecraft.u.g.bO.c(cZ.SMOOTHBRICK.b()), 3, 1, 5, b10);
                    this.a(z2, net.minecraft.u.g.bO.c(cZ.SMOOTHBRICK.b()), 3, 2, 2, b10);
                    this.a(z2, net.minecraft.u.g.bO.c(cZ.SMOOTHBRICK.b()), 3, 2, 4, b10);
                    n3 = n2 = 2;
                }
                while (n2 <= 4) {
                    this.a(z2, net.minecraft.u.g.bO.c(cZ.SMOOTHBRICK.b()), 2, 1, n2, b10);
                    ++n2;
                    if (arrstring != null) {
                        if (arrstring != null) continue;
                    }
                    break block9;
                }
                bl2 = this.h;
                if (arrstring == null) break block10;
                if (bl2) break block9;
                bl2 = b10.a(new n(this.b(3, 3), this.a(2), this.a(3, 3)));
                if (arrstring == null) break block10;
                if (bl2) {
                    this.h = true;
                    this.a(z2, b10, random, 3, 2, 3, net.minecraft.aj.j.J);
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    public a7(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
    }

    public a7() {
    }
}

