/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.D.A;
import net.minecraft.client.D.a;
import net.minecraft.client.D.f;
import net.minecraft.client.D.h;
import net.minecraft.client.D.k;
import net.minecraft.client.D.t;
import net.minecraft.client.D.v;
import net.minecraft.client.D.x;
import net.minecraft.client.v.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class u
implements f {
    private final /* synthetic */ List<x> d;
    private final /* synthetic */ Map<String, k> b;
    private final /* synthetic */ Set<String> f;
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ o e;
    private static final /* synthetic */ Joiner c;

    static {
        a = LogManager.getLogger();
        c = Joiner.on((String)", ");
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void b() {
        this.b.clear();
        this.f.clear();
    }

    public u(o o2) {
        this.b = Maps.newHashMap();
        this.d = Lists.newArrayList();
        this.f = Sets.newLinkedHashSet();
        this.e = o2;
    }

    @Override
    public v a(net.minecraft.ar.v v2) throws IOException {
        block3: {
            t t2;
            block2: {
                t t3 = this.b.get(v2.c());
                boolean bl2 = h.c();
                t2 = t3;
                if (!bl2) break block2;
                if (t2 == null) break block3;
                t2 = t3;
            }
            return t2.a(v2);
        }
        throw new FileNotFoundException(v2.toString());
    }

    @Override
    public List<v> b(net.minecraft.ar.v v2) throws IOException {
        block3: {
            t t2;
            block2: {
                t t3 = this.b.get(v2.c());
                boolean bl2 = h.c();
                t2 = t3;
                if (!bl2) break block2;
                if (t2 == null) break block3;
                t2 = t3;
            }
            return t2.b(v2);
        }
        throw new FileNotFoundException(v2.toString());
    }

    public void a(a a10) {
        Iterator<String> iterator = a10.a().iterator();
        boolean bl2 = h.b();
        while (iterator.hasNext()) {
            k k2;
            String string = iterator.next();
            this.f.add(string);
            k k3 = k2 = this.b.get(string);
            if (!bl2) {
                if (k3 == null) {
                    k2 = new k(this.e);
                    this.b.put(string, k2);
                }
                k3 = k2;
            }
            k3.a(a10);
            if (!bl2) continue;
        }
    }

    @Override
    public void a(x x2) {
        this.d.add(x2);
        x2.b(this);
    }

    @Override
    public Set<String> a() {
        return this.f;
    }

    @Override
    public void a(List<a> list) {
        block2: {
            boolean bl2 = h.b();
            this.b();
            a.info("Reloading ResourceManager: {}", (Object)c.join(Iterables.transform(list, (Function)new A(this))));
            Iterator<a> iterator = list.iterator();
            boolean bl3 = bl2;
            while (iterator.hasNext()) {
                a a10 = iterator.next();
                this.a(a10);
                if (!bl3) {
                    if (!bl3) continue;
                }
                break block2;
            }
            this.a();
        }
    }

    private void a() {
        Iterator<x> iterator = this.d.iterator();
        boolean bl2 = h.c();
        while (iterator.hasNext()) {
            x x2 = iterator.next();
            x2.b(this);
            if (bl2) continue;
        }
    }
}

