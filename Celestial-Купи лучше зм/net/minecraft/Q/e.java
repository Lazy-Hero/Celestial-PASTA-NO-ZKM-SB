/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.Q;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.a1;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.ar.v;
import net.minecraft.n.a;

public class e
implements K<a> {
    private /* synthetic */ Map<v, a1> d;
    private /* synthetic */ Map<v, aS> b;
    private /* synthetic */ Set<v> c;
    private /* synthetic */ boolean a;

    @Override
    public void b(m m2) throws IOException {
        boolean bl2;
        block6: {
            block5: {
                boolean bl3 = aD.i();
                m2.writeBoolean(this.a);
                m2.d(this.d.size());
                bl2 = bl3;
                for (Map.Entry<v, a1> object : this.d.entrySet()) {
                    v v2 = object.getKey();
                    a1 a12 = object.getValue();
                    m2.a(v2);
                    a12.a(m2);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block5;
                }
                m2.d(this.c.size());
            }
            for (v v3 : this.c) {
                m2.a(v3);
                if (bl2) {
                    if (bl2) continue;
                }
                break block6;
            }
            m2.d(this.b.size());
        }
        for (Map.Entry entry : this.b.entrySet()) {
            m2.a((v)entry.getKey());
            ((aS)entry.getValue()).a(m2);
            if (bl2) continue;
        }
    }

    public Map<v, aS> d() {
        return this.b;
    }

    public Set<v> b() {
        return this.c;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean c() {
        return this.a;
    }

    public e(boolean bl2, Collection<aN> collection, Set<v> set, Map<v, aS> map) {
        block2: {
            boolean bl3 = aD.c();
            this.a = bl2;
            this.d = Maps.newHashMap();
            boolean bl4 = bl3;
            for (aN aN2 : collection) {
                this.d.put(aN2.f(), aN2.c());
                if (!bl4) {
                    if (!bl4) continue;
                }
                break block2;
            }
            this.c = set;
            this.b = Maps.newHashMap(map);
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public e() {
    }

    @Override
    public void a(m m2) throws IOException {
        v v2;
        int n2;
        int n3;
        boolean bl2;
        block6: {
            block5: {
                this.a = m2.readBoolean();
                this.d = Maps.newHashMap();
                this.c = Sets.newLinkedHashSet();
                this.b = Maps.newHashMap();
                bl2 = aD.c();
                n3 = m2.a();
                for (n2 = 0; n2 < n3; ++n2) {
                    v2 = m2.e();
                    a1 a12 = a1.b(m2);
                    this.d.put(v2, a12);
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block5;
                }
                n3 = m2.a();
            }
            for (n2 = 0; n2 < n3; ++n2) {
                v2 = m2.e();
                this.c.add(v2);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block6;
            }
            n3 = m2.a();
        }
        for (n2 = 0; n2 < n3; ++n2) {
            v2 = m2.e();
            this.b.put(v2, aS.b(m2));
            if (!bl2) continue;
        }
    }

    public Map<v, a1> a() {
        return this.d;
    }
}

