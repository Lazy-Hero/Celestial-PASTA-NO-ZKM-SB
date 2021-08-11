/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
import java.util.Arrays;
import java.util.regex.Pattern;
import net.minecraft.P.i;
import net.minecraft.P.k;
import net.minecraft.P.l;
import net.minecraft.P.m;
import net.minecraft.P.n;
import net.minecraft.P.o;
import net.minecraft.P.p;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.P.w;
import org.apache.commons.lang3.StringEscapeUtils;

public class dr {
    private static final /* synthetic */ int r;
    private static final /* synthetic */ String q;
    private static final /* synthetic */ int j;
    private static final /* synthetic */ int b;
    private static final /* synthetic */ String s;
    private static final /* synthetic */ int c;
    private /* synthetic */ String i;
    private static final /* synthetic */ Pattern o;
    private /* synthetic */ int e;
    private /* synthetic */ String[] g;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String a;
    private /* synthetic */ boolean m;
    private /* synthetic */ int p;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ int h;
    private static final /* synthetic */ int f;
    private static final /* synthetic */ int n;
    private /* synthetic */ String d;

    private static i a(i i2, String string) {
        block8: {
            int n2;
            i i3;
            String string2;
            block7: {
                boolean bl2;
                block6: {
                    string2 = K.d();
                    bl2 = i2 instanceof r;
                    if (string2 != null) break block6;
                    if (bl2) {
                        r r2 = (r)i2;
                        return r2.g(string);
                    }
                    i3 = i2;
                    if (string2 != null) break block7;
                    bl2 = i3 instanceof u;
                }
                if (!bl2) break block8;
                i3 = i2;
            }
            u u2 = (u)i3;
            int n3 = string.equals("count");
            if (string2 == null) {
                if (n3 != 0) {
                    return new n(u2.b());
                }
                n3 = fU.b(string, -1);
            }
            return (n2 = n3) < 0 ? null : u2.b(n2);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string) {
        String string2 = K.d();
        if (string == null) {
            return false;
        }
        boolean bl2 = this.p;
        if (string2 != null) return bl2;
        switch (bl2) {
            case 0: {
                bl2 = string.equals(this.i);
                return bl2;
            }
            case 1: {
                return this.a(string, this.i);
            }
            case 2: {
                return this.a(string.toLowerCase(), this.i);
            }
            case 3: {
                return this.b(string, this.i);
            }
            case 4: {
                return this.b(string.toLowerCase(), this.i);
            }
        }
        throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.p);
    }

    public boolean b(r r2) {
        i i2;
        i i3;
        block11: {
            block13: {
                boolean bl2;
                block12: {
                    String string = K.d();
                    r r3 = r2;
                    if (string == null) {
                        if (r3 == null) {
                            return false;
                        }
                        r3 = r2;
                    }
                    i3 = r3;
                    int n2 = 0;
                    while (n2 < this.g.length) {
                        String string2 = this.g[n2];
                        i3 = dr.a(i3, string2);
                        if (string == null) {
                            i2 = i3;
                            if (string != null) break block11;
                            if (i2 == null) {
                                return false;
                            }
                            ++n2;
                        }
                        if (string == null) continue;
                    }
                    bl2 = this.d.equals("*");
                    if (string != null) break block12;
                    if (!bl2) break block13;
                    bl2 = this.b(i3);
                }
                return bl2;
            }
            i2 = i3 = dr.a(i3, this.d);
        }
        if (i2 == null) {
            return false;
        }
        return this.a(i3);
    }

    private boolean b(String string, String string2) {
        return string.matches(string2);
    }

    public boolean a(i i2) {
        String string = K.d();
        i i3 = i2;
        if (string == null) {
            if (i3 == null) {
                return false;
            }
            i3 = i2;
        }
        String string2 = dr.a(i3, this.e);
        return this.a(string2);
    }

    private boolean a(String string, String string2) {
        return dQ.a(string, string2, '*', '?');
    }

    static {
        f = 0;
        a = "#";
        r = 2;
        l = "pattern:";
        j = 3;
        q = "ipattern:";
        h = 0;
        c = 4;
        n = 1;
        k = "regex:";
        s = "iregex:";
        b = 1;
        o = Pattern.compile("^#[0-9a-f]{6}+$");
    }

