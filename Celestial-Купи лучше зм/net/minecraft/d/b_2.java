/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.D;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.D.a;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.D.l;
import net.minecraft.D.m;
import net.minecraft.U.x;
import net.minecraft.i.j;

public class b {
    private final /* synthetic */ Map<String, h> c;
    private final /* synthetic */ Map<String, m> f;
    private final /* synthetic */ Map<a, List<h>> a;
    private final /* synthetic */ Map<String, m> g;
    private static /* synthetic */ String[] b;
    private final /* synthetic */ h[] d;
    private final /* synthetic */ Map<String, Map<h, e>> e;

    public h a(String string, a a10) {
        h h2;
        block5: {
            int n2 = l.c();
            if (string.length() > 16) {
                throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
            }
            h2 = this.h(string);
            Object object = h2;
            if (n2 != 0) {
                if (object != null) {
                    throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
                }
                h2 = new h(this, string, a10);
                object = this.a.get(a10);
            }
            List list = (List)object;
            Object object2 = list;
            if (n2 != 0) {
                if (object2 == null) {
                    list = Lists.newArrayList();
                    this.a.put(a10, list);
                }
                list.add(h2);
                object2 = this.c.put(string, h2);
            }
            this.a(h2);
            if (!net.minecraft.k.m.c()) break block5;
            l.b(++n2);
        }
        return h2;
    }

    public void a(h h2) {
    }

    public void b(h h2) {
    }

    public Map<h, e> d(String string) {
        HashMap hashMap = this.e.get(string);
        int n2 = l.c();
        HashMap hashMap2 = hashMap;
        if (n2 != 0) {
            if (hashMap2 == null) {
                hashMap = Maps.newHashMap();
            }
            hashMap2 = hashMap;
        }
        return hashMap2;
    }

    public void b(m m2) {
    }

    public e d(String string, h h2) {
        e e10;
        Map map;
        int n2 = l.a();
        Object object = string;
        if (n2 == 0) {
            if (((String)object).length() > 40) {
                throw new IllegalArgumentException("The player name '" + string + "' is too long!");
            }
            object = this.e.get(string);
        }
        Map map2 = map = (Map)object;
        if (n2 == 0) {
            if (map2 == null) {
                map = Maps.newHashMap();
                this.e.put(string, map);
            }
            map2 = map.get(h2);
        }
        e e11 = e10 = (e)((Object)map2);
        if (n2 == 0) {
            if (e11 == null) {
                e10 = new e(this, h2, string);
                map.put(h2, e10);
            }
            e11 = e10;
        }
        return e11;
    }

    public Collection<String> f() {
        return this.g.keySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int f(String string) {
        net.minecraft.at.l l2;
        int n2 = l.a();
        int n3 = "list".equalsIgnoreCase(string);
        if (n2 == 0) {
            if (n3 != 0) {
                return 0;
            }
            n3 = "sidebar".equalsIgnoreCase(string);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 1;
            }
            n3 = "belowName".equalsIgnoreCase(string);
        }
        if (n2 == 0) {
            if (n3 != 0) {
                return 2;
            }
            n3 = string.startsWith("sidebar.team.") ? 1 : 0;
        }
        if (n2 != 0) return n3;
        if (n3 == 0) return -1;
        String string2 = string.substring("sidebar.team.".length());
        net.minecraft.at.l l3 = l2 = net.minecraft.at.l.a(string2);
        if (n2 == 0) {
            if (l3 == null) return -1;
            l3 = l2;
        }
        n3 = l3.d();
        if (n2 != 0) return n3;
        if (n3 < 0) return -1;
        return l2.d() + 3;
    }

    public void c(h h2) {
        block9: {
            List list;
            Object object;
            int n2;
            block8: {
                int n3 = l.a();
                this.c.remove(h2.e());
                n2 = n3;
                for (int i2 = 0; i2 < 19; ++i2) {
                    b b10 = this;
                    int n4 = i2;
                    if (n2 == 0) {
                        object = b10.b(n4);
                        if (n2 != 0) break block8;
                        if (object != h2) continue;
                        b10 = this;
                        n4 = i2;
                    }
                    b10.a(n4, null);
                    if (n2 == 0) continue;
                }
                object = this.a.get(h2.a());
            }
            Collection<Object> collection = list = (List)object;
            if (n2 == 0) {
                if (collection != null) {
                    list.remove(h2);
                }
                collection = this.e.values();
            }
            for (Map map : collection) {
                map.remove(h2);
                if (n2 == 0) {
                    if (n2 == 0) continue;
                }
                break block9;
            }
            this.e(h2);
        }
    }

