/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a9 {
    public static /* synthetic */ Pattern d;
    public static /* synthetic */ Pattern b;
    public static /* synthetic */ Pattern g;
    public static /* synthetic */ Pattern h;
    public static /* synthetic */ Pattern e;
    public static /* synthetic */ Pattern f;
    public static /* synthetic */ Pattern a;
    public static /* synthetic */ Pattern c;

    public static b f(String string) {
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5 = h.matcher(string);
        String string2 = dB.i();
        Matcher matcher6 = matcher5;
        if (string2 != null) {
            if (matcher6.matches()) {
                return new b(1, matcher5.group(1), "", string);
            }
            matcher6 = g.matcher(string);
        }
        Matcher matcher7 = matcher4 = matcher6;
        if (string2 != null) {
            if (matcher7.matches()) {
                return new b(2, matcher4.group(1), matcher4.group(2), string);
            }
            matcher7 = d.matcher(string);
        }
        Matcher matcher8 = matcher3 = matcher7;
        if (string2 != null) {
            if (matcher8.matches()) {
                return new b(3, matcher3.group(1), matcher3.group(2), string);
            }
            matcher8 = a.matcher(string);
        }
        Matcher matcher9 = matcher2 = matcher8;
        if (string2 != null) {
            if (matcher9.matches()) {
                return new b(4, matcher2.group(1), matcher2.group(2), string);
            }
            matcher9 = c.matcher(string);
        }
        return (matcher = matcher9).matches() ? new b(5, matcher.group(1), matcher.group(2), string) : null;
    }

    public static int c(String string) {
        int n2 = -1;
        String string2 = dB.i();
        int n3 = string.hashCode();
        if (string2 != null) {
            switch (n3) {
                case -1560188349: {
                    n3 = string.equals("shadowcolor") ? 1 : 0;
                    if (string2 == null) break;
                    if (n3 != 0) {
                        n2 = 0;
                    }
                }
                default: {
                    n3 = n2;
                }
            }
        }
        if (string2 != null) {
            switch (n3) {
                case 0: {
                    return 0;
                }
            }
            n3 = a9.a(string, "shadowcolor", 0, 1);
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(String string) {
        int n2;
        String string2;
        block10: {
            int n3 = -1;
            string2 = dB.i();
            n2 = string.hashCode();
            if (string2 == null) break block10;
            switch (n2) {
                case -903579360: {
                    n2 = string.equals("shadow") ? 1 : 0;
                    if (string2 != null) {
                        if (n2 == 0) break;
                        n3 = 0;
                        if (string2 != null) break;
                    }
                    break block10;
                }
                case 1235669239: {
                    n2 = string.equals("watershadow") ? 1 : 0;
                    if (string2 == null) break block10;
                    if (n2 == 0) break;
                    n3 = 1;
                }
            }
            n2 = n3;
        }
        if (string2 != null) {
            switch (n2) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 1;
                }
            }
            n2 = a9.a(string, "shadowtex", 0, 1);
        }
        return n2;
    }

    public static int e(String string) {
        return a9.a(string, "depthtex", 0, 2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean g(String string) {
        return b.matcher(string).matches();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string, String string2, int n2, int n3) {
        int n4;
        String string3 = dB.i();
        int n5 = string.length();
        if (string3 != null) {
            if (n5 != string2.length() + 1) {
                return -1;
            }
            n5 = string.startsWith(string2) ? 1 : 0;
        }
        if (string3 != null) {
            if (n5 == 0) {
                return -1;
            }
            n5 = string.charAt(string2.length()) - 48;
        }
        int n6 = n4 = n5;
        int n7 = n2;
        if (string3 != null) {
            if (n6 < n7) return -1;
            n6 = n4;
            if (string3 == null) return n6;
            n7 = n3;
        }
        if (n6 > n7) return -1;
        n6 = n4;
        return n6;
    }

    public static boolean a(String string) {
        return f.matcher(string).matches();
    }

    public static boolean h(String string) {
        return e.matcher(string).matches();
    }

    public static int d(String string) {
        int n2 = a9.a(string, "gaux", 1, 4);
        String string2 = dB.i();
        int n3 = n2;
        if (string2 != null) {
            n3 = n3 > 0 ? n2 + 3 : a9.a(string, "colortex", 4, 7);
        }
        return n3;
    }

    static {
        h = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
        g = Pattern.compile("\\s*/\\*\\s+([A-Z]+):(\\S+)\\s+\\*/.*");
        d = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        a = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        c = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
        b = Pattern.compile(".*composite[0-9]?\\.fsh");
        e = Pattern.compile(".*final\\.fsh");
        f = Pattern.compile("[0-7N]*");
    }
}

