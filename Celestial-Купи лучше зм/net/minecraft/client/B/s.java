/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.b;

import java.awt.Color;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.e.C;
import net.minecraft.client.e.y;
import net.minecraft.u.E;
import org.lwjgl.input.Mouse;

public class s
extends q {
    public static /* synthetic */ l k;
    public /* synthetic */ String m;
    public /* synthetic */ boolean h;
    protected /* synthetic */ boolean a;
    public /* synthetic */ int o;
    protected /* synthetic */ int i;
    private /* synthetic */ int q;
    protected static final /* synthetic */ v j;
    protected /* synthetic */ int n;
    private static /* synthetic */ boolean p;
    public /* synthetic */ int g;
    public /* synthetic */ int r;
    public /* synthetic */ boolean l;

    private static gP d(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n4 = this.h;
        if (arrstring != null) {
            if (n4 == 0) return 0 != 0;
            n4 = this.l;
        }
        if (arrstring != null) {
            if (n4 == 0) return 0 != 0;
            n4 = n2;
        }
        int n5 = this.o;
        if (arrstring != null) {
            if (n4 < n5) return 0 != 0;
            int n5 = n3;
            n5 = this.r;
        }
        if (arrstring != null) {
            if (n4 < n5) return 0 != 0;
            int n5 = n2;
            n5 = this.o + this.i;
        }
        if (arrstring != null) {
            if (n4 >= n5) return 0 != 0;
            n4 = n3;
            if (arrstring == null) return n4 != 0;
            n5 = this.r + this.n;
        }
        if (n4 >= n5) return 0 != 0;
        return 1 != 0;
    }

    public static boolean d() {
        boolean bl2 = s.f();
        return !bl2;
    }

    public void b(int n2, int n3) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
        block19: {
            block16: {
                block17: {
                    block18: {
                        block14: {
                            block15: {
                                block13: {
                                    block12: {
                                        block11: {
                                            block10: {
                                                var5_5 = net.minecraft.client.b.q.b();
                                                v0 = this;
                                                if (var5_5 != null) {
                                                    if (v0.l == false) return;
                                                    v0 = this;
                                                }
                                                v1 = var2_2;
                                                v2 = this.o;
                                                if (var5_5 == null) break block10;
                                                if (v1 < v2) ** GOTO lbl-1000
                                                v1 = var3_3;
                                                v2 = this.r;
                                            }
                                            if (var5_5 == null) break block11;
                                            if (v1 < v2) ** GOTO lbl-1000
                                            v1 = var2_2;
                                            v2 = this.o + this.i;
                                        }
                                        if (var5_5 == null) break block12;
                                        if (v1 >= v2) ** GOTO lbl-1000
                                        v1 = var3_3;
                                        if (var5_5 == null) break block13;
                                        v2 = this.r + this.n;
                                    }
                                    ** if (v1 >= v2) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        v1 = 1;
                                        ** GOTO lbl29
                                    }
lbl-1000:
                                    // 4 sources

                                    {
                                        v1 = 0;
                                    }
                                }
                                v0.a = v1;
                                var6_6 = new Color(255, 255, 255, 255);
                                var7_7 = new Color(this.q + 14, this.q + 14, this.q + 14, 255).darker().darker();
                                var1_1.aN().b(s.j);
                                v3 = this.h;
                                if (var5_5 == null) break block14;
                                if (v3 != 0) break block15;
                                var7_7 = new Color(10, 10, 10, 255);
                                var6_6 = new Color(100, 100, 100, 255);
                                if (var5_5 != null) break block16;
                            }
                            v3 = this.a;
                        }
                        if (var5_5 == null) break block17;
                        if (v3 == 0) break block18;
                        v3 = this.q;
                        v4 = 100;
                        if (var5_5 == null) break block19;
                        if (v3 >= v4) break block16;
                        this.q += 13;
                        if (var5_5 != null) break block16;
                    }
                    v3 = this.q;
                }
                v4 = 20;
                if (var5_5 == null) break block19;
                if (v3 > v4) {
                    this.q -= 13;
                }
            }
            net.minecraft.client.a.v.a();
            net.minecraft.client.a.v.e(770, 771, 1, 0);
            v3 = 770;
            v4 = 771;
        }
        net.minecraft.client.a.v.f(v3, v4);
        dJ.a((double)this.o, (double)this.r, (double)this.i, (double)this.n, var7_7, new Color(30, 30, 30, 255));
        var1_1.a6.d(this.m, this.o + this.i / 2, this.r + (this.n - 8) / 2, var6_6.getRGB());
        this.b(var1_1, var2_2, var3_3);
    }

    public boolean c() {
        return this.a;
    }

    public int a() {
        return this.i;
    }

    public static int e() {
        return Mouse.getX() * k.e() / Q.P().P;
    }

    public s(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    public s(int n2, int n3, int n4, int n5, int n6, String string) {
        this.q = 20;
        this.i = 200;
        this.n = 20;
        this.h = true;
        this.l = true;
        this.g = n2;
        this.o = n3;
        this.r = n4;
        this.i = n5;
        this.n = n6;
        this.m = string;
    }

    public void a(int n2, int n3) {
    }

    public void a(int n2) {
        this.i = n2;
    }

    public static boolean f() {
        return p;
    }

    public static void b(boolean bl2) {
        p = bl2;
    }

    public static int b() {
        return k.a() - Mouse.getY() * k.a() / Q.P().aT - 1;
    }

    protected void b(Q q2, int n2, int n3) {
    }

    static {
        j = new v("textures/gui/widgets.png");
        s.b(false);
        k = new l(Q.P());
    }

    public void a(C c10) {
        c10.c(y.a(E.bN, 1.0f));
    }

    protected int a(boolean bl2) {
        int n2;
        block7: {
            int n3;
            block6: {
                String[] arrstring;
                block4: {
                    block5: {
                        n3 = 1;
                        arrstring = net.minecraft.client.b.q.b();
                        n2 = this.h;
                        if (arrstring == null) break block4;
                        if (n2 != 0) break block5;
                        n3 = 0;
                        if (arrstring != null) break block6;
                    }
                    n2 = bl2;
                }
                if (arrstring == null) break block7;
                if (n2 != 0) {
                    n3 = 2;
                }
            }
            n2 = n3;
        }
        return n2;
    }
}

