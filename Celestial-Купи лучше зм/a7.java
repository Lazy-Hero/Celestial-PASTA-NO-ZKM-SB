/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class a7 {
    private /* synthetic */ String[] c;
    private final /* synthetic */ int[] e;
    private /* synthetic */ int b;
    private /* synthetic */ String f;
    private /* synthetic */ int a;
    private /* synthetic */ String d;
    private /* synthetic */ String[] g;

    public String f() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string) {
        String string2 = dB.i();
        if (string2 != null) {
            if (string == null) {
                this.b = this.a;
                return false;
            }
            this.b = ArrayUtils.indexOf((Object[])this.c, (Object)string);
        }
        int n2 = this.b;
        if (string2 == null) return n2 != 0;
        if (n2 >= 0) {
            n2 = this.b;
            if (string2 == null) return n2 != 0;
            if (n2 < this.c.length) {
                return true;
            }
        }
        this.b = this.a;
        return 0 != 0;
    }

    public void a(Properties properties) {
        String string = dB.i();
        Object object = properties;
        if (string != null && object != null) {
            object = properties.setProperty(this.e(), this.d());
        }
    }

    public int a() {
        return this.b;
    }

    public void a(int n2) {
        block4: {
            block2: {
                a7 a72;
                block3: {
                    this.b = n2;
                    String string = dB.i();
                    a72 = this;
                    if (string == null) break block2;
                    if (a72.b < 0) break block3;
                    a72 = this;
                    if (string == null) break block2;
                    if (a72.b < this.c.length) break block4;
                }
                a72 = this;
            }
            a72.b = this.a;
        }
    }

    public String c() {
        return this.g[this.b];
    }

    public String e() {
        return this.d;
    }

    public void b() {
        this.b = this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(Properties properties) {
        String string;
        String string2 = dB.i();
        this.b();
        String string3 = string2;
        Properties properties2 = properties;
        if (string3 != null) {
            if (properties2 == null) {
                return false;
            }
            properties2 = properties;
        }
        if ((string = properties2.getProperty(this.d)) == null) return false;
        boolean bl2 = this.a(string);
        if (string3 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public String d() {
        return this.c[this.b];
    }

    public a7(String string, String[] arrstring, String string2, String[] arrstring2, int n2) {
        this.e = null;
        this.a = 0;
        this.d = null;
        this.c = null;
        this.f = null;
        this.g = null;
        this.b = 0;
        this.d = string;
        this.c = arrstring;
        this.f = string2;
        this.g = arrstring2;
        this.a = n2;
        if (arrstring.length != arrstring2.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + arrstring.length + " != " + arrstring2.length);
        }
        if (n2 < 0 || n2 >= arrstring.length) {
            throw new IllegalArgumentException("Invalid default value: " + n2);
        }
        this.b = n2;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public String toString() {
        return "" + this.d + "=" + this.d() + " [" + fU.a(this.c) + "], value: " + this.b;
    }

    public void g() {
        block4: {
            block2: {
                a7 a72;
                block3: {
                    ++this.b;
                    String string = dB.i();
                    a72 = this;
                    if (string == null) break block2;
                    if (a72.b < 0) break block3;
                    a72 = this;
                    if (string == null) break block2;
                    if (a72.b < this.c.length) break block4;
                }
                a72 = this;
            }
            a72.b = 0;
        }
    }
}

