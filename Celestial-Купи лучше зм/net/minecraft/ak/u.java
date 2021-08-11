/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import net.minecraft.D.l;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ak.aF;
import net.minecraft.ak.f;
import net.minecraft.ak.h;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.j.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u
extends h {
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ C c;
    private /* synthetic */ B g;
    private final /* synthetic */ Predicate<x> e;
    private final /* synthetic */ f d;

    @Override
    public void g() {
        this.c.d((B)null);
        super.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected double a() {
        b b10 = this.c.a(M.b);
        String string = h.h();
        b b11 = b10;
        if (string == null) {
            if (b11 == null) {
                return 16.0;
            }
            b11 = b10;
        }
        double d10 = b11.d();
        return d10;
    }

    @Override
    public boolean c() {
        double d10 = this.a();
        String string = h.h();
        List<x> list = this.c.aG.a(j.class, this.c.m().a(d10, 4.0, d10), this.e);
        Collections.sort(list, this.d);
        boolean bl2 = list.isEmpty();
        if (string == null) {
            if (bl2) {
                return false;
            }
            this.g = (B)list.get(0);
            bl2 = true;
        }
        return bl2;
    }

    static {
        f = LogManager.getLogger();
    }

    @Override
    public void a() {
        this.c.d(this.g);
        super.a();
    }

    static C a(u u2) {
        return u2.c;
    }

    public u(C c10) {
        String string = h.h();
        String string2 = string;
        this.c = c10;
        if (string2 == null) {
            if (c10 instanceof D) {
                f.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
            }
            this.e = new aF(this);
            this.d = new f(c10);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean e() {
        String string;
        B b10;
        block19: {
            l l2;
            l l3;
            block18: {
                block17: {
                    boolean bl2;
                    block16: {
                        b10 = this.c.J();
                        string = h.h();
                        B b11 = b10;
                        if (string == null) {
                            if (b11 == null) {
                                return false;
                            }
                            b11 = b10;
                        }
                        bl2 = b11.aL();
                        if (string == null) {
                            if (!bl2) {
                                return false;
                            }
                            bl2 = b10 instanceof j;
                        }
                        if (string != null) break block16;
                        if (!bl2) break block17;
                        bl2 = ((j)b10).cw.b;
                    }
                    if (string != null) return bl2;
                    if (bl2) {
                        return false;
                    }
                }
                l3 = this.c.aM();
                l l4 = b10.aM();
                l2 = l3;
                if (string != null) break block18;
                if (l2 == null) break block19;
                l2 = l4;
            }
            if (l2 == l3) {
                return false;
            }
        }
        double d10 = this.a();
        double d11 = this.c.s(b10) - d10 * d10;
        double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (string == null) {
            if (d12 > 0) {
                return false;
            }
            d12 = (double)(b10 instanceof k);
        }
        if (string != null) return (boolean)d12;
        if (d12 != false) {
            d12 = (double)((k)b10).c7.d();
            if (string != null) return (boolean)d12;
            if (d12 != false) {
                d12 = 0.0;
                return (boolean)d12;
            }
        }
        d12 = 1.0;
        return (boolean)d12;
    }
}

