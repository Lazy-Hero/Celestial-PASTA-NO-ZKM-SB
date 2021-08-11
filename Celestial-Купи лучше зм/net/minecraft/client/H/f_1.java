/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.h;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.q;
import net.minecraft.client.h.d;
import net.minecraft.client.h.k;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.l.i;

public class f
extends q {
    private /* synthetic */ k i;
    private /* synthetic */ float a;
    private /* synthetic */ net.minecraft.az.k l;
    private /* synthetic */ Q n;
    private static final /* synthetic */ v h;
    private /* synthetic */ int m;
    private /* synthetic */ int g;
    private /* synthetic */ boolean j;
    private final /* synthetic */ List<d> k;

    public void a(Q q2, k k2, int n2, int n3, int n4, int n5, float f10, i i2) {
        block10: {
            float f11;
            int n6;
            this.n = q2;
            this.i = k2;
            boolean bl2 = i2.b();
            List<net.minecraft.az.k> list = k2.a(true);
            String[] arrstring = net.minecraft.client.h.k.d();
            List list2 = bl2 ? Collections.emptyList() : k2.a(false);
            int n7 = list.size();
            int n8 = n6 = n7 + list2.size();
            if (arrstring != null) {
                n8 = n8 <= 16 ? 4 : 5;
            }
            int n9 = n8;
            int n10 = (int)Math.ceil((float)n6 / (float)n9);
            this.m = n2;
            this.g = n3;
            int n11 = 25;
            float f12 = this.m + Math.min(n6, n9) * 25;
            float f13 = n4 + 50;
            float f14 = f12 == f13 ? 0 : (f12 > f13 ? 1 : -1);
            if (arrstring != null) {
                if (f14 > 0) {
                    this.m = (int)((float)this.m - f10 * (float)((int)((f12 - f13) / f10)));
                }
                f14 = this.g + n10 * 25;
            }
            float f15 = f14;
            float f16 = n5 + 50;
            float f17 = f15 == f16 ? 0 : (f15 > f16 ? 1 : -1);
            if (arrstring != null) {
                if (f17 > 0) {
                    this.g = (int)((float)this.g - f10 * (float)net.minecraft.k.h.f((f15 - f16) / f10));
                }
                f17 = this.g;
            }
            float f18 = f17;
            float f19 = n5 - 100;
            float f20 = f18 == f19 ? 0 : (f18 < f19 ? -1 : 1);
            if (arrstring != null) {
                if (f20 < 0) {
                    this.g = (int)((float)this.g - f10 * (float)net.minecraft.k.h.f((f18 - f19) / f10));
                }
                this.j = true;
                this.k.clear();
                f20 = f11 = 0.0f;
            }
            while (f11 < n6) {
                if (arrstring != null) {
                    float f21 = f11;
                    if (arrstring != null) {
                        f21 = f21 < n7 ? 1.0f : 0.0f;
                    }
                    float f22 = f21;
                    this.k.add(new d(this, this.m + 4 + 25 * (f11 % n9), this.g + 5 + 25 * (f11 / n9), f22 != false ? list.get((int)f11) : (net.minecraft.az.k)list2.get((int)(f11 - n7)), (boolean)f22));
                    ++f11;
                    if (arrstring != null) continue;
                    net.minecraft.k.m.b(!net.minecraft.k.m.c());
                    break;
                }
                break block10;
            }
            this.l = null;
        }
    }

    public f() {
        this.k = Lists.newArrayList();
    }

    public boolean b() {
        return this.j;
    }

    public boolean a(int n2, int n3, int n4) {
        boolean bl2;
        block5: {
            String[] arrstring;
            block7: {
                boolean bl3;
                block6: {
                    arrstring = net.minecraft.client.h.k.d();
                    bl3 = n4;
                    if (arrstring == null) break block6;
                    if (!bl3) break block7;
                    bl3 = false;
                }
                return bl3;
            }
            for (d d10 : this.k) {
                block9: {
                    boolean bl4;
                    block8: {
                        bl2 = d10.a(this.n, n2, n3);
                        if (arrstring == null) break block5;
                        if (arrstring == null) break block8;
                        if (!bl2) break block9;
                        this.l = net.minecraft.client.h.d.a(d10);
                        bl4 = true;
                    }
                    return bl4;
                }
                if (arrstring != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    static v c() {
        return h;
    }

    public void a(int n2, int n3, float f10) {
        block6: {
            int n4;
            String[] arrstring;
            block7: {
                arrstring = net.minecraft.client.h.k.d();
                n4 = this.j;
                if (arrstring == null) break block7;
                if (n4 == 0) break block6;
                this.a += f10;
                a0.b();
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.n.aN().b(h);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.b(0.0f, 0.0f, 170.0f);
                n4 = this.k.size();
            }
            if (arrstring != null) {
                n4 = n4 <= 16 ? 4 : 5;
            }
            int n5 = n4;
            int n6 = Math.min(this.k.size(), n5);
            int n7 = net.minecraft.k.h.f((float)this.k.size() / (float)n5);
            int n8 = 24;
            int n9 = 4;
            int n10 = 82;
            int n11 = 208;
            this.b(n6, n7, 24, 4, 82, 208);
            net.minecraft.client.a.v.f();
            a0.a();
            for (d d10 : this.k) {
                d10.a(this.n, n2, n3, f10);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block6;
            }
            net.minecraft.client.a.v.B();
        }
    }

    public k d() {
        return this.i;
    }

    public net.minecraft.az.k a() {
        return this.l;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        String[] arrstring = net.minecraft.client.h.k.d();
        this.a(this.m, this.g, n6, n7, n5, n5);
        this.a(this.m + n5 * 2 + n2 * n4, this.g, n6 + n4 + n5, n7, n5, n5);
        this.a(this.m, this.g + n5 * 2 + n3 * n4, n6, n7 + n4 + n5, n5, n5);
        this.a(this.m + n5 * 2 + n2 * n4, this.g + n5 * 2 + n3 * n4, n6 + n4 + n5, n7 + n4 + n5, n5, n5);
        String[] arrstring2 = arrstring;
        int n8 = 0;
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 < n2) {
                this.a(this.m + n5 + n8 * n4, this.g, n6 + n5, n7, n4, n5);
                this.a(this.m + n5 + (n8 + 1) * n4, this.g, n6 + n5, n7, n5, n5);
                int n10 = 0;
                while (n10 < n3) {
                    block9: {
                        int n11;
                        block8: {
                            n9 = n8;
                            if (arrstring2 == null) continue block1;
                            if (arrstring2 == null) break block8;
                            if (n9 == 0) {
                                this.a(this.m, this.g + n5 + n10 * n4, n6, n7 + n5, n5, n4);
                                this.a(this.m, this.g + n5 + (n10 + 1) * n4, n6, n7 + n5, n5, n5);
                            }
                            this.a(this.m + n5 + n8 * n4, this.g + n5 + n10 * n4, n6 + n5, n7 + n5, n4, n4);
                            this.a(this.m + n5 + (n8 + 1) * n4, this.g + n5 + n10 * n4, n6 + n5, n7 + n5, n5, n4);
                            this.a(this.m + n5 + n8 * n4, this.g + n5 + (n10 + 1) * n4, n6 + n5, n7 + n5, n4, n5);
                            this.a(this.m + n5 + (n8 + 1) * n4 - 1, this.g + n5 + (n10 + 1) * n4 - 1, n6 + n5, n7 + n5, n5 + 1, n5 + 1);
                            if (arrstring2 == null) break block9;
                            n11 = n8;
                        }
                        if (n11 == n2 - 1) {
                            this.a(this.m + n5 * 2 + n2 * n4, this.g + n5 + n10 * n4, n6 + n4 + n5, n7 + n5, n5, n4);
                            this.a(this.m + n5 * 2 + n2 * n4, this.g + n5 + (n10 + 1) * n4, n6 + n4 + n5, n7 + n5, n5, n5);
                        }
                        ++n10;
                    }
                    if (arrstring2 != null) continue;
                }
                this.a(this.m + n5 + n8 * n4, this.g + n5 * 2 + n3 * n4, n6 + n5, n7 + n4 + n5, n4, n5);
                this.a(this.m + n5 + (n8 + 1) * n4, this.g + n5 * 2 + n3 * n4, n6 + n5, n7 + n4 + n5, n5, n5);
                ++n8;
                if (arrstring2 != null) continue block0;
            }
            break;
        }
    }

    static float a(f f10) {
        return f10.a;
    }

    static {
        h = new v("textures/gui/recipe_book.png");
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }
}

