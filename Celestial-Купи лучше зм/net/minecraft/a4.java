/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.google.gson.reflect.TypeToken
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.Q.D;
import net.minecraft.Q.e;
import net.minecraft.R.b;
import net.minecraft.a2;
import net.minecraft.a6;
import net.minecraft.aC;
import net.minecraft.aF;
import net.minecraft.aG;
import net.minecraft.aH;
import net.minecraft.aN;
import net.minecraft.aO;
import net.minecraft.aR;
import net.minecraft.aS;
import net.minecraft.aT;
import net.minecraft.ar.aq;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.i.k;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a4 {
    private final /* synthetic */ Set<aN> h;
    private /* synthetic */ k b;
    private final /* synthetic */ Map<aN, aS> g;
    @Nullable
    private /* synthetic */ aN e;
    private static final /* synthetic */ Logger j;
    private static final /* synthetic */ TypeToken<Map<v, aS>> l;
    private /* synthetic */ boolean d;
    private final /* synthetic */ b c;
    private final /* synthetic */ File f;
    private final /* synthetic */ Set<aN> a;
    private final /* synthetic */ Set<aN> i;
    private static final /* synthetic */ Gson k;

    public void b(k k2) {
        this.b = k2;
    }

    private void d(aN aN2) {
        block3: {
            aS aS2 = this.a(aN2);
            boolean bl2 = aG.b();
            if (aS2.d()) break block3;
            for (Map.Entry<String, aT> entry : aN2.i().entrySet()) {
                block5: {
                    v v2;
                    aR aR2;
                    block8: {
                        v v3;
                        aR aR3;
                        block7: {
                            Object object;
                            block6: {
                                block4: {
                                    aC aC2 = aS2.c(entry.getKey());
                                    object = aC2;
                                    if (!bl2) break block4;
                                    if (object == null) break block5;
                                    object = aC2;
                                }
                                if (!bl2) break block6;
                                if (((aC)object).c()) break block5;
                                object = entry.getValue();
                            }
                            aR3 = aR2 = ((aT)object).a();
                            if (!bl2) break block7;
                            if (aR3 == null) break block5;
                            aR3 = aR2;
                        }
                        v2 = v3 = a6.a(aR3.a());
                        if (!bl2) break block8;
                        if (v2 == null) break block5;
                        v2 = v3;
                    }
                    v2.b(this, new aG<aR>(aR2, aN2, entry.getKey()));
                }
                if (bl2) continue;
            }
        }
    }

    private void d() {
        Iterator<aN> iterator = this.c.az().d().iterator();
        boolean bl2 = aG.a();
        while (iterator.hasNext()) {
            aN aN2 = iterator.next();
            this.d(aN2);
            if (!bl2) continue;
        }
    }

    static {
        j = LogManager.getLogger();
        k = new GsonBuilder().registerTypeAdapter(aS.class, (Object)new aF()).registerTypeAdapter(v.class, (Object)new aq()).setPrettyPrinting().create();
        l = new aH();
    }

    public boolean b(aN aN2, String string) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        block6: {
            aS aS2;
            block7: {
                a2 a22;
                block8: {
                    bl4 = false;
                    aS2 = this.a(aN2);
                    boolean bl5 = aS2.d();
                    bl3 = aG.a();
                    bl2 = aS2.b(string);
                    if (bl3) break block6;
                    if (!bl2) break block7;
                    this.g(aN2);
                    this.i.add(aN2);
                    bl4 = true;
                    bl2 = bl5;
                    if (bl3) break block6;
                    if (bl2) break block7;
                    bl2 = aS2.d();
                    if (bl3) break block6;
                    if (!bl2) break block7;
                    aN2.g().a(this.b);
                    a22 = aN2.d();
                    if (bl3) break block8;
                    if (a22 == null) break block7;
                    a22 = aN2.d();
                }
                bl2 = a22.a();
                if (bl3) break block6;
                if (!bl2) break block7;
                bl2 = this.b.aG.M().c("announceAdvancements");
                if (bl3) break block6;
                if (bl2) {
                    this.c.O().a(new h("chat.type.advancement." + aN2.d().j().c(), this.b.d(), aN2.h()));
                }
            }
            bl2 = aS2.d();
        }
        if (!bl3) {
            if (bl2) {
                this.f(aN2);
            }
            bl2 = bl4;
        }
        return bl2;
    }

    private void f(aN aN2) {
        aN aN3;
        boolean bl2;
        block14: {
            block13: {
                boolean bl3;
                boolean bl4;
                block11: {
                    boolean bl5;
                    block12: {
                        block9: {
                            block10: {
                                bl5 = this.e(aN2);
                                bl2 = aG.a();
                                bl4 = this.a.contains(aN2);
                                bl3 = bl5;
                                if (bl2) break block9;
                                if (!bl3) break block10;
                                bl3 = bl4;
                                if (bl2) break block9;
                                if (bl3) break block10;
                                this.a.add(aN2);
                                this.h.add(aN2);
                                bl3 = this.g.containsKey(aN2);
                                if (bl2) break block11;
                                if (!bl3) break block12;
                                this.i.add(aN2);
                                if (!bl2) break block12;
                            }
                            bl3 = bl5;
                        }
                        if (bl2) break block11;
                        if (bl3) break block12;
                        bl3 = bl4;
                        if (bl2) break block11;
                        if (bl3) {
                            this.a.remove(aN2);
                            this.h.add(aN2);
                        }
                    }
                    bl3 = bl5;
                }
                if (bl3 == bl4) break block13;
                aN3 = aN2.b();
                if (bl2) break block14;
                if (aN3 != null) {
                    this.f(aN2.b());
                }
            }
            aN3 = aN2;
        }
        for (aN aN4 : aN3.j()) {
            this.f(aN4);
            if (!bl2) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public a4(b b10, File file, k k2) {
        this.g = Maps.newLinkedHashMap();
        this.a = Sets.newLinkedHashSet();
        this.h = Sets.newLinkedHashSet();
        this.i = Sets.newLinkedHashSet();
        this.d = true;
        this.c = b10;
        this.f = file;
        this.b = k2;
        this.g();
    }

    private void g(aN aN2) {
        aS aS2 = this.a(aN2);
        Iterator<Map.Entry<String, aT>> iterator = aN2.i().entrySet().iterator();
        boolean bl2 = aG.b();
        while (iterator.hasNext()) {
            block4: {
                v v2;
                aR aR2;
                Map.Entry<String, aT> entry;
                block8: {
                    v v3;
                    aR aR3;
                    block7: {
                        Object object;
                        block5: {
                            block6: {
                                block3: {
                                    entry = iterator.next();
                                    aC aC2 = aS2.c(entry.getKey());
                                    object = aC2;
                                    if (!bl2) break block3;
                                    if (object == null) break block4;
                                    object = aC2;
                                }
                                if (!bl2) break block5;
                                if (((aC)object).c()) break block6;
                                object = aS2;
                                if (!bl2) break block5;
                                if (!((aS)object).d()) break block4;
                            }
                            object = entry.getValue();
                        }
                        aR3 = aR2 = ((aT)object).a();
                        if (!bl2) break block7;
                        if (aR3 == null) break block4;
                        aR3 = aR2;
                    }
                    v2 = v3 = a6.a(aR3.a());
                    if (!bl2) break block8;
                    if (v2 == null) break block4;
                    v2 = v3;
                }
                v2.a(this, new aG<aR>(aR2, aN2, entry.getKey()));
            }
            if (bl2) continue;
        }
    }

    public void a() {
        this.c();
        this.g.clear();
        this.a.clear();
        this.h.clear();
        this.i.clear();
        this.d = true;
        this.e = null;
        this.g();
    }

    public boolean a(aN aN2, String string) {
        boolean bl2 = false;
        aS aS2 = this.a(aN2);
        boolean bl3 = aG.b();
        boolean bl4 = aS2.a(string);
        if (bl3) {
            if (bl4) {
                this.d(aN2);
                this.i.add(aN2);
                bl2 = true;
            }
            bl4 = aS2.h();
        }
        if (bl3) {
            if (!bl4) {
                this.f(aN2);
            }
            bl4 = bl2;
        }
        return bl4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1) {
        block13: {
            block14: {
                block18: {
                    block17: {
                        block16: {
                            block10: {
                                block12: {
                                    block11: {
                                        var2_2 = aG.b();
                                        v0 = this.h.isEmpty();
                                        if (!var2_2) break block11;
                                        if (!v0) break block12;
                                        v1 = this;
                                        if (!var2_2) break block13;
                                        v0 = v1.i.isEmpty();
                                    }
                                    if (v0) break block14;
                                }
                                var3_3 = Maps.newHashMap();
                                var4_4 = Sets.newLinkedHashSet();
                                var5_5 = Sets.newLinkedHashSet();
                                var6_6 = this.i.iterator();
                                while (var6_6.hasNext()) {
                                    block15: {
                                        var7_7 = var6_6.next();
                                        v2 = this.a;
                                        if (!var2_2) break block15;
                                        v3 = v2.contains(var7_7);
                                        if (!var2_2) ** GOTO lbl29
                                        if (v3) {
                                            v2 = var3_3.put(var7_7.f(), this.g.get(var7_7));
                                        }
                                    }
                                    if (var2_2) continue;
                                }
                                var6_6 = this.h.iterator();
                                do {
                                    v3 = var6_6.hasNext();
lbl29:
                                    // 2 sources

                                    if (!v3) break;
                                    var7_7 = var6_6.next();
                                    v4 = this.a.contains(var7_7);
                                    if (!var2_2) break block10;
                                    if (!var2_2) continue;
                                    if (v4) {
                                        var4_4.add(var7_7);
                                        if (var2_2) continue;
                                    }
                                    var5_5.add(var7_7.f());
                                } while (var2_2);
                                v4 = var3_3.isEmpty();
                            }
                            if (!var2_2) break block16;
                            if (!v4) break block17;
                            v5 /* !! */  = var4_4;
                            if (!var2_2) break block18;
                            v4 = v5 /* !! */ .isEmpty();
                        }
                        if (!v4) break block17;
                        v5 /* !! */  = var5_5;
                        if (!var2_2) break block18;
                        if (v5 /* !! */ .isEmpty()) break block14;
                    }
                    var1_1.cD.a(new e(this.d, var4_4, var5_5, var3_3));
                    this.h.clear();
                    v5 /* !! */  = this.i;
                }
                v5 /* !! */ .clear();
            }
            v1 = this;
        }
        v1.d = false;
    }

    public void b(@Nullable aN aN2) {
        aN aN3;
        block7: {
            block5: {
                aN aN4;
                boolean bl2;
                block6: {
                    block4: {
                        aN3 = this.e;
                        bl2 = aG.b();
                        aN4 = aN2;
                        if (!bl2) break block4;
                        if (aN4 == null) break block5;
                        aN4 = aN2.b();
                    }
                    if (!bl2) break block6;
                    if (aN4 != null) break block5;
                    aN4 = aN2;
                }
                if (aN4.d() == null) break block5;
                this.e = aN2;
                if (bl2) break block7;
            }
            this.e = null;
        }
        if (aN3 != this.e) {
            this.b.cD.a(new D(this.e == null ? null : this.e.f()));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void e() {
        var2_1 = Lists.newArrayList();
        var3_2 = this.g.entrySet().iterator();
        var1_3 = aG.a();
        while (var3_2.hasNext()) {
            var4_4 = var3_2.next();
            v0 = var4_4.getValue().d();
            if (!var1_3) {
                if (!var1_3 && v0) {
                    var2_1.add(var4_4.getKey());
                    this.i.add((aN)var4_4.getKey());
                }
                if (!var1_3) continue;
            }
            ** GOTO lbl18
        }
        var3_2 = var2_1.iterator();
        do {
            v0 = var3_2.hasNext();
lbl18:
            // 2 sources

            if (v0 == false) return;
            var4_4 = (aN)var3_2.next();
            this.f((aN)var4_4);
        } while (!var1_3);
    }

    public void c() {
        Iterator<aO<?>> iterator = a6.a().iterator();
        boolean bl2 = aG.a();
        while (iterator.hasNext()) {
            aO<?> aO2 = iterator.next();
            aO2.a(this);
            if (!bl2) continue;
        }
    }

    private boolean e(aN aN2) {
        int n2;
        block10: {
            int n3 = 0;
            boolean bl2 = aG.b();
            while (aN2 != null) {
                aN aN3;
                block15: {
                    boolean bl3;
                    block14: {
                        block12: {
                            int n4;
                            block13: {
                                block11: {
                                    n2 = n3;
                                    if (!bl2 || !bl2) break block10;
                                    if (n2 > 2) break;
                                    n4 = n3;
                                    if (!bl2) break block11;
                                    if (n4 != 0) break block12;
                                    n4 = this.c(aN2);
                                }
                                if (!bl2) break block13;
                                if (n4 == 0) break block12;
                                n4 = 1;
                            }
                            return n4 != 0;
                        }
                        if (aN2.d() == null) {
                            return false;
                        }
                        aS aS2 = this.a(aN2);
                        bl3 = aS2.d();
                        if (!bl2) break block14;
                        if (bl3) {
                            return true;
                        }
                        aN3 = aN2;
                        if (!bl2) break block15;
                        bl3 = aN3.d().e();
                    }
                    if (bl3) {
                        return false;
                    }
                    aN3 = aN2.b();
                }
                aN2 = aN3;
                ++n3;
                if (bl2) continue;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    private boolean c(aN aN2) {
        boolean bl2;
        block5: {
            boolean bl3;
            block7: {
                boolean bl4;
                block6: {
                    aS aS2 = this.a(aN2);
                    bl3 = aG.b();
                    bl4 = aS2.d();
                    if (!bl3) break block6;
                    if (!bl4) break block7;
                    bl4 = true;
                }
                return bl4;
            }
            for (aN aN3 : aN2.j()) {
                block9: {
                    boolean bl5;
                    block8: {
                        bl2 = this.c(aN3);
                        if (!bl3) break block5;
                        if (!bl3) break block8;
                        if (!bl2) break block9;
                        bl5 = true;
                    }
                    return bl5;
                }
                if (bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private void f() {
        Iterator<aN> iterator = this.c.az().d().iterator();
        boolean bl2 = aG.b();
        while (iterator.hasNext()) {
            block4: {
                aN aN2;
                block3: {
                    aN2 = iterator.next();
                    boolean bl3 = aN2.i().isEmpty();
                    if (!bl2) break block3;
                    if (!bl3) break block4;
                    bl3 = this.b(aN2, "");
                }
                aN2.g().a(this.b);
            }
            if (bl2) continue;
        }
    }

    private void a(aN aN2, aS aS2) {
        aS2.a(aN2.i(), aN2.e());
        this.g.put(aN2, aS2);
    }

    public aS a(aN aN2) {
        aS aS2 = this.g.get(aN2);
        boolean bl2 = aG.a();
        aS aS3 = aS2;
        if (!bl2) {
            if (aS3 == null) {
                aS2 = new aS();
                this.a(aN2, aS2);
            }
            aS3 = aS2;
        }
        return aS3;
    }

    public void b() {
        HashMap hashMap;
        block10: {
            File file;
            boolean bl2;
            block11: {
                hashMap = Maps.newHashMap();
                Iterator<Map.Entry<aN, aS>> iterator = this.g.entrySet().iterator();
                boolean bl3 = aG.b();
                while (iterator.hasNext()) {
                    aS aS2;
                    Map.Entry<aN, aS> entry = iterator.next();
                    aS aS3 = aS2 = entry.getValue();
                    if (bl3) {
                        bl2 = aS3.h();
                        if (!bl3) break block10;
                        if (bl2) {
                            aS3 = hashMap.put(entry.getKey().f(), aS2);
                        }
                    }
                    if (bl3) continue;
                }
                file = this.f.getParentFile();
                if (!bl3) break block11;
                if (file == null) break block10;
                file = this.f.getParentFile();
            }
            bl2 = file.mkdirs();
        }
        try {
            Files.write((CharSequence)k.toJson((Object)hashMap), (File)this.f, (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            j.error("Couldn't save player advancements to " + this.f, (Throwable)iOException);
        }
    }

    private void g() {
        block9: {
            a4 a42;
            block11: {
                block10: {
                    boolean bl2 = aG.b();
                    a42 = this;
                    if (!bl2) break block11;
                    if (!a42.f.isFile()) break block10;
                    try {
                        Map map;
                        String string = Files.toString((File)this.f, (Charset)StandardCharsets.UTF_8);
                        Map map2 = map = (Map)net.minecraft.ar.aG.a(k, string, l.getType());
                        if (bl2) {
                            if (map2 == null) {
                                throw new JsonParseException("Found null for advancements");
                            }
                            map2 = map;
                        }
                        Stream<Map.Entry> stream = map2.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
                        for (Map.Entry entry : stream.collect(Collectors.toList())) {
                            block14: {
                                aN aN2;
                                block13: {
                                    block12: {
                                        aN2 = this.c.az().a((v)entry.getKey());
                                        if (!bl2) break block9;
                                        if (!bl2) break block12;
                                        if (aN2 != null) break block13;
                                        j.warn("Ignored advancement '" + entry.getKey() + "' in progress file " + this.f + " - it doesn't exist anymore?");
                                    }
                                    if (bl2) break block14;
                                }
                                this.a(aN2, (aS)entry.getValue());
                            }
                            if (bl2) continue;
                            break;
                        }
                    }
                    catch (JsonParseException jsonParseException) {
                        j.error("Couldn't parse player advancements in " + this.f, (Throwable)jsonParseException);
                    }
                    catch (IOException iOException) {
                        j.error("Couldn't access player advancements in " + this.f, (Throwable)iOException);
                    }
                }
                this.f();
                this.e();
                a42 = this;
            }
            a42.d();
        }
    }
}

