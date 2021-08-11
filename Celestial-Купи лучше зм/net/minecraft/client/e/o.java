/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
package net.minecraft.client.e;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.client.e.A;
import net.minecraft.client.e.B;
import net.minecraft.client.e.C;
import net.minecraft.client.e.D;
import net.minecraft.client.e.g;
import net.minecraft.client.e.j;
import net.minecraft.client.e.m;
import net.minecraft.client.e.s;
import net.minecraft.client.l.c;
import net.minecraft.k.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class o {
    private final /* synthetic */ List<String> n;
    private final /* synthetic */ C g;
    private /* synthetic */ A e;
    private static final /* synthetic */ Set<v> d;
    private /* synthetic */ int m;
    private final /* synthetic */ List<m> p;
    private static final /* synthetic */ Marker j;
    private final /* synthetic */ List<g> b;
    private /* synthetic */ boolean i;
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ Multimap<ay, String> f;
    private final /* synthetic */ Map<j, Integer> h;
    private final /* synthetic */ Map<j, String> l;
    private final /* synthetic */ c a;
    private final /* synthetic */ Map<String, Integer> o;
    private final /* synthetic */ Map<String, j> k;

    public void a() {
        Iterator<Map.Entry<String, j>> iterator = this.k.entrySet().iterator();
        net.minecraft.k.m[] arrm = s.b();
        while (iterator.hasNext()) {
            boolean bl2;
            Map.Entry<String, j> entry = iterator.next();
            String string = entry.getKey();
            boolean bl3 = bl2 = this.a(entry.getValue());
            if (arrm != null && bl3) {
                c.debug(j, "Pausing channel {}", (Object)string);
                this.e.pause(string);
                bl3 = this.n.add(string);
            }
            if (arrm != null) continue;
        }
    }

    public void a(g g10) {
        this.b.add(g10);
    }

    static Logger f() {
        return c;
    }

    public void d(j j2) {
        block2: {
            String string;
            Object object;
            block1: {
                net.minecraft.k.m[] arrm = s.b();
                object = this;
                if (arrm == null) break block1;
                if (!((o)object).i) break block2;
                object = this.l.get(j2);
            }
            if ((string = (String)object) != null) {
                this.e.stop(string);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b() {
        block17: {
            ++this.m;
            var1_1 = s.b();
            var2_2 = this.p.iterator();
            while (var2_2.hasNext()) {
                block20: {
                    block18: {
                        block19: {
                            var3_3 = var2_2.next();
                            var3_3.c();
                            v0 = var3_3;
                            if (var1_1 == null) break block18;
                            v1 = v0.a();
                            if (var1_1 == null) ** GOTO lbl26
                            if (!v1) break block19;
                            this.d((j)var3_3);
                            if (var1_1 != null) break block20;
                        }
                        v0 = this.l.get(var3_3);
                    }
                    var4_4 = (String)v0;
                    this.e.setVolume((String)var4_4, this.b((j)var3_3));
                    this.e.setPitch((String)var4_4, this.c((j)var3_3));
                    this.e.setPosition((String)var4_4, var3_3.e(), var3_3.a(), var3_3.k());
                }
                if (var1_1 != null) continue;
            }
            var2_2 = this.k.entrySet().iterator();
            do {
                block21: {
                    block22: {
                        v1 = var2_2.hasNext();
lbl26:
                        // 2 sources

                        if (!v1) break;
                        var3_3 = (Map.Entry)var2_2.next();
                        var4_4 = (String)var3_3.getKey();
                        var5_5 = (j)var3_3.getValue();
                        v2 = this;
                        if (var1_1 == null) break block17;
                        v3 = v2.e.playing((String)var4_4);
                        if (var1_1 != null) {
                            if (v3 != 0) continue;
                            v3 = this.o.get(var4_4);
                        }
                        v4 = var6_6 = v3;
                        if (var1_1 != null) {
                            if (v4 > this.m) continue;
                            v4 = var5_5.b();
                        }
                        var7_7 = v4;
                        v5 = var5_5.h();
                        if (var1_1 == null) break block21;
                        if (v5 == 0) break block22;
                        v5 = var7_7;
                        if (var1_1 == null) break block21;
                        if (v5 > 0) {
                            this.h.put(var5_5, this.m + var7_7);
                        }
                    }
                    var2_2.remove();
                    net.minecraft.client.e.o.c.debug(net.minecraft.client.e.o.j, "Removed channel {} because it's not playing anymore", var4_4);
                    this.e.removeSource((String)var4_4);
                    this.o.remove(var4_4);
                    try {
                        v5 = this.f.remove((Object)var5_5.g(), var4_4) ? 1 : 0;
                    }
                    catch (RuntimeException var8_8) {
                        // empty catch block
                    }
                }
                v6 = var5_5 instanceof m;
                if (var1_1 == null || !v6) continue;
                v6 = this.p.remove(var5_5);
            } while (var1_1 != null);
            v2 = this;
        }
        var3_3 = v2.h.entrySet().iterator();
        do {
            if (var3_3.hasNext() == false) return;
            var4_4 = var3_3.next();
            v7 /* !! */  = this;
            if (var1_1 != null) {
                if (v7 /* !! */ .m < (Integer)var4_4.getValue()) continue;
                v7 /* !! */  = var4_4.getKey();
            }
            var5_5 = (j)v7 /* !! */ ;
            if (var1_1 != null) {
                if (var5_5 instanceof m) {
                    ((m)var5_5).c();
                }
                this.e(var5_5);
            }
            var3_3.remove();
        } while (var1_1 != null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(j j2) {
        String string;
        net.minecraft.k.m[] arrm = s.b();
        Object object = this;
        if (arrm != null) {
            if (!((o)object).i) {
                return false;
            }
            object = this.l.get(j2);
        }
        if ((string = (String)object) == null) {
            return false;
        }
        int n2 = this.e.playing(string);
        if (arrm == null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        n2 = this.o.containsKey(string);
        if (arrm != null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.o.get(string);
        }
        if (arrm == null) return n2 != 0;
        if (n2 > this.m) return 0 != 0;
        return 1 != 0;
    }

    public o(C c10, c c11) {
        this.k = HashBiMap.create();
        this.l = ((BiMap)this.k).inverse();
        this.f = HashMultimap.create();
        this.p = Lists.newArrayList();
        this.h = Maps.newHashMap();
        this.o = Maps.newHashMap();
        this.b = Lists.newArrayList();
        this.n = Lists.newArrayList();
        this.g = c10;
        this.a = c11;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            c.error(j, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    public void h() {
        o o2;
        block3: {
            net.minecraft.k.m[] arrm = s.b();
            d.clear();
            net.minecraft.k.m[] arrm2 = arrm;
            for (d d10 : net.minecraft.ar.d.c) {
                block5: {
                    v v2;
                    block4: {
                        v2 = d10.a();
                        if (arrm2 == null) break block4;
                        o2 = this;
                        if (arrm2 == null) break block3;
                        if (o2.g.a(v2) != null) break block5;
                        c.warn("Missing sound for event: {}", (Object)net.minecraft.ar.d.c.b(d10));
                    }
                    d.add(v2);
                }
                if (arrm2 != null) continue;
            }
            this.d();
            o2 = this;
        }
        o2.e();
    }

    public void c() {
        block2: {
            Iterator<String> iterator = this.n.iterator();
            net.minecraft.k.m[] arrm = s.b();
            while (iterator.hasNext()) {
                String string = iterator.next();
                c.debug(j, "Resuming channel {}", (Object)string);
                this.e.play(string);
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block2;
            }
            this.n.clear();
        }
    }

    static A a(o o2) {
        return o2.e;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public void d() {
        block3: {
            block2: {
                net.minecraft.k.m[] arrm = s.b();
                o o2 = this;
                if (arrm == null) break block2;
                if (!o2.i) break block3;
                this.i();
                this.e.cleanup();
                o2 = this;
            }
            o2.i = false;
        }
    }

    private float b(j j2) {
        return net.minecraft.k.h.c(j2.d() * this.a(j2.g()), 0.0f, 1.0f);
    }

    public void a(String string, ay ay2) {
        block10: {
            net.minecraft.k.m[] arrm;
            block15: {
                block11: {
                    arrm = s.b();
                    if (ay2 == null) break block11;
                    for (String object : this.f.get((Object)ay2)) {
                        block14: {
                            boolean bl2;
                            j j2;
                            block12: {
                                block13: {
                                    j2 = this.k.get(object);
                                    if (arrm == null) break block10;
                                    bl2 = string.isEmpty();
                                    if (arrm == null) break block12;
                                    if (!bl2) break block13;
                                    this.d(j2);
                                    if (arrm != null) break block14;
                                }
                                bl2 = j2.j().equals(new v(string));
                            }
                            if (bl2) {
                                this.d(j2);
                            }
                        }
                        if (arrm != null) continue;
                    }
                    if (arrm != null) break block10;
                }
                if (!string.isEmpty()) break block15;
                this.i();
                if (arrm != null) break block10;
            }
            for (j j3 : this.k.values()) {
                if (j3.j().equals(new v(string))) {
                    this.d(j3);
                }
                if (arrm != null) continue;
            }
        }
    }

    public void a(ay ay2, float f10) {
        block3: {
            net.minecraft.k.m[] arrm;
            block4: {
                arrm = s.b();
                if (!this.i) break block3;
                if (ay2 != ay.MASTER) break block4;
                this.e.setMasterVolume(f10);
                if (arrm != null) break block3;
            }
            for (String string : this.f.get((Object)ay2)) {
                block7: {
                    float f11;
                    block6: {
                        block5: {
                            j j2 = this.k.get(string);
                            f11 = this.b(j2);
                            if (arrm == null) break block5;
                            if (!(f11 <= 0.0f)) break block6;
                            this.d(j2);
                        }
                        if (arrm != null) break block7;
                    }
                    this.e.setVolume(string, f11);
                }
                if (arrm != null) continue;
            }
        }
    }

    static {
        j = MarkerManager.getMarker((String)"SOUNDS");
        c = LogManager.getLogger();
        d = Sets.newHashSet();
    }

    static c b(o o2) {
        return o2.a;
    }

    static Marker g() {
        return j;
    }

    private float c(j j2) {
        return net.minecraft.k.h.c(j2.c(), 0.5f, 2.0f);
    }

    public void i() {
        block5: {
            block3: {
                o o2;
                net.minecraft.k.m[] arrm;
                block4: {
                    arrm = s.b();
                    o2 = this;
                    if (arrm == null) break block4;
                    if (!o2.i) break block5;
                    o2 = this;
                }
                for (String string : o2.k.keySet()) {
                    this.e.stop(string);
                    if (arrm != null) {
                        if (arrm != null) continue;
                    }
                    break block3;
                }
                this.k.clear();
                this.h.clear();
                this.p.clear();
                this.f.clear();
            }
            this.o.clear();
        }
    }

    static A a(o o2, A a10) {
        o2.e = a10;
        return o2.e;
    }

    private static URL a(v v2) {
        String string = String.format("%s:%s:%s", "mcsounddomain", v2.c(), v2.a());
        B b10 = new B(v2);
        try {
            return new URL(null, string, b10);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    private synchronized void e() {
        net.minecraft.k.m[] arrm = s.b();
        if (arrm != null && !this.i) {
            try {
                new Thread((Runnable)new D(this), "Sound Library Loader").start();
            }
            catch (RuntimeException runtimeException) {
                c.error(j, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
                this.a.a(ay.MASTER, 0.0f);
                this.a.e();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float a(ay ay2) {
        net.minecraft.k.m[] arrm = s.b();
        ay ay3 = ay2;
        if (arrm != null) {
            if (ay3 == null) return 1.0f;
            ay3 = ay2;
        }
        if (ay3 == ay.MASTER) return 1.0f;
        float f10 = this.a.a(ay2);
        return f10;
    }

    public void b(g g10) {
        this.b.remove(g10);
    }

    static boolean a(o o2, boolean bl2) {
        o2.i = bl2;
        return o2.i;
    }

    public void a(j j2, int n2) {
        this.h.put(j2, this.m + n2);
    }

    /*
     * Exception decompiling
     */
    public void e(j var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public void a(net.minecraft.i.j j2, float f10) {
        block2: {
            net.minecraft.i.j j3;
            block3: {
                net.minecraft.k.m[] arrm = s.b();
                if (!this.i) break block2;
                j3 = j2;
                if (arrm == null) break block3;
                if (j3 == null) break block2;
                j3 = j2;
            }
            float f11 = j3.E + (j2.at - j2.E) * f10;
            float f12 = j2.ak + (j2.e - j2.ak) * f10;
            double d10 = j2.N + (j2.a - j2.N) * (double)f10;
            double d11 = j2.L + (j2.aF - j2.L) * (double)f10 + (double)j2.l();
            double d12 = j2.k + (j2.ax - j2.k) * (double)f10;
            float f13 = net.minecraft.k.h.c((f12 + 90.0f) * ((float)Math.PI / 180));
            float f14 = net.minecraft.k.h.g((f12 + 90.0f) * ((float)Math.PI / 180));
            float f15 = net.minecraft.k.h.c(-f11 * ((float)Math.PI / 180));
            float f16 = net.minecraft.k.h.g(-f11 * ((float)Math.PI / 180));
            float f17 = net.minecraft.k.h.c((-f11 + 90.0f) * ((float)Math.PI / 180));
            float f18 = net.minecraft.k.h.g((-f11 + 90.0f) * ((float)Math.PI / 180));
            float f19 = f13 * f15;
            float f20 = f14 * f15;
            float f21 = f13 * f17;
            float f22 = f14 * f17;
            this.e.setListenerPosition((float)d10, (float)d11, (float)d12);
            this.e.setListenerOrientation(f19, f16, f20, f21, f18, f22);
        }
    }
}

