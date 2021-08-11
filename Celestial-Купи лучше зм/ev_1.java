/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ev
extends ew {
    private static final /* synthetic */ Pattern o;

    @Override
    public boolean n() {
        return false;
    }

    public static dB b(String string, String string2) {
        block6: {
            String string3;
            String string4;
            String string5;
            String string6;
            block7: {
                String string7;
                block5: {
                    Matcher matcher = o.matcher(string);
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
                    string3 = string6;
                    if (string7 == null) break block5;
                    if (string3 == null) break block6;
                    string3 = string6;
                }
                if (string7 == null) break block7;
                if (string3.length() <= 0) break block6;
                string3 = dQ.f(string2, "/shaders/");
            }
            string2 = string3;
            ev ev2 = new ev(string6, string4, string5, string2);
            ev2.b(false);
            return ev2;
        }
        return null;
    }

    @Override
    public String g() {
        return "const bool " + this.l() + " = " + this.k() + "; // Shader option " + this.k();
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public ev(String string, String string2, String string3, String string4) {
        super(string, string2, string3, string4);
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
        String string3 = matcher2.group(1);
        return string3.matches(this.l());
    }

    static {
        o = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");
    }
}

