/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Random;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aX;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s
extends h {
    private final /* synthetic */ C d;
    private static final /* synthetic */ Predicate<i> f;
    private final /* synthetic */ z c;
    /* synthetic */ int e;

    @Override
    public void b() {
        block8: {
            s s2;
            block13: {
                z z2;
                n n2;
                block12: {
                    n n3;
                    String string;
                    block10: {
                        s s3;
                        block11: {
                            boolean bl2;
                            block9: {
                                this.e = Math.max(0, this.e - 1);
                                string = h.h();
                                if (this.e != 4) break block8;
                                n3 = new n(this.d.a, this.d.aF, this.d.ax);
                                bl2 = f.apply((Object)this.c.d(n3));
                                if (string != null) break block9;
                                if (!bl2) break block10;
                                s3 = this;
                                if (string != null) break block11;
                                bl2 = s3.c.M().c("mobGriefing");
                            }
                            if (bl2) {
                                this.c.a(n3, false);
                            }
                            s3 = this;
                        }
                        s3.d.ag();
                        if (string == null) break block8;
                    }
                    n2 = n3.k();
                    z2 = this.c;
                    if (string != null) break block12;
                    if (z2.d(n2).b() != g.aU) break block8;
                    s2 = this;
                    if (string != null) break block13;
                    z2 = s2.c;
                }
                if (z2.M().c("mobGriefing")) {
                    this.c.b(2001, n2, K.b(g.aU));
                    this.c.a(n2, g.bv.d(), 2);
                }
                s2 = this;
            }
            s2.d.ag();
        }
    }

    @Override
    public void a() {
        this.e = 40;
        this.c.a((x)this.d, (byte)10);
        this.d.l().f();
    }

    public int a() {
        return this.e;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.e;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public s(C c10) {
        this.d = c10;
        this.c = c10.aG;
        this.a(7);
    }

    static {
        f = net.minecraft.au.e.a(g.dc).a(aX.B, Predicates.equalTo((Object)net.minecraft.W.e.GRASS));
    }

    @Override
    public void g() {
        this.e = 0;
    }

    @Override
    public boolean c() {
        n n2;
        block10: {
            boolean bl2;
            block9: {
                String string;
                block8: {
                    boolean bl3;
                    block7: {
                        string = h.h();
                        Random random = this.d.f();
                        int n3 = this.d.Q();
                        if (string == null) {
                            n3 = n3 != 0 ? 50 : 1000;
                        }
                        bl3 = random.nextInt(n3);
                        if (string != null) break block7;
                        if (!bl3) break block8;
                        bl3 = false;
                    }
                    return bl3;
                }
                n2 = new n(this.d.a, this.d.aF, this.d.ax);
                bl2 = f.apply((Object)this.c.d(n2));
                if (string != null) break block9;
                if (!bl2) break block10;
                bl2 = true;
            }
            return bl2;
        }
        return this.c.d(n2.k()).b() == g.aU;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

