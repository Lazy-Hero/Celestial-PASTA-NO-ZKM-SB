/*
 * Decompiled with CFR 0.150.
 */
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import net.minecraft.k.m;

public class al {
    private /* synthetic */ boolean c;
    private static /* synthetic */ String[] b;

    static {
        if (al.c() != null) {
            al.b(new String[2]);
        }
    }

    public void d() {
        block3: {
            block2: {
                String[] arrstring = al.c();
                al al2 = this;
                if (arrstring != null) break block2;
                if (al2.c) break block3;
                this.b();
                this.a();
                al2 = this;
            }
            al2.c = true;
        }
    }

    private void a() {
        HttpsURLConnection.setDefaultHostnameVerifier(al::lambda$whitelistTheAltening$0);
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] c() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lambda$whitelistTheAltening$0(String string, SSLSession sSLSession) {
        String[] arrstring = al.c();
        boolean bl2 = string.equals("authserver.thealtening.com");
        if (arrstring != null) return bl2;
        if (bl2) return true;
        bl2 = string.equals("sessionserver.thealtening.com");
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void b() {
        TrustManager[] arrtrustManager = new TrustManager[]{new gZ(this)};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, arrtrustManager, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public al() {
        block0: {
            this.c = false;
            String[] arrstring = al.c();
            if (!m.c()) break block0;
            al.b(new String[1]);
        }
    }
}

