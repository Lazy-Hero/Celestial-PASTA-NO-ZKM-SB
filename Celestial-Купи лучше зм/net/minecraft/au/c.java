/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package net.minecraft.au;

import com.google.common.cache.CacheLoader;
import net.minecraft.Z.f;
import net.minecraft.ah.z;
import net.minecraft.k.n;

class c
extends CacheLoader<n, f> {
    private final /* synthetic */ z b;
    private final /* synthetic */ boolean a;

    public f a(n n2) throws Exception {
        return new f(this.b, n2, this.a);
    }

    public c(z z2, boolean bl2) {
        this.b = z2;
        this.a = bl2;
    }
}

