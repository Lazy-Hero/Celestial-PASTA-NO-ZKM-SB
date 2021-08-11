/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import java.util.Collections;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.X;
import net.minecraft.ak.aT;
import net.minecraft.ak.aV;
import net.minecraft.ak.f;
import net.minecraft.ak.h;
import net.minecraft.i.j;
import net.minecraft.k.k;

public class au<T extends B>
extends X {
    protected final /* synthetic */ f m;
    protected /* synthetic */ T l;
    protected final /* synthetic */ Predicate<? super T> n;
    private final /* synthetic */ int o;
    protected final /* synthetic */ Class<T> k;

    public au(D d10, Class<T> class_, boolean bl2) {
        this(d10, class_, bl2, false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected k a(double d10) {
        return this.e.m().a(d10, 4.0, d10);
    }

    public au(D d10, Class<T> class_, boolean bl2, boolean bl3) {
        this(d10, class_, 10, bl2, bl3, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        var1_1 = net.minecraft.ak.h.h();
        v0 = this;
        if (var1_1 == null) {
            if (v0.o > 0) {
                v0 = this;
                if (var1_1 == null) {
                    if (v0.e.f().nextInt(this.o) != 0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this;
            }
        }
        if (var1_1 == null) {
            if (v0.k != j.class) {
                v0 = this;
                if (var1_1 == null) {
                    if (v0.k != net.minecraft.i.k.class) {
                        var2_2 = this.e.aG.a(this.k, this.a(this.a()), this.n);
                        v1 = var2_2.isEmpty();
                        if (var1_1 != null) return v1;
                        if (v1) {
                            return false;
                        }
                        Collections.sort(var2_2, this.m);
                        this.l = (B)var2_2.get(0);
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                this.l = this.e.aG.a(this.e.a, this.e.aF + (double)this.e.l(), this.e.ax, this.a(), this.a(), new aT(this), this.n);
                v0 = this;
            }
        }
        if (v0.l == null) return false;
        return true;
    }

    @Override
    public void a() {
        this.e.d((B)this.l);
        super.a();
    }

    public au(D d10, Class<T> class_, int n2, boolean bl2, boolean bl3, @Nullable Predicate<? super T> predicate) {
        super(d10, bl2, bl3);
        this.k = class_;
        this.o = n2;
        this.m = new f(d10);
        this.a(1);
        this.n = new aV(this, predicate);
    }
}

