/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ar;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.A;
import net.minecraft.B.D;
import net.minecraft.B.l;
import net.minecraft.B.m;
import net.minecraft.B.n;
import net.minecraft.B.x;
import net.minecraft.Q.i;
import net.minecraft.ar.v;
import net.minecraft.i.h;
import net.minecraft.i.k;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class au {
    private /* synthetic */ List<D> e;
    private /* synthetic */ net.minecraft.az.k c;
    private final /* synthetic */ net.minecraft.client.B.d g;
    private final /* synthetic */ Logger h;
    private /* synthetic */ l b;
    private /* synthetic */ k f;
    private /* synthetic */ m a;
    private /* synthetic */ boolean d;

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, IntList intList) {
        int n3 = this.a.d();
        int n4 = v.b();
        int n5 = this.a.b();
        int n6 = this.c instanceof net.minecraft.az.i;
        if (n4 == 0) {
            if (n6 != 0) {
                net.minecraft.az.i i2 = (net.minecraft.az.i)this.c;
                n3 = i2.c();
                n5 = i2.a();
            }
            n6 = 1;
        }
        int n7 = n6;
        IntListIterator intListIterator = intList.iterator();
        int n8 = 0;
        do {
            int n9 = n8;
            int n10 = this.a.d();
            block1: while (true) {
                int n11;
                if (n9 >= n10) return;
                int n12 = n5;
                if (n4 == 0) {
                    if (n12 == n8) return;
                    n12 = n11 = 0;
                }
                while (n11 < this.a.b()) {
                    block14: {
                        block21: {
                            int n13;
                            d d10;
                            D d11;
                            block19: {
                                int n14;
                                block20: {
                                    Object object;
                                    block17: {
                                        block18: {
                                            int n15;
                                            int n16;
                                            block15: {
                                                block16: {
                                                    n9 = n3;
                                                    n10 = n11;
                                                    if (n4 != 0) continue block1;
                                                    if (n4 != 0) break block15;
                                                    if (n9 == n10) break block16;
                                                    object = intListIterator;
                                                    if (n4 != 0) break block17;
                                                    if (object.hasNext()) break block18;
                                                }
                                                n16 = n7;
                                                n15 = this.a.d() - n11;
                                            }
                                            n7 = n16 + n15;
                                            if (n4 == 0) break block1;
                                        }
                                        object = this.e.get(n7);
                                    }
                                    d11 = (D)object;
                                    d10 = net.minecraft.client.B.d.c((Integer)intListIterator.next());
                                    n14 = d10.G();
                                    if (n4 != 0) break block19;
                                    if (n14 == 0) break block20;
                                    ++n7;
                                    if (n4 == 0) break block21;
                                }
                                n14 = n13 = 0;
                            }
                            while (n13 < n2) {
                                this.a(d11, d10);
                                ++n13;
                                if (n4 == 0) {
                                    if (n4 == 0) continue;
                                }
                                break block14;
                            }
                            ++n7;
                        }
                        ++n11;
                    }
                    if (n4 == 0) continue;
                }
                break;
            }
            if (!intListIterator.hasNext()) {
                if (n4 == 0) return;
            }
            ++n8;
        } while (n4 == 0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b() {
        block22: {
            block16: {
                block17: {
                    block18: {
                        block15: {
                            var2_1 = this.c.a(this.a, this.f.aG);
                            var1_2 = v.b();
                            var3_3 = this.g.a(this.c, null);
                            v0 = var2_1;
                            if (var1_2 != 0) break block17;
                            if (v0 == 0) break block18;
                            var4_4 = 1;
                            var5_5 = 0;
                            while (var5_5 < this.a.e()) {
                                block19: {
                                    block20: {
                                        block21: {
                                            var6_7 = this.a.a(var5_5);
                                            if (var1_2 != 0) break block19;
                                            v0 = var6_7.G() ? 1 : 0;
                                            if (var1_2 != 0) break block15;
                                            if (v0 != 0) break block20;
                                            v1 = Math.min(var3_3, var6_7.f());
                                            if (var1_2 != 0) break block21;
                                            if (v1 <= var6_7.t()) break block20;
                                            v1 = 0;
                                        }
                                        var4_4 = v1;
                                    }
                                    ++var5_5;
                                }
                                if (var1_2 == 0) continue;
                            }
                            v0 = var4_4;
                        }
                        if (var1_2 == 0) {
                            if (v0 != 0) {
                                return;
                            } else {
                                ** GOTO lbl31
                            }
                        }
                        break block17;
                    }
                    v0 = this.a(var3_3, (boolean)var2_1);
                }
                var4_4 = v0;
                var5_6 = new IntArrayList();
                v2 = this.g.a(this.c, (IntList)var5_6, var4_4);
                if (var1_2 == 0) {
                    if (v2 == 0) return;
                    v2 = var4_4;
                }
                var6_8 = v2;
                var7_9 = var5_6.iterator();
                while (var7_9.hasNext()) {
                    var8_10 = (Integer)var7_9.next();
                    v3 = var9_11 = net.minecraft.client.B.d.c(var8_10).f();
                    if (var1_2 == 0) {
                        if (var1_2 == 0 && v3 < var6_8) {
                            v4 = var6_8 = var9_11;
                        }
                        if (var1_2 == 0) continue;
                    }
                    break block16;
                }
                v5 = this;
                if (var1_2 != 0) break block22;
                v3 = v5.g.a(this.c, (IntList)var5_6, var6_8);
            }
            if (v3 == 0) return;
            this.a();
            v5 = this;
        }
        v5.a(var6_8, (IntList)var5_6);
    }

    private boolean c() {
        boolean bl2;
        block5: {
            h h2 = this.f.cB;
            int n2 = 0;
            int n3 = v.b();
            while (n2 < this.a.e()) {
                block6: {
                    block7: {
                        int n4;
                        block9: {
                            int n5;
                            block8: {
                                int n6;
                                d d10 = this.a.a(n2);
                                if (n3 != 0) break block6;
                                bl2 = d10.G();
                                if (n3 != 0) break block5;
                                if (bl2) break block7;
                                n4 = n6 = h2.c(d10);
                                n5 = -1;
                                if (n3 != 0) break block8;
                                if (n4 == n5) {
                                    n6 = h2.b();
                                }
                                n4 = n6;
                                if (n3 != 0) break block9;
                                n5 = -1;
                            }
                            if (n4 != n5) break block7;
                            n4 = 0;
                        }
                        return n4 != 0;
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    public void a(k k2, @Nullable net.minecraft.az.k k3, boolean bl2) {
        block7: {
            block18: {
                au au2;
                block16: {
                    block17: {
                        boolean bl3;
                        int n2;
                        block14: {
                            block15: {
                                au au3;
                                block13: {
                                    block12: {
                                        block11: {
                                            boolean bl4;
                                            n n3;
                                            block9: {
                                                block10: {
                                                    k k4;
                                                    block8: {
                                                        n2 = v.b();
                                                        if (k3 == null) break block7;
                                                        k4 = k2;
                                                        if (n2 != 0) break block8;
                                                        if (!k4.G().f(k3)) break block7;
                                                        this.f = k2;
                                                        this.c = k3;
                                                        this.d = bl2;
                                                        this.e = k2.cm.f;
                                                        k4 = k2;
                                                    }
                                                    n3 = k4.cm;
                                                    this.b = null;
                                                    this.a = null;
                                                    bl4 = n3 instanceof A;
                                                    if (n2 != 0) break block9;
                                                    if (!bl4) break block10;
                                                    this.b = ((A)n3).m;
                                                    this.a = ((A)n3).l;
                                                    if (n2 == 0) break block11;
                                                }
                                                bl4 = n3 instanceof x;
                                            }
                                            if (bl4) {
                                                this.b = ((x)n3).o;
                                                this.a = ((x)n3).m;
                                            }
                                        }
                                        au3 = this;
                                        if (n2 != 0) break block12;
                                        if (au3.b == null) break block7;
                                        au3 = this;
                                    }
                                    if (n2 != 0) break block13;
                                    if (au3.a == null) break block7;
                                    au3 = this;
                                }
                                bl3 = au3.c();
                                if (n2 != 0) break block14;
                                if (bl3) break block15;
                                bl3 = k2.C();
                                if (n2 != 0) break block14;
                                if (!bl3) break block7;
                            }
                            this.g.d();
                            k2.cB.a(this.g, false);
                            this.a.a(this.g);
                            au2 = this;
                            if (n2 != 0) break block16;
                            bl3 = au2.g.b(k3, null);
                        }
                        if (!bl3) break block17;
                        this.b();
                        if (n2 == 0) break block18;
                    }
                    au2 = this;
                }
                au2.a();
                k2.cD.a(new i(k2.cm.b, k3));
            }
            k2.cB.b();
        }
    }

    private void a(D d10, d d11) {
        block4: {
            d d12;
            block8: {
                block9: {
                    d d13;
                    int n2;
                    block6: {
                        d d14;
                        int n3;
                        h h2;
                        block7: {
                            int n4;
                            block5: {
                                h2 = this.f.cB;
                                n3 = h2.i(d11);
                                n2 = v.d();
                                if (n3 == -1) break block4;
                                d13 = h2.a(n3).C();
                                n4 = d13.G();
                                if (n2 == 0) break block5;
                                if (n4 != 0) break block4;
                                d14 = d13;
                                if (n2 == 0) break block6;
                                n4 = d14.t();
                            }
                            if (n4 <= 1) break block7;
                            h2.a(n3, 1);
                            if (n2 != 0) break block6;
                        }
                        d14 = h2.b(n3);
                    }
                    d13.c(1);
                    d12 = d10.d();
                    if (n2 == 0) break block8;
                    if (!d12.G()) break block9;
                    d10.a(d13);
                    if (n2 != 0) break block4;
                }
                d12 = d10.d();
            }
            d12.g(1);
        }
    }

    private int a(int n2, boolean bl2) {
        int n3;
        block12: {
            int n4;
            block11: {
                int n5;
                block8: {
                    block9: {
                        block10: {
                            n4 = 1;
                            n5 = v.b();
                            n3 = this.d;
                            if (n5 != 0) break block9;
                            if (n3 == 0) break block10;
                            n4 = n2;
                            if (n5 == 0) break block11;
                        }
                        n3 = bl2;
                    }
                    if (n5 != 0) break block12;
                    if (n3 == 0) break block11;
                    n4 = 64;
                    int n6 = 0;
                    while (n6 < this.a.e()) {
                        block13: {
                            block14: {
                                int n7;
                                block15: {
                                    d d10 = this.a.a(n6);
                                    if (n5 != 0) break block13;
                                    n3 = d10.G() ? 1 : 0;
                                    if (n5 != 0) break block8;
                                    if (n3 != 0) break block14;
                                    n7 = n4;
                                    if (n5 != 0) break block15;
                                    if (n7 <= d10.t()) break block14;
                                    n7 = d10.t();
                                }
                                n4 = n7;
                            }
                            ++n6;
                        }
                        if (n5 == 0) continue;
                    }
                    n3 = n4;
                }
                if (n5 != 0) break block12;
                if (n3 < 64) {
                    // empty if block
                }
            }
            n3 = ++n4;
        }
        return n3;
    }

    private void a() {
        block5: {
            h h2 = this.f.cB;
            int n2 = 0;
            int n3 = v.d();
            block0: while (true) {
                int n4 = n2;
                int n5 = this.a.e();
                block1: while (n4 < n5) {
                    block6: {
                        d d10 = this.a.a(n2);
                        if (n3 == 0) break block5;
                        if (n3 == 0) continue block0;
                        if (d10.G()) break block6;
                        while (d10.t() > 0) {
                            int n6;
                            block8: {
                                int n7;
                                block7: {
                                    n7 = n6 = h2.c(d10);
                                    if (n3 == 0) break block7;
                                    n5 = -1;
                                    if (n3 == 0) continue block1;
                                    if (n7 != n5) break block8;
                                    n7 = h2.b();
                                }
                                n6 = n7;
                            }
                            d d11 = d10.C();
                            d11.c(1);
                            h2.a(n6, d11);
                            this.a.a(n2, 1);
                            if (n3 != 0) continue;
                        }
                    }
                    ++n2;
                    if (n3 != 0) continue block0;
                }
                break;
            }
            this.a.d();
            this.b.d();
        }
    }

    public au() {
        this.h = LogManager.getLogger();
        this.g = new net.minecraft.client.B.d();
    }
}

