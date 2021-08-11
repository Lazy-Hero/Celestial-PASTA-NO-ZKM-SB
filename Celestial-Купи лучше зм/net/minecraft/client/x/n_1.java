/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.x;

import java.util.Locale;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import org.apache.commons.lang3.StringUtils;

public class n
extends v {
    private final /* synthetic */ String d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public String b() {
        return this.d;
    }

    public n(String string, String string2) {
        this(0, n.b(string + '#' + (string2 == null ? "normal" : string2)));
    }

    protected n(int n2, String ... arrstring) {
        super(0, arrstring[0], arrstring[1]);
        this.d = StringUtils.isEmpty((CharSequence)arrstring[2]) ? "normal" : arrstring[2].toLowerCase(Locale.ROOT);
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.d.hashCode();
    }

    protected static String[] b(String string) {
        String[] arrstring = new String[]{null, string, null};
        int n2 = string.indexOf(35);
        String string2 = string;
        if (n2 >= 0) {
            arrstring[2] = string.substring(n2 + 1);
            if (n2 > 1) {
                string2 = string.substring(0, n2);
            }
        }
        System.arraycopy(v.a(string2), 0, arrstring, 0, 2);
        return arrstring;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        String[] arrstring = P.o();
        Object object2 = this;
        if (arrstring == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof n;
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        bl2 = super.equals(object);
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        n n2 = (n)object;
        return this.d.equals(n2.d);
    }

    public n(v v2, String string) {
        this(v2.toString(), string);
    }

    @Override
    public String toString() {
        return super.toString() + '#' + this.d;
    }

    public n(String string) {
        this(0, n.b(string));
    }
}