    public Collection<h> e() {
        return this.c.values();
    }

    public Collection<String> c() {
        return this.e.keySet();
    }

    public void a(m m2) {
    }

    public void c(m m2) {
        block2: {
            this.g.remove(m2.b());
            Iterator<String> iterator = m2.h().iterator();
            int n2 = l.c();
            while (iterator.hasNext()) {
                String string = iterator.next();
                this.f.remove(string);
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block2;
            }
            this.a(m2);
        }
    }

    public void b(String string) {
    }

    public boolean c(String string, h h2) {
        e e10;
        Map<h, e> map = this.e.get(string);
        int n2 = l.c();
        Object object = map;
        if (n2 != 0) {
            if (object == null) {
                return false;
            }
            object = map.get(h2);
        }
        return (e10 = (e)object) != null;
    }

    public Collection<e> b() {
        ArrayList arrayList;
        block2: {
            Collection<Map<h, e>> collection = this.e.values();
            ArrayList arrayList2 = Lists.newArrayList();
            int n2 = l.c();
            for (Map<h, e> map : collection) {
                arrayList = arrayList2;
                if (n2 != 0) {
                    arrayList.addAll(map.values());
                    if (n2 != 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public void a(String string, h h2) {
    }

    public b() {
        this.c = Maps.newHashMap();
        this.a = Maps.newHashMap();
        this.e = Maps.newHashMap();
        this.d = new h[19];
        this.g = Maps.newHashMap();
        this.f = Maps.newHashMap();
    }

    @Nullable
    public h h(String string) {
        return this.c.get(string);
    }

    public void e(h h2) {
    }

    public m g(String string) {
        return this.g.get(string);
    }

    public static String[] d() {
        int n2 = l.c();
        String[] arrstring = b;
        if (n2 != 0) {
            if (arrstring == null) {
                b = new String[19];
                for (int i2 = 0; i2 < 19; ++i2) {
                    arrstring = b;
                    if (n2 != 0) {
                        arrstring[i2] = net.minecraft.D.b.a(i2);
                        if (n2 != 0) continue;
                    }
                    break;
                }
            } else {
                arrstring = b;
            }
        }
        return arrstring;
    }

    @Nullable
    public h b(int n2) {
        return this.d[n2];
    }

    public m e(String string) {
        m m2;
        int n2 = l.c();
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        m m3 = m2 = this.g(string);
        if (n2 != 0) {
            if (m3 != null) {
                throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
            }
            m2 = new m(this, string);
            this.g.put(string, m2);
            this.b(m2);
            m3 = m2;
        }
        return m3;
    }

    public Collection<e> d(h h2) {
        ArrayList arrayList;
        block3: {
            arrayList = Lists.newArrayList();
            Iterator<Map<h, e>> iterator = this.e.values().iterator();
            int n2 = l.c();
            while (iterator.hasNext()) {
                Map<h, e> map = iterator.next();
                e e10 = map.get(h2);
                if (n2 != 0) {
                    if (e10 != null) {
                        arrayList.add(e10);
                    }
                    if (n2 != 0) continue;
                }
                break block3;
            }
            Collections.sort(arrayList, net.minecraft.D.e.a);
        }
        return arrayList;
    }

    public void d(m m2) {
    }

    public static String a(int n2) {
        block11: {
            net.minecraft.at.l l2;
            net.minecraft.at.l l3;
            block13: {
                int n3;
                int n4;
                int n5;
                block12: {
                    block10: {
                        n5 = l.c();
                        n4 = n2;
                        if (n5 != 0) {
                            switch (n4) {
                                case 0: {
                                    return "list";
                                }
                                case 1: {
                                    return "sidebar";
                                }
                                case 2: {
                                    return "belowName";
                                }
                            }
                            n4 = n2;
                        }
                        n3 = 3;
                        if (n5 == 0) break block10;
                        if (n4 < n3) break block11;
                        n4 = n2;
                        n3 = 18;
                    }
                    if (n5 == 0) break block12;
                    if (n4 > n3) break block11;
                    n4 = n2;
                    n3 = 3;
                }
                l2 = l3 = net.minecraft.at.l.a(n4 - n3);
                if (n5 == 0) break block13;
                if (l2 == null) break block11;
                l2 = l3;
            }
            if (l2 != net.minecraft.at.l.RESET) {
                return "sidebar.team." + l3.b();
            }
        }
        return null;
    }

    @Nullable
    public m a(String string) {
        return this.f.get(string);
    }

    public void a(String string, m m2) {
        int n2 = l.a();
        m m3 = this.a(string);
        if (n2 == 0) {
            if (m3 != m2) {
                throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + m2.b() + "'.");
            }
            this.f.remove(string);
            m3 = m2;
        }
        m3.h().remove(string);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void a(x x2) {
        block3: {
            x x3;
            block5: {
                boolean bl2;
                block4: {
                    x x4;
                    int n2;
                    block2: {
                        n2 = l.c();
                        x4 = x2;
                        if (n2 == 0) break block2;
                        if (x4 == null) break block3;
                        x4 = x2;
                    }
                    bl2 = x4 instanceof j;
                    if (n2 == 0) break block4;
                    if (bl2) break block3;
                    x3 = x2;
                    if (n2 == 0) break block5;
                    bl2 = x3.aL();
                }
                if (bl2) break block3;
                x3 = x2;
            }
            String string = x3.a2();
            this.b(string, null);
            this.c(string);
        }
    }

    public boolean c(String string) {
        block3: {
            block2: {
                m m2 = this.a(string);
                int n2 = l.a();
                if (n2 != 0) break block2;
                if (m2 == null) break block3;
                this.a(string, m2);
            }
            return true;
        }
        return false;
    }

    public void a(e e10) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public Collection<h> a(a a10) {
        ArrayList arrayList;
        Collection collection = this.a.get(a10);
        int n2 = l.a();
        Collection collection2 = collection;
        if (n2 == 0) {
            if (collection2 == null) {
                arrayList = Lists.newArrayList();
                return arrayList;
            }
            collection2 = collection;
        }
        arrayList = Lists.newArrayList((Iterable)collection2);
        return arrayList;
    }

    public void b(String string, h h2) {
        block5: {
            e e10;
            block8: {
                Map<h, e> map;
                Map<h, e> map2;
                int n2;
                block7: {
                    Object object;
                    Map<h, e> map3;
                    block6: {
                        Object object2;
                        block3: {
                            block4: {
                                n2 = l.c();
                                object2 = h2;
                                if (n2 == 0) break block3;
                                if (object2 != null) break block4;
                                map3 = this.e.remove(string);
                                if (map3 != null) {
                                    this.b(string);
                                }
                                if (n2 != 0) break block5;
                            }
                            object2 = this.e.get(string);
                        }
                        map3 = (Map<h, e>)object2;
                        object = map3;
                        if (n2 == 0) break block6;
                        if (object == null) break block5;
                        object = map3.remove(h2);
                    }
                    e10 = (e)object;
                    map2 = map3;
                    if (n2 == 0) break block7;
                    if (map2.size() >= 1) break block8;
                    map2 = this.e.remove(string);
                }
                if ((map = map2) != null) {
                    this.b(string);
                }
                if (n2 != 0) break block5;
            }
            if (e10 != null) {
                this.a(string, h2);
            }
        }
    }

    public Collection<m> a() {
        return this.g.values();
    }

    public boolean a(String string, String string2) {
        b b10;
        int n2;
        block8: {
            int n3;
            block7: {
                n2 = l.c();
                n3 = string.length();
                if (n2 == 0) break block7;
                if (n3 > 40) {
                    throw new IllegalArgumentException("The player name '" + string + "' is too long!");
                }
                b10 = this;
                if (n2 == 0) break block8;
                n3 = b10.g.containsKey(string2) ? 1 : 0;
            }
            if (n3 == 0) {
                return false;
            }
            b10 = this;
        }
        m m2 = b10.g(string2);
        m m3 = this.a(string);
        if (n2 != 0) {
            if (m3 != null) {
                this.c(string);
            }
            this.f.put(string, m2);
            m3 = m2;
        }
        m3.h().add(string);
        return true;
    }

    public void a(int n2, h h2) {
        this.d[n2] = h2;
    }
}

