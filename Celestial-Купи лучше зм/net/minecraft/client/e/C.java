/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.e;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.ar.ao;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.e.a;
import net.minecraft.client.e.b;
import net.minecraft.client.e.e;
import net.minecraft.client.e.f;
import net.minecraft.client.e.g;
import net.minecraft.client.e.h;
import net.minecraft.client.e.j;
import net.minecraft.client.e.k;
import net.minecraft.client.e.l;
import net.minecraft.client.e.o;
import net.minecraft.client.e.p;
import net.minecraft.client.e.q;
import net.minecraft.client.e.s;
import net.minecraft.client.e.z;
import net.minecraft.client.l.c;
import net.minecraft.k.m;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C
implements ao,
x {
    private static final /* synthetic */ Gson g;
    private final /* synthetic */ t d;
    private static final /* synthetic */ Logger e;
    private final /* synthetic */ q c;
    private final /* synthetic */ o b;
    public static final /* synthetic */ b a;
    private static final /* synthetic */ ParameterizedType f;

    public void f() {
        this.b.d();
    }

    @Override
    public void c() {
        this.b.b();
    }

    @Nullable
    protected Map<String, z> a(InputStream inputStream) {
        Map map;
        try {
            map = (Map)aG.a(g, (Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8), (Type)f);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return map;
    }

    public void e() {
        this.b.c();
    }

    public void d() {
        this.b.a();
    }

    public void c(j j2) {
        this.b.e(j2);
    }

    public void a(j j2, int n2) {
        this.b.a(j2, n2);
    }

    public void a(String string, ay ay2) {
        this.b.a(string, ay2);
    }

    @Nullable
    public k a(v v2) {
        return (k)this.c.a(v2);
    }

    public void a(g g10) {
        this.b.b(g10);
    }

    public void a(net.minecraft.i.j j2, float f10) {
        this.b.a(j2, f10);
    }

    public void a(ay ay2, float f10) {
        m[] arrm = s.b();
        if (arrm != null) {
            if (ay2 == ay.MASTER && f10 <= 0.0f) {
                this.b();
            }
            this.b.a(ay2, f10);
        }
    }

    static q a(C c10) {
        return c10.c;
    }

    static {
        a = new b("meta:missing_sound", 1.0f, 1.0f, 1, h.FILE, false);
        e = LogManager.getLogger();
        g = new GsonBuilder().registerTypeHierarchyAdapter(net.minecraft.at.k.class, (Object)new net.minecraft.at.o()).registerTypeAdapter(z.class, (Object)new f()).create();
        f = new p();
    }

    public C(t t2, c c10) {
        this.c = new q();
        this.d = t2;
        this.b = new o(this, c10);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(b b10, v v2) {
        boolean bl3;
        v v3 = b10.f();
        net.minecraft.client.D.v v4 = null;
        try {
            v4 = this.d.a(v3);
            v4.c();
            bl3 = true;
        }
        catch (FileNotFoundException fileNotFoundException) {
            e.warn("File {} does not exist, cannot add it to event {}", (Object)v3, (Object)v2);
            boolean bl2 = false;
            {
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(v4);
                    throw throwable;
                }
            }
            IOUtils.closeQuietly((Closeable)v4);
            return bl2;
            catch (IOException iOException) {
                boolean bl4;
                e.warn("Could not load sound file {}, cannot add it to event {}", (Object)v3, (Object)v2, (Object)iOException);
                boolean bl5 = bl4 = false;
                IOUtils.closeQuietly((Closeable)v4);
                return bl5;
            }
        }
        IOUtils.closeQuietly((Closeable)v4);
        return bl3;
    }

    public void a(j j2) {
        this.b.d(j2);
    }

    public void b() {
        this.b.i();
    }

    public void b(g g10) {
        this.b.a(g10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(v var1_1, z var2_2) {
        block11: {
            block12: {
                block9: {
                    block10: {
                        var4_3 = (k)this.c.a(var1_1);
                        var3_4 = s.b();
                        v0 = var5_5 = var4_3 == null;
                        if (var3_4 == null) break block9;
                        if (v0) break block10;
                        v1 = var2_2;
                        if (var3_4 == null) break block11;
                        if (!v1.c()) break block12;
                    }
                    v0 = var5_5;
                }
                if (!v0) {
                    C.e.debug("Replaced sound event location {}", (Object)var1_1);
                }
                var4_3 = new k(var1_1, var2_2.b());
                this.c.a(var4_3);
            }
            v1 = var2_2;
        }
        var6_6 = v1.a().iterator();
        do lbl-1000:
        // 3 sources

        {
            if (var6_6.hasNext() == false) return;
            var7_7 = var6_6.next();
            var8_8 = var7_7.a();
            v2 = l.a[var7_7.c().ordinal()];
            if (var3_4 == null) ** GOTO lbl29
            switch (v2) {
                case 1: {
                    v2 = this.a(var7_7, var1_1) ? 1 : 0;
lbl29:
                    // 2 sources

                    if (v2 == 0 && var3_4 != null) ** GOTO lbl-1000
                    var9_10 = var7_7;
                    if (var3_4 != null) break;
                }
                case 2: {
                    var9_11 = new e(this, var8_8, var7_7);
                    if (var3_4 != null) break;
                }
                default: {
                    throw new IllegalStateException("Unknown SoundEventRegistration type: " + (Object)var7_7.c());
                }
            }
            var4_3.a((a<b>)var9_9);
        } while (var3_4 != null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void b(t var1_1) {
        block16: {
            block14: {
                v0 = s.b();
                this.c.a();
                var3_2 = var1_1.a().iterator();
                var2_3 = v0;
                block4: while (true) {
                    v1 = var3_2;
                    block5: while (v1.hasNext()) {
                        var4_4 = var3_2.next();
                        try {
                            v2 = var1_1.b(new v((String)var4_4, "sounds.json")).iterator();
                            if (var2_3 == null) break block14;
                            var5_5 = v2;
                            while (var5_5.hasNext()) {
                                var6_7 = (net.minecraft.client.D.v)var5_5.next();
                                try {
                                    var7_8 = this.a(var6_7.c());
                                    v1 = var7_8.entrySet().iterator();
                                    if (var2_3 == null) continue block5;
                                    var8_10 = v1;
                                    while (var8_10.hasNext()) {
                                        var9_11 = (Map.Entry)var8_10.next();
                                        this.a(new v((String)var4_4, (String)var9_11.getKey()), (z)var9_11.getValue());
                                        if (var2_3 != null && var2_3 != null) continue;
                                        break;
                                    }
                                }
                                catch (RuntimeException var7_9) {
                                    C.e.warn("Invalid sounds.json", (Throwable)var7_9);
                                }
                                if (var2_3 != null) continue;
                                continue block4;
                            }
                            continue block4;
                        }
                        catch (IOException var5_6) {
                            // empty catch block
                        }
                        if (var2_3 != null) continue block4;
                    }
                    break;
                }
                v2 = var3_2 = this.c.a().iterator();
            }
            while (var3_2.hasNext()) {
                block18: {
                    block17: {
                        var4_4 = (v)var3_2.next();
                        var5_5 = (k)this.c.a(var4_4);
                        v3 = var5_5.b();
                        if (var2_3 == null) break block17;
                        v4 = v3 instanceof net.minecraft.at.h;
                        if (var2_3 == null) ** GOTO lbl54
                        if (!v4) break block18;
                        v3 = var5_5.b();
                    }
                    if (!net.minecraft.client.D.h.a((String)(var6_7 = ((net.minecraft.at.h)v3).c()))) {
                        C.e.debug("Missing subtitle {} for event: {}", var6_7, var4_4);
                    }
                }
                if (var2_3 != null) continue;
            }
            var3_2 = this.c.a().iterator();
            do {
                v4 = var3_2.hasNext();
lbl54:
                // 2 sources

                if (!v4) break;
                var4_4 = (v)var3_2.next();
                if (var2_3 == null) break block16;
                if (net.minecraft.ar.d.c.a((v)var4_4) != null) continue;
                C.e.debug("Not having sound event for: {}", var4_4);
            } while (var2_3 != null);
            this.b.h();
        }
        if (m.d() != false) return;
        s.b(new m[5]);
    }

    public boolean b(j j2) {
        return this.b.a(j2);
    }
}

