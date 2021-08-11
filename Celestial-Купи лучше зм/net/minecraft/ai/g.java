/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  javax.annotation.Nullable
 */
package net.minecraft.ai;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import javax.annotation.Nullable;
import net.minecraft.ai.e;
import net.minecraft.ai.f;
import net.minecraft.ar.B;
import net.minecraft.at.h;

class g
extends Thread {
    final /* synthetic */ f a;

    @Override
    public void run() {
        block9: {
            GameProfile gameProfile = f.c(this.a);
            boolean bl2 = f.c();
            try {
                String string = new BigInteger(B.a("", f.b(this.a).i().getPublic(), f.a(this.a))).toString(16);
                f.a(this.a, f.b(this.a).b().hasJoinedServer(new GameProfile(null, gameProfile.getName()), string, this.a()));
                f f10 = this.a;
                if (!bl2) {
                    if (f.c(f10) != null) {
                        f.a().info("UUID of player {} is {}", (Object)f.c(this.a).getName(), (Object)f.c(this.a).getId());
                        f.a(this.a, e.READY_TO_ACCEPT);
                        if (!bl2) break block9;
                    }
                    f10 = this.a;
                }
                if (!bl2) {
                    if (f.b(f10).av()) {
                        f.a().warn("Failed to verify username but will let them in anyway!");
                        f.a(this.a, this.a.a(gameProfile));
                        f.a(this.a, e.READY_TO_ACCEPT);
                        if (!bl2) break block9;
                    }
                    f10 = this.a;
                }
                f10.b(new h("multiplayer.disconnect.unverified_username", new Object[0]));
                f.a().error("Username '{}' tried to join with an invalid session", (Object)gameProfile.getName());
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                f f11 = this.a;
                if (!bl2) {
                    if (f.b(f11).av()) {
                        f.a().warn("Authentication servers are down but will let them in anyway!");
                        f.a(this.a, this.a.a(gameProfile));
                        f.a(this.a, e.READY_TO_ACCEPT);
                        if (!bl2) break block9;
                    }
                    f11 = this.a;
                }
                f11.b(new h("multiplayer.disconnect.authservers_down", new Object[0]));
                f.a().error("Couldn't verify username because servers are unavailable");
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private InetAddress a() {
        SocketAddress socketAddress;
        block3: {
            boolean bl2;
            SocketAddress socketAddress2;
            block2: {
                socketAddress2 = this.a.l.a();
                boolean bl3 = f.f();
                bl2 = f.b(this.a).ad();
                if (!bl3) break block2;
                if (!bl2) return null;
                socketAddress = socketAddress2;
                if (!bl3) break block3;
                bl2 = socketAddress instanceof InetSocketAddress;
            }
            if (!bl2) return null;
            socketAddress = socketAddress2;
        }
        InetAddress inetAddress = ((InetSocketAddress)socketAddress).getAddress();
        return inetAddress;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    g(f f10, String string) {
        this.a = f10;
        super(string);
    }
}

