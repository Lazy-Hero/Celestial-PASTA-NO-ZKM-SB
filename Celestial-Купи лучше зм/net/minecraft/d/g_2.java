/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.D;

import java.util.Iterator;
import net.minecraft.D.a;
import net.minecraft.D.b;
import net.minecraft.D.d;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.D.i;
import net.minecraft.D.j;
import net.minecraft.D.l;
import net.minecraft.D.m;
import net.minecraft.P.u;
import net.minecraft.P.w;
import net.minecraft.aw.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
extends r {
    private /* synthetic */ net.minecraft.P.r e;
    private static final /* synthetic */ Logger c;
    private /* synthetic */ b d;

    static {
        c = LogManager.getLogger();
    }

    protected void a(net.minecraft.P.r r2) {
        int n2 = l.a();
        for (int i2 = 0; i2 < 19; ++i2) {
            net.minecraft.P.r r3 = r2;
            String string = "slot_" + i2;
            if (n2 == 0) {
                if (!r3.a(string, 8)) continue;
                r3 = r2;
                string = "slot_" + i2;
            }
            String string2 = r3.j(string);
            h h2 = this.d.h(string2);
            this.d.a(i2, h2);
            if (n2 == 0) continue;
        }
    }

    public g() {
        this("scoreboard");
    }

    @Override
    public void b(net.minecraft.P.r r2) {
        block5: {
            g g10;
            int n2;
            block3: {
                block4: {
                    n2 = l.c();
                    g10 = this;
                    if (n2 == 0) break block3;
                    if (g10.d != null) break block4;
                    this.e = r2;
                    if (n2 != 0) break block5;
                }
                this.c(r2.c("Objectives", 10));
                g10 = this;
            }
            g10.a(r2.c("PlayerScores", 10));
            boolean bl2 = r2.a("DisplaySlots", 10);
            if (n2 != 0) {
                if (bl2) {
                    this.a(r2.h("DisplaySlots"));
                }
                bl2 = r2.a("Teams", 9);
            }
            if (bl2) {
                this.b(r2.c("Teams", 10));
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void c(u u2) {
        int n2 = 0;
        int n3 = l.c();
        while (n2 < u2.b()) {
            block3: {
                block4: {
                    String string;
                    a a10;
                    net.minecraft.P.r r2;
                    block6: {
                        String string2;
                        block5: {
                            r2 = u2.d(n2);
                            a10 = a.i.get(r2.j("CriteriaName"));
                            if (n3 == 0) break block3;
                            if (a10 == null) break block4;
                            string2 = string = r2.j("Name");
                            if (n3 == 0) break block5;
                            if (string2.length() <= 16) break block6;
                            string2 = string.substring(0, 16);
                        }
                        string = string2;
                    }
                    h h2 = this.d.a(string, a10);
                    h2.a(r2.j("DisplayName"));
                    h2.a(net.minecraft.D.d.a(r2.j("RenderType")));
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    protected u b() {
        u u2 = new u();
        Iterator<h> iterator = this.d.e().iterator();
        int n2 = l.a();
        while (iterator.hasNext()) {
            h h2 = iterator.next();
            if (h2.a() != null) {
                net.minecraft.P.r r2 = new net.minecraft.P.r();
                r2.a("Name", h2.e());
                r2.a("CriteriaName", h2.a().a());
                r2.a("DisplayName", h2.b());
                r2.a("RenderType", h2.c().a());
                u2.a(r2);
            }
            if (n2 == 0) continue;
        }
        return u2;
    }

    protected void a(u u2) {
        int n2 = 0;
        int n3 = l.c();
        while (n2 < u2.b()) {
            String string;
            h h2;
            net.minecraft.P.r r2;
            block7: {
                String string2;
                block6: {
                    r2 = u2.d(n2);
                    h2 = this.d.h(r2.j("Objective"));
                    string2 = string = r2.j("Name");
                    if (n3 == 0) break block6;
                    if (string2.length() <= 40) break block7;
                    string2 = string.substring(0, 40);
                }
                string = string2;
            }
            e e10 = this.d.d(string, h2);
            e10.a(r2.m("Score"));
            if (n3 != 0) {
                if (r2.b("Locked")) {
                    e10.a(r2.f("Locked"));
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public void a(b b10) {
        block3: {
            g g10;
            block2: {
                this.d = b10;
                int n2 = l.c();
                g10 = this;
                if (n2 == 0) break block2;
                if (g10.e == null) break block3;
                g10 = this;
            }
            g10.b(this.e);
        }
    }

    protected void c(net.minecraft.P.r r2) {
        block4: {
            net.minecraft.P.r r3 = new net.minecraft.P.r();
            boolean bl2 = false;
            int n2 = 0;
            int n3 = l.a();
            while (n2 < 19) {
                h h2 = this.d.b(n2);
                if (n3 == 0) {
                    if (n3 == 0) {
                        if (h2 != null) {
                            r3.a("slot_" + n2, h2.e());
                            bl2 = true;
                        }
                        ++n2;
                    }
                    if (n3 == 0) continue;
                }
                break block4;
            }
            if (!bl2) break block4;
            r2.a("DisplaySlots", r3);
        }
    }

    protected void a(m m2, u u2) {
        int n2 = l.a();
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            this.d.a(u2.c(i2), m2.b());
            if (n2 == 0) continue;
        }
    }

    protected u c() {
        u u2 = new u();
        int n2 = l.a();
        for (e e10 : this.d.b()) {
            if (e10.f() != null) {
                net.minecraft.P.r r2 = new net.minecraft.P.r();
                r2.a("Name", e10.d());
                r2.a("Objective", e10.f().e());
                r2.b("Score", e10.a());
                r2.a("Locked", e10.b());
                u2.a(r2);
            }
            if (n2 == 0) continue;
        }
        return u2;
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        int n2 = l.c();
        g g10 = this;
        if (n2 != 0) {
            if (g10.d == null) {
                c.warn("Tried to save scoreboard without having a scoreboard...");
                return r2;
            }
            r2.a("Objectives", this.b());
            r2.a("PlayerScores", this.c());
            r2.a("Teams", this.a());
            g10 = this;
        }
        g10.c(r2);
        return r2;
    }

    protected void b(u u2) {
        int n2 = 0;
        int n3 = l.c();
        while (n2 < u2.b()) {
            block34: {
                m m2;
                net.minecraft.P.r r2;
                block33: {
                    String string;
                    net.minecraft.P.r r3;
                    Enum enum_;
                    block32: {
                        int n4;
                        block29: {
                            block31: {
                                block30: {
                                    block26: {
                                        String string2;
                                        net.minecraft.P.r r4;
                                        block28: {
                                            block27: {
                                                String string3;
                                                block25: {
                                                    String string4;
                                                    block24: {
                                                        r2 = u2.d(n2);
                                                        string4 = string3 = r2.j("Name");
                                                        if (n3 == 0) break block24;
                                                        if (string4.length() <= 16) break block25;
                                                        string4 = string3.substring(0, 16);
                                                    }
                                                    string3 = string4;
                                                }
                                                m2 = this.d.e(string3);
                                                String string5 = r2.j("DisplayName");
                                                n4 = string5.length();
                                                if (n3 != 0) {
                                                    if (n4 > 32) {
                                                        string5 = string5.substring(0, 32);
                                                    }
                                                    m2.c(string5);
                                                    n4 = r2.a("TeamColor", 8) ? 1 : 0;
                                                }
                                                if (n3 != 0) {
                                                    if (n4 != 0) {
                                                        m2.a(net.minecraft.at.l.a(r2.j("TeamColor")));
                                                    }
                                                    m2.a(r2.j("Prefix"));
                                                    m2.b(r2.j("Suffix"));
                                                    n4 = r2.a("AllowFriendlyFire", 99) ? 1 : 0;
                                                }
                                                if (n3 != 0) {
                                                    if (n4 != 0) {
                                                        m2.a(r2.f("AllowFriendlyFire"));
                                                    }
                                                    n4 = r2.a("SeeFriendlyInvisibles", 99) ? 1 : 0;
                                                }
                                                if (n3 != 0) {
                                                    if (n4 != 0) {
                                                        m2.b(r2.f("SeeFriendlyInvisibles"));
                                                    }
                                                    n4 = r2.a("NameTagVisibility", 8) ? 1 : 0;
                                                }
                                                if (n3 == 0) break block26;
                                                if (n4 == 0) break block27;
                                                r4 = r2;
                                                string2 = "NameTagVisibility";
                                                if (n3 == 0) break block28;
                                                enum_ = j.a(r4.j(string2));
                                                if (enum_ != null) {
                                                    m2.b((j)enum_);
                                                }
                                            }
                                            r4 = r2;
                                            string2 = "DeathMessageVisibility";
                                        }
                                        n4 = r4.a(string2, 8) ? 1 : 0;
                                    }
                                    if (n3 == 0) break block29;
                                    if (n4 == 0) break block30;
                                    r3 = r2;
                                    string = "DeathMessageVisibility";
                                    if (n3 == 0) break block31;
                                    enum_ = j.a(r3.j(string));
                                    if (enum_ != null) {
                                        m2.a((j)enum_);
                                    }
                                }
                                r3 = r2;
                                string = "CollisionRule";
                            }
                            if (n3 == 0) break block32;
                            n4 = r3.a(string, 8) ? 1 : 0;
                        }
                        if (n4 == 0) break block33;
                        r3 = r2;
                        string = "CollisionRule";
                    }
                    enum_ = i.a(r3.j(string));
                    if (n3 == 0) break block34;
                    if (enum_ != null) {
                        m2.a((i)enum_);
                    }
                }
                this.a(m2, r2.c("Players", 8));
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public g(String string) {
        super(string);
    }

    protected u a() {
        u u2 = new u();
        int n2 = l.a();
        for (m m2 : this.d.a()) {
            block5: {
                net.minecraft.P.r r2 = new net.minecraft.P.r();
                r2.a("Name", m2.b());
                r2.a("DisplayName", m2.a());
                if (n2 == 0) {
                    if (m2.e().d() >= 0) {
                        r2.a("TeamColor", m2.e().b());
                    }
                    r2.a("Prefix", m2.c());
                    r2.a("Suffix", m2.e());
                    r2.a("AllowFriendlyFire", m2.g());
                    r2.a("SeeFriendlyInvisibles", m2.f());
                    r2.a("NameTagVisibility", m2.d().internalName);
                    r2.a("DeathMessageVisibility", m2.j().internalName);
                    r2.a("CollisionRule", m2.i().name);
                }
                u u3 = new u();
                for (String string : m2.h()) {
                    u3.a(new w(string));
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                    }
                    break block5;
                }
                r2.a("Players", u3);
                u2.a(r2);
            }
            if (n2 == 0) continue;
        }
        return u2;
    }
}

