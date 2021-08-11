/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.b;

import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.b.b;
import net.minecraft.b.d;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;

public class e<K, V>
extends d<K, V> {
    private final /* synthetic */ K h;
    private /* synthetic */ V g;

    @Override
    @Nonnull
    public V a(Random random) {
        Object v2 = super.a(random);
        m[] arrm = b.b();
        Object v3 = v2;
        if (arrm != null) {
            v3 = v3 == null ? this.g : v2;
        }
        return v3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nonnull
    public K b(V v2) {
        Object k2 = super.b(v2);
        m[] arrm = b.b();
        Object k3 = k2;
        if (arrm != null) {
            k3 = k3 == null ? this.h : k2;
        }
        return k3;
    }

    public e(K k2) {
        this.h = k2;
    }

    @Override
    public void a(int n2, K k2, V v2) {
        block2: {
            m[] arrm = b.b();
            e e10 = this;
            if (arrm != null) {
                if (e10.h.equals(k2)) {
                    this.g = v2;
                }
                e10 = this;
            }
            super.a(n2, k2, v2);
            if (!m.c()) break block2;
            b.b(new m[4]);
        }
    }

    public void a() {
        m[] arrm = b.b();
        Validate.notNull(this.g, (String)("Missing default of DefaultedMappedRegistry: " + this.h), (Object[])new Object[0]);
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            m.b(!m.c());
        }
    }

    @Override
    @Nonnull
    public V a(int n2) {
        Object v2 = super.a(n2);
        m[] arrm = b.b();
        Object v3 = v2;
        if (arrm != null) {
            v3 = v3 == null ? this.g : v2;
        }
        return v3;
    }

    @Override
    @Nonnull
    public V a(@Nullable K k2) {
        Object v2 = super.a(k2);
        return v2 == null ? this.g : v2;
    }

    @Override
    public int c(V v2) {
        int n2 = super.c(v2);
        m[] arrm = b.b();
        int n3 = n2;
        if (arrm != null) {
            n3 = n3 == -1 ? super.c(this.g) : n2;
        }
        return n3;
    }
}

