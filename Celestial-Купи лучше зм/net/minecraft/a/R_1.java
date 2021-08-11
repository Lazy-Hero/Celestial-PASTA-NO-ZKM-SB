/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package net.minecraft.A;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import net.minecraft.A.a;
import net.minecraft.A.b;
import net.minecraft.A.h;

public class R {
    private final /* synthetic */ List<a> b;
    private final /* synthetic */ b a;
    private /* synthetic */ long d;
    private final /* synthetic */ Long2ObjectMap<a> c;

    public a b(int n2, int n3) {
        a a10;
        long l2 = (long)(n2 >>= 4) & 0xFFFFFFFFL | ((long)(n3 >>= 4) & 0xFFFFFFFFL) << 32;
        boolean bl2 = net.minecraft.A.b.c();
        a a11 = a10 = (a)this.c.get(l2);
        if (bl2) {
            if (a11 == null) {
                a10 = new a(this, n2, n3);
                this.c.put(l2, (Object)a10);
                this.b.add(a10);
            }
            a10.d = net.minecraft.R.b.R();
            a11 = a10;
        }
        return a11;
    }

    public h a(int n2, int n3, h h2) {
        h h3 = this.b(n2, n3).a(n2, n3);
        boolean bl2 = net.minecraft.A.b.c();
        h h4 = h3;
        if (bl2) {
            h4 = h4 == null ? h2 : h3;
        }
        return h4;
    }

    public R(b b10) {
        this.c = new Long2ObjectOpenHashMap(4096);
        this.b = Lists.newArrayList();
        this.a = b10;
    }

    static b a(R r2) {
        return r2.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public h[] a(int n2, int n3) {
        return this.b((int)n2, (int)n3).b;
    }

    public void a() {
        block5: {
            long l2;
            boolean bl2;
            long l3;
            block3: {
                long l4;
                block4: {
                    l3 = net.minecraft.R.b.R();
                    bl2 = net.minecraft.A.b.f();
                    long l5 = l3 - this.d;
                    long l6 = l5 - 7500L;
                    l4 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                    if (bl2) break block3;
                    if (l4 > 0) break block4;
                    long l7 = l5 - 0L;
                    l4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (bl2) break block3;
                    if (l4 >= 0) break block5;
                }
                this.d = l3;
                l4 = l2 = (long)0;
            }
            while (l2 < this.b.size()) {
                block8: {
                    long l8;
                    a a10;
                    block6: {
                        block7: {
                            a10 = this.b.get((int)l2);
                            long l9 = l3 - a10.d;
                            long l10 = l9 - 30000L;
                            l8 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                            if (bl2) break block6;
                            if (l8 > 0) break block7;
                            long l11 = l9 - 0L;
                            l8 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                            if (bl2) break block6;
                            if (l8 >= 0) break block8;
                        }
                        this.b.remove((int)l2--);
                        l8 = a10.e;
                    }
                    long l12 = (long)l8 & 0xFFFFFFFFL | ((long)a10.a & 0xFFFFFFFFL) << 32;
                    this.c.remove(l12);
                }
                ++l2;
                if (!bl2) continue;
            }
        }
    }
}

