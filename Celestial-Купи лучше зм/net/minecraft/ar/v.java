/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.ar;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class v
implements Comparable<v> {
    protected final /* synthetic */ String b;
    protected final /* synthetic */ String a;
    private static /* synthetic */ int c;

    public v(String string, String string2) {
        this(0, string, string2);
    }

    public String a() {
        return this.a;
    }

    public static int d() {
        int n2 = v.b();
        if (n2 == 0) {
            return 126;
        }
        return 0;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public String toString() {
        return this.b + ':' + this.a;
    }

    public String c() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2 = v.d();
        Object object2 = this;
        if (n2 != 0) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (n2 != 0) {
            if (!(object2 instanceof v)) {
                return false;
            }
            object2 = object;
        }
        v v2 = (v)object2;
        boolean bl2 = this.b.equals(v2.b);
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.a.equals(v2.a);
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public int a(v v2) {
        int n2 = this.b.compareTo(v2.b);
        int n3 = v.d();
        int n4 = n2;
        if (n3 != 0) {
            if (n4 == 0) {
                n2 = this.a.compareTo(v2.a);
            }
            n4 = n2;
        }
        return n4;
    }

    public v(int n2, String ... arrstring) {
        this.b = StringUtils.isEmpty((CharSequence)arrstring[0]) ? "minecraft" : arrstring[0].toLowerCase(Locale.ROOT);
        this.a = arrstring[1].toLowerCase(Locale.ROOT);
        Validate.notNull((Object)this.a);
    }

    public static int b() {
        return c;
    }

    public v(String string) {
        this(0, v.a(string));
    }

    public static void b(int n2) {
        c = n2;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }

    protected static String[] a(String string) {
        String[] arrstring;
        block1: {
            arrstring = new String[]{"minecraft", string};
            int n2 = string.indexOf(58);
            if (n2 < 0) break block1;
            arrstring[1] = string.substring(n2 + 1);
            if (n2 > 1) {
                arrstring[0] = string.substring(0, n2);
            }
        }
        return arrstring;
    }

    static {
        if (v.b() != 0) {
            v.b(22);
        }
    }
}

