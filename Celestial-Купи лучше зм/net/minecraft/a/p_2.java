/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.W.D;
import net.minecraft.W.b2;
import net.minecraft.W.bR;
import net.minecraft.W.bc;
import net.minecraft.Z.i;
import net.minecraft.ag.L;
import net.minecraft.ag.S;
import net.minecraft.ag.U;
import net.minecraft.ah.z;
import net.minecraft.p.K;
import net.minecraft.p.Q;
import net.minecraft.p.R;
import net.minecraft.p.a;
import net.minecraft.p.g;
import net.minecraft.p.m;
import net.minecraft.p.n;

public class p
extends h {
    private static final /* synthetic */ i K;
    private static final /* synthetic */ i I;
    private static final /* synthetic */ i H;
    private final /* synthetic */ boolean J;

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public net.minecraft.p.b b(Random random) {
        net.minecraft.p.b b10;
        block9: {
            int n2;
            block8: {
                boolean bl2 = net.minecraft.A.b.f();
                n2 = random.nextInt(10);
                if (!bl2) {
                    if (n2 == 0) {
                        return r;
                    }
                    n2 = random.nextInt(2);
                }
                if (!bl2) {
                    if (n2 == 0) {
                        return new n(K, I);
                    }
                    n2 = this.J ? 1 : 0;
                }
                if (bl2) break block8;
                if (n2 != 0) break block9;
                n2 = random.nextInt(3);
            }
            if (n2 == 0) {
                b10 = new g(false, 10, 20, K, H);
                return b10;
            }
        }
        b10 = new m(false, 4 + random.nextInt(7), K, H, true);
        return b10;
    }

    static {
        K = net.minecraft.u.g.bu.d().a(bc.B, net.minecraft.W.D.JUNGLE);
        H = net.minecraft.u.g.bU.d().a(bR.D, net.minecraft.W.D.JUNGLE).a(b2.A, false);
        I = net.minecraft.u.g.bU.d().a(bR.D, net.minecraft.W.D.OAK).a(b2.A, false);
    }

    @Override
    public void a(z z2, Random random, net.minecraft.k.n n2) {
        boolean bl2 = net.minecraft.A.b.f();
        super.a(z2, random, n2);
        boolean bl3 = bl2;
        int n3 = random.nextInt(16) + 8;
        int n4 = random.nextInt(16) + 8;
        int n5 = random.nextInt(z2.C(n2.a(n3, 0, n4)).b() * 2);
        new K().a(z2, random, n2.a(n3, n5, n4));
        R r2 = new R();
        for (int i2 = 0; i2 < 50; ++i2) {
            n5 = random.nextInt(16) + 8;
            int n6 = 128;
            int n7 = random.nextInt(16) + 8;
            r2.a(z2, random, n2.a(n5, 128, n7));
            if (!bl3) continue;
        }
    }

    public p(boolean bl2, e e10) {
        boolean bl3;
        block7: {
            block5: {
                p p2;
                block6: {
                    boolean bl4 = net.minecraft.A.b.c();
                    super(e10);
                    bl3 = bl4;
                    p2 = this;
                    if (!bl3) break block5;
                    p2.J = bl2;
                    if (!bl2) break block6;
                    this.a.I = 2;
                    if (bl3) break block7;
                }
                p2 = this;
            }
            p2.a.I = 50;
        }
        this.a.G = 25;
        this.a.C = 4;
        boolean bl5 = bl2;
        if (bl3) {
            if (!bl5) {
                this.D.add(new d(S.class, 2, 1, 1));
            }
            this.j.add(new d(U.class, 40, 1, 2));
            bl5 = this.j.add(new d(L.class, 10, 4, 4));
        }
    }

    @Override
    public a a(Random random) {
        return random.nextInt(4) == 0 ? new Q(net.minecraft.W.e.FERN) : new Q(net.minecraft.W.e.GRASS);
    }
}