    private boolean b(i i2) {
        boolean bl2;
        block12: {
            i i3;
            i i4;
            String string;
            block11: {
                block13: {
                    string = K.d();
                    bl2 = i2 instanceof r;
                    if (string != null) break block11;
                    if (!bl2) break block13;
                    i4 = (r)i2;
                    for (String string2 : ((r)i4).d()) {
                        block15: {
                            boolean bl3;
                            block14: {
                                i3 = ((r)i4).g(string2);
                                bl2 = this.a(i3);
                                if (string != null) break block11;
                                if (string != null) break block14;
                                if (!bl2) break block15;
                                bl3 = true;
                            }
                            return bl3;
                        }
                        if (string == null) continue;
                    }
                }
                bl2 = i2 instanceof u;
            }
            if (string == null) {
                if (bl2) {
                    i4 = (u)i2;
                    int n2 = ((u)i4).b();
                    int n3 = 0;
                    while (n3 < n2) {
                        i3 = ((u)i4).b(n3);
                        if (string == null) {
                            bl2 = this.a(i3);
                            if (string != null) break block12;
                            if (bl2) {
                                return true;
                            }
                            ++n3;
                        }
                        if (string == null) continue;
                    }
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String a(i i2, int n2) {
        i i3;
        String string = K.d();
        i i4 = i2;
        if (string == null) {
            if (i4 == null) {
                return null;
            }
            i4 = i2;
        }
        boolean bl2 = i4 instanceof w;
        if (string == null) {
            if (bl2) {
                w w2 = (w)i2;
                return w2.b();
            }
            bl2 = i2 instanceof n;
        }
        if (string == null) {
            if (bl2) {
                String string2;
                n n3 = (n)i2;
                int n4 = n2;
                if (string == null) {
                    if (n4 == 1) {
                        string2 = "#" + dQ.b(Integer.toHexString(n3.f()), 6, '0');
                        return string2;
                    }
                    n4 = n3.f();
                }
                string2 = Integer.toString(n4);
                return string2;
            }
            bl2 = i2 instanceof k;
        }
        if (string == null) {
            if (bl2) {
                k k2 = (k)i2;
                return Byte.toString(k2.b());
            }
            bl2 = i2 instanceof p;
        }
        if (string == null) {
            if (bl2) {
                p p2 = (p)i2;
                return Short.toString(p2.a());
            }
            bl2 = i2 instanceof o;
        }
        if (string == null) {
            if (bl2) {
                o o2 = (o)i2;
                return Long.toString(o2.c());
            }
            bl2 = i2 instanceof m;
        }
        if (string == null) {
            if (bl2) {
                m m2 = (m)i2;
                return Float.toString(m2.e());
            }
            i3 = i2;
            if (string != null) return i3.toString();
            bl2 = i3 instanceof l;
        }
        if (bl2) {
            l l2 = (l)i2;
            return Double.toString(l2.d());
        }
        i3 = i2;
        return i3.toString();
    }

    public dr(String string, String string2) {
        String string3;
        block9: {
            block15: {
                String string4;
                String string5;
                block14: {
                    boolean bl2;
                    block12: {
                        block13: {
                            block10: {
                                block11: {
                                    block7: {
                                        block8: {
                                            String string6 = K.d();
                                            this.g = null;
                                            this.d = null;
                                            string3 = string6;
                                            this.m = false;
                                            this.p = 0;
                                            this.i = null;
                                            this.e = 0;
                                            String[] arrstring = fU.c(string, ".");
                                            this.g = Arrays.copyOfRange(arrstring, 0, arrstring.length - 1);
                                            this.d = arrstring[arrstring.length - 1];
                                            bl2 = string2.startsWith("!");
                                            if (string3 == null) {
                                                if (bl2) {
                                                    this.m = true;
                                                    string2 = string2.substring(1);
                                                }
                                                bl2 = string2.startsWith("pattern:");
                                            }
                                            if (string3 != null) break block7;
                                            if (!bl2) break block8;
                                            this.p = 1;
                                            string2 = string2.substring("pattern:".length());
                                            if (string3 == null) break block9;
                                        }
                                        bl2 = string2.startsWith("ipattern:");
                                    }
                                    if (string3 != null) break block10;
                                    if (!bl2) break block11;
                                    this.p = 2;
                                    string2 = string2.substring("ipattern:".length()).toLowerCase();
                                    if (string3 == null) break block9;
                                }
                                bl2 = string2.startsWith("regex:");
                            }
                            if (string3 != null) break block12;
                            if (!bl2) break block13;
                            this.p = 3;
                            string2 = string2.substring("regex:".length());
                            if (string3 == null) break block9;
                        }
                        string5 = string2;
                        string4 = "iregex:";
                        if (string3 != null) break block14;
                        bl2 = string5.startsWith(string4);
                    }
                    if (!bl2) break block15;
                    this.p = 4;
                    string5 = string2;
                    string4 = "iregex:";
                }
                string2 = string5.substring(string4.length()).toLowerCase();
                if (string3 == null) break block9;
            }
            this.p = 0;
        }
        string2 = StringEscapeUtils.unescapeJava((String)string2);
        dr dr2 = this;
        if (string3 == null) {
            if (dr2.p == 0 && o.matcher(string2).matches()) {
                this.e = 1;
            }
            dr2 = this;
        }
        dr2.i = string2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public String toString() {
        StringBuffer stringBuffer;
        block10: {
            int n2;
            StringBuffer stringBuffer2;
            block9: {
                stringBuffer2 = new StringBuffer();
                String string = K.d();
                int n3 = 0;
                while (n3 < this.g.length) {
                    String string2 = this.g[n3];
                    if (string == null) {
                        n2 = n3;
                        if (string != null) break block9;
                        if (n2 > 0) {
                            stringBuffer2.append(".");
                        }
                        stringBuffer2.append(string2);
                        ++n3;
                    }
                    if (string == null) continue;
                }
                stringBuffer = stringBuffer2;
                if (string != null) break block10;
                n2 = stringBuffer.length();
            }
            if (n2 > 0) {
                stringBuffer2.append(".");
            }
            stringBuffer2.append(this.d);
            stringBuffer2.append(" = ");
            stringBuffer2.append(this.i);
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    public boolean a(r r2) {
        String string = K.d();
        boolean bl2 = this.m;
        if (string == null) {
            if (bl2) {
                boolean bl3 = this.b(r2);
                if (string == null) {
                    bl3 = !bl3;
                }
                return bl3;
            }
            bl2 = this.b(r2);
        }
        return bl2;
    }
}

