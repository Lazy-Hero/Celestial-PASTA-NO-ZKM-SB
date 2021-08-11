/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  com.google.common.hash.Hashing
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  javax.annotation.Nullable
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.LWJGLException
 *  org.lwjgl.Sys
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.opengl.OpenGLException
 *  org.lwjgl.opengl.PixelFormat
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.minecraft.N.X;
import net.minecraft.N.y;
import net.minecraft.U.A;
import net.minecraft.ah.H;
import net.minecraft.ar.T;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.a7;
import net.minecraft.ar.a9;
import net.minecraft.ar.ah;
import net.minecraft.client.B.n;
import net.minecraft.client.D.a;
import net.minecraft.client.D.i;
import net.minecraft.client.D.l;
import net.minecraft.client.D.o;
import net.minecraft.client.D.q;
import net.minecraft.client.D.t;
import net.minecraft.client.D.u;
import net.minecraft.client.D.w;
import net.minecraft.client.H.d;
import net.minecraft.client.J;
import net.minecraft.client.K;
import net.minecraft.client.L;
import net.minecraft.client.M;
import net.minecraft.client.N;
import net.minecraft.client.P;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.as;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.a.x;
import net.minecraft.client.a.z;
import net.minecraft.client.b.G;
import net.minecraft.client.b.Y;
import net.minecraft.client.b.Z;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aT;
import net.minecraft.client.b.aX;
import net.minecraft.client.b.ae;
import net.minecraft.client.b.av;
import net.minecraft.client.b.aw;
import net.minecraft.client.e.C;
import net.minecraft.client.e.r;
import net.minecraft.client.f.f;
import net.minecraft.client.h.k;
import net.minecraft.client.n.e;
import net.minecraft.client.o.j;
import net.minecraft.client.q.c;
import net.minecraft.client.r.a4;
import net.minecraft.client.v.h;
import net.minecraft.client.y.b;
import net.minecraft.client.z.g;
import net.minecraft.client.z.m;
import net.minecraft.w.aG;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Q
implements net.minecraft.ar.aw,
net.minecraft.aq.c {
    @Nullable
    private /* synthetic */ net.minecraft.C.u r;
    public /* synthetic */ boolean af;
    @Nullable
    private /* synthetic */ net.minecraft.af.c ba;
    private final /* synthetic */ net.minecraft.av.b L;
    private /* synthetic */ boolean ai;
    public /* synthetic */ G n;
    public /* synthetic */ String j;
    public /* synthetic */ net.minecraft.client.E.l e;
    private /* synthetic */ a4 Q;
    @Nullable
    public /* synthetic */ net.minecraft.client.b.L aO;
    private final /* synthetic */ net.minecraft.client.v.o a9;
    private final /* synthetic */ o aE;
    private /* synthetic */ boolean ad;
    public /* synthetic */ gu m;
    private /* synthetic */ net.minecraft.client.j.j K;
    private final /* synthetic */ Thread i;
    private /* synthetic */ l M;
    private final /* synthetic */ String aa;
    private static final /* synthetic */ net.minecraft.ar.v g;
    private final /* synthetic */ String aq;
    private final /* synthetic */ e N;
    public final /* synthetic */ File aJ;
    public /* synthetic */ net.minecraft.client.l.g aw;
    public /* synthetic */ gu aY;
    /* synthetic */ long aD;
    private /* synthetic */ boolean E;
    public /* synthetic */ f ag;
    @Nullable
    private /* synthetic */ net.minecraft.U.x aG;
    private /* synthetic */ float t;
    public /* synthetic */ int aT;
    public static /* synthetic */ byte[] ap;
    private final /* synthetic */ net.minecraft.client.B.m D;
    public /* synthetic */ net.minecraft.k.i ao;
    private /* synthetic */ boolean w;
    public static /* synthetic */ double o;
    private final /* synthetic */ int C;
    private /* synthetic */ w S;
    private final /* synthetic */ File ae;
    public /* synthetic */ a5 ah;
    public final /* synthetic */ net.minecraft.aq.b an;
    public /* synthetic */ ah a8;
    public static final /* synthetic */ boolean I;
    private final /* synthetic */ File v;
    private final /* synthetic */ boolean ay = true;
    private /* synthetic */ net.minecraft.ar.v R;
    private final /* synthetic */ boolean aM;
    private /* synthetic */ net.minecraft.client.s.b aH;
    public /* synthetic */ gu a;
    private /* synthetic */ long aZ;
    /* synthetic */ long aX;
    public /* synthetic */ gu a1;
    private static /* synthetic */ net.minecraft.k.m[] az;
    private final /* synthetic */ int aj;
    public /* synthetic */ gu d;
    private static /* synthetic */ Q y;
    public /* synthetic */ gu aK;
    public /* synthetic */ gu O;
    private /* synthetic */ int X;
    public /* synthetic */ a5 a6;
    private static final /* synthetic */ List<DisplayMode> J;
    public /* synthetic */ gu b;
    public /* synthetic */ int U;
    private static final /* synthetic */ Logger ak;
    private /* synthetic */ net.minecraft.c.f a_;
    public final /* synthetic */ net.minecraft.ar.c aN;
    private final /* synthetic */ PropertyMap aR;
    private final /* synthetic */ d H;
    public /* synthetic */ boolean a4;
    public /* synthetic */ net.minecraft.client.u.C au;
    public /* synthetic */ net.minecraft.ar.k l;
    public /* synthetic */ int P;
    private final /* synthetic */ List<a> x;
    public /* synthetic */ net.minecraft.ar.A V;
    private /* synthetic */ long F;
    private /* synthetic */ p T;
    private final /* synthetic */ Queue<FutureTask<?>> aF;
    private /* synthetic */ boolean a3;
    private /* synthetic */ String a5;
    private static /* synthetic */ int aI;
    private /* synthetic */ boolean Z;
    public volatile /* synthetic */ boolean aU;
    public /* synthetic */ gu ax;
    private /* synthetic */ float c;
    private /* synthetic */ g av;
    /* synthetic */ long h;
    public /* synthetic */ net.minecraft.U.x W;
    private /* synthetic */ z as;
    public /* synthetic */ net.minecraft.client.l.c ac;
    private final /* synthetic */ Proxy a7;
    private /* synthetic */ String a0;
    private /* synthetic */ net.minecraft.client.D.p aB;
    public /* synthetic */ c s;
    public /* synthetic */ aF a2;
    private /* synthetic */ int G;
    private /* synthetic */ m aV;
    public /* synthetic */ gu A;
    private final /* synthetic */ net.minecraft.aq.d aA;
    private /* synthetic */ net.minecraft.client.a.d aL;
    public /* synthetic */ boolean u;
    public /* synthetic */ net.minecraft.client.E.h aW;
    private /* synthetic */ int at;
    private /* synthetic */ net.minecraft.client.D.f aS;
    public /* synthetic */ L ar;
    public /* synthetic */ gu aC;
    private /* synthetic */ r aQ;
    private /* synthetic */ net.minecraft.aw.z k;
    public /* synthetic */ gu f;
    public /* synthetic */ net.minecraft.client.j.u am;
    private final /* synthetic */ MinecraftSessionService al;
    private final /* synthetic */ boolean aP;
    private /* synthetic */ C B;
    private /* synthetic */ net.minecraft.client.E.a p;
    public /* synthetic */ x Y;
    private final /* synthetic */ PropertyMap ab;
    public /* synthetic */ gu z;
    public /* synthetic */ gu q;

    public void B() {
        this.am();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1) {
        block9: {
            block8: {
                v0 = net.minecraft.client.Q.ag();
                this.e.t();
                this.e.e();
                var3_2 = 0;
                var2_3 = v0;
                var4_4 = null;
                v1 = this.s;
                if (var2_3 == null) break block8;
                if (v1 == null) break block9;
                var3_2 = this.s.W();
                this.e.c(this.s);
                v1 = this.s;
            }
            var4_4 = v1.x();
        }
        this.aG = null;
        var5_5 = this.s;
        v2 = this.s;
        if (var2_3 == null) ** GOTO lbl24
        if (v2 == null) {
            v3 = new net.minecraft.l.g();
        } else {
            v2 = this.s;
lbl24:
            // 2 sources

            v3 = v2.a();
        }
        v4 = this.s;
        if (var2_3 == null) ** GOTO lbl31
        if (v4 == null) {
            v5 = new net.minecraft.l.i();
        } else {
            v4 = this.s;
lbl31:
            // 2 sources

            v5 = v4.G();
        }
        this.s = this.aW.a(this.e, v3, v5);
        this.s.E().a(var5_5.E().f());
        this.s.p = var1_1;
        this.aG = this.s;
        this.s.L();
        this.s.c(var4_4);
        this.e.f(this.s);
        this.aW.c(this.s);
        this.s.c4 = new a9(this.ac);
        this.s.g(var3_2);
        this.aW.a(this.s);
        this.s.a(var5_5.U());
        v6 = this;
        if (var2_3 != null) {
            if (v6.aO instanceof Y == false) return;
            v6 = this;
        }
        v6.a((net.minecraft.client.b.L)null);
    }

    private void k() {
        block36: {
            int n2;
            block71: {
                int n3;
                net.minecraft.k.m[] arrm;
                block70: {
                    block68: {
                        block69: {
                            Object object;
                            Object object2;
                            y y2;
                            int n4;
                            block63: {
                                block66: {
                                    net.minecraft.k.i i2;
                                    block67: {
                                        net.minecraft.k.j j2;
                                        net.minecraft.k.j j3;
                                        block64: {
                                            block65: {
                                                block41: {
                                                    net.minecraft.U.x x2;
                                                    block61: {
                                                        block62: {
                                                            int n5;
                                                            block59: {
                                                                block60: {
                                                                    block57: {
                                                                        block58: {
                                                                            block55: {
                                                                                block56: {
                                                                                    Object object3;
                                                                                    block51: {
                                                                                        block52: {
                                                                                            block53: {
                                                                                                Object object4;
                                                                                                block54: {
                                                                                                    block49: {
                                                                                                        block50: {
                                                                                                            block47: {
                                                                                                                block48: {
                                                                                                                    block45: {
                                                                                                                        block46: {
                                                                                                                            block44: {
                                                                                                                                net.minecraft.k.i i3;
                                                                                                                                block43: {
                                                                                                                                    net.minecraft.k.j j4;
                                                                                                                                    net.minecraft.k.j j5;
                                                                                                                                    block38: {
                                                                                                                                        block39: {
                                                                                                                                            int n6;
                                                                                                                                            block42: {
                                                                                                                                                net.minecraft.W.K k2;
                                                                                                                                                block40: {
                                                                                                                                                    Q q2;
                                                                                                                                                    block37: {
                                                                                                                                                        net.minecraft.k.i i4;
                                                                                                                                                        block35: {
                                                                                                                                                            arrm = net.minecraft.client.Q.ag();
                                                                                                                                                            i4 = this.ao;
                                                                                                                                                            if (arrm == null) break block35;
                                                                                                                                                            if (i4 == null) break block36;
                                                                                                                                                            q2 = this;
                                                                                                                                                            if (arrm == null) break block37;
                                                                                                                                                            i4 = q2.ao;
                                                                                                                                                        }
                                                                                                                                                        if (i4.d == net.minecraft.k.j.MISS) break block36;
                                                                                                                                                        q2 = this;
                                                                                                                                                    }
                                                                                                                                                    n4 = q2.s.cw.g;
                                                                                                                                                    y2 = null;
                                                                                                                                                    net.minecraft.k.j j4 = this.ao.d;
                                                                                                                                                    j4 = net.minecraft.k.j.BLOCK;
                                                                                                                                                    if (arrm == null) break block38;
                                                                                                                                                    if (j5 != j4) break block39;
                                                                                                                                                    object2 = this.ao.a();
                                                                                                                                                    object3 = this.e.d((net.minecraft.k.n)object2);
                                                                                                                                                    k2 = object3.b();
                                                                                                                                                    if (object3.o() == net.minecraft.ac.c.A) {
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    object = k2.c(this.e, (net.minecraft.k.n)object2, (net.minecraft.Z.i)object3);
                                                                                                                                                    n6 = ((net.minecraft.w.d)object).G();
                                                                                                                                                    if (arrm != null) {
                                                                                                                                                        if (n6 != 0) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        n6 = n4;
                                                                                                                                                    }
                                                                                                                                                    if (arrm == null) break block40;
                                                                                                                                                    if (n6 == 0) break block41;
                                                                                                                                                    n6 = net.minecraft.client.b.L.q();
                                                                                                                                                }
                                                                                                                                                if (arrm == null) break block42;
                                                                                                                                                if (n6 == 0) break block41;
                                                                                                                                                n6 = k2.e();
                                                                                                                                            }
                                                                                                                                            if (n6 != 0) {
                                                                                                                                                y2 = this.e.b((net.minecraft.k.n)object2);
                                                                                                                                            }
                                                                                                                                            break block41;
                                                                                                                                        }
                                                                                                                                        i3 = this.ao;
                                                                                                                                        if (arrm == null) break block43;
                                                                                                                                        net.minecraft.k.j j4 = i3.d;
                                                                                                                                        j4 = net.minecraft.k.j.ENTITY;
                                                                                                                                    }
                                                                                                                                    if (j5 != j4) break block44;
                                                                                                                                    i3 = this.ao;
                                                                                                                                }
                                                                                                                                if (i3.e == null) break block44;
                                                                                                                                n5 = n4;
                                                                                                                                if (arrm == null) break block45;
                                                                                                                                if (n5 != 0) break block46;
                                                                                                                            }
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        n5 = this.ao.e instanceof net.minecraft.J.m;
                                                                                                                    }
                                                                                                                    if (arrm == null) break block47;
                                                                                                                    if (n5 == 0) break block48;
                                                                                                                    object = new net.minecraft.w.d(net.minecraft.u.h.aR);
                                                                                                                    if (arrm != null) break block41;
                                                                                                                }
                                                                                                                n5 = this.ao.e instanceof A;
                                                                                                            }
                                                                                                            if (arrm == null) break block49;
                                                                                                            if (n5 == 0) break block50;
                                                                                                            object = new net.minecraft.w.d(net.minecraft.u.h.G);
                                                                                                            if (arrm != null) break block41;
                                                                                                        }
                                                                                                        n5 = this.ao.e instanceof net.minecraft.J.l;
                                                                                                    }
                                                                                                    if (arrm == null) break block51;
                                                                                                    if (n5 == 0) break block52;
                                                                                                    object2 = (net.minecraft.J.l)this.ao.e;
                                                                                                    object4 = object3 = ((net.minecraft.J.l)object2).b();
                                                                                                    if (arrm == null) break block53;
                                                                                                    if (!((net.minecraft.w.d)object4).G()) break block54;
                                                                                                    object = new net.minecraft.w.d(net.minecraft.u.h.L);
                                                                                                    if (arrm != null) break block53;
                                                                                                }
                                                                                                object4 = object = ((net.minecraft.w.d)object3).C();
                                                                                            }
                                                                                            if (arrm != null) break block41;
                                                                                        }
                                                                                        n5 = this.ao.e instanceof net.minecraft.J.u;
                                                                                    }
                                                                                    if (arrm == null) break block55;
                                                                                    if (n5 == 0) break block56;
                                                                                    object2 = (net.minecraft.J.u)this.ao.e;
                                                                                    switch (((net.minecraft.J.u)object2).o()) {
                                                                                        case FURNACE: {
                                                                                            object3 = net.minecraft.u.h.aE;
                                                                                            if (arrm != null) break;
                                                                                        }
                                                                                        case CHEST: {
                                                                                            object3 = net.minecraft.u.h.aq;
                                                                                            if (arrm != null) break;
                                                                                        }
                                                                                        case TNT: {
                                                                                            object3 = net.minecraft.u.h.l;
                                                                                            if (arrm != null) break;
                                                                                        }
                                                                                        case HOPPER: {
                                                                                            object3 = net.minecraft.u.h.at;
                                                                                            if (arrm != null) break;
                                                                                        }
                                                                                        case COMMAND_BLOCK: {
                                                                                            object3 = net.minecraft.u.h.aJ;
                                                                                            if (arrm != null) break;
                                                                                        }
                                                                                        default: {
                                                                                            object3 = net.minecraft.u.h.q;
                                                                                        }
                                                                                    }
                                                                                    object = new net.minecraft.w.d((net.minecraft.w.k)object3);
                                                                                    if (arrm != null) break block41;
                                                                                }
                                                                                n5 = this.ao.e instanceof net.minecraft.J.o;
                                                                            }
                                                                            if (arrm == null) break block57;
                                                                            if (n5 == 0) break block58;
                                                                            object = new net.minecraft.w.d(((net.minecraft.J.o)this.ao.e).d());
                                                                            if (arrm != null) break block41;
                                                                        }
                                                                        n5 = this.ao.e instanceof net.minecraft.J.n;
                                                                    }
                                                                    if (arrm == null) break block59;
                                                                    if (n5 == 0) break block60;
                                                                    object = new net.minecraft.w.d(net.minecraft.u.h.d);
                                                                    if (arrm != null) break block41;
                                                                }
                                                                x2 = this.ao.e;
                                                                if (arrm == null) break block61;
                                                                n5 = x2 instanceof net.minecraft.J.p;
                                                            }
                                                            if (n5 == 0) break block62;
                                                            object = new net.minecraft.w.d(net.minecraft.u.h.cc);
                                                            if (arrm != null) break block41;
                                                        }
                                                        x2 = this.ao.e;
                                                    }
                                                    if ((object2 = net.minecraft.U.h.a(x2)) == null || !net.minecraft.U.h.g.containsKey(object2)) {
                                                        return;
                                                    }
                                                    object = new net.minecraft.w.d(net.minecraft.u.h.bn);
                                                    net.minecraft.w.aG.a((net.minecraft.w.d)object, (net.minecraft.ar.v)object2);
                                                }
                                                if (!((net.minecraft.w.d)object).G()) break block63;
                                                object2 = "";
                                                net.minecraft.k.j j2 = this.ao.d;
                                                j2 = net.minecraft.k.j.BLOCK;
                                                if (arrm == null) break block64;
                                                if (j3 != j2) break block65;
                                                object2 = net.minecraft.W.K.h.b(this.e.d(this.ao.a()).b()).toString();
                                                if (arrm != null) break block66;
                                            }
                                            i2 = this.ao;
                                            if (arrm == null) break block67;
                                            net.minecraft.k.j j2 = i2.d;
                                            j2 = net.minecraft.k.j.ENTITY;
                                        }
                                        if (j3 != j2) break block66;
                                        i2 = this.ao;
                                    }
                                    object2 = net.minecraft.U.h.a(i2.e).toString();
                                }
                                ak.warn("Picking on: [{}] {} gave null item", (Object)this.ao.d, object2);
                                if (arrm != null) break block36;
                            }
                            object2 = this.s.cB;
                            if (y2 != null) {
                                this.a((net.minecraft.w.d)object, y2);
                            }
                            n2 = ((net.minecraft.i.h)object2).g((net.minecraft.w.d)object);
                            n3 = n4;
                            if (arrm == null) break block68;
                            if (n3 == 0) break block69;
                            ((net.minecraft.i.h)object2).a((net.minecraft.w.d)object);
                            this.aW.a(this.s.c(net.minecraft.ar.a3.MAIN_HAND), 36 + ((net.minecraft.i.h)object2).a);
                            if (arrm != null) break block36;
                        }
                        n3 = n2;
                    }
                    if (arrm == null) break block70;
                    if (n3 == -1) break block36;
                    n3 = net.minecraft.i.h.d(n2) ? 1 : 0;
                }
                if (n3 == 0) break block71;
                ((net.minecraft.i.h)object2).a = n2;
                if (arrm != null) break block36;
            }
            this.aW.a(n2);
        }
    }

    public void b(net.minecraft.c.f f10) {
        this.w = true;
        this.a_ = f10;
    }

    @Override
    public boolean d() {
        return Thread.currentThread() == this.i;
    }

    public void aq() {
        this.j();
    }

    public void as() {
        block3: {
            Q q2;
            block2: {
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                q2 = this;
                if (arrm == null) break block2;
                if (!q2.af) break block3;
                this.af = false;
                q2 = this;
            }
            q2.V.c();
        }
    }

    public net.minecraft.client.j.j an() {
        return this.K;
    }

    public w aa() {
        return this.S;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void af() {
        block8: {
            var2_1 = Lists.newArrayList(this.x);
            var1_2 = net.minecraft.client.Q.ag();
            v0 = this;
            if (var1_2 != null) {
                if (v0.ba != null) {
                    this.ba.S();
                }
                v0 = this;
            }
            for (i var4_5 : v0.S.b()) {
                var2_1.add(var4_5.e());
                if (var1_2 != null) {
                    if (var1_2 != null) continue;
                }
                break block8;
            }
            v1 = this;
            if (var1_2 == null) ** GOTO lbl21
            if (v1.S.a() != null) {
                var2_1.add(this.S.a());
            }
            try {
                v1 = this;
lbl21:
                // 2 sources

                v1.aS.a(var2_1);
            }
            catch (RuntimeException var3_4) {
                net.minecraft.client.Q.ak.info("Caught error stitching, removing all assigned resourcepacks", (Throwable)var3_4);
                var2_1.clear();
                var2_1.addAll(this.x);
                this.S.a(Collections.emptyList());
                this.aS.a(var2_1);
                this.ac.bJ.clear();
                this.ac.T.clear();
                this.ac.e();
            }
        }
        this.M.a(var2_1);
        v2 = this.a2;
        if (var1_2 != null) {
            if (v2 == null) return;
            v2 = this.a2;
        }
        v2.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lambda$addGraphicsAndWorldToCrashReport$15() throws Exception {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        net.minecraft.aq.b b10 = this.an;
        if (arrm != null) {
            if (!b10.g) return "N/A (disabled)";
            b10 = this.an;
        }
        String string = b10.e();
        return string;
    }

    public void t() {
        this.ad();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public j ar() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        c c10 = this.s;
        if (arrm != null) {
            if (c10 == null) {
                return null;
            }
            c10 = this.s;
        }
        j j2 = c10.c9;
        return j2;
    }

    public z X() {
        return this.as;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <V> ListenableFuture<V> a(Callable<V> callable) {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Callable<V> callable2 = callable;
        if (arrm != null) {
            Validate.notNull(callable2);
            if (this.d()) {
                try {
                    return Futures.immediateFuture(callable.call());
                }
                catch (Exception exception) {
                    return Futures.immediateFailedCheckedFuture((Exception)exception);
                }
            }
            callable2 = callable;
        }
        ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(callable2);
        Queue<FutureTask<?>> queue = this.aF;
        synchronized (queue) {
            this.aF.add((FutureTask<?>)listenableFutureTask);
            return listenableFutureTask;
        }
    }

    public t O() {
        return this.aS;
    }

    public C p() {
        return this.B;
    }

    public static long aj() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }

    /*
     * Exception decompiling
     */
    private void C() throws IOException {
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

    private String lambda$addGraphicsAndWorldToCrashReport$8() throws Exception {
        return this.aq;
    }

    public PropertyMap J() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        PropertyMap propertyMap = this.ab;
        if (arrm != null) {
            if (propertyMap.isEmpty()) {
                GameProfile gameProfile = this.w().fillProfileProperties(this.l.c(), false);
                this.ab.putAll((Multimap)gameProfile.getProperties());
            }
            propertyMap = this.ab;
        }
        return propertyMap;
    }

    private void b() {
        this.a9.a(new net.minecraft.client.v.f(), net.minecraft.client.v.q.class);
        this.a9.a(new net.minecraft.client.v.c(), net.minecraft.client.v.p.class);
        this.a9.a(new net.minecraft.client.v.b(), h.class);
        this.a9.a(new net.minecraft.client.v.e(), net.minecraft.client.v.m.class);
        this.a9.a(new net.minecraft.client.v.d(), net.minecraft.client.v.j.class);
    }

    public void am() {
        this.ax();
    }

    public void al() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        try {
            block21: {
                Q q2;
                block19: {
                    block20: {
                        block18: {
                            int n2;
                            block17: {
                                block16: {
                                    block14: {
                                        Q q3;
                                        block15: {
                                            boolean bl2 = this.Z;
                                            if (arrm != null) {
                                                bl2 = !bl2;
                                            }
                                            this.ac.b5 = this.Z = bl2;
                                            q3 = this;
                                            if (arrm == null) break block14;
                                            if (!q3.Z) break block15;
                                            this.z();
                                            this.P = Display.getDisplayMode().getWidth();
                                            this.aT = Display.getDisplayMode().getHeight();
                                            if (arrm != null) break block16;
                                        }
                                        Display.setDisplayMode((DisplayMode)new DisplayMode(this.C, this.aj));
                                        this.P = this.C;
                                        q3 = this;
                                    }
                                    q3.aT = this.aj;
                                }
                                n2 = this.P;
                                if (arrm == null) break block17;
                                if (n2 <= 0) {
                                    this.P = 1;
                                }
                                q2 = this;
                                if (arrm == null) break block18;
                                n2 = q2.aT;
                            }
                            if (n2 <= 0) {
                                this.aT = 1;
                            }
                            q2 = this;
                        }
                        if (arrm == null) break block19;
                        if (q2.aO == null) break block20;
                        this.a(this.P, this.aT);
                        if (arrm != null) break block21;
                    }
                    q2 = this;
                }
                q2.H();
            }
            Display.setFullscreen((boolean)this.Z);
            Display.setVSyncEnabled((boolean)this.ac.br);
            this.aH();
        }
        catch (Exception exception) {
            ak.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    public void a(net.minecraft.U.x x2) {
        this.aG = x2;
        this.Y.a(x2);
    }

    public net.minecraft.ar.k aR() {
        return this.l;
    }

    public void V() {
        block5: {
            net.minecraft.client.b.L l2;
            block19: {
                boolean bl2;
                block18: {
                    net.minecraft.k.m[] arrm;
                    block15: {
                        block16: {
                            net.minecraft.client.b.L l3;
                            block17: {
                                int n2;
                                block14: {
                                    int n3;
                                    block12: {
                                        int n4;
                                        block13: {
                                            block10: {
                                                block11: {
                                                    block9: {
                                                        block7: {
                                                            block8: {
                                                                block6: {
                                                                    block4: {
                                                                        arrm = net.minecraft.client.Q.ag();
                                                                        int n5 = Keyboard.getEventKey();
                                                                        if (arrm != null) {
                                                                            n5 = n5 == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
                                                                        }
                                                                        n2 = n4 = n5;
                                                                        if (arrm == null) break block4;
                                                                        if (n2 == 0) break block5;
                                                                        n2 = Keyboard.isRepeatEvent() ? 1 : 0;
                                                                    }
                                                                    if (arrm == null) break block6;
                                                                    if (n2 != 0) break block5;
                                                                    n2 = this.aO instanceof net.minecraft.client.b.P;
                                                                }
                                                                if (arrm == null) break block7;
                                                                if (n2 == 0) break block8;
                                                                long l4 = ((net.minecraft.client.b.P)this.aO).y - (net.minecraft.client.Q.aj() - 20L);
                                                                n2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                                if (arrm == null) break block7;
                                                                if (n2 > 0) break block5;
                                                            }
                                                            n2 = Keyboard.getEventKeyState() ? 1 : 0;
                                                        }
                                                        if (arrm == null) break block9;
                                                        if (n2 == 0) break block5;
                                                        n2 = n4;
                                                    }
                                                    n3 = this.ac.Q.e();
                                                    if (arrm == null) break block10;
                                                    if (n2 != n3) break block11;
                                                    this.al();
                                                    if (arrm != null) break block5;
                                                }
                                                n2 = n4;
                                                n3 = this.ac.b4.e();
                                            }
                                            if (arrm == null) break block12;
                                            if (n2 != n3) break block13;
                                            this.n.f().a(net.minecraft.ar.aT.a(this.aJ, this.P, this.aT, this.aH));
                                            if (arrm != null) break block5;
                                        }
                                        n2 = n4;
                                        if (arrm == null) break block14;
                                        n3 = 48;
                                    }
                                    if (n2 != n3) break block5;
                                    n2 = net.minecraft.client.b.L.q() ? 1 : 0;
                                }
                                if (n2 == 0) break block5;
                                l2 = this.aO;
                                if (arrm == null) break block15;
                                if (l2 == null) break block16;
                                l3 = this.aO;
                                if (arrm == null) break block17;
                                if (l3 == null) break block5;
                                l3 = this.aO;
                            }
                            bl2 = l3.p();
                            if (arrm == null) break block18;
                            if (bl2) break block5;
                        }
                        this.ac.b(net.minecraft.client.l.f.NARRATOR, 1);
                        l2 = this.aO;
                    }
                    if (arrm == null) break block19;
                    bl2 = l2 instanceof aT;
                }
                if (!bl2) break block5;
                l2 = this.aO;
            }
            ((aT)l2).a();
        }
    }

    public boolean M() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        float f10 = (float)this.L() - net.minecraft.client.l.f.FRAMERATE_LIMIT.a();
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrm != null) {
            f11 = f11 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    public p Y() {
        return this.T;
    }

    private void D() {
        net.minecraft.client.B.e<net.minecraft.w.d> e10;
        block2: {
            e10 = new net.minecraft.client.B.e<net.minecraft.w.d>(Q::lambda$func_193986_ar$1, Q::lambda$func_193986_ar$2);
            net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
            a2<net.minecraft.w.d> a22 = net.minecraft.ar.a2.a();
            for (net.minecraft.w.k k2 : net.minecraft.w.k.q) {
                k2.a(net.minecraft.ad.a.b, a22);
                if (arrm != null) {
                    if (arrm != null) continue;
                    break;
                }
                break block2;
            }
            a22.forEach(e10::b);
        }
        net.minecraft.client.B.e<k> e11 = new net.minecraft.client.B.e<k>(Q::lambda$func_193986_ar$5, Q::lambda$func_193986_ar$7);
        net.minecraft.client.B.j.f.forEach(e11::b);
        this.D.a(net.minecraft.client.B.m.b, e10);
        this.D.a(net.minecraft.client.B.m.c, e11);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(net.minecraft.client.j.u u2) throws LWJGLException {
        net.minecraft.client.b.l l2 = new net.minecraft.client.b.l(this);
        int n2 = net.minecraft.client.b.l.c();
        net.minecraft.client.s.b b10 = new net.minecraft.client.s.b(l2.e() * n2, l2.a() * n2, true);
        b10.a(false);
        net.minecraft.client.a.v.q(5889);
        net.minecraft.client.a.v.l();
        net.minecraft.client.a.v.a(0.0, l2.e(), l2.a(), 0.0, 1000.0, 3000.0);
        net.minecraft.client.a.v.q(5888);
        net.minecraft.client.a.v.l();
        net.minecraft.client.a.v.b(0.0f, 0.0f, -2000.0f);
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.C();
        net.minecraft.client.a.v.n();
        net.minecraft.client.a.v.x();
        InputStream inputStream = null;
        try {
            inputStream = this.aE.a(g);
            this.R = u2.a("logo", new net.minecraft.client.j.f(ImageIO.read(inputStream)));
            u2.b(this.R);
        }
        catch (IOException iOException) {
            try {
                ak.error("Unable to load logo: {}", (Object)g, (Object)iOException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        W w2 = net.minecraft.client.a.W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.t);
        i2.c(0.0, (double)this.aT, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        i2.c((double)this.P, (double)this.aT, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        i2.c((double)this.P, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        i2.c(0.0, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        w2.a();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = 256;
        int n4 = 256;
        this.a((l2.e() - 256) / 2, (l2.a() - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.C();
        b10.a();
        b10.b(l2.e() * n2, l2.a() * n2);
        net.minecraft.client.a.v.e();
        net.minecraft.client.a.v.a(516, 0.1f);
        this.aH();
    }

    public static net.minecraft.k.m[] ag() {
        return az;
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$9() throws Exception {
        return net.minecraft.client.a.v.c(7937) + " GL version " + net.minecraft.client.a.v.c(7938) + ", " + net.minecraft.client.a.v.c(7936);
    }

    private static net.minecraft.ar.v lambda$null$6(net.minecraft.az.k k2) {
        return net.minecraft.w.k.q.b(k2.d().w());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Q q2 = this;
        if (arrm != null) {
            if (!q2.ad) return false;
            q2 = this;
        }
        if (q2.ba == null) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a() throws Exception {
        block12: {
            block11: {
                block9: {
                    block10: {
                        v0 = net.minecraft.client.Q.ag();
                        Sys.openURL((String)"https://vk.com/celestialclient");
                        Sys.openURL((String)"https://discord.gg/WaSbB4JQfp");
                        var1_1 = v0;
                        JOptionPane.showMessageDialog(null, "\u041f\u043e\u0434\u043f\u0438\u0448\u0438\u0441\u044c \u043d\u0430 \u0433\u0440\u0443\u043f\u043f\u0443 \u0447\u0442\u043e \u0431\u044b \u0443\u0431\u0440\u0430\u0442\u044c \u044d\u0442\u043e \u043e\u043a\u043d\u043e! :) \u0422\u0430\u043a \u0436\u0435 \u043c\u044b \u0432\u044b\u0434\u0430\u0435\u043c \u043f\u0440\u0435\u043c\u0438\u0443\u043c \u0432\u0435\u0440\u0441\u0438\u044e \u0447\u0438\u0442\u0430 \u0437\u0430 \u0440\u043e\u043b\u0438\u043a \u043d\u0430 \u044e\u0442\u0443\u0431\u0435!");
                        this.ac = new net.minecraft.client.l.c(this, this.aJ);
                        this.aw = new net.minecraft.client.l.g(this, this.aJ);
                        this.x.add(this.aE);
                        this.d();
                        v1 = this.ac;
                        if (var1_1 == null) break block9;
                        if (v1.g <= 0) break block10;
                        v1 = this.ac;
                        if (var1_1 == null) break block9;
                        if (v1.a2 > 0) {
                            this.P = this.ac.a2;
                            this.aT = this.ac.g;
                        }
                    }
                    this.f();
                    this.R();
                    this.u();
                    net.minecraft.client.a.as.a();
                    this.aH = new net.minecraft.client.s.b(this.P, this.aT, true);
                    this.aH.a(0.0f, 0.0f, 0.0f, 0.0f);
                    this.b();
                    this.S = new w(this.v, new File(this.aJ, "server-resource-packs"), this.aE, this.a9, this.ac);
                    this.aS = new u(this.a9);
                    this.M = new l(this.a9, this.ac.bM);
                    this.aS.a(this.M);
                    this.af();
                    this.am = new net.minecraft.client.j.u(this.aS);
                    this.aS.a(this.am);
                    this.a(this.am);
                    this.aB = new net.minecraft.client.D.p(this.am, new File(this.ae, "skins"), this.al);
                    this.k = new net.minecraft.t.g(new File(this.aJ, "saves"), this.L);
                    this.B = new C(this.aS, this.ac);
                    this.aS.a(this.B);
                    this.aQ = new r(this);
                    this.a6 = new a5(this.ac, new net.minecraft.ar.v("textures/font/ascii.png"), this.am, false);
                    this.f = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/comfortaa.ttf"), 19.0f, 0), true, true);
                    this.z = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/sf-ui.ttf"), 48.0f, 0), true, true);
                    this.aC = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/sf-ui.ttf"), 16.5f, 0), true, true);
                    this.d = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/notification.ttf"), 45.0f, 0), true, true);
                    this.aK = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/sf-ui.ttf"), 14.0f, 0), true, true);
                    this.ax = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/sf-ui.ttf"), 18.0f, 0), true, true);
                    this.O = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/quicksand.ttf"), 28.0f, 0), true, true);
                    this.aY = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/quicksand.ttf"), 35.0f, 0), true, true);
                    this.a1 = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/quicksand.ttf"), 20.0f, 0), true, true);
                    this.q = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/verdana.ttf"), 19.0f, 0), true, true);
                    this.A = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/roboto-light.ttf"), 19.0f, 0), true, true);
                    this.m = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/robotoregular.ttf"), 19.0f, 0), true, true);
                    this.a = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/lato.ttf"), 19.0f, 0), true, true);
                    this.b = new gu(aZ.a(new net.minecraft.ar.v("celestial/font/lato.ttf"), 25.0f, 0), true, true);
                    v2 = this;
                    if (var1_1 == null) break block11;
                    v1 = v2.ac;
                }
                if (v1.bM != null) {
                    this.a6.a(this.ap());
                    this.a6.b(this.M.a());
                }
                this.ah = new a5(this.ac, new net.minecraft.ar.v("textures/font/ascii_sga.png"), this.am, false);
                this.aS.a(this.a6);
                this.aS.a(this.ah);
                this.aS.a(new q());
                this.aS.a(new net.minecraft.client.D.I());
                this.V = new net.minecraft.ar.A();
                this.a("Pre startup");
                net.minecraft.client.a.v.x();
                net.minecraft.client.a.v.g(7425);
                net.minecraft.client.a.v.a(1.0);
                net.minecraft.client.a.v.t();
                net.minecraft.client.a.v.o(515);
                net.minecraft.client.a.v.e();
                net.minecraft.client.a.v.a(516, 0.1f);
                net.minecraft.client.a.v.a(net.minecraft.client.a.ad.BACK);
                net.minecraft.client.a.v.q(5889);
                net.minecraft.client.a.v.l();
                net.minecraft.client.a.v.q(5888);
                this.a("Startup");
                this.K = new net.minecraft.client.j.j("textures");
                this.K.a(this.ac.c);
                this.am.a(net.minecraft.client.j.j.x, this.K);
                this.am.b(net.minecraft.client.j.j.x);
                v2 = this;
            }
            v3 = this.ac.c;
            if (var1_1 != null) {
                v3 = v3 > false;
            }
            v2.K.b(false, v3);
            var2_2 = new net.minecraft.client.x.x(this.K);
            this.aS.a(var2_2);
            this.aV = net.minecraft.client.z.m.c();
            this.av = net.minecraft.client.z.g.a(this.aV);
            this.T = new p(this.am, var2_2, this.av);
            this.Q = new a4(this.am, this.T);
            this.as = new z(this);
            this.aS.a(this.T);
            this.Y = new x(this, this.aS);
            this.aS.a(this.Y);
            this.aL = new net.minecraft.client.a.d(var2_2.b(), this.aV);
            this.aS.a(this.aL);
            this.a2 = new aF(this);
            this.aS.a(this.a2);
            this.D();
            this.aS.a(this.D);
            net.minecraft.client.a.v.d(0, 0, this.P, this.aT);
            this.au = new net.minecraft.client.u.C(this.e, this.am);
            this.a("Post startup");
            this.n = new G(this);
            this.a(new a1());
            this.am.c(this.R);
            this.R = null;
            this.ar = new L(this);
            this.ag = new f(this);
            v4 = this.ac.b5;
            if (var1_1 == null) ** GOTO lbl129
            if (!v4) break block12;
            v4 = this.Z;
            if (var1_1 == null) ** GOTO lbl129
            if (!v4) {
                this.al();
            }
        }
        try {
            v4 = this.ac.br;
lbl129:
            // 3 sources

            Display.setVSyncEnabled((boolean)v4);
        }
        catch (OpenGLException var3_3) {
            this.ac.br = false;
            this.ac.e();
        }
        cj.b.e();
        this.a2.o();
    }

    public String l() {
        return this.aa;
    }

    public boolean S() {
        return this.ai;
    }

    public void a(net.minecraft.c.f f10) {
        block4: {
            int n2;
            block5: {
                block6: {
                    net.minecraft.c.f f11;
                    net.minecraft.k.m[] arrm;
                    File file;
                    block2: {
                        block3: {
                            File file2 = new File(net.minecraft.client.Q.P().aJ, "crash-reports");
                            net.minecraft.k.m[] arrm2 = net.minecraft.client.Q.ag();
                            file = new File(file2, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
                            net.minecraft.u.f.a(f10.f());
                            arrm = arrm2;
                            f11 = f10;
                            if (arrm == null) break block2;
                            if (f11.c() == null) break block3;
                            net.minecraft.u.f.a("#@!@# Game crashed! Crash report saved to: #@!@# " + f10.c());
                            System.exit(-1);
                            if (arrm != null) break block4;
                        }
                        f11 = f10;
                    }
                    n2 = f11.a(file);
                    if (arrm == null) break block5;
                    if (n2 == 0) break block6;
                    net.minecraft.u.f.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file.getAbsolutePath());
                    System.exit(-1);
                    if (arrm != null) break block4;
                }
                net.minecraft.u.f.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
                n2 = -2;
            }
            System.exit(n2);
        }
    }

    public net.minecraft.c.f c(net.minecraft.c.f f10) {
        f10.a().a("Launched Version", this::lambda$addGraphicsAndWorldToCrashReport$8);
        f10.a().a("LWJGL", Sys::getVersion);
        f10.a().a("OpenGL", Q::lambda$addGraphicsAndWorldToCrashReport$9);
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        f10.a().a("GL Caps", as::b);
        net.minecraft.k.m[] arrm2 = arrm;
        f10.a().a("Using VBOs", this::lambda$addGraphicsAndWorldToCrashReport$10);
        f10.a().a("Is Modded", Q::lambda$addGraphicsAndWorldToCrashReport$11);
        f10.a().a("Type", Q::lambda$addGraphicsAndWorldToCrashReport$12);
        f10.a().a("Resource Packs", this::lambda$addGraphicsAndWorldToCrashReport$13);
        f10.a().a("Current Language", this::lambda$addGraphicsAndWorldToCrashReport$14);
        f10.a().a("Profiler Position", this::lambda$addGraphicsAndWorldToCrashReport$15);
        net.minecraft.c.f f11 = f10;
        if (arrm2 != null) {
            f11.a().a("CPU", Q::lambda$addGraphicsAndWorldToCrashReport$16);
            if (this.e != null) {
                this.e.a(f10);
            }
            f11 = f10;
        }
        return f11;
    }

    @Nullable
    public net.minecraft.U.x Z() {
        return this.aG;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        I i2 = net.minecraft.client.a.W.c().b();
        i2.a(7, net.minecraft.client.y.b.t);
        float f10 = 0.00390625f;
        float f11 = 0.00390625f;
        i2.c((double)n2, (double)(n3 + n7), 0.0).a((float)n4 * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        i2.c((double)(n2 + n6), (double)(n3 + n7), 0.0).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        i2.c((double)(n2 + n6), (double)n3, 0.0).a((float)(n4 + n6) * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        i2.c((double)n2, (double)n3, 0.0).a((float)n4 * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        net.minecraft.client.a.W.c().a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void r() {
        block18: {
            block17: {
                var1_1 = net.minecraft.client.Q.ag();
                if (this.at > 0) return;
                var2_2 = new fG(this.ao.e, true);
                v0 = this.ao;
                if (var1_1 == null) break block17;
                if (v0 != null) {
                    af.a(var2_2);
                }
                v1 = this;
                if (var1_1 == null) break block18;
                v0 = v1.ao;
            }
            if (v0 == null) {
                net.minecraft.client.Q.ak.error("Null returned as 'hitResult', this shouldn't happen!");
                v2 = this;
                if (var1_1 != null) {
                    if (v2.aW.a() == false) return;
                    v2 = this;
                }
                v2.at = 10;
                if (var1_1 != null) return;
            }
            v1 = this;
        }
        v3 = v1.s.D();
        if (var1_1 != null) {
            if (v3 != 0) return;
            v3 = net.minecraft.client.J.a[this.ao.d.ordinal()];
        }
        switch (v3 ? 1 : 0) {
            case 1: {
                this.aW.a(this.s, this.ao.e);
                if (var1_1 != null) break;
            }
            case 2: {
                var3_3 = this.ao.a();
                v4 = this;
                if (var1_1 == null) ** GOTO lbl41
                if (v4.e.d(var3_3).o() == net.minecraft.ac.c.A) ** GOTO lbl39
                this.aW.b(var3_3, this.ao.b);
                if (var1_1 != null) break;
            }
lbl39:
            // 3 sources

            case 3: {
                v4 = this;
lbl41:
                // 2 sources

                if (var1_1 != null) {
                    if (v4.aW.a()) {
                        this.at = 10;
                    }
                    v4 = this;
                }
                v4.s.u();
            }
            {
            }
        }
        this.s.b(net.minecraft.ar.a3.MAIN_HAND);
    }

    public net.minecraft.aw.z e() {
        return this.k;
    }

    private void a(int n2, int n3) {
        this.P = Math.max(1, n2);
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        this.aT = Math.max(1, n3);
        Q q2 = this;
        if (arrm != null) {
            if (q2.aO != null) {
                net.minecraft.client.b.l l2 = new net.minecraft.client.b.l(this);
                this.aO.b(this, l2.e(), l2.a());
            }
            this.ar = new L(this);
            q2 = this;
        }
        q2.H();
    }

    public void a(@Nullable net.minecraft.client.E.l l2) {
        this.a(l2, "");
    }

    private String lambda$addGraphicsAndWorldToCrashReport$14() throws Exception {
        return this.M.c().toString();
    }

    public net.minecraft.av.b ai() {
        return this.L;
    }

    public static Q P() {
        return y;
    }

    private static Iterable lambda$func_193986_ar$7(k k2) {
        return k2.b().stream().map(Q::lambda$null$6).collect(Collectors.toList());
    }

    public void ad() {
        this.c();
    }

    private static boolean aA() {
        String[] arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        String[] arrstring2 = arrstring;
        int n2 = arrstring2.length;
        int n3 = 0;
        while (n3 < n2) {
            block3: {
                block4: {
                    boolean bl2;
                    block5: {
                        String string = arrstring2[n3];
                        String string2 = System.getProperty(string);
                        if (arrm == null) break block3;
                        if (string2 == null) break block4;
                        bl2 = string2.contains("64");
                        if (arrm == null) break block5;
                        if (!bl2) break block4;
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        return false;
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$16() throws Exception {
        return net.minecraft.client.a.as.j();
    }

    private void c(int n2) {
        block6: {
            List<net.minecraft.aq.e> list;
            block12: {
                Q q2;
                int n3;
                block11: {
                    net.minecraft.k.m[] arrm;
                    block10: {
                        block7: {
                            block8: {
                                int n4;
                                int n5;
                                block9: {
                                    Object object;
                                    block5: {
                                        list = this.an.c(this.a0);
                                        arrm = net.minecraft.client.Q.ag();
                                        object = list;
                                        if (arrm == null) break block5;
                                        if (object.isEmpty()) break block6;
                                        object = list.remove(0);
                                    }
                                    net.minecraft.aq.e e10 = (net.minecraft.aq.e)object;
                                    n3 = n2;
                                    if (arrm == null) break block7;
                                    if (n3 != 0) break block8;
                                    n5 = e10.b.isEmpty();
                                    if (arrm == null) break block9;
                                    if (n5 != 0) break block6;
                                    n5 = this.a0.lastIndexOf(46);
                                }
                                if ((n4 = n5) >= 0) {
                                    this.a0 = this.a0.substring(0, n4);
                                }
                                if (arrm != null) break block6;
                            }
                            n3 = --n2;
                        }
                        if (arrm == null) break block10;
                        if (n3 >= list.size()) break block6;
                        n3 = "unspecified".equals(list.get((int)n2).b) ? 1 : 0;
                    }
                    if (arrm == null) break block11;
                    if (n3 != 0) break block6;
                    q2 = this;
                    if (arrm == null) break block12;
                    n3 = q2.a0.isEmpty() ? 1 : 0;
                }
                if (n3 == 0) {
                    this.a0 = this.a0 + ".";
                }
                q2 = this;
            }
            q2.a0 = this.a0 + list.get((int)n2).b;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean at() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Q q2 = y;
        if (arrm != null) {
            if (q2 == null) return 0 != 0;
            q2 = y;
        }
        int n2 = q2.ac.A;
        if (arrm == null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    public d aI() {
        return this.H;
    }

    public boolean aB() {
        return this.E;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ak() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Q q2 = y;
        if (arrm != null) {
            if (q2 == null) return true;
            q2 = y;
        }
        boolean bl2 = q2.ac.cb;
        if (arrm == null) return bl2;
        if (bl2) return false;
        return true;
    }

    public void ab() {
        block3: {
            Q q2;
            block5: {
                boolean bl2;
                block4: {
                    Q q3;
                    net.minecraft.k.m[] arrm;
                    block2: {
                        arrm = net.minecraft.client.Q.ag();
                        q3 = this;
                        if (arrm == null) break block2;
                        if (q3.aO != null) break block3;
                        this.a(new Z());
                        q3 = this;
                    }
                    bl2 = q3.y();
                    if (arrm == null) break block4;
                    if (!bl2) break block3;
                    q2 = this;
                    if (arrm == null) break block5;
                    bl2 = q2.ba.g();
                }
                if (bl2) break block3;
                q2 = this;
            }
            q2.B.d();
        }
    }

    public void az() {
        block9: {
            net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
            try {
                cj.b.d();
                ak.info("Stopping!");
                this.B.f();
            }
            catch (Throwable throwable) {
                block8: {
                    int n2;
                    block7: {
                        Display.destroy();
                        n2 = this.w;
                        if (arrm == null) break block7;
                        if (n2 != 0) break block8;
                        n2 = 0;
                    }
                    System.exit(n2);
                }
                throw throwable;
            }
            Display.destroy();
            if (arrm == null) break block9;
            if (!this.w) {
                System.exit(0);
            }
            System.gc();
        }
    }

    public boolean ap() {
        return this.M.b() || this.ac.bZ;
    }

    @Nullable
    public net.minecraft.client.E.a s() {
        return this.p;
    }

    private void b(boolean n2) {
        block9: {
            Q q2;
            block12: {
                block11: {
                    net.minecraft.k.m[] arrm;
                    block14: {
                        Q q3;
                        block15: {
                            net.minecraft.k.n n3;
                            block13: {
                                int n4;
                                block10: {
                                    block8: {
                                        arrm = net.minecraft.client.Q.ag();
                                        n4 = n2;
                                        if (arrm != null) {
                                            if (n4 == 0) {
                                                this.at = 0;
                                            }
                                            n4 = this.at;
                                        }
                                        if (arrm == null) break block8;
                                        if (n4 > 0) break block9;
                                        n4 = this.s.aq() ? 1 : 0;
                                    }
                                    if (arrm == null) break block10;
                                    if (n4 != 0) break block9;
                                    n4 = n2;
                                }
                                if (n4 == 0) break block11;
                                q2 = this;
                                if (arrm == null) break block12;
                                if (q2.ao == null) break block11;
                                q2 = this;
                                if (arrm == null) break block12;
                                if (q2.ao.d != net.minecraft.k.j.BLOCK) break block11;
                                n3 = this.ao.a();
                                q3 = this;
                                if (arrm == null) break block13;
                                if (q3.e.d(n3).o() == net.minecraft.ac.c.A) break block14;
                                q3 = this;
                            }
                            if (arrm == null) break block15;
                            if (!q3.aW.a(n3, this.ao.b)) break block14;
                            this.au.a(n3, this.ao.b);
                            q3 = this;
                        }
                        q3.s.b(net.minecraft.ar.a3.MAIN_HAND);
                    }
                    if (arrm != null) break block9;
                }
                q2 = this;
            }
            q2.aW.m();
        }
    }

    public static void b(net.minecraft.k.m[] arrm) {
        az = arrm;
    }

    private static Iterable lambda$func_193986_ar$1(net.minecraft.w.d d10) {
        return d10.a(null, net.minecraft.client.B.n.NORMAL).stream().map(net.minecraft.at.l::c).map(String::trim).filter(Q::lambda$null$0).collect(Collectors.toList());
    }

    static {
        if (net.minecraft.client.Q.ag() == null) {
            net.minecraft.client.Q.b(new net.minecraft.k.m[3]);
        }
        ak = LogManager.getLogger();
        g = new net.minecraft.ar.v("textures/gui/title/mojang.png");
        I = net.minecraft.ar.T.a() == net.minecraft.ar.K.OSX;
        ap = new byte[0xA00000];
        J = Lists.newArrayList((Object[])new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
    }

    public net.minecraft.ar.c ah() {
        return this.aN;
    }

    private String lambda$addGraphicsAndWorldToCrashReport$10() throws Exception {
        return this.ac.bz ? "Yes" : "No";
    }

    private static boolean lambda$null$0(String string) {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        boolean bl2 = string.isEmpty();
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void o() {
        this.aq();
    }

    public void a(net.minecraft.client.E.a a10) {
        this.p = a10;
    }

    private void a(String string, Object ... arrobject) {
        this.n.f().a(new net.minecraft.at.g("").a(new net.minecraft.at.h("debug.prefix", new Object[0]).a(new net.minecraft.at.i().a(net.minecraft.at.l.YELLOW).a(true))).a(" ").a(new net.minecraft.at.h(string, arrobject)));
    }

    public MinecraftSessionService w() {
        return this.al;
    }

    public void a(@Nullable net.minecraft.client.b.L l2) {
        block25: {
            block23: {
                block24: {
                    net.minecraft.client.b.L l3;
                    net.minecraft.k.m[] arrm;
                    block21: {
                        block22: {
                            block20: {
                                int n2;
                                block19: {
                                    block18: {
                                        net.minecraft.client.b.L l4;
                                        block17: {
                                            block16: {
                                                block14: {
                                                    block15: {
                                                        arrm = net.minecraft.client.Q.ag();
                                                        l4 = this.aO;
                                                        if (arrm != null) {
                                                            if (l4 != null) {
                                                                this.aO.h();
                                                            }
                                                            l4 = l2;
                                                        }
                                                        if (arrm == null) break block14;
                                                        if (l4 != null || this.e != null) break block15;
                                                        l2 = new a1();
                                                        if (arrm != null) break block16;
                                                    }
                                                    l4 = l2;
                                                }
                                                if (arrm == null) break block17;
                                                if (l4 != null) break block16;
                                                float f10 = this.s.V() - 0.0f;
                                                n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                                if (arrm == null) break block18;
                                                if (n2 <= 0) {
                                                    l2 = new Y(null);
                                                }
                                            }
                                            l4 = l2;
                                        }
                                        n2 = l4 instanceof a1;
                                    }
                                    if (arrm == null) break block19;
                                    if (n2 != 0) break block20;
                                    l3 = l2;
                                    if (arrm == null) break block21;
                                    n2 = l3 instanceof av;
                                }
                                if (n2 == 0) break block22;
                            }
                            this.ac.bE = false;
                            this.n.f().a(true);
                        }
                        this.aO = l2;
                        if (arrm == null) break block23;
                        l3 = l2;
                    }
                    if (l3 == null) break block24;
                    this.as();
                    net.minecraft.client.l.d.k();
                    while (Mouse.next()) {
                    }
                    while (Keyboard.next()) {
                    }
                    net.minecraft.client.b.l l5 = new net.minecraft.client.b.l(this);
                    int n3 = l5.e();
                    int n4 = l5.a();
                    l2.a(this, n3, n4);
                    this.u = false;
                    if (arrm != null) break block25;
                }
                this.B.e();
            }
            this.i();
        }
    }

    public void ax() {
        this.v();
    }

    public static void aO() {
        block3: {
            net.minecraft.af.c c10;
            block4: {
                net.minecraft.af.c c11;
                Q q2;
                net.minecraft.k.m[] arrm;
                block2: {
                    arrm = net.minecraft.client.Q.ag();
                    q2 = y;
                    if (arrm == null) break block2;
                    if (q2 == null) break block3;
                    q2 = y;
                }
                c10 = c11 = q2.ae();
                if (arrm == null) break block4;
                if (c10 == null) break block3;
                c10 = c11;
            }
            c10.aw();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void g() throws IOException {
        block100: {
            block101: {
                block95: {
                    block96: {
                        block97: {
                            block99: {
                                block98: {
                                    block94: {
                                        block92: {
                                            block93: {
                                                block87: {
                                                    block88: {
                                                        block91: {
                                                            block89: {
                                                                block90: {
                                                                    block85: {
                                                                        block86: {
                                                                            block83: {
                                                                                block84: {
                                                                                    block81: {
                                                                                        block82: {
                                                                                            block80: {
                                                                                                block79: {
                                                                                                    block78: {
                                                                                                        block73: {
                                                                                                            block75: {
                                                                                                                block74: {
                                                                                                                    block76: {
                                                                                                                        block77: {
                                                                                                                            block72: {
                                                                                                                                block71: {
                                                                                                                                    block69: {
                                                                                                                                        block70: {
                                                                                                                                            block68: {
                                                                                                                                                var1_1 = net.minecraft.client.Q.ag();
                                                                                                                                                v0 = this.U--;
                                                                                                                                                if (var1_1 != null) {
                                                                                                                                                    if (v0 > 0) {
                                                                                                                                                        // empty if block
                                                                                                                                                    }
                                                                                                                                                    this.an.b("gui");
                                                                                                                                                    v0 = this.ai ? 1 : 0;
                                                                                                                                                }
                                                                                                                                                if (var1_1 == null) break block68;
                                                                                                                                                if (v0 == 0) {
                                                                                                                                                    this.n.e();
                                                                                                                                                }
                                                                                                                                                this.an.c();
                                                                                                                                                this.Y.e(1.0f);
                                                                                                                                                this.H.a(this.e, this.ao);
                                                                                                                                                this.an.b("gameMode");
                                                                                                                                                v1 = this;
                                                                                                                                                if (var1_1 == null) break block69;
                                                                                                                                                v0 = v1.ai ? 1 : 0;
                                                                                                                                            }
                                                                                                                                            if (v0 != 0) break block70;
                                                                                                                                            v2 = this.e;
                                                                                                                                            if (var1_1 == null) break block71;
                                                                                                                                            if (v2 != null) {
                                                                                                                                                this.aW.d();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        this.an.a("textures");
                                                                                                                                        v1 = this;
                                                                                                                                    }
                                                                                                                                    if (var1_1 == null) break block72;
                                                                                                                                    v2 = v1.e;
                                                                                                                                }
                                                                                                                                if (v2 != null) {
                                                                                                                                    this.am.a();
                                                                                                                                }
                                                                                                                                v1 = this;
                                                                                                                            }
                                                                                                                            v3 = v1.aO;
                                                                                                                            if (var1_1 == null) break block73;
                                                                                                                            if (v3 != null) break block74;
                                                                                                                            v4 = this;
                                                                                                                            if (var1_1 == null) break block75;
                                                                                                                            if (v4.s == null) break block74;
                                                                                                                            cfr_temp_0 = this.s.V() - 0.0f;
                                                                                                                            v5 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                                            if (var1_1 == null) break block76;
                                                                                                                            if (v5 > 0) break block77;
                                                                                                                            v5 = (float)(this.aO instanceof Y);
                                                                                                                            if (var1_1 == null) break block76;
                                                                                                                            if (v5 != false) break block77;
                                                                                                                            this.a((net.minecraft.client.b.L)null);
                                                                                                                            if (var1_1 != null) break block78;
                                                                                                                        }
                                                                                                                        v6 = this;
                                                                                                                        if (var1_1 == null) break block79;
                                                                                                                        v5 = (float)v6.s.as();
                                                                                                                    }
                                                                                                                    if (v5 == false) break block78;
                                                                                                                    v6 = this;
                                                                                                                    if (var1_1 == null) break block79;
                                                                                                                    if (v6.e == null) break block78;
                                                                                                                    this.a(new net.minecraft.client.b.N());
                                                                                                                    if (var1_1 != null) break block78;
                                                                                                                }
                                                                                                                v4 = this;
                                                                                                            }
                                                                                                            v3 = v4.aO;
                                                                                                        }
                                                                                                        if (var1_1 == null) break block80;
                                                                                                        if (v3 == null) break block78;
                                                                                                        v3 = this.aO;
                                                                                                        if (var1_1 == null) break block80;
                                                                                                        if (!(v3 instanceof net.minecraft.client.b.N)) break block78;
                                                                                                        v6 = this;
                                                                                                        if (var1_1 == null) break block79;
                                                                                                        if (!v6.s.as()) {
                                                                                                            this.a((net.minecraft.client.b.L)null);
                                                                                                        }
                                                                                                    }
                                                                                                    v6 = this;
                                                                                                }
                                                                                                v3 = v6.aO;
                                                                                            }
                                                                                            if (var1_1 != null) {
                                                                                                if (v3 != null) {
                                                                                                    this.at = 10000;
                                                                                                }
                                                                                                v3 = this.aO;
                                                                                            }
                                                                                            if (var1_1 == null) break block81;
                                                                                            if (v3 == null) break block82;
                                                                                            try {
                                                                                                this.aO.f();
                                                                                            }
                                                                                            catch (Throwable var2_2) {
                                                                                                var3_5 = net.minecraft.c.f.a(var2_2, "Updating screen events");
                                                                                                var4_8 = var3_5.a("Affected screen");
                                                                                                var4_8.a("Screen name", new N(this));
                                                                                                throw new net.minecraft.ar.Z(var3_5);
                                                                                            }
                                                                                            v3 = this.aO;
                                                                                            if (var1_1 != null) {
                                                                                                if (v3 != null) {
                                                                                                    try {
                                                                                                        this.aO.e();
                                                                                                    }
                                                                                                    catch (Throwable var2_3) {
                                                                                                        var3_6 = net.minecraft.c.f.a(var2_3, "Ticking screen");
                                                                                                        var4_9 = var3_6.a("Affected screen");
                                                                                                        var4_9.a("Screen name", new P(this));
                                                                                                        throw new net.minecraft.ar.Z(var3_6);
                                                                                                    }
                                                                                                } else {
                                                                                                    ** GOTO lbl106
                                                                                                }
                                                                                            }
                                                                                            break block81;
                                                                                        }
                                                                                        v7 = this;
                                                                                        if (var1_1 == null) break block83;
                                                                                        v3 = v7.aO;
                                                                                    }
                                                                                    if (v3 == null) break block84;
                                                                                    v8 = this;
                                                                                    if (var1_1 == null) break block85;
                                                                                    if (!v8.aO.l) break block86;
                                                                                }
                                                                                this.an.a("mouse");
                                                                                this.ac();
                                                                                v7 = this;
                                                                            }
                                                                            if (var1_1 != null) {
                                                                                if (v7.at > 0) {
                                                                                    --this.at;
                                                                                }
                                                                                this.an.a("keyboard");
                                                                                v7 = this;
                                                                            }
                                                                            v7.C();
                                                                        }
                                                                        v8 = this;
                                                                    }
                                                                    if (var1_1 == null) break block87;
                                                                    if (v8.e == null) break block88;
                                                                    v9 = this;
                                                                    if (var1_1 == null) break block89;
                                                                    if (v9.s == null) break block90;
                                                                    v10 = ++this.G;
                                                                    if (var1_1 == null) break block91;
                                                                    if (v10 == 30) {
                                                                        this.G = 0;
                                                                        this.e.h(this.s);
                                                                    }
                                                                }
                                                                this.an.a("gameRenderer");
                                                                v9 = this;
                                                            }
                                                            v10 = v9.ai;
                                                        }
                                                        if (var1_1 != null) {
                                                            if (v10 == 0) {
                                                                this.Y.g();
                                                            }
                                                            this.an.a("levelRenderer");
                                                            v10 = this.ai;
                                                        }
                                                        if (var1_1 != null) {
                                                            if (v10 == 0) {
                                                                this.a2.x();
                                                            }
                                                            this.an.a("level");
                                                            v10 = this.ai ? 1 : 0;
                                                        }
                                                        if (var1_1 == null) break block92;
                                                        if (v10 != 0) break block93;
                                                        v11 = this.e;
                                                        if (var1_1 != null) {
                                                            if (v11.z() > 0) {
                                                                this.e.c(this.e.z() - 1);
                                                            }
                                                            v11 = this.e;
                                                        }
                                                        v11.K();
                                                        if (var1_1 != null) break block93;
                                                    }
                                                    v8 = this;
                                                }
                                                v10 = v8.Y.e();
                                                if (var1_1 == null) break block92;
                                                if (v10 != 0) {
                                                    this.Y.q();
                                                }
                                            }
                                            v12 = this;
                                            if (var1_1 == null) break block94;
                                            v10 = v12.ai;
                                        }
                                        if (v10 == 0) {
                                            this.aQ.c();
                                            this.B.c();
                                        }
                                        v12 = this;
                                    }
                                    if (var1_1 == null) break block95;
                                    if (v12.e == null) break block96;
                                    v13 = this.ai;
                                    if (var1_1 != null) {
                                        if (!v13) {
                                            this.e.a(this.e.g() != net.minecraft.ah.e.PEACEFUL, true);
                                            this.H.h();
                                            try {
                                                this.e.L();
                                            }
                                            catch (Throwable var2_4) {
                                                var3_7 = net.minecraft.c.f.a(var2_4, "Exception in world tick");
                                                v14 = this.e;
                                                if (var1_1 != null) {
                                                    if (v14 == null) {
                                                        var4_10 = var3_7.a("Affected level");
                                                        var4_10.a("Problem", "Level is null!");
                                                        if (var1_1 != null) throw new net.minecraft.ar.Z(var3_7);
                                                    }
                                                    v14 = this.e;
                                                }
                                                v14.a(var3_7);
                                                throw new net.minecraft.ar.Z(var3_7);
                                            }
                                        }
                                        this.an.a("animateTick");
                                        v13 = this.ai;
                                    }
                                    if (var1_1 == null) break block97;
                                    if (v13) break block98;
                                    v13 = cj.b.i.a(cT.class).i();
                                    if (var1_1 == null) break block97;
                                    if (!v13) break block98;
                                    v12 = this;
                                    if (var1_1 == null) break block99;
                                    if (v12.e != null) {
                                        this.e.a(net.minecraft.k.h.f(this.s.a), net.minecraft.k.h.f(this.s.aF), net.minecraft.k.h.f(this.s.ax));
                                    }
                                }
                                this.an.a("particles");
                                v12 = this;
                            }
                            if (var1_1 == null) break block100;
                            v13 = v12.ai;
                        }
                        if (v13) break block101;
                        this.au.c();
                        if (var1_1 != null) break block101;
                    }
                    v12 = this;
                }
                if (var1_1 == null) break block100;
                if (v12.r != null) {
                    this.an.a("pendingConnection");
                    this.r.i();
                }
            }
            this.an.c();
            v12 = this;
        }
        v12.aD = net.minecraft.client.Q.aj();
    }

    private static Iterable lambda$func_193986_ar$5(k k2) {
        return k2.b().stream().flatMap(Q::lambda$null$3).map(net.minecraft.at.l::c).map(String::trim).filter(Q::lambda$null$4).collect(Collectors.toList());
    }

    public ListenableFuture<Object> A() {
        return this.a(this::af);
    }

    @Nullable
    public net.minecraft.af.c ae() {
        return this.ba;
    }

    public static int aL() {
        return aI;
    }

    public net.minecraft.client.s.b ao() {
        return this.aH;
    }

    public void aH() {
        this.an.b("display_update");
        Display.update();
        this.an.c();
        this.Q();
    }

    public void i() {
        block5: {
            boolean bl2;
            block6: {
                net.minecraft.k.m[] arrm;
                block4: {
                    arrm = net.minecraft.client.Q.ag();
                    bl2 = Display.isActive();
                    if (arrm == null) break block4;
                    if (!bl2) break block5;
                    bl2 = this.af;
                }
                if (arrm == null) break block6;
                if (bl2) break block5;
                bl2 = I;
            }
            if (!bl2) {
                net.minecraft.client.l.d.a();
            }
            this.af = true;
            this.V.b();
            this.a((net.minecraft.client.b.L)null);
            this.at = 10000;
        }
    }

    public final boolean q() {
        return this.aP;
    }

    private static boolean lambda$null$4(String string) {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        boolean bl2 = string.isEmpty();
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void z() throws LWJGLException {
        block8: {
            var2_1 = Sets.newHashSet();
            v0 = net.minecraft.client.Q.ag();
            Collections.addAll(var2_1, Display.getAvailableDisplayModes());
            var3_2 = Display.getDesktopDisplayMode();
            var1_3 = v0;
            if (var1_3 == null) return;
            if (var2_1.contains((Object)var3_2) || net.minecraft.ar.T.a() != net.minecraft.ar.K.OSX) break block8;
            block0: for (DisplayMode var5_5 : net.minecraft.client.Q.J) {
                var6_6 = 1;
                if (var1_3 == null) return;
                var7_7 = var2_1.iterator();
                while (var7_7.hasNext()) {
                    block10: {
                        block12: {
                            block11: {
                                block9: {
                                    var8_8 = (DisplayMode)var7_7.next();
                                    v1 = var8_8.getBitsPerPixel();
                                    v2 = 32;
                                    if (var1_3 == null) ** GOTO lbl41
                                    if (var1_3 == null) break block9;
                                    if (v1 != v2) break block10;
                                    v3 = var8_8.getWidth();
                                    v4 = var5_5.getWidth();
                                }
                                if (var1_3 == null) break block11;
                                if (v3 != v4) break block10;
                                v3 = var8_8.getHeight();
                                if (var1_3 == null) break block12;
                                v4 = var5_5.getHeight();
                            }
                            if (v3 != v4) break block10;
                            v3 = var6_6 = 0;
                        }
                        if (var1_3 != null) break;
                    }
                    if (var1_3 != null) continue;
                }
                if (var6_6 != 0) ** GOTO lbl52
                var7_7 = var2_1.iterator();
                while (var7_7.hasNext() || var1_3 == null) {
                    var8_8 = (DisplayMode)var7_7.next();
                    v1 = var8_8.getBitsPerPixel();
                    v2 = 32;
lbl41:
                    // 2 sources

                    if (var1_3 != null) {
                        if (v1 != v2) continue;
                        v1 = var8_8.getWidth();
                        v2 = var5_5.getWidth() / 2;
                    }
                    if (var1_3 != null) {
                        if (v1 != v2) continue;
                        v1 = var8_8.getHeight();
                        v2 = var5_5.getHeight() / 2;
                    }
                    if (v1 != v2) continue;
                    if (var1_3 == null) continue block0;
                    var3_2 = var8_8;
lbl52:
                    // 2 sources

                    if (var1_3 != null) continue block0;
                }
            }
        }
        Display.setDisplayMode((DisplayMode)var3_2);
        this.P = var3_2.getWidth();
        this.aT = var3_2.getHeight();
    }

    private void ac() throws IOException {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        while (Mouse.next()) {
            block16: {
                net.minecraft.client.b.L l2;
                block26: {
                    block23: {
                        block24: {
                            boolean bl2;
                            block25: {
                                block18: {
                                    c c10;
                                    long l3;
                                    block19: {
                                        block20: {
                                            Q q2;
                                            block21: {
                                                block22: {
                                                    long l4;
                                                    block17: {
                                                        long l5;
                                                        block15: {
                                                            block11: {
                                                                int n2;
                                                                block12: {
                                                                    int n3;
                                                                    int n4;
                                                                    block14: {
                                                                        int n5;
                                                                        block13: {
                                                                            n5 = Mouse.getEventButton();
                                                                            net.minecraft.client.l.d.a(n5 - 100, Mouse.getEventButtonState());
                                                                            if (!Mouse.getEventButtonState()) break block11;
                                                                            fk fk2 = new fk(n5);
                                                                            af.a(fk2);
                                                                            n2 = this.s.ae();
                                                                            if (arrm == null) break block12;
                                                                            if (n2 == 0) break block13;
                                                                            int n3 = n5;
                                                                            n3 = 2;
                                                                            if (arrm == null) break block14;
                                                                            if (n4 != n3) break block13;
                                                                            this.n.a().c();
                                                                            if (arrm != null) break block11;
                                                                        }
                                                                        int n3 = n5;
                                                                        n3 = 100;
                                                                    }
                                                                    n2 = n4 - n3;
                                                                }
                                                                net.minecraft.client.l.d.b(n2);
                                                            }
                                                            long l6 = net.minecraft.client.Q.aj() - this.aD;
                                                            long l5 = l6 - 200L;
                                                            l5 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                                                            if (arrm == null) break block15;
                                                            if (l5 > 0) break block16;
                                                            l5 = Mouse.getEventDWheel();
                                                        }
                                                        l4 = l3 = l5;
                                                        if (arrm == null) break block17;
                                                        if (l4 == false) break block18;
                                                        c10 = this.s;
                                                        if (arrm == null) break block19;
                                                        l4 = (long)c10.ae();
                                                    }
                                                    if (l4 == false) break block20;
                                                    long l8 = l3;
                                                    if (arrm != null) {
                                                        l8 = l8 < 0 ? (long)-1 : (long)1;
                                                    }
                                                    l3 = l8;
                                                    q2 = this;
                                                    if (arrm == null) break block21;
                                                    if (!q2.n.a().b()) break block22;
                                                    this.n.a().a((int)(-l3));
                                                    if (arrm != null) break block18;
                                                }
                                                q2 = this;
                                            }
                                            float f10 = net.minecraft.k.h.c(q2.s.cw.a() + (float)l3 * 0.005f, 0.0f, 0.2f);
                                            this.s.cw.a(f10);
                                            if (arrm != null) break block18;
                                        }
                                        c10 = this.s;
                                    }
                                    c10.cB.f((int)l3);
                                }
                                l2 = this.aO;
                                if (arrm == null) break block23;
                                if (l2 != null) break block24;
                                bl2 = this.af;
                                if (arrm == null) break block25;
                                if (bl2) break block16;
                                bl2 = Mouse.getEventButtonState();
                            }
                            if (!bl2) break block16;
                            this.i();
                            if (arrm != null) break block16;
                        }
                        l2 = this.aO;
                    }
                    if (arrm == null) break block26;
                    if (l2 == null) break block16;
                    l2 = this.aO;
                }
                l2.k();
            }
            if (arrm != null) continue;
        }
    }

    @Override
    public void a(net.minecraft.aq.d d10) {
        net.minecraft.k.m[] arrm;
        block6: {
            GameProfile gameProfile;
            GameProfile gameProfile2;
            block5: {
                d10.a("opengl_version", net.minecraft.client.a.v.c(7938));
                d10.a("opengl_vendor", net.minecraft.client.a.v.c(7936));
                d10.a("client_brand", net.minecraft.client.K.a());
                d10.a("launched_version", this.aq);
                ContextCapabilities contextCapabilities = GLContext.getCapabilities();
                d10.a("gl_caps[ARB_arrays_of_arrays]", contextCapabilities.GL_ARB_arrays_of_arrays);
                d10.a("gl_caps[ARB_base_instance]", contextCapabilities.GL_ARB_base_instance);
                d10.a("gl_caps[ARB_blend_func_extended]", contextCapabilities.GL_ARB_blend_func_extended);
                d10.a("gl_caps[ARB_clear_buffer_object]", contextCapabilities.GL_ARB_clear_buffer_object);
                d10.a("gl_caps[ARB_color_buffer_float]", contextCapabilities.GL_ARB_color_buffer_float);
                d10.a("gl_caps[ARB_compatibility]", contextCapabilities.GL_ARB_compatibility);
                d10.a("gl_caps[ARB_compressed_texture_pixel_storage]", contextCapabilities.GL_ARB_compressed_texture_pixel_storage);
                d10.a("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
                d10.a("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
                d10.a("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
                d10.a("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
                d10.a("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
                d10.a("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
                d10.a("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
                d10.a("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
                d10.a("gl_caps[ARB_depth_clamp]", contextCapabilities.GL_ARB_depth_clamp);
                d10.a("gl_caps[ARB_depth_texture]", contextCapabilities.GL_ARB_depth_texture);
                d10.a("gl_caps[ARB_draw_buffers]", contextCapabilities.GL_ARB_draw_buffers);
                d10.a("gl_caps[ARB_draw_buffers_blend]", contextCapabilities.GL_ARB_draw_buffers_blend);
                d10.a("gl_caps[ARB_draw_elements_base_vertex]", contextCapabilities.GL_ARB_draw_elements_base_vertex);
                d10.a("gl_caps[ARB_draw_indirect]", contextCapabilities.GL_ARB_draw_indirect);
                d10.a("gl_caps[ARB_draw_instanced]", contextCapabilities.GL_ARB_draw_instanced);
                d10.a("gl_caps[ARB_explicit_attrib_location]", contextCapabilities.GL_ARB_explicit_attrib_location);
                net.minecraft.k.m[] arrm2 = net.minecraft.client.Q.ag();
                d10.a("gl_caps[ARB_explicit_uniform_location]", contextCapabilities.GL_ARB_explicit_uniform_location);
                d10.a("gl_caps[ARB_fragment_layer_viewport]", contextCapabilities.GL_ARB_fragment_layer_viewport);
                d10.a("gl_caps[ARB_fragment_program]", contextCapabilities.GL_ARB_fragment_program);
                d10.a("gl_caps[ARB_fragment_shader]", contextCapabilities.GL_ARB_fragment_shader);
                d10.a("gl_caps[ARB_fragment_program_shadow]", contextCapabilities.GL_ARB_fragment_program_shadow);
                d10.a("gl_caps[ARB_framebuffer_object]", contextCapabilities.GL_ARB_framebuffer_object);
                d10.a("gl_caps[ARB_framebuffer_sRGB]", contextCapabilities.GL_ARB_framebuffer_sRGB);
                d10.a("gl_caps[ARB_geometry_shader4]", contextCapabilities.GL_ARB_geometry_shader4);
                d10.a("gl_caps[ARB_gpu_shader5]", contextCapabilities.GL_ARB_gpu_shader5);
                d10.a("gl_caps[ARB_half_float_pixel]", contextCapabilities.GL_ARB_half_float_pixel);
                d10.a("gl_caps[ARB_half_float_vertex]", contextCapabilities.GL_ARB_half_float_vertex);
                d10.a("gl_caps[ARB_instanced_arrays]", contextCapabilities.GL_ARB_instanced_arrays);
                d10.a("gl_caps[ARB_map_buffer_alignment]", contextCapabilities.GL_ARB_map_buffer_alignment);
                d10.a("gl_caps[ARB_map_buffer_range]", contextCapabilities.GL_ARB_map_buffer_range);
                d10.a("gl_caps[ARB_multisample]", contextCapabilities.GL_ARB_multisample);
                d10.a("gl_caps[ARB_multitexture]", contextCapabilities.GL_ARB_multitexture);
                d10.a("gl_caps[ARB_occlusion_query2]", contextCapabilities.GL_ARB_occlusion_query2);
                d10.a("gl_caps[ARB_pixel_buffer_object]", contextCapabilities.GL_ARB_pixel_buffer_object);
                d10.a("gl_caps[ARB_seamless_cube_map]", contextCapabilities.GL_ARB_seamless_cube_map);
                d10.a("gl_caps[ARB_shader_objects]", contextCapabilities.GL_ARB_shader_objects);
                d10.a("gl_caps[ARB_shader_stencil_export]", contextCapabilities.GL_ARB_shader_stencil_export);
                d10.a("gl_caps[ARB_shader_texture_lod]", contextCapabilities.GL_ARB_shader_texture_lod);
                d10.a("gl_caps[ARB_shadow]", contextCapabilities.GL_ARB_shadow);
                d10.a("gl_caps[ARB_shadow_ambient]", contextCapabilities.GL_ARB_shadow_ambient);
                arrm = arrm2;
                d10.a("gl_caps[ARB_stencil_texturing]", contextCapabilities.GL_ARB_stencil_texturing);
                d10.a("gl_caps[ARB_sync]", contextCapabilities.GL_ARB_sync);
                d10.a("gl_caps[ARB_tessellation_shader]", contextCapabilities.GL_ARB_tessellation_shader);
                d10.a("gl_caps[ARB_texture_border_clamp]", contextCapabilities.GL_ARB_texture_border_clamp);
                d10.a("gl_caps[ARB_texture_buffer_object]", contextCapabilities.GL_ARB_texture_buffer_object);
                d10.a("gl_caps[ARB_texture_cube_map]", contextCapabilities.GL_ARB_texture_cube_map);
                d10.a("gl_caps[ARB_texture_cube_map_array]", contextCapabilities.GL_ARB_texture_cube_map_array);
                d10.a("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities.GL_ARB_texture_non_power_of_two);
                d10.a("gl_caps[ARB_uniform_buffer_object]", contextCapabilities.GL_ARB_uniform_buffer_object);
                d10.a("gl_caps[ARB_vertex_blend]", contextCapabilities.GL_ARB_vertex_blend);
                d10.a("gl_caps[ARB_vertex_buffer_object]", contextCapabilities.GL_ARB_vertex_buffer_object);
                d10.a("gl_caps[ARB_vertex_program]", contextCapabilities.GL_ARB_vertex_program);
                d10.a("gl_caps[ARB_vertex_shader]", contextCapabilities.GL_ARB_vertex_shader);
                d10.a("gl_caps[EXT_bindable_uniform]", contextCapabilities.GL_EXT_bindable_uniform);
                d10.a("gl_caps[EXT_blend_equation_separate]", contextCapabilities.GL_EXT_blend_equation_separate);
                d10.a("gl_caps[EXT_blend_func_separate]", contextCapabilities.GL_EXT_blend_func_separate);
                d10.a("gl_caps[EXT_blend_minmax]", contextCapabilities.GL_EXT_blend_minmax);
                d10.a("gl_caps[EXT_blend_subtract]", contextCapabilities.GL_EXT_blend_subtract);
                d10.a("gl_caps[EXT_draw_instanced]", contextCapabilities.GL_EXT_draw_instanced);
                d10.a("gl_caps[EXT_framebuffer_multisample]", contextCapabilities.GL_EXT_framebuffer_multisample);
                d10.a("gl_caps[EXT_framebuffer_object]", contextCapabilities.GL_EXT_framebuffer_object);
                d10.a("gl_caps[EXT_framebuffer_sRGB]", contextCapabilities.GL_EXT_framebuffer_sRGB);
                d10.a("gl_caps[EXT_geometry_shader4]", contextCapabilities.GL_EXT_geometry_shader4);
                d10.a("gl_caps[EXT_gpu_program_parameters]", contextCapabilities.GL_EXT_gpu_program_parameters);
                d10.a("gl_caps[EXT_gpu_shader4]", contextCapabilities.GL_EXT_gpu_shader4);
                d10.a("gl_caps[EXT_multi_draw_arrays]", contextCapabilities.GL_EXT_multi_draw_arrays);
                d10.a("gl_caps[EXT_packed_depth_stencil]", contextCapabilities.GL_EXT_packed_depth_stencil);
                d10.a("gl_caps[EXT_paletted_texture]", contextCapabilities.GL_EXT_paletted_texture);
                d10.a("gl_caps[EXT_rescale_normal]", contextCapabilities.GL_EXT_rescale_normal);
                d10.a("gl_caps[EXT_separate_shader_objects]", contextCapabilities.GL_EXT_separate_shader_objects);
                d10.a("gl_caps[EXT_shader_image_load_store]", contextCapabilities.GL_EXT_shader_image_load_store);
                d10.a("gl_caps[EXT_shadow_funcs]", contextCapabilities.GL_EXT_shadow_funcs);
                d10.a("gl_caps[EXT_shared_texture_palette]", contextCapabilities.GL_EXT_shared_texture_palette);
                d10.a("gl_caps[EXT_stencil_clear_tag]", contextCapabilities.GL_EXT_stencil_clear_tag);
                d10.a("gl_caps[EXT_stencil_two_side]", contextCapabilities.GL_EXT_stencil_two_side);
                d10.a("gl_caps[EXT_stencil_wrap]", contextCapabilities.GL_EXT_stencil_wrap);
                d10.a("gl_caps[EXT_texture_3d]", contextCapabilities.GL_EXT_texture_3d);
                d10.a("gl_caps[EXT_texture_array]", contextCapabilities.GL_EXT_texture_array);
                d10.a("gl_caps[EXT_texture_buffer_object]", contextCapabilities.GL_EXT_texture_buffer_object);
                d10.a("gl_caps[EXT_texture_integer]", contextCapabilities.GL_EXT_texture_integer);
                d10.a("gl_caps[EXT_texture_lod_bias]", contextCapabilities.GL_EXT_texture_lod_bias);
                d10.a("gl_caps[EXT_texture_sRGB]", contextCapabilities.GL_EXT_texture_sRGB);
                d10.a("gl_caps[EXT_vertex_shader]", contextCapabilities.GL_EXT_vertex_shader);
                d10.a("gl_caps[EXT_vertex_weighting]", contextCapabilities.GL_EXT_vertex_weighting);
                d10.a("gl_caps[gl_max_vertex_uniforms]", net.minecraft.client.a.v.b(35658));
                net.minecraft.client.a.v.D();
                d10.a("gl_caps[gl_max_fragment_uniforms]", net.minecraft.client.a.v.b(35657));
                net.minecraft.client.a.v.D();
                d10.a("gl_caps[gl_max_vertex_attribs]", net.minecraft.client.a.v.b(34921));
                net.minecraft.client.a.v.D();
                d10.a("gl_caps[gl_max_vertex_texture_image_units]", net.minecraft.client.a.v.b(35660));
                net.minecraft.client.a.v.D();
                d10.a("gl_caps[gl_max_texture_image_units]", net.minecraft.client.a.v.b(34930));
                net.minecraft.client.a.v.D();
                d10.a("gl_caps[gl_max_array_texture_layers]", net.minecraft.client.a.v.b(35071));
                net.minecraft.client.a.v.D();
                d10.a("gl_max_texture_size", net.minecraft.client.Q.I());
                gameProfile = gameProfile2 = this.l.c();
                if (arrm == null) break block5;
                if (gameProfile == null) break block6;
                gameProfile = gameProfile2;
            }
            if (gameProfile.getId() != null) {
                d10.a("uuid", Hashing.sha1().hashBytes(gameProfile2.getId().toString().getBytes(Charsets.ISO_8859_1)).toString());
            }
        }
        if (arrm == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    private String lambda$addGraphicsAndWorldToCrashReport$13() throws Exception {
        StringBuilder stringBuilder;
        block6: {
            StringBuilder stringBuilder2 = new StringBuilder();
            net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
            for (String string : this.ac.bJ) {
                block8: {
                    StringBuilder stringBuilder3;
                    int n2;
                    block7: {
                        stringBuilder = stringBuilder2;
                        if (arrm == null) break block6;
                        n2 = stringBuilder.length();
                        if (arrm == null) break block7;
                        if (n2 > 0) {
                            stringBuilder2.append(", ");
                        }
                        stringBuilder3 = stringBuilder2.append(string);
                        if (arrm == null) break block8;
                        n2 = this.ac.T.contains(string) ? 1 : 0;
                    }
                    if (n2 != 0) {
                        stringBuilder3 = stringBuilder2.append(" (incompatible)");
                    }
                }
                if (arrm != null) continue;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$11() throws Exception {
        block3: {
            String string;
            block2: {
                String string2 = net.minecraft.client.K.a();
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                string = "vanilla";
                if (arrm == null) break block2;
                if (string.equals(string2)) break block3;
                string = "Definitely; Client brand changed to '" + string2 + "'";
            }
            return string;
        }
        return Q.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.";
    }

    public e ay() {
        return this.N;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f() {
        net.minecraft.ar.K k2 = net.minecraft.ar.T.a();
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        if (k2 != net.minecraft.ar.K.OSX) {
            InputStream inputStream;
            block5: {
                InputStream inputStream2;
                InputStream inputStream3;
                block6: {
                    inputStream3 = null;
                    inputStream2 = null;
                    try {
                        inputStream3 = this.aE.c(new net.minecraft.ar.v("icons/icon_16x16.png"));
                        inputStream2 = this.aE.c(new net.minecraft.ar.v("icons/icon_32x32.png"));
                        inputStream = inputStream3;
                        if (arrm == null) break block5;
                        if (inputStream == null) break block6;
                        inputStream = inputStream2;
                        if (arrm == null) break block5;
                        if (inputStream == null) break block6;
                        Display.setIcon((ByteBuffer[])new ByteBuffer[]{this.a(inputStream3), this.a(inputStream2)});
                    }
                    catch (IOException iOException) {
                        try {
                            ak.error("Couldn't set icon", (Throwable)iOException);
                        }
                        catch (Throwable throwable) {
                            IOUtils.closeQuietly(inputStream3);
                            IOUtils.closeQuietly(inputStream2);
                            throw throwable;
                        }
                        IOUtils.closeQuietly((InputStream)inputStream3);
                        IOUtils.closeQuietly(inputStream2);
                    }
                }
                IOUtils.closeQuietly((InputStream)inputStream3);
                inputStream = inputStream2;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    public void a(@Nullable net.minecraft.client.E.l l2, String string) {
        block48: {
            block43: {
                block44: {
                    Q q2;
                    net.minecraft.k.m[] arrm;
                    block47: {
                        block46: {
                            boolean bl2;
                            j j2;
                            block45: {
                                block42: {
                                    net.minecraft.client.u.C c10;
                                    block41: {
                                        Q q3;
                                        block40: {
                                            block39: {
                                                net.minecraft.client.E.l l3;
                                                block38: {
                                                    block36: {
                                                        String string2;
                                                        L l4;
                                                        block37: {
                                                            block35: {
                                                                block29: {
                                                                    block30: {
                                                                        block33: {
                                                                            Q q4;
                                                                            block34: {
                                                                                block32: {
                                                                                    j j3;
                                                                                    block31: {
                                                                                        arrm = net.minecraft.client.Q.ag();
                                                                                        if (arrm == null) break block29;
                                                                                        if (l2 != null) break block30;
                                                                                        j3 = j2 = this.ar();
                                                                                        if (arrm == null) break block31;
                                                                                        if (j3 == null) break block32;
                                                                                        j3 = j2;
                                                                                    }
                                                                                    j3.f();
                                                                                }
                                                                                q4 = this;
                                                                                if (arrm == null) break block33;
                                                                                if (q4.ba == null) break block34;
                                                                                q4 = this;
                                                                                if (arrm == null) break block33;
                                                                                if (q4.ba.ay()) {
                                                                                    this.ba.B();
                                                                                }
                                                                            }
                                                                            this.ba = null;
                                                                            this.Y.r();
                                                                            q4 = this;
                                                                        }
                                                                        q4.aW = null;
                                                                        net.minecraft.client.t.d.c.c();
                                                                    }
                                                                    this.aG = null;
                                                                    this.r = null;
                                                                }
                                                                l4 = this.ar;
                                                                if (arrm == null) break block35;
                                                                if (l4 == null) break block36;
                                                                l4 = this.ar;
                                                            }
                                                            string2 = string;
                                                            if (arrm == null) break block37;
                                                            l4.c(string2);
                                                            if (cj.b.i.a(bZ.class).i()) break block36;
                                                            l4 = this.ar;
                                                            string2 = "";
                                                        }
                                                        l4.a(string2);
                                                    }
                                                    l3 = l2;
                                                    if (arrm == null) break block38;
                                                    if (l3 != null) break block39;
                                                    q3 = this;
                                                    if (arrm == null) break block40;
                                                    l3 = q3.e;
                                                }
                                                if (l3 != null) {
                                                    this.S.k();
                                                    this.n.h();
                                                    this.a((net.minecraft.client.E.a)null);
                                                    this.ad = false;
                                                }
                                            }
                                            this.B.b();
                                            this.e = l2;
                                            q3 = this;
                                        }
                                        if (arrm != null) {
                                            if (q3.a2 != null) {
                                                this.a2.a(l2);
                                            }
                                            q3 = this;
                                        }
                                        c10 = q3.au;
                                        if (arrm == null) break block41;
                                        if (c10 == null) break block42;
                                        c10 = this.au;
                                    }
                                    c10.a(l2);
                                }
                                net.minecraft.client.F.b.e.a(l2);
                                if (arrm == null) break block43;
                                if (l2 == null) break block44;
                                bl2 = cj.b.i.a(bZ.class).i();
                                if (arrm == null) break block45;
                                if (bl2) break block46;
                                q2 = this;
                                if (arrm == null) break block47;
                                bl2 = q2.ad;
                            }
                            if (!bl2) {
                                j2 = new YggdrasilAuthenticationService(this.a7, UUID.randomUUID().toString());
                                MinecraftSessionService minecraftSessionService = j2.createMinecraftSessionService();
                                GameProfileRepository gameProfileRepository = j2.createProfileRepository();
                                net.minecraft.a.o o2 = new net.minecraft.a.o(gameProfileRepository, new File(this.aJ, net.minecraft.R.b.B.getName()));
                                net.minecraft.N.X.a(o2);
                                net.minecraft.N.X.a(minecraftSessionService);
                                net.minecraft.a.o.a(false);
                            }
                        }
                        q2 = this;
                    }
                    c c11 = q2.s;
                    if (arrm != null) {
                        if (c11 == null) {
                            this.s = this.aW.a(l2, new net.minecraft.l.g(), new net.minecraft.client.B.j());
                            this.aW.c(this.s);
                        }
                        this.s.L();
                        l2.f(this.s);
                        c11 = this.s;
                    }
                    c11.c4 = new a9(this.ac);
                    this.aW.a(this.s);
                    this.aG = this.s;
                    if (arrm != null) break block48;
                }
                this.k.a();
            }
            this.s = null;
        }
        if (!cj.b.i.a(bZ.class).i()) {
            System.gc();
        }
        this.aD = 0L;
    }

    public static int I() {
        int n2;
        block4: {
            int n3 = 16384;
            net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
            while (n3 > 0) {
                int n4;
                net.minecraft.client.a.v.a(32868, 0, 6408, n3, n3, 0, 6408, 5121, null);
                n2 = n4 = net.minecraft.client.a.v.a(32868, 0, 4096);
                if (arrm != null) {
                    if (arrm != null) {
                        if (n2 != 0) {
                            return n3;
                        }
                        int n5 = n3 = n3 >> 1;
                    }
                    if (arrm != null) continue;
                }
                break block4;
            }
            n2 = -1;
        }
        return n2;
    }

    public Proxy au() {
        return this.a7;
    }

    public void G() {
        this.t();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Q(net.minecraft.client.main.e var1_1) {
        super();
        this.ay = true;
        this.a8 = new ah(20.0f);
        this.aA = new net.minecraft.aq.d("client", this, net.minecraft.R.b.R());
        this.D = new net.minecraft.client.B.m();
        this.aD = net.minecraft.client.Q.aj();
        this.aN = new net.minecraft.ar.c();
        this.aX = System.nanoTime();
        this.an = new net.minecraft.aq.b();
        this.F = -1L;
        this.a9 = new net.minecraft.client.v.o();
        this.x = Lists.newArrayList();
        this.aF = Queues.newArrayDeque();
        this.i = Thread.currentThread();
        var2_2 = net.minecraft.client.Q.ag();
        this.aU = true;
        this.j = "";
        this.a4 = true;
        this.aZ = net.minecraft.client.Q.aj();
        this.h = -1L;
        this.a0 = "root";
        net.minecraft.client.Q.y = this;
        this.aJ = var1_1.a.d;
        this.ae = var1_1.a.c;
        this.v = var1_1.a.b;
        this.aq = var1_1.b.c;
        this.aa = var1_1.b.b;
        this.aR = var1_1.c.c;
        this.ab = var1_1.c.b;
        this.aE = new o(var1_1.a.a());
        v0 = var1_1.c;
        if (var2_2 == null) ** GOTO lbl37
        if (v0.a == null) {
            v1 = Proxy.NO_PROXY;
        } else {
            v0 = var1_1.c;
lbl37:
            // 2 sources

            v1 = v0.a;
        }
        this.a7 = v1;
        this.al = new YggdrasilAuthenticationService(this.a7, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.l = var1_1.c.d;
        net.minecraft.client.Q.ak.info("Setting user: {}", (Object)this.l.b());
        net.minecraft.client.Q.ak.debug("(Session ID is {})", (Object)this.l.d());
        this.aP = var1_1.b.a;
        v2 = var1_1.d.b;
        if (var2_2 != null) {
            v2 = v2 > 0 ? var1_1.d.b : 1;
        }
        this.P = v2;
        v3 = var1_1.d.a;
        if (var2_2 != null) {
            v3 = v3 > 0 ? var1_1.d.a : 1;
        }
        this.aT = v3;
        this.C = var1_1.d.b;
        this.aj = var1_1.d.a;
        this.Z = var1_1.d.c;
        this.aM = net.minecraft.client.Q.aA();
        this.ba = null;
        if (var2_2 != null) {
            if (var1_1.e.a != null) {
                this.a5 = var1_1.e.a;
                this.X = var1_1.e.b;
            }
            ImageIO.setUseCache(false);
            Locale.setDefault(Locale.ROOT);
            net.minecraft.u.f.c();
            net.minecraft.at.d.e = (Function<String, Supplier>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(java.lang.String ), (Ljava/lang/String;)Ljava/util/function/Supplier;)();
            this.L = net.minecraft.av.e.a();
            this.N = new e(this);
            this.H = new d(this);
        }
        if (net.minecraft.k.m.d() != false) return;
        net.minecraft.client.Q.b(new net.minecraft.k.m[4]);
    }

    private boolean b(int n2) {
        int n3;
        block41: {
            int n4;
            block40: {
                net.minecraft.k.m[] arrm;
                block32: {
                    block33: {
                        boolean bl2;
                        block39: {
                            block36: {
                                block37: {
                                    block38: {
                                        block34: {
                                            block35: {
                                                block28: {
                                                    block29: {
                                                        block31: {
                                                            G g10;
                                                            block30: {
                                                                arrm = net.minecraft.client.Q.ag();
                                                                int n4 = n2;
                                                                n4 = 30;
                                                                if (arrm != null) {
                                                                    if (n3 == n4) {
                                                                        this.a2.d();
                                                                        this.a("debug.reload_chunks.message", new Object[0]);
                                                                        return true;
                                                                    }
                                                                    int n4 = n2;
                                                                    n4 = 48;
                                                                }
                                                                if (arrm != null) {
                                                                    if (n3 == n4) {
                                                                        boolean bl3 = this.Q.b();
                                                                        if (arrm != null) {
                                                                            bl3 = !bl3;
                                                                        }
                                                                        boolean bl4 = bl3;
                                                                        this.Q.c(bl4);
                                                                        this.a(bl4 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
                                                                        return true;
                                                                    }
                                                                    int n4 = n2;
                                                                    n4 = 32;
                                                                }
                                                                if (arrm == null) break block28;
                                                                if (n3 != n4) break block29;
                                                                g10 = this.n;
                                                                if (arrm == null) break block30;
                                                                if (g10 == null) break block31;
                                                                g10 = this.n;
                                                            }
                                                            g10.f().a(false);
                                                        }
                                                        return true;
                                                    }
                                                    int n4 = n2;
                                                    n4 = 33;
                                                }
                                                if (arrm != null) {
                                                    if (n3 == n4) {
                                                        int n5 = net.minecraft.client.b.L.o();
                                                        if (arrm != null) {
                                                            n5 = n5 != 0 ? -1 : 1;
                                                        }
                                                        this.ac.b(net.minecraft.client.l.f.RENDER_DISTANCE, n5);
                                                        this.a("debug.cycle_renderdistance.message", this.ac.bf);
                                                        return true;
                                                    }
                                                    int n4 = n2;
                                                    n4 = 34;
                                                }
                                                if (arrm != null) {
                                                    if (n3 == n4) {
                                                        boolean bl5 = this.ag.e();
                                                        this.a(bl5 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
                                                        return true;
                                                    }
                                                    int n4 = n2;
                                                    n4 = 35;
                                                }
                                                if (arrm != null) {
                                                    if (n3 == n4) {
                                                        boolean bl4 = this.ac.aP;
                                                        if (arrm != null) {
                                                            bl4 = !bl4;
                                                        }
                                                        this.ac.aP = bl4;
                                                        this.a(this.ac.aP ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
                                                        this.ac.e();
                                                        return true;
                                                    }
                                                    int n4 = n2;
                                                    n4 = 49;
                                                }
                                                if (arrm == null) break block32;
                                                if (n3 != n4) break block33;
                                                bl2 = this.s.a(2, "");
                                                if (arrm == null) break block34;
                                                if (bl2) break block35;
                                                this.a("debug.creative_spectator.error", new Object[0]);
                                                if (arrm != null) break block36;
                                            }
                                            bl2 = this.s.C();
                                        }
                                        if (arrm == null) break block37;
                                        if (!bl2) break block38;
                                        this.s.b("/gamemode spectator");
                                        if (arrm != null) break block36;
                                    }
                                    bl2 = this.s.ae();
                                }
                                if (arrm == null) break block39;
                                if (bl2) {
                                    this.s.b("/gamemode creative");
                                }
                            }
                            bl2 = true;
                        }
                        return bl2;
                    }
                    int n4 = n2;
                    n4 = 25;
                }
                if (arrm != null) {
                    if (n3 == n4) {
                        boolean bl5 = this.ac.ay;
                        if (arrm != null) {
                            bl5 = !bl5;
                        }
                        this.ac.ay = bl5;
                        this.ac.e();
                        this.a(this.ac.ay ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
                        return true;
                    }
                    int n4 = n2;
                    n4 = 16;
                }
                if (arrm == null) break block40;
                if (n3 == n4) {
                    this.a("debug.help.message", new Object[0]);
                    net.minecraft.client.b.I i2 = this.n.f();
                    i2.a(new net.minecraft.at.h("debug.reload_chunks.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.show_hitboxes.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.clear_chat.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.cycle_renderdistance.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.chunk_boundaries.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.advanced_tooltips.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.creative_spectator.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.pause_focus.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.help.help", new Object[0]));
                    i2.a(new net.minecraft.at.h("debug.reload_resourcepacks.help", new Object[0]));
                    return true;
                }
                n3 = n2;
                if (arrm == null) break block41;
                n4 = 20;
            }
            if (n3 == n4) {
                this.a("debug.reload_resourcepacks.message", new Object[0]);
                this.af();
                return true;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK() {
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Q q2 = y;
        if (arrm != null) {
            if (q2 == null) return false;
            q2 = y;
        }
        boolean bl2 = q2.ac.aC;
        if (arrm == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Exception decompiling
     */
    private void aE() {
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

    public float aC() {
        return this.a8.e;
    }

    public void v() {
        this.G();
    }

    public net.minecraft.client.j.u aN() {
        return this.am;
    }

    public void m() {
        this.aU = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private net.minecraft.w.d a(net.minecraft.w.d var1_1, y var2_2) {
        var4_3 = var2_2.a(new net.minecraft.P.r());
        var3_4 = net.minecraft.client.Q.ag();
        v0 = var1_1;
        if (var3_4 == null) ** GOTO lbl16
        if (v0.w() == net.minecraft.u.h.cp) {
            v1 = var4_3;
            if (var3_4 != null) {
                if (v1.b("Owner")) {
                    var5_5 = var4_3.h("Owner");
                    var6_7 = new net.minecraft.P.r();
                    var6_7.a("SkullOwner", var5_5);
                    var1_1.b(var6_7);
                    return var1_1;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var1_1;
lbl16:
            // 2 sources

            v0.a("BlockEntityTag", var4_3);
            v1 = new net.minecraft.P.r();
        }
        var5_6 = v1;
        var6_8 = new net.minecraft.P.u();
        var6_8.a(new net.minecraft.P.w("(+NBT)"));
        var5_6.a("Lore", var6_8);
        var1_1.a("display", var5_6);
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public net.minecraft.client.e.c aJ() {
        net.minecraft.client.e.c c10;
        block13: {
            boolean bl2;
            block12: {
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                Q q2 = this;
                if (arrm != null) {
                    if (q2.aO instanceof ae) {
                        return net.minecraft.client.e.c.CREDITS;
                    }
                    q2 = this;
                }
                c c11 = q2.s;
                if (arrm != null) {
                    if (c11 == null) return net.minecraft.client.e.c.MENU;
                    c11 = this.s;
                }
                bl2 = c11.aG.D instanceof net.minecraft.ah.I;
                if (arrm != null) {
                    if (bl2) {
                        return net.minecraft.client.e.c.NETHER;
                    }
                    bl2 = this.s.aG.D instanceof H;
                }
                if (arrm != null) {
                    if (bl2) {
                        net.minecraft.client.e.c c12;
                        if (this.n.g().a()) {
                            c12 = net.minecraft.client.e.c.END_BOSS;
                            return c12;
                        }
                        c12 = net.minecraft.client.e.c.END;
                        return c12;
                    }
                    bl2 = this.s.cw.g;
                }
                if (arrm == null) break block12;
                if (!bl2) break block13;
                bl2 = this.s.cw.d;
            }
            if (bl2) {
                c10 = net.minecraft.client.e.c.CREATIVE;
                return c10;
            }
        }
        c10 = net.minecraft.client.e.c.GAME;
        return c10;
    }

    public net.minecraft.aq.d h() {
        return this.aA;
    }

    private void a(String string) {
        block3: {
            int n2;
            int n3;
            block2: {
                n3 = net.minecraft.client.a.v.D();
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                n2 = n3;
                if (arrm == null) break block2;
                if (n2 == 0) break block3;
                n2 = n3;
            }
            String string2 = GLU.gluErrorString((int)n2);
            ak.error("########## GL ERROR ##########");
            ak.error("@ {}", (Object)string);
            ak.error("{}: {}", (Object)n3, (Object)string2);
        }
    }

    private void R() throws LWJGLException {
        block2: {
            block1: {
                boolean bl2;
                net.minecraft.k.m[] arrm;
                block0: {
                    arrm = net.minecraft.client.Q.ag();
                    bl2 = this.Z;
                    if (arrm == null) break block0;
                    if (!bl2) break block1;
                    bl2 = true;
                }
                Display.setFullscreen((boolean)bl2);
                DisplayMode displayMode = Display.getDisplayMode();
                this.P = Math.max(1, displayMode.getWidth());
                this.aT = Math.max(1, displayMode.getHeight());
                if (arrm != null) break block2;
            }
            Display.setDisplayMode((DisplayMode)new DisplayMode(this.P, this.aT));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void aG() {
        this.aU = true;
        var1_1 = net.minecraft.client.Q.ag();
        try {
            this.a();
        }
        catch (Throwable var2_2) {
            var3_7 = net.minecraft.c.f.a(var2_2, "Initializing game");
            var3_7.a("Initialization");
            this.a(this.c(var3_7));
            return;
        }
        try {
            block15: {
                while (this.aU) {
                    block17: {
                        block18: {
                            block16: {
                                v0 = this;
                                if (var1_1 == null) break block15;
                                if (var1_1 == null) ** GOTO lbl24
                                if (!v0.w) break block16;
                                v1 = this;
                                if (var1_1 == null) break block17;
                                if (v1.a_ != null) break block18;
                            }
                            try {
                                v2 = this;
lbl24:
                                // 2 sources

                                super.aw();
                                continue;
                            }
                            catch (OutOfMemoryError var2_3) {
                                this.T();
                                this.a(new aw());
                                System.gc();
                                if (var1_1 != null) continue;
                            }
                        }
                        v1 = this;
                    }
                    v1.a(this.a_);
                    if (var1_1 != null) continue;
                }
                v0 = this;
            }
            v0.az();
            return;
        }
        catch (a7 var2_4) {
            this.az();
            return;
        }
        catch (net.minecraft.ar.Z var2_5) {
            this.c(var2_5.a());
            this.T();
            net.minecraft.client.Q.ak.fatal("Reported exception thrown!", (Throwable)var2_5);
            this.a(var2_5.a());
            return;
            {
                catch (Throwable var4_9) {
                    throw var4_9;
                }
            }
            catch (Throwable var2_6) {
                var3_8 = this.c(new net.minecraft.c.f("Unexpected error", var2_6));
                this.T();
                net.minecraft.client.Q.ak.fatal("Unreported exception thrown!", var2_6);
                this.a(var3_8);
                this.az();
                return;
            }
        }
        finally {
            this.az();
        }
    }

    /*
     * Exception decompiling
     */
    private void aw() throws IOException {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void K() {
        block19: {
            block18: {
                var1_1 = net.minecraft.client.Q.ag();
                v0 = this.aW.b();
                if (var1_1 == null) break block18;
                if (v0 != false) return;
                this.U = 4;
                v1 = this;
                if (var1_1 == null) break block19;
                v0 = v1.s.D();
            }
            if (v0 != false) return;
            v1 = this;
        }
        if (v1.ao == null) {
            net.minecraft.client.Q.ak.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        var2_2 = net.minecraft.ar.a3.values();
        var3_3 = var2_2.length;
        var4_4 = 0;
        do {
            block22: {
                block23: {
                    block21: {
                        block20: {
                            if (var4_4 >= var3_3) return;
                            var5_5 = var2_2[var4_4];
                            var6_6 = this.s.c(var5_5);
                            if (this.ao == null) break block20;
                            v2 = net.minecraft.client.J.a[this.ao.d.ordinal()];
                            if (var1_1 == null) break block21;
                            switch (v2) {
                                case 1: {
                                    v3 = this.aW.a(this.s, this.ao.e, this.ao, var5_5);
                                    v4 = net.minecraft.ar.aX.SUCCESS;
                                    if (var1_1 != null) {
                                        if (v3 == v4) {
                                            return;
                                        }
                                        v3 = this.aW.a((net.minecraft.i.j)this.s, this.ao.e, var5_5);
                                        v4 = net.minecraft.ar.aX.SUCCESS;
                                    }
                                    if (v3 != v4) break;
                                    return;
                                }
                                case 2: {
                                    var7_7 = this.ao.a();
                                    if (this.e.d(var7_7).o() == net.minecraft.ac.c.A) break;
                                    v2 = var6_6.t();
                                    if (var1_1 == null) break block21;
                                    var8_8 = v2;
                                    var9_9 = this.aW.a(this.s, this.e, var7_7, this.ao.b, this.ao.c, var5_5);
                                    if (var9_9 != net.minecraft.ar.aX.SUCCESS) break;
                                    this.s.b(var5_5);
                                    v5 = var6_6.G();
                                    if (var1_1 != null) {
                                        if (v5 != 0) return;
                                        v5 = var6_6.t();
                                    }
                                    if (var1_1 == null) ** GOTO lbl54
                                    if (v5 != var8_8) ** GOTO lbl55
                                    v6 = this;
                                    if (var1_1 == null) ** GOTO lbl56
                                    v5 = v6.aW.f() ? 1 : 0;
lbl54:
                                    // 2 sources

                                    if (v5 == 0) return;
lbl55:
                                    // 2 sources

                                    v6 = this;
lbl56:
                                    // 2 sources

                                    v6.Y.U.a(var5_5);
                                    return;
                                }
                            }
                        }
                        v2 = var6_6.G();
                    }
                    if (v2 != 0) break block22;
                    v7 = this;
                    if (var1_1 == null) break block23;
                    if (v7.aW.a((net.minecraft.i.j)this.s, this.e, var5_5) != net.minecraft.ar.aX.SUCCESS) break block22;
                    v7 = this;
                }
                v7.Y.U.a(var5_5);
                return;
            }
            ++var4_4;
        } while (var1_1 != null);
    }

    public a4 aQ() {
        return this.Q;
    }

    @Override
    public boolean c() {
        return this.ac.a8;
    }

    private static String lambda$addGraphicsAndWorldToCrashReport$12() throws Exception {
        return "Client (map_client.txt)";
    }

    private static Stream lambda$null$3(net.minecraft.az.k k2) {
        return k2.d().a(null, net.minecraft.client.B.n.NORMAL).stream();
    }

    public r av() {
        return this.aQ;
    }

    public l aF() {
        return this.M;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public net.minecraft.client.D.p F() {
        return this.aB;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int L() {
        var1_1 = net.minecraft.client.Q.ag();
        v0 = this;
        if (var1_1 != null) {
            if (v0.e == null) {
                v0 = this;
                if (var1_1 != null) {
                    if (v0.aO != null) {
                        return 60;
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
        v1 = v0.ac.bo;
        return v1;
    }

    @Override
    public ListenableFuture<Object> a(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.a(Executors.callable(runnable));
    }

    public void a(boolean bl2) {
        this.E = bl2;
    }

    public m U() {
        return this.aV;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(net.minecraft.aq.d var1_1) {
        v0 = net.minecraft.client.Q.ag();
        var1_1.b("fps", net.minecraft.client.Q.aI);
        var2_2 = v0;
        var1_1.b("vsync_enabled", this.ac.br);
        var1_1.b("display_frequency", Display.getDisplayMode().getFrequency());
        var1_1.b("display_type", this.Z != false ? "fullscreen" : "windowed");
        var1_1.b("run_time", (net.minecraft.R.b.R() - var1_1.f()) / 60L * 1000L);
        var1_1.b("current_action", this.aP());
        v1 = this.ac;
        if (var2_2 == null) ** GOTO lbl15
        if (v1.bM == null) {
            v2 = "en_us";
        } else {
            v1 = this.ac;
lbl15:
            // 2 sources

            v2 = v1.bM;
        }
        var1_1.b("language", v2);
        var3_3 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
        v3 = var1_1;
        v4 = "endianness";
        v5 = var3_3;
        if (var2_2 != null) {
            v3.b(v4, v5);
            var1_1.b("subtitles", this.ac.a4);
            v3 = var1_1;
            v4 = "touch";
            v5 = this.ac.aZ != false ? "touch" : "mouse";
        }
        v3.b(v4, v5);
        var1_1.b("resource_packs", this.S.b().size());
        var4_4 = 0;
        for (i var6_6 : this.S.b()) {
            var1_1.b("resource_pack[" + var4_4++ + "]", var6_6.d());
            if (var2_2 == null) return;
            if (var2_2 != null) continue;
        }
        v6 = this.ba;
        if (var2_2 != null) {
            if (v6 == null) return;
            v6 = this.ba;
        }
        v7 = v6.a();
        if (var2_2 != null) {
            if (v7 == null) return;
            v7 = var1_1;
        }
        v7.b("snooper_partner", this.ba.a().g());
    }

    public boolean aM() {
        return this.Z;
    }

    public net.minecraft.client.a.d W() {
        return this.aL;
    }

    public String N() {
        return this.aq;
    }

    private void a(long l2) {
        block15: {
            DecimalFormat decimalFormat;
            int n2;
            int n3;
            Object object;
            int n4;
            int n5;
            net.minecraft.aq.e e10;
            List<net.minecraft.aq.e> list;
            net.minecraft.k.m[] arrm;
            block22: {
                String string;
                block20: {
                    block21: {
                        boolean bl2;
                        block19: {
                            net.minecraft.aq.b b10;
                            block18: {
                                arrm = net.minecraft.client.Q.ag();
                                b10 = this.an;
                                if (arrm == null) break block18;
                                if (!b10.g) break block15;
                                b10 = this.an;
                            }
                            list = b10.c(this.a0);
                            e10 = list.remove(0);
                            net.minecraft.client.a.v.h(256);
                            net.minecraft.client.a.v.q(5889);
                            net.minecraft.client.a.v.r();
                            net.minecraft.client.a.v.l();
                            net.minecraft.client.a.v.a(0.0, this.P, this.aT, 0.0, 1000.0, 3000.0);
                            net.minecraft.client.a.v.q(5888);
                            net.minecraft.client.a.v.l();
                            net.minecraft.client.a.v.b(0.0f, 0.0f, -2000.0f);
                            net.minecraft.client.a.v.d(1.0f);
                            net.minecraft.client.a.v.L();
                            W w2 = net.minecraft.client.a.W.c();
                            I i2 = w2.b();
                            int n6 = 160;
                            n5 = this.P - 160 - 10;
                            n4 = this.aT - 320;
                            net.minecraft.client.a.v.a();
                            i2.a(7, net.minecraft.client.y.b.i);
                            i2.c((double)((float)n5 - 176.0f), (double)((float)n4 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
                            i2.c((double)((float)n5 - 176.0f), (double)(n4 + 320), 0.0).b(200, 0, 0, 0).d();
                            i2.c((double)((float)n5 + 176.0f), (double)(n4 + 320), 0.0).b(200, 0, 0, 0).d();
                            i2.c((double)((float)n5 + 176.0f), (double)((float)n4 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
                            w2.a();
                            net.minecraft.client.a.v.f();
                            double d10 = 0.0;
                            int n7 = 0;
                            while (n7 < list.size()) {
                                block17: {
                                    float f10;
                                    float f11;
                                    float f12;
                                    int n8;
                                    int n9;
                                    int n10;
                                    int n11;
                                    block16: {
                                        object = list.get(n7);
                                        n3 = net.minecraft.k.h.f(((net.minecraft.aq.e)object).c / 4.0) + 1;
                                        i2.a(6, net.minecraft.client.y.b.i);
                                        n2 = ((net.minecraft.aq.e)object).a();
                                        n11 = n2 >> 16 & 0xFF;
                                        n10 = n2 >> 8 & 0xFF;
                                        n9 = n2 & 0xFF;
                                        i2.c((double)n5, (double)n4, 0.0).b(n11, n10, n9, 255).d();
                                        if (arrm == null) break block15;
                                        for (n8 = n3; n8 >= 0; --n8) {
                                            f12 = (float)((d10 + ((net.minecraft.aq.e)object).c * (double)n8 / (double)n3) * (Math.PI * 2) / 100.0);
                                            f11 = net.minecraft.k.h.g(f12) * 160.0f;
                                            f10 = net.minecraft.k.h.c(f12) * 160.0f * 0.5f;
                                            i2.c((double)((float)n5 + f11), (double)((float)n4 - f10), 0.0).b(n11, n10, n9, 255).d();
                                            if (arrm != null) {
                                                if (arrm != null) continue;
                                            }
                                            break block16;
                                        }
                                        w2.a();
                                        i2.a(5, net.minecraft.client.y.b.i);
                                    }
                                    for (n8 = n3; n8 >= 0; --n8) {
                                        f12 = (float)((d10 + ((net.minecraft.aq.e)object).c * (double)n8 / (double)n3) * (Math.PI * 2) / 100.0);
                                        f11 = net.minecraft.k.h.g(f12) * 160.0f;
                                        f10 = net.minecraft.k.h.c(f12) * 160.0f * 0.5f;
                                        i2.c((double)((float)n5 + f11), (double)((float)n4 - f10), 0.0).b(n11 >> 1, n10 >> 1, n9 >> 1, 255).d();
                                        i2.c((double)((float)n5 + f11), (double)((float)n4 - f10 + 10.0f), 0.0).b(n11 >> 1, n10 >> 1, n9 >> 1, 255).d();
                                        if (arrm != null) {
                                            if (arrm != null) continue;
                                        }
                                        break block17;
                                    }
                                    w2.a();
                                    d10 += ((net.minecraft.aq.e)object).c;
                                    ++n7;
                                }
                                if (arrm != null) continue;
                            }
                            decimalFormat = new DecimalFormat("##0.00");
                            net.minecraft.client.a.v.x();
                            object = "";
                            bl2 = "unspecified".equals(e10.b);
                            if (arrm == null) break block19;
                            if (!bl2) {
                                object = (String)object + "[0] ";
                            }
                            string = e10.b;
                            if (arrm == null) break block20;
                            bl2 = string.isEmpty();
                        }
                        if (!bl2) break block21;
                        object = (String)object + "ROOT ";
                        if (arrm != null) break block22;
                    }
                    string = (String)object + e10.b + ' ';
                }
                object = string;
            }
            n3 = 0xFFFFFF;
            this.a6.c((String)object, n5 - 160, n4 - 80 - 16, 0xFFFFFF);
            object = decimalFormat.format(e10.a) + "%";
            this.a6.c((String)object, n5 + 160 - this.a6.e((String)object), n4 - 80 - 16, 0xFFFFFF);
            for (n2 = 0; n2 < list.size(); ++n2) {
                StringBuilder stringBuilder;
                net.minecraft.aq.e e11;
                block25: {
                    block24: {
                        block23: {
                            e11 = list.get(n2);
                            stringBuilder = new StringBuilder();
                            if (arrm == null) break block23;
                            if (!"unspecified".equals(e11.b)) break block24;
                            stringBuilder.append("[?] ");
                        }
                        if (arrm != null) break block25;
                    }
                    stringBuilder.append("[").append(n2 + 1).append("] ");
                }
                String string = stringBuilder.append(e11.b).toString();
                this.a6.c(string, n5 - 160, n4 + 80 + n2 * 8 + 20, e11.a());
                string = decimalFormat.format(e11.c) + "%";
                this.a6.c(string, n5 + 160 - 50 - this.a6.e(string), n4 + 80 + n2 * 8 + 20, e11.a());
                string = decimalFormat.format(e11.a) + "%";
                this.a6.c(string, n5 + 160 - this.a6.e(string), n4 + 80 + n2 * 8 + 20, e11.a());
                if (arrm != null) continue;
            }
        }
    }

    public float aD() {
        return this.a8.e;
    }

    private void u() throws LWJGLException {
        Display.setResizable((boolean)true);
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Display.setTitle((String)("Celestial " + cj.h));
        net.minecraft.k.m[] arrm2 = arrm;
        try {
            Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException lWJGLException) {
            block7: {
                Q q2;
                block6: {
                    ak.error("Couldn't set pixel format", (Throwable)lWJGLException);
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    q2 = this;
                    if (arrm2 == null) break block6;
                    if (!q2.Z) break block7;
                    q2 = this;
                }
                q2.z();
            }
            Display.create();
        }
    }

    public void c() {
        this.o();
    }

    private void H() {
        block3: {
            x x2;
            block2: {
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                this.aH.a(this.P, this.aT);
                net.minecraft.k.m[] arrm2 = arrm;
                x2 = this.Y;
                if (arrm2 == null) break block2;
                if (x2 == null) break block3;
                x2 = this.Y;
            }
            x2.a(this.P, this.aT);
        }
    }

    private String aP() {
        block6: {
            net.minecraft.client.E.a a10;
            block5: {
                net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
                Q q2 = this;
                if (arrm != null) {
                    if (q2.ba != null) {
                        return this.ba.g() ? "hosting_lan" : "singleplayer";
                    }
                    q2 = this;
                }
                a10 = q2.p;
                if (arrm == null) break block5;
                if (a10 == null) break block6;
                a10 = this.p;
            }
            return a10.b() ? "playing_lan" : "multiplayer";
        }
        return "out_of_game";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean E() {
        boolean bl2;
        net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
        Q q2 = this;
        if (arrm != null) {
            if (q2.s != null) {
                bl2 = this.s.U();
                if (arrm == null) return bl2;
                if (bl2) return true;
            }
            q2 = this;
        }
        bl2 = q2.ac.aw;
        if (arrm == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public <T> net.minecraft.client.B.l<T> a(net.minecraft.client.B.h<T> h2) {
        return this.D.a(h2);
    }

    public void a(String string, String string2, @Nullable net.minecraft.ah.K k2) {
        Object object;
        Object object2;
        block18: {
            net.minecraft.k.m[] arrm;
            block24: {
                net.minecraft.ah.K k3;
                block23: {
                    net.minecraft.aw.w w2;
                    block22: {
                        block21: {
                            net.minecraft.aw.b b10;
                            block20: {
                                block19: {
                                    arrm = net.minecraft.client.Q.ag();
                                    if (arrm == null) break block19;
                                    if (cj.b.i.a(bZ.class).i()) break block20;
                                    this.a((net.minecraft.client.E.l)null);
                                }
                                System.gc();
                            }
                            if ((w2 = (b10 = this.k.a(string, false)).c()) != null) break block21;
                            k3 = k2;
                            if (arrm == null) break block22;
                            if (k3 != null) {
                                w2 = new net.minecraft.aw.w(k2, string);
                                b10.a(w2);
                            }
                        }
                        k3 = k2;
                    }
                    if (arrm == null) break block23;
                    if (k3 != null) break block24;
                    k3 = new net.minecraft.ah.K(w2);
                }
                k2 = k3;
            }
            try {
                object2 = new YggdrasilAuthenticationService(this.a7, UUID.randomUUID().toString());
                object = object2.createMinecraftSessionService();
                GameProfileRepository gameProfileRepository = object2.createProfileRepository();
                net.minecraft.a.o o2 = new net.minecraft.a.o(gameProfileRepository, new File(this.aJ, net.minecraft.R.b.B.getName()));
                net.minecraft.N.X.a(o2);
                net.minecraft.N.X.a((MinecraftSessionService)object);
                net.minecraft.a.o.a(false);
                this.ba = new net.minecraft.af.c(this, string, string2, k2, (YggdrasilAuthenticationService)object2, (MinecraftSessionService)object, gameProfileRepository, o2);
                this.ba.ax();
                this.ad = true;
            }
            catch (Throwable throwable) {
                net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Starting integrated server");
                net.minecraft.c.l l2 = f10.a("Starting integrated server");
                l2.a("Level ID", string);
                l2.a("Level Name", string2);
                throw new net.minecraft.ar.Z(f10);
            }
            this.ar.b(net.minecraft.client.D.h.a("menu.loadingLevel", new Object[0]));
            while (!this.ba.p()) {
                block27: {
                    block26: {
                        block25: {
                            object2 = this.ba.q();
                            if (arrm == null) break block18;
                            if (arrm == null) break block25;
                            if (object2 == null) break block26;
                            this.ar.a(net.minecraft.client.D.h.a((String)object2, new Object[0]));
                        }
                        if (arrm != null) break block27;
                    }
                    this.ar.a("");
                }
                try {
                    Thread.sleep(200L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                if (arrm != null) continue;
            }
            this.a(new aX());
        }
        object2 = this.ba.l().d();
        object = net.minecraft.C.u.a((SocketAddress)object2);
        ((net.minecraft.C.u)((Object)object)).a(new net.minecraft.client.o.p((net.minecraft.C.u)((Object)object), this, null));
        ((net.minecraft.C.u)((Object)object)).a(new net.minecraft.aa.a(object2.toString(), 0, net.minecraft.C.p.LOGIN));
        ((net.minecraft.C.u)((Object)object)).a(new net.minecraft.X.a(this.aR().c()));
        this.r = object;
    }

    public boolean n() {
        return this.ad;
    }

    public boolean x() {
        return this.aM;
    }

    protected void Q() {
        block6: {
            Q q2;
            block11: {
                int n2;
                block10: {
                    net.minecraft.k.m[] arrm;
                    block8: {
                        block9: {
                            int n3;
                            block7: {
                                block5: {
                                    arrm = net.minecraft.client.Q.ag();
                                    n3 = this.Z;
                                    if (arrm == null) break block5;
                                    if (n3 != 0) break block6;
                                    n3 = Display.wasResized();
                                }
                                if (arrm == null) break block7;
                                if (n3 == 0) break block6;
                                n3 = this.P;
                            }
                            int n4 = n3;
                            int n5 = this.aT;
                            this.P = Display.getWidth();
                            this.aT = Display.getHeight();
                            n2 = this.P;
                            if (arrm == null) break block8;
                            if (n2 != n4) break block9;
                            n2 = this.aT;
                            if (arrm == null) break block8;
                            if (n2 == n5) break block6;
                        }
                        n2 = this.P;
                    }
                    if (arrm == null) break block10;
                    if (n2 <= 0) {
                        this.P = 1;
                    }
                    q2 = this;
                    if (arrm == null) break block11;
                    n2 = q2.aT;
                }
                if (n2 <= 0) {
                    this.aT = 1;
                }
                q2 = this;
            }
            q2.a(this.P, this.aT);
        }
    }

    public void j() {
        this.B();
    }

    private static Iterable lambda$func_193986_ar$2(net.minecraft.w.d d10) {
        return Collections.singleton(net.minecraft.w.k.q.b(d10.w()));
    }

    private ByteBuffer a(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        block2: {
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
            byteBuffer = ByteBuffer.allocate(4 * arrn.length);
            int[] arrn2 = arrn;
            net.minecraft.k.m[] arrm = net.minecraft.client.Q.ag();
            for (int n2 : arrn2) {
                byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block2;
            }
            byteBuffer.flip();
        }
        return byteBuffer;
    }

    private void d() {
        M m2 = new M(this, "Timer hack thread");
        m2.setDaemon(true);
        m2.start();
    }

    public void T() {
        try {
            ap = new byte[0];
            this.a2.v();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            if (!cj.b.i.a(bZ.class).i()) {
                System.gc();
                this.a((net.minecraft.client.E.l)null);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }
}

