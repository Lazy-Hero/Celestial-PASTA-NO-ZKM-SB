/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.cache.LoadingCache
 */
package net.minecraft.au;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;
import net.minecraft.Z.f;
import net.minecraft.ar.aA;
import net.minecraft.au.d;
import net.minecraft.k.n;

public class h {
    private static /* synthetic */ int h;
    private final /* synthetic */ aA g;
    private final /* synthetic */ int b;
    private final /* synthetic */ LoadingCache<n, f> e;
    private final /* synthetic */ int d;
    private final /* synthetic */ int c;
    private final /* synthetic */ aA f;
    private final /* synthetic */ n a;

    public int f() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(int n2) {
        h = n2;
    }

    public n b() {
        return this.a;
    }

    public int a() {
        return this.b;
    }

    public h(n n2, aA aA2, aA aA3, LoadingCache<n, f> loadingCache, int n3, int n4, int n5) {
        this.a = n2;
        this.f = aA2;
        this.g = aA3;
        this.e = loadingCache;
        this.c = n3;
        this.b = n4;
        this.d = n5;
    }

    public static int g() {
        int n2 = net.minecraft.au.h.c();
        if (n2 == 0) {
            return 98;
        }
        return 0;
    }

    public aA d() {
        return this.g;
    }

    public f a(int n2, int n3, int n4) {
        return (f)this.e.getUnchecked((Object)net.minecraft.au.d.a(this.a, this.e(), this.d(), n2, n3, n4));
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.g).add("forwards", (Object)this.f).add("frontTopLeft", (Object)this.a).toString();
    }

    public aA e() {
        return this.f;
    }

    public static int c() {
        return h;
    }

    static {
        if (net.minecraft.au.h.c() == 0) {
            net.minecraft.au.h.b(80);
        }
    }
}

