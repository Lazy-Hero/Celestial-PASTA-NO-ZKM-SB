/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.a;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.N.y;
import net.minecraft.Q.W;
import net.minecraft.Q.a0;
import net.minecraft.Q.a3;
import net.minecraft.Q.a4;
import net.minecraft.Q.ag;
import net.minecraft.a.k;
import net.minecraft.a.s;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l {
    private /* synthetic */ int b;
    private final /* synthetic */ short[] c;
    private final /* synthetic */ List<net.minecraft.i.k> h;
    private final /* synthetic */ s f;
    private /* synthetic */ int a;
    private /* synthetic */ long g;
    @Nullable
    private /* synthetic */ a j;
    private final /* synthetic */ f i;
    private static final /* synthetic */ Logger d;
    private /* synthetic */ boolean e;

    static {
        d = LogManager.getLogger();
    }

    public void b() {
        long l2 = this.f.d().r();
        boolean bl2 = k.q();
        l l3 = this;
        if (!bl2) {
            if (l3.j != null) {
                this.j.a(this.j.m() + l2 - this.g);
            }
            l3 = this;
        }
        l3.g = l2;
    }

    public void a(net.minecraft.i.k k2) {
        block3: {
            l l2;
            block2: {
                boolean bl2 = k.q();
                l2 = this;
                if (bl2) break block2;
                if (!l2.e) break block3;
                k2.cD.a(new a0(this.j, 65535));
                l2 = this;
            }
            l2.f.d().x().a(k2, this.j);
        }
    }

    public boolean e() {
        boolean bl2;
        block9: {
            l l2;
            a a10;
            block8: {
                bl2 = k.t();
                l l3 = this;
                if (bl2) {
                    if (l3.e) {
                        return true;
                    }
                    l3 = this;
                }
                a10 = l3.j;
                if (!bl2) break block8;
                if (a10 == null) {
                    return false;
                }
                l2 = this;
                if (!bl2) break block9;
                a10 = l2.j;
            }
            if (!a10.a()) {
                return false;
            }
            this.a = 0;
            this.b = 0;
            l2 = this;
        }
        l2.e = true;
        a0 a02 = new a0(this.j, 65535);
        for (net.minecraft.i.k k2 : this.h) {
            k2.cD.a(a02);
            this.f.d().x().a(k2, this.j);
            if (bl2) continue;
        }
        return true;
    }

    public void c(net.minecraft.i.k k2) {
        block6: {
            l l2;
            block8: {
                boolean bl2;
                block7: {
                    boolean bl3;
                    block4: {
                        block5: {
                            bl3 = k.t();
                            bl2 = this.h.contains(k2);
                            if (!bl3) break block4;
                            if (!bl2) break block5;
                            d.debug("Failed to add player. {} already is in chunk {}, {}", (Object)k2, (Object)this.i.c, (Object)this.i.b);
                            if (bl3) break block6;
                        }
                        bl2 = this.h.isEmpty();
                    }
                    if (!bl3) break block7;
                    if (bl2) {
                        this.g = this.f.d().r();
                    }
                    this.h.add(k2);
                    l2 = this;
                    if (!bl3) break block8;
                    bl2 = l2.e;
                }
                if (!bl2) break block6;
                l2 = this;
            }
            l2.a(k2);
        }
    }

    public boolean a(boolean bl2) {
        block5: {
            block4: {
                boolean bl3 = k.t();
                if (this.j != null) {
                    return true;
                }
                if (!bl2) break block4;
                this.j = this.f.d().a().a(this.i.c, this.i.b);
                if (bl3) break block5;
            }
            this.j = this.f.d().a().b(this.i.c, this.i.b);
        }
        return this.j != null;
    }

    public boolean a(Predicate<net.minecraft.i.k> predicate) {
        return Iterables.tryFind(this.h, predicate).isPresent();
    }

    public void d(net.minecraft.i.k k2) {
        block5: {
            l l2;
            block7: {
                boolean bl2;
                block6: {
                    boolean bl3;
                    block4: {
                        bl3 = k.t();
                        bl2 = this.h.contains(k2);
                        if (!bl3) break block4;
                        if (!bl2) break block5;
                        bl2 = this.e;
                    }
                    if (!bl3) break block6;
                    if (bl2) {
                        k2.cD.a(new a3(this.i.c, this.i.b));
                    }
                    this.h.remove(k2);
                    l2 = this;
                    if (!bl3) break block7;
                    bl2 = l2.h.isEmpty();
                }
                if (!bl2) break block5;
                l2 = this;
            }
            l2.f.b(this);
        }
    }

    public boolean b(net.minecraft.i.k k2) {
        return this.h.contains(k2);
    }

    public boolean a(double d10, Predicate<net.minecraft.i.k> predicate) {
        boolean bl2;
        block3: {
            int n2 = 0;
            int n3 = this.h.size();
            boolean bl3 = k.t();
            while (n2 < n3) {
                block4: {
                    block5: {
                        double d11;
                        block6: {
                            net.minecraft.i.k k2 = this.h.get(n2);
                            if (!bl3) break block4;
                            bl2 = predicate.apply((Object)k2);
                            if (!bl3) break block3;
                            if (!bl2) break block5;
                            double d12 = this.i.a(k2) - d10 * d10;
                            d11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                            if (!bl3) break block6;
                            if (d11 >= 0) break block5;
                            d11 = 1.0;
                        }
                        return (boolean)d11;
                    }
                    ++n2;
                }
                if (bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public f a() {
        return this.i;
    }

    public double f() {
        double d10;
        block3: {
            double d11 = Double.MAX_VALUE;
            boolean bl2 = k.q();
            for (net.minecraft.i.k k2 : this.h) {
                double d12;
                d10 = d12 = this.i.a(k2);
                if (!bl2) {
                    if (!bl2 && d10 < d11) {
                        double d13 = d11 = d12;
                    }
                    if (!bl2) continue;
                }
                break block3;
            }
            d10 = d11;
        }
        return d10;
    }

    public void a(int n2, int n3, int n4) {
        block8: {
            short s2;
            block6: {
                int n5;
                short[] arrs;
                int n6;
                int n7;
                boolean bl2;
                block9: {
                    block7: {
                        bl2 = k.t();
                        n7 = this.e;
                        if (!bl2) break block7;
                        if (n7 == 0) break block8;
                        n7 = this.a;
                    }
                    if (bl2) {
                        if (n7 == 0) {
                            this.f.a(this);
                        }
                        this.b |= 1 << (n3 >> 4);
                        n7 = this.a;
                    }
                    n6 = 64;
                    if (!bl2) break block9;
                    if (n7 >= n6) break block8;
                    n7 = n2 << 12 | n4 << 8;
                    n6 = n3;
                }
                s2 = (short)(n7 | n6);
                int n8 = 0;
                while (n8 < this.a) {
                    arrs = this.c;
                    n5 = n8++;
                    if (bl2) {
                        if (arrs[n5] == s2) {
                            return;
                        }
                        if (bl2) continue;
                    }
                    break block6;
                }
                arrs = this.c;
                int n9 = this.a;
                n5 = n9;
                this.a = n9 + 1;
            }
            arrs[n5] = s2;
        }
    }

    public void g() {
        block12: {
            block10: {
                l l2;
                block19: {
                    int n2;
                    int n3;
                    int n4;
                    boolean bl2;
                    block20: {
                        int n5;
                        block21: {
                            int n6;
                            block15: {
                                block16: {
                                    block18: {
                                        l l3;
                                        n n7;
                                        block17: {
                                            block14: {
                                                l l4;
                                                block13: {
                                                    block11: {
                                                        bl2 = k.t();
                                                        l4 = this;
                                                        if (!bl2) break block11;
                                                        if (!l4.e) break block12;
                                                        l4 = this;
                                                    }
                                                    if (!bl2) break block13;
                                                    if (l4.j == null) break block12;
                                                    l4 = this;
                                                }
                                                n5 = l4.a;
                                                if (!bl2) break block14;
                                                if (n5 == 0) break block12;
                                                n5 = this.a;
                                            }
                                            n6 = 1;
                                            if (!bl2) break block15;
                                            if (n5 != n6) break block16;
                                            n4 = (this.c[0] >> 12 & 0xF) + this.i.c * 16;
                                            n3 = this.c[0] & 0xFF;
                                            n2 = (this.c[0] >> 8 & 0xF) + this.i.b * 16;
                                            n7 = new n(n4, n3, n2);
                                            this.a(new a4(this.f.d(), n7));
                                            l3 = this;
                                            if (!bl2) break block17;
                                            if (!l3.f.d().d(n7).b().e()) break block18;
                                            l3 = this;
                                        }
                                        l3.a(this.f.d().b(n7));
                                    }
                                    if (bl2) break block19;
                                }
                                n5 = this.a;
                                if (!bl2) break block20;
                                n6 = 64;
                            }
                            if (n5 != n6) break block21;
                            this.a(new a0(this.j, this.b));
                            if (bl2) break block19;
                        }
                        this.a(new W(this.a, this.c, this.j));
                        n5 = n4 = 0;
                    }
                    while (n4 < this.a) {
                        n3 = (this.c[n4] >> 12 & 0xF) + this.i.c * 16;
                        n2 = this.c[n4] & 0xFF;
                        int n8 = (this.c[n4] >> 8 & 0xF) + this.i.b * 16;
                        n n9 = new n(n3, n2, n8);
                        if (bl2) {
                            l2 = this;
                            if (!bl2) break block10;
                            if (l2.f.d().d(n9).b().e()) {
                                this.a(this.f.d().b(n9));
                            }
                            ++n4;
                        }
                        if (bl2) continue;
                    }
                }
                this.a = 0;
                l2 = this;
            }
            l2.b = 0;
        }
    }

    @Nullable
    public a c() {
        return this.j;
    }

    public l(s s2, int n2, int n3) {
        this.h = Lists.newArrayList();
        this.c = new short[64];
        this.f = s2;
        this.i = new f(n2, n3);
        this.j = s2.d().a().b(n2, n3);
    }

    public boolean d() {
        return this.e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(@Nullable y y2) {
        block2: {
            ag ag2;
            y y3;
            block1: {
                boolean bl2 = k.t();
                y3 = y2;
                if (!bl2) break block1;
                if (y3 == null) break block2;
                y3 = y2;
            }
            if ((ag2 = y3.k()) != null) {
                this.a(ag2);
            }
        }
    }

    public void a(K<?> k2) {
        block4: {
            int n2;
            boolean bl2;
            block3: {
                bl2 = k.q();
                int n3 = this.e;
                if (bl2) break block3;
                if (n3 == 0) break block4;
                n3 = n2 = 0;
            }
            while (n2 < this.h.size()) {
                this.h.get((int)n2).cD.a(k2);
                ++n2;
                if (!bl2) continue;
            }
        }
    }
}

