/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparators
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 */
package net.minecraft.az;

import com.google.common.base.Predicate;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.az.i;
import net.minecraft.az.s;
import net.minecraft.client.B.d;
import net.minecraft.k.m;
import net.minecraft.w.k;

public class r
implements Predicate<net.minecraft.w.d> {
    private /* synthetic */ IntList b;
    public static final /* synthetic */ r a;
    private final /* synthetic */ net.minecraft.w.d[] c;

    public static r a(k k2) {
        return r.a(new net.minecraft.w.d(k2, 1, 32767));
    }

    public boolean a(@Nullable net.minecraft.w.d d10) {
        m[] arrm = i.b();
        if (d10 == null) {
            return false;
        }
        net.minecraft.w.d[] arrd = this.c;
        int n2 = arrd.length;
        int n3 = 0;
        while (n3 < n2) {
            block5: {
                block6: {
                    int n4;
                    block7: {
                        block8: {
                            int n5;
                            net.minecraft.w.d d11 = arrd[n3];
                            if (arrm != null) break block5;
                            if (d11.w() != d10.w()) break block6;
                            n4 = n5 = d11.d();
                            if (arrm != null) break block7;
                            if (n4 == 32767) break block8;
                            n4 = n5;
                            if (arrm != null) break block7;
                            if (n4 != d10.d()) break block6;
                        }
                        n4 = 1;
                    }
                    return n4 != 0;
                }
                ++n3;
            }
            if (arrm == null) continue;
        }
        return false;
    }

    public static r a(k ... arrk) {
        net.minecraft.w.d[] arrd;
        block2: {
            net.minecraft.w.d[] arrd2 = new net.minecraft.w.d[arrk.length];
            m[] arrm = i.b();
            for (int i2 = 0; i2 < arrk.length; ++i2) {
                arrd = arrd2;
                if (arrm == null) {
                    arrd[i2] = new net.minecraft.w.d(arrk[i2]);
                    if (arrm == null) continue;
                }
                break block2;
            }
            arrd = arrd2;
        }
        return r.a(arrd);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new s(new net.minecraft.w.d[0]);
    }

    public IntList a() {
        m[] arrm = i.b();
        IntList intList = this.b;
        if (arrm == null) {
            block4: {
                if (intList == null) {
                    this.b = new IntArrayList(this.c.length);
                    for (net.minecraft.w.d d10 : this.c) {
                        this.b.add(d.a(d10));
                        if (arrm == null) {
                            if (arrm == null) continue;
                        }
                        break block4;
                    }
                    this.b.sort((Comparator)IntComparators.NATURAL_COMPARATOR);
                }
            }
            intList = this.b;
        }
        return intList;
    }

    public static r a(net.minecraft.w.d ... arrd) {
        block7: {
            net.minecraft.w.d[] arrd2;
            m[] arrm;
            block6: {
                arrm = i.b();
                arrd2 = arrd;
                if (arrm != null) break block6;
                if (arrd2.length <= 0) break block7;
                arrd2 = arrd;
            }
            net.minecraft.w.d[] arrd3 = arrd2;
            int n2 = arrd3.length;
            int n3 = 0;
            while (n3 < n2) {
                net.minecraft.w.d d10 = arrd3[n3];
                if (arrm == null) {
                    if (!d10.G()) {
                        return new r(arrd);
                    }
                    ++n3;
                }
                if (arrm == null) continue;
            }
        }
        return a;
    }

    public net.minecraft.w.d[] b() {
        return this.c;
    }

    private r(net.minecraft.w.d ... arrd) {
        this.c = arrd;
    }

    r(net.minecraft.w.d[] arrd, s s2) {
        this(arrd);
    }
}

