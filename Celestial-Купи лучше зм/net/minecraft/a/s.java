/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  javax.annotation.Nullable
 */
package net.minecraft.a;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.a.D;
import net.minecraft.a.F;
import net.minecraft.a.h;
import net.minecraft.a.j;
import net.minecraft.a.k;
import net.minecraft.a.l;
import net.minecraft.ah.A;
import net.minecraft.ah.G;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.a;

public class s {
    private final /* synthetic */ List<l> a;
    private final /* synthetic */ List<l> j;
    private final /* synthetic */ List<net.minecraft.i.k> k;
    private final /* synthetic */ Long2ObjectMap<l> l;
    private /* synthetic */ boolean d;
    private final /* synthetic */ A b;
    private static final /* synthetic */ Predicate<net.minecraft.i.k> h;
    private final /* synthetic */ Set<l> g;
    private final /* synthetic */ List<l> m;
    private /* synthetic */ long c;
    private /* synthetic */ boolean e;
    private static final /* synthetic */ Predicate<net.minecraft.i.k> i;
    private /* synthetic */ int f;

    static {
        h = new net.minecraft.a.A();
        i = new h();
    }

    public void b(int n2) {
        block16: {
            block14: {
                int n3;
                int n4;
                boolean bl2;
                block15: {
                    n2 = net.minecraft.k.h.c(n2, 3, 32);
                    bl2 = net.minecraft.a.k.t();
                    n4 = n2;
                    n3 = this.f;
                    if (!bl2) break block15;
                    if (n4 == n3) break block16;
                    n4 = n2;
                    n3 = this.f;
                }
                int n5 = n4 - n3;
                Iterator iterator = Lists.newArrayList(this.k).iterator();
                block0: while (true) {
                    int n6 = iterator.hasNext();
                    block1: while (n6 != 0) {
                        int n7;
                        int n8;
                        net.minecraft.i.k k2 = (net.minecraft.i.k)iterator.next();
                        int n9 = (int)k2.a >> 4;
                        int n10 = (int)k2.ax >> 4;
                        if (!bl2) break block14;
                        int n11 = n5;
                        if (bl2) {
                            if (n11 > 0) {
                                n8 = n9 - n2;
                                block2: while (true) {
                                    int n12 = n8;
                                    block3: while (n12 <= n9 + n2) {
                                        n6 = n10 - n2;
                                        if (!bl2) continue block1;
                                        n7 = n6;
                                        while (n7 <= n10 + n2) {
                                            l l2 = this.a(n8, n7);
                                            if (bl2) {
                                                n12 = l2.b(k2) ? 1 : 0;
                                                if (!bl2) continue block3;
                                                if (n12 == 0) {
                                                    l2.c(k2);
                                                }
                                                ++n7;
                                            }
                                            if (bl2) continue;
                                        }
                                        ++n8;
                                        if (bl2) continue block2;
                                    }
                                    break;
                                }
                                if (bl2) continue block0;
                            }
                            n11 = n9 - this.f;
                        }
                        n8 = n11;
                        block5: while (true) {
                            int n13 = n8;
                            block6: while (n13 <= n9 + this.f) {
                                n6 = n10 - this.f;
                                if (!bl2) continue block1;
                                for (n7 = v70550; n7 <= n10 + this.f; ++n7) {
                                    s s2 = this;
                                    int n14 = n8;
                                    int n15 = n7;
                                    if (bl2) {
                                        n13 = s2.a(n14, n15, n9, n10, n2) ? 1 : 0;
                                        if (!bl2) continue block6;
                                        if (n13 != 0) continue;
                                        s2 = this;
                                        n14 = n8;
                                        n15 = n7;
                                    }
                                    s2.a(n14, n15).d(k2);
                                    if (bl2) continue;
                                }
                                ++n8;
                                if (bl2) continue block5;
                            }
                            break;
                        }
                        if (bl2) continue block0;
                    }
                    break;
                }
                this.f = n2;
            }
            this.c();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void c() {
        this.e = true;
        this.d = true;
    }

    public Iterator<a> b() {
        Iterator<l> iterator = this.a.iterator();
        return new j(this, iterator);
    }

    public s(A a10) {
        this.k = Lists.newArrayList();
        this.l = new Long2ObjectOpenHashMap(4096);
        this.g = Sets.newHashSet();
        this.m = Lists.newLinkedList();
        this.j = Lists.newLinkedList();
        this.a = Lists.newArrayList();
        this.e = true;
        this.d = true;
        this.b = a10;
        this.b(a10.H().O().d());
    }

    public void a(net.minecraft.i.k k2) {
        block5: {
            int n2;
            int n3 = (int)k2.da >> 4;
            int n4 = (int)k2.cU >> 4;
            int n5 = n3 - this.f;
            boolean bl2 = net.minecraft.a.k.q();
            while (n5 <= n3 + this.f) {
                block6: {
                    n2 = n4 - this.f;
                    if (bl2) break block5;
                    int n6 = n2;
                    while (n6 <= n4 + this.f) {
                        l l2 = this.c(n5, n6);
                        if (!bl2) {
                            if (!bl2) {
                                if (l2 != null) {
                                    l2.d(k2);
                                }
                                ++n6;
                            }
                            if (!bl2) continue;
                        }
                        break block6;
                    }
                    ++n5;
                }
                if (!bl2) continue;
            }
            n2 = this.k.remove(k2) ? 1 : 0;
        }
        this.c();
    }

    public void b(l l2) {
        block0: {
            f f10 = l2.a();
            long l3 = s.d(f10.c, f10.b);
            l2.b();
            this.l.remove(l3);
            this.a.remove(l2);
            this.g.remove(l2);
            this.m.remove(l2);
            this.j.remove(l2);
            a a10 = l2.c();
            if (a10 == null) break block0;
            this.d().a().c(a10);
        }
    }

    static Predicate e() {
        return h;
    }

    private l a(int n2, int n3) {
        l l2;
        block6: {
            l l3;
            block7: {
                long l4 = s.d(n2, n3);
                boolean bl2 = net.minecraft.a.k.t();
                l2 = l3 = (l)this.l.get(l4);
                if (!bl2) break block6;
                if (l2 != null) break block7;
                l3 = new l(this, n2, n3);
                this.l.put(l4, (Object)l3);
                this.a.add(l3);
                l2 = l3;
                if (bl2) {
                    if (l2.c() == null) {
                        this.j.add(l3);
                    }
                    l2 = l3;
                }
                if (!bl2) break block6;
                if (!l2.e()) {
                    this.m.add(l3);
                }
            }
            l2 = l3;
        }
        return l2;
    }

    public void a() {
        block50: {
            G g10;
            s s2;
            block49: {
                long l2;
                block37: {
                    boolean bl2;
                    block35: {
                        block36: {
                            block43: {
                                block41: {
                                    block42: {
                                        long l3;
                                        block39: {
                                            block40: {
                                                block38: {
                                                    block34: {
                                                        l3 = this.b.r();
                                                        bl2 = net.minecraft.a.k.t();
                                                        long l4 = l3 - this.c - 8000L;
                                                        l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                        if (bl2) {
                                                            if (l2 > 0) {
                                                                this.c = l3;
                                                                for (int i2 = 0; i2 < this.a.size(); ++i2) {
                                                                    l object2 = this.a.get(i2);
                                                                    object2.g();
                                                                    object2.b();
                                                                    if (bl2) {
                                                                        if (bl2) continue;
                                                                    }
                                                                    break block34;
                                                                }
                                                            }
                                                            l2 = (long)this.g.isEmpty();
                                                        }
                                                        if (!bl2) break block38;
                                                        if (l2 == false) {
                                                            for (l l5 : this.g) {
                                                                l5.g();
                                                                if (bl2) {
                                                                    if (bl2) continue;
                                                                }
                                                                break block34;
                                                            }
                                                            this.g.clear();
                                                        }
                                                    }
                                                    l2 = (long)this.e;
                                                }
                                                if (!bl2) break block39;
                                                if (l2 == false) break block40;
                                                long l6 = l3 % 4L - 0L;
                                                l2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                                                if (!bl2) break block39;
                                                if (l2 == false) {
                                                    this.e = false;
                                                    Collections.sort(this.j, new F(this));
                                                }
                                            }
                                            l2 = (long)this.d;
                                        }
                                        if (!bl2) break block41;
                                        if (l2 == false) break block42;
                                        long l7 = l3 % 4L - 2L;
                                        l2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                        if (!bl2) break block41;
                                        if (l2 == false) {
                                            this.d = false;
                                            Collections.sort(this.m, new D(this));
                                        }
                                    }
                                    l2 = (long)this.j.isEmpty();
                                }
                                if (!bl2) break block36;
                                if (l2 != false) break block43;
                                long l7 = System.nanoTime() + 50000000L;
                                int n2 = 49;
                                Iterator<l> iterator = this.j.iterator();
                                while (iterator.hasNext()) {
                                    block45: {
                                        l l8;
                                        block46: {
                                            l l9;
                                            block44: {
                                                l8 = iterator.next();
                                                if (!bl2) break block35;
                                                l9 = l8;
                                                if (!bl2) break block44;
                                                if (l9.c() != null) break block45;
                                                l9 = l8;
                                            }
                                            boolean bl3 = l9.a(i);
                                            l2 = (long)l8.a(bl3);
                                            if (!bl2) break block46;
                                            if (l2 == false) break block45;
                                            iterator.remove();
                                            l2 = (long)l8.e();
                                        }
                                        if (bl2) {
                                            if (l2 != false) {
                                                this.m.remove(l8);
                                            }
                                            l2 = --n2;
                                        }
                                        if (bl2) {
                                            if (l2 < 0 || System.nanoTime() > l7 && bl2) break;
                                        }
                                        break block36;
                                    }
                                    if (bl2) continue;
                                }
                            }
                            l2 = (long)this.m.isEmpty();
                        }
                        if (!bl2) break block37;
                        if (l2 != false) break block35;
                        int n3 = 81;
                        Iterator<l> iterator = this.m.iterator();
                        while (iterator.hasNext()) {
                            block48: {
                                int n4;
                                block47: {
                                    l l10 = iterator.next();
                                    l2 = (long)l10.e();
                                    if (!bl2) break block37;
                                    if (!bl2) break block47;
                                    if (l2 == false) break block48;
                                    iterator.remove();
                                    n4 = --n3;
                                }
                                if (n4 < 0 && bl2) break;
                            }
                            if (bl2) continue;
                        }
                    }
                    s2 = this;
                    if (!bl2) break block49;
                    l2 = (long)s2.k.isEmpty();
                }
                if (l2 == false) break block50;
                s2 = this;
            }
            if (!(g10 = s2.b.D).l()) {
                this.b.a().d();
            }
        }
    }

    public boolean b(int n2, int n3) {
        long l2 = s.d(n2, n3);
        return this.l.get(l2) != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        boolean bl2 = net.minecraft.a.k.q();
        boolean bl3 = n3 - n5;
        int n8 = n7;
        if (bl2) return n8 != 0;
        if (n8 < -n6) return 0 != 0;
        n8 = n7;
        if (bl2) return n8 != 0;
        if (n8 > n6) return 0 != 0;
        boolean bl4 = bl3;
        int n9 = -n6;
        if (!bl2) {
            if (bl4 < n9) return false;
            bl4 = bl3;
            if (bl2) return bl4;
            n9 = n6;
        }
        if (bl4 > n9) return false;
        return true;
    }

    public static int a(int n2) {
        return n2 * 16 - 16;
    }

    public void a(l l2) {
        this.g.add(l2);
    }

    public A d() {
        return this.b;
    }

    public void a(n n2) {
        block3: {
            l l2;
            block2: {
                l l3;
                int n3 = n2.e() >> 4;
                int n4 = n2.a() >> 4;
                boolean bl2 = net.minecraft.a.k.t();
                l2 = l3 = this.c(n3, n4);
                if (!bl2) break block2;
                if (l2 == null) break block3;
                l2 = l3;
            }
            l2.a(n2.e() & 0xF, n2.b(), n2.a() & 0xF);
        }
    }

    @Nullable
    public l c(int n2, int n3) {
        return (l)this.l.get(s.d(n2, n3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.i.k k2, int n2, int n3) {
        l l2 = this.c(n2, n3);
        boolean bl2 = net.minecraft.a.k.t();
        l l3 = l2;
        if (bl2) {
            if (l3 == null) return false;
            l3 = l2;
        }
        boolean bl3 = l3.b(k2);
        if (bl2) {
            if (!bl3) return false;
            bl3 = l2.d();
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static long d(int n2, int n3) {
        return (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
    }

    public void b(net.minecraft.i.k k2) {
        block10: {
            block8: {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                double d10;
                boolean bl2;
                int n7;
                int n8;
                block11: {
                    block12: {
                        double d11;
                        block9: {
                            n8 = (int)k2.a >> 4;
                            n7 = (int)k2.ax >> 4;
                            double d12 = k2.da - k2.a;
                            bl2 = net.minecraft.a.k.q();
                            double d13 = k2.cU - k2.ax;
                            double d14 = d12 * d12 + d13 * d13;
                            double d15 = d14 - 64.0;
                            d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                            if (bl2) break block9;
                            if (d11 < 0) break block10;
                            d11 = (int)k2.da >> 4;
                        }
                        d10 = d11;
                        n6 = (int)k2.cU >> 4;
                        n5 = this.f;
                        n4 = n8 - d10;
                        n3 = n7 - n6;
                        n2 = n4;
                        if (bl2) break block11;
                        if (n2 != 0) break block12;
                        n2 = n3;
                        if (bl2) break block11;
                        if (n2 == 0) break block10;
                    }
                    n2 = n8 - n5;
                }
                int n9 = n2;
                block0: while (true) {
                    int n10 = n9;
                    block1: while (n10 <= n8 + n5) {
                        if (bl2) break block8;
                        int n11 = n7 - n5;
                        while (n11 <= n7 + n5) {
                            block16: {
                                block15: {
                                    int n12;
                                    int n13;
                                    int n14;
                                    s s2;
                                    block14: {
                                        boolean bl3;
                                        block13: {
                                            n10 = this.a(n9, n11, (int)d10, n6, n5) ? 1 : 0;
                                            if (bl2) continue block1;
                                            if (bl2) break block13;
                                            if (n10 == 0) {
                                                this.a(n9, n11).c(k2);
                                            }
                                            s2 = this;
                                            n14 = n9 - n4;
                                            n13 = n11 - n3;
                                            n12 = n8;
                                            if (bl2) break block14;
                                            bl3 = s2.a(n14, n13, n12, n7, n5);
                                        }
                                        if (bl3) break block15;
                                        s2 = this;
                                        n14 = n9 - n4;
                                        n13 = n11;
                                        n12 = n3;
                                    }
                                    l l2 = s2.c(n14, n13 - n12);
                                    if (bl2) break block16;
                                    if (l2 != null) {
                                        l2.d(k2);
                                    }
                                }
                                ++n11;
                            }
                            if (!bl2) continue;
                        }
                        ++n9;
                        if (!bl2) continue block0;
                    }
                    break;
                }
                k2.da = k2.a;
                k2.cU = k2.ax;
            }
            this.c();
        }
    }

    public void c(net.minecraft.i.k k2) {
        block3: {
            int n2;
            int n3 = (int)k2.a >> 4;
            int n4 = (int)k2.ax >> 4;
            k2.da = k2.a;
            k2.cU = k2.ax;
            boolean bl2 = net.minecraft.a.k.q();
            int n5 = n3 - this.f;
            while (n5 <= n3 + this.f) {
                block4: {
                    n2 = n4 - this.f;
                    if (bl2) break block3;
                    for (int i2 = v71582; i2 <= n4 + this.f; ++i2) {
                        this.a(n5, i2).c(k2);
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block4;
                    }
                    ++n5;
                }
                if (!bl2) continue;
            }
            n2 = this.k.add(k2) ? 1 : 0;
        }
        this.c();
    }
}

