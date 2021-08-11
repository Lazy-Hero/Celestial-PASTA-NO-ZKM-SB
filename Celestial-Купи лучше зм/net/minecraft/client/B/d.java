/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntList
 *  javax.annotation.Nullable
 */
package net.minecraft.client.B;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;
import net.minecraft.client.B.p;
import net.minecraft.w.k;

public class d {
    private static /* synthetic */ int b;
    public final /* synthetic */ Int2IntMap c;

    public static int a(net.minecraft.w.d d10) {
        k k2 = d10.w();
        int n2 = d.c();
        int n3 = k2.l();
        if (n2 == 0) {
            n3 = n3 != 0 ? d10.d() : 0;
        }
        int n4 = n3;
        return k.q.c(k2) << 16 | n4 & 0xFFFF;
    }

    public boolean a(net.minecraft.az.k k2, @Nullable IntList intList, int n2) {
        return new p(this, k2).b(n2, intList);
    }

    static void a(d d10, int n2, int n3) {
        d10.a(n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(int n2, int n3) {
        this.c.put(n2, this.c.get(n2) + n3);
    }

    public void d() {
        this.c.clear();
    }

    public boolean b(net.minecraft.az.k k2, @Nullable IntList intList) {
        return this.a(k2, intList, 1);
    }

    public d() {
        this.c = new Int2IntOpenHashMap();
    }

    public int a(net.minecraft.az.k k2, int n2, @Nullable IntList intList) {
        return new p(this, k2).a(n2, intList);
    }

    static {
        if (d.b() == 0) {
            d.b(26);
        }
    }

    public static void b(int n2) {
        b = n2;
    }

    public void b(net.minecraft.w.d d10) {
        block3: {
            int n2;
            block6: {
                int n3;
                block5: {
                    block4: {
                        block2: {
                            n3 = d.c();
                            n2 = d10.G();
                            if (n3 != 0) break block2;
                            if (n2 != 0) break block3;
                            n2 = d10.a();
                        }
                        if (n3 != 0) break block4;
                        if (n2 != 0) break block3;
                        n2 = d10.r();
                    }
                    if (n3 != 0) break block5;
                    if (n2 != 0) break block3;
                    n2 = d10.c();
                }
                if (n3 != 0) break block6;
                if (n2 != 0) break block3;
                n2 = d.a(d10);
            }
            int n4 = n2;
            int n5 = d10.t();
            this.a(n4, n5);
        }
    }

    public int a(net.minecraft.az.k k2, @Nullable IntList intList) {
        return this.a(k2, Integer.MAX_VALUE, intList);
    }

    public boolean d(int n2) {
        int n3 = d.b();
        boolean bl2 = this.c.get(n2);
        if (n3 != 0) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public static net.minecraft.w.d c(int n2) {
        return n2 == 0 ? net.minecraft.w.d.m : new net.minecraft.w.d(k.a(n2 >> 16 & 0xFFFF), 1, n2 & 0xFFFF);
    }

    public int b(int n2, int n3) {
        int n4 = this.c.get(n2);
        int n5 = d.b();
        int n6 = n4;
        if (n5 != 0) {
            if (n6 >= n3) {
                this.c.put(n2, n4 - n3);
                return n2;
            }
            n6 = 0;
        }
        return n6;
    }

    public static int c() {
        int n2 = d.b();
        if (n2 == 0) {
            return 88;
        }
        return 0;
    }

    public static int b() {
        return b;
    }
}

