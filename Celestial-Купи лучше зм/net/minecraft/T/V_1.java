/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import java.util.List;
import net.minecraft.T.S;
import net.minecraft.T.aC;
import net.minecraft.T.ao;
import net.minecraft.T.h;
import net.minecraft.ag.Q;
import net.minecraft.ah.z;
import net.minecraft.ar.d;
import net.minecraft.u.E;
import net.minecraft.w.bl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class V
extends S {
    final /* synthetic */ ao g;
    final /* synthetic */ Predicate<Q> h;

    @Override
    protected int a() {
        return 60;
    }

    @Override
    protected void e() {
        block3: {
            Q q2;
            block4: {
                int[] arrn;
                Q q3;
                block2: {
                    q3 = ao.d(this.g);
                    arrn = S.f();
                    q2 = q3;
                    if (arrn == null) break block2;
                    if (q2 == null) break block3;
                    q2 = q3;
                }
                if (arrn == null) break block4;
                if (!q2.aL()) break block3;
                q2 = q3;
            }
            q2.b(bl.RED);
        }
    }

    @Override
    protected d g() {
        return E.aK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int[] arrn = S.f();
        V v2 = this;
        if (arrn != null) {
            if (ao.d(v2.g) == null) return false;
            v2 = this;
        }
        boolean bl2 = v2.f;
        if (arrn == null) return bl2;
        if (bl2 <= false) return false;
        return true;
    }

    @Override
    public void g() {
        super.g();
        ao.a(this.g, null);
    }

    @Override
    protected int d() {
        return 140;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected aC b() {
        return aC.WOLOLO;
    }

    public V(ao ao2) {
        this.g = ao2;
        super(ao2);
        this.h = new h(this);
    }

    @Override
    public boolean c() {
        z z2;
        int[] arrn;
        block12: {
            int n2;
            block11: {
                arrn = S.f();
                ao ao2 = this.g;
                if (arrn != null) {
                    if (ao2.J() != null) {
                        return false;
                    }
                    ao2 = this.g;
                }
                n2 = ao2.f();
                if (arrn != null) {
                    if (n2 != 0) {
                        return false;
                    }
                    n2 = this.g.H;
                }
                if (arrn == null) break block11;
                if (n2 < this.e) {
                    return false;
                }
                z2 = this.g.aG;
                if (arrn == null) break block12;
                n2 = z2.M().c("mobGriefing") ? 1 : 0;
            }
            if (n2 == 0) {
                return false;
            }
            z2 = this.g.aG;
        }
        List<Q> list = z2.a(Q.class, this.g.m().a(16.0, 4.0, 16.0), this.h);
        boolean bl2 = list.isEmpty();
        if (arrn != null) {
            if (bl2) {
                return false;
            }
            ao.a(this.g, list.get(ao.e(this.g).nextInt(list.size())));
            bl2 = true;
        }
        return bl2;
    }

    @Override
    protected int c() {
        return 40;
    }
}

