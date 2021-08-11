/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.aC;
import net.minecraft.T.at;
import net.minecraft.ak.h;
import net.minecraft.ar.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class S
extends h {
    final /* synthetic */ at c;
    protected /* synthetic */ int e;
    protected /* synthetic */ int f;
    private static /* synthetic */ int[] d;

    static {
        if (S.f() == null) {
            S.b(new int[3]);
        }
    }

    protected abstract void e();

    @Nullable
    protected abstract d g();

    @Override
    public void a() {
        this.f = this.c();
        this.c.cA = this.a();
        int[] arrn = S.f();
        this.e = this.c.H + this.d();
        d d10 = this.g();
        if (arrn != null) {
            if (d10 != null) {
                this.c.a(d10, 1.0f, 1.0f);
            }
            this.c.a(this.b());
        }
    }

    @Override
    public boolean c() {
        int[] arrn = S.f();
        at at2 = this.c;
        if (arrn != null) {
            if (at2.J() == null) {
                return false;
            }
            at2 = this.c;
        }
        int n2 = at2.f();
        if (arrn != null) {
            if (n2 != 0) {
                return false;
            }
            n2 = this.c.H;
        }
        if (arrn != null) {
            n2 = n2 >= this.e ? 1 : 0;
        }
        return n2 != 0;
    }

    protected abstract int d();

    @Override
    public void b() {
        block3: {
            S s2;
            block2: {
                --this.f;
                int[] arrn = S.f();
                s2 = this;
                if (arrn == null) break block2;
                if (s2.f != 0) break block3;
                this.e();
                s2 = this;
            }
            s2.c.a(this.c.g(), 1.0f, 1.0f);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected abstract int a();

    public static void b(int[] arrn) {
        d = arrn;
    }

    protected int c() {
        return 20;
    }

    public static int[] f() {
        return d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int[] arrn = S.f();
        S s2 = this;
        if (arrn != null) {
            if (s2.c.J() == null) return false;
            s2 = this;
        }
        boolean bl2 = s2.f;
        if (arrn == null) return bl2;
        if (bl2 <= false) return false;
        return true;
    }

    protected abstract aC b();

    public S(at at2) {
        this.c = at2;
    }
}

