/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.IOException;
import java.net.Proxy;
import net.minecraft.ar.k;
import net.minecraft.client.Q;

public final class g_
extends Thread {
    private final /* synthetic */ fQ b;
    private /* synthetic */ String a;
    private final /* synthetic */ Q c;

    @Override
    public void run() {
        block10: {
            k k2;
            int n2;
            block11: {
                block12: {
                    fQ fQ2;
                    block13: {
                        g_ g_2;
                        block8: {
                            block9: {
                                n2 = fQ.d();
                                g_2 = this;
                                if (n2 != 0) break block8;
                                if (!g_2.b.f().equals("")) break block9;
                                this.c.l = new k(this.b.c(), "", "", "mojang");
                                this.a = "\u00a7aLogged in. (" + (Object)ChatFormatting.RED + this.b.c() + (Object)ChatFormatting.GREEN + " - offline name)";
                                if (n2 == 0) break block10;
                            }
                            this.a = "\u00a7bLogging in...";
                            g_2 = this;
                        }
                        k2 = g_2.a(this.b.c(), this.b.f());
                        if (n2 != 0) break block11;
                        if (k2 != null) break block12;
                        this.a = "\u00a7cLogin failed!";
                        fQ2 = this.b;
                        if (n2 != 0) break block13;
                        if (!fQ2.a().equals((Object)d9.Unchecked)) break block10;
                        fQ2 = this.b;
                    }
                    fQ2.a(d9.NotWorking);
                    if (n2 == 0) break block10;
                }
                ek.a = new fQ(this.b.c(), this.b.f());
            }
            StringBuilder stringBuilder = new StringBuilder();
            String string = "\u00a7aLogged in. (";
            if (n2 == 0) {
                stringBuilder = stringBuilder.append(string);
                string = cj.b.i.a(ch.class).i() ? "Protected" : k2.b();
            }
            this.a = stringBuilder.append(string).append(")").toString();
            this.b.b(k2.b());
            this.c.l = k2;
            if (n2 == 0) {
                if (this.b.a().equals((Object)d9.Unchecked)) {
                    this.b.a(d9.Working);
                }
                try {
                    cj.c().a(c3.class).b();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public void a(String string) {
        this.a = string;
    }

    public g_(fQ fQ2) {
        super("Alt Login Thread");
        this.c = Q.P();
        this.b = fQ2;
        this.a = "\u00a77Waiting...";
    }

    public String a() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private k a(String string, String string2) {
        try {
            dz.B.a(er.MOJANG);
            YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
            YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
            yggdrasilUserAuthentication.setUsername(string);
            yggdrasilUserAuthentication.setPassword(string2);
            try {
                yggdrasilUserAuthentication.logIn();
                return new k(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
            }
            catch (AuthenticationException authenticationException) {
                authenticationException.printStackTrace();
                return null;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}

