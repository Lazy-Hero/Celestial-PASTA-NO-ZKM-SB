/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.j;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.V;
import net.minecraft.j.a;
import net.minecraft.j.b;
import net.minecraft.j.c;
import net.minecraft.j.e;
import net.minecraft.j.f;
import net.minecraft.j.g;
import net.minecraft.k.m;

public class h
extends g {
    protected final /* synthetic */ Map<String, b> e;
    private final /* synthetic */ Set<b> d;

    public Collection<b> b() {
        HashSet hashSet = Sets.newHashSet();
        Iterator<b> iterator = this.a().iterator();
        m[] arrm = f.b();
        while (iterator.hasNext()) {
            b b10 = iterator.next();
            boolean bl2 = b10.e().b();
            if (arrm != null && bl2) {
                bl2 = hashSet.add(b10);
            }
            if (arrm != null) continue;
        }
        return hashSet;
    }

    @Override
    protected b c(c c10) {
        return new a(this, c10);
    }

    public h() {
        this.d = Sets.newHashSet();
        this.e = new V<b>();
    }

    @Override
    public a a(c c10) {
        return (a)super.a(c10);
    }

    @Override
    public void a(b b10) {
        m[] arrm = f.b();
        boolean bl2 = b10.e().b();
        if (arrm != null && bl2) {
            bl2 = this.d.add(b10);
        }
        for (c c10 : this.a.get((Object)b10.e())) {
            block6: {
                b b11;
                block5: {
                    b b12;
                    b11 = b12 = this.a(c10);
                    if (arrm == null) break block5;
                    if (b11 == null) break block6;
                    b11 = b12;
                }
                ((a)b11).d();
            }
            if (arrm != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public a a(String string) {
        b b10 = super.a(string);
        m[] arrm = f.b();
        b b11 = b10;
        if (arrm != null) {
            if (b11 == null) {
                b10 = this.e.get(string);
            }
            b11 = b10;
        }
        return (a)b11;
    }

    public Set<b> c() {
        return this.d;
    }

    @Override
    public b b(c c10) {
        b b10;
        block5: {
            c c11;
            m[] arrm;
            block4: {
                b10 = super.b(c10);
                arrm = f.b();
                c11 = c10;
                if (arrm == null) break block4;
                if (!(c11 instanceof e)) break block5;
                c11 = c10;
            }
            Object object = ((e)c11).a();
            if (arrm != null && object != null) {
                object = this.e.put(((e)c10).a(), b10);
            }
        }
        return b10;
    }
}

