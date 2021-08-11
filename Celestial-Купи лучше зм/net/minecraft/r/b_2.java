/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.R;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.C.G;
import net.minecraft.C.P;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.ab;
import net.minecraft.E.az;
import net.minecraft.R.a;
import net.minecraft.R.c;
import net.minecraft.R.e;
import net.minecraft.U.x;
import net.minecraft.a.o;
import net.minecraft.a7;
import net.minecraft.aZ;
import net.minecraft.ah.A;
import net.minecraft.ah.B;
import net.minecraft.ah.C;
import net.minecraft.ah.L;
import net.minecraft.ah.j;
import net.minecraft.ah.s;
import net.minecraft.ah.w;
import net.minecraft.ah.z;
import net.minecraft.aq.d;
import net.minecraft.ar.T;
import net.minecraft.ar.Z;
import net.minecraft.ar.ao;
import net.minecraft.ar.aw;
import net.minecraft.at.k;
import net.minecraft.c.f;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.t.g;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b
implements net.minecraft.aq.c,
aw,
Runnable,
J {
    private /* synthetic */ net.minecraft.a.k T;
    private final /* synthetic */ net.minecraft.aw.z U;
    private final /* synthetic */ List<ao> w;
    public /* synthetic */ A[] S;
    private /* synthetic */ long p;
    private /* synthetic */ String N;
    private /* synthetic */ int D;
    private /* synthetic */ KeyPair ad;
    private final /* synthetic */ net.minecraft.av.b G;
    private /* synthetic */ boolean q;
    public /* synthetic */ String n;
    public final /* synthetic */ net.minecraft.aq.b J;
    private /* synthetic */ Thread O;
    private /* synthetic */ boolean Y;
    private final /* synthetic */ P l;
    private final /* synthetic */ GameProfileRepository a;
    public final /* synthetic */ Queue<FutureTask<?>> I;
    private /* synthetic */ boolean t;
    private /* synthetic */ String e;
    private /* synthetic */ int P;
    private final /* synthetic */ MinecraftSessionService ac;
    private final /* synthetic */ File h;
    private /* synthetic */ String Q;
    protected final /* synthetic */ Proxy ab;
    public /* synthetic */ long[][] Z;
    private /* synthetic */ int E;
    private final /* synthetic */ Random W;
    private /* synthetic */ String y;
    private /* synthetic */ long j;
    private /* synthetic */ boolean X;
    private /* synthetic */ String m;
    private /* synthetic */ boolean F;
    private /* synthetic */ boolean d;
    private /* synthetic */ boolean A;
    private final /* synthetic */ o o;
    public static final /* synthetic */ File B;
    private /* synthetic */ boolean s;
    private final /* synthetic */ d R;
    private /* synthetic */ String c;
    private /* synthetic */ boolean H;
    private final /* synthetic */ G u;
    private static final /* synthetic */ Logger aa;
    private /* synthetic */ long C;
    private final /* synthetic */ YggdrasilAuthenticationService v;
    private static /* synthetic */ m[] r;
    public final /* synthetic */ ab z;
    private /* synthetic */ boolean x;
    public static /* synthetic */ b V;
    public final /* synthetic */ long[] k;
    private final /* synthetic */ int i = -1;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean M;
    private /* synthetic */ boolean g;
    private /* synthetic */ String L;
    public /* synthetic */ int f;
    private /* synthetic */ boolean K;

    public int o() {
        return this.D;
    }

    public o au() {
        return this.o;
    }

    public void a(net.minecraft.ah.e e10) {
        A[] arra = this.S;
        m[] arrm = net.minecraft.R.b.U();
        int n2 = arra.length;
        int n3 = 0;
        while (n3 < n2) {
            block3: {
                block4: {
                    A a10;
                    block7: {
                        boolean bl2;
                        block5: {
                            block6: {
                                a10 = arra[n3];
                                if (arrm == null) break block3;
                                if (a10 == null) break block4;
                                bl2 = a10.b().a();
                                if (arrm == null) break block5;
                                if (!bl2) break block6;
                                a10.b().a(net.minecraft.ah.e.HARD);
                                a10.a(true, true);
                                if (arrm != null) break block4;
                            }
                            bl2 = this.av();
                        }
                        if (!bl2) break block7;
                        a10.b().a(e10);
                        a10.a(a10.g() != net.minecraft.ah.e.PEACEFUL, true);
                        if (arrm != null) break block4;
                    }
                    a10.b().a(e10);
                    a10.a(this.ag(), this.X);
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
    }

    public int W() {
        return this.T.g();
    }

    public void L() {
    }

    public boolean ad() {
        return this.M;
    }

    public net.minecraft.aw.z A() {
        return this.U;
    }

    public void F() {
        this.C = 0L;
    }

    public File x() {
        return this.A().b(this.Z(), "icon.png");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(P p2) {
        File file = this.f("server-icon.png");
        m[] arrm = net.minecraft.R.b.U();
        boolean bl2 = file.exists();
        if (arrm != null) {
            if (!bl2) {
                file = this.A().b(this.Z(), "icon.png");
            }
            bl2 = file.isFile();
        }
        if (bl2) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                boolean bl3 = bufferedImage.getWidth();
                if (arrm != null) {
                    bl3 = bl3;
                }
                Validate.validState((boolean)bl3, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                boolean bl4 = bufferedImage.getHeight();
                if (arrm != null) {
                    bl4 = bl4;
                }
                Validate.validState((boolean)bl4, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuf byteBuf2 = Base64.encode((ByteBuf)byteBuf);
                p2.a("data:image/png;base64," + byteBuf2.toString(StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                aa.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public void g(String string) {
        this.c = string;
    }

    protected synchronized void a(String string) {
        this.L = string;
    }

    public az aq() {
        return new az(this);
    }

    public boolean af() {
        return this.F;
    }

    @Override
    public b e() {
        return this;
    }

    public void ap() {
        b b10;
        block19: {
            int n2;
            block16: {
                int n3;
                int n4;
                block18: {
                    m[] arrm;
                    block17: {
                        long l2 = System.nanoTime();
                        ++this.E;
                        arrm = net.minecraft.R.b.U();
                        n2 = this.d;
                        if (arrm != null) {
                            if (n2 != 0) {
                                this.d = false;
                                this.J.g = true;
                                this.J.d();
                            }
                            this.J.b("root");
                            this.T();
                            long l3 = l2 - this.C - 5000000000L;
                            n2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                        }
                        if (arrm != null) {
                            if (n2 >= 0) {
                                GameProfile[] arrgameProfile;
                                block15: {
                                    this.C = l2;
                                    this.l.a(new net.minecraft.C.j(this.W(), this.al()));
                                    arrgameProfile = new GameProfile[Math.min(this.al(), 12)];
                                    int n5 = net.minecraft.k.h.a(this.W, 0, this.al() - arrgameProfile.length);
                                    for (int i2 = 0; i2 < arrgameProfile.length; ++i2) {
                                        arrgameProfile[i2] = this.T.u().get(n5 + i2).m();
                                        if (arrm != null) {
                                            if (arrm != null) continue;
                                        }
                                        break block15;
                                    }
                                    Collections.shuffle(Arrays.asList(arrgameProfile));
                                }
                                this.l.b().a(arrgameProfile);
                            }
                            n2 = this.E % 900;
                        }
                        if (arrm != null) {
                            if (n2 == 0) {
                                this.J.b("save");
                                this.T.j();
                                this.e(true);
                                this.J.c();
                            }
                            this.J.b("tallying");
                            this.k[this.E % 100] = System.nanoTime() - l2;
                            this.J.c();
                            this.J.b("snooper");
                            n2 = this.R.e() ? 1 : 0;
                        }
                        if (arrm == null) break block16;
                        if (n2 != 0) break block17;
                        n4 = this.E;
                        n3 = 100;
                        if (arrm == null) break block18;
                        if (n4 > n3) {
                            this.R.b();
                        }
                    }
                    b10 = this;
                    if (arrm == null) break block19;
                    n4 = b10.E;
                    n3 = 6000;
                }
                n2 = n4 % n3;
            }
            if (n2 == 0) {
                this.R.h();
            }
            this.J.c();
            b10 = this;
        }
        b10.J.c();
    }

    public void a(int n2) {
        this.P = n2;
    }

    public String am() {
        return "vanilla";
    }

    public int ar() {
        return this.P;
    }

    public a7 az() {
        return this.S[0].r();
    }

    public boolean p() {
        return this.g;
    }

    public void a(String string, String string2) {
        this.m = string;
        this.y = string2;
    }

    static Logger ae() {
        return aa;
    }

    public void h(String string) {
        this.e = string;
    }

    public static m[] U() {
        return r;
    }

    public boolean an() {
        return true;
    }

    public f a(f f10) {
        m[] arrm = net.minecraft.R.b.U();
        f f11 = f10;
        if (arrm != null) {
            f11.a().a("Profiler Position", new a(this));
            if (this.T != null) {
                f10.a().a("Player Count", new e(this));
            }
            f11 = f10;
        }
        return f11;
    }

    public b(File file, Proxy proxy, net.minecraft.av.b b10, YggdrasilAuthenticationService yggdrasilAuthenticationService, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, o o2) {
        this.R = new d("server", this, net.minecraft.R.b.R());
        this.w = Lists.newArrayList();
        this.J = new net.minecraft.aq.b();
        this.l = new P();
        this.W = new Random();
        this.i = -1;
        this.q = true;
        m[] arrm = net.minecraft.R.b.U();
        this.k = new long[100];
        this.m = "";
        this.y = "";
        this.I = Queues.newArrayDeque();
        this.j = net.minecraft.R.b.R();
        this.ab = proxy;
        this.v = yggdrasilAuthenticationService;
        this.ac = minecraftSessionService;
        this.a = gameProfileRepository;
        this.o = o2;
        this.h = file;
        this.u = new G(this);
        this.z = this.aq();
        this.U = new g(file, b10);
        this.G = b10;
        if (arrm == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    public String I() {
        return this.Q;
    }

    public abstract boolean J();

    public void a(String string, String string2, long l2, L l3, String string3) {
        block21: {
            net.minecraft.ah.K k2;
            net.minecraft.aw.w w2;
            net.minecraft.aw.b b10;
            m[] arrm;
            block27: {
                net.minecraft.aw.w w3;
                block22: {
                    block23: {
                        block26: {
                            block25: {
                                block24: {
                                    m[] arrm2 = net.minecraft.R.b.U();
                                    this.e(string);
                                    arrm = arrm2;
                                    this.a("menu.loadingLevel");
                                    this.S = new A[3];
                                    this.Z = new long[this.S.length][100];
                                    b10 = this.U.a(string, true);
                                    this.a(this.Z(), b10);
                                    w3 = w2 = b10.c();
                                    if (arrm == null) break block22;
                                    if (w3 != null) break block23;
                                    if (!this.n()) break block24;
                                    k2 = net.minecraft.ah.B.ai;
                                    if (arrm != null) break block25;
                                }
                                k2 = new net.minecraft.ah.K(l2, this.X(), this.j(), this.as(), l3);
                                k2.a(string3);
                                if (arrm == null) break block26;
                                if (this.b) {
                                    k2.g();
                                }
                            }
                            w2 = new net.minecraft.aw.w(k2, string2);
                        }
                        if (arrm != null) break block27;
                    }
                    w3 = w2;
                }
                w3.a(string2);
                k2 = new net.minecraft.ah.K(w2);
            }
            int n2 = 0;
            while (n2 < this.S.length) {
                block35: {
                    int n3;
                    block31: {
                        block34: {
                            block32: {
                                b b11;
                                block33: {
                                    int n4;
                                    block30: {
                                        block29: {
                                            int n5;
                                            block28: {
                                                n3 = 0;
                                                if (arrm == null) break block21;
                                                n4 = n2;
                                                n5 = 1;
                                                if (arrm == null) break block28;
                                                if (n4 == n5) {
                                                    n3 = -1;
                                                }
                                                n4 = n2;
                                                if (arrm == null) break block29;
                                                n5 = 2;
                                            }
                                            if (n4 == n5) {
                                                n3 = 1;
                                            }
                                            n4 = n2;
                                        }
                                        if (arrm == null) break block30;
                                        if (n4 != 0) break block31;
                                        b11 = this;
                                        if (arrm == null) break block32;
                                        n4 = b11.n() ? 1 : 0;
                                    }
                                    if (n4 == 0) break block33;
                                    this.S[n2] = (A)new B(this, b10, w2, n3, this.J).x();
                                    if (arrm != null) break block34;
                                }
                                b11 = this;
                            }
                            b11.S[n2] = (A)new A(this, b10, w2, n3, this.J).x();
                        }
                        this.S[n2].a(k2);
                        if (arrm != null) break block35;
                    }
                    this.S[n2] = (A)new C(this, b10, n3, this.S[0], this.J).x();
                }
                this.S[n2].a(new j(this, this.S[n2]));
                if (arrm != null) {
                    if (!this.av()) {
                        this.S[n2].b().a(this.X());
                    }
                    ++n2;
                }
                if (arrm != null) continue;
            }
            this.T.a(this.S);
            this.a(this.G());
            this.ab();
        }
    }

    public void f(boolean bl2) {
        this.x = bl2;
    }

    public G l() {
        return this.u;
    }

    public void ax() {
        this.O = new Thread((Runnable)this, "Server thread");
        this.O.start();
    }

    @Override
    public boolean d() {
        return Thread.currentThread() == this.O;
    }

    @Override
    public void a(d d10) {
        m[] arrm = net.minecraft.R.b.U();
        d10.a("singleplayer", this.av());
        m[] arrm2 = arrm;
        d d11 = d10;
        String string = "server_brand";
        String string2 = this.am();
        if (arrm2 != null) {
            d11.a(string, string2);
            d11 = d10;
            string = "gui_supported";
            string2 = GraphicsEnvironment.isHeadless() ? "headless" : "supported";
        }
        d11.a(string, string2);
        d10.a("dedicated", this.J());
    }

    public abstract int r();

    public int g() {
        return this.E;
    }

    public boolean n() {
        return this.s;
    }

    @Override
    public String g() {
        return "Server";
    }

    public GameProfileRepository ac() {
        return this.a;
    }

    public File Y() {
        return new File(".");
    }

    public void S() {
        block4: {
            b b10;
            block2: {
                block3: {
                    m[] arrm = net.minecraft.R.b.U();
                    b10 = this;
                    if (arrm == null) break block2;
                    if (!b10.d()) break block3;
                    this.O().j();
                    this.S[0].D().c();
                    this.az().b();
                    this.s().b();
                    this.O().w();
                    if (arrm != null) break block4;
                }
                b10 = this;
            }
            b10.a(this::S);
        }
    }

    public net.minecraft.a.k O() {
        return this.T;
    }

    public boolean ag() {
        return true;
    }

    public void D() {
        this.d = true;
    }

    public boolean av() {
        return this.c != null;
    }

    public void b(boolean bl2) {
        this.K = bl2;
    }

    public void d(boolean bl2) {
        this.X = bl2;
    }

    public void c(boolean bl2) {
        this.b = bl2;
    }

    public static long R() {
        return System.currentTimeMillis();
    }

    public void B() {
        this.q = false;
    }

    public KeyPair i() {
        return this.ad;
    }

    public void a(String string, net.minecraft.aw.b b10) {
        File file = new File(b10.f(), "resources.zip");
        m[] arrm = net.minecraft.R.b.U();
        if (arrm != null && file.isFile()) {
            try {
                this.a("level://" + URLEncoder.encode(string, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                aa.warn("Something went wrong url encoding {}", (Object)string);
            }
        }
    }

    @Override
    public boolean a() {
        return this.S[0].M().c("sendCommandFeedback");
    }

    protected void N() {
        this.n = null;
        this.f = 0;
    }

    public void a(net.minecraft.a.k k2) {
        this.T = k2;
    }

    public void ab() {
        b b10;
        block5: {
            int n2 = 16;
            int n3 = 4;
            int n4 = 192;
            int n5 = 625;
            int n6 = 0;
            this.a("menu.generatingTerrain");
            boolean bl2 = false;
            aa.info("Preparing start region for level 0");
            A a10 = this.S[0];
            n n7 = a10.G();
            m[] arrm = net.minecraft.R.b.U();
            long l2 = net.minecraft.R.b.R();
            int n8 = -192;
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 <= 192) {
                    b10 = this;
                    if (arrm == null || arrm == null) break block5;
                    if (!b10.K()) break block0;
                    int n10 = -192;
                    while (n10 <= 192) {
                        n9 = this.K() ? 1 : 0;
                        if (arrm == null) continue block1;
                        if (n9 == 0) break;
                        long l3 = net.minecraft.R.b.R();
                        if (arrm != null) {
                            if (l3 - l2 > 1000L) {
                                this.a("Preparing spawn area", n6 * 100 / 625);
                                l2 = l3;
                            }
                            ++n6;
                            a10.a().a(n7.e() + n8 >> 4, n7.a() + n10 >> 4);
                            n10 += 16;
                        }
                        if (arrm != null) continue;
                    }
                    n8 += 16;
                    if (arrm != null) continue block0;
                }
                break;
            }
            b10 = this;
        }
        b10.N();
    }

    public boolean a(z z2, n n2, net.minecraft.i.j j2) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void T() {
        m[] arrm = net.minecraft.R.b.U();
        this.J.b("jobs");
        Queue<FutureTask<?>> queue = this.I;
        synchronized (queue) {
            block17: {
                int n2;
                m[] arrm2;
                block16: {
                    int n3;
                    arrm2 = arrm;
                    while (!this.I.isEmpty()) {
                        net.minecraft.ar.T.a(this.I.poll(), aa);
                        if (arrm2 != null) {
                            if (arrm2 != null) continue;
                        }
                        break;
                    }
                    this.J.a("levels");
                    for (n2 = 0; n2 < this.S.length; ++n2) {
                        long l2;
                        block20: {
                            b b10;
                            block21: {
                                block19: {
                                    boolean bl2;
                                    block18: {
                                        l2 = System.nanoTime();
                                        n3 = n2;
                                        if (arrm2 == null) break block16;
                                        if (arrm2 == null) break block18;
                                        if (n3 == 0) break block19;
                                        b10 = this;
                                        if (arrm2 == null) break block20;
                                        bl2 = b10.an();
                                    }
                                    if (!bl2) break block21;
                                }
                                A a10 = this.S[n2];
                                this.J.a(() -> b.lambda$updateTimeLightAndEntities$0(a10));
                                b b11 = this;
                                if (arrm2 != null) {
                                    if (b11.E % 20 == 0) {
                                        this.J.b("timeSync");
                                        this.T.a(new net.minecraft.Q.c(a10.r(), a10.s(), a10.M().c("doDaylightCycle")), a10.D.r().a());
                                        this.J.c();
                                    }
                                    b11 = this;
                                }
                                b11.J.b("tick");
                                try {
                                    a10.L();
                                }
                                catch (Throwable throwable) {
                                    f f10 = net.minecraft.c.f.a(throwable, "Exception ticking world");
                                    a10.a(f10);
                                    throw new Z(f10);
                                }
                                try {
                                    a10.K();
                                }
                                catch (Throwable throwable) {
                                    f f11 = net.minecraft.c.f.a(throwable, "Exception ticking world entities");
                                    a10.a(f11);
                                    throw new Z(f11);
                                }
                                this.J.c();
                                this.J.b("tracker");
                                a10.x().a();
                                this.J.c();
                                this.J.c();
                            }
                            b10 = this;
                        }
                        b10.Z[n2][this.E % 100] = System.nanoTime() - l2;
                        if (arrm2 != null) continue;
                    }
                    this.J.a("connection");
                    this.l().c();
                    this.J.a("players");
                    this.T.c();
                    this.J.a("commandFunctions");
                    this.s().c();
                    this.J.a("tickables");
                    n3 = n2 = 0;
                }
                while (n2 < this.w.size()) {
                    this.w.get(n2).c();
                    ++n2;
                    if (arrm2 != null) {
                        if (arrm2 != null) continue;
                    }
                    break block17;
                }
                this.J.c();
            }
            if (net.minecraft.k.m.d()) return;
            net.minecraft.R.b.b(new m[5]);
            return;
        }
    }

    public void e(String string) {
        m[] arrm = net.minecraft.R.b.U();
        boolean bl2 = this.A().a(string);
        if (arrm != null && bl2) {
            aa.info("Converting map!");
            this.a("menu.convertingLevel");
            bl2 = this.A().a(string, new c(this));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(@Nullable A a10) {
        m[] arrm = net.minecraft.R.b.U();
        A a11 = a10;
        if (arrm != null) {
            if (a11 == null) return 10;
            a11 = a10;
        }
        int n2 = a11.M().b("spawnRadius");
        return n2;
    }

    public void d(String string) {
        this.Q = string;
    }

    public d a() {
        return this.R;
    }

    public boolean ao() {
        return false;
    }

    public String[] at() {
        return this.T.i();
    }

    public String Z() {
        return this.e;
    }

    public Proxy ak() {
        return this.ab;
    }

    protected void a(String string, int n2) {
        this.n = string;
        this.f = n2;
        aa.info("{}: {}%", (Object)string, (Object)n2);
    }

    public abstract s X();

    public aZ s() {
        return this.S[0].w();
    }

    @Nullable
    public synchronized String q() {
        return this.L;
    }

    @Override
    public ListenableFuture<Object> a(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.a(Executors.callable(runnable));
    }

    private static String lambda$updateTimeLightAndEntities$0(A a10) {
        return a10.b().p();
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    public abstract String a(s var1, boolean var2);

    public boolean ah() {
        return this.t;
    }

    public void c(String string) {
        aa.warn(string);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public x a(UUID uUID) {
        A[] arra = this.S;
        m[] arrm = net.minecraft.R.b.U();
        int n2 = arra.length;
        int n3 = 0;
        do {
            if (n3 >= n2) return null;
            A a10 = arra[n3];
            if (arrm == null) continue;
            if (a10 != null) {
                x x2 = a10.a(uUID);
                if (arrm == null) continue;
                if (x2 != null) {
                    return x2;
                }
            }
            ++n3;
        } while (arrm != null);
        return null;
    }

    public P H() {
        return this.l;
    }

    public boolean ai() {
        return this.X;
    }

    public boolean m() {
        return this.Y;
    }

    static net.minecraft.a.k a(b b10) {
        return b10.T;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public List<String> a(J var1_1, String var2_2, @Nullable n var3_3, boolean var4_4) {
        var6_5 = Lists.newArrayList();
        var7_6 = var2_2.startsWith("/");
        var5_7 = net.minecraft.R.b.U();
        v0 = var7_6;
        if (var5_7 != null) {
            if (v0) {
                var2_2 = var2_2.substring(1);
            }
            v0 = var7_6;
        }
        if (var5_7 != null) {
            if (!v0) {
                v0 = var4_4;
                if (var5_7 != null) {
                    if (!v0) {
                        var8_8 = var2_2.split(" ", -1);
                        var9_10 = var8_8[var8_8.length - 1];
                        var10_12 = this.T.i();
                        var11_14 = var10_12.length;
                        var12_16 = 0;
                        do {
                            if (var12_16 >= var11_14) return var6_5;
                            var13_17 = var10_12[var12_16];
                            if (var5_7 == null) continue;
                            if (net.minecraft.E.K.a(var9_10, var13_17)) {
                                var6_5.add(var13_17);
                            }
                            ++var12_16;
                        } while (var5_7 != null);
                        return var6_5;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var2_2.contains(" ");
            }
        }
        if (var5_7 != null) {
            v0 = v0 == false;
        }
        var8_9 = v0;
        v1 = var9_11 = this.z.a(var1_1, var2_2, var3_3);
        if (var5_7 != null) {
            if (v1.isEmpty() != false) return var6_5;
            v1 = var9_11;
        }
        var10_13 = v1.iterator();
        do {
            if (var10_13.hasNext() == false) return var6_5;
            var11_15 = var10_13.next();
            v2 = var8_9;
            if (var5_7 == null) continue;
            if (v2) {
                v2 = var4_4;
                if (var5_7 == null) continue;
                if (!v2) {
                    var6_5.add("/" + var11_15);
                    if (var5_7 != null) continue;
                }
            }
            v2 = var6_5.add(var11_15);
        } while (var5_7 != null);
        return var6_5;
    }

    public ab u() {
        return this.z;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void aw() {
        block15: {
            block16: {
                v0 = net.minecraft.R.b.U();
                net.minecraft.R.b.aa.info("Stopping server");
                var1_1 = v0;
                v1 = this;
                if (var1_1 != null) {
                    if (v1.l() != null) {
                        this.l().b();
                    }
                    v1 = this;
                }
                if (var1_1 != null) {
                    if (v1.T != null) {
                        net.minecraft.R.b.aa.info("Saving players");
                        this.T.j();
                        this.T.r();
                    }
                    v1 = this;
                }
                if (var1_1 == null) break block15;
                if (v1.S == null) break block16;
                net.minecraft.R.b.aa.info("Saving worlds");
                var2_2 = this.S;
                var3_3 = var2_2.length;
                var4_4 = 0;
                while (var4_4 < var3_3) {
                    block17: {
                        var5_5 = var2_2[var4_4];
                        if (var1_1 == null) break block17;
                        v2 = var5_5;
                        if (var1_1 == null) ** GOTO lbl41
                        if (v2 != null) {
                            var5_5.Y = false;
                        }
                        ++var4_4;
                    }
                    if (var1_1 != null) continue;
                }
                this.e(false);
                var2_2 = this.S;
                var3_3 = var2_2.length;
                var4_4 = 0;
                while (var4_4 < var3_3) {
                    block18: {
                        var5_5 = var2_2[var4_4];
                        if (var1_1 == null) return;
                        if (var1_1 == null) break block18;
                        v2 = var5_5;
lbl41:
                        // 2 sources

                        if (v2 != null) {
                            var5_5.d();
                        }
                        ++var4_4;
                    }
                    if (var1_1 != null) continue;
                }
            }
            v1 = this;
        }
        v3 = v1.R;
        if (var1_1 != null) {
            if (v3.e() == false) return;
            v3 = this.R;
        }
        v3.d();
    }

    public abstract net.minecraft.ah.e G();

    public String aj() {
        return this.N;
    }

    public void h(boolean bl2) {
        this.s = bl2;
    }

    public abstract boolean y();

    public boolean ay() {
        return this.h != null;
    }

    public abstract boolean h();

    public void g(boolean bl2) {
        this.t = bl2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    public boolean V() {
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

    public String aa() {
        return this.c;
    }

    public void b(int n2) {
        this.D = n2;
    }

    public boolean K() {
        return this.q;
    }

    public abstract boolean P();

    public void a(KeyPair keyPair) {
        this.ad = keyPair;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public <V> ListenableFuture<V> a(Callable<V> callable) {
        m[] arrm = net.minecraft.R.b.U();
        Validate.notNull(callable);
        m[] arrm2 = arrm;
        b b10 = this;
        if (arrm2 == null) return Futures.immediateFuture((Object)b10);
        if (!b10.d()) {
            b10 = this;
            if (arrm2 == null) return Futures.immediateFuture((Object)b10);
            if (!b10.w()) {
                ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(callable);
                Queue<FutureTask<?>> queue = this.I;
                synchronized (queue) {
                    this.I.add((FutureTask<?>)listenableFutureTask);
                    return listenableFutureTask;
                }
            }
        }
        try {
            b10 = callable.call();
            return Futures.immediateFuture((Object)b10);
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    public abstract boolean f() throws IOException;

    public void b(String string) {
        this.N = string;
    }

    public File f(String string) {
        return new File(this.Y(), string);
    }

    public String t() {
        return this.m;
    }

    public static void b(m[] arrm) {
        r = arrm;
    }

    public abstract boolean M();

    public boolean e() {
        return this.x;
    }

    public boolean w() {
        return this.H;
    }

    @Override
    public void b(d d10) {
        m[] arrm = net.minecraft.R.b.U();
        d10.b("whitelist_enabled", false);
        d10.b("whitelist_count", 0);
        m[] arrm2 = arrm;
        if (arrm2 != null) {
            if (this.T != null) {
                d10.b("players_current", this.al());
                d10.b("players_max", this.W());
                d10.b("players_seen", this.T.l().length);
            }
            d10.b("uses_auth", this.t);
        }
        d10.b("gui_state", this.ao() ? "enabled" : "disabled");
        d10.b("run_time", (net.minecraft.R.b.R() - d10.f()) / 60L * 1000L);
        d10.b("avg_tick_ms", (int)(net.minecraft.k.h.a(this.k) * 1.0E-6));
        int n2 = 0;
        if (arrm2 != null) {
            if (this.S != null) {
                A[] arra = this.S;
                int n3 = arra.length;
                int n4 = 0;
                while (n4 < n3) {
                    A a10 = arra[n4];
                    if (arrm2 != null) {
                        if (arrm2 != null) {
                            if (a10 != null) {
                                net.minecraft.aw.w w2 = a10.b();
                                d10.b("world[" + n2 + "][dimension]", a10.D.r().a());
                                d10.b("world[" + n2 + "][mode]", (Object)w2.g());
                                d10.b("world[" + n2 + "][difficulty]", (Object)a10.g());
                                d10.b("world[" + n2 + "][hardcore]", w2.a());
                                d10.b("world[" + n2 + "][generator_name]", w2.w().b());
                                d10.b("world[" + n2 + "][generator_version]", w2.w().f());
                                d10.b("world[" + n2 + "][height]", this.D);
                                d10.b("world[" + n2 + "][chunks_loaded]", a10.a().c());
                                ++n2;
                            }
                            ++n4;
                        }
                        if (arrm2 != null) continue;
                    }
                    break;
                }
            } else {
                d10.b("worlds", n2);
            }
        }
    }

    public MinecraftSessionService b() {
        return this.ac;
    }

    public void a(boolean bl2) {
        this.Y = bl2;
    }

    public int C() {
        return 256;
    }

    public int v() {
        return 29999984;
    }

    public String k() {
        return "1.12.2";
    }

    public void e(boolean bl2) {
        A[] arra = this.S;
        int n2 = arra.length;
        int n3 = 0;
        m[] arrm = net.minecraft.R.b.U();
        while (n3 < n2) {
            A a10 = arra[n3];
            if (arrm != null) {
                if (a10 != null) {
                    if (!bl2) {
                        aa.info("Saving chunks for level '{}'/{}", (Object)a10.b().p(), (Object)a10.D.r().b());
                    }
                    try {
                        a10.a(true, null);
                    }
                    catch (w w2) {
                        aa.warn(w2.getMessage());
                    }
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
    }

    static {
        aa = LogManager.getLogger();
        B = new File("usercache.json");
        net.minecraft.R.b.b(new m[5]);
    }

    public boolean z() {
        return this.K;
    }

    public int al() {
        return this.T.k();
    }

    public void a(s s2) {
        A[] arra = this.S;
        m[] arrm = net.minecraft.R.b.U();
        for (A a10 : arra) {
            a10.b().a(s2);
            if (arrm != null) continue;
        }
    }

    @Override
    public boolean c() {
        return true;
    }

    public abstract boolean as();

    public GameProfile[] Q() {
        return this.T.e();
    }

    @Override
    public void a(k k2) {
        aa.info(k2.f());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        m[] arrm = net.minecraft.R.b.U();
        try {
            b b10;
            block49: {
                block50: {
                    b10 = this;
                    if (arrm == null) break block49;
                    if (!b10.f()) break block50;
                    this.j = net.minecraft.R.b.R();
                    long l2 = 0L;
                    this.l.a(new net.minecraft.at.g(this.N));
                    this.l.a(new net.minecraft.C.x("1.12.2", 340));
                    this.a(this.l);
                    while (this.q) {
                        block47: {
                            long l3;
                            long l4;
                            long l5;
                            block51: {
                                long l6;
                                block52: {
                                    l5 = net.minecraft.R.b.R();
                                    l4 = l5 - this.j;
                                    if (arrm == null) return;
                                    long l7 = l4 - 2000L;
                                    l3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                    if (arrm == null) break block51;
                                    if (l3 <= 0) break block52;
                                    long l8 = this.j - this.p - 15000L;
                                    l3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                    if (arrm == null) break block51;
                                    if (l3 >= 0) {
                                        aa.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", (Object)l4, (Object)(l4 / 50L));
                                        l4 = 2000L;
                                        this.p = this.j;
                                    }
                                }
                                l3 = (l6 = l4 - 0L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            }
                            if (arrm != null) {
                                if (l3 < 0) {
                                    aa.warn("Time ran backwards! Did the system time change?");
                                    l4 = 0L;
                                }
                                l2 += l4;
                                this.j = l5;
                                l3 = (long)this.S[0].l();
                            }
                            boolean bl2 = true;
                            do {
                                block54: {
                                    long l9;
                                    block53: {
                                        if (!bl2 || (bl2 = false)) break block53;
                                        if (arrm == null) break block54;
                                        if (l3 != false) {
                                            this.ap();
                                            l2 = 0L;
                                            if (arrm != null) break;
                                        }
                                    }
                                    l3 = (l9 = l2 - 50L) == 0L ? 0 : (l9 < 0L ? -1 : 1);
                                }
                                if (l3 <= 0) break;
                                l2 -= 50L;
                                this.ap();
                                if (arrm == null) break block47;
                            } while (arrm != null);
                            Thread.sleep(Math.max(1L, 50L - l2));
                            this.g = true;
                        }
                        if (arrm != null) continue;
                    }
                    if (arrm != null) return;
                }
                b10 = this;
            }
            b10.b((f)null);
            return;
        }
        catch (Throwable throwable) {
            f f10;
            block57: {
                block56: {
                    block55: {
                        aa.error("Encountered an unexpected exception", throwable);
                        f10 = null;
                        f10 = throwable instanceof Z ? this.a(((Z)throwable).a()) : this.a(new f("Exception in server tick loop", throwable));
                        File file = new File(new File(this.Y(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
                        if (arrm == null) break block55;
                        if (!f10.a(file)) break block56;
                        aa.error("This crash report has been saved to: {}", (Object)file.getAbsolutePath());
                    }
                    if (arrm != null) break block57;
                }
                aa.error("We were unable to save this crash report to disk.");
            }
            this.b(f10);
            return;
        }
        finally {
            try {
                this.H = true;
                this.aw();
            }
            catch (Throwable throwable) {
                aa.error("Exception stopping the server", throwable);
            }
            finally {
                this.L();
            }
        }
    }

    public A c(int n2) {
        m[] arrm = net.minecraft.R.b.U();
        int n3 = n2;
        int n4 = -1;
        if (arrm != null) {
            if (n3 == n4) {
                return this.S[1];
            }
            n3 = n2;
            n4 = 1;
        }
        return n3 == n4 ? this.S[2] : this.S[0];
    }

    public String E() {
        return this.y;
    }

    @Override
    public z b() {
        return this.S[0];
    }

    public void b(f f10) {
    }

    public abstract boolean j();
}

