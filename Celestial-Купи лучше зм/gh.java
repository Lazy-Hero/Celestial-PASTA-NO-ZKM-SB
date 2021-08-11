/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class gh {
    public static final /* synthetic */ String c;
    public static final /* synthetic */ String j;
    public static final /* synthetic */ String h;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String d;
    public static final /* synthetic */ String f;
    public static final /* synthetic */ String a;
    private static final /* synthetic */ Map b;
    public static final /* synthetic */ String g;
    public static final /* synthetic */ String e;

    private static String b(String string, int n2, Proxy proxy) {
        String string2 = string + ":" + n2 + "-" + proxy;
        return string2;
    }

    static {
        g = "keep-alive";
        i = "Transfer-Encoding";
        c = "Keep-Alive";
        f = "User-Agent";
        h = "Host";
        d = "Location";
        j = "Accept";
        e = "Connection";
        a = "chunked";
        b = new HashMap();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cM a(gg gg2) throws IOException {
        HashMap hashMap = new HashMap();
        String string = "Response";
        String string2 = "Exception";
        String string3 = K.d();
        ap ap2 = new ap(hashMap);
        HashMap hashMap2 = hashMap;
        synchronized (hashMap2) {
            cM cM2;
            Exception exception;
            block18: {
                block19: {
                    Exception exception2;
                    block21: {
                        boolean bl2;
                        Exception exception3;
                        block20: {
                            eC eC2 = new eC(gg2, ap2);
                            gh.a(eC2);
                            try {
                                hashMap.wait();
                            }
                            catch (InterruptedException interruptedException) {
                                throw new InterruptedIOException("Interrupted");
                            }
                            exception = exception3 = (Exception)hashMap.get("Exception");
                            if (string3 != null) break block18;
                            if (exception == null) break block19;
                            bl2 = exception3 instanceof IOException;
                            if (string3 != null) break block20;
                            if (bl2) {
                                throw (IOException)exception3;
                            }
                            exception2 = exception3;
                            if (string3 != null) break block21;
                            bl2 = exception2 instanceof RuntimeException;
                        }
                        if (!bl2) {
                            throw new RuntimeException(exception3.getMessage(), exception3);
                        }
                        exception2 = exception3;
                    }
                    throw (RuntimeException)exception2;
                }
                exception = hashMap.get("Response");
            }
            cM cM3 = cM2 = (cM)((Object)exception);
            if (string3 == null) {
                if (cM3 == null) {
                    throw new IOException("Response is null");
                }
                cM3 = cM2;
            }
            return cM3;
        }
    }

    public static byte[] b(String string, Proxy proxy) throws IOException {
        cM cM2;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3.startsWith("file:")) {
                URL uRL = new URL(string);
                InputStream inputStream = uRL.openStream();
                byte[] arrby = fU.b(inputStream);
                return arrby;
            }
            string3 = string;
        }
        gg gg2 = gh.a(string3, proxy);
        cM cM3 = cM2 = gh.a(gg2);
        if (string2 == null) {
            if (cM3.d() / 100 != 2) {
                throw new IOException("HTTP response: " + cM2.d());
            }
            cM3 = cM2;
        }
        return cM3.a();
    }

    public static byte[] a(String string) throws IOException {
        return gh.b(string, Proxy.NO_PROXY);
    }

    private static synchronized a_ a(String string, int n2, Proxy proxy) {
        a_ a_2;
        String string2 = gh.b(string, n2, proxy);
        String string3 = K.d();
        a_ a_3 = a_2 = (a_)b.get(string2);
        if (string3 == null) {
            if (a_3 == null) {
                a_2 = new a_(string, n2, proxy);
                b.put(string2, a_2);
            }
            a_3 = a_2;
        }
        return a_3;
    }

    public static boolean a() {
        boolean bl2;
        block3: {
            Iterator iterator = b.values().iterator();
            String string = K.d();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        Object v2 = iterator.next();
                        bl2 = ((a_)v2).h();
                        if (string != null) break block3;
                        if (string != null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void a(String string, gw gw2) throws IOException {
        gh.a(string, gw2, Proxy.NO_PROXY);
    }

    private static synchronized void a(String string, int n2, Proxy proxy, a_ a_2) {
        String string2 = gh.b(string, n2, proxy);
        a_ a_3 = (a_)b.get(string2);
        String string3 = K.d();
        a_ a_4 = a_3;
        if (string3 == null && a_4 == a_2) {
            a_4 = b.remove(string2);
        }
    }

    public static void a(String string, gw gw2, Proxy proxy) throws IOException {
        gg gg2 = gh.a(string, proxy);
        eC eC2 = new eC(gg2, gw2);
        gh.a(eC2);
    }

    public static gg a(String string, Proxy proxy) throws IOException {
        int n2;
        String string2;
        String string3;
        block6: {
            int n3;
            block5: {
                URL uRL = new URL(string);
                String string4 = K.d();
                String string5 = uRL.getProtocol();
                if (string4 == null) {
                    if (!string5.equals("http")) {
                        throw new IOException("Only protocol http is supported: " + uRL);
                    }
                    string5 = uRL.getFile();
                }
                string3 = string5;
                string2 = uRL.getHost();
                n3 = n2 = uRL.getPort();
                if (string4 != null) break block5;
                if (n3 > 0) break block6;
                n3 = 80;
            }
            n2 = n3;
        }
        String string6 = "GET";
        String string7 = "HTTP/1.1";
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("User-Agent", "Java/" + System.getProperty("java.version"));
        linkedHashMap.put("Host", string2);
        linkedHashMap.put("Accept", "text/html, image/gif, image/png");
        linkedHashMap.put("Connection", "keep-alive");
        byte[] arrby = new byte[]{};
        gg gg2 = new gg(string2, n2, proxy, string6, string3, string7, linkedHashMap, arrby);
        return gg2;
    }

    public static void a(eC eC2) {
        gg gg2 = eC2.a();
        a_ a_2 = gh.a(gg2.d(), gg2.a(), gg2.h());
        String string = K.d();
        while (!a_2.b(eC2)) {
            gh.a(gg2.d(), gg2.a(), gg2.h(), a_2);
            a_2 = gh.a(gg2.d(), gg2.a(), gg2.h());
            if (string == null) continue;
        }
    }
}

