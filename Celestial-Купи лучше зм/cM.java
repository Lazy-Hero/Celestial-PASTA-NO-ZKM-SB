/*
 * Decompiled with CFR 0.150.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class cM {
    private /* synthetic */ Map<String, String> a;
    private /* synthetic */ byte[] d;
    private /* synthetic */ int b;
    private /* synthetic */ String c;

    public Map b() {
        return this.a;
    }

    public String a(String string) {
        return this.a.get(string);
    }

    public String c() {
        return this.c;
    }

    public byte[] a() {
        return this.d;
    }

    public cM(int n2, String string, Map map, byte[] arrby) {
        this.b = 0;
        this.c = null;
        this.a = new LinkedHashMap<String, String>();
        this.d = null;
        this.b = n2;
        this.c = string;
        this.a = map;
        this.d = arrby;
    }

    public int d() {
        return this.b;
    }
}

