/*
 * Decompiled with CFR 0.150.
 */
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class gg {
    public static final /* synthetic */ String l;
    private /* synthetic */ Proxy e;
    private /* synthetic */ String a;
    private /* synthetic */ byte[] f;
    private /* synthetic */ String n;
    public static final /* synthetic */ String i;
    public static final /* synthetic */ String h;
    private /* synthetic */ int k;
    private /* synthetic */ int c;
    private /* synthetic */ String j;
    private /* synthetic */ String d;
    private /* synthetic */ Map<String, String> b;
    public static final /* synthetic */ String m;
    public static final /* synthetic */ String g;

    public String b() {
        return this.n;
    }

    public gg(String string, int n2, Proxy proxy, String string2, String string3, String string4, Map<String, String> map, byte[] arrby) {
        this.j = null;
        this.c = 0;
        this.e = Proxy.NO_PROXY;
        this.a = null;
        this.n = null;
        this.d = null;
        this.b = new LinkedHashMap<String, String>();
        this.f = null;
        this.k = 0;
        this.j = string;
        this.c = n2;
        this.e = proxy;
        this.a = string2;
        this.n = string3;
        this.d = string4;
        this.b = map;
        this.f = arrby;
    }

    public int a() {
        return this.c;
    }

    public String i() {
        return this.a;
    }

    public Map<String, String> c() {
        return this.b;
    }

    public String f() {
        return this.d;
    }

    public void a(int n2) {
        this.k = n2;
    }

    public byte[] g() {
        return this.f;
    }

    static {
        m = "HEAD";
        g = "HTTP/1.1";
        h = "HTTP/1.0";
        l = "POST";
        i = "GET";
    }

    public String d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public Proxy h() {
        return this.e;
    }
}

