/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aE;
import net.minecraft.W.cI;
import net.minecraft.Z.c;
import net.minecraft.Z.d;
import net.minecraft.Z.h;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ac.b;
import net.minecraft.ae.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class m
extends l {
    private final /* synthetic */ K h;
    private /* synthetic */ ImmutableTable<a<?>, Comparable<?>, i> g;
    private final /* synthetic */ ImmutableMap<a<?>, Comparable<?>> i;

    public boolean b(t t2, n n2, aA aA2) {
        return cq.g(this.h, cq.K, this, t2, n2, aA2);
    }

    @Override
    public Collection<a<?>> c() {
        return Collections.unmodifiableCollection(this.i.keySet());
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public i a(net.minecraft.ar.h h2) {
        return this.h.a((i)this, h2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public k f(t t2, n n2) {
        K k2;
        cI cI2 = this.h.h();
        String string = c.c();
        if (cI2 != cI.NONE) {
            k2 = this.h;
            if (string == null) return k2.a((i)this, t2, n2);
            if (!(k2 instanceof aE)) {
                k k3 = this.h.a((i)this, t2, n2);
                return fM.a(k3, cI2, n2);
            }
        }
        k2 = this.h;
        return k2.a((i)this, t2, n2);
    }

    @Override
    public k a(z z2, n n2) {
        return this.h.a((i)this, z2, n2);
    }

    @Override
    public boolean c() {
        return this.h.k(this);
    }

    private m(K k2, ImmutableMap<a<?>, Comparable<?>> immutableMap) {
        this.h = k2;
        this.i = immutableMap;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public int c(z z2, n n2) {
        return this.h.b((i)this, z2, n2);
    }

    @Override
    public boolean k() {
        return this.h.w(this);
    }

    m(K k2, ImmutableMap immutableMap, h h2) {
        this(k2, immutableMap);
    }

    @Override
    public float a(j j2, z z2, n n2) {
        return this.h.a((i)this, j2, z2, n2);
    }

    @Override
    public boolean b() {
        return this.h.n(this);
    }

    @Override
    public boolean a(z z2, n n2, int n3, int n4) {
        return this.h.a((i)this, z2, n2, n3, n4);
    }

    @Override
    public boolean i() {
        return this.h.p(this);
    }

    @Override
    public void a(z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        this.h.a(this, z2, n2, k2, list, x2, bl2);
    }

    @Override
    public aW n() {
        return this.h.b(this);
    }

    @Override
    public boolean a(x x2) {
        return this.h.a((i)this, x2);
    }

    @Override
    public void a(z z2, n n2, K k2, n n3) {
        this.h.a((i)this, z2, n2, k2, n3);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public int j() {
        return this.h.v(this);
    }

    private Map<a<?>, Comparable<?>> a(a<?> a10, Comparable<?> comparable) {
        HashMap hashMap = Maps.newHashMap(this.i);
        hashMap.put(a10, comparable);
        return hashMap;
    }

    @Override
    public int b(t t2, n n2, aA aA2) {
        return this.h.c(this, t2, n2, aA2);
    }

    @Override
    public net.minecraft.ac.c o() {
        return this.h.a(this);
    }

    public boolean a(t t2, n n2, aA aA2) {
        return cq.g(this.h, cq.dP, this, t2, n2, aA2);
    }

    @Override
    public int h() {
        return this.h.t(this);
    }

    @Override
    public boolean d(t t2, n n2, aA aA2) {
        return this.h.b(this, t2, n2, aA2);
    }

    @Override
    public boolean d() {
        return this.h.i(this);
    }

    @Override
    public boolean m() {
        return this.h.u(this);
    }

    @Override
    public boolean r() {
        return this.h.f(this);
    }

    @Override
    public ImmutableTable<a<?>, Comparable<?>, i> d() {
        return this.g;
    }

    @Override
    public K b() {
        return this.h;
    }

    @Override
    public i a(ae ae2) {
        return this.h.a((i)this, ae2);
    }

    @Override
    public float g() {
        return this.h.j(this);
    }

    @Override
    public i c(t t2, n n2) {
        return this.h.e(this, t2, n2);
    }

    @Override
    public b q() {
        return this.h.m(this);
    }

    @Override
    public boolean l() {
        return this.h.e(this);
    }

    @Override
    public int a(t t2, n n2, aA aA2) {
        return this.h.a((i)this, t2, n2, aA2);
    }

    @Override
    public net.minecraft.k.i a(z z2, n n2, net.minecraft.k.l l2, net.minecraft.k.l l3) {
        return this.h.a((i)this, z2, n2, l2, l3);
    }

    @Override
    @Nullable
    public k d(t t2, n n2) {
        return this.h.c((i)this, t2, n2);
    }

    public int a(t t2, n n2) {
        return cq.c(this.h, cq.dT, this, t2, n2);
    }

    @Override
    public net.minecraft.ac.a a(t t2, n n2) {
        return this.h.f(this, t2, n2);
    }

    @Override
    public d c(t t2, n n2, aA aA2) {
        return this.h.a(t2, this, n2, aA2);
    }

    @Override
    public boolean p() {
        return this.h.s(this);
    }

    @Override
    public boolean f() {
        return this.h.r(this);
    }

    protected m(K k2, ImmutableMap<a<?>, Comparable<?>> immutableMap, ImmutableTable<a<?>, Comparable<?>, i> immutableTable) {
        this.h = k2;
        this.i = immutableMap;
        this.g = immutableTable;
    }

    @Override
    public boolean e() {
        return this.h.c(this);
    }

    public int b(t t2, n n2) {
        return cq.c(this.h, cq.y, this, t2, n2);
    }

    @Override
    public net.minecraft.k.l b(t t2, n n2) {
        return this.h.d(this, t2, n2);
    }

    @Override
    public float b(z z2, n n2) {
        return this.h.c((i)this, z2, n2);
    }

    @Override
    public <T extends Comparable<T>> T b(a<T> a10) {
        Comparable comparable = (Comparable)this.i.get(a10);
        String string = c.c();
        Comparable comparable2 = comparable;
        if (string != null) {
            if (comparable2 == null) {
                throw new IllegalArgumentException("Cannot get property " + a10 + " as it does not exist in " + this.h.i());
            }
            comparable2 = (Comparable)a10.b().cast(comparable);
        }
        return (T)comparable2;
    }

    @Override
    public <T extends Comparable<T>, V extends T> i a(a<T> a10, V v2) {
        i i2;
        Comparable comparable = (Comparable)this.i.get(a10);
        String string = c.c();
        Object object = comparable;
        if (string != null) {
            if (object == null) {
                throw new IllegalArgumentException("Cannot set property " + a10 + " as it does not exist in " + this.h.i());
            }
            object = comparable;
        }
        if (string != null) {
            if (object == v2) {
                return this;
            }
            object = this.g.get(a10, v2);
        }
        i i3 = i2 = (i)object;
        if (string != null) {
            if (i3 == null) {
                throw new IllegalArgumentException("Cannot set property " + a10 + " to " + v2 + " on block " + K.h.b(this.h) + ", it is not an allowed value");
            }
            i3 = i2;
        }
        return i3;
    }

    @Override
    public ImmutableMap<a<?>, Comparable<?>> a() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Map<Map<a<?>, Comparable<?>>, m> map) {
        String string = c.c();
        if (this.g != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (Map.Entry entry : this.i.entrySet()) {
            Object object = entry.getKey();
            block1: while (true) {
                a a10 = (a)object;
                if (string == null) return;
                for (Comparable comparable : a10.a()) {
                    object = comparable;
                    if (string == null) continue block1;
                    if (string != null && object != entry.getValue()) {
                        hashBasedTable.put((Object)a10, (Object)comparable, (Object)map.get(this.a(a10, comparable)));
                    }
                    if (string != null) continue;
                }
                break;
            }
            if (string != null) continue;
        }
        this.g = ImmutableTable.copyOf((Table)hashBasedTable);
    }

    @Override
    public boolean a() {
        return this.h.o(this);
    }

    @Override
    public int e(t t2, n n2) {
        return this.h.b((i)this, t2, n2);
    }
}

