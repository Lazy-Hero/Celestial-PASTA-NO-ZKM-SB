/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.H;

import javax.annotation.Nullable;
import net.minecraft.ah.s;
import net.minecraft.ar.A;
import net.minecraft.ar.a6;
import net.minecraft.at.k;
import net.minecraft.client.E.h;
import net.minecraft.client.E.l;
import net.minecraft.client.H.e;
import net.minecraft.client.H.f;
import net.minecraft.client.Q;
import net.minecraft.k.i;
import net.minecraft.k.n;

public class d {
    @Nullable
    private /* synthetic */ e c;
    private static /* synthetic */ boolean b;
    private final /* synthetic */ Q d;

    public static boolean f() {
        return b;
    }

    public void a(l l2, n n2, net.minecraft.Z.i i2, float f10) {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.f();
                e10 = this.c;
                if (bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a(l2, n2, i2, f10);
        }
    }

    static {
        if (net.minecraft.client.H.d.f()) {
            net.minecraft.client.H.d.b(true);
        }
    }

    public Q d() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public s g() {
        s s2;
        boolean bl2 = net.minecraft.client.H.d.a();
        h h2 = this.d.aW;
        if (bl2) {
            if (h2 == null) {
                s2 = s.NOT_SET;
                return s2;
            }
            h2 = this.d.aW;
        }
        s2 = h2.i();
        return s2;
    }

    public static boolean a() {
        boolean bl2 = net.minecraft.client.H.d.f();
        return !bl2;
    }

    public void a(a6 a62) {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                e10 = this.c;
                if (!bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a(a62);
        }
    }

    public void a(f f10) {
        block3: {
            e e10;
            block2: {
                this.d.ac.bB = f10;
                boolean bl2 = net.minecraft.client.H.d.f();
                this.d.ac.e();
                boolean bl3 = bl2;
                e10 = this.c;
                if (bl3) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a();
            this.c = f10.a(this);
        }
    }

    public void e() {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                e10 = this.c;
                if (!bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.c();
        }
    }

    public void a(A a10) {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                e10 = this.c;
                if (!bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a(a10);
        }
    }

    public static k a(String string) {
        net.minecraft.at.d d10 = new net.minecraft.at.d("key." + string);
        d10.e().a(true);
        return d10;
    }

    public d(Q q2) {
        this.d = q2;
    }

    public void b() {
        boolean bl2 = net.minecraft.client.H.d.a();
        d d10 = this;
        if (bl2) {
            if (d10.c != null) {
                this.c();
            }
            d10 = this;
        }
        d10.c = this.d.ac.bB.a(this);
    }

    public void c() {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.f();
                e10 = this.c;
                if (bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a();
            this.c = null;
        }
    }

    public void a(net.minecraft.w.d d10) {
        block3: {
            e e10;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.f();
                e10 = this.c;
                if (bl2) break block2;
                if (e10 == null) break block3;
                e10 = this.c;
            }
            e10.a(d10);
        }
    }

    public void a(@Nullable l l2, @Nullable i i2) {
        block0: {
            if (this.c == null || i2 == null || l2 == null) break block0;
            this.c.a(l2, i2);
        }
    }

    public void h() {
        block6: {
            d d10;
            block7: {
                boolean bl2;
                block2: {
                    block3: {
                        d d11;
                        block4: {
                            block5: {
                                bl2 = net.minecraft.client.H.d.a();
                                d10 = this;
                                if (!bl2) break block2;
                                if (d10.c == null) break block3;
                                d11 = this;
                                if (!bl2) break block4;
                                if (d11.d.e == null) break block5;
                                this.c.b();
                                if (bl2) break block6;
                            }
                            d11 = this;
                        }
                        d11.c();
                        if (bl2) break block6;
                    }
                    d10 = this;
                }
                if (!bl2) break block7;
                if (d10.d.e == null) break block6;
                d10 = this;
            }
            d10.b();
        }
    }
}

