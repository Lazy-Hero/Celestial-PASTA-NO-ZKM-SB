/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ak;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.U.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.e.k;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.y.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I
extends h {
    private final /* synthetic */ List<d> h;
    private /* synthetic */ d d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ double f;
    private final /* synthetic */ D g;
    private /* synthetic */ net.minecraft.e.h c;

    private void c() {
        String string = net.minecraft.ak.h.h();
        Object object = this.h;
        if (string == null && object.size() > 15) {
            object = this.h.remove(0);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        v0 = net.minecraft.ak.h.h();
        this.c();
        var1_1 = v0;
        v1 = this;
        if (var1_1 != null) ** GOTO lbl13
        if (v1.e) {
            v2 = this.g.aG;
            if (var1_1 == null) {
                if (v2.R()) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = this;
lbl13:
            // 2 sources

            v2 = v1.g.aG;
        }
        var2_2 = v2.n().a(new n(this.g), 0);
        if (var1_1 == null) {
            if (var2_2 == null) {
                return false;
            }
            this.d = this.a(var2_2);
        }
        v3 = this;
        if (var1_1 == null) {
            if (v3.d == null) {
                return false;
            }
            v3 = this;
        }
        var3_3 = (k)v3.g.l();
        var4_4 = var3_3.c();
        var3_3.d(false);
        this.c = var3_3.b(this.d.i());
        var3_3.d(var4_4);
        v4 = this;
        if (var1_1 == null) {
            if (v4.c != null) {
                return true;
            }
            v4 = this;
        }
        var5_5 = net.minecraft.ak.g.b(v4.g, 10, 7, new l(this.d.i().e(), this.d.i().b(), this.d.i().a()));
        if (var1_1 == null) {
            if (var5_5 == null) {
                return false;
            }
            var3_3.d(false);
            this.c = this.g.l().a(var5_5.e, var5_5.d, var5_5.b);
            var3_3.d(var4_4);
        }
        if (this.c == null) return false;
        return true;
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        D d10 = this.g;
        if (string == null) {
            if (d10.l().o()) {
                return false;
            }
            d10 = this.g;
        }
        float f10 = d10.ad + 4.0f;
        double d11 = this.g.b(this.d.i()) - (double)(f10 * f10);
        double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
        if (string == null) {
            d12 = d12 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    @Override
    public void g() {
        block2: {
            int n2;
            block3: {
                String string = net.minecraft.ak.h.h();
                n2 = this.g.l().o();
                if (string != null) break block2;
                if (n2 != 0) break block3;
                double d10 = this.g.b(this.d.i()) - 16.0;
                n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                if (string != null || n2 >= 0) break block2;
            }
            n2 = this.h.add(this.d);
        }
    }

    @Override
    public void a() {
        this.g.l().a(this.c, this.f);
    }

    private d a(net.minecraft.y.g g10) {
        d d10;
        block5: {
            d d11 = null;
            int n2 = Integer.MAX_VALUE;
            Iterator<d> iterator = g10.e().iterator();
            String string = net.minecraft.ak.h.h();
            while (iterator.hasNext()) {
                block7: {
                    int n3;
                    int n4;
                    d d12;
                    block6: {
                        d10 = d12 = iterator.next();
                        if (string != null) break block5;
                        n3 = n4 = d10.a(net.minecraft.k.h.f(this.g.a), net.minecraft.k.h.f(this.g.aF), net.minecraft.k.h.f(this.g.ax));
                        if (string != null) break block6;
                        if (n3 >= n2) break block7;
                        n3 = this.a(d12) ? 1 : 0;
                    }
                    if (string == null && n3 == 0) {
                        d11 = d12;
                        n3 = n2 = n4;
                    }
                }
                if (string == null) continue;
            }
            d10 = d11;
        }
        return d10;
    }

    public I(D d10, double d11, boolean bl2) {
        this.h = Lists.newArrayList();
        this.g = d10;
        this.f = d11;
        this.e = bl2;
        this.a(1);
        if (!(d10.l() instanceof k)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private boolean a(d d10) {
        boolean bl2;
        block3: {
            Iterator<d> iterator = this.h.iterator();
            String string = net.minecraft.ak.h.h();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        d d11 = iterator.next();
                        bl2 = d10.i().equals(d11.i());
                        if (string != null) break block3;
                        if (string != null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }
}

