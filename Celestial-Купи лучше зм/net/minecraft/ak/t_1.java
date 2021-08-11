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
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.ak.aG;
import net.minecraft.ak.f;
import net.minecraft.ak.h;
import net.minecraft.i.k;
import net.minecraft.j.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t
extends h {
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ Class<? extends B> d;
    private final /* synthetic */ C g;
    private /* synthetic */ B f;
    private final /* synthetic */ f e;
    private final /* synthetic */ Predicate<B> h;

    @Override
    public boolean c() {
        double d10 = this.a();
        String string = net.minecraft.ak.h.h();
        List<B> list = this.g.aG.a(this.d, this.g.m().a(d10, 4.0, d10), this.h);
        Collections.sort(list, this.e);
        boolean bl2 = list.isEmpty();
        if (string == null) {
            if (bl2) {
                return false;
            }
            this.f = list.get(0);
            bl2 = true;
        }
        return bl2;
    }

    static {
        c = LogManager.getLogger();
    }

    @Override
    public void a() {
        this.g.d(this.f);
        super.a();
    }

    static C a(t t2) {
        return t2.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.g.d((B)null);
        super.a();
    }

    public t(C c10, Class<? extends B> class_) {
        this.g = c10;
        String string = net.minecraft.ak.h.h();
        this.d = class_;
        if (string == null) {
            if (c10 instanceof D) {
                c.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
            }
            this.h = new aG(this);
            this.e = new f(c10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected double a() {
        b b10 = this.g.a(M.b);
        String string = net.minecraft.ak.h.h();
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean e() {
        B b10 = this.g.J();
        String string = net.minecraft.ak.h.h();
        B b11 = b10;
        if (string == null) {
            if (b11 == null) {
                return false;
            }
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (string != null) return bl2;
        if (!bl2) {
            return false;
        }
        double d10 = this.a();
        double d11 = this.g.s(b10) - d10 * d10;
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

