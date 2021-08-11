/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.ar.Z;
import net.minecraft.c.l;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.j.d;
import net.minecraft.client.j.e;
import net.minecraft.client.j.f;
import net.minecraft.client.j.g;
import net.minecraft.client.j.i;
import net.minecraft.client.j.m;
import net.minecraft.client.j.o;
import net.minecraft.client.j.p;
import net.minecraft.client.j.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class u
implements o,
x {
    private final /* synthetic */ List<o> c;
    private final /* synthetic */ Map<String, Integer> g;
    private final /* synthetic */ Map<net.minecraft.ar.v, d> e;
    private final /* synthetic */ t a;
    private static /* synthetic */ boolean d;
    private static final /* synthetic */ Logger b;
    public static final /* synthetic */ net.minecraft.ar.v f;

    public static boolean c() {
        boolean bl2 = u.d();
        return !bl2;
    }

    public void b() {
        Iterator<Map.Entry<net.minecraft.ar.v, d>> iterator = this.e.entrySet().iterator();
        boolean bl2 = u.c();
        while (iterator.hasNext()) {
            Map.Entry<net.minecraft.ar.v, d> entry = iterator.next();
            net.minecraft.ar.v v2 = entry.getKey();
            d d10 = entry.getValue();
            boolean bl3 = d10 instanceof g;
            if (!bl2 && bl3) {
                bl3 = this.a(v2, d10);
            }
            if (!bl2) continue;
        }
    }

    public void c(net.minecraft.ar.v v2) {
        block3: {
            d d10;
            block2: {
                d d11 = this.a(v2);
                boolean bl2 = u.c();
                d10 = d11;
                if (bl2) break block2;
                if (d10 == null) break block3;
                this.e.remove(v2);
                d10 = d11;
            }
            p.c(d10.c());
        }
    }

    public void b(net.minecraft.ar.v v2) {
        block9: {
            int n2;
            block7: {
                d d10;
                block8: {
                    boolean bl2 = u.d();
                    boolean bl3 = fU.aW();
                    if (bl2) {
                        if (bl3) {
                            v2 = ab.a(v2);
                        }
                        bl3 = fU.p();
                    }
                    if (bl3) {
                        v2 = eO.a(v2);
                    }
                    if ((d10 = this.e.get(v2)) == null) {
                        d10 = new i(v2);
                        this.a(v2, d10);
                    }
                    n2 = fU.ag();
                    if (!bl2) break block7;
                    if (n2 == 0) break block8;
                    s.a(d10);
                    if (bl2) break block9;
                }
                n2 = d10.c();
            }
            p.a(n2);
        }
    }

    @Override
    public void b(t t2) {
        d d10;
        Object object;
        Object object2;
        boolean bl2;
        block6: {
            Object object3;
            boolean bl3 = u.d();
            fU.b("*** Reloading textures ***");
            bl2 = bl3;
            fU.e("Resource packs: " + fU.bk());
            Iterator<net.minecraft.ar.v> iterator = this.e.keySet().iterator();
            while (iterator.hasNext()) {
                block9: {
                    block11: {
                        d d11;
                        block10: {
                            Object object4;
                            block7: {
                                block8: {
                                    object3 = iterator;
                                    if (!bl2) break block6;
                                    object2 = object3.next();
                                    object4 = object = ((net.minecraft.ar.v)object2).a();
                                    if (!bl2) break block7;
                                    if (((String)object4).startsWith("mcpatcher/")) break block8;
                                    object4 = object;
                                    if (!bl2) break block7;
                                    if (!((String)object4).startsWith("optifine/")) break block9;
                                }
                                object4 = this.e.get(object2);
                            }
                            d11 = d10 = (d)object4;
                            if (!bl2) break block10;
                            if (!(d11 instanceof e)) break block11;
                            d11 = d10;
                        }
                        e e10 = (e)d11;
                        e10.c();
                    }
                    iterator.remove();
                }
                if (bl2) continue;
            }
            object3 = object2 = this.e.entrySet().iterator();
        }
        while (object2.hasNext()) {
            block14: {
                block13: {
                    block12: {
                        object = (Map.Entry)object2.next();
                        d10 = (d)object.getValue();
                        if (!bl2) break block12;
                        if (d10 != p.b) break block13;
                        object2.remove();
                    }
                    if (bl2) break block14;
                }
                this.a((net.minecraft.ar.v)object.getKey(), d10);
            }
            if (bl2) continue;
        }
    }

    public boolean a(net.minecraft.ar.v v2, v v3) {
        boolean bl2 = u.c();
        boolean bl3 = this.a(v2, (d)v3);
        if (!bl2) {
            if (bl3) {
                this.c.add(v3);
                return true;
            }
            bl3 = false;
        }
        return bl3;
    }

    public d a(net.minecraft.ar.v v2) {
        return this.e.get(v2);
    }

    static {
        b = LogManager.getLogger();
        f = new net.minecraft.ar.v("");
        u.b(true);
    }

    @Override
    public void a() {
        Iterator<o> iterator = this.c.iterator();
        boolean bl2 = u.c();
        while (iterator.hasNext()) {
            o o2 = iterator.next();
            o2.a();
            if (!bl2) continue;
        }
    }

    public u(t t2) {
        this.e = Maps.newHashMap();
        this.c = Lists.newArrayList();
        this.g = Maps.newHashMap();
        this.a = t2;
    }

    public static void b(boolean bl2) {
        d = bl2;
    }

    public boolean a(net.minecraft.ar.v v2, d d10) {
        boolean bl2 = true;
        try {
            d10.a(this.a);
        }
        catch (IOException iOException) {
            if (v2 != f) {
                b.warn("Failed to load texture: {}", (Object)v2, (Object)iOException);
            }
            d10 = p.b;
            this.e.put(v2, d10);
            bl2 = false;
        }
        catch (Throwable throwable) {
            d d11 = d10;
            net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Registering texture");
            l l2 = f10.a("Resource location being registered");
            l2.a("Resource location", v2);
            l2.a("Texture object class", new m(this, d11));
            throw new Z(f10);
        }
        this.e.put(v2, d10);
        return bl2;
    }

    public static boolean d() {
        return d;
    }

    public net.minecraft.ar.v a(String string, f f10) {
        Integer n2;
        block7: {
            Integer n3;
            block5: {
                block6: {
                    boolean bl2 = u.d();
                    Object object = string;
                    if (bl2) {
                        if (((String)object).equals("logo")) {
                            f10 = fU.a(f10);
                        }
                        object = this.g.get(string);
                    }
                    n3 = n2 = (Integer)object;
                    if (!bl2) break block5;
                    if (n3 != null) break block6;
                    n2 = 1;
                    if (bl2) break block7;
                }
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        this.g.put(string, n2);
        net.minecraft.ar.v v2 = new net.minecraft.ar.v(String.format("dynamic/%s_%d", string, n2));
        this.a(v2, (d)f10);
        return v2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

