/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.D;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public enum i {
    ALWAYS("always", 0),
    NEVER("never", 1),
    HIDE_FOR_OTHER_TEAMS("pushOtherTeams", 2),
    HIDE_FOR_OWN_TEAM("pushOwnTeam", 3);

    public final /* synthetic */ int id;
    public final /* synthetic */ String name;
    private static final /* synthetic */ Map<String, i> a;

    private i(String string2, int n3) {
        this.name = string2;
        this.id = n3;
    }

    public static String[] a() {
        return a.keySet().toArray(new String[a.size()]);
    }

    @Nullable
    public static i a(String string) {
        return a.get(string);
    }

    static {
        a = Maps.newHashMap();
        for (i i2 : i.values()) {
            a.put(i2.name, i2);
        }
    }
}

