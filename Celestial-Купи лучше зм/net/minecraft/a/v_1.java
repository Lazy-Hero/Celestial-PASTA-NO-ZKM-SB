/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.W.d2;
import net.minecraft.ag.F;
import net.minecraft.ag.G;
import net.minecraft.ag.I;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.i;

public class v
extends h {
    private static final /* synthetic */ i H;

    static {
        H = new i(false);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected v(e e10) {
        boolean bl2 = net.minecraft.A.b.c();
        super(e10);
        boolean bl3 = bl2;
        this.j.add(new d(I.class, 1, 2, 6));
        this.j.add(new d(F.class, 1, 1, 1));
        v v2 = this;
        if (bl3) {
            if (v2.e() > 1.1f) {
                this.j.add(new d(G.class, 8, 4, 4));
            }
            this.a.I = 1;
            this.a.C = 4;
            v2 = this;
        }
        v2.a.G = 20;
    }

    @Override
    public Class<? extends h> i() {
        return v.class;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return random.nextInt(5) > 0 ? H : C;
    }

    @Override
    public void a(z z2, Random random, n n2) {
        block2: {
            boolean bl2 = net.minecraft.A.b.c();
            h.a(d2.GRASS);
            boolean bl3 = bl2;
            for (int i2 = 0; i2 < 7; ++i2) {
                int n3 = random.nextInt(16) + 8;
                int n4 = random.nextInt(16) + 8;
                int n5 = random.nextInt(z2.C(n2.a(n3, 0, n4)).b() + 32);
                h.a(z2, random, n2.a(n3, n5, n4));
                if (bl3) {
                    if (bl3) continue;
                }
                break block2;
            }
            super.a(z2, random, n2);
        }
    }
}

