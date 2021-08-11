/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class el
extends dB {
    private static final /* synthetic */ Pattern m;

    @Override
    public String g() {
        return "#define " + this.l() + " " + this.k() + " // Shader option " + this.k();
    }

    public static String[] a(String string, String string2) {
        Object[] arrobject;
        block10: {
            int n2;
            Object[] arrobject2;
            block9: {
                String[] arrstring = new String[]{string};
                String string3 = dB.i();
                String string4 = string2;
                if (string3 != null) {
                    if (string4 == null) {
                        return arrstring;
                    }
                    string2 = string2.trim();
                    string2 = dQ.f(string2, "[");
                    string2 = dQ.g(string2, "]");
                    string4 = string2 = string2.trim();
                }
                if (string3 != null) {
                    if (string4.length() <= 0) {
                        return arrstring;
                    }
                    string4 = string2;
                }
                arrobject2 = fU.c(string4, " ");
                n2 = arrobject2.length;
                if (string3 == null) break block9;
                if (n2 <= 0) {
                    return arrstring;
                }
                arrobject = arrobject2;
                if (string3 == null) break block10;
                n2 = Arrays.asList(arrobject).contains(string) ? 1 : 0;
            }
            if (n2 == 0) {
                arrobject2 = (String[])fU.a(arrobject2, string, 0);
            }
            arrobject = arrobject2;
        }
        return arrobject;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String e(String string) {
        String string2 = string.toLowerCase();
        String string3 = dB.i();
        boolean bl2 = string2.equals("false");
        if (string3 != null) {
            if (bl2) return "\u00a7c";
            String string4 = string2;
            if (string3 == null) return string4;
            bl2 = string4.equals("off");
        }
        if (bl2) return "\u00a7c";
        return "\u00a7a";
    }

    public el(String string, String string2, String string3, String[] arrstring, String string4) {
        String string5 = dB.i();
        super(string, string2, string3, arrstring, string3, string4);
        String string6 = string5;
        boolean bl2 = this.e().length;
        if (string6 != null) {
            bl2 = bl2 > true;
        }
        this.b(bl2);
    }

    @Override
    public String f(String string) {
        String string2 = cS.b("prefix." + this.l(), "");
        String string3 = super.f(string);
        String string4 = cS.b("suffix." + this.l(), "");
        String string5 = string2 + string3 + string4;
        return string5;
    }

    @Override
    public boolean h(String string) {
        Matcher matcher = m.matcher(string);
        String string2 = dB.i();
        Matcher matcher2 = matcher;
        if (string2 != null) {
            if (!matcher2.matches()) {
                return false;
            }
            matcher2 = matcher;
        }
        String string3 = matcher2.group(1);
        return string3.matches(this.l());
    }

    static {
        m = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static dB b(String string, String string2) {
        block12: {
            String string3;
            String[] arrstring;
            String string4;
            String string5;
            String string6;
            block13: {
                String string7;
                block11: {
                    String string8;
                    String string9;
                    block9: {
                        block10: {
                            Matcher matcher = m.matcher(string);
                            string7 = dB.i();
                            Matcher matcher2 = matcher;
                            if (string7 != null) {
                                if (!matcher2.matches()) {
                                    return null;
                                }
                                matcher2 = matcher;
                            }
                            string6 = matcher2.group(1);
                            string5 = matcher.group(2);
                            string4 = matcher.group(3);
                            string8 = string9 = dQ.c(string4, "[", "]");
                            if (string7 == null) break block9;
                            if (string8 == null) break block10;
                            string8 = string9;
                            if (string7 == null) break block9;
                            if (string8.length() > 0) {
                                string4 = string4.replace(string9, "").trim();
                            }
                        }
                        string8 = string5;
                    }
                    arrstring = el.a(string8, string9);
                    string3 = string6;
                    if (string7 == null) break block11;
                    if (string3 == null) break block12;
                    string3 = string6;
                }
                if (string7 == null) break block13;
                if (string3.length() <= 0) break block12;
                string3 = dQ.f(string2, "/shaders/");
            }
            string2 = string3;
            el el2 = new el(string6, string4, string5, arrstring, string2);
            return el2;
        }
        return null;
    }
}

