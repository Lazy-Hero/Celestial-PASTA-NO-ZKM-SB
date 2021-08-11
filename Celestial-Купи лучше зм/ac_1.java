/*
 * Decompiled with CFR 0.150.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import net.minecraft.k.m;

public class ac {
    private /* synthetic */ er a;
    private static /* synthetic */ m[] b;
    private final /* synthetic */ g7 d;
    private final /* synthetic */ g7 c;

    private URL b(String string) {
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("Couldn't create constant for " + string, malformedURLException);
        }
    }

    static {
        if (ac.b() != null) {
            ac.b(new m[3]);
        }
    }

    public static m[] b() {
        return b;
    }

    public void a(er er2) throws NoSuchFieldException, IllegalAccessException {
        m[] arrm = ac.b();
        ac ac2 = this;
        if (arrm == null) {
            if (ac2.a == er2) {
                return;
            }
            this.a(er2.a);
            ac2 = this;
        }
        ac2.a = er2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a(String string) throws IllegalAccessException, NoSuchFieldException {
        HashMap<String, URL> hashMap = new HashMap<String, URL>();
        m[] arrm = ac.b();
        String string2 = string;
        if (arrm == null) {
            string2 = string2.contains("thealtening") ? "http" : "https";
        }
        String string3 = string2;
        hashMap.put("ROUTE_AUTHENTICATE", this.b(string3 + "://authserver." + string + ".com/authenticate"));
        hashMap.put("ROUTE_INVALIDATE", this.b(string3 + "://authserver" + string + "com/invalidate"));
        hashMap.put("ROUTE_REFRESH", this.b(string3 + "://authserver." + string + ".com/refresh"));
        hashMap.put("ROUTE_VALIDATE", this.b(string3 + "://authserver." + string + ".com/validate"));
        hashMap.put("ROUTE_SIGNOUT", this.b(string3 + "://authserver." + string + ".com/signout"));
        hashMap.forEach((arg_0, arg_1) -> this.lambda$reflectionFields$0(arg_0, arg_1));
        this.d.a("BASE_URL", string3 + "://authserver." + string + ".com/");
        this.c.a("BASE_URL", string3 + "://sessionserver." + string + ".com/session/minecraft/");
        this.c.a("JOIN_URL", this.b(string3 + "://sessionserver." + string + ".com/session/minecraft/join"));
        this.c.a("CHECK_URL", this.b(string3 + "://sessionserver." + string + ".com/session/minecraft/hasJoined"));
        this.c.a("WHITELISTED_DOMAINS", new String[]{".minecraft.net", ".mojang.com", ".thealtening.com"});
    }

    public ac() {
        this.d = new g7("com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication");
        this.c = new g7("com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService");
    }

    public er a() {
        m[] arrm = ac.b();
        er er2 = this.a;
        if (arrm == null) {
            if (er2 == null) {
                this.a = er.MOJANG;
            }
            er2 = this.a;
        }
        return er2;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    private void lambda$reflectionFields$0(String string, URL uRL) {
        try {
            this.d.a(string, uRL);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

