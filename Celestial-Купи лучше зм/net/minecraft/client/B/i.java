/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.B;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.B.a;
import net.minecraft.client.B.d;
import org.apache.commons.lang3.StringUtils;

public class i {
    private final /* synthetic */ List<String> a;
    private /* synthetic */ String b;

    public String a() {
        return StringUtils.join(this.a, (String)"->");
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n2 = d.b();
        i i2 = this;
        if (n2 != 0) {
            if (i2.b != null) {
                String string;
                i i3 = this;
                if (n2 != 0) {
                    if (!i3.a.isEmpty()) {
                        string = this.b + " " + this.a();
                        return string;
                    }
                    i3 = this;
                }
                string = i3.b;
                return string;
            }
            i2 = this;
        }
        if (i2.a.isEmpty()) {
            return "(Unknown file)";
        }
        String string = "(Unknown file) " + this.a();
        return string;
    }

    static void b(i i2, String string) {
        i2.a(string);
    }

    i(a a10) {
        this();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private i() {
        this.a = Lists.newArrayList();
    }

    static String a(i i2, String string) {
        i2.b = string;
        return i2.b;
    }

    private void a(String string) {
        this.a.add(0, string);
    }
}

