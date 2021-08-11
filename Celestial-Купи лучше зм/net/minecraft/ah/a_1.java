/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import net.minecraft.P.r;
import net.minecraft.ah.M;
import net.minecraft.ah.P;
import net.minecraft.ah.z;
import net.minecraft.k.m;

public class a {
    private final /* synthetic */ TreeMap<String, M> a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String d(String string) {
        M m2 = this.a.get(string);
        String string2 = z.I();
        M m3 = m2;
        if (string2 != null) {
            if (m3 == null) return "";
            m3 = m2;
        }
        String string3 = m3.a();
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, P p2) {
        M m2 = this.a.get(string);
        String string2 = z.I();
        M m3 = m2;
        if (string2 != null) {
            if (m3 == null) return false;
            m3 = m2;
        }
        P p3 = m3.d();
        P p4 = p2;
        if (string2 != null) {
            if (p3 == p4) return true;
            p3 = p2;
            p4 = P.ANY_VALUE;
        }
        if (p3 != p4) return false;
        return true;
    }

    public String[] b() {
        Set<String> set = this.a.keySet();
        return set.toArray(new String[set.size()]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(String string) {
        M m2 = this.a.get(string);
        String string2 = z.I();
        M m3 = m2;
        if (string2 != null) {
            if (m3 == null) return false;
            m3 = m2;
        }
        boolean bl2 = m3.c();
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void a(String string, String string2, P p2) {
        this.a.put(string, new M(string2, p2));
    }

    public r a() {
        r r2;
        block2: {
            r r3 = new r();
            String string = z.I();
            for (String string2 : this.a.keySet()) {
                M m2 = this.a.get(string2);
                r2 = r3;
                if (string != null) {
                    r2.a(string2, m2.a());
                    if (string != null) continue;
                }
                break block2;
            }
            r2 = r3;
        }
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(String string) {
        M m2 = this.a.get(string);
        String string2 = z.I();
        M m3 = m2;
        if (string2 != null) {
            if (m3 == null) return 0;
            m3 = m2;
        }
        int n2 = m3.b();
        return n2;
    }

    public void a(String string, String string2) {
        block2: {
            block1: {
                M m2;
                String string3;
                block0: {
                    M m3 = this.a.get(string);
                    string3 = z.I();
                    m2 = m3;
                    if (string3 == null) break block0;
                    if (m2 == null) break block1;
                    m2 = m3;
                }
                m2.a(string2);
                if (string3 != null) break block2;
            }
            this.a(string, string2, P.ANY_VALUE);
        }
    }

    public a() {
        block0: {
            this.a = new TreeMap();
            this.a("doFireTick", "true", P.BOOLEAN_VALUE);
            this.a("mobGriefing", "true", P.BOOLEAN_VALUE);
            this.a("keepInventory", "false", P.BOOLEAN_VALUE);
            this.a("doMobSpawning", "true", P.BOOLEAN_VALUE);
            this.a("doMobLoot", "true", P.BOOLEAN_VALUE);
            this.a("doTileDrops", "true", P.BOOLEAN_VALUE);
            this.a("doEntityDrops", "true", P.BOOLEAN_VALUE);
            this.a("commandBlockOutput", "true", P.BOOLEAN_VALUE);
            this.a("naturalRegeneration", "true", P.BOOLEAN_VALUE);
            String string = z.I();
            this.a("doDaylightCycle", "true", P.BOOLEAN_VALUE);
            this.a("logAdminCommands", "true", P.BOOLEAN_VALUE);
            this.a("showDeathMessages", "true", P.BOOLEAN_VALUE);
            this.a("randomTickSpeed", "3", P.NUMERICAL_VALUE);
            this.a("sendCommandFeedback", "true", P.BOOLEAN_VALUE);
            this.a("reducedDebugInfo", "false", P.BOOLEAN_VALUE);
            this.a("spectatorsGenerateChunks", "true", P.BOOLEAN_VALUE);
            this.a("spawnRadius", "10", P.NUMERICAL_VALUE);
            this.a("disableElytraMovementCheck", "false", P.BOOLEAN_VALUE);
            this.a("maxEntityCramming", "24", P.NUMERICAL_VALUE);
            String string2 = string;
            this.a("doWeatherCycle", "true", P.BOOLEAN_VALUE);
            this.a("doLimitedCrafting", "false", P.BOOLEAN_VALUE);
            this.a("maxCommandChainLength", "65536", P.NUMERICAL_VALUE);
            this.a("announceAdvancements", "true", P.BOOLEAN_VALUE);
            this.a("gameLoopFunction", "-", P.FUNCTION);
            if (!m.c()) break block0;
            z.b("XnkuTc");
        }
    }

    public void a(r r2) {
        Iterator<String> iterator = r2.d().iterator();
        String string = z.I();
        while (iterator.hasNext()) {
            String string2 = iterator.next();
            this.a(string2, r2.j(string2));
            if (string != null) continue;
        }
    }

    public boolean a(String string) {
        return this.a.containsKey(string);
    }
}

