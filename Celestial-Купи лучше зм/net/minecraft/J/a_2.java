/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.j.b;
import net.minecraft.j.c;
import net.minecraft.j.f;
import net.minecraft.j.g;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
implements b {
    private final /* synthetic */ c h;
    private final /* synthetic */ g c;
    private /* synthetic */ double a;
    private final /* synthetic */ Map<Integer, Set<f>> d;
    private final /* synthetic */ Map<UUID, f> e;
    private final /* synthetic */ Map<String, Set<f>> f;
    private /* synthetic */ double b;
    private /* synthetic */ boolean g;

    @Override
    public void b(f f10) {
        m[] arrm = net.minecraft.j.f.b();
        Object object = this.a(f10.c());
        if (arrm != null) {
            if (object != null) {
                throw new IllegalArgumentException("Modifier is already applied on this attribute!");
            }
            object = this.f.get(f10.d());
        }
        Set set = (Set)object;
        Object object2 = set;
        if (arrm != null) {
            if (object2 == null) {
                set = Sets.newHashSet();
                this.f.put(f10.d(), set);
            }
            this.d.get(f10.e()).add(f10);
            set.add(f10);
            object2 = this.e.put(f10.c(), f10);
        }
        this.d();
        if (arrm == null) {
            m.b(!m.c());
        }
    }

    @Override
    public Collection<f> a(int n2) {
        return this.d.get(n2);
    }

    @Override
    public double a() {
        return this.b;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public boolean c(f f10) {
        return this.e.get(f10.c()) != null;
    }

    @Override
    public void c() {
        block4: {
            Collection<f> collection;
            m[] arrm;
            block3: {
                Collection<f> collection2 = this.b();
                arrm = net.minecraft.j.f.b();
                collection = collection2;
                if (arrm == null) break block3;
                if (collection == null) break block4;
                collection = collection2;
            }
            for (f f10 : Lists.newArrayList(collection)) {
                this.a(f10);
                if (arrm != null) continue;
            }
        }
    }

    @Override
    public c e() {
        return this.h;
    }

    private Collection<f> b(int n2) {
        HashSet hashSet = Sets.newHashSet(this.a(n2));
        c c10 = this.h.a();
        m[] arrm = net.minecraft.j.f.b();
        while (c10 != null) {
            b b10 = this.c.a(c10);
            if (arrm != null) {
                if (b10 != null) {
                    hashSet.addAll(b10.a(n2));
                }
                c10 = c10.a();
            }
            if (arrm != null) continue;
        }
        return hashSet;
    }

    @Override
    public double d() {
        m[] arrm = net.minecraft.j.f.b();
        a a10 = this;
        if (arrm != null) {
            if (a10.g) {
                this.a = this.b();
                this.g = false;
            }
            a10 = this;
        }
        return a10.a;
    }

    @Override
    public void a(f f10) {
        block8: {
            Set<f> set;
            block9: {
                Set<f> set2;
                Set<f> set3;
                m[] arrm;
                block7: {
                    arrm = net.minecraft.j.f.b();
                    for (int i2 = 0; i2 < 3; ++i2) {
                        Set<f> set4 = this.d.get(i2);
                        set3 = set4;
                        if (arrm != null) {
                            set3.remove(f10);
                            if (arrm != null) continue;
                        }
                        break block7;
                    }
                    set3 = this.f.get(f10.d());
                }
                set = set2 = set3;
                if (arrm == null) break block8;
                if (set == null) break block9;
                set2.remove(f10);
                set = set2;
                if (arrm == null) break block8;
                if (set.isEmpty()) {
                    this.f.remove(f10.d());
                }
            }
            set = this.e.remove(f10.c());
        }
        this.d();
    }

    public a(g g10, c c10) {
        block1: {
            m[] arrm = net.minecraft.j.f.b();
            m[] arrm2 = arrm;
            this.d = Maps.newHashMap();
            this.f = Maps.newHashMap();
            this.e = Maps.newHashMap();
            this.g = true;
            this.c = g10;
            this.h = c10;
            this.b = c10.d();
            for (int i2 = 0; i2 < 3; ++i2) {
                this.d.put(i2, Sets.newHashSet());
                if (arrm2 != null) continue;
            }
            if (m.d()) break block1;
            net.minecraft.j.f.b(new m[4]);
        }
    }

    private double b() {
        double d10;
        block8: {
            f f10;
            Iterator<f> iterator;
            double d11;
            m[] arrm;
            block7: {
                double d12;
                double d13;
                block6: {
                    d13 = this.a();
                    arrm = net.minecraft.j.f.b();
                    for (f f11 : this.b(0)) {
                        d12 = d13 + f11.f();
                        if (arrm != null) {
                            d13 = d12;
                            if (arrm != null) continue;
                        }
                        break block6;
                    }
                    d12 = d13;
                }
                d11 = d12;
                iterator = this.b(1).iterator();
                while (iterator.hasNext()) {
                    f10 = iterator.next();
                    d11 += d13 * f10.f();
                    if (arrm != null) {
                        if (arrm != null) continue;
                    }
                    break block7;
                }
                iterator = this.b(2).iterator();
            }
            while (iterator.hasNext()) {
                f10 = iterator.next();
                d10 = d11 * (1.0 + f10.f());
                if (arrm != null) {
                    d11 = d10;
                    if (arrm != null) continue;
                }
                break block8;
            }
            d10 = this.h.a(d11);
        }
        return d10;
    }

    @Override
    public Collection<f> b() {
        HashSet hashSet;
        block2: {
            HashSet hashSet2 = Sets.newHashSet();
            m[] arrm = net.minecraft.j.f.b();
            for (int i2 = 0; i2 < 3; ++i2) {
                hashSet = hashSet2;
                if (arrm != null) {
                    hashSet.addAll(this.a(i2));
                    if (arrm != null) continue;
                }
                break block2;
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    @Override
    public void a(double d10) {
        block3: {
            block2: {
                m[] arrm = net.minecraft.j.f.b();
                if (arrm == null) break block2;
                if (d10 == this.a()) break block3;
                this.b = d10;
            }
            this.d();
        }
    }

    @Override
    @Nullable
    public f a(UUID uUID) {
        return this.e.get(uUID);
    }

    @Override
    public void b(UUID uUID) {
        block0: {
            f f10 = this.a(uUID);
            if (f10 == null) break block0;
            this.a(f10);
        }
    }

    protected void d() {
        this.g = true;
        this.c.a(this);
    }
}

