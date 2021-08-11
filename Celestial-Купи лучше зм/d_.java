/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  org.lwjgl.input.Keyboard
 */
import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.io.IOException;
import java.net.Proxy;
import java.util.UUID;
import net.minecraft.ar.k;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import net.minecraft.client.w.c;
import net.minecraft.k.m;
import org.lwjgl.input.Keyboard;

public class d_
extends L {
    public /* synthetic */ String C;
    public static /* synthetic */ int E;
    private /* synthetic */ aq D;
    private /* synthetic */ dX G;
    private /* synthetic */ dX B;
    public static /* synthetic */ int H;
    public static /* synthetic */ String F;
    private /* synthetic */ db y;
    private final /* synthetic */ dz z;
    public static /* synthetic */ String A;

    public d_(L l2) {
        this.C = "";
        this.z = (dz)l2;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block9: {
            d_ d_2;
            block7: {
                block8: {
                    boolean bl2;
                    m[] arrm;
                    block5: {
                        block6: {
                            m[] arrm2 = net.minecraft.client.w.c.c();
                            dJ.b(0.0, 0.0, h, w, new Color(50, 45, 45, 255).getRGB());
                            arrm = arrm2;
                            this.m.ax.b("TheAltening", (float)h / 2.0f, 6.0f, 0xFFFFFF);
                            this.m.ax.b(this.C, (float)h / 2.0f, 18.0f, 0xFFFFFF);
                            this.y.h();
                            this.D.d();
                            bl2 = this.y.a().isEmpty();
                            if (arrm == null) break block5;
                            if (!bl2) break block6;
                            bl2 = this.y.c();
                            if (arrm == null) break block5;
                            if (!bl2) {
                                this.a(this.m.a6, "Api-Key", h / 2 - 96, 156, -7829368);
                            }
                        }
                        d_2 = this;
                        if (arrm == null) break block7;
                        bl2 = d_2.D.n().isEmpty();
                    }
                    if (!bl2) break block8;
                    d_2 = this;
                    if (arrm == null) break block7;
                    if (!d_2.D.b()) {
                        this.a(this.m.a6, "Token", h / 2 - 96, 86, -7829368);
                    }
                }
                d_2 = this;
            }
            super.a(n2, n3, f10);
            if (net.minecraft.k.m.d()) break block9;
            net.minecraft.client.w.c.b(new m[2]);
        }
    }

    @Override
    public void e() {
        this.y.l();
        this.D.i();
        super.e();
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        d_ d_2;
        block8: {
            int n3;
            block7: {
                m[] arrm = net.minecraft.client.w.c.c();
                n3 = 1;
                if (arrm != null) {
                    if (n3 == n2) {
                        this.m.a(this.z);
                        return;
                    }
                    n3 = this.y.j ? 1 : 0;
                }
                if (arrm == null) break block7;
                if (n3 != 0) {
                    this.y.a(c10, n2);
                }
                d_2 = this;
                if (arrm == null) break block8;
                n3 = d_2.D.h ? 1 : 0;
            }
            if (n3 != 0) {
                this.D.a(c10, n2);
            }
            d_2 = this;
        }
        super.a(c10, n2);
    }

    @Override
    public void a(s s2) throws IOException {
        m[] arrm = net.minecraft.client.w.c.c();
        int n2 = s2.h;
        if (arrm != null) {
            if (n2 == 0) {
                return;
            }
            n2 = s2.g;
        }
        switch (n2) {
            case 0: {
                this.m.a(this.z);
                if (arrm != null) break;
            }
            case 1: {
                String string = this.y.a();
                dO dO2 = new dO(string.contains("api") ? string : "");
                String string2 = string;
                if (arrm != null) {
                    string2 = string2.contains("api") ? string : "";
                }
                cj.a(string2);
                try {
                    this.C = "\u00a7cLogging in...";
                    dz.B.a(er.THEALTENING);
                    YggdrasilUserAuthentication yggdrasilUserAuthentication = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString()), Agent.MINECRAFT);
                    yggdrasilUserAuthentication.setUsername(dO2.b().b());
                    yggdrasilUserAuthentication.setPassword("gg");
                    yggdrasilUserAuthentication.logIn();
                    this.m.l = new k(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "legacy");
                    F = dO2.b().c().c();
                    H = dO2.b().c().f();
                    A = dO2.b().c().h();
                    E = dO2.b().c().e();
                    this.z.A = "\u00a7fYour name is now \u00a7a" + yggdrasilUserAuthentication.getSelectedProfile().getName() + "\u00a7f.";
                    this.m.a(this.z);
                    break;
                }
                catch (Throwable throwable) {
                    this.C = "\u00a7cFailed Login";
                    throwable.printStackTrace();
                    if (arrm != null) break;
                }
            }
            case 2: {
                try {
                    dz.B.a(er.THEALTENING);
                    this.C = "\u00a7cLogging in...";
                    YggdrasilUserAuthentication yggdrasilUserAuthentication = new YggdrasilUserAuthentication(new YggdrasilAuthenticationService(Proxy.NO_PROXY, ""), Agent.MINECRAFT);
                    yggdrasilUserAuthentication.setUsername(this.D.n());
                    yggdrasilUserAuthentication.setPassword("NeverHook");
                    yggdrasilUserAuthentication.logIn();
                    this.m.l = new k(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
                    this.z.A = "\u00a7fYour name is now \u00a7a" + yggdrasilUserAuthentication.getSelectedProfile().getName() + "f.";
                    this.m.a(this.z);
                    break;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    this.C = "\u00a7cThat Token cannot be used.";
                    if (arrm != null) break;
                }
            }
            case 3: {
                aV.a("https://thealtening.com/");
                break;
            }
        }
        super.a(s2);
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
        super.h();
    }

    @Override
    public void r() {
        a5 a52 = this.m.a6;
        Keyboard.enableRepeatEvents((boolean)true);
        this.G = new dX(2, h / 2 - 100, 105, "Login");
        this.t.add(this.G);
        this.B = new dX(1, h / 2 - 100, 175, "Generate");
        this.t.add(this.B);
        m[] arrm = net.minecraft.client.w.c.c();
        this.t.add(new dX(3, h / 2 - 100, w - 83, "Buy"));
        this.t.add(new dX(0, h / 2 - 100, w - 60, "Back"));
        this.D = new aq(666, a52, h / 2 - 100, 80, 200, 20);
        m[] arrm2 = arrm;
        this.D.k = Integer.MAX_VALUE;
        this.y = new db(a52, h / 2 - 100, 150, 200, 20);
        String string = cj.i();
        if (arrm2 != null) {
            string = string != null ? cj.i() : "";
        }
        this.y.b(string);
        this.y.h = 18;
        super.r();
        if (arrm2 == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    static {
        F = "none";
        A = "none";
        H = 0;
        E = 0;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        this.y.a(n2, n3, n4);
        this.D.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }
}

