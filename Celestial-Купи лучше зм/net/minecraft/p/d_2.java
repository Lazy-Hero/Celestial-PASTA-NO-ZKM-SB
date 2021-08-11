/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 */
package net.minecraft.P;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.P.a;
import net.minecraft.P.i;
import net.minecraft.P.j;
import net.minecraft.P.k;
import net.minecraft.P.l;
import net.minecraft.P.m;
import net.minecraft.P.n;
import net.minecraft.P.o;
import net.minecraft.P.p;
import net.minecraft.P.q;
import net.minecraft.P.r;
import net.minecraft.P.t;
import net.minecraft.P.u;
import net.minecraft.P.v;
import net.minecraft.P.w;

public class d {
    private static final /* synthetic */ Pattern i;
    private static final /* synthetic */ Pattern e;
    private static final /* synthetic */ Pattern f;
    private static final /* synthetic */ Pattern h;
    private static final /* synthetic */ Pattern g;
    private /* synthetic */ int b;
    private static final /* synthetic */ Pattern d;
    private final /* synthetic */ String c;
    private static final /* synthetic */ Pattern a;

    private i b(String string) {
        boolean bl2 = net.minecraft.P.i.a();
        try {
            boolean bl3 = e.matcher(string).matches();
            if (bl2) {
                if (bl3) {
                    return new m(Float.parseFloat(string.substring(0, string.length() - 1)));
                }
                bl3 = f.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new k(Byte.parseByte(string.substring(0, string.length() - 1)));
                }
                bl3 = i.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new o(Long.parseLong(string.substring(0, string.length() - 1)));
                }
                bl3 = a.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new p(Short.parseShort(string.substring(0, string.length() - 1)));
                }
                bl3 = d.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new n(Integer.parseInt(string));
                }
                bl3 = h.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new l(Double.parseDouble(string.substring(0, string.length() - 1)));
                }
                bl3 = g.matcher(string).matches();
            }
            if (bl2) {
                if (bl3) {
                    return new l(Double.parseDouble(string));
                }
                bl3 = "true".equalsIgnoreCase(string);
            }
            if (bl2) {
                if (bl3) {
                    return new k(1);
                }
                bl3 = "false".equalsIgnoreCase(string);
            }
            if (bl3) {
                return new k(0);
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return new w(string);
    }

    private String l() {
        d d10;
        int n2;
        block2: {
            n2 = this.b;
            boolean bl2 = net.minecraft.P.i.a();
            while (this.e()) {
                d10 = this;
                if (bl2 && bl2) {
                    if (!d10.a(this.n())) break;
                    ++this.b;
                    if (bl2) continue;
                }
                break block2;
            }
            d10 = this;
        }
        return d10.c.substring(n2, this.b);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void b() {
        boolean bl2 = net.minecraft.P.i.f();
        while (this.e()) {
            d d10 = this;
            if (!bl2) {
                if (!Character.isWhitespace(d10.n())) break;
                d10 = this;
            }
            ++d10.b;
            if (!bl2) continue;
        }
    }

    @VisibleForTesting
    r f() throws a {
        r r2;
        block3: {
            d d10;
            block2: {
                r2 = this.o();
                boolean bl2 = net.minecraft.P.i.a();
                this.b();
                d10 = this;
                if (!bl2) break block2;
                if (!d10.e()) break block3;
                ++this.b;
                d10 = this;
            }
            throw d10.a("Trailing data found");
        }
        return r2;
    }

    public static r c(String string) throws a {
        return new d(string).f();
    }

    @VisibleForTesting
    d(String string) {
        this.c = string;
    }

    private boolean b(int n2) {
        boolean bl2 = net.minecraft.P.i.a();
        char n3 = this.b + n2;
        if (bl2) {
            n3 = n3 < this.c.length() ? '\u0001' : '\u0000';
        }
        return n3 != '\u0000';
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private i c() throws a {
        this.b('[');
        v0 = net.minecraft.P.i.f();
        this.b();
        var1_1 = v0;
        v1 = this;
        if (var1_1 != false) throw v1.a("Expected value");
        if (!v1.e()) {
            v1 = this;
            throw v1.a("Expected value");
        }
        var2_2 = new u();
        var3_3 = -1;
        while (this.n() != ']') {
            var4_4 = this.a();
            var5_5 = var4_4.d();
            if (var1_1 != false) return var2_2;
            v2 = var3_3;
            if (var1_1) ** GOTO lbl22
            if (v2 >= 0) ** GOTO lbl-1000
            var3_3 = var5_5;
            if (var1_1) lbl-1000:
            // 2 sources

            {
                v2 = var5_5;
lbl22:
                // 2 sources

                if (!var1_1) {
                    if (v2 != var3_3) {
                        throw this.a("Unable to insert " + net.minecraft.P.i.a((int)var5_5) + " into ListTag of type " + net.minecraft.P.i.a(var3_3));
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                var2_2.a(var4_4);
                v2 = this.m() ? '\u0001' : '\u0000';
            }
            if (!var1_1) {
                if (v2 == 0 && !var1_1) break;
                v3 = this;
                if (var1_1 != false) throw v3.a("Expected value");
                v2 = v3.e() ? '\u0001' : '\u0000';
            }
            if (v2 == 0) {
                v3 = this;
                throw v3.a("Expected value");
            }
            if (!var1_1) continue;
        }
        this.b(']');
        return var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private <T extends Number> List<T> a(byte by2, byte by3) throws a {
        d d10;
        ArrayList arrayList;
        block10: {
            arrayList = Lists.newArrayList();
            boolean bl2 = net.minecraft.P.i.a();
            while (this.n() != ']') {
                a a10;
                block13: {
                    byte by4;
                    i i2;
                    block14: {
                        byte by5;
                        block11: {
                            block12: {
                                byte by6;
                                i2 = this.a();
                                by4 = by6 = i2.d();
                                by5 = by3;
                                if (bl2) {
                                    if (by4 != by5) {
                                        a10 = this.a("Unable to insert " + net.minecraft.P.i.a((int)by6) + " into " + net.minecraft.P.i.a((int)by2));
                                        throw a10;
                                    }
                                    by4 = by3;
                                    by5 = 1;
                                }
                                if (!bl2) break block11;
                                if (by4 != by5) break block12;
                                arrayList.add(((j)i2).b());
                                if (bl2) break block13;
                            }
                            by4 = by3;
                            if (!bl2) break block13;
                            by5 = 4;
                        }
                        if (by4 != by5) break block14;
                        arrayList.add(((j)i2).c());
                        if (bl2) break block13;
                    }
                    by4 = (byte)(arrayList.add(((j)i2).f()) ? '\u0001' : '\u0000');
                }
                d10 = this;
                if (bl2) {
                    if (!d10.m()) break;
                    if (this.e()) continue;
                    a10 = this.a("Expected value");
                    if (!bl2) throw a10;
                    throw a10;
                }
                break block10;
            }
            d10 = this;
        }
        d10.b(']');
        return arrayList;
    }

    private i k() throws a {
        boolean bl2 = net.minecraft.P.i.f();
        this.b('[');
        char c10 = this.g();
        this.g();
        boolean bl3 = bl2;
        this.b();
        char c11 = this.e();
        if (!bl3) {
            if (c11 == '\u0000') {
                throw this.a("Expected value");
            }
            c11 = c10;
        }
        char c12 = 'B';
        if (!bl3) {
            if (c11 == c12) {
                return new q(this.a((byte)7, (byte)1));
            }
            c11 = c10;
            c12 = 'L';
        }
        if (!bl3) {
            if (c11 == c12) {
                return new v(this.a((byte)12, (byte)4));
            }
            c11 = c10;
            c12 = 'I';
        }
        if (c11 == c12) {
            return new t(this.a((byte)11, (byte)3));
        }
        throw this.a("Invalid array type '" + c10 + "' found");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String j() throws a {
        var2_1 = ++this.b;
        var3_2 = null;
        var1_3 = net.minecraft.P.i.f();
        var4_4 = '\u0000';
        while (this.e()) {
            block19: {
                block17: {
                    block18: {
                        v0 = this;
                        if (var1_3 != false) throw v0.a("Missing termination quote");
                        var5_5 = v0.g();
                        v1 = var4_4;
                        if (var1_3) break block17;
                        if (v1 == '\u0000') break block18;
                        v2 = var5_5;
                        if (!var1_3) {
                            if (v2 != '\\') {
                                v2 = var5_5;
                                if (!var1_3) {
                                    if (v2 != '\"') {
                                        throw this.a("Invalid escape of '" + var5_5 + "'");
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v2 = var4_4 = '\u0000';
                            }
                        }
                        if (!var1_3) break block19;
                    }
                    v1 = var5_5;
                }
                v3 = '\\';
                if (!var1_3) {
                    if (v1 == v3) {
                        var4_4 = '\u0001';
                        v4 = var3_2;
                        if (!var1_3) {
                            if (v4 != null) continue;
                            v4 = var3_2 = new StringBuilder(this.c.substring(var2_1, this.b - 1));
                        }
                        if (!var1_3) continue;
                    }
                    v1 = var5_5;
                    v3 = '\"';
                }
                if (v1 == v3) {
                    v5 = var3_2;
                    if (!var1_3) {
                        if (v5 == null) {
                            v6 = this.c.substring(var2_1, this.b - 1);
                            return v6;
                        }
                        v5 = var3_2;
                    }
                    v6 = v5.toString();
                    return v6;
                }
            }
            v7 = var3_2;
            if (!var1_3 && v7 != null) {
                v7 = var3_2.append(var5_5);
            }
            if (!var1_3) continue;
        }
        v0 = this;
        throw v0.a("Missing termination quote");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected i d() throws a {
        block3: {
            block4: {
                var1_1 = net.minecraft.P.i.f();
                v0 = this;
                if (var1_1) break block3;
                if (!v0.b(2)) break block4;
                v0 = this;
                if (var1_1) break block3;
                if (v0.a(1) != '\"') {
                    v0 = this;
                    if (!var1_1) {
                        if (v0.a(2) == ';') {
                            v1 = this.k();
                            return v1;
                        } else {
                            ** GOTO lbl15
                        }
                    } else {
                        ** GOTO lbl14
                    }
                }
                break block4;
lbl14:
                // 2 sources

                break block3;
            }
            v0 = this;
        }
        v1 = v0.c();
        return v1;
    }

    private char n() {
        return this.a(0);
    }

    static {
        g = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
        h = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
        e = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
        f = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
        i = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
        a = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
        d = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
    }

    private char a(int n2) {
        return this.c.charAt(this.b + n2);
    }

    protected r o() throws a {
        d d10;
        r r2;
        block6: {
            boolean bl2 = net.minecraft.P.i.f();
            this.b('{');
            boolean bl3 = bl2;
            r2 = new r();
            this.b();
            while (this.e()) {
                block9: {
                    d d11;
                    block8: {
                        boolean bl4;
                        block7: {
                            d10 = this;
                            if (bl3 || bl3) break block6;
                            if (d10.n() == '}') break;
                            String string = this.h();
                            bl4 = string.isEmpty();
                            if (!bl3) {
                                if (bl4) {
                                    throw this.a("Expected non-empty key");
                                }
                                this.b(':');
                                r2.a(string, this.a());
                                bl4 = this.m();
                            }
                            if (bl3) break block7;
                            if (!bl4 && !bl3) break;
                            d11 = this;
                            if (bl3) break block8;
                            bl4 = d11.e();
                        }
                        if (bl4) break block9;
                        d11 = this;
                    }
                    throw d11.a("Expected key");
                }
                if (!bl3) continue;
            }
            d10 = this;
        }
        d10.b('}');
        return r2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(char n2) {
        boolean bl2 = net.minecraft.P.i.a();
        char n3 = n2;
        int n4 = 48;
        if (bl2) {
            if (n3 >= n4) {
                n3 = n2;
                if (!bl2) return n3 != '\u0000';
                if (n3 <= 57) return '\u0001' != '\u0000';
            }
            n3 = n2;
            n4 = 65;
        }
        if (bl2) {
            if (n3 >= n4) {
                n3 = n2;
                if (!bl2) return n3 != '\u0000';
                if (n3 <= 90) return '\u0001' != '\u0000';
            }
            n3 = n2;
            n4 = 97;
        }
        if (bl2) {
            if (n3 >= n4) {
                n3 = n2;
                if (!bl2) return n3 != '\u0000';
                if (n3 <= 122) return '\u0001' != '\u0000';
            }
            n3 = n2;
            if (!bl2) return n3 != '\u0000';
            n4 = 95;
        }
        if (n3 == n4) return '\u0001' != '\u0000';
        n3 = n2;
        if (!bl2) return n3 != '\u0000';
        if (n3 == 45) return '\u0001' != '\u0000';
        n3 = n2;
        if (!bl2) return n3 != '\u0000';
        if (n3 == 46) return '\u0001' != '\u0000';
        n3 = n2;
        if (!bl2) return n3 != '\u0000';
        if (n3 != 43) return '\u0000' != '\u0000';
        return '\u0001' != '\u0000';
    }

    private char g() {
        return this.c.charAt(this.b++);
    }

    protected i i() throws a {
        String string;
        boolean bl2 = net.minecraft.P.i.f();
        this.b();
        boolean bl3 = bl2;
        d d10 = this;
        if (!bl3) {
            if (d10.n() == '\"') {
                return new w(this.j());
            }
            d10 = this;
        }
        if ((string = d10.l()).isEmpty()) {
            throw this.a("Expected value");
        }
        return this.b(string);
    }

    private a a(String string) {
        return new a(string, this.c, this.b);
    }

    protected i a() throws a {
        int n2;
        boolean bl2 = net.minecraft.P.i.a();
        this.b();
        boolean bl3 = bl2;
        int n3 = this.e();
        if (bl3) {
            if (n3 == 0) {
                throw this.a("Expected value");
            }
            n3 = this.n();
        }
        int n4 = n2 = n3;
        int n5 = 123;
        if (bl3) {
            if (n4 == n5) {
                return this.o();
            }
            n4 = n2;
            n5 = 91;
        }
        return n4 == n5 ? this.d() : this.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected String h() throws a {
        String string;
        d d10;
        block6: {
            int n2;
            block5: {
                boolean bl2 = net.minecraft.P.i.a();
                this.b();
                boolean bl3 = bl2;
                n2 = this.e();
                if (!bl3) break block5;
                if (n2 == 0) {
                    throw this.a("Expected key");
                }
                d10 = this;
                if (!bl3) break block6;
                n2 = d10.n();
            }
            if (n2 == 34) {
                string = this.j();
                return string;
            }
            d10 = this;
        }
        string = d10.l();
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean m() {
        boolean bl2 = net.minecraft.P.i.f();
        this.b();
        boolean bl3 = bl2;
        char c10 = this.e();
        if (bl3) return c10 != '\u0000';
        if (c10 == '\u0000') return '\u0000' != '\u0000';
        c10 = this.n();
        if (bl3) return c10 != '\u0000';
        if (c10 != ',') return '\u0000' != '\u0000';
        ++this.b;
        this.b();
        return true;
    }

    boolean e() {
        return this.b(0);
    }

    private void b(char c10) throws a {
        block5: {
            char c11;
            block3: {
                d d10;
                boolean bl2;
                block4: {
                    char c12;
                    block2: {
                        this.b();
                        c11 = this.e();
                        bl2 = net.minecraft.P.i.f();
                        c12 = c11;
                        if (bl2) break block2;
                        if (c12 == '\u0000') break block3;
                        d10 = this;
                        if (bl2) break block4;
                        c12 = d10.n();
                    }
                    if (c12 != c10) break block3;
                    d10 = this;
                }
                ++d10.b;
                if (!bl2) break block5;
            }
            throw new a("Expected '" + c10 + "' but got '" + (c11 != '\u0000' ? Character.valueOf(this.n()) : "<EOF>") + "'", this.c, this.b + 1);
        }
    }
}

