/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.a;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.D.c;
import net.minecraft.P.r;
import net.minecraft.Q.E;
import net.minecraft.Q.I;
import net.minecraft.Q.U;
import net.minecraft.Q.X;
import net.minecraft.Q.a5;
import net.minecraft.Q.aA;
import net.minecraft.Q.aX;
import net.minecraft.Q.a_;
import net.minecraft.Q.aa;
import net.minecraft.Q.ah;
import net.minecraft.Q.al;
import net.minecraft.Q.am;
import net.minecraft.Q.au;
import net.minecraft.Q.az;
import net.minecraft.Q.t;
import net.minecraft.a.C;
import net.minecraft.a.d;
import net.minecraft.a.e;
import net.minecraft.a.f;
import net.minecraft.a.g;
import net.minecraft.a.q;
import net.minecraft.a.u;
import net.minecraft.a.v;
import net.minecraft.a.w;
import net.minecraft.a.x;
import net.minecraft.a4;
import net.minecraft.a6;
import net.minecraft.ah.A;
import net.minecraft.ah.p;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.aq.b;
import net.minecraft.at.a;
import net.minecraft.at.h;
import net.minecraft.at.l;
import net.minecraft.aw.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class k {
    private final /* synthetic */ v t;
    private final /* synthetic */ net.minecraft.R.b b;
    public static final /* synthetic */ File j;
    private /* synthetic */ j g;
    public static final /* synthetic */ File v;
    private /* synthetic */ int d;
    private final /* synthetic */ u i;
    private final /* synthetic */ Map<UUID, net.minecraft.l.h> f;
    private static final /* synthetic */ Logger k;
    private final /* synthetic */ w o;
    private final /* synthetic */ List<net.minecraft.i.k> a;
    private final /* synthetic */ x s;
    protected /* synthetic */ int h;
    public static final /* synthetic */ File e;
    private /* synthetic */ boolean n;
    private static final /* synthetic */ SimpleDateFormat m;
    private /* synthetic */ boolean p;
    private final /* synthetic */ Map<UUID, net.minecraft.i.k> w;
    private static /* synthetic */ boolean u;
    private final /* synthetic */ Map<UUID, a4> c;
    private /* synthetic */ s q;
    private /* synthetic */ int l;
    public static final /* synthetic */ File r;

    public void a(net.minecraft.at.k k2, boolean bl2) {
        this.b.a(k2);
        a a10 = bl2 ? net.minecraft.at.a.SYSTEM : net.minecraft.at.a.CHAT;
        this.a(new ah(k2, a10));
    }

    public int k() {
        return this.a.size();
    }

    public void a(boolean bl2) {
        this.p = bl2;
    }

    private void b(net.minecraft.i.k k2, int n2) {
        block3: {
            byte by2;
            block6: {
                int n3;
                int n4;
                block7: {
                    block8: {
                        boolean bl2;
                        block4: {
                            block5: {
                                net.minecraft.i.k k3;
                                block2: {
                                    bl2 = net.minecraft.a.k.q();
                                    k3 = k2;
                                    if (bl2) break block2;
                                    if (k3 == null) break block3;
                                    k3 = k2;
                                }
                                if (k3.cD == null) break block3;
                                n4 = n2;
                                if (bl2) break block4;
                                if (n4 > 0) break block5;
                                by2 = 24;
                                if (!bl2) break block6;
                            }
                            n4 = n2;
                        }
                        n3 = 4;
                        if (bl2) break block7;
                        if (n4 < n3) break block8;
                        by2 = 28;
                        if (!bl2) break block6;
                    }
                    n4 = 24;
                    n3 = n2;
                }
                by2 = (byte)(n4 + n3);
            }
            k2.cD.a(new a5(k2, by2));
        }
    }

    public void j() {
        boolean bl2 = net.minecraft.a.k.q();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            this.c(this.a.get(i2));
            if (!bl2) continue;
        }
    }

    private void a(net.minecraft.i.k k2, net.minecraft.i.k k3, z z2) {
        block6: {
            block5: {
                net.minecraft.i.k k4;
                boolean bl2;
                block4: {
                    bl2 = net.minecraft.a.k.q();
                    k4 = k3;
                    if (bl2) break block4;
                    if (k4 == null) break block5;
                    k4 = k2;
                }
                k4.c7.a(k3.c7.e());
                if (!bl2) break block6;
            }
            if (this.q != null) {
                k2.c7.a(this.q);
            }
        }
        k2.c7.b(z2.b().g());
    }

    public net.minecraft.i.k a(UUID uUID) {
        return this.w.get(uUID);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e(GameProfile gameProfile) {
        boolean bl2;
        boolean bl3;
        block4: {
            block5: {
                bl3 = net.minecraft.a.k.t();
                bl2 = this.o.d(gameProfile);
                if (!bl3) return bl2;
                if (bl2) return true;
                bl2 = this.b.av();
                if (!bl3) break block4;
                if (!bl2) break block5;
                bl2 = this.b.S[0].b().F();
                if (!bl3) break block4;
                if (bl2) {
                    bl2 = this.b.aa().equalsIgnoreCase(gameProfile.getName());
                    if (!bl3) return bl2;
                    if (bl2) return true;
                }
            }
            bl2 = this.n;
        }
        if (!bl3) return bl2;
        if (!bl2) return false;
        return true;
    }

    public GameProfile[] e() {
        GameProfile[] arrgameProfile;
        block2: {
            GameProfile[] arrgameProfile2 = new GameProfile[this.a.size()];
            boolean bl2 = net.minecraft.a.k.q();
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                arrgameProfile = arrgameProfile2;
                if (!bl2) {
                    arrgameProfile[i2] = this.a.get(i2).m();
                    if (!bl2) continue;
                }
                break block2;
            }
            arrgameProfile = arrgameProfile2;
        }
        return arrgameProfile;
    }

    public void d(boolean bl2) {
        this.n = bl2;
    }

    public void c() {
        block3: {
            int n2;
            block2: {
                boolean bl2 = net.minecraft.a.k.t();
                k k2 = this;
                k k3 = k2;
                n2 = k2.l + 1;
                if (!bl2) break block2;
                k3.l = n2;
                if (n2 <= 600) break block3;
                this.a(new aX(net.minecraft.Q.v.UPDATE_LATENCY, this.a));
                k3 = this;
                n2 = 0;
            }
            k3.l = n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(net.minecraft.C.u var1_1, net.minecraft.i.k var2_2) {
        block30: {
            block23: {
                block19: {
                    block27: {
                        block25: {
                            block26: {
                                block24: {
                                    block22: {
                                        block21: {
                                            block20: {
                                                var4_3 = var2_2.m();
                                                var3_4 = net.minecraft.a.k.t();
                                                var5_5 = this.b.au();
                                                v0 = var6_6 = var5_5.a(var4_3.getId());
                                                if (!var3_4) ** GOTO lbl10
                                                if (v0 == null) {
                                                    v1 = var4_3.getName();
                                                } else {
                                                    v0 = var6_6;
lbl10:
                                                    // 2 sources

                                                    v1 = v0.getName();
                                                }
                                                var7_7 = v1;
                                                var5_5.a(var4_3);
                                                var8_8 = this.e(var2_2);
                                                var2_2.a(this.b.c(var2_2.p));
                                                var2_2.c7.a((A)var2_2.aG);
                                                var9_9 = "local";
                                                if (var3_4) {
                                                    if (var1_1.a() != null) {
                                                        var9_9 = var1_1.a().toString();
                                                    }
                                                    net.minecraft.a.k.k.info("{}[{}] logged in with entity id {} at ({}, {}, {})", (Object)var2_2.g(), (Object)var9_9, (Object)var2_2.W(), (Object)var2_2.a, (Object)var2_2.aF, (Object)var2_2.ax);
                                                }
                                                var10_10 = this.b.c(var2_2.p);
                                                var11_11 = var10_10.b();
                                                this.a(var2_2, null, var10_10);
                                                var12_12 = new net.minecraft.C.a(this.b, var1_1, var2_2);
                                                var12_12.a(new am(var2_2.W(), var2_2.c7.e(), var11_11.a(), var10_10.D.r().a(), var10_10.g(), this.g(), var11_11.w(), var10_10.M().c("reducedDebugInfo")));
                                                var12_12.a(new X("MC|Brand", new net.minecraft.C.m(Unpooled.buffer()).a(this.n().am())));
                                                var12_12.a(new U(var11_11.o(), var11_11.q()));
                                                var12_12.a(new t(var2_2.cw));
                                                var12_12.a(new au(var2_2.cB.a));
                                                this.b(var2_2);
                                                var2_2.W().c();
                                                var2_2.G().a(var2_2);
                                                this.a((c)var10_10.c(), var2_2);
                                                this.b.F();
                                                if (!var2_2.g().equalsIgnoreCase(var7_7)) break block20;
                                                var13_13 = new h("multiplayer.player.joined", new Object[]{var2_2.d()});
                                                if (var3_4) break block21;
                                                net.minecraft.k.m.b(net.minecraft.k.m.d() == false);
                                            }
                                            var13_13 = new h("multiplayer.player.joined.renamed", new Object[]{var2_2.d(), var7_7});
                                        }
                                        var13_13.e().a(net.minecraft.at.l.YELLOW);
                                        this.a(var13_13);
                                        this.f(var2_2);
                                        var12_12.a(var2_2.a, var2_2.aF, var2_2.ax, var2_2.e, var2_2.at);
                                        this.b(var2_2, var10_10);
                                        if (!this.b.t().isEmpty()) {
                                            var2_2.a(this.b.t(), this.b.E());
                                        }
                                        for (net.minecraft.K.j var15_15 : var2_2.az()) {
                                            var12_12.a(new aA(var2_2.W(), var15_15));
                                            if (var3_4 == false) return;
                                            if (var3_4) continue;
                                        }
                                        v2 = var8_8;
                                        if (!var3_4) break block22;
                                        if (v2 == null) break block23;
                                        v2 = var8_8;
                                    }
                                    v3 = "RootVehicle";
                                    if (!var3_4) break block24;
                                    if (!v2.a(v3, 10)) break block23;
                                    v2 = var8_8;
                                    v3 = "RootVehicle";
                                }
                                var14_14 = v2.h(v3);
                                var15_16 = net.minecraft.t.j.a(var14_14.h("Entity"), (z)var10_10, true);
                                if (var3_4 == false) return;
                                if (var15_16 == null) break block23;
                                var16_17 = var14_14.l("Attach");
                                v4 = var15_16;
                                if (!var3_4) break block25;
                                if (!v4.u().equals(var16_17)) break block26;
                                var2_2.a(var15_16, true);
                                if (var3_4) break block27;
                            }
                            v4 = var15_16;
                        }
                        for (net.minecraft.U.x var18_19 : v4.r()) {
                            block29: {
                                block28: {
                                    v5 = var18_19.u().equals(var16_17);
                                    if (!var3_4) break block19;
                                    if (!var3_4) break block28;
                                    if (!v5) break block29;
                                    var2_2.a(var18_19, true);
                                }
                                if (var3_4) break;
                            }
                            if (var3_4) continue;
                        }
                    }
                    v6 = var2_2;
                    if (!var3_4) break block30;
                    v5 = v6.N();
                }
                if (!v5) {
                    net.minecraft.a.k.k.warn("Couldn't reattach entity to player");
                    var10_10.a(var15_16);
                    for (net.minecraft.U.x var18_19 : var15_16.r()) {
                        var10_10.a(var18_19);
                        if (var3_4 == false) return;
                        if (var3_4) continue;
                    }
                }
            }
            v6 = var2_2;
        }
        v6.h();
    }

    public String[] i() {
        String[] arrstring;
        block2: {
            String[] arrstring2 = new String[this.a.size()];
            boolean bl2 = net.minecraft.a.k.q();
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                arrstring = arrstring2;
                if (!bl2) {
                    arrstring[i2] = this.a.get(i2).g();
                    if (!bl2) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    public r f() {
        return null;
    }

    public String[] p() {
        return this.o.e();
    }

    /*
     * Exception decompiling
     */
    public void b(net.minecraft.i.k var1_1) {
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

    public List<net.minecraft.i.k> b(String string) {
        ArrayList arrayList = Lists.newArrayList();
        boolean bl2 = net.minecraft.a.k.t();
        for (net.minecraft.i.k k2 : this.a) {
            boolean bl3 = k2.e().equals(string);
            if (bl2 && bl3) {
                bl3 = arrayList.add(k2);
            }
            if (bl2) continue;
        }
        return arrayList;
    }

    public void a(int n2) {
        block7: {
            A[] arra;
            boolean bl2;
            block6: {
                this.d = n2;
                bl2 = net.minecraft.a.k.t();
                arra = this.b.S;
                if (!bl2) break block6;
                if (arra == null) break block7;
                arra = this.b.S;
            }
            A[] arra2 = arra;
            int n3 = arra2.length;
            int n4 = 0;
            while (n4 < n3) {
                A a10 = arra2[n4];
                if (bl2) {
                    if (a10 != null) {
                        a10.g().b(n2);
                        a10.x().a(n2);
                    }
                    ++n4;
                }
                if (bl2) continue;
            }
        }
    }

    protected void c(net.minecraft.i.k k2) {
        block6: {
            a4 a42;
            block5: {
                a4 a43;
                boolean bl2 = net.minecraft.a.k.t();
                this.g.a(k2);
                boolean bl3 = bl2;
                net.minecraft.l.h h2 = this.f.get(k2.u());
                Object object = h2;
                if (bl3) {
                    if (object != null) {
                        h2.a();
                    }
                    object = this.c.get(k2.u());
                }
                a42 = a43 = (a4)object;
                if (!bl3) break block5;
                if (a42 == null) break block6;
                a42 = a43;
            }
            a42.b();
        }
    }

    public void a(K<?> k2) {
        boolean bl2 = net.minecraft.a.k.q();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            this.a.get((int)i2).cD.a(k2);
            if (!bl2) continue;
        }
    }

    public void d(GameProfile gameProfile) {
        int n2 = this.b.r();
        this.o.a(new f(gameProfile, this.b.r(), this.o.c(gameProfile)));
        this.b(this.a(gameProfile.getId()), n2);
    }

    public void a(net.minecraft.i.j j2, net.minecraft.at.k k2) {
        block4: {
            net.minecraft.D.l l2;
            boolean bl2;
            block3: {
                net.minecraft.D.l l3 = j2.aM();
                bl2 = net.minecraft.a.k.q();
                l2 = l3;
                if (bl2) break block3;
                if (l2 == null) break block4;
                l2 = l3;
            }
            for (String string : l2.h()) {
                block6: {
                    net.minecraft.i.k k3;
                    block7: {
                        net.minecraft.i.k k4;
                        block5: {
                            k3 = k4 = this.a(string);
                            if (bl2) break block5;
                            if (k3 == null) break block6;
                            k3 = k4;
                        }
                        if (bl2) break block7;
                        if (k3 == j2) break block6;
                        k3 = k4;
                    }
                    k3.a(k2);
                }
                if (!bl2) continue;
            }
        }
    }

    public static boolean t() {
        boolean bl2 = net.minecraft.a.k.q();
        return !bl2;
    }

    public void w() {
        Iterator<a4> iterator = this.c.values().iterator();
        boolean bl2 = net.minecraft.a.k.t();
        while (iterator.hasNext()) {
            a4 a42 = iterator.next();
            a42.a();
            if (bl2) continue;
        }
    }

    public void a(net.minecraft.i.k k2, int n2) {
        int n3 = k2.p;
        A a10 = this.b.c(k2.p);
        k2.p = n2;
        boolean bl2 = net.minecraft.a.k.q();
        A a11 = this.b.c(k2.p);
        k2.cD.a(new al(k2.p, k2.aG.g(), k2.aG.b().w(), k2.c7.e()));
        this.b(k2);
        boolean bl3 = bl2;
        a10.a(k2);
        k2.P = false;
        this.a(k2, n3, a10, a11);
        this.a(k2, a10);
        k2.cD.a(k2.a, k2.aF, k2.ax, k2.e, k2.at);
        k2.c7.a(a11);
        k2.cD.a(new t(k2.cw));
        this.b(k2, a11);
        this.d(k2);
        for (net.minecraft.K.j j2 : k2.az()) {
            k2.cD.a(new aA(k2.W(), j2));
            if (!bl3) continue;
        }
    }

    public int g() {
        return this.h;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void b(net.minecraft.i.k k2, A a10) {
        block3: {
            block2: {
                net.minecraft.V.a a11 = this.b.S[0].O();
                boolean bl2 = net.minecraft.a.k.t();
                k2.cD.a(new I(a11, E.INITIALIZE));
                boolean bl3 = bl2;
                k2.cD.a(new net.minecraft.Q.c(a10.r(), a10.s(), a10.M().c("doDaylightCycle")));
                n n2 = a10.G();
                k2.cD.a(new a_(n2));
                if (!bl3) break block2;
                if (!a10.J()) break block3;
                k2.cD.a(new az(1, 0.0f));
                k2.cD.a(new az(7, a10.a(1.0f)));
            }
            k2.cD.a(new az(8, a10.g(1.0f)));
        }
    }

    public static void c(boolean bl2) {
        u = bl2;
    }

    public void f(GameProfile gameProfile) {
        this.s.a(new g(gameProfile));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public net.minecraft.l.h a(net.minecraft.i.j var1_1) {
        block6: {
            block7: {
                var3_2 = var1_1.u();
                var2_3 = net.minecraft.a.k.t();
                v0 = var3_2;
                if (!var2_3) ** GOTO lbl9
                if (v0 == null) {
                    v1 = null;
                } else {
                    v0 = this.f.get(var3_2);
lbl9:
                    // 2 sources

                    v1 = (net.minecraft.l.h)v0;
                }
                v2 = var4_4 = v1;
                if (var2_3 == false) return v2;
                if (v2 != null) break block6;
                var5_5 = new File(this.b.c(0).v().f(), "stats");
                var6_6 = new File(var5_5, var3_2 + ".json");
                v3 = var6_6;
                if (!var2_3) break block6;
                if (v3.exists()) break block7;
                var7_7 = new File(var5_5, var1_1.g() + ".json");
                v3 = var7_7;
                if (!var2_3) break block6;
                if (!v3.exists()) break block7;
                v3 = var7_7;
                if (!var2_3) break block6;
                if (v3.isFile()) {
                    var7_7.renameTo(var6_6);
                }
            }
            var4_4 = new net.minecraft.l.h(this.b, var6_6);
            var4_4.b();
            v3 = this.f.put(var3_2, var4_4);
        }
        v2 = var4_4;
        return v2;
    }

    static {
        v = new File("banned-players.json");
        j = new File("banned-ips.json");
        e = new File("ops.json");
        r = new File("whitelist.json");
        net.minecraft.a.k.c(false);
        k = LogManager.getLogger();
        m = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    }

    public void a(net.minecraft.i.k k2) {
        k2.n().g().b(k2);
    }

    public void a(net.minecraft.i.k k2, @Nullable A a10) {
        block4: {
            net.minecraft.i.k k3;
            block6: {
                p p2;
                p p3;
                block5: {
                    A a11;
                    boolean bl2;
                    block3: {
                        A a12 = k2.n();
                        bl2 = net.minecraft.a.k.t();
                        a11 = a10;
                        if (bl2) {
                            if (a11 != null) {
                                a10.g().a(k2);
                            }
                            a12.g().c(k2);
                            a12.a().a((int)k2.a >> 4, (int)k2.ax >> 4);
                            a11 = a10;
                        }
                        if (!bl2) break block3;
                        if (a11 == null) break block4;
                        a6.b.a(k2, a10.D.r(), a12.D.r());
                        a11 = a10;
                    }
                    p3 = a11.D.r();
                    p2 = net.minecraft.ah.p.NETHER;
                    if (!bl2) break block5;
                    if (p3 != p2) break block4;
                    k3 = k2;
                    if (!bl2) break block6;
                    p3 = k3.aG.D.r();
                    p2 = net.minecraft.ah.p.OVERWORLD;
                }
                if (p3 != p2) break block4;
                k3 = k2;
            }
            if (k3.o() != null) {
                a6.B.a(k2, k2.o());
            }
        }
    }

    public void a(A[] arra) {
        this.g = arra[0].v().a();
        arra[0].O().a(new C(this));
    }

    @Nullable
    public r e(net.minecraft.i.k k2) {
        r r2;
        block4: {
            r r3;
            block3: {
                block2: {
                    r r4 = this.b.S[0].b().v();
                    boolean bl2 = net.minecraft.a.k.q();
                    if (!k2.g().equals(this.b.aa())) break block2;
                    r3 = r4;
                    if (bl2) break block3;
                    if (r3 == null) break block2;
                    r2 = r4;
                    k2.d(r4);
                    k.debug("loading single player");
                    if (!bl2) break block4;
                }
                r3 = this.g.b(k2);
            }
            r2 = r3;
        }
        return r2;
    }

    public void b(net.minecraft.i.j j2, net.minecraft.at.k k2) {
        block8: {
            boolean bl2;
            net.minecraft.D.l l2;
            block7: {
                block6: {
                    l2 = j2.aM();
                    bl2 = net.minecraft.a.k.t();
                    if (!bl2) break block6;
                    if (l2 != null) break block7;
                    this.a(k2);
                }
                if (bl2) break block8;
            }
            int n2 = 0;
            while (n2 < this.a.size()) {
                net.minecraft.i.k k3 = this.a.get(n2);
                if (bl2) {
                    if (k3.aM() != l2) {
                        k3.a(k2);
                    }
                    ++n2;
                }
                if (bl2) continue;
            }
        }
    }

    public void f(net.minecraft.i.k k2) {
        block2: {
            boolean bl2 = net.minecraft.a.k.t();
            this.a.add(k2);
            boolean bl3 = bl2;
            this.w.put(k2.u(), k2);
            this.a(new aX(net.minecraft.Q.v.ADD_PLAYER, k2));
            A a10 = this.b.c(k2.p);
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                k2.cD.a(new aX(net.minecraft.Q.v.ADD_PLAYER, this.a.get(i2)));
                if (bl3) {
                    if (bl3) continue;
                }
                break block2;
            }
            a10.f(k2);
            this.a(k2, null);
        }
    }

    public net.minecraft.R.b n() {
        return this.b;
    }

    public static boolean q() {
        return u;
    }

    public net.minecraft.i.k a(net.minecraft.i.k k2, int n2, boolean bl2) {
        net.minecraft.i.k k3;
        A a10;
        net.minecraft.i.k k4;
        boolean bl3;
        block12: {
            block16: {
                block18: {
                    block17: {
                        n n3;
                        boolean bl4;
                        n n32;
                        block15: {
                            net.minecraft.a.p p2;
                            block14: {
                                block13: {
                                    k2.n().x().a(k2);
                                    boolean bl5 = net.minecraft.a.k.q();
                                    k2.n().x().b((net.minecraft.U.x)k2);
                                    k2.n().g().a(k2);
                                    bl3 = bl5;
                                    this.a.remove(k2);
                                    this.b.c(k2.p).a(k2);
                                    n32 = k2.Y();
                                    bl4 = k2.T();
                                    k2.p = n2;
                                    if (!this.b.n()) break block13;
                                    p2 = new q(this.b.c(k2.p));
                                    if (!bl3) break block14;
                                }
                                p2 = new net.minecraft.a.p(this.b.c(k2.p));
                            }
                            k4 = new net.minecraft.i.k(this.b, this.b.c(k2.p), k2.m(), p2);
                            k4.cD = k2.cD;
                            k4.a(k2, bl2);
                            k4.g(k2.W());
                            k4.r(k2);
                            k4.a(k2.al());
                            for (String object2 : k2.X()) {
                                k4.c(object2);
                                if (!bl3) continue;
                            }
                            a10 = this.b.c(k2.p);
                            this.a(k4, k2, a10);
                            n n4 = n32;
                            if (bl3) break block15;
                            if (n4 == null) break block16;
                            n4 = n3 = net.minecraft.i.j.a(this.b.c(k2.p), n32, bl4);
                        }
                        if (bl3) break block17;
                        if (n3 == null) break block18;
                        k4.c((float)n3.e() + 0.5f, (float)n3.b() + 0.1f, (float)n3.a() + 0.5f, 0.0f, 0.0f);
                        k4.b(n32, bl4);
                    }
                    if (!bl3) break block16;
                }
                k4.cD.a(new az(0, 0.0f));
            }
            a10.a().a((int)k4.a >> 4, (int)k4.ax >> 4);
            while (!a10.a((net.minecraft.U.x)k4, k4.m()).isEmpty()) {
                k3 = k4;
                if (!bl3 && !bl3) {
                    if (!(k3.aF < 256.0)) break;
                    k4.g(k4.a, k4.aF + 1.0, k4.ax);
                    if (!bl3) continue;
                }
                break block12;
            }
            k3 = k4;
        }
        k3.cD.a(new al(k4.p, k4.aG.g(), k4.aG.b().w(), k4.c7.e()));
        n n5 = a10.G();
        k4.cD.a(k4.a, k4.aF, k4.ax, k4.e, k4.at);
        k4.cD.a(new a_(n5));
        k4.cD.a(new net.minecraft.Q.f(k4.b7, k4.b8, k4.b4));
        this.b(k4, a10);
        this.b(k4);
        a10.g().c(k4);
        a10.f(k4);
        this.a.add(k4);
        this.w.put(k4.u(), k4);
        k4.h();
        k4.f(k4.V());
        if (net.minecraft.k.m.c()) {
            net.minecraft.a.k.c(!bl3);
        }
        return k4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public net.minecraft.i.k h(GameProfile gameProfile) {
        Object object;
        block15: {
            ArrayList arrayList;
            boolean bl2;
            block17: {
                ArrayList arrayList2;
                block16: {
                    net.minecraft.i.k k2;
                    Object object2;
                    block14: {
                        UUID uUID = net.minecraft.i.j.a(gameProfile);
                        bl2 = net.minecraft.a.k.q();
                        arrayList2 = Lists.newArrayList();
                        int n2 = 0;
                        while (n2 < this.a.size()) {
                            object = this.a.get(n2);
                            if (!bl2) {
                                object2 = ((net.minecraft.U.x)object).u();
                                if (bl2) break block14;
                                if (((UUID)object2).equals(uUID)) {
                                    arrayList2.add(object);
                                }
                                ++n2;
                            }
                            if (!bl2) continue;
                        }
                        object2 = this.w.get(gameProfile.getId());
                    }
                    if ((k2 = object2) == null) break block16;
                    arrayList = arrayList2;
                    if (bl2) break block17;
                    if (!arrayList.contains(k2)) {
                        arrayList2.add(k2);
                    }
                }
                arrayList = arrayList2;
            }
            for (net.minecraft.i.k k3 : arrayList) {
                k3.cD.b(new h("multiplayer.disconnect.duplicate_login", new Object[0]));
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block15;
            }
            if (this.b.n()) {
                object = new q(this.b.c(0));
                return new net.minecraft.i.k(this.b, this.b.c(0), gameProfile, (net.minecraft.a.p)object);
            }
        }
        object = new net.minecraft.a.p(this.b.c(0));
        return new net.minecraft.i.k(this.b, this.b.c(0), gameProfile, (net.minecraft.a.p)object);
    }

    public int b() {
        return net.minecraft.a.s.a(this.d());
    }

    public void d(net.minecraft.i.k k2) {
        k2.a(k2.cu);
        k2.S();
        k2.cD.a(new au(k2.cB.a));
    }

    public void a(net.minecraft.U.x x2, int n2, A a10, A a11) {
        block18: {
            int n3;
            float f10;
            double d10;
            boolean bl2;
            double d11;
            block12: {
                block13: {
                    n n4;
                    block17: {
                        block16: {
                            int n5;
                            block14: {
                                block15: {
                                    block10: {
                                        block11: {
                                            d11 = x2.a;
                                            bl2 = net.minecraft.a.k.t();
                                            d10 = x2.ax;
                                            double d12 = 8.0;
                                            f10 = x2.e;
                                            a10.H.b("moving");
                                            n5 = x2.p;
                                            if (!bl2) break block10;
                                            if (n5 != -1) break block11;
                                            d11 = net.minecraft.k.h.b(d11 / 8.0, a11.O().g() + 16.0, a11.O().r() - 16.0);
                                            d10 = net.minecraft.k.h.b(d10 / 8.0, a11.O().f() + 16.0, a11.O().d() - 16.0);
                                            x2.c(d11, x2.aF, d10, x2.e, x2.at);
                                            n3 = x2.aL() ? 1 : 0;
                                            if (!bl2) break block12;
                                            if (n3 == 0) break block13;
                                            a10.a(x2, false);
                                            if (bl2) break block13;
                                        }
                                        n5 = x2.p;
                                    }
                                    if (!bl2) break block14;
                                    if (n5 != 0) break block15;
                                    d11 = net.minecraft.k.h.b(d11 * 8.0, a11.O().g() + 16.0, a11.O().r() - 16.0);
                                    d10 = net.minecraft.k.h.b(d10 * 8.0, a11.O().f() + 16.0, a11.O().d() - 16.0);
                                    x2.c(d11, x2.aF, d10, x2.e, x2.at);
                                    n3 = x2.aL() ? 1 : 0;
                                    if (!bl2) break block12;
                                    if (n3 == 0) break block13;
                                    a10.a(x2, false);
                                    if (bl2) break block13;
                                }
                                n5 = n2;
                            }
                            if (n5 != 1) break block16;
                            n4 = a11.G();
                            if (bl2) break block17;
                        }
                        n4 = a11.t();
                    }
                    d11 = n4.e();
                    x2.aF = n4.b();
                    d10 = n4.a();
                    x2.c(d11, x2.aF, d10, 90.0f, 0.0f);
                    n3 = x2.aL();
                    if (!bl2) break block12;
                    if (n3 != 0) {
                        a10.a(x2, false);
                    }
                }
                a10.H.c();
                if (!bl2) break block18;
                n3 = n2;
            }
            if (n3 != 1) {
                b b10 = a10.H;
                if (bl2) {
                    b10.b("placing");
                    d11 = net.minecraft.k.h.c((int)d11, -29999872, 29999872);
                    d10 = net.minecraft.k.h.c((int)d10, -29999872, 29999872);
                    if (x2.aL()) {
                        x2.c(d11, x2.aF, d10, x2.e, x2.at);
                        a11.m().b(x2, f10);
                        a11.f(x2);
                        a11.a(x2, false);
                    }
                    b10 = a10.H;
                }
                b10.c();
            }
            x2.a(a11);
        }
    }

    public void c(GameProfile gameProfile) {
        this.o.b(gameProfile);
        this.b(this.a(gameProfile.getId()), 0);
    }

    public void a(@Nullable net.minecraft.i.j j2, double d10, double d11, double d12, double d13, int n2, K<?> k2) {
        int n3 = 0;
        boolean bl2 = net.minecraft.a.k.q();
        while (n3 < this.a.size()) {
            block5: {
                block6: {
                    net.minecraft.i.k k3 = this.a.get(n3);
                    if (bl2) break block5;
                    if (k3 == j2 || k3.p != n2) break block6;
                    double d14 = d10 - k3.a;
                    double d15 = d11 - k3.aF;
                    double d16 = d12 - k3.ax;
                    if (bl2) break block5;
                    if (d14 * d14 + d15 * d15 + d16 * d16 < d13 * d13) {
                        k3.cD.a(k2);
                    }
                }
                ++n3;
            }
            if (!bl2) continue;
        }
    }

    public a4 h(net.minecraft.i.k k2) {
        UUID uUID = k2.u();
        a4 a42 = this.c.get(uUID);
        boolean bl2 = net.minecraft.a.k.q();
        a4 a43 = a42;
        if (!bl2) {
            if (a43 == null) {
                File file = new File(this.b.c(0).v().f(), "advancements");
                File file2 = new File(file, uUID + ".json");
                a42 = new a4(this.b, file2, k2);
                this.c.put(uUID, a42);
            }
            a42.b(k2);
            a43 = a42;
        }
        return a43;
    }

    public k(net.minecraft.R.b b10) {
        this.a = Lists.newArrayList();
        this.w = Maps.newHashMap();
        this.i = new u(v);
        this.t = new v(j);
        this.o = new w(e);
        this.s = new x(r);
        this.f = Maps.newHashMap();
        this.c = Maps.newHashMap();
        this.b = b10;
        this.i.a(false);
        this.t.a(false);
        this.h = 8;
    }

    public String b(boolean bl2) {
        String string = "";
        boolean bl3 = net.minecraft.a.k.t();
        ArrayList arrayList = Lists.newArrayList(this.a);
        int n2 = 0;
        while (n2 < arrayList.size()) {
            block7: {
                int n3;
                block6: {
                    n3 = n2;
                    if (!bl3) break block6;
                    if (n3 > 0) {
                        string = string + ", ";
                    }
                    string = string + ((net.minecraft.i.k)arrayList.get(n2)).g();
                    if (!bl3) break block7;
                    n3 = bl2 ? 1 : 0;
                }
                if (n3 != 0) {
                    string = string + " (" + ((net.minecraft.i.k)arrayList.get(n2)).a2() + ")";
                }
                ++n2;
            }
            if (bl3) continue;
        }
        return string;
    }

    public void s() {
    }

    public void a(s s2) {
        this.q = s2;
    }

    public void b(GameProfile gameProfile) {
        this.s.b(gameProfile);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        boolean bl2 = net.minecraft.a.k.q();
        int n2 = this.i.b(gameProfile);
        if (!bl2) {
            if (n2 != 0) {
                d d10 = (d)this.i.a(gameProfile);
                String string = "You are banned from this server!\nReason: " + d10.a();
                if (d10.b() == null) return string;
                return string + "\nYour ban will be removed on " + m.format(d10.b());
            }
            n2 = this.a(gameProfile);
        }
        if (!bl2) {
            if (n2 == 0) {
                return "You are not white-listed on this server!";
            }
            n2 = this.t.c(socketAddress);
        }
        if (!bl2) {
            if (n2 != 0) {
                e e10 = this.t.a(socketAddress);
                String string = "Your IP address is banned from this server!\nReason: " + e10.a();
                if (e10.b() == null) return string;
                return string + "\nYour ban will be removed on " + m.format(e10.b());
            }
            n2 = this.a.size();
        }
        if (!bl2) {
            if (n2 < this.h) return null;
            n2 = this.g(gameProfile) ? 1 : 0;
        }
        if (n2 != 0) return null;
        return "The server is full!";
    }

    public boolean g(GameProfile gameProfile) {
        return false;
    }

    public void r() {
        boolean bl2 = net.minecraft.a.k.q();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            this.a.get((int)i2).cD.b(new h("multiplayer.disconnect.server_shutdown", new Object[0]));
            if (!bl2) continue;
        }
    }

    public String[] m() {
        return this.s.e();
    }

    protected void a(c c10, net.minecraft.i.k k2) {
        HashSet hashSet = Sets.newHashSet();
        boolean bl2 = net.minecraft.a.k.q();
        for (net.minecraft.D.m object : c10.a()) {
            k2.cD.a(new aa(object, 0));
            if (!bl2) continue;
        }
        int n2 = 0;
        while (n2 < 19) {
            block6: {
                net.minecraft.D.h h2 = c10.b(n2);
                if (!bl2) {
                    if (h2 != null && !hashSet.contains(h2)) {
                        for (K<?> k3 : c10.a(h2)) {
                            k2.cD.a(k3);
                            if (!bl2) {
                                if (!bl2) continue;
                            }
                            break block6;
                        }
                        hashSet.add(h2);
                    }
                    ++n2;
                }
            }
            if (!bl2) continue;
        }
    }

    public u h() {
        return this.i;
    }

    public void g(net.minecraft.i.k k2) {
        Object object;
        boolean bl2;
        block7: {
            int n2;
            A a10;
            block8: {
                boolean bl3 = net.minecraft.a.k.t();
                a10 = k2.n();
                k2.b(net.minecraft.l.m.M);
                bl2 = bl3;
                this.c(k2);
                n2 = k2.N();
                if (!bl2) break block7;
                if (n2 == 0) break block8;
                object = k2.aX();
                n2 = ((net.minecraft.U.x)object).a(net.minecraft.i.k.class).size();
                if (!bl2) break block7;
                if (n2 == 1) {
                    k.debug("Removing player mount");
                    k2.aO();
                    a10.a((net.minecraft.U.x)object);
                    for (net.minecraft.U.x x2 : ((net.minecraft.U.x)object).r()) {
                        a10.a(x2);
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block7;
                    }
                    a10.b(k2.v, k2.y).w();
                }
            }
            a10.c(k2);
            a10.g().a(k2);
            k2.Y().c();
            n2 = this.a.remove(k2) ? 1 : 0;
        }
        object = k2.u();
        net.minecraft.i.k k3 = this.w.get(object);
        if (bl2) {
            if (k3 == k2) {
                this.w.remove(object);
                this.f.remove(object);
                this.c.remove(object);
            }
            this.a(new aX(net.minecraft.Q.v.REMOVE_PLAYER, k2));
        }
    }

    public void a(K<?> k2, int n2) {
        int n3 = 0;
        boolean bl2 = net.minecraft.a.k.q();
        while (n3 < this.a.size()) {
            net.minecraft.i.k k3 = this.a.get(n3);
            if (!bl2) {
                if (k3.p == n2) {
                    k3.cD.a(k2);
                }
                ++n3;
            }
            if (!bl2) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(GameProfile gameProfile) {
        boolean bl2 = net.minecraft.a.k.t();
        boolean bl3 = this.p;
        if (!bl2) return bl3;
        if (!bl3) return true;
        bl3 = this.o.d(gameProfile);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = this.s.d(gameProfile);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public List<net.minecraft.i.k> u() {
        return this.a;
    }

    @Nullable
    public net.minecraft.i.k a(String string) {
        Iterator<net.minecraft.i.k> iterator = this.a.iterator();
        boolean bl2 = net.minecraft.a.k.q();
        while (iterator.hasNext()) {
            block4: {
                net.minecraft.i.k k2;
                block3: {
                    net.minecraft.i.k k3;
                    k2 = k3 = iterator.next();
                    if (bl2) break block3;
                    if (!k2.g().equalsIgnoreCase(string)) break block4;
                    k2 = k3;
                }
                return k2;
            }
            if (!bl2) continue;
        }
        return null;
    }

    public String[] l() {
        return this.b.S[0].v().a().a();
    }

    public void a(net.minecraft.at.k k2) {
        this.a(k2, true);
    }

    public int d() {
        return this.d;
    }

    public w v() {
        return this.o;
    }

    public v a() {
        return this.t;
    }

    public x o() {
        return this.s;
    }
}

