/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.I;

import com.google.common.collect.Maps;
import java.util.Map;

public enum a {
    OPEN_URL("open_url", true),
    OPEN_FILE("open_file", false),
    RUN_COMMAND("run_command", true),
    SUGGEST_COMMAND("suggest_command", true),
    CHANGE_PAGE("change_page", true);

    private static final /* synthetic */ Map<String, a> d;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;

    public String a() {
        return this.b;
    }

    private a(String string2, boolean bl2) {
        this.b = string2;
        this.c = bl2;
    }

    public static a a(String string) {
        return d.get(string);
    }

    public boolean b() {
        return this.c;
    }

    static {
        d = Maps.newHashMap();
        for (a a10 : net.minecraft.I.a.values()) {
            d.put(a10.a(), a10);
        }
    }
}

