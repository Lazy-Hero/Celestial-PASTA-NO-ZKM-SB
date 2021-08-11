/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntAVLTreeSet
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  javax.annotation.Nullable
 */
package net.minecraft.client.B;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ar.a2;
import net.minecraft.az.k;
import net.minecraft.az.r;
import net.minecraft.client.B.d;
import net.minecraft.k.m;

class p {
    final /* synthetic */ d b;
    private final /* synthetic */ int e;
    private final /* synthetic */ IntList d;
    private final /* synthetic */ List<r> a;
    private final /* synthetic */ k f;
    private final /* synthetic */ BitSet c;
    private final /* synthetic */ int[] h;
    private final /* synthetic */ int g;

    private int a() {
        int n2;
        block4: {
            int n3 = Integer.MAX_VALUE;
            Iterator<r> iterator = this.a.iterator();
            int n4 = net.minecraft.client.B.d.b();
            while (iterator.hasNext()) {
                block5: {
                    r r2 = iterator.next();
                    n2 = 0;
                    if (n4 == 0) break block4;
                    int n5 = n2;
                    IntListIterator intListIterator = r2.a().iterator();
                    while (intListIterator.hasNext()) {
                        int n6 = (Integer)intListIterator.next();
                        n5 = Math.max(n5, this.b.c.get(n6));
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                        }
                        break block5;
                    }
                    int n7 = n3;
                    if (n4 != 0 && n7 > 0) {
                        n7 = n3 = Math.min(n3, n5);
                    }
                }
                if (n4 != 0) continue;
            }
            n2 = n3;
        }
        return n2;
    }

    private boolean c(boolean bl2, int n2) {
        return this.c.get(this.b(bl2, n2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a(int n2, @Nullable IntList intList) {
        int n3 = 0;
        int n4 = net.minecraft.client.B.d.b();
        int n5 = Math.min(n2, this.a()) + 1;
        while (true) {
            int n6;
            int n7;
            if (this.b(n7 = (n3 + n5) / 2, null)) {
                n6 = n5 - n3;
                if (n4 != 0) {
                    if (n4 != 0) {
                        if (n6 <= 1) {
                            int n8 = n7;
                            if (n4 != 0) {
                                if (n8 > 0) {
                                    this.b(n7, intList);
                                }
                                n8 = n7;
                            }
                            return n8;
                        }
                        int n9 = n3 = n7;
                    }
                    if (n4 != 0) continue;
                }
            } else {
                n6 = n7;
            }
            n5 = n6;
        }
    }

    private int b(boolean n2, int n3) {
        int n4 = net.minecraft.client.B.d.b();
        int n5 = n2;
        if (n4 != 0) {
            n5 = n5 != 0 ? 0 : this.g;
        }
        return n5 + n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int[] b() {
        block4: {
            var2_1 = new IntAVLTreeSet();
            var3_2 = this.a.iterator();
            var1_3 = net.minecraft.client.B.d.b();
            while (var3_2.hasNext()) {
                var4_4 = var3_2.next();
                v0 = var2_1;
                if (var1_3 != 0) {
                    v0.addAll((IntCollection)var4_4.a());
                    if (var1_3 != 0) continue;
                }
                break block4;
            }
            v0 = var2_1;
        }
        var3_2 = v0.iterator();
        do lbl-1000:
        // 3 sources

        {
            v1 = var3_2.hasNext();
            do {
                if (v1 == false) return var2_1.toIntArray();
                v1 = this.b.d(var3_2.nextInt());
            } while (var1_3 == 0);
            if (v1) ** GOTO lbl-1000
            var3_2.remove();
        } while (var1_3 != 0);
        return var2_1.toIntArray();
    }

    private boolean b(boolean bl2, int n2, int n3) {
        return this.c.get(this.d(bl2, n2, n3));
    }

    public p(d d10, k k2) {
        block3: {
            this.b = d10;
            int n2 = net.minecraft.client.B.d.b();
            this.a = Lists.newArrayList();
            this.d = new IntArrayList();
            this.f = k2;
            this.a.addAll(k2.c());
            this.a.removeIf(p::lambda$new$0);
            this.g = this.a.size();
            this.h = this.b();
            this.e = this.h.length;
            this.c = new BitSet(this.g + this.e + this.g + this.g * this.e);
            int n3 = n2;
            int n4 = 0;
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 < this.a.size()) {
                    IntList intList = this.a.get(n4).a();
                    for (int i2 = 0; i2 < this.e; ++i2) {
                        n5 = intList.contains(this.h[i2]) ? 1 : 0;
                        if (n3 == 0) continue block1;
                        if (n5 == 0) continue;
                        this.c.set(this.d(true, i2, n4));
                        if (n3 != 0) continue;
                    }
                    ++n4;
                    if (n3 != 0) continue block0;
                }
                break;
            }
            if (m.d()) break block3;
            net.minecraft.client.B.d.b(++n3);
        }
    }

    private void a(boolean bl2, int n2, int n3) {
        this.c.flip(1 + this.d(bl2, n2, n3));
    }

    private boolean c(boolean bl2, int n2, int n3) {
        int n4 = net.minecraft.client.B.d.b();
        boolean bl3 = bl2;
        if (n4 != 0) {
            bl3 = bl3 != this.c.get(1 + this.d(bl2, n2, n3));
        }
        return bl3;
    }

    private int c(int n2) {
        return this.g + this.e + n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(int n2, @Nullable IntList intList) {
        int n3;
        block17: {
            int n4;
            int n5;
            int n6;
            int n7;
            block16: {
                n7 = net.minecraft.client.B.d.b();
                int n8 = n2;
                if (n7 != 0) {
                    if (n8 <= 0) {
                        return true;
                    }
                    n8 = 0;
                }
                int n9 = n8;
                block0: while (true) {
                    p p2 = this;
                    int n10 = n2;
                    block1: while (p2.b(n10)) {
                        this.b.b(this.h[this.d.getInt(0)], n2);
                        n6 = this.d.size() - 1;
                        this.d(this.d.getInt(n6));
                        n5 = 0;
                        if (n7 == 0) break block16;
                        for (n4 = v1543323; n4 < n6; ++n4) {
                            boolean bl2;
                            p2 = this;
                            n10 = n4 & 1;
                            if (n7 == 0) continue block1;
                            if (n7 != 0) {
                                bl2 = n10 == 0;
                            }
                            p2.a(bl2, (Integer)this.d.get(n4), (Integer)this.d.get(n4 + 1));
                            if (n7 != 0) continue;
                        }
                        this.d.clear();
                        this.c.clear(0, this.g + this.e);
                        ++n9;
                        if (n7 != 0) continue block0;
                    }
                    break;
                }
                n5 = n9;
            }
            if (n7 != 0) {
                n5 = n5 == this.g ? 1 : 0;
            }
            n6 = n5;
            int n11 = n4 = n6 != 0 && intList != null ? 1 : 0;
            if (n7 != 0) {
                if (n11 != 0) {
                    intList.clear();
                }
                this.c.clear(0, this.g + this.e + this.g);
                n11 = 0;
            }
            int n12 = n11;
            a2<r> a22 = this.f.c();
            int n13 = 0;
            block3: while (true) {
                int n14 = n13;
                block4: while (n14 < a22.size()) {
                    block20: {
                        void var10_10;
                        block18: {
                            block19: {
                                n3 = n4;
                                if (n7 == 0) break block17;
                                if (n7 == 0) break block18;
                                if (n3 == 0 || a22.get(n13) != r.a) break block19;
                                intList.add(0);
                                if (n7 != 0) break block20;
                            }
                            boolean bl3 = var10_10 = false;
                        }
                        while (var10_10 < this.e) {
                            block23: {
                                block22: {
                                    int n15;
                                    block21: {
                                        n14 = this.c(false, n12, (int)var10_10) ? 1 : 0;
                                        if (n7 == 0) continue block4;
                                        if (n7 == 0) break block21;
                                        if (n14 == 0) break block22;
                                        this.a(true, (int)var10_10, n12);
                                        net.minecraft.client.B.d.a(this.b, this.h[var10_10], n2);
                                        if (n7 == 0) break block23;
                                        n15 = n4;
                                    }
                                    if (n15 != 0) {
                                        intList.add(this.h[var10_10]);
                                    }
                                }
                                ++var10_10;
                            }
                            if (n7 != 0) continue;
                        }
                        ++n12;
                    }
                    ++n13;
                    if (n7 != 0) continue block3;
                }
                break;
            }
            n3 = n6;
        }
        return n3 != 0;
    }

    private boolean a(int n2) {
        return this.c.get(this.c(n2));
    }

    private boolean b(int n2) {
        int n3;
        block20: {
            int n4 = this.e;
            int n5 = net.minecraft.client.B.d.b();
            int n6 = 0;
            block0: while (true) {
                int n7 = n6;
                int n8 = n4;
                block1: while (n7 < n8) {
                    block23: {
                        boolean bl2;
                        block26: {
                            p p2;
                            block22: {
                                p2 = this;
                                if (n5 == 0) break block22;
                                n3 = p2.b.c.get(this.h[n6]);
                                if (n5 == 0) break block20;
                                if (n3 < n2) break block23;
                                p2 = this;
                            }
                            p2.a(false, n6);
                            while (!this.d.isEmpty()) {
                                int n9;
                                int n10;
                                int n11;
                                block21: {
                                    n11 = this.d.size();
                                    int n12 = n11 & 1;
                                    if (n5 != 0) {
                                        n8 = 1;
                                        if (n5 == 0) continue block1;
                                        n12 = n12 == n8 ? 1 : 0;
                                    }
                                    int n13 = n12;
                                    int n14 = this.d.getInt(n11 - 1);
                                    int n15 = n13;
                                    if (n5 != 0) {
                                        if (n15 == 0) {
                                            n15 = this.a(n14) ? 1 : 0;
                                            if (n5 != 0) {
                                                if (n15 == 0 && n5 != 0) break;
                                            }
                                        } else {
                                            n15 = n13;
                                        }
                                    }
                                    if (n5 != 0) {
                                        n15 = n15 != 0 ? this.g : n4;
                                    }
                                    int n16 = n15;
                                    for (n10 = 0; n10 < n16; ++n10) {
                                        int n17;
                                        int n18;
                                        p p3;
                                        block25: {
                                            boolean bl3;
                                            block24: {
                                                n9 = this.c(n13 != 0, n10);
                                                if (n5 == 0) break block21;
                                                if (n5 != 0) {
                                                    if (n9 != 0) continue;
                                                    bl3 = this.b(n13 != 0, n14, n10);
                                                }
                                                if (n5 == 0) break block24;
                                                if (!bl3) continue;
                                                p3 = this;
                                                n18 = n13;
                                                n17 = n14;
                                                if (n5 == 0) break block25;
                                                bl3 = p3.c(n18 != 0, n17, n10);
                                            }
                                            if (!bl3) continue;
                                            p3 = this;
                                            n18 = n13;
                                            n17 = n10;
                                        }
                                        p3.a(n18 != 0, n17);
                                        if (n5 != 0) break;
                                        if (n5 != 0) continue;
                                    }
                                    n9 = n10 = this.d.size();
                                }
                                if (n5 != 0 && n9 == n11) {
                                    n9 = this.d.removeInt(n10 - 1);
                                }
                                if (n5 != 0) continue;
                            }
                            bl2 = this.d.isEmpty();
                            if (n5 == 0) break block26;
                            if (bl2) break block23;
                            bl2 = true;
                        }
                        return bl2;
                    }
                    ++n6;
                    if (n5 != 0) continue block0;
                }
                break;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    private void d(int n2) {
        this.c.set(this.c(n2));
    }

    private void a(boolean bl2, int n2) {
        this.c.set(this.b(bl2, n2));
        this.d.add(n2);
    }

    private static boolean lambda$new$0(r r2) {
        return r2 == r.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int d(boolean var1_1, int var2_2, int var3_3) {
        var4_4 = net.minecraft.client.B.d.b();
        v0 = var1_1;
        if (var4_4 == 0) ** GOTO lbl8
        if (v0 != 0) {
            v1 = var2_2 * this.g + var3_3;
        } else {
            v0 = var3_3 * this.g;
lbl8:
            // 2 sources

            v1 = v0 + var2_2;
        }
        var5_5 = v1;
        return this.g + this.e + this.g + 2 * var5_5;
    }
}

