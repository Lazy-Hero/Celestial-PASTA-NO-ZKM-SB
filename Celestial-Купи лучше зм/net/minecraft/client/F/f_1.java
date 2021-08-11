/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.f.a;
import net.minecraft.client.f.b;
import net.minecraft.client.f.c;
import net.minecraft.client.f.d;
import net.minecraft.client.f.e;
import net.minecraft.client.f.g;
import net.minecraft.client.f.h;
import net.minecraft.client.f.i;
import net.minecraft.client.r.a4;

public class f {
    private /* synthetic */ boolean m;
    private static /* synthetic */ int h;
    public final /* synthetic */ g o;
    private /* synthetic */ boolean a;
    private /* synthetic */ boolean d;
    public final /* synthetic */ g k;
    private /* synthetic */ boolean i;
    public final /* synthetic */ g c;
    public final /* synthetic */ g g;
    private /* synthetic */ boolean b;
    public final /* synthetic */ g l;
    private /* synthetic */ boolean e;
    private /* synthetic */ boolean n;
    public final /* synthetic */ g j;
    public final /* synthetic */ g f;

    public static void a(String string, double d10, double d11, double d12, float f10, int n2) {
        block5: {
            Q q2;
            int n3;
            Q q3;
            block7: {
                a4 a42;
                block6: {
                    Q q4;
                    block4: {
                        q3 = Q.P();
                        n3 = net.minecraft.client.f.f.b();
                        q4 = q3;
                        if (n3 != 0) break block4;
                        if (q4.s == null) break block5;
                        q4 = q3;
                    }
                    a42 = q4.aQ();
                    if (n3 != 0) break block6;
                    if (a42 == null) break block5;
                    q2 = q3;
                    if (n3 != 0) break block7;
                    a42 = q2.aQ();
                }
                if (a42.q == null) break block5;
                q2 = q3;
            }
            a5 a52 = q2.a6;
            net.minecraft.client.q.c c10 = q3.s;
            double d13 = c10.am + (c10.a - c10.am) * (double)f10;
            double d14 = c10.af + (c10.aF - c10.af) * (double)f10;
            double d15 = c10.n + (c10.ax - c10.n) * (double)f10;
            v.M();
            v.b((float)(d10 - d13), (float)(d11 - d14) + 0.07f, (float)(d12 - d15));
            v.a(0.0f, 1.0f, 0.0f);
            v.d(0.02f, -0.02f, 0.02f);
            a4 a43 = q3.aQ();
            v.a(-a43.f, 0.0f, 1.0f, 0.0f);
            int n4 = a43.q.L;
            if (n3 == 0) {
                n4 = n4 == 2 ? 1 : -1;
            }
            v.a((float)n4 * a43.a, 1.0f, 0.0f, 0.0f);
            v.y();
            v.x();
            v.t();
            v.a(true);
            v.d(-1.0f, 1.0f, 1.0f);
            a52.b(string, -a52.e(string) / 2, 0.0f, n2);
            v.j();
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            v.B();
        }
    }

    static {
        if (net.minecraft.client.f.f.b() != 0) {
            net.minecraft.client.f.f.b(65);
        }
    }

    public f(Q q2) {
        this.k = new h(q2);
        this.j = new b(q2);
        this.l = new c(q2);
        this.o = new a(q2);
        this.c = new d(q2);
        this.f = new i(q2);
        this.g = new e(q2);
    }

    public static int c() {
        int n2 = net.minecraft.client.f.f.b();
        if (n2 == 0) {
            return 92;
        }
        return 0;
    }

    public static int b() {
        return h;
    }

    public boolean e() {
        int n2 = net.minecraft.client.f.f.c();
        boolean bl2 = this.d;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        this.d = bl2;
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d() {
        int n2 = net.minecraft.client.f.f.b();
        boolean bl2 = this.d;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.b;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.n;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.e;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.m;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.a;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.i;
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void b(int n2) {
        h = n2;
    }

    public void a(float f10, long l2) {
        block20: {
            f f11;
            block19: {
                boolean bl2;
                block18: {
                    int n2;
                    block16: {
                        block17: {
                            n2 = net.minecraft.client.f.f.b();
                            bl2 = this.b;
                            if (n2 == 0) {
                                if (bl2) {
                                    this.k.a(f10, l2);
                                }
                                bl2 = this.d;
                            }
                            if (n2 != 0) break block16;
                            if (!bl2) break block17;
                            bl2 = Q.P().E();
                            if (n2 != 0) break block16;
                            if (!bl2) {
                                this.l.a(f10, l2);
                            }
                        }
                        bl2 = this.n;
                    }
                    if (n2 == 0) {
                        if (bl2) {
                            this.j.a(f10, l2);
                        }
                        bl2 = this.e;
                    }
                    if (n2 == 0) {
                        if (bl2) {
                            this.o.a(f10, l2);
                        }
                        bl2 = this.m;
                    }
                    if (n2 == 0) {
                        if (bl2) {
                            this.c.a(f10, l2);
                        }
                        bl2 = this.a;
                    }
                    if (n2 != 0) break block18;
                    if (bl2) {
                        this.f.a(f10, l2);
                    }
                    f11 = this;
                    if (n2 != 0) break block19;
                    bl2 = f11.i;
                }
                if (!bl2) break block20;
                f11 = this;
            }
            f11.g.a(f10, l2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(String string, int n2, int n3, int n4, float f10, int n5) {
        net.minecraft.client.f.f.a(string, (double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, f10, n5);
    }
}

