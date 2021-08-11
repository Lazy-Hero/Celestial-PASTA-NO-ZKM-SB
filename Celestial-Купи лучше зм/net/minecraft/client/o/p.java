/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  io.netty.util.concurrent.GenericFutureListener
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.o;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import javax.annotation.Nullable;
import net.minecraft.C.u;
import net.minecraft.al.a;
import net.minecraft.ar.B;
import net.minecraft.as.l;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.ay.c;
import net.minecraft.ay.d;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.U;
import net.minecraft.client.b.aa;
import net.minecraft.client.o.b;
import net.minecraft.client.o.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p
implements a {
    private /* synthetic */ GameProfile b;
    private final /* synthetic */ Q e;
    private static final /* synthetic */ Logger a;
    @Nullable
    private final /* synthetic */ L d;
    private final /* synthetic */ u c;

    @Override
    public void a(net.minecraft.ay.b b10) {
        this.b = b10.a();
        this.c.a(net.minecraft.C.p.PLAY);
        this.c.a(new j(this.e, this.d, this.c, this.b));
    }

    @Override
    public void a(k k2) {
        block4: {
            p p2;
            block2: {
                block3: {
                    int[] arrn = j.b();
                    p2 = this;
                    if (arrn == null) break block2;
                    if (p2.d == null) break block3;
                    p2 = this;
                    if (arrn == null) break block2;
                    if (!(p2.d instanceof aa)) break block3;
                    this.e.a(new l(((aa)this.d).c(), "connect.failed", k2).d());
                    if (arrn != null) break block4;
                }
                p2 = this;
            }
            p2.e.a(new U(this.d, "connect.failed", k2));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(d var1_1) {
        block8: {
            block9: {
                var3_2 = B.b();
                var4_3 = var1_1.f();
                var5_4 = var1_1.a();
                var2_5 = j.b();
                var6_6 = new BigInteger(B.a(var4_3, var5_4, var3_2)).toString(16);
                v0 = this;
                if (var2_5 == null) ** GOTO lbl22
                if (v0.e.s() == null) break block9;
                v0 = this;
                if (var2_5 != null) {
                    if (v0.e.s().b()) {
                        try {
                            this.a().joinServer(this.e.aR().c(), this.e.aR().e(), var6_6);
                            break block8;
                        }
                        catch (AuthenticationException var7_7) {
                            p.a.warn("Couldn't connect to auth servers but will continue to join LAN");
                            if (var2_5 != null) break block8;
                        }
                    } else {
                        ** GOTO lbl19
                    }
                }
                ** GOTO lbl22
            }
            try {
                v0 = this;
lbl22:
                // 3 sources

                v0.a().joinServer(this.e.aR().c(), this.e.aR().e(), var6_6);
            }
            catch (AuthenticationUnavailableException var7_8) {
                this.c.a(new h("disconnect.loginFailedInfo", new Object[]{new h("disconnect.loginFailedInfo.serversUnavailable", new Object[0])}));
                return;
            }
            catch (InvalidCredentialsException var7_9) {
                this.c.a(new h("disconnect.loginFailedInfo", new Object[]{new h("disconnect.loginFailedInfo.invalidSession", new Object[0])}));
                return;
            }
            catch (AuthenticationException var7_10) {
                this.c.a(new h("disconnect.loginFailedInfo", new Object[]{var7_10.getMessage()}));
                return;
            }
        }
        this.c.a(new net.minecraft.X.b(var3_2, var5_4, var1_1.d()), new b(this, var3_2), new GenericFutureListener[0]);
    }

    static {
        a = LogManager.getLogger();
    }

    public p(u u2, Q q2, @Nullable L l2) {
        this.c = u2;
        this.e = q2;
        this.d = l2;
    }

    @Override
    public void a(net.minecraft.ay.a a10) {
        this.c.a(a10.a());
    }

    @Override
    public void a(c c10) {
        block3: {
            u u2;
            block2: {
                int[] arrn = j.b();
                u2 = this.c;
                if (arrn == null) break block2;
                if (u2.k()) break block3;
                u2 = this.c;
            }
            u2.a(c10.a());
        }
    }

    private MinecraftSessionService a() {
        return this.e.w();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static u a(p p2) {
        return p2.c;
    }
}

