/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class d8
extends dB {
    private /* synthetic */ aC[] p;
    private /* synthetic */ dB[] m;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ String n;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String f(String string) {
        String string2;
        String string3 = dB.i();
        String string4 = string;
        String string5 = "<custom>";
        if (string3 != null) {
            if (string4.equals(string5)) {
                string2 = gl.a("of.general.custom", "<custom>");
                return string2;
            }
            string4 = "profile." + string;
            string5 = string;
        }
        string2 = cS.b(string4, string5);
        return string2;
    }

    private static String[] a(aC[] arraC) {
        ArrayList<String> arrayList;
        block2: {
            arrayList = new ArrayList<String>();
            String string = dB.i();
            for (int i2 = 0; i2 < arraC.length; ++i2) {
                aC aC2 = arraC[i2];
                arrayList.add(aC2.b());
                if (string != null) {
                    if (string != null) continue;
                }
                break block2;
            }
            arrayList.add("<custom>");
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    static {
        n = "<profile>";
        o = "<custom>";
    }

    public d8(aC[] arraC, dB[] arrdB) {
        super("<profile>", "", d8.a(arraC, arrdB), d8.a(arraC), d8.a(arraC, arrdB, true), null);
        this.p = null;
        this.m = null;
        this.p = arraC;
        this.m = arrdB;
    }

    private static String a(aC[] arraC, dB[] arrdB) {
        return d8.a(arraC, arrdB, false);
    }

    private dB a(String string) {
        int n2 = 0;
        String string2 = dB.i();
        while (n2 < this.m.length) {
            dB dB2 = this.m[n2];
            if (string2 != null) {
                if (dB2.l().equals(string)) {
                    return dB2;
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    @Override
    public void m() {
        String string = dB.i();
        super.m();
        String string2 = string;
        d8 d82 = this;
        if (string2 != null) {
            if (d82.k().equals("<custom>")) {
                super.m();
            }
            d82 = this;
        }
        d82.b();
    }

    private aC b(String string) {
        int n2 = 0;
        String string2 = dB.i();
        while (n2 < this.p.length) {
            aC aC2 = this.p[n2];
            if (string2 != null) {
                if (aC2.b().equals(string)) {
                    return aC2;
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(aC[] arraC, dB[] arrdB, boolean bl2) {
        aC aC2 = ds.a(arraC, arrdB, bl2);
        String string = dB.i();
        aC aC3 = aC2;
        if (string != null) {
            if (aC3 == null) {
                return "<custom>";
            }
            aC3 = aC2;
        }
        String string2 = aC3.b();
        return string2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a() {
        block4: {
            block3: {
                aC aC2;
                block2: {
                    aC aC3 = this.b(this.k());
                    String string = dB.i();
                    aC2 = aC3;
                    if (string == null) break block2;
                    if (aC2 == null) break block3;
                    aC2 = aC3;
                }
                if (ds.a(aC2, this.m, false)) break block4;
            }
            String string = d8.a(this.p, this.m);
            this.d(string);
        }
    }

    @Override
    public String c() {
        return gl.a("of.shaders.profile");
    }

    private void b() {
        block7: {
            aC aC2;
            String string;
            aC aC3;
            block6: {
                aC3 = this.b(this.k());
                string = dB.i();
                aC2 = aC3;
                if (string == null) break block6;
                if (aC2 == null) break block7;
                aC2 = aC3;
            }
            String[] arrstring = aC2.c();
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string2 = arrstring[n2];
                dB dB2 = this.a(string2);
                if (string != null) {
                    if (dB2 != null) {
                        String string3 = aC3.a(string2);
                        dB2.d(string3);
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
        }
    }

    @Override
    public String e(String string) {
        String string2 = dB.i();
        String string3 = string;
        if (string2 != null) {
            string3 = string3.equals("<custom>") ? "\u00a7c" : "\u00a7a";
        }
        return string3;
    }
}

