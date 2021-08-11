/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.client.x;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.aG;
import net.minecraft.client.p.a;
import net.minecraft.client.p.h;
import net.minecraft.client.p.k;
import net.minecraft.client.p.n;
import net.minecraft.client.x.B;
import net.minecraft.client.x.P;
import net.minecraft.client.x.S;
import net.minecraft.client.x.T;
import net.minecraft.client.x.W;
import net.minecraft.client.x.o;
import net.minecraft.client.x.t;

public class Z {
    private /* synthetic */ n a;
    private final /* synthetic */ Map<String, W> b;
    @VisibleForTesting
    static final /* synthetic */ Gson c;

    public boolean a() {
        return this.a != null;
    }

    static {
        c = new GsonBuilder().registerTypeAdapter(Z.class, (Object)new T()).registerTypeAdapter(S.class, (Object)new t()).registerTypeAdapter(W.class, (Object)new B()).registerTypeAdapter(n.class, (Object)new k()).registerTypeAdapter(h.class, (Object)new a()).create();
    }

    public static Z a(Reader reader) {
        return aG.a(c, reader, Z.class);
    }

    public boolean b(String string) {
        return this.b.get(string) != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2;
        Z z2;
        block6: {
            String[] arrstring;
            block5: {
                arrstring = P.o();
                Object object2 = this;
                if (arrstring == null) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                boolean bl3 = object2 instanceof Z;
                if (arrstring != null) return bl3;
                if (!bl3) return false;
                z2 = (Z)object;
                bl3 = this.b.equals(z2.b);
                if (arrstring != null) return bl3;
                if (!bl3) return false;
                bl2 = this.a();
                if (arrstring != null) break block5;
                if (bl2) break block6;
                bl2 = z2.a();
            }
            if (arrstring != null) return bl2;
            if (bl2) return false;
            return true;
        }
        bl2 = this.a.equals(z2.a);
        return bl2;
    }

    public Z(Map<String, W> map, n n2) {
        this.b = Maps.newHashMap();
        this.a = n2;
        this.b.putAll(map);
    }

    public n c() {
        return this.a;
    }

    public Z(List<Z> list) {
        block10: {
            Z z2;
            block9: {
                Z z3;
                String[] arrstring;
                block8: {
                    this.b = Maps.newHashMap();
                    z2 = null;
                    Iterator<Z> iterator = list.iterator();
                    arrstring = P.o();
                    while (iterator.hasNext()) {
                        Z z4;
                        z3 = z4 = iterator.next();
                        if (arrstring == null) {
                            Z z5;
                            if (arrstring == null) {
                                if (z3.a()) {
                                    this.b.clear();
                                    z2 = z4;
                                }
                                z5 = this;
                            }
                            z5.b.putAll(z4.b);
                            if (arrstring == null) continue;
                        }
                        break block8;
                    }
                    z3 = z2;
                }
                if (arrstring != null) break block9;
                if (z3 == null) break block10;
                z3 = this;
            }
            z3.a = z2.a;
        }
    }

    public W a(String string) {
        W w2 = this.b.get(string);
        String[] arrstring = P.o();
        W w3 = w2;
        if (arrstring == null) {
            if (w3 == null) {
                throw new o(this);
            }
            w3 = w2;
        }
        return w3;
    }

    public Set<W> b() {
        HashSet hashSet = Sets.newHashSet(this.b.values());
        String[] arrstring = P.o();
        boolean bl2 = this.a();
        if (arrstring == null && bl2) {
            bl2 = hashSet.addAll(this.a.a());
        }
        return hashSet;
    }

    private static o a(o o2) {
        return o2;
    }

    public int hashCode() {
        String[] arrstring = P.o();
        int n3 = 31 * this.b.hashCode();
        n3 = this.a();
        if (arrstring == null) {
            n3 = n3 != 0 ? this.a.hashCode() : 0;
        }
        return n2 + n3;
    }
}

