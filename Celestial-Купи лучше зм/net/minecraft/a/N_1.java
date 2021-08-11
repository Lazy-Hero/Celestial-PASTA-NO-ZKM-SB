/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 */
package net.minecraft.A;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import net.minecraft.A.L;
import net.minecraft.A.M;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.P;
import net.minecraft.p.X;

public class N
extends M {
    private static final /* synthetic */ LoadingCache<Long, X[]> M;
    private final /* synthetic */ P N;

    public static X[] a(z z2) {
        Random random = new Random(z2.C());
        long l2 = random.nextLong() & 0xFFFFL;
        return (X[])M.getUnchecked((Object)l2);
    }

    static {
        M = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build((CacheLoader)new L(null));
    }

    public N() {
        this.N = new P();
    }

    @Override
    protected void a(h h2, z z2, Random random) {
        X[] arrx;
        this.a(z2, random);
        X[] arrx2 = arrx = net.minecraft.A.N.a(z2);
        int n2 = arrx2.length;
        int n3 = 0;
        boolean bl2 = net.minecraft.A.b.c();
        while (n3 < n2) {
            X x2 = arrx2[n3];
            if (bl2) {
                if (x2.a(this.y)) {
                    this.N.a(x2);
                    this.N.a(z2, random, new n(x2.c(), 45, x2.a()));
                }
                ++n3;
            }
            if (bl2) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

