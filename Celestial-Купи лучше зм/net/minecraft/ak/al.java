/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.ak;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.ak.h;
import net.minecraft.i.j;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class al
extends h {
    private /* synthetic */ double m;
    private /* synthetic */ int h;
    private final /* synthetic */ double i;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ Set<k> j;
    private /* synthetic */ boolean d;
    private final /* synthetic */ D n;
    private /* synthetic */ double f;
    private /* synthetic */ double l;
    private /* synthetic */ j c;
    private /* synthetic */ double g;
    private /* synthetic */ double k;

    @Override
    public boolean e() {
        boolean bl2;
        block4: {
            block5: {
                block10: {
                    al al2;
                    block11: {
                        block6: {
                            al al3;
                            block7: {
                                double d10;
                                block8: {
                                    block9: {
                                        String string = net.minecraft.ak.h.h();
                                        bl2 = this.e;
                                        if (string != null) break block4;
                                        if (!bl2) break block5;
                                        al3 = this;
                                        if (string != null) break block6;
                                        if (!(al3.n.s(this.c) < 36.0)) break block7;
                                        double d11 = this.c.a(this.l, this.g, this.k) - 0.010000000000000002;
                                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                        if (string == null) {
                                            if (d10 > 0) {
                                                return false;
                                            }
                                            double d12 = Math.abs((double)this.c.at - this.f) - 5.0;
                                            d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                                        }
                                        if (string != null) break block8;
                                        if (d10 > 0) break block9;
                                        al2 = this;
                                        if (string != null) break block10;
                                        if (!(Math.abs((double)al2.c.e - this.m) > 5.0)) break block11;
                                    }
                                    d10 = 0.0;
                                }
                                return (boolean)d10;
                            }
                            this.l = this.c.a;
                            this.g = this.c.aF;
                            al3 = this;
                        }
                        al3.k = this.c.ax;
                    }
                    this.f = this.c.at;
                    al2 = this;
                }
                al2.m = this.c.e;
            }
            bl2 = this.c();
        }
        return bl2;
    }

    @Override
    public void b() {
        block2: {
            double d10;
            block3: {
                String string = net.minecraft.ak.h.h();
                this.n.I().a(this.c, (float)(this.n.p() + 20), (float)this.n.j());
                String string2 = string;
                double d11 = this.n.s(this.c) - 6.25;
                d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                if (string2 != null) break block2;
                if (d10 >= 0) break block3;
                this.n.l().f();
                if (string2 == null) break block2;
            }
            d10 = (double)this.n.l().a(this.c, this.i);
        }
    }

    public al(D d10, double d11, k k2, boolean bl2) {
        this(d10, d11, bl2, Sets.newHashSet((Object[])new k[]{k2}));
    }

    protected boolean a(d d10) {
        return this.j.contains(d10.w());
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void g() {
        this.c = null;
        this.n.l().f();
        this.h = 100;
        this.d = false;
    }

    @Override
    public void a() {
        this.l = this.c.a;
        this.g = this.c.aF;
        this.k = this.c.ax;
        this.d = true;
    }

    public al(D d10, double d11, boolean bl2, Set<k> set) {
        this.n = d10;
        this.i = d11;
        this.j = set;
        this.e = bl2;
        this.a(3);
        if (!(d10.l() instanceof net.minecraft.e.k)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }

    public boolean a() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        al al2 = this;
        if (string == null) {
            if (al2.h > 0) {
                --this.h;
                return false;
            }
            this.c = this.n.aG.a((x)this.n, 10.0);
            al2 = this;
        }
        if (string == null) {
            if (al2.c == null) {
                return false;
            }
            al2 = this;
        }
        boolean bl2 = al2.a(this.c.av());
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = this.a(this.c.b());
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

