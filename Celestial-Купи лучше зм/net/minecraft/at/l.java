/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.at;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.at.c;
import net.minecraft.k.m;

public enum l {
    BLACK("BLACK", '0', 0),
    DARK_BLUE("DARK_BLUE", '1', 1),
    DARK_GREEN("DARK_GREEN", '2', 2),
    DARK_AQUA("DARK_AQUA", '3', 3),
    DARK_RED("DARK_RED", '4', 4),
    DARK_PURPLE("DARK_PURPLE", '5', 5),
    GOLD("GOLD", '6', 6),
    GRAY("GRAY", '7', 7),
    DARK_GRAY("DARK_GRAY", '8', 8),
    BLUE("BLUE", '9', 9),
    GREEN("GREEN", 'a', 10),
    AQUA("AQUA", 'b', 11),
    RED("RED", 'c', 12),
    LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13),
    YELLOW("YELLOW", 'e', 14),
    WHITE("WHITE", 'f', 15),
    OBFUSCATED("OBFUSCATED", 'k', true),
    BOLD("BOLD", 'l', true),
    STRIKETHROUGH("STRIKETHROUGH", 'm', true),
    UNDERLINE("UNDERLINE", 'n', true),
    ITALIC("ITALIC", 'o', true),
    RESET("RESET", 'r', -1);

    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private static final /* synthetic */ Pattern d;
    private final /* synthetic */ String b;
    private final /* synthetic */ char a;
    private final /* synthetic */ int e;
    private static final /* synthetic */ Map<String, l> h;

    public boolean c() {
        return this.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        m[] arrm = net.minecraft.at.c.b();
        l l2 = this;
        if (arrm == null) {
            if (l2.g) return false;
            l2 = this;
        }
        if (l2 == RESET) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static String b(String string) {
        return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    public static Collection<String> a(boolean bl2, boolean bl3) {
        ArrayList arrayList = Lists.newArrayList();
        l[] arrl = l.values();
        int n2 = arrl.length;
        m[] arrm = net.minecraft.at.c.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            l l2 = arrl[i2];
            boolean bl4 = l2.a();
            if (arrm == null) {
                if (bl4) {
                    bl4 = bl2;
                    if (arrm == null) {
                        if (!bl4) continue;
                    }
                } else {
                    bl4 = l2.c();
                }
            }
            if (arrm != null) continue;
            if (bl4) {
                bl4 = bl3;
                if (arrm != null || !bl4) continue;
            }
            bl4 = arrayList.add(l2.b());
            if (arrm == null) continue;
        }
        return arrayList;
    }

    @Nullable
    public static l a(int n2) {
        m[] arrm = net.minecraft.at.c.b();
        if (n2 < 0) {
            return RESET;
        }
        l[] arrl = l.values();
        int n3 = arrl.length;
        int n4 = 0;
        while (n4 < n3) {
            l l2 = arrl[n4];
            if (arrm == null) {
                if (l2.d() == n2) {
                    return l2;
                }
                ++n4;
            }
            if (arrm == null) continue;
        }
        return null;
    }

    public String b() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public int d() {
        return this.e;
    }

    @Nullable
    public static String c(@Nullable String string) {
        return string == null ? null : d.matcher(string).replaceAll("");
    }

    private l(String string2, char c10, boolean bl2, int n3) {
        this.f = string2;
        this.a = c10;
        this.g = bl2;
        this.e = n3;
        this.b = "\u00a7" + c10;
    }

    private l(String string2, char c10, boolean bl2) {
        this(string2, c10, bl2, -1);
    }

    private l(String string2, char c10, int n3) {
        this(string2, c10, false, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static l a(@Nullable String string) {
        m[] arrm = net.minecraft.at.c.b();
        Object object = string;
        if (arrm == null) {
            if (object == null) {
                return null;
            }
            object = h.get(l.b(string));
        }
        l l2 = (l)((Object)object);
        return l2;
    }

    static {
        h = Maps.newHashMap();
        d = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
        for (l l2 : l.values()) {
            h.put(l.b(l2.f), l2);
        }
    }

    public String toString() {
        return this.b;
    }
}

