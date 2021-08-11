/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ew
extends dB {
    private static final /* synthetic */ Pattern n;
    private static final /* synthetic */ Pattern m;

    public static boolean b(String string) {
        return Boolean.valueOf(string);
    }

    static {
        m = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
        n = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");
    }

    @Override
    public String f(String string) {
        String string2 = super.f(string);
        String string3 = dB.i();
        String string4 = string2;
        if (string3 != null) {
            if (string4 != string) {
                return string2;
            }
            string4 = string;
        }
        if (string3 != null) {
            string4 = ew.b(string4) ? gl.e() : gl.f();
        }
        return string4;
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
        String string3 = matcher2.group(2);
        return string3.matches(this.l());
    }

    public static dB a(String string, String string2) {
        block7: {
            boolean bl2;
            boolean bl3;
            String string3;
            String string4;
            String string5;
            block8: {
                String string6;
                String string7;
                block6: {
                    Matcher matcher = m.matcher(string);
                    string5 = dB.i();
                    Matcher matcher2 = matcher;
                    if (string5 != null) {
                        if (!matcher2.matches()) {
                            return null;
                        }
                        matcher2 = matcher;
                    }
                    string7 = matcher2.group(1);
                    string4 = matcher.group(2);
                    string3 = matcher.group(3);
                    string6 = string4;
                    if (string5 == null) break block6;
                    if (string6 == null) break block7;
                    string6 = string4;
                }
                bl3 = string6.length();
                if (string5 == null) break block8;
                if (bl3 <= false) break block7;
                bl3 = (fU.a((Object)string7, (Object)"//") ? 1 : 0) != 0;
            }
            boolean bl4 = bl2 = bl3;
            if (string5 != null) {
                bl4 = !bl4;
            }
            boolean bl5 = bl4;
            string2 = dQ.f(string2, "/shaders/");
            ew ew2 = new ew(string4, string3, String.valueOf(bl5), string2);
            return ew2;
        }
        return null;
    }

    @Override
    public boolean n() {
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public String g() {
        String string = dB.i();
        String string2 = this.k();
        if (string != null) {
            string2 = ew.b(string2) ? "#define " + this.l() + " // Shader option ON" : "//#define " + this.l() + " // Shader option OFF";
        }
        return string2;
    }

    public ew(String string, String string2, String string3, String string4) {
        super(string, string2, string3, new String[]{"false", "true"}, string3, string4);
    }

    @Override
    public boolean g(String string) {
        Matcher matcher = n.matcher(string);
        String string2 = dB.i();
        boolean bl2 = matcher.matches();
        if (string2 != null) {
            if (bl2) {
                String string3 = matcher.group(2);
                return string3.equals(this.l());
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String e(String string) {
        String string2 = dB.i();
        String string3 = string;
        if (string2 != null) {
            string3 = ew.b(string3) ? "\u00a7a" : "\u00a7c";
        }
        return string3;
    }
}

