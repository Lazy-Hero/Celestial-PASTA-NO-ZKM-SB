/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.D;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.D.d;
import net.minecraft.D.f;
import net.minecraft.D.n;
import net.minecraft.D.o;
import net.minecraft.D.p;
import net.minecraft.at.l;

public interface a {
    public static final /* synthetic */ a f;
    public static final /* synthetic */ a[] g;
    public static final /* synthetic */ Map<String, a> i;
    public static final /* synthetic */ a k;
    public static final /* synthetic */ a a;
    public static final /* synthetic */ a[] c;
    public static final /* synthetic */ a e;
    public static final /* synthetic */ a n;
    public static final /* synthetic */ a m;
    public static final /* synthetic */ a d;
    public static final /* synthetic */ a j;
    public static final /* synthetic */ a l;
    public static final /* synthetic */ a h;
    public static final /* synthetic */ a b;

    public String a();

    static {
        i = Maps.newHashMap();
        a = new n("dummy");
        f = new n("trigger");
        l = new n("deathCount");
        b = new n("playerKillCount");
        n = new n("totalKillCount");
        d = new o("health");
        k = new p("food");
        h = new p("air");
        j = new p("armor");
        e = new p("xp");
        m = new p("level");
        g = new a[]{new f("teamkill.", net.minecraft.at.l.BLACK), new f("teamkill.", net.minecraft.at.l.DARK_BLUE), new f("teamkill.", net.minecraft.at.l.DARK_GREEN), new f("teamkill.", net.minecraft.at.l.DARK_AQUA), new f("teamkill.", net.minecraft.at.l.DARK_RED), new f("teamkill.", net.minecraft.at.l.DARK_PURPLE), new f("teamkill.", net.minecraft.at.l.GOLD), new f("teamkill.", net.minecraft.at.l.GRAY), new f("teamkill.", net.minecraft.at.l.DARK_GRAY), new f("teamkill.", net.minecraft.at.l.BLUE), new f("teamkill.", net.minecraft.at.l.GREEN), new f("teamkill.", net.minecraft.at.l.AQUA), new f("teamkill.", net.minecraft.at.l.RED), new f("teamkill.", net.minecraft.at.l.LIGHT_PURPLE), new f("teamkill.", net.minecraft.at.l.YELLOW), new f("teamkill.", net.minecraft.at.l.WHITE)};
        c = new a[]{new f("killedByTeam.", net.minecraft.at.l.BLACK), new f("killedByTeam.", net.minecraft.at.l.DARK_BLUE), new f("killedByTeam.", net.minecraft.at.l.DARK_GREEN), new f("killedByTeam.", net.minecraft.at.l.DARK_AQUA), new f("killedByTeam.", net.minecraft.at.l.DARK_RED), new f("killedByTeam.", net.minecraft.at.l.DARK_PURPLE), new f("killedByTeam.", net.minecraft.at.l.GOLD), new f("killedByTeam.", net.minecraft.at.l.GRAY), new f("killedByTeam.", net.minecraft.at.l.DARK_GRAY), new f("killedByTeam.", net.minecraft.at.l.BLUE), new f("killedByTeam.", net.minecraft.at.l.GREEN), new f("killedByTeam.", net.minecraft.at.l.AQUA), new f("killedByTeam.", net.minecraft.at.l.RED), new f("killedByTeam.", net.minecraft.at.l.LIGHT_PURPLE), new f("killedByTeam.", net.minecraft.at.l.YELLOW), new f("killedByTeam.", net.minecraft.at.l.WHITE)};
    }

    public boolean b();

    public d c();
}

