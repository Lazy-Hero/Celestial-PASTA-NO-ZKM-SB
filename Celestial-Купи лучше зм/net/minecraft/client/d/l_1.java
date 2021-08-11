/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.minecraft.client.D.a;
import net.minecraft.client.D.b;
import net.minecraft.client.D.h;
import net.minecraft.client.D.n;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.v.j;
import net.minecraft.client.v.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l
implements x {
    private final /* synthetic */ o c;
    private final /* synthetic */ Map<String, b> d;
    private /* synthetic */ String a;
    private static final /* synthetic */ Logger b;
    protected static final /* synthetic */ n e;

    public boolean b() {
        return e.a();
    }

    public void a(b b10) {
        this.a = b10.a();
    }

    public void a(List<a> list) {
        boolean bl2 = h.b();
        this.d.clear();
        boolean bl3 = bl2;
        Iterator<a> iterator = list.iterator();
        block3: while (true) {
            boolean bl4 = iterator.hasNext();
            block4: while (bl4) {
                a a10 = iterator.next();
                try {
                    j j2;
                    j j3 = j2 = (j)a10.a(this.c, "language");
                    if (!bl3) {
                        if (j3 == null) continue block3;
                        j3 = j2;
                    }
                    for (b b10 : j3.a()) {
                        block11: {
                            String string;
                            Map<String, b> map;
                            block10: {
                                map = this.d;
                                string = b10.a();
                                if (bl3) break block10;
                                bl4 = map.containsKey(string);
                                if (bl3) continue block4;
                                if (bl4) break block11;
                                map = this.d;
                                string = b10.a();
                            }
                            map.put(string, b10);
                        }
                        if (!bl3) continue;
                        continue block3;
                    }
                    continue block3;
                }
                catch (RuntimeException runtimeException) {
                    b.warn("Unable to parse language metadata section of resourcepack: {}", (Object)a10.b(), (Object)runtimeException);
                    continue block3;
                }
                catch (IOException iOException) {
                    b.warn("Unable to parse language metadata section of resourcepack: {}", (Object)a10.b(), (Object)iOException);
                }
                if (!bl3) continue block3;
            }
            break;
        }
    }

    static {
        b = LogManager.getLogger();
        e = new n();
    }

    public SortedSet<b> d() {
        return Sets.newTreeSet(this.d.values());
    }

    public b a(String string) {
        return this.d.get(string);
    }

    public l(o o2, String string) {
        this.d = Maps.newHashMap();
        this.c = o2;
        this.a = string;
        h.a(e);
    }

    @Override
    public void b(t t2) {
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"en_us"});
        boolean bl2 = h.c();
        if (bl2) {
            if (!"en_us".equals(this.a)) {
                arrayList.add(this.a);
            }
            e.a(t2, arrayList);
            net.minecraft.ab.b.a(l.e.a);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public b c() {
        var1_1 = h.c();
        v0 = this;
        if (!var1_1) ** GOTO lbl6
        if (v0.d.containsKey(this.a)) {
            v0 = this;
lbl6:
            // 2 sources

            v1 = v0.a;
        } else {
            v1 = "en_us";
        }
        var2_2 = v1;
        return this.d.get(var2_2);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        boolean bl2 = h.c();
        b b10 = this.c();
        if (bl2) {
            if (b10 == null) return false;
            b10 = this.c();
        }
        boolean bl3 = b10.b();
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }
}

