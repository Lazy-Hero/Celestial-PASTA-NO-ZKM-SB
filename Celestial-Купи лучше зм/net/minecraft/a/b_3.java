/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.A;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.A.R;
import net.minecraft.A.h;
import net.minecraft.S.d;
import net.minecraft.aA.t;
import net.minecraft.ah.L;
import net.minecraft.ar.Z;
import net.minecraft.aw.w;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.k.n;

public class b {
    private /* synthetic */ d a;
    private final /* synthetic */ List<h> e;
    private /* synthetic */ d c;
    private /* synthetic */ net.minecraft.aA.n f;
    private final /* synthetic */ R d;
    private static /* synthetic */ boolean b;

    public b(w w2) {
        this(w2.L(), w2.w(), w2.r());
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public h[] b(@Nullable h[] arrh, int n2, int n3, int n4, int n5) {
        return this.a(arrh, n2, n3, n4, n5, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(int n2, int n3, int n4, List<h> list) {
        Object object;
        net.minecraft.S.b.a();
        int n5 = n2 - n4 >> 2;
        boolean bl2 = net.minecraft.A.b.c();
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] arrn = this.c.a(n5, n6, n9, n10);
        try {
            int n11 = 0;
            do {
                if (n11 >= n9 * n10) return true;
                object = h.b(arrn[n11]);
                if (!bl2) continue;
                boolean bl3 = list.contains(object);
                if (!bl2) return bl3;
                if (!bl3) {
                    return false;
                }
                ++n11;
            } while (bl2);
            return true;
        }
        catch (Throwable throwable) {
            object = net.minecraft.c.f.a(throwable, "Invalid Biome id");
            l l2 = ((f)object).a("Layer");
            l2.a("Layer", this.c.toString());
            l2.a("x", n2);
            l2.a("z", n3);
            l2.a("radius", n4);
            l2.a("allowed", list);
            throw new Z((f)object);
        }
    }

    @Nullable
    public n a(int n2, int n3, int n4, List<h> list, Random random) {
        net.minecraft.S.b.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        boolean bl2 = net.minecraft.A.b.f();
        int[] arrn = this.c.a(n5, n6, n9, n10);
        n n11 = null;
        int n12 = 0;
        int n13 = 0;
        while (n13 < n9 * n10) {
            block3: {
                block4: {
                    n n14;
                    block5: {
                        int n15 = n5 + n13 % n9 << 2;
                        int n16 = n6 + n13 / n9 << 2;
                        h h2 = h.b(arrn[n13]);
                        if (bl2) break block3;
                        if (!list.contains(h2)) break block4;
                        n14 = n11;
                        if (bl2) break block5;
                        if (n14 != null && random.nextInt(n12 + 1) != 0) break block4;
                        n14 = new n(n15, 0, n16);
                    }
                    n11 = n14;
                    ++n12;
                }
                ++n13;
            }
            if (!bl2) continue;
        }
        return n11;
    }

    public float a(float f10, int n2) {
        return f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        boolean bl2 = net.minecraft.A.b.c();
        net.minecraft.aA.n n2 = this.f;
        if (bl2) {
            if (n2 == null) return 0 != 0;
            n2 = this.f;
        }
        int n3 = n2.d;
        if (!bl2) return n3 != 0;
        if (n3 < 0) return 0 != 0;
        return 1 != 0;
    }

    protected b() {
        this.d = new R(this);
        this.e = Lists.newArrayList((Object[])new h[]{net.minecraft.u.d.L, net.minecraft.u.d.s, net.minecraft.u.d.Z, net.minecraft.u.d.ad, net.minecraft.u.d.N, net.minecraft.u.d.l, net.minecraft.u.d.r});
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public List<h> b() {
        return this.e;
    }

    static {
        if (!net.minecraft.A.b.c()) {
            net.minecraft.A.b.b(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public h e() {
        boolean bl2 = net.minecraft.A.b.f();
        net.minecraft.aA.n n2 = this.f;
        if (!bl2) {
            if (n2 == null) return null;
            n2 = this.f;
        }
        int n3 = n2.d;
        if (!bl2) {
            if (n3 < 0) return null;
            n3 = this.f.d;
        }
        h h2 = h.a(n3);
        return h2;
    }

    public static boolean f() {
        boolean bl2 = net.minecraft.A.b.c();
        return !bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public h[] a(h[] arrh, int n2, int n3, int n4, int n5) {
        h[] arrh2;
        boolean bl2;
        block9: {
            h[] arrh3;
            block6: {
                int n6;
                int n7;
                block8: {
                    block7: {
                        boolean bl3 = net.minecraft.A.b.c();
                        net.minecraft.S.b.a();
                        bl2 = bl3;
                        arrh3 = arrh;
                        if (!bl2) break block6;
                        if (arrh3 == null) break block7;
                        n7 = arrh.length;
                        n6 = n4 * n5;
                        if (!bl2) break block8;
                        if (n7 >= n6) break block9;
                    }
                    n7 = n4;
                    n6 = n5;
                }
                arrh3 = new h[n7 * n6];
            }
            arrh = arrh3;
        }
        int[] arrn = this.c.a(n2, n3, n4, n5);
        try {
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                arrh2 = arrh;
                if (!bl2) return arrh2;
                arrh2[i2] = h.a(arrn[i2], net.minecraft.u.d.ai);
                if (bl2) continue;
            }
        }
        catch (Throwable throwable) {
            f f10 = net.minecraft.c.f.a(throwable, "Invalid Biome id");
            l l2 = f10.a("RawBiomeBlock");
            l2.a("biomes[] size", arrh.length);
            l2.a("x", n2);
            l2.a("z", n3);
            l2.a("w", n4);
            l2.a("h", n5);
            throw new Z(f10);
        }
        arrh2 = arrh;
        return arrh2;
    }

    public h[] a(@Nullable h[] arrh, int n2, int n3, int n4, int n5, boolean n6) {
        h[] arrh2;
        block11: {
            boolean bl2;
            block17: {
                int n7;
                block20: {
                    int n8;
                    int n9;
                    block19: {
                        block18: {
                            block16: {
                                block14: {
                                    block15: {
                                        h[] arrh3;
                                        block12: {
                                            block13: {
                                                boolean bl3 = net.minecraft.A.b.f();
                                                net.minecraft.S.b.a();
                                                bl2 = bl3;
                                                arrh3 = arrh;
                                                if (bl2) break block12;
                                                if (arrh3 == null) break block13;
                                                n9 = arrh.length;
                                                if (bl2) break block14;
                                                if (n9 >= n4 * n5) break block15;
                                            }
                                            arrh3 = new h[n4 * n5];
                                        }
                                        arrh = arrh3;
                                    }
                                    n9 = n6;
                                }
                                if (bl2) break block16;
                                if (n9 == 0) break block17;
                                n9 = n4;
                            }
                            n8 = 16;
                            if (bl2) break block18;
                            if (n9 != n8) break block17;
                            n9 = n5;
                            n8 = 16;
                        }
                        if (bl2) break block19;
                        if (n9 != n8) break block17;
                        n9 = n2;
                        n8 = 15;
                    }
                    n7 = n9 & n8;
                    if (bl2) break block20;
                    if (n7 != 0) break block17;
                    n7 = n3 & 0xF;
                }
                if (n7 == 0) {
                    h[] arrh4 = this.d.a(n2, n3);
                    System.arraycopy(arrh4, 0, arrh, 0, n4 * n5);
                    return arrh;
                }
            }
            int[] arrn = this.a.a(n2, n3, n4, n5);
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                arrh2 = arrh;
                if (!bl2) {
                    arrh2[i2] = h.a(arrn[i2], net.minecraft.u.d.ai);
                    if (!bl2) continue;
                }
                break block11;
            }
            arrh2 = arrh;
        }
        return arrh2;
    }

    public h a(n n2) {
        return this.a(n2, null);
    }

    public void d() {
        this.d.a();
    }

    private b(long l2, L l3, String string) {
        this();
        if (l3 == L.i && !string.isEmpty()) {
            this.f = t.a(string).b();
        }
        d[] arrd = net.minecraft.S.d.a(l2, l3, this.f);
        this.c = arrd[0];
        this.a = arrd[1];
    }

    public static boolean c() {
        return b;
    }

    public h a(n n2, h h2) {
        return this.d.a(n2.e(), n2.a(), h2);
    }
}

