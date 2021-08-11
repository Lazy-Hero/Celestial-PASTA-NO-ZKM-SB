/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 */
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import net.minecraft.at.l;

class aQ
extends Thread {
    private final /* synthetic */ String c;
    private final /* synthetic */ String b;
    final /* synthetic */ dh a;

    aQ(dh dh2, String string, String string2) {
        this.a = dh2;
        this.b = string;
        this.c = string2;
        dh.a(dh2, (Object)((Object)l.GRAY) + "Idle...");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void run() {
        block4: {
            aQ aQ2;
            block2: {
                block3: {
                    int n2 = fQ.d();
                    aQ2 = this;
                    if (n2 != 0) break block2;
                    if (!aQ2.c.equals("")) break block3;
                    ek.b.add(new fQ(this.b, ""));
                    dh.a(this.a, (Object)((Object)l.GREEN) + "Alt added. (" + this.b + " - offline name)");
                    if (n2 == 0) break block4;
                }
                dh.a(this.a, (Object)((Object)l.AQUA) + "Trying alt...");
                aQ2 = this;
            }
            aQ2.a(this.b, this.c);
        }
    }

    private void a(String string, String string2) {
        try {
            YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
            YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
            yggdrasilUserAuthentication.setUsername(string);
            yggdrasilUserAuthentication.setPassword(string2);
            try {
                yggdrasilUserAuthentication.logIn();
                ek.b.add(new fQ(string, string2, yggdrasilUserAuthentication.getSelectedProfile().getName(), d9.Working));
                try {
                    cj.c().a(c3.class).b();
                }
                catch (Exception exception) {
                    // empty catch block
                }
                dh.a(this.a, "Alt added. (" + string + ")");
            }
            catch (AuthenticationException authenticationException) {
                dh.a(this.a, (Object)((Object)l.RED) + "Alt failed!");
                authenticationException.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            dh.a(this.a, (Object)((Object)l.RED) + "Error 1 :(");
            throwable.printStackTrace();
        }
    }
}

