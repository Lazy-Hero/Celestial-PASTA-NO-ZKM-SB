/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.t;
import net.minecraft.e.b;
import net.minecraft.e.f;
import net.minecraft.e.g;
import net.minecraft.e.h;
import net.minecraft.e.i;
import net.minecraft.k.n;

public class o {
    private final /* synthetic */ g c;
    private final /* synthetic */ Set<f> a;
    private final /* synthetic */ f[] b;
    private final /* synthetic */ b d;

    @Nullable
    public h a(t t2, C c10, x x2, float f10) {
        return this.a(t2, c10, x2.a, x2.m().b, x2.ax, f10);
    }

    public o(b b10) {
        this.c = new g();
        this.a = Sets.newHashSet();
        this.b = new f[32];
        this.d = b10;
    }

    @Nullable
    private h a(f f10, f f11, float f12) {
        Object object;
        Object object2;
        block11: {
            f10.d = 0.0f;
            f10.c = f10.c(f11);
            int n2 = i.n();
            f10.h = f10.c;
            this.c.b();
            this.a.clear();
            this.c.a(f10);
            object2 = f10;
            int n3 = 0;
            block0: while (true) {
                int n4 = this.c.c();
                block1: while (n4 == 0) {
                    ++n3;
                    if (n2 == 0) break block11;
                    if (n3 >= 200 && n2 != 0) break block0;
                    object = this.c.a();
                    int n5 = ((f)object).equals(f11);
                    if (n2 != 0) {
                        float f13;
                        if (n5 != 0) {
                            object2 = f11;
                            if (n2 != 0) break block0;
                        }
                        n5 = (f13 = ((f)object).c(f11) - ((f)object2).c(f11)) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                    }
                    if (n2 != 0) {
                        if (n5 < 0) {
                            object2 = object;
                        }
                        ((f)object).j = true;
                        n5 = this.d.a(this.b, (f)object, f11, f12);
                    }
                    int n6 = n5;
                    int n7 = 0;
                    while (n7 < n6) {
                        block12: {
                            block13: {
                                f f14;
                                f f15;
                                block16: {
                                    int n8;
                                    block14: {
                                        float f16;
                                        block15: {
                                            f15 = this.b[n7];
                                            float f17 = ((f)object).c(f15);
                                            f15.i = ((f)object).i + f17;
                                            f15.k = f17 + f15.e;
                                            f16 = ((f)object).d + f15.k;
                                            if (n2 == 0) break block12;
                                            float f18 = f15.i - f12;
                                            n4 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                                            if (n2 == 0) continue block1;
                                            if (n4 >= 0) break block13;
                                            n8 = f15.a();
                                            if (n2 == 0) break block14;
                                            if (n8 == 0) break block15;
                                            float f19 = f16 - f15.d;
                                            n8 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                                            if (n2 == 0) break block14;
                                            if (n8 >= 0) break block13;
                                        }
                                        f15.n = object;
                                        f15.d = f16;
                                        f15.c = f15.c(f11) + f15.e;
                                        f14 = f15;
                                        if (n2 == 0) break block13;
                                        n8 = f14.a() ? 1 : 0;
                                    }
                                    if (n8 == 0) break block16;
                                    this.c.a(f15, f15.d + f15.c);
                                    if (n2 != 0) break block13;
                                }
                                f15.h = f15.d + f15.c;
                                f14 = this.c.a(f15);
                            }
                            ++n7;
                        }
                        if (n2 != 0) continue;
                    }
                    if (n2 != 0) continue block0;
                }
                break;
            }
            if (object2 == f10) {
                return null;
            }
        }
        object = this.a(f10, (f)object2);
        return object;
    }

    @Nullable
    public h a(t t2, C c10, n n2, float f10) {
        return this.a(t2, c10, (float)n2.e() + 0.5f, (float)n2.b() + 0.5f, (float)n2.a() + 0.5f, f10);
    }

    private h a(f f10, f arrf) {
        int n2 = 1;
        f[] arrf2 = arrf;
        int n3 = i.n();
        while (arrf2.n != null) {
            ++n2;
            arrf2 = arrf2.n;
            if (n3 != 0) continue;
        }
        arrf2 = new f[n2];
        Object object = arrf;
        arrf2[--n2] = arrf;
        while (object.n != null) {
            object = object.n;
            arrf2[--n2] = object;
            if (n3 != 0) continue;
        }
        return new h(arrf2);
    }

    @Nullable
    private h a(t t2, C c10, double d10, double d11, double d12, float f10) {
        this.c.b();
        this.d.a(t2, c10);
        f f11 = this.d.b();
        f f12 = this.d.a(d10, d11, d12);
        h h2 = this.a(f11, f12, f10);
        this.d.a();
        return h2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

