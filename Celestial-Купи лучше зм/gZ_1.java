/*
 * Decompiled with CFR 0.150.
 */
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class gZ
implements X509TrustManager {
    final /* synthetic */ al a;

    @Override
    public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    gZ(al al2) {
        this.a = al2;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
    }
}

