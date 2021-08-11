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

public enum j {
    ALWAYS("always", 0),
    NEVER("never", 1),
    HIDE_FOR_OTHER_TEAMS("hideForOtherTeams", 2),
    HIDE_FOR_OWN_TEAM("hideForOwnTeam", 3);

    private static final /* synthetic */ Map<String, j> a;
    public final /* synthetic */ String internalName;
    public final /* synthetic */ int id;

    public static String[] a() {
        return a.keySet().toArray(new String[a.size()]);
    }

    @Nullable
    public static j a(String string) {
        return a.get(string);
    }

    private j(String string2, int n3) {
        this.internalName = string2;
        this.id = n3;
    }

    static {
        a = Maps.newHashMap();
        for (j j2 : j.values()) {
            a.put(j2.internalName, j2);
        }
    }
}

