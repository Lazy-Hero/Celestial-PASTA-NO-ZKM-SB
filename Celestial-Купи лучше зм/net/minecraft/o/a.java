/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.o;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.A.b;
import net.minecraft.N.y;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.dA;
import net.minecraft.Z.i;
import net.minecraft.aA.v;
import net.minecraft.ah.L;
import net.minecraft.ah.c;
import net.minecraft.ah.z;
import net.minecraft.ar.R;
import net.minecraft.ar.Z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.o.h;
import net.minecraft.o.j;
import net.minecraft.o.k;
import net.minecraft.o.l;
import net.minecraft.t.f;
import net.minecraft.u.d;
import net.minecraft.u.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private /* synthetic */ boolean w;
    private /* synthetic */ int o;
    public final /* synthetic */ int t;
    private /* synthetic */ boolean m;
    private /* synthetic */ boolean n;
    private static /* synthetic */ int[] l;
    private final /* synthetic */ net.minecraft.ar.a<x>[] p;
    private final /* synthetic */ byte[] a;
    public static final /* synthetic */ f u;
    public final /* synthetic */ int i;
    private final /* synthetic */ z x;
    private final /* synthetic */ int[] c;
    private /* synthetic */ boolean y;
    private /* synthetic */ boolean d;
    private /* synthetic */ boolean k;
    private final /* synthetic */ f[] r;
    private /* synthetic */ boolean z;
    public /* synthetic */ boolean b;
    private /* synthetic */ int q;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ Map<n, y> j;
    private /* synthetic */ long g;
    private final /* synthetic */ ConcurrentLinkedQueue<n> v;
    private final /* synthetic */ int[] h;
    private /* synthetic */ long s;
    private final /* synthetic */ boolean[] e;

    public int[] p() {
        return this.c;
    }

    public void b(long l2) {
        this.s = l2;
    }

    public int b(int n2, int n3) {
        return this.c[n3 << 4 | n2];
    }

    public void t() {
        block13: {
            block14: {
                a a10;
                block15: {
                    int[] arrn;
                    block11: {
                        int n2;
                        n n3;
                        block10: {
                            boolean bl2;
                            block12: {
                                this.k = true;
                                this.m = true;
                                n3 = new n(this.t << 4, 0, this.i << 4);
                                arrn = net.minecraft.o.a.k();
                                bl2 = this.x.D.h();
                                if (arrn == null) break block12;
                                if (!bl2) break block13;
                                a10 = this;
                                if (arrn == null) break block14;
                                bl2 = a10.x.a(n3.a(-1, 0, -1), n3.a(16, this.x.y(), 16));
                            }
                            if (!bl2) break block15;
                            int n4 = 0;
                            block0: while (true) {
                                int n5 = n4;
                                block1: while (n5 < 16) {
                                    n2 = 0;
                                    if (arrn == null) break block10;
                                    for (int i2 = v1907454; i2 < 16; ++i2) {
                                        a a11 = this;
                                        int n6 = n4;
                                        if (arrn != null) {
                                            n5 = a11.a(n6, i2) ? 1 : 0;
                                            if (arrn == null) continue block1;
                                            if (n5 != 0) continue;
                                            a11 = this;
                                            a11.m = 0;
                                            n6 = a11.m ? 1 : 0;
                                        }
                                        if (arrn != null) break block0;
                                        if (arrn != null) continue;
                                    }
                                    ++n4;
                                    if (arrn != null) continue block0;
                                }
                                break;
                            }
                            n2 = this.m;
                        }
                        if (n2 == 0) break block13;
                        for (aA aA2 : av.HORIZONTAL) {
                            if (arrn != null) {
                                int n7 = aA2.o() == R.POSITIVE ? 16 : 1;
                                this.x.b(n3.a(aA2, n7)).a(aA2.h());
                                if (arrn != null) continue;
                            }
                            break block11;
                        }
                        this.i();
                    }
                    if (arrn != null) break block13;
                }
                a10 = this;
            }
            a10.m = false;
        }
    }

    public net.minecraft.A.h a(n n2, b b10) {
        net.minecraft.A.h h2;
        int n3;
        int n4 = n2.e() & 0xF;
        int n5 = n2.a() & 0xF;
        int[] arrn = net.minecraft.o.a.k();
        int n6 = n3 = this.a[n5 << 4 | n4] & 0xFF;
        if (arrn != null) {
            if (n6 == 255) {
                h2 = b10.a(n2, net.minecraft.u.d.s);
                n3 = net.minecraft.A.h.b(h2);
                this.a[n5 << 4 | n4] = (byte)(n3 & 0xFF);
            }
            n6 = n3;
        }
        net.minecraft.A.h h3 = h2 = net.minecraft.A.h.b(n6);
        if (arrn != null) {
            h3 = h3 == null ? net.minecraft.u.d.s : h2;
        }
        return h3;
    }

    public byte[] g() {
        return this.a;
    }

    public boolean o() {
        return this.w;
    }

    public void e() {
        this.y = true;
        int[] arrn = net.minecraft.o.a.k();
        this.x.c(this.j.values());
        for (net.minecraft.ar.a<x> a10 : this.p) {
            this.x.b(a10);
            if (arrn != null) continue;
        }
    }

    public net.minecraft.ar.a<x>[] d() {
        return this.p;
    }

    protected void a(v v2) {
        block4: {
            a a10;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.o.a.k();
                    a10 = this;
                    if (arrn == null) break block2;
                    if (!a10.j()) break block3;
                    if (!v2.b(this, this.t, this.i)) break block4;
                    this.w();
                    if (arrn != null) break block4;
                }
                this.t();
                v2.b(this.t, this.i);
                a10 = this;
            }
            a10.w();
        }
    }

    public n d(n n2) {
        n n3;
        block3: {
            int n4;
            block4: {
                n n5;
                int n6 = n2.e() & 0xF;
                int[] arrn = net.minecraft.o.a.k();
                int n7 = n2.a() & 0xF;
                n4 = n6 | n7 << 4;
                n3 = n5 = new n(n2.e(), this.h[n4], n2.a());
                if (arrn == null) break block3;
                if (n3.b() != -999) break block4;
                int n8 = this.b() + 15;
                n5 = new n(n2.e(), n8, n2.a());
                int n9 = -1;
                while (n5.b() > 0 && n9 == -1) {
                    block7: {
                        int n10;
                        block5: {
                            block6: {
                                i i2 = this.c(n5);
                                net.minecraft.ac.c c10 = i2.o();
                                n10 = c10.n();
                                if (arrn == null) break block5;
                                if (n10 != 0) break block6;
                                n10 = c10.b();
                                if (arrn == null) break block5;
                                if (n10 != 0) break block6;
                                n5 = n5.k();
                                if (arrn != null) break block7;
                            }
                            n10 = n5.b() + 1;
                        }
                        n9 = n10;
                    }
                    if (arrn != null) continue;
                }
                this.h[n4] = n9;
            }
            n3 = new n(n2.e(), this.h[n4], n2.a());
        }
        return n3;
    }

    public Map<n, y> l() {
        return this.j;
    }

    public void c(int[] arrn) {
        block4: {
            int[] arrn2;
            block2: {
                block3: {
                    int[] arrn3 = net.minecraft.o.a.k();
                    arrn2 = this.c;
                    if (arrn3 == null) break block2;
                    if (arrn2.length == arrn.length) break block3;
                    f.warn("Could not set level chunk heightmap, array length is {} instead of {}", (Object)arrn.length, (Object)this.c.length);
                    if (arrn3 != null) break block4;
                }
                arrn2 = arrn;
            }
            System.arraycopy(arrn2, 0, this.c, 0, this.c.length);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(boolean var1_1) {
        var2_2 = net.minecraft.o.a.k();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl18
        if (v0 != 0) {
            v0 = this.n;
            if (var2_2 != null) {
                if (v0 != 0) {
                    cfr_temp_0 = this.x.r() - this.s;
                    v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var2_2 == null) return v1;
                    if (v1 != false) return true;
                }
                v0 = this.z;
            }
            if (var2_2 == null) return (boolean)v0;
            if (v0 != 0) {
                return true;
            }
        } else {
            v0 = this.n ? 1 : 0;
lbl18:
            // 2 sources

            if (var2_2 == null) return (boolean)v0;
            if (v0 != 0) {
                cfr_temp_1 = this.x.r() - (this.s + 600L);
                v0 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                if (var2_2 == null) return (boolean)v0;
                if (v0 >= 0) {
                    return true;
                }
            }
        }
        v0 = this.z;
        return (boolean)v0;
    }

    public void a(k k2, v v2) {
        block22: {
            a a10;
            block24: {
                a a11;
                a a12;
                int[] arrn;
                block23: {
                    block21: {
                        a a13;
                        block19: {
                            a a14;
                            block20: {
                                a a15;
                                block17: {
                                    block18: {
                                        a a16;
                                        block15: {
                                            block16: {
                                                a14 = k2.c(this.t, this.i - 1);
                                                a15 = k2.c(this.t + 1, this.i);
                                                a16 = k2.c(this.t, this.i + 1);
                                                a13 = k2.c(this.t - 1, this.i);
                                                arrn = net.minecraft.o.a.k();
                                                a12 = a15;
                                                if (arrn == null) break block15;
                                                if (a12 == null) break block16;
                                                a12 = a16;
                                                if (arrn == null) break block15;
                                                if (a12 == null) break block16;
                                                a12 = k2.c(this.t + 1, this.i + 1);
                                                if (arrn == null) break block15;
                                                if (a12 != null) {
                                                    this.a(v2);
                                                }
                                            }
                                            a12 = a13;
                                        }
                                        if (arrn == null) break block17;
                                        if (a12 == null) break block18;
                                        a12 = a16;
                                        if (arrn == null) break block17;
                                        if (a12 == null) break block18;
                                        a12 = k2.c(this.t - 1, this.i + 1);
                                        if (arrn == null) break block17;
                                        if (a12 != null) {
                                            a13.a(v2);
                                        }
                                    }
                                    a12 = a14;
                                }
                                if (arrn == null) break block19;
                                if (a12 == null) break block20;
                                a12 = a15;
                                if (arrn == null) break block19;
                                if (a12 == null) break block20;
                                a12 = k2.c(this.t + 1, this.i - 1);
                                if (arrn == null) break block19;
                                if (a12 != null) {
                                    a14.a(v2);
                                }
                            }
                            a12 = a14;
                        }
                        if (arrn == null) break block21;
                        if (a12 == null) break block22;
                        a12 = a13;
                    }
                    if (arrn == null) break block23;
                    if (a12 == null) break block22;
                    a12 = k2.c(this.t - 1, this.i - 1);
                }
                a10 = a11 = a12;
                if (arrn == null) break block24;
                if (a10 == null) break block22;
                a10 = a11;
            }
            a10.a(v2);
        }
    }

    public <T extends x> void a(Class<? extends T> class_, net.minecraft.k.k k2, List<T> list, Predicate<? super T> predicate) {
        int n2 = net.minecraft.k.h.f((k2.b - 2.0) / 16.0);
        int n3 = net.minecraft.k.h.f((k2.a + 2.0) / 16.0);
        n2 = net.minecraft.k.h.c(n2, 0, this.p.length - 1);
        n3 = net.minecraft.k.h.c(n3, 0, this.p.length - 1);
        int n4 = n2;
        int[] arrn = net.minecraft.o.a.k();
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 <= n3) {
                for (x x2 : this.p[n4].c(class_)) {
                    block5: {
                        boolean bl2;
                        block7: {
                            Predicate<? super T> predicate2;
                            block6: {
                                n5 = x2.m().c(k2) ? 1 : 0;
                                if (arrn == null) continue block1;
                                if (n5 == 0) break block5;
                                predicate2 = predicate;
                                if (arrn == null) break block6;
                                if (predicate2 == null) break block7;
                                predicate2 = predicate;
                            }
                            bl2 = predicate2.apply((Object)x2);
                            if (arrn == null || !bl2) break block5;
                        }
                        bl2 = list.add(x2);
                    }
                    if (arrn != null) continue;
                }
                ++n4;
                if (arrn != null) continue block0;
            }
            break;
        }
    }

    public void w() {
        this.z = true;
    }

    public static void b(int[] arrn) {
        l = arrn;
    }

    public long m() {
        return this.g;
    }

    public void a(n n2, y y2) {
        block5: {
            n n3;
            Map<n, y> map;
            block6: {
                boolean bl2;
                block4: {
                    int[] arrn = net.minecraft.o.a.k();
                    y2.b(this.x);
                    int[] arrn2 = arrn;
                    y2.a(n2);
                    bl2 = this.c(n2).b() instanceof dA;
                    if (arrn2 == null) break block4;
                    if (!bl2) break block5;
                    map = this.j;
                    n3 = n2;
                    if (arrn2 == null) break block6;
                    bl2 = map.containsKey(n3);
                }
                if (bl2) {
                    this.j.get(n2).i();
                }
                y2.o();
                map = this.j;
                n3 = n2;
            }
            map.put(n3, y2);
        }
    }

    public net.minecraft.k.f A() {
        return new net.minecraft.k.f(this.t, this.i);
    }

    public void f(boolean bl2) {
        this.m = bl2;
    }

    public boolean x() {
        return this.y;
    }

    public static int[] k() {
        return l;
    }

    public a(z z2, int n2, int n3) {
        block2: {
            this.r = new f[16];
            this.a = new byte[256];
            this.h = new int[256];
            int[] arrn = net.minecraft.o.a.k();
            this.e = new boolean[256];
            this.j = Maps.newHashMap();
            this.o = 4096;
            this.v = Queues.newConcurrentLinkedQueue();
            this.p = new net.minecraft.ar.a[16];
            this.x = z2;
            this.t = n2;
            this.i = n3;
            this.c = new int[256];
            for (int i2 = 0; i2 < this.p.length; ++i2) {
                this.p[i2] = new net.minecraft.ar.a<x>(x.class);
                if (arrn != null) {
                    if (arrn != null) continue;
                    net.minecraft.k.m.b(!net.minecraft.k.m.d());
                    break;
                }
                break block2;
            }
            Arrays.fill(this.h, -999);
            Arrays.fill(this.a, (byte)-1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(int n2, int n3) {
        int[] arrn = net.minecraft.o.a.k();
        boolean bl2 = n2;
        int n4 = this.t;
        if (arrn != null) {
            if (bl2 != n4) return false;
            bl2 = n3;
            if (arrn == null) return bl2;
            n4 = this.i;
        }
        if (bl2 != n4) return false;
        return true;
    }

    private int a(int n2, int n3, int n4) {
        return this.c(n2, n3, n4).j();
    }

    public void d(boolean bl2) {
        this.n = bl2;
    }

    public int g(n n2) {
        return this.b(n2.e() & 0xF, n2.a() & 0xF);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void e(boolean bl2) {
        boolean bl3;
        int[] arrn;
        block9: {
            block10: {
                arrn = net.minecraft.o.a.k();
                bl3 = this.d;
                if (arrn == null) break block9;
                if (!bl3) break block10;
                bl3 = this.x.D.h();
                if (arrn == null) break block9;
                if (!bl3) break block10;
                bl3 = bl2;
                if (arrn == null) break block9;
                if (!bl3) {
                    this.c(this.x.C);
                }
            }
            this.w = true;
            bl3 = this.m;
        }
        boolean bl4 = true;
        do {
            block12: {
                block11: {
                    if (!bl4 || (bl4 = false)) break block11;
                    if (arrn == null) break block12;
                    if (bl3) break block11;
                    bl3 = this.k;
                    if (arrn == null) break block12;
                    if (bl3) {
                        this.t();
                    }
                }
                bl3 = this.v.isEmpty();
            }
            if (bl3) break;
            n n2 = this.v.poll();
            a a10 = this;
            n n3 = n2;
            if (arrn != null) {
                if (a10.a(n3, net.minecraft.o.j.CHECK) != null) continue;
                a10 = this;
                n3 = n2;
            }
            if (arrn != null) {
                if (!a10.c(n3).b().e()) continue;
                a10 = this;
                n3 = n2;
            }
            y y2 = a10.f(n3);
            this.x.b(n2, y2);
            this.x.b(n2, n2);
        } while (arrn != null);
    }

    private void d(int n2, int n3) {
        this.e[n2 + n3 * 16] = true;
        this.d = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b() {
        f f10 = this.q();
        int[] arrn = net.minecraft.o.a.k();
        f f11 = f10;
        if (arrn != null) {
            if (f11 == null) {
                return 0;
            }
            f11 = f10;
        }
        int n2 = f11.b();
        return n2;
    }

    public void f() {
        block20: {
            int n2 = this.b();
            this.q = Integer.MAX_VALUE;
            int n3 = 0;
            int[] arrn = net.minecraft.o.a.k();
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 < 16) {
                    if (arrn == null) break block20;
                    int n5 = 0;
                    while (n5 < 16) {
                        block22: {
                            block24: {
                                int n6;
                                int n7;
                                int n8;
                                block23: {
                                    int n9;
                                    block21: {
                                        this.h[n3 + (n5 << 4)] = -999;
                                        n4 = n2 + 16;
                                        if (arrn == null) continue block1;
                                        for (n8 = v1909101; n8 > 0; --n8) {
                                            n9 = this.a(n3, n8 - 1, n5);
                                            if (arrn != null) {
                                                if (arrn != null) {
                                                    if (n9 == 0) continue;
                                                    this.c[n5 << 4 | n3] = n8;
                                                    n9 = n8;
                                                }
                                                if (arrn != null) {
                                                    if (n9 >= this.q) break;
                                                    this.q = n8;
                                                    if (arrn != null) break;
                                                    if (arrn != null) continue;
                                                }
                                            }
                                            break block21;
                                        }
                                        n9 = this.x.D.h();
                                    }
                                    if (arrn == null) break block23;
                                    if (n9 == 0) break block24;
                                    n8 = 15;
                                    n9 = n7 = n2 + 16 - 1;
                                }
                                do {
                                    block28: {
                                        block27: {
                                            int n10;
                                            int n11;
                                            block26: {
                                                int n12;
                                                block25: {
                                                    if ((n12 = this.a(n3, n7, n5)) != 0) break block25;
                                                    n11 = n8;
                                                    n10 = 15;
                                                    if (arrn == null || arrn == null) break block26;
                                                    if (n11 != n10) {
                                                        n12 = 1;
                                                    }
                                                }
                                                n11 = n8;
                                                n10 = n12;
                                            }
                                            n6 = n8 = n11 - n10;
                                            if (arrn == null) continue;
                                            if (n6 <= 0) break block27;
                                            f f10 = this.r[n7 >> 4];
                                            if (arrn == null) break block28;
                                            if (f10 != u) {
                                                f10.a(n3, n7 & 0xF, n5, n8);
                                                this.x.e(new n((this.t << 4) + n3, n7, (this.i << 4) + n5));
                                            }
                                        }
                                        --n7;
                                    }
                                    if (arrn == null) break block22;
                                    n6 = n7;
                                } while (n6 > 0 && (n8 > 0 || arrn == null) && arrn != null);
                            }
                            ++n5;
                        }
                        if (arrn != null) continue;
                    }
                    ++n3;
                    if (arrn != null) continue block0;
                }
                break;
            }
            this.z = true;
        }
    }

    public int e(n n2) {
        return this.c(n2).j();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void d(int var1_1, int var2_2, int var3_3) {
        block41: {
            block32: {
                block40: {
                    block39: {
                        block31: {
                            block33: {
                                block34: {
                                    block30: {
                                        var6_5 = var5_4 = this.c[var3_3 << 4 | var1_1] & 255;
                                        var4_6 = net.minecraft.o.a.k();
                                        v0 = var2_2;
                                        if (var4_6 == null) ** GOTO lbl9
                                        if (v0 > var5_4) {
                                            var6_5 = var2_2;
                                        }
                                        do {
                                            v0 = var6_5;
lbl9:
                                            // 2 sources

                                            if (v0 <= 0) break;
                                            v1 = this.a(var1_1, var6_5 - 1, var3_3);
                                            if (var4_6 == null || var4_6 == null) break block30;
                                            if (v1 != 0) break;
                                            --var6_5;
                                        } while (var4_6 != null);
                                        v1 = var6_5;
                                    }
                                    v2 = var5_4;
                                    if (var4_6 != null) {
                                        if (v1 == v2) return;
                                        this.x.a(var1_1 + this.t * 16, var3_3 + this.i * 16, var6_5, var5_4);
                                        this.c[var3_3 << 4 | var1_1] = var6_5;
                                        v1 = this.t * 16;
                                        v2 = var1_1;
                                    }
                                    var7_7 = v1 + v2;
                                    var8_8 = this.i * 16 + var3_3;
                                    v3 = this.x.D.h();
                                    if (var4_6 == null) break block33;
                                    if (v3 == 0) break block34;
                                    v4 = var6_5;
                                    if (var4_6 == null) ** GOTO lbl45
                                    if (v4 >= var5_4) ** GOTO lbl-1000
                                    var9_9 = var6_5;
                                    while (var9_9 < var5_4) {
                                        var10_10 = this.r[var9_9 >> 4];
                                        if (var4_6 != null) {
                                            if (var4_6 != null) {
                                                if (var10_10 != net.minecraft.o.a.u) {
                                                    var10_10.a(var1_1, var9_9 & 15, var3_3, 15);
                                                    this.x.e(new n((this.t << 4) + var1_1, var9_9, (this.i << 4) + var3_3));
                                                }
                                                ++var9_9;
                                            }
                                            if (var4_6 != null) continue;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    if (var4_6 == null) lbl-1000:
                                    // 2 sources

                                    {
                                        v4 = var9_9 = var5_4;
lbl45:
                                        // 3 sources

                                        while (var9_9 < var6_5) {
                                            var10_10 = this.r[var9_9 >> 4];
                                            if (var4_6 != null) {
                                                if (var4_6 != null) {
                                                    if (var10_10 != net.minecraft.o.a.u) {
                                                        var10_10.a(var1_1, var9_9 & 15, var3_3, 0);
                                                        this.x.e(new n((this.t << 4) + var1_1, var9_9, (this.i << 4) + var3_3));
                                                    }
                                                    ++var9_9;
                                                }
                                                if (var4_6 != null) continue;
                                            }
                                            break;
                                        }
                                    } else lbl-1000:
                                    // 4 sources

                                    {
                                        var9_9 = 15;
                                    }
                                    while (var6_5 > 0) {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        v5 = var9_9;
                                                        if (var4_6 == null || var4_6 == null) break block31;
                                                        if (v5 <= 0) break;
                                                        v6 = var10_11 = this.a(var1_1, --var6_5, var3_3);
                                                        if (var4_6 != null) {
                                                            if (v6 == 0) {
                                                                var10_11 = 1;
                                                            }
                                                            v6 = var9_9 -= var10_11;
                                                        }
                                                        if (var4_6 == null) break block35;
                                                        if (v6 >= 0) break block36;
                                                        v6 = 0;
                                                    }
                                                    var9_9 = v6;
                                                }
                                                v7 = var11_13 = this.r[var6_5 >> 4];
                                                if (var4_6 == null) break block37;
                                                if (v7 == net.minecraft.o.a.u) break block38;
                                                v7 = var11_13;
                                            }
                                            v7.a(var1_1, var6_5 & 15, var3_3, var9_9);
                                        }
                                        if (var4_6 != null) continue;
                                    }
                                }
                                v3 = this.c[var3_3 << 4 | var1_1];
                            }
                            var9_9 = v3;
                            v5 = var5_4;
                        }
                        var10_12 = v5;
                        var11_14 = var9_9;
                        v8 = var9_9;
                        v9 = var5_4;
                        if (var4_6 == null) break block39;
                        if (v8 < v9) {
                            var10_12 = var9_9;
                            var11_14 = var5_4;
                        }
                        v8 = var9_9;
                        if (var4_6 == null) break block40;
                        v9 = this.q;
                    }
                    if (v8 < v9) {
                        this.q = var9_9;
                    }
                    v10 = this;
                    if (var4_6 == null) break block41;
                    v8 = v10.x.D.h() ? 1 : 0;
                }
                if (v8 != 0) {
                    for (aA var13_16 : av.HORIZONTAL) {
                        this.a(var7_7 + var13_16.r(), var8_8 + var13_16.i(), var10_12, var11_14);
                        if (var4_6 != null) {
                            if (var4_6 != null) continue;
                        }
                        break block32;
                    }
                    this.a(var7_7, var8_8, var10_12, var11_14);
                }
            }
            v10 = this;
        }
        v10.z = true;
    }

    public void b(boolean bl2) {
        this.z = bl2;
    }

    private void b(int n2, int n3, int n4) {
        block3: {
            int n5;
            int n6;
            int n7;
            block1: {
                block2: {
                    n7 = this.x.C(new n(n2, 0, n3)).b();
                    int[] arrn = net.minecraft.o.a.k();
                    n6 = n7;
                    n5 = n4;
                    if (arrn == null) break block1;
                    if (n6 <= n5) break block2;
                    this.a(n2, n3, n4, n7 + 1);
                    if (arrn != null) break block3;
                }
                n6 = n7;
                n5 = n4;
            }
            if (n6 < n5) {
                this.a(n2, n3, n7, n4 + 1);
            }
        }
    }

    public void a(f[] arrf) {
        block4: {
            f[] arrf2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.o.a.k();
                    arrf2 = this.r;
                    if (arrn == null) break block2;
                    if (arrf2.length == arrf.length) break block3;
                    f.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)arrf.length, (Object)this.r.length);
                    if (arrn != null) break block4;
                }
                arrf2 = arrf;
            }
            System.arraycopy(arrf2, 0, this.r, 0, this.r.length);
        }
    }

    @Nullable
    private f q() {
        int[] arrn = net.minecraft.o.a.k();
        for (int i2 = this.r.length - 1; i2 >= 0; --i2) {
            f f10 = this.r[i2];
            if (arrn != null) {
                if (f10 == u) continue;
                f10 = this.r[i2];
            }
            return f10;
        }
        return null;
    }

    public void g(boolean bl2) {
        this.y = bl2;
    }

    /*
     * WARNING - void declaration
     */
    private void c(boolean bl2) {
        block9: {
            z z2;
            block12: {
                block13: {
                    int[] arrn = net.minecraft.o.a.k();
                    this.x.H.b("recheckGaps");
                    int[] arrn2 = arrn;
                    z2 = this.x;
                    if (arrn2 == null) break block12;
                    if (!z2.a(new n(this.t * 16 + 8, 0, this.i * 16 + 8), 16)) break block13;
                    int n2 = 0;
                    block0: while (true) {
                        int n3 = n2;
                        block1: while (n3 < 16) {
                            if (arrn2 == null) break block9;
                            int n4 = 0;
                            while (n4 < 16) {
                                block11: {
                                    block15: {
                                        int n5;
                                        int n6;
                                        void var5_5;
                                        block10: {
                                            int n7;
                                            block14: {
                                                n3 = this.e[n2 + n4 * 16];
                                                if (arrn2 == null) continue block1;
                                                if (arrn2 == null) break block14;
                                                if (n3 == 0) break block15;
                                                this.e[n2 + n4 * 16] = false;
                                                n7 = this.b(n2, n4);
                                            }
                                            var5_5 = n7;
                                            n6 = this.t * 16 + n2;
                                            n5 = this.i * 16 + n4;
                                            int n8 = Integer.MAX_VALUE;
                                            for (aA aA2 : av.HORIZONTAL) {
                                                n8 = Math.min(n8, this.x.d(n6 + aA2.r(), n5 + aA2.i()));
                                                if (arrn2 != null) {
                                                    if (arrn2 != null) continue;
                                                }
                                                break block10;
                                            }
                                            this.b(n6, n5, n8);
                                        }
                                        for (aA aA2 : av.HORIZONTAL) {
                                            this.b(n6 + aA2.r(), n5 + aA2.i(), (int)var5_5);
                                            if (arrn2 != null) {
                                                if (arrn2 != null) continue;
                                            }
                                            break block11;
                                        }
                                        if (bl2) {
                                            this.x.H.c();
                                            return;
                                        }
                                    }
                                    ++n4;
                                }
                                if (arrn2 != null) continue;
                            }
                            ++n2;
                            if (arrn2 != null) continue block0;
                        }
                        break;
                    }
                    this.d = false;
                }
                z2 = this.x;
            }
            z2.H.c();
        }
    }

    public boolean j() {
        return this.k;
    }

    public Random c(long l2) {
        return new Random(this.x.C() + (long)(this.t * this.t * 4987142) + (long)(this.t * 5947611) + (long)(this.i * this.i) * 4392871L + (long)(this.i * 389711) ^ l2);
    }

    public void h(boolean bl2) {
        this.k = bl2;
    }

    public void a(x x2, int n2) {
        int[] arrn = net.minecraft.o.a.k();
        int n3 = n2;
        if (arrn != null) {
            if (n3 < 0) {
                n2 = 0;
            }
            n3 = n2;
        }
        if (arrn != null) {
            if (n3 >= this.p.length) {
                n2 = this.p.length - 1;
            }
            n3 = this.p[n2].remove(x2) ? 1 : 0;
        }
    }

    private void i() {
        block2: {
            int[] arrn = net.minecraft.o.a.k();
            for (int i2 = 0; i2 < this.e.length; ++i2) {
                this.e[i2] = true;
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block2;
            }
            this.c(false);
        }
    }

    public void a(x x2) {
        block11: {
            int n2;
            int n3;
            int[] arrn;
            block9: {
                block10: {
                    block7: {
                        int n4;
                        int n5;
                        block8: {
                            this.n = true;
                            n5 = net.minecraft.k.h.f(x2.a / 16.0);
                            arrn = net.minecraft.o.a.k();
                            n4 = net.minecraft.k.h.f(x2.ax / 16.0);
                            if (arrn == null) break block7;
                            if (n5 != this.t) break block8;
                            n3 = n4;
                            if (arrn == null) break block9;
                            if (n3 == this.i) break block10;
                        }
                        f.warn("Wrong location! ({}, {}) should be ({}, {}), {}", (Object)n5, (Object)n4, (Object)this.t, (Object)this.i, (Object)x2);
                    }
                    x2.a();
                }
                n3 = net.minecraft.k.h.f(x2.aF / 16.0);
            }
            int n6 = n2 = n3;
            if (arrn != null) {
                if (n6 < 0) {
                    n2 = 0;
                }
                n6 = n2;
            }
            if (arrn != null) {
                if (n6 >= this.p.length) {
                    n2 = this.p.length - 1;
                }
                x2.D = true;
                x2.v = this.t;
                x2.q = n2;
                x2.y = this.i;
                n6 = this.p[n2].add(x2) ? 1 : 0;
            }
            if (net.minecraft.k.m.d()) break block11;
            net.minecraft.o.a.b(new int[4]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public i c(int n2, int n3, int n4) {
        f f10;
        block11: {
            f f11;
            int n5;
            int[] arrn;
            block10: {
                block12: {
                    i i2;
                    block14: {
                        int n6;
                        int n7;
                        block13: {
                            arrn = net.minecraft.o.a.k();
                            if (this.x.a() != L.e) break block12;
                            i2 = null;
                            if (n3 == 60) {
                                i2 = net.minecraft.u.g.ah.d();
                            }
                            n7 = n3;
                            n6 = 70;
                            if (arrn == null) break block13;
                            if (n7 != n6) break block14;
                            n7 = n2;
                            n6 = n4;
                        }
                        i2 = net.minecraft.aA.a.a(n7, n6);
                    }
                    i i3 = i2;
                    if (arrn == null) return i3;
                    i3 = i3 == null ? net.minecraft.u.g.bf.d() : i2;
                    return i3;
                }
                try {
                    n5 = n3;
                    if (arrn == null) break block10;
                    if (n5 < 0) return net.minecraft.u.g.bf.d();
                }
                catch (Throwable throwable) {
                    net.minecraft.c.f f12 = net.minecraft.c.f.a(throwable, "Getting block state");
                    net.minecraft.c.l l2 = f12.a("Block being got");
                    l2.a("Location", new h(this, n2, n3, n4));
                    throw new Z(f12);
                }
                n5 = n3 >> 4;
            }
            if (n5 >= this.r.length) return net.minecraft.u.g.bf.d();
            f10 = f11 = this.r[n3 >> 4];
            if (arrn == null) break block11;
            if (f10 == u) return net.minecraft.u.g.bf.d();
            f10 = f11;
        }
        return f10.c(n2 & 0xF, n3 & 0xF, n4 & 0xF);
    }

    public void a(y y2) {
        int[] arrn = net.minecraft.o.a.k();
        this.a(y2.j(), y2);
        int[] arrn2 = arrn;
        boolean bl2 = this.y;
        if (arrn2 != null && bl2) {
            bl2 = this.x.b(y2);
        }
    }

    public boolean u() {
        return this.m;
    }

    public i c(n n2) {
        return this.c(n2.e(), n2.b(), n2.a());
    }

    public a(z z2, l l2, int n2, int n3) {
        this(z2, n2, n3);
        int n4 = 256;
        int[] arrn = net.minecraft.o.a.k();
        boolean bl2 = z2.D.h();
        int n5 = 0;
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < 16) {
                int n7 = 0;
                while (n7 < 16) {
                    block9: {
                        n6 = 0;
                        if (arrn == null) continue block1;
                        int n8 = n6;
                        while (n8 < 256) {
                            i i2 = l2.b(n5, n8, n7);
                            if (arrn != null) {
                                if (arrn != null) {
                                    if (i2.o() != net.minecraft.ac.c.A) {
                                        int n9 = n8 >> 4;
                                        f f10 = this.r[n9];
                                        if (arrn != null) {
                                            if (f10 == u) {
                                                this.r[n9] = new f(n9 << 4, bl2);
                                            }
                                            f10 = this.r[n9];
                                        }
                                        f10.a(n5, n8 & 0xF, n7, i2);
                                    }
                                    ++n8;
                                }
                                if (arrn != null) continue;
                            }
                            break block9;
                        }
                        ++n7;
                    }
                    if (arrn != null) continue;
                }
                ++n5;
                if (arrn != null) continue block0;
            }
            break;
        }
    }

    public void a(long l2) {
        this.g = l2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void s() {
        var1_1 = net.minecraft.o.a.k();
        if (this.o >= 4096) return;
        var2_2 = new n(this.t << 4, 0, this.i << 4);
        var3_3 = 0;
        do {
            v0 = var3_3;
            block1: while (true) {
                if (v0 >= 8) return;
                v1 = this.o;
                v2 = 4096;
                if (var1_1 != null) {
                    if (v1 >= v2) {
                        return;
                    }
                    v1 = this.o;
                    v2 = 16;
                }
                var4_4 = v1 % v2;
                var5_5 = this.o / 16 % 16;
                var6_6 = this.o / 256;
                ++this.o;
                block2: for (var7_7 = 0; var7_7 < 16; ++var7_7) {
                    block27: {
                        block28: {
                            block26: {
                                block25: {
                                    var8_8 = var2_2.a(var5_5, (var4_4 << 4) + var7_7, var6_6);
                                    v0 = var7_7;
                                    if (var1_1 == null) continue block1;
                                    if (var1_1 == null) break block25;
                                    if (v0 == 0) ** GOTO lbl-1000
                                    v3 = var7_7;
                                    if (var1_1 == null) break block25;
                                    if (v3 == 15) ** GOTO lbl-1000
                                    v3 = var5_5;
                                    if (var1_1 == null) break block25;
                                    if (v3 == 0) ** GOTO lbl-1000
                                    v3 = var5_5;
                                    if (var1_1 != null) {
                                        if (v3 != 15) {
                                            v3 = var6_6;
                                            if (var1_1 != null) {
                                                if (v3 != 0) {
                                                    v3 = var6_6;
                                                    if (var1_1 != null) {
                                                        ** if (v3 != 15) goto lbl-1000
                                                    } else {
                                                        ** GOTO lbl45
                                                    }
                                                } else {
                                                    ** GOTO lbl44
                                                }
                                            } else {
                                                ** GOTO lbl43
                                            }
                                        } else {
                                            ** GOTO lbl42
                                        }
                                    }
                                    break block25;
lbl42:
                                    // 2 sources

                                    ** GOTO lbl-1000
lbl43:
                                    // 2 sources

                                    break block25;
lbl44:
                                    // 2 sources

                                    ** GOTO lbl-1000
lbl45:
                                    // 2 sources

                                    break block25;
lbl-1000:
                                    // 6 sources

                                    {
                                        v3 = 1;
                                        ** GOTO lbl49
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        v3 = 0;
                                    }
                                }
                                var9_9 = v3;
                                v4 = this.r[var4_4];
                                v5 = net.minecraft.o.a.u;
                                if (var1_1 == null) break block26;
                                if (v4 == v5 && var9_9 != 0) break block27;
                                v4 = this.r[var4_4];
                                if (var1_1 == null) break block28;
                                v5 = net.minecraft.o.a.u;
                            }
                            if (v4 == v5) continue;
                            v4 = this.r[var4_4];
                        }
                        if (v4.c(var5_5, var7_7, var6_6).o() != net.minecraft.ac.c.A) continue;
                    }
                    var10_10 = aA.values();
                    var11_11 = var10_10.length;
                    var12_12 = 0;
                    while (var12_12 < var11_11) {
                        var13_13 = var10_10[var12_12];
                        var14_14 = var8_8.a(var13_13);
                        if (var1_1 != null) {
                            v6 = this.x.d(var14_14).h();
                            if (var1_1 == null) continue block2;
                            if (v6 > 0) {
                                this.x.i(var14_14);
                            }
                            ++var12_12;
                        }
                        if (var1_1 != null) continue;
                    }
                    v6 = this.x.i(var8_8);
                    if (var1_1 != null) continue;
                }
                break;
            }
            ++var3_3;
        } while (var1_1 != null);
    }

    @Nullable
    public i a(n n2, i i2) {
        i i3;
        block52: {
            y y2;
            block53: {
                y y3;
                int n3;
                K k2;
                int[] arrn;
                block49: {
                    K k3;
                    block51: {
                        block50: {
                            K k4;
                            block46: {
                                a a10;
                                block48: {
                                    block47: {
                                        block42: {
                                            block37: {
                                                a a11;
                                                int n4;
                                                int n5;
                                                block45: {
                                                    block44: {
                                                        int n6;
                                                        block43: {
                                                            int n7;
                                                            int n8;
                                                            int n9;
                                                            block40: {
                                                                block41: {
                                                                    int n10;
                                                                    int n11;
                                                                    block38: {
                                                                        block39: {
                                                                            int n12;
                                                                            block35: {
                                                                                block36: {
                                                                                    K k5;
                                                                                    K k6;
                                                                                    int n13;
                                                                                    block30: {
                                                                                        block34: {
                                                                                            f f10;
                                                                                            block31: {
                                                                                                boolean bl2;
                                                                                                block32: {
                                                                                                    block33: {
                                                                                                        n5 = n2.e() & 0xF;
                                                                                                        n11 = n2.b();
                                                                                                        n4 = n2.a() & 0xF;
                                                                                                        int n14 = n4 << 4 | n5;
                                                                                                        arrn = net.minecraft.o.a.k();
                                                                                                        int n15 = n11;
                                                                                                        if (arrn != null) {
                                                                                                            if (n15 >= this.h[n14] - 1) {
                                                                                                                this.h[n14] = -999;
                                                                                                            }
                                                                                                            n15 = this.c[n14];
                                                                                                        }
                                                                                                        n10 = n15;
                                                                                                        i i4 = i3 = this.c(n2);
                                                                                                        if (arrn != null) {
                                                                                                            if (i4 == i2) {
                                                                                                                return null;
                                                                                                            }
                                                                                                            i4 = i2;
                                                                                                        }
                                                                                                        k2 = i4.b();
                                                                                                        k4 = i3.b();
                                                                                                        f10 = this.r[n11 >> 4];
                                                                                                        n13 = 0;
                                                                                                        f f11 = f10;
                                                                                                        if (arrn != null) {
                                                                                                            if (f11 == u) {
                                                                                                                if (k2 == net.minecraft.u.g.bf) {
                                                                                                                    return null;
                                                                                                                }
                                                                                                                this.r[n11 >> 4] = f10 = new f(n11 >> 4 << 4, this.x.D.h());
                                                                                                                int n16 = n11;
                                                                                                                if (arrn != null) {
                                                                                                                    n16 = n16 >= n10 ? 1 : 0;
                                                                                                                }
                                                                                                                n13 = n16;
                                                                                                            }
                                                                                                            f11 = f10;
                                                                                                        }
                                                                                                        f11.a(n5, n11 & 0xF, n4, i2);
                                                                                                        k6 = k4;
                                                                                                        k5 = k2;
                                                                                                        if (arrn == null) break block30;
                                                                                                        if (k6 == k5) break block31;
                                                                                                        bl2 = this.x.C;
                                                                                                        if (arrn == null) break block32;
                                                                                                        if (bl2) break block33;
                                                                                                        k4.a(this.x, n2, i3);
                                                                                                        if (arrn != null) break block31;
                                                                                                    }
                                                                                                    k6 = k4;
                                                                                                    if (arrn == null) break block34;
                                                                                                    bl2 = k6 instanceof dA;
                                                                                                }
                                                                                                if (bl2) {
                                                                                                    this.x.z(n2);
                                                                                                }
                                                                                            }
                                                                                            k6 = f10.c(n5, n11 & 0xF, n4).b();
                                                                                        }
                                                                                        k5 = k2;
                                                                                    }
                                                                                    if (k6 != k5) {
                                                                                        return null;
                                                                                    }
                                                                                    n12 = n13;
                                                                                    if (arrn == null) break block35;
                                                                                    if (n12 == 0) break block36;
                                                                                    this.f();
                                                                                    if (arrn != null) break block37;
                                                                                }
                                                                                n12 = i2.j();
                                                                            }
                                                                            n9 = n12;
                                                                            n8 = i3.j();
                                                                            n3 = n9;
                                                                            if (arrn == null) break block38;
                                                                            if (n3 <= 0) break block39;
                                                                            n3 = n11;
                                                                            n7 = n10;
                                                                            if (arrn == null) break block40;
                                                                            if (n3 < n7) break block41;
                                                                            this.d(n5, n11 + 1, n4);
                                                                            if (arrn != null) break block41;
                                                                        }
                                                                        n3 = n11;
                                                                    }
                                                                    n7 = n10 - 1;
                                                                    if (arrn == null) break block40;
                                                                    if (n3 == n7) {
                                                                        this.d(n5, n11, n4);
                                                                    }
                                                                }
                                                                n3 = n9;
                                                                if (arrn == null) break block42;
                                                                n7 = n8;
                                                            }
                                                            if (n3 == n7) break block37;
                                                            n6 = n9;
                                                            if (arrn == null) break block43;
                                                            if (n6 < n8) break block44;
                                                            a11 = this;
                                                            if (arrn == null) break block45;
                                                            n6 = a11.a(net.minecraft.ah.c.SKY, n2);
                                                        }
                                                        if (n6 > 0) break block44;
                                                        n3 = this.a(net.minecraft.ah.c.BLOCK, n2);
                                                        if (arrn == null) break block42;
                                                        if (n3 <= 0) break block37;
                                                    }
                                                    a11 = this;
                                                }
                                                a11.d(n5, n4);
                                            }
                                            n3 = k4 instanceof dA;
                                        }
                                        if (arrn == null) break block46;
                                        if (n3 == 0) break block47;
                                        a10 = this;
                                        if (arrn == null) break block48;
                                        y y4 = a10.a(n2, net.minecraft.o.j.CHECK);
                                        if (y4 != null) {
                                            y4.t();
                                        }
                                    }
                                    a10 = this;
                                }
                                n3 = a10.x.C ? 1 : 0;
                            }
                            if (arrn == null) break block49;
                            if (n3 != 0) break block50;
                            k3 = k4;
                            if (arrn == null) break block51;
                            if (k3 != k2) {
                                k2.b(this.x, n2, i2);
                            }
                        }
                        k3 = k2;
                    }
                    n3 = k3 instanceof dA;
                }
                if (n3 == 0) break block52;
                y2 = y3 = this.a(n2, net.minecraft.o.j.CHECK);
                if (arrn != null) {
                    if (y2 == null) {
                        y3 = ((dA)((Object)k2)).a(this.x, k2.d(i2));
                        this.x.b(n2, y3);
                    }
                    y2 = y3;
                }
                if (arrn == null) break block53;
                if (y2 == null) break block52;
                y2 = y3;
            }
            y2.t();
        }
        this.z = true;
        return i3;
    }

    public void a(byte[] arrby) {
        block4: {
            byte[] arrby2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.o.a.k();
                    arrby2 = this.a;
                    if (arrn == null) break block2;
                    if (arrby2.length == arrby.length) break block3;
                    f.warn("Could not set level chunk biomes, array length is {} instead of {}", (Object)arrby.length, (Object)this.a.length);
                    if (arrn != null) break block4;
                }
                arrby2 = arrby;
            }
            System.arraycopy(arrby2, 0, this.a, 0, this.a.length);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(c c10, n n2) {
        int n3;
        c c11;
        block8: {
            c c12;
            f f10;
            int n4;
            int n5;
            int n6;
            block7: {
                n6 = n2.e() & 0xF;
                n5 = n2.b();
                n4 = n2.a() & 0xF;
                int[] arrn = net.minecraft.o.a.k();
                f10 = this.r[n5 >> 4];
                if (f10 == u) {
                    int n7 = this.a(n2);
                    if (arrn == null) return n7;
                    if (n7 == 0) return 0;
                    n7 = c10.defaultLightValue;
                    return n7;
                }
                c c12 = c10;
                c12 = net.minecraft.ah.c.SKY;
                if (arrn == null) break block7;
                if (c11 == c12) {
                    int n8 = this.x.D.h();
                    if (arrn == null) return n8;
                    if (n8 == 0) {
                        return 0;
                    }
                    n8 = f10.b(n6, n5 & 0xF, n4);
                    return n8;
                }
                c11 = c10;
                if (arrn == null) break block8;
                c12 = net.minecraft.ah.c.BLOCK;
            }
            if (c11 == c12) {
                n3 = f10.a(n6, n5 & 0xF, n4);
                return n3;
            }
            c11 = c10;
        }
        n3 = c11.defaultLightValue;
        return n3;
    }

    public boolean y() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        int[] arrn = net.minecraft.o.a.k();
        boolean bl2 = this.w;
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.k;
        }
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.m;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void a(@Nullable x x2, net.minecraft.k.k k2, List<x> list, Predicate<? super x> predicate) {
        int n2 = net.minecraft.k.h.f((k2.b - 2.0) / 16.0);
        int n3 = net.minecraft.k.h.f((k2.a + 2.0) / 16.0);
        n2 = net.minecraft.k.h.c(n2, 0, this.p.length - 1);
        n3 = net.minecraft.k.h.c(n3, 0, this.p.length - 1);
        int[] arrn = net.minecraft.o.a.k();
        int n4 = n2;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 <= n3) {
                block13: {
                    net.minecraft.ar.a<x> a10;
                    block12: {
                        a10 = this.p[n4];
                        if (arrn == null) break block12;
                        if (a10.isEmpty()) break block13;
                        a10 = this.p[n4];
                    }
                    Iterator<x> iterator = a10.iterator();
                    while (iterator.hasNext()) {
                        block15: {
                            x x3;
                            x x4;
                            block14: {
                                x3 = x4 = iterator.next();
                                if (arrn == null) break block14;
                                n5 = x3.m().c(k2) ? 1 : 0;
                                if (arrn == null) continue block1;
                                if (n5 == 0) break block15;
                                x3 = x4;
                            }
                            x x5 = x2;
                            block3: while (x3 != x5) {
                                x[] arrx;
                                block18: {
                                    boolean bl2;
                                    block17: {
                                        Predicate<? super x> predicate2;
                                        block16: {
                                            predicate2 = predicate;
                                            if (arrn == null) break block16;
                                            if (predicate2 == null) break block17;
                                            predicate2 = predicate;
                                        }
                                        bl2 = predicate2.apply((Object)x4);
                                        if (arrn == null || !bl2) break block18;
                                    }
                                    bl2 = list.add(x4);
                                }
                                x[] arrx2 = arrx = x4.aE();
                                if (arrn != null) {
                                    if (arrx2 == null) break;
                                    arrx2 = arrx;
                                }
                                x[] arrx3 = arrx2;
                                int n6 = arrx3.length;
                                int n7 = 0;
                                while (n7 < n6) {
                                    block19: {
                                        block20: {
                                            boolean bl3;
                                            x x6;
                                            block22: {
                                                Predicate<? super x> predicate3;
                                                block21: {
                                                    x6 = arrx3[n7];
                                                    if (arrn == null) break block19;
                                                    x3 = x6;
                                                    x5 = x2;
                                                    if (arrn == null) continue block3;
                                                    if (x3 == x5 || !x6.m().c(k2)) break block20;
                                                    predicate3 = predicate;
                                                    if (arrn == null) break block21;
                                                    if (predicate3 == null) break block22;
                                                    predicate3 = predicate;
                                                }
                                                bl3 = predicate3.apply((Object)x6);
                                                if (arrn == null || !bl3) break block20;
                                            }
                                            bl3 = list.add(x6);
                                        }
                                        ++n7;
                                    }
                                    if (arrn != null) continue;
                                }
                                break block3;
                            }
                        }
                        if (arrn != null) continue;
                    }
                }
                ++n4;
                if (arrn != null) continue block0;
            }
            break;
        }
    }

    public void b(n n2) {
        block3: {
            y y2;
            block4: {
                y y3;
                Object object;
                int[] arrn;
                block2: {
                    arrn = net.minecraft.o.a.k();
                    object = this;
                    if (arrn == null) break block2;
                    if (!((a)object).y) break block3;
                    object = this.j.remove(n2);
                }
                y2 = y3 = (y)object;
                if (arrn == null) break block4;
                if (y2 == null) break block3;
                y2 = y3;
            }
            y2.i();
        }
    }

    public boolean e(int n2, int n3) {
        int n4;
        int[] arrn = net.minecraft.o.a.k();
        int n5 = n2;
        if (arrn != null) {
            if (n5 < 0) {
                n2 = 0;
            }
            n5 = n3;
        }
        if (arrn != null) {
            if (n5 >= 256) {
                n3 = 255;
            }
            n5 = n4 = n2;
        }
        while (n4 <= n3) {
            block8: {
                block9: {
                    boolean bl2;
                    block10: {
                        f f10 = this.r[n4 >> 4];
                        if (arrn == null) break block8;
                        if (f10 == u) break block9;
                        bl2 = f10.i();
                        if (arrn == null) break block10;
                        if (bl2) break block9;
                        bl2 = false;
                    }
                    return bl2;
                }
                n4 += 16;
            }
            if (arrn != null) continue;
        }
        return true;
    }

    public f[] n() {
        return this.r;
    }

    private boolean a(int n2, int n3) {
        int n4;
        block28: {
            int n5;
            o o2;
            int[] arrn;
            block27: {
                int n6;
                int n7 = this.b();
                int n8 = 0;
                arrn = net.minecraft.o.a.k();
                int n9 = 0;
                o2 = new o((this.t << 4) + n2, 0, (this.i << 4) + n3);
                n5 = n7 + 16 - 1;
                do {
                    block33: {
                        int n10;
                        block36: {
                            block35: {
                                block34: {
                                    int n11;
                                    block31: {
                                        block32: {
                                            block29: {
                                                block30: {
                                                    int n12;
                                                    if (n5 <= this.x.y()) {
                                                        n12 = n5;
                                                        if (arrn != null) {
                                                            if (arrn != null) {
                                                                if (n12 <= 0) break;
                                                                n6 = n9;
                                                                if (arrn != null) {
                                                                    if (n6 != 0) break;
                                                                }
                                                            }
                                                            break block27;
                                                        }
                                                    } else {
                                                        o2.a(o2.e(), n5, o2.a());
                                                        n12 = this.e(o2);
                                                    }
                                                    n10 = n11 = n12;
                                                    if (arrn == null) break block29;
                                                    if (n10 != 255) break block30;
                                                    n10 = o2.b();
                                                    if (arrn == null) break block29;
                                                    if (n10 < this.x.y()) {
                                                        n9 = 1;
                                                    }
                                                }
                                                n10 = n8;
                                            }
                                            if (arrn == null) break block31;
                                            if (n10 != 0) break block32;
                                            n10 = n11;
                                            if (arrn == null) break block31;
                                            if (n10 <= 0) break block32;
                                            n8 = 1;
                                            if (arrn != null) break block33;
                                        }
                                        n10 = n8;
                                    }
                                    if (arrn == null) break block34;
                                    if (n10 == 0) break block33;
                                    n10 = n11;
                                }
                                if (arrn == null) break block35;
                                if (n10 != 0) break block33;
                                n10 = this.x.i(o2) ? 1 : 0;
                            }
                            if (arrn == null) break block36;
                            if (n10 != 0) break block33;
                            n10 = 0;
                        }
                        return n10 != 0;
                    }
                    --n5;
                } while (arrn != null);
                n6 = n5 = o2.b();
            }
            while (n5 > 0) {
                o2.a(o2.e(), n5, o2.a());
                if (arrn != null) {
                    n4 = this.c(o2).h();
                    if (arrn == null) break block28;
                    if (n4 > 0) {
                        this.x.i(o2);
                    }
                    --n5;
                }
                if (arrn != null) continue;
            }
            n4 = 1;
        }
        return n4 != 0;
    }

    public int v() {
        return this.q;
    }

    public void b(x x2) {
        this.a(x2, x2.q);
    }

    /*
     * WARNING - void declaration
     */
    public void a(net.minecraft.C.m m2, int n2, boolean n3) {
        a a10;
        int[] arrn;
        block15: {
            int n4;
            int n5;
            block14: {
                boolean bl2 = this.x.D.h();
                n5 = 0;
                arrn = net.minecraft.o.a.k();
                while (n5 < this.r.length) {
                    block19: {
                        block18: {
                            void object;
                            f f10;
                            block17: {
                                int n6;
                                block16: {
                                    f10 = this.r[n5];
                                    n4 = n2 & 1 << n5;
                                    if (arrn == null) break block14;
                                    if (arrn == null) break block16;
                                    if (n4 != 0) break block17;
                                    n6 = n3;
                                }
                                if (n6 == false || f10 == u) break block18;
                                this.r[n5] = u;
                                if (arrn != null) break block18;
                            }
                            f f11 = f10;
                            if (arrn != null) {
                                if (f11 == u) {
                                    f f12;
                                    this.r[n5] = f12 = new f(n5 << 4, bl2);
                                }
                                f11 = object;
                            }
                            f11.f().a(m2);
                            m2.readBytes(object.c().a());
                            if (arrn == null) break block19;
                            if (bl2) {
                                m2.readBytes(object.a().a());
                            }
                        }
                        ++n5;
                    }
                    if (arrn != null) continue;
                }
                n4 = n3;
            }
            if (arrn != null) {
                if (n4 != 0) {
                    m2.readBytes(this.a);
                }
                n4 = n5 = 0;
            }
            while (n5 < this.r.length) {
                a10 = this;
                if (arrn != null) {
                    if (a10.r[n5] != u && (n2 & 1 << n5) != 0) {
                        this.r[n5].g();
                    }
                    ++n5;
                    if (arrn != null) continue;
                }
                break block15;
            }
            this.m = true;
            this.k = true;
            this.r();
            a10 = this;
        }
        for (y y2 : a10.j.values()) {
            y2.t();
            if (arrn != null) continue;
        }
    }

    private void a(aA aA2) {
        block12: {
            int n2;
            aA aA3;
            aA aA4;
            int[] arrn;
            block17: {
                block18: {
                    block15: {
                        block16: {
                            block13: {
                                block14: {
                                    arrn = net.minecraft.o.a.k();
                                    if (!this.k) break block12;
                                    aA4 = aA2;
                                    aA3 = aA.EAST;
                                    if (arrn == null) break block13;
                                    if (aA4 != aA3) break block14;
                                    for (n2 = 0; n2 < 16; ++n2) {
                                        this.a(15, n2);
                                        if (arrn != null) {
                                            if (arrn != null) continue;
                                        }
                                        break block12;
                                    }
                                    if (arrn != null) break block12;
                                }
                                aA4 = aA2;
                                aA3 = aA.WEST;
                            }
                            if (arrn == null) break block15;
                            if (aA4 != aA3) break block16;
                            for (n2 = 0; n2 < 16; ++n2) {
                                this.a(0, n2);
                                if (arrn != null) {
                                    if (arrn != null) continue;
                                }
                                break block12;
                            }
                            if (arrn != null) break block12;
                        }
                        aA4 = aA2;
                        aA3 = aA.SOUTH;
                    }
                    if (arrn == null) break block17;
                    if (aA4 != aA3) break block18;
                    for (n2 = 0; n2 < 16; ++n2) {
                        this.a(n2, 15);
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block12;
                    }
                    if (arrn != null) break block12;
                }
                aA4 = aA2;
                aA3 = aA.NORTH;
            }
            if (aA4 == aA3) {
                for (n2 = 0; n2 < 16; ++n2) {
                    this.a(n2, 0);
                    if (arrn != null) continue;
                }
            }
        }
    }

    public boolean a(n n2) {
        int n3 = n2.e() & 0xF;
        int n4 = n2.b();
        int[] arrn = net.minecraft.o.a.k();
        int n5 = n2.a() & 0xF;
        int n6 = n4;
        if (arrn != null) {
            n6 = n6 >= this.c[n5 << 4 | n3] ? 1 : 0;
        }
        return n6 != 0;
    }

    public void a(c c10, n n2, int n3) {
        block8: {
            c c11;
            c c12;
            f f10;
            int n4;
            int n5;
            int n6;
            block6: {
                block7: {
                    n6 = n2.e() & 0xF;
                    n5 = n2.b();
                    int[] arrn = net.minecraft.o.a.k();
                    n4 = n2.a() & 0xF;
                    f10 = this.r[n5 >> 4];
                    if (arrn != null) {
                        if (f10 == u) {
                            this.r[n5 >> 4] = f10 = new f(n5 >> 4 << 4, this.x.D.h());
                            this.f();
                        }
                        this.z = true;
                    }
                    c12 = c10;
                    c11 = net.minecraft.ah.c.SKY;
                    if (arrn == null) break block6;
                    if (c12 != c11) break block7;
                    if (!this.x.D.h()) break block8;
                    f10.a(n6, n5 & 0xF, n4, n3);
                    if (arrn != null) break block8;
                }
                c12 = c10;
                c11 = net.minecraft.ah.c.BLOCK;
            }
            if (c12 == c11) {
                f10.b(n6, n5 & 0xF, n4, n3);
            }
        }
    }

    protected void r() {
        block7: {
            int n2 = this.b();
            this.q = Integer.MAX_VALUE;
            int n3 = 0;
            int[] arrn = net.minecraft.o.a.k();
            block0: while (true) {
                int n4 = n3;
                block1: while (n4 < 16) {
                    if (arrn == null) break block7;
                    int n5 = 0;
                    block2: while (true) {
                        int n6 = n5;
                        block3: while (n6 < 16) {
                            this.h[n3 + (n5 << 4)] = -999;
                            n4 = n2 + 16;
                            if (arrn == null) continue block1;
                            int n7 = n4;
                            while (n7 > 0) {
                                i i2 = this.c(n3, n7 - 1, n5);
                                if (arrn != null) {
                                    n6 = i2.j();
                                    if (arrn == null) continue block3;
                                    if (n6 != 0) {
                                        this.c[n5 << 4 | n3] = n7;
                                        if (arrn == null) continue block2;
                                        if (n7 >= this.q) break;
                                        this.q = n7;
                                        if (arrn != null) break;
                                    }
                                    --n7;
                                }
                                if (arrn != null) continue;
                            }
                            ++n5;
                            if (arrn != null) continue block2;
                        }
                        break;
                    }
                    ++n3;
                    if (arrn != null) continue block0;
                }
                break;
            }
            this.z = true;
        }
    }

    public void c() {
        a a10;
        int[] arrn;
        block3: {
            this.y = false;
            net.minecraft.ar.a<x>[] arra = this.j.values().iterator();
            arrn = net.minecraft.o.a.k();
            while (arra.hasNext()) {
                y y2 = arra.next();
                a10 = this;
                if (arrn != null) {
                    a10.x.a(y2);
                    if (arrn != null) continue;
                }
                break block3;
            }
            a10 = this;
        }
        for (net.minecraft.ar.a<x> a11 : a10.p) {
            this.x.a(a11);
            if (arrn != null) continue;
        }
    }

    static {
        f = LogManager.getLogger();
        u = null;
        net.minecraft.o.a.b(new int[4]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public y a(n n2, j j2) {
        y y2;
        y y3;
        block8: {
            int[] arrn;
            block4: {
                block5: {
                    j j3;
                    j j4;
                    block6: {
                        block7: {
                            y3 = this.j.get(n2);
                            arrn = net.minecraft.o.a.k();
                            y2 = y3;
                            if (arrn == null) break block4;
                            if (y2 != null) break block5;
                            j4 = j2;
                            j3 = net.minecraft.o.j.IMMEDIATE;
                            if (arrn == null) break block6;
                            if (j4 != j3) break block7;
                            y3 = this.f(n2);
                            this.x.b(n2, y3);
                            if (arrn != null) break block8;
                        }
                        j4 = j2;
                        j3 = net.minecraft.o.j.QUEUED;
                    }
                    if (j4 != j3) break block8;
                    this.v.add(n2);
                    if (arrn != null) break block8;
                }
                y2 = y3;
            }
            if (arrn == null) return y2;
            if (y2.a()) {
                this.j.remove(n2);
                return null;
            }
        }
        y2 = y3;
        return y2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(n n2, int n3) {
        int n4;
        int n5 = n2.e() & 0xF;
        int[] arrn = net.minecraft.o.a.k();
        int n6 = n2.b();
        int n7 = n2.a() & 0xF;
        f f10 = this.r[n6 >> 4];
        if (f10 == u) {
            int n8 = this.x.D.h();
            if (arrn != null) {
                if (n8 == 0) return 0;
                n8 = n3;
            }
            int n9 = net.minecraft.ah.c.SKY.defaultLightValue;
            if (arrn != null) {
                if (n8 >= n9) return 0;
                int n9 = net.minecraft.ah.c.SKY.defaultLightValue;
                n9 = n3;
            }
            int n10 = n8 - n9;
            return n10;
        }
        int n11 = this.x.D.h();
        if (arrn != null) {
            n11 = n11 == 0 ? 0 : f10.b(n5, n6 & 0xF, n7);
        }
        int n12 = n11;
        int n13 = n4 = f10.a(n5, n6 & 0xF, n7);
        if (arrn == null) return n13;
        if (n13 > (n12 -= n3)) {
            n12 = n4;
        }
        n13 = n12;
        return n13;
    }

    public z z() {
        return this.x;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private y f(n n2) {
        K k2;
        i i2 = this.c(n2);
        int[] arrn = net.minecraft.o.a.k();
        K k3 = k2 = i2.b();
        if (arrn != null) {
            if (!k3.e()) {
                return null;
            }
            k3 = k2;
        }
        y y2 = ((dA)((Object)k3)).a(this.x, i2.b().d(i2));
        return y2;
    }

    private void a(int n2, int n3, int n4, int n5) {
        block5: {
            int n6;
            int[] arrn;
            block7: {
                int n7;
                block6: {
                    arrn = net.minecraft.o.a.k();
                    n7 = n5;
                    if (arrn == null) break block6;
                    if (n7 <= n4) break block5;
                    n7 = this.x.a(new n(n2, 0, n3), 16) ? 1 : 0;
                }
                if (arrn == null) break block7;
                if (n7 == 0) break block5;
                n7 = n6 = n4;
            }
            while (n6 < n5) {
                this.x.c(net.minecraft.ah.c.SKY, new n(n2, n6, n3));
                ++n6;
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block5;
            }
            this.z = true;
        }
    }

    public void h() {
        this.o = 0;
    }
}

