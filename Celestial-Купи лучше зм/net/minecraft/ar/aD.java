/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.ar;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class aD {
    private static final /* synthetic */ Pattern a;

    static {
        a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    }

    public static String a(int n2) {
        int n3 = n2 / 20;
        int n4 = n3 / 60;
        return (n3 %= 60) < 10 ? n4 + ":0" + n3 : n4 + ":" + n3;
    }

    public static String b(String string) {
        return a.matcher(string).replaceAll("");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean a(@Nullable String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }
}

