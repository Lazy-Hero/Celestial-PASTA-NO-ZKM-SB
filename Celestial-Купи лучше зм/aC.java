/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class aC {
    private final /* synthetic */ Set<String> b;
    private final /* synthetic */ Map<String, String> a;
    private /* synthetic */ String c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public String a(String string) {
        return this.a.get(string);
    }

    public String[] c() {
        Set<String> set = this.a.keySet();
        String[] arrstring = set.toArray(new String[set.size()]);
        return arrstring;
    }

    public void a(aC aC2) {
        block3: {
            aC aC3;
            block2: {
                String string = dB.i();
                aC3 = aC2;
                if (string == null) break block2;
                if (aC3 == null) break block3;
                aC3 = this;
            }
            aC3.a.putAll(aC2.a);
        }
    }

    public void b(String string) {
        this.b.add(string);
    }

    public boolean c(String string) {
        return this.b.contains(string);
    }

    public void a(dB[] arrdB) {
        int n2 = 0;
        String string = dB.i();
        while (n2 < arrdB.length) {
            dB dB2 = arrdB[n2];
            String string2 = dB2.l();
            String string3 = this.a.get(string2);
            if (string != null) {
                if (string3 != null) {
                    dB2.d(string3);
                }
                ++n2;
            }
            if (string != null) continue;
        }
    }

    public void a(String string, String string2) {
        this.a.put(string, string2);
    }

    public aC(String string) {
        this.c = null;
        this.a = new HashMap<String, String>();
        this.b = new HashSet<String>();
        this.c = string;
    }

    public String b() {
        return this.c;
    }

    public void a(Collection<String> collection) {
        this.b.addAll(collection);
    }

    public Collection<String> a() {
        return new HashSet<String>(this.b);
    }
}

