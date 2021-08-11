/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ai;

import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.C.u;
import net.minecraft.ai.a;
import net.minecraft.ai.e;
import net.minecraft.ai.g;
import net.minecraft.ar.ao;
import net.minecraft.at.h;
import net.minecraft.ay.b;
import net.minecraft.ay.c;
import net.minecraft.ay.d;
import net.minecraft.i.k;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f
implements net.minecraft.al.b,
ao {
    public final /* synthetic */ u l;
    private /* synthetic */ e d;
    private /* synthetic */ int h;
    private final /* synthetic */ String n = "";
    private /* synthetic */ k i;
    private static final /* synthetic */ AtomicInteger k;
    private /* synthetic */ GameProfile m;
    private static final /* synthetic */ Random j;
    private /* synthetic */ SecretKey g;
    private final /* synthetic */ byte[] e;
    private final /* synthetic */ net.minecraft.R.b c;
    private static final /* synthetic */ Logger f;
    private static /* synthetic */ boolean b;

    /*
     * Enabled aggressive block sorting
     */
    public String d() {
        String string;
        boolean bl2 = net.minecraft.ai.f.c();
        f f10 = this;
        if (!bl2) {
            if (f10.m != null) {
                string = (Object)this.m + " (" + this.l.a() + ")";
                return string;
            }
            f10 = this;
        }
        string = String.valueOf(f10.l.a());
        return string;
    }

    @Override
    public void a(net.minecraft.X.a a10) {
        block4: {
            block2: {
                f f10;
                block3: {
                    boolean bl2 = net.minecraft.ai.f.f();
                    Validate.validState((this.d == net.minecraft.ai.e.HELLO ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
                    this.m = a10.c();
                    f10 = this;
                    if (!bl2) break block2;
                    if (!f10.c.ah()) break block3;
                    f10 = this;
                    if (!bl2) break block2;
                    if (f10.l.k()) break block3;
                    this.d = net.minecraft.ai.e.KEY;
                    this.l.a(new d("", this.c.i().getPublic(), this.e));
                    if (bl2) break block4;
                }
                f10 = this;
            }
            f10.d = net.minecraft.ai.e.READY_TO_ACCEPT;
        }
    }

    static GameProfile c(f f10) {
        return f10.m;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    protected GameProfile a(GameProfile gameProfile) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(StandardCharsets.UTF_8));
        return new GameProfile(uUID, gameProfile.getName());
    }

    static e a(f f10, e e10) {
        f10.d = e10;
        return f10.d;
    }

    @Override
    public void a(net.minecraft.X.b b10) {
        boolean bl2 = net.minecraft.ai.f.c();
        Validate.validState((this.d == net.minecraft.ai.e.KEY ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        PrivateKey privateKey = this.c.i().getPrivate();
        f f10 = this;
        if (!bl2) {
            if (!Arrays.equals(f10.e, b10.a(privateKey))) {
                throw new IllegalStateException("Invalid nonce!");
            }
            this.g = b10.b(privateKey);
            this.d = net.minecraft.ai.e.AUTHENTICATING;
            f10 = this;
        }
        f10.l.a(this.g);
        new g(this, "User Authenticator #" + k.incrementAndGet()).start();
        if (bl2) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    static {
        k = new AtomicInteger(0);
        f = LogManager.getLogger();
        net.minecraft.ai.f.b(true);
        j = new Random();
    }

    static SecretKey a(f f10) {
        return f10.g;
    }

    public static boolean f() {
        return b;
    }

    static Logger a() {
        return f;
    }

    public void b(net.minecraft.at.k k2) {
        try {
            f.info("Disconnecting {}: {}", (Object)this.d(), (Object)k2.f());
            this.l.a(new net.minecraft.ay.a(k2));
            this.l.a(k2);
        }
        catch (Exception exception) {
            f.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public static boolean c() {
        boolean bl2 = net.minecraft.ai.f.f();
        return !bl2;
    }

    public f(net.minecraft.R.b b10, u u2) {
        this.e = new byte[4];
        this.d = net.minecraft.ai.e.HELLO;
        this.n = "";
        this.c = b10;
        this.l = u2;
        j.nextBytes(this.e);
    }

    public void e() {
        boolean bl2;
        block12: {
            block17: {
                block16: {
                    net.minecraft.R.b b10;
                    block13: {
                        u u2;
                        block15: {
                            block14: {
                                block10: {
                                    block11: {
                                        bl2 = net.minecraft.ai.f.c();
                                        f f10 = this;
                                        if (!bl2) {
                                            if (!f10.m.isComplete()) {
                                                this.m = this.a(this.m);
                                            }
                                            f10 = this;
                                        }
                                        String string = f10.c.O().a(this.l.a(), this.m);
                                        if (bl2) break block10;
                                        if (string == null) break block11;
                                        this.b(new h(string, new Object[0]));
                                        if (!bl2) break block12;
                                    }
                                    this.d = net.minecraft.ai.e.ACCEPTED;
                                }
                                b10 = this.c;
                                if (bl2) break block13;
                                if (b10.C() < 0) break block14;
                                u2 = this.l;
                                if (bl2) break block15;
                                if (!u2.k()) {
                                    this.l.a(new c(this.c.C()), (GenericFutureListener<? extends Future<? super Void>>)new a(this), new GenericFutureListener[0]);
                                }
                            }
                            u2 = this.l;
                        }
                        u2.a(new b(this.m));
                        b10 = this.c;
                    }
                    k k2 = b10.O().a(this.m.getId());
                    if (bl2) break block16;
                    if (k2 == null) break block17;
                    this.d = net.minecraft.ai.e.DELAY_ACCEPT;
                    this.i = this.c.O().h(this.m);
                }
                if (!bl2) break block12;
            }
            this.c.O().a(this.l, this.c.O().h(this.m));
        }
        if (net.minecraft.k.m.c()) {
            net.minecraft.ai.f.b(!bl2);
        }
    }

    static GameProfile a(f f10, GameProfile gameProfile) {
        f10.m = gameProfile;
        return f10.m;
    }

    @Override
    public void c() {
        block12: {
            f f10;
            block11: {
                boolean bl2;
                block10: {
                    block9: {
                        e e10;
                        e e11;
                        block7: {
                            block8: {
                                bl2 = net.minecraft.ai.f.f();
                                e11 = this.d;
                                e10 = net.minecraft.ai.e.READY_TO_ACCEPT;
                                if (!bl2) break block7;
                                if (e11 != e10) break block8;
                                this.e();
                                if (bl2) break block9;
                            }
                            f10 = this;
                            if (!bl2) break block10;
                            e11 = f10.d;
                            e10 = net.minecraft.ai.e.DELAY_ACCEPT;
                        }
                        if (e11 != e10) break block9;
                        f10 = this;
                        if (!bl2) break block10;
                        k k2 = f10.c.O().a(this.m.getId());
                        if (k2 == null) {
                            this.d = net.minecraft.ai.e.READY_TO_ACCEPT;
                            this.c.O().a(this.l, this.i);
                            this.i = null;
                        }
                    }
                    f10 = this;
                }
                if (!bl2) break block11;
                if (f10.h++ != 600) break block12;
                f10 = this;
            }
            f10.b(new h("multiplayer.disconnect.slow_login", new Object[0]));
        }
    }

    static net.minecraft.R.b b(f f10) {
        return f10.c;
    }

    @Override
    public void a(net.minecraft.at.k k2) {
        f.info("{} lost connection: {}", (Object)this.d(), (Object)k2.f());
    }
}

