/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.x;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.client.x.K;
import net.minecraft.client.x.L;
import net.minecraft.client.x.P;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.aE;
import net.minecraft.client.x.au;
import net.minecraft.client.x.av;
import net.minecraft.client.x.b;
import net.minecraft.client.x.c;
import net.minecraft.client.x.d;
import net.minecraft.client.x.e;
import net.minecraft.client.x.f;
import net.minecraft.client.x.l;
import net.minecraft.client.x.m;
import net.minecraft.client.x.s;
import net.minecraft.client.x.u;
import net.minecraft.client.x.y;
import net.minecraft.client.x.z;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v {
    private final /* synthetic */ boolean e;
    @VisibleForTesting
    protected /* synthetic */ v a;
    @VisibleForTesting
    protected /* synthetic */ net.minecraft.ar.v i;
    private final /* synthetic */ y d;
    private static final /* synthetic */ Logger k;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ List<l> j;
    public /* synthetic */ String c;
    @VisibleForTesting
    static final /* synthetic */ Gson h;
    @VisibleForTesting
    protected final /* synthetic */ Map<String, String> b;
    private final /* synthetic */ List<b> f;

    static {
        k = LogManager.getLogger();
        h = new GsonBuilder().registerTypeAdapter(v.class, (Object)new K()).registerTypeAdapter(l.class, (Object)new u()).registerTypeAdapter(z.class, (Object)new s()).registerTypeAdapter(au.class, (Object)new f()).registerTypeAdapter(L.class, (Object)new m()).registerTypeAdapter(y.class, (Object)new e()).registerTypeAdapter(b.class, (Object)new c()).create();
    }

    private boolean b(String string) {
        String[] arrstring = P.o();
        boolean bl2 = string.charAt(0);
        if (arrstring == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public y j() {
        L l2 = this.a(net.minecraft.client.x.d.THIRD_PERSON_LEFT_HAND);
        L l3 = this.a(net.minecraft.client.x.d.THIRD_PERSON_RIGHT_HAND);
        L l4 = this.a(net.minecraft.client.x.d.FIRST_PERSON_LEFT_HAND);
        L l5 = this.a(net.minecraft.client.x.d.FIRST_PERSON_RIGHT_HAND);
        L l6 = this.a(net.minecraft.client.x.d.HEAD);
        L l7 = this.a(net.minecraft.client.x.d.GUI);
        L l8 = this.a(net.minecraft.client.x.d.GROUND);
        L l9 = this.a(net.minecraft.client.x.d.FIXED);
        return new y(l2, l3, l4, l5, l6, l7, l8, l9);
    }

    protected List<b> f() {
        return this.f;
    }

    public String c(String string) {
        String[] arrstring = P.o();
        v v2 = this;
        String string2 = string;
        if (arrstring == null) {
            if (!v2.b(string2)) {
                string = '#' + string;
            }
            v2 = this;
            string2 = string;
        }
        return v2.a(string2, new av(this, null));
    }

    public static void a(Map<net.minecraft.ar.v, v> map) {
        Iterator<v> iterator = map.values().iterator();
        String[] arrstring = P.o();
        while (true) {
            Object object = iterator;
            if (arrstring == null) {
                if (!object.hasNext()) break;
                object = iterator.next();
            }
            v v2 = (v)object;
            try {
                v v3 = v2.a;
                v v4 = v3.a;
                while (v3 != v4) {
                    v3 = v3.a;
                    v4 = v4.a.a;
                    if (arrstring == null) continue;
                }
                throw new aE();
            }
            catch (NullPointerException nullPointerException) {
                if (arrstring == null) continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean d() {
        boolean bl2;
        String[] arrstring = P.o();
        v v2 = this;
        if (arrstring == null) {
            if (v2.b()) {
                bl2 = this.a.d();
                return bl2;
            }
            v2 = this;
        }
        bl2 = v2.e;
        return bl2;
    }

    public boolean c() {
        return this.g;
    }

    public Collection<net.minecraft.ar.v> i() {
        HashSet hashSet;
        block2: {
            HashSet hashSet2 = Sets.newHashSet();
            String[] arrstring = P.o();
            for (b b10 : this.f) {
                hashSet = hashSet2;
                if (arrstring == null) {
                    hashSet.add(b10.a());
                    if (arrstring == null) continue;
                }
                break block2;
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    public v(@Nullable net.minecraft.ar.v v2, List<l> list, Map<String, String> map, boolean bl2, boolean bl3, y y2, List<b> list2) {
        this.c = "";
        this.j = list;
        this.e = bl2;
        this.g = bl3;
        this.b = map;
        this.i = v2;
        this.d = y2;
        this.f = list2;
    }

    private String a(String string, av av2) {
        block9: {
            String string2;
            String string3;
            block13: {
                block14: {
                    String string4;
                    v v2;
                    block15: {
                        String[] arrstring;
                        block10: {
                            block11: {
                                v v3;
                                block12: {
                                    Object object;
                                    block8: {
                                        arrstring = P.o();
                                        object = this;
                                        if (arrstring != null) break block8;
                                        if (!((v)object).b(string)) break block9;
                                        object = this;
                                    }
                                    if (arrstring == null) {
                                        if (object == av2.b) {
                                            k.warn("Unable to resolve texture due to upward reference: {} in {}", (Object)string, (Object)this.c);
                                            return "missingno";
                                        }
                                        object = this.b.get(string.substring(1));
                                    }
                                    string2 = string3 = (String)object;
                                    if (arrstring != null) break block10;
                                    if (string2 != null) break block11;
                                    v3 = this;
                                    if (arrstring != null) break block12;
                                    if (!v3.b()) break block11;
                                    v3 = this.a;
                                }
                                string3 = v3.a(string, av2);
                            }
                            av2.b = this;
                            string2 = string3;
                        }
                        if (arrstring != null) break block13;
                        if (string2 == null) break block14;
                        v2 = this;
                        string4 = string3;
                        if (arrstring != null) break block15;
                        if (!v2.b(string4)) break block14;
                        v2 = av2.a;
                        string4 = string3;
                    }
                    string3 = v2.a(string4, av2);
                }
                string2 = string3;
            }
            return string2 != null && !this.b(string3) ? string3 : "missingno";
        }
        return string;
    }

    public void b(Map<net.minecraft.ar.v, v> map) {
        block3: {
            block2: {
                String[] arrstring = P.o();
                v v2 = this;
                if (arrstring != null) break block2;
                if (v2.i == null) break block3;
                v2 = this;
            }
            v2.a = map.get(this.i);
        }
    }

    private boolean b() {
        return this.a != null;
    }

    public a1 k() {
        return this.f.isEmpty() ? a1.b : new a1(this.f);
    }

    public static v a(Reader reader) {
        return aG.a(h, reader, v.class, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public List<l> h() {
        var1_1 = P.o();
        v0 = this;
        if (var1_1 == null) {
            if (v0.j.isEmpty()) {
                v0 = this;
                if (var1_1 == null) {
                    if (v0.b()) {
                        v1 = this.a.h();
                        return v1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this;
            }
        }
        v1 = v0.j;
        return v1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private L a(d var1_1) {
        var2_2 = P.o();
        v0 = this.a;
        if (var2_2 != null) ** GOTO lbl13
        if (v0 != null) {
            v1 = this.d;
            v2 = var1_1;
            if (var2_2 == null) {
                if (!v1.a(v2)) {
                    v3 = this.a.a(var1_1);
                    return v3;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = this;
lbl13:
            // 2 sources

            v1 = v0.d;
            v2 = var1_1;
        }
        v3 = v1.c(v2);
        return v3;
    }

    public static v a(String string) {
        return v.a(new StringReader(string));
    }

    public v g() {
        String[] arrstring = P.o();
        v v2 = this;
        if (arrstring == null) {
            v2 = v2.b() ? this.a.g() : this;
        }
        return v2;
    }

    @Nullable
    public net.minecraft.ar.v e() {
        return this.i;
    }

    public boolean d(String string) {
        String[] arrstring = P.o();
        boolean bl2 = "missingno".equals(this.c(string));
        if (arrstring == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String[] arrstring = P.o();
        v v2 = this;
        if (arrstring == null) {
            if (v2.i == null) return true;
            v2 = this.a;
        }
        if (arrstring == null) {
            if (v2 == null) return false;
            v2 = this.a;
        }
        boolean bl2 = v2.a();
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

