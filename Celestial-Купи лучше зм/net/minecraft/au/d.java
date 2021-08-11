/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  javax.annotation.Nullable
 */
package net.minecraft.au;

import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import javax.annotation.Nullable;
import net.minecraft.Z.f;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.au.c;
import net.minecraft.au.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class d {
    private final /* synthetic */ int c;
    private final /* synthetic */ int b;
    private final /* synthetic */ Predicate<f>[][][] d;
    private final /* synthetic */ int a;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public d(Predicate<f>[][][] arrpredicate) {
        block6: {
            block2: {
                d d10;
                block3: {
                    int n2;
                    block4: {
                        d d11;
                        block5: {
                            int n3 = h.g();
                            n2 = n3;
                            this.d = arrpredicate;
                            this.b = arrpredicate.length;
                            d10 = this;
                            if (n2 != 0) break block2;
                            if (d10.b <= 0) break block3;
                            this.c = arrpredicate[0].length;
                            d11 = this;
                            if (n2 != 0) break block4;
                            if (d11.c <= 0) break block5;
                            this.a = arrpredicate[0][0].length;
                            if (n2 == 0) break block6;
                        }
                        d11 = this;
                    }
                    d11.a = 0;
                    if (n2 == 0) break block6;
                }
                this.c = 0;
                d10 = this;
            }
            d10.a = 0;
        }
    }

    public int b() {
        return this.b;
    }

    protected static n a(n n2, aA aA2, aA aA3, int n3, int n4, int n5) {
        block6: {
            aA aA4;
            aA aA5;
            int n6;
            block5: {
                n6 = h.g();
                aA5 = aA2;
                aA4 = aA3;
                if (n6 != 0) break block5;
                if (aA5 == aA4) break block6;
                aA5 = aA2;
                aA4 = aA3.h();
            }
            if (aA5 != aA4) {
                m m2 = new m(aA2.r(), aA2.p(), aA2.i());
                m m3 = new m(aA3.r(), aA3.p(), aA3.i());
                m m4 = m2.c(m3);
                n n7 = n2.a(m3.e() * -n4 + m4.e() * n3 + m2.e() * n5, m3.b() * -n4 + m4.b() * n3 + m2.b() * n5, m3.a() * -n4 + m4.a() * n3 + m2.a() * n5);
                if (n6 != 0) {
                    m.b(!m.d());
                }
                return n7;
            }
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }

    public int c() {
        return this.c;
    }

    public static LoadingCache<n, f> a(z z2, boolean bl2) {
        return CacheBuilder.newBuilder().build((CacheLoader)new c(z2, bl2));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public h a(z var1_1, n var2_2) {
        var4_3 = net.minecraft.au.d.a(var1_1, false);
        var5_4 = Math.max(Math.max(this.a, this.c), this.b);
        var3_5 = h.g();
        var6_6 = n.b(var2_2, var2_2.a(var5_4 - 1, var5_4 - 1, var5_4 - 1)).iterator();
        do {
            v0 = var6_6.hasNext();
            block1: while (true) {
                if (v0 == 0) return null;
                v1 = var6_6.next();
                block2: while (true) {
                    var7_7 = v1;
                    for (aA var11_11 : aA.values()) {
                        var12_12 = aA.values();
                        var13_13 = var12_12.length;
                        v0 = 0;
                        if (var3_5 != 0) continue block1;
                        var14_14 = v0;
                        while (var14_14 < var13_13) {
                            var15_15 = var12_12[var14_14];
                            if (var3_5 == 0) {
                                v1 = var15_15;
                                if (var3_5 != 0) continue block2;
                                if (v1 != var11_11 && var15_15 != var11_11.h()) {
                                    var16_16 = this.a(var7_7, var11_11, var15_15, var4_3);
                                    if (var3_5 == 0) {
                                        if (var16_16 != null) {
                                            return var16_16;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    ++var14_14;
                                }
                            }
                            if (var3_5 == 0) continue;
                        }
                        if (var3_5 == 0) continue;
                    }
                    break;
                }
                break;
            }
        } while (var3_5 == 0);
        return null;
    }

    public int a() {
        return this.a;
    }

    @Nullable
    private h a(n n2, aA aA2, aA aA3, LoadingCache<n, f> loadingCache) {
        int n3 = 0;
        int n4 = h.g();
        block0: while (true) {
            int n5 = n3;
            block1: while (n5 < this.a) {
                int n6 = 0;
                block2: while (true) {
                    int n7 = n6;
                    block3: while (n7 < this.c) {
                        n5 = 0;
                        if (n4 != 0) continue block1;
                        for (int i2 = v2016220; i2 < this.b; ++i2) {
                            n7 = this.d[i2][n6][n3].apply(loadingCache.getUnchecked((Object)net.minecraft.au.d.a(n2, aA2, aA3, n3, n6, i2))) ? 1 : 0;
                            if (n4 != 0) continue block3;
                            if (n7 != 0) continue;
                            return null;
                        }
                        ++n6;
                        if (n4 == 0) continue block2;
                    }
                    break;
                }
                ++n3;
                if (n4 == 0) continue block0;
            }
            break;
        }
        return new h(n2, aA2, aA3, loadingCache, this.a, this.c, this.b);
    }
}

