/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eE
extends el {
    private /* synthetic */ String n;
    private static final /* synthetic */ Pattern o;

    static {
        o = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");
    }

    @Override
    public boolean h(String string) {
        Matcher matcher = o.matcher(string);
        String string2 = dB.i();
        Matcher matcher2 = matcher;
        if (string2 != null) {
            if (!matcher2.matches()) {
                return false;
            }
            matcher2 = matcher;
        }
        String string3 = matcher2.group(2);
        return string3.matches(this.l());
    }

    public eE(String string, String string2, String string3, String string4, String[] arrstring, String string5) {
        super(string, string3, string4, arrstring, string5);
        this.n = null;
        this.n = string2;
    }

    @Override
    public String g() {
        return "const " + this.n + " " + this.l() + " = " + this.k() + "; // Shader option " + this.k();
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public static dB a(String string, String string2) {
        block12: {
            String string3;
            String[] arrstring;
            String string4;
            String string5;
            String string6;
            String string7;
            block13: {
                String string8;
                block11: {
                    String string9;
                    String string10;
                    block9: {
                        block10: {
                            Matcher matcher = o.matcher(string);
                            string8 = dB.i();
                            Matcher matcher2 = matcher;
                            if (string8 != null) {
                                if (!matcher2.matches()) {
                                    return null;
                                }
                                matcher2 = matcher;
                            }
                            string7 = matcher2.group(1);
                            string6 = matcher.group(2);
                            string5 = matcher.group(3);
                            string4 = matcher.group(4);
                            string9 = string10 = dQ.c(string4, "[", "]");
                            if (string8 == null) break block9;
                            if (string9 == null) break block10;
                            string9 = string10;
                            if (string8 == null) break block9;
                            if (string9.length() > 0) {
                                string4 = string4.replace(string10, "").trim();
                            }
                        }
                        string9 = string5;
                    }
                    arrstring = eE.a(string9, string10);
                    string3 = string6;
                    if (string8 == null) break block11;
                    if (string3 == null) break block12;
                    string3 = string6;
                }
                if (string8 == null) break block13;
                if (string3.length() <= 0) break block12;
                string3 = dQ.f(string2, "/shaders/");
            }
            string2 = string3;
            eE eE2 = new eE(string6, string7, string4, string5, arrstring, string2);
            return eE2;
        }
        return null;
    }
}

