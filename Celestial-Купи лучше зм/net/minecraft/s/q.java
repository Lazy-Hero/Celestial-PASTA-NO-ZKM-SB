/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.D.e;
import net.minecraft.D.j;
import net.minecraft.D.m;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.a0;
import net.minecraft.E.s;
import net.minecraft.E.y;
import net.minecraft.E.z;
import net.minecraft.P.d;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.at.c;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class q
extends K {
    protected void j(J j2, String[] arrstring, int n2, b b10) throws s {
        String string;
        block17: {
            net.minecraft.D.a a10;
            net.minecraft.D.b b11;
            block14: {
                boolean bl2;
                block16: {
                    String string2;
                    block15: {
                        string = arrstring[n2++];
                        bl2 = a.b();
                        String string3 = arrstring[n2++];
                        b11 = this.b(b10);
                        a10 = net.minecraft.D.a.i.get(string3);
                        if (a10 == null) {
                            throw new z("commands.scoreboard.objectives.add.wrongType", string3);
                        }
                        if (b11.h(string) != null) {
                            throw new s("commands.scoreboard.objectives.add.alreadyExists", string);
                        }
                        int n3 = string.length();
                        if (bl2) {
                            if (n3 > 16) {
                                throw new y("commands.scoreboard.objectives.add.tooLong", string, 16);
                            }
                            n3 = string.isEmpty() ? 1 : 0;
                        }
                        if (bl2) {
                            if (n3 != 0) {
                                throw new z("commands.scoreboard.objectives.add.usage", new Object[0]);
                            }
                            n3 = arrstring.length;
                        }
                        if (n3 <= n2) break block14;
                        string2 = q.a(j2, arrstring, n2).f();
                        int n4 = string2.length();
                        if (bl2) {
                            if (n4 > 32) {
                                throw new y("commands.scoreboard.objectives.add.displayTooLong", string2, 32);
                            }
                            n4 = string2.isEmpty() ? 1 : 0;
                        }
                        if (n4 == 0) break block15;
                        b11.a(string, a10);
                        if (bl2) break block16;
                    }
                    b11.a(string, a10).a(string2);
                }
                if (bl2) break block17;
            }
            b11.a(string, a10);
        }
        q.a(j2, (F)this, "commands.scoreboard.objectives.add.success", string);
    }

    @Override
    public String a(J j2) {
        return "commands.scoreboard.usage";
    }

    protected m a(String string, b b10) throws s {
        m m2;
        net.minecraft.D.b b11 = this.b(b10);
        boolean bl2 = a.b();
        m m3 = m2 = b11.g(string);
        if (bl2) {
            if (m3 == null) {
                throw new s("commands.scoreboard.teamNotFound", string);
            }
            m3 = m2;
        }
        return m3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void c(J var1_1, String[] var2_2, int var3_3, b var4_4) throws s {
        block67: {
            block80: {
                block78: {
                    block79: {
                        block76: {
                            block77: {
                                block72: {
                                    block73: {
                                        block75: {
                                            block74: {
                                                block68: {
                                                    block69: {
                                                        block71: {
                                                            block70: {
                                                                block65: {
                                                                    block66: {
                                                                        block64: {
                                                                            block62: {
                                                                                block63: {
                                                                                    var6_5 = this.a(var2_2[var3_3++], var4_4);
                                                                                    var5_6 = a.c();
                                                                                    if (var6_5 == null) return;
                                                                                    var7_7 = var2_2[var3_3++].toLowerCase(Locale.ROOT);
                                                                                    v0 = "color".equalsIgnoreCase(var7_7);
                                                                                    if (var5_6) break block62;
                                                                                    if (v0 != 0) break block63;
                                                                                    v0 = "friendlyfire".equalsIgnoreCase(var7_7) ? 1 : 0;
                                                                                    if (var5_6) break block62;
                                                                                    if (v0 != 0) break block63;
                                                                                    v0 = "seeFriendlyInvisibles".equalsIgnoreCase(var7_7) ? 1 : 0;
                                                                                    if (var5_6) break block62;
                                                                                    if (v0 != 0) break block63;
                                                                                    v0 = "nametagVisibility".equalsIgnoreCase(var7_7) ? 1 : 0;
                                                                                    if (!var5_6) {
                                                                                        if (v0 == 0) {
                                                                                            v0 = "deathMessageVisibility".equalsIgnoreCase(var7_7) ? 1 : 0;
                                                                                            if (!var5_6) {
                                                                                                if (v0 == 0) {
                                                                                                    v0 = "collisionRule".equalsIgnoreCase(var7_7) ? 1 : 0;
                                                                                                    if (!var5_6) {
                                                                                                        if (v0 == 0) {
                                                                                                            throw new z("commands.scoreboard.teams.option.usage", new Object[0]);
                                                                                                        } else {
                                                                                                            ** GOTO lbl29
                                                                                                        }
                                                                                                    } else {
                                                                                                        ** GOTO lbl28
                                                                                                    }
                                                                                                } else {
                                                                                                    ** GOTO lbl27
                                                                                                }
                                                                                            } else {
                                                                                                ** GOTO lbl26
                                                                                            }
                                                                                        } else {
                                                                                            ** GOTO lbl25
                                                                                        }
                                                                                    }
                                                                                    break block62;
lbl25:
                                                                                    // 2 sources

                                                                                    break block63;
lbl26:
                                                                                    // 2 sources

                                                                                    break block62;
lbl27:
                                                                                    // 2 sources

                                                                                    break block63;
lbl28:
                                                                                    // 2 sources

                                                                                    break block62;
                                                                                }
                                                                                v1 = var2_2;
                                                                                if (var5_6) break block64;
                                                                                v0 = v1.length;
                                                                            }
                                                                            if (v0 == 4) {
                                                                                v2 = "color".equalsIgnoreCase(var7_7);
                                                                                if (!var5_6) {
                                                                                    if (v2) {
                                                                                        throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(l.a(true, false))});
                                                                                    }
                                                                                    v2 = "friendlyfire".equalsIgnoreCase(var7_7);
                                                                                }
                                                                                if (!var5_6) {
                                                                                    if (v2) throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(Arrays.asList(new String[]{"true", "false"}))});
                                                                                    v2 = "seeFriendlyInvisibles".equalsIgnoreCase(var7_7);
                                                                                }
                                                                                if (!var5_6) {
                                                                                    if (v2) throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(Arrays.asList(new String[]{"true", "false"}))});
                                                                                    v2 = "nametagVisibility".equalsIgnoreCase(var7_7);
                                                                                }
                                                                                if (!var5_6) {
                                                                                    if (v2) throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(j.a())});
                                                                                    v2 = "deathMessageVisibility".equalsIgnoreCase(var7_7);
                                                                                }
                                                                                if (!var5_6) {
                                                                                    if (v2) throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(j.a())});
                                                                                    v2 = "collisionRule".equalsIgnoreCase(var7_7);
                                                                                }
                                                                                if (v2 == false) throw new z("commands.scoreboard.teams.option.usage", new Object[0]);
                                                                                throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(net.minecraft.D.i.a())});
                                                                            }
                                                                            v1 = var2_2;
                                                                        }
                                                                        var8_8 = v1[var3_3];
                                                                        v3 = "color".equalsIgnoreCase(var7_7);
                                                                        if (var5_6) break block65;
                                                                        if (!v3) break block66;
                                                                        var9_9 = l.a(var8_8);
                                                                        v4 = var9_9;
                                                                        if (!var5_6) {
                                                                            if (v4 == null) throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(l.a(true, false))});
                                                                            v4 = var9_9;
                                                                        }
                                                                        if (v4.c()) {
                                                                            throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(l.a(true, false))});
                                                                        }
                                                                        var6_5.a((l)var9_9);
                                                                        var6_5.a(var9_9.toString());
                                                                        var6_5.b(l.RESET.toString());
                                                                        if (!var5_6) break block67;
                                                                    }
                                                                    v3 = "friendlyfire".equalsIgnoreCase(var7_7);
                                                                }
                                                                if (var5_6) break block68;
                                                                if (!v3) break block69;
                                                                v5 = "true".equalsIgnoreCase(var8_8);
                                                                if (var5_6) break block70;
                                                                if (v5) break block71;
                                                                v5 = "false".equalsIgnoreCase(var8_8);
                                                            }
                                                            if (!v5) {
                                                                throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(Arrays.asList(new String[]{"true", "false"}))});
                                                            }
                                                        }
                                                        var6_5.a("true".equalsIgnoreCase(var8_8));
                                                        if (!var5_6) break block67;
                                                    }
                                                    v3 = "seeFriendlyInvisibles".equalsIgnoreCase(var7_7);
                                                }
                                                if (var5_6) break block72;
                                                if (!v3) break block73;
                                                v6 = "true".equalsIgnoreCase(var8_8);
                                                if (var5_6) break block74;
                                                if (v6) break block75;
                                                v6 = "false".equalsIgnoreCase(var8_8);
                                            }
                                            if (!v6) {
                                                throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(Arrays.asList(new String[]{"true", "false"}))});
                                            }
                                        }
                                        var6_5.b("true".equalsIgnoreCase(var8_8));
                                        if (!var5_6) break block67;
                                    }
                                    v3 = "nametagVisibility".equalsIgnoreCase(var7_7);
                                }
                                if (var5_6) break block76;
                                if (!v3) break block77;
                                var9_9 = j.a(var8_8);
                                if (!var5_6) {
                                    if (var9_9 == null) {
                                        throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(j.a())});
                                    }
                                    var6_5.b((j)var9_9);
                                }
                                if (!var5_6) break block67;
                            }
                            v3 = "deathMessageVisibility".equalsIgnoreCase(var7_7);
                        }
                        if (var5_6) break block78;
                        if (!v3) break block79;
                        var9_9 = j.a(var8_8);
                        if (!var5_6) {
                            if (var9_9 == null) {
                                throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(j.a())});
                            }
                            var6_5.a((j)var9_9);
                        }
                        if (!var5_6) break block67;
                    }
                    v7 = "collisionRule";
                    if (var5_6) break block80;
                    v3 = v7.equalsIgnoreCase(var7_7);
                }
                if (!v3) break block67;
                v7 = var8_8;
            }
            if ((var9_9 = net.minecraft.D.i.a(v7)) == null) {
                throw new z("commands.scoreboard.teams.option.noValue", new Object[]{var7_7, q.a(net.minecraft.D.i.a())});
            }
            var6_5.a((net.minecraft.D.i)var9_9);
        }
        q.a(var1_1, (F)this, "commands.scoreboard.teams.option.success", new Object[]{var7_7, var6_5.b(), var8_8});
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        block72: {
            String[] arrstring2;
            block116: {
                int n3;
                block105: {
                    boolean bl2;
                    block106: {
                        block115: {
                            int n4;
                            block114: {
                                block112: {
                                    block113: {
                                        block111: {
                                            block110: {
                                                block109: {
                                                    int n5;
                                                    block108: {
                                                        block107: {
                                                            block101: {
                                                                block102: {
                                                                    String[] arrstring3;
                                                                    block104: {
                                                                        int n6;
                                                                        int n7;
                                                                        block103: {
                                                                            block100: {
                                                                                block79: {
                                                                                    block80: {
                                                                                        String[] arrstring4;
                                                                                        block99: {
                                                                                            int n8;
                                                                                            int n9;
                                                                                            block98: {
                                                                                                block81: {
                                                                                                    block82: {
                                                                                                        int n10;
                                                                                                        block97: {
                                                                                                            int n11;
                                                                                                            block96: {
                                                                                                                block87: {
                                                                                                                    block88: {
                                                                                                                        String[] arrstring5;
                                                                                                                        block95: {
                                                                                                                            int n12;
                                                                                                                            int n13;
                                                                                                                            block94: {
                                                                                                                                block93: {
                                                                                                                                    block89: {
                                                                                                                                        block90: {
                                                                                                                                            String[] arrstring6;
                                                                                                                                            block92: {
                                                                                                                                                int n14;
                                                                                                                                                int n15;
                                                                                                                                                block91: {
                                                                                                                                                    block83: {
                                                                                                                                                        block84: {
                                                                                                                                                            String[] arrstring7;
                                                                                                                                                            block86: {
                                                                                                                                                                int n16;
                                                                                                                                                                int n17;
                                                                                                                                                                block85: {
                                                                                                                                                                    block68: {
                                                                                                                                                                        block69: {
                                                                                                                                                                            String[] arrstring8;
                                                                                                                                                                            block78: {
                                                                                                                                                                                int n18;
                                                                                                                                                                                int n19;
                                                                                                                                                                                block77: {
                                                                                                                                                                                    block76: {
                                                                                                                                                                                        block73: {
                                                                                                                                                                                            block74: {
                                                                                                                                                                                                String[] arrstring9;
                                                                                                                                                                                                block75: {
                                                                                                                                                                                                    block70: {
                                                                                                                                                                                                        block71: {
                                                                                                                                                                                                            bl2 = a.b();
                                                                                                                                                                                                            n3 = arrstring.length;
                                                                                                                                                                                                            if (bl2) {
                                                                                                                                                                                                                if (n3 == 1) {
                                                                                                                                                                                                                    return q.a(arrstring, "objectives", "players", "teams");
                                                                                                                                                                                                                }
                                                                                                                                                                                                                n3 = "objectives".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!bl2) break block68;
                                                                                                                                                                                                            if (n3 == 0) break block69;
                                                                                                                                                                                                            n19 = arrstring.length;
                                                                                                                                                                                                            if (bl2) {
                                                                                                                                                                                                                if (n19 == 2) {
                                                                                                                                                                                                                    return q.a(arrstring, "list", "add", "remove", "setdisplay");
                                                                                                                                                                                                                }
                                                                                                                                                                                                                n19 = "add".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!bl2) break block70;
                                                                                                                                                                                                            if (n19 == 0) break block71;
                                                                                                                                                                                                            if (arrstring.length == 4) {
                                                                                                                                                                                                                Set<String> set = net.minecraft.D.a.i.keySet();
                                                                                                                                                                                                                return q.a(arrstring, set);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            break block72;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n19 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!bl2) break block73;
                                                                                                                                                                                                    if (n19 == 0) break block74;
                                                                                                                                                                                                    arrstring9 = arrstring;
                                                                                                                                                                                                    if (!bl2) break block75;
                                                                                                                                                                                                    if (arrstring9.length != 3) break block72;
                                                                                                                                                                                                    arrstring9 = arrstring;
                                                                                                                                                                                                }
                                                                                                                                                                                                return q.a(arrstring9, this.a(false, b10));
                                                                                                                                                                                            }
                                                                                                                                                                                            n19 = "setdisplay".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!bl2) break block76;
                                                                                                                                                                                        if (n19 == 0) break block72;
                                                                                                                                                                                        n19 = arrstring.length;
                                                                                                                                                                                    }
                                                                                                                                                                                    n18 = 3;
                                                                                                                                                                                    if (!bl2) break block77;
                                                                                                                                                                                    if (n19 == n18) {
                                                                                                                                                                                        return q.a(arrstring, net.minecraft.D.b.d());
                                                                                                                                                                                    }
                                                                                                                                                                                    arrstring8 = arrstring;
                                                                                                                                                                                    if (!bl2) break block78;
                                                                                                                                                                                    n19 = arrstring8.length;
                                                                                                                                                                                    n18 = 4;
                                                                                                                                                                                }
                                                                                                                                                                                if (n19 != n18) break block72;
                                                                                                                                                                                arrstring8 = arrstring;
                                                                                                                                                                            }
                                                                                                                                                                            return q.a(arrstring8, this.a(false, b10));
                                                                                                                                                                        }
                                                                                                                                                                        n3 = "players".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                                                                                                    }
                                                                                                                                                                    if (!bl2) break block79;
                                                                                                                                                                    if (n3 == 0) break block80;
                                                                                                                                                                    n9 = arrstring.length;
                                                                                                                                                                    if (bl2) {
                                                                                                                                                                        if (n9 == 2) {
                                                                                                                                                                            return q.a(arrstring, "set", "add", "remove", "reset", "list", "enable", "test", "operation", "tag");
                                                                                                                                                                        }
                                                                                                                                                                        n9 = "set".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                    }
                                                                                                                                                                    if (!bl2) break block81;
                                                                                                                                                                    if (n9 != 0) break block82;
                                                                                                                                                                    n9 = "add".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                    if (!bl2) break block81;
                                                                                                                                                                    if (n9 != 0) break block82;
                                                                                                                                                                    n9 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                    if (!bl2) break block81;
                                                                                                                                                                    if (n9 != 0) break block82;
                                                                                                                                                                    n9 = "reset".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                    if (!bl2) break block81;
                                                                                                                                                                    if (n9 != 0) break block82;
                                                                                                                                                                    n10 = "enable".equalsIgnoreCase(arrstring[1]);
                                                                                                                                                                    if (!bl2) break block83;
                                                                                                                                                                    if (n10 == 0) break block84;
                                                                                                                                                                    n17 = arrstring.length;
                                                                                                                                                                    n16 = 3;
                                                                                                                                                                    if (!bl2) break block85;
                                                                                                                                                                    if (n17 == n16) {
                                                                                                                                                                        return q.a(arrstring, b10.at());
                                                                                                                                                                    }
                                                                                                                                                                    arrstring7 = arrstring;
                                                                                                                                                                    if (!bl2) break block86;
                                                                                                                                                                    n17 = arrstring7.length;
                                                                                                                                                                    n16 = 4;
                                                                                                                                                                }
                                                                                                                                                                if (n17 != n16) break block72;
                                                                                                                                                                arrstring7 = arrstring;
                                                                                                                                                            }
                                                                                                                                                            return q.a(arrstring7, this.a(b10));
                                                                                                                                                        }
                                                                                                                                                        n10 = "list".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                    }
                                                                                                                                                    if (!bl2) break block87;
                                                                                                                                                    if (n10 != 0) break block88;
                                                                                                                                                    n10 = "test".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                    if (!bl2) break block87;
                                                                                                                                                    if (n10 != 0) break block88;
                                                                                                                                                    n13 = "operation".equalsIgnoreCase(arrstring[1]);
                                                                                                                                                    if (!bl2) break block89;
                                                                                                                                                    if (n13 == 0) break block90;
                                                                                                                                                    n15 = arrstring.length;
                                                                                                                                                    n14 = 3;
                                                                                                                                                    if (bl2) {
                                                                                                                                                        if (n15 == n14) {
                                                                                                                                                            return q.a(arrstring, this.b(b10).c());
                                                                                                                                                        }
                                                                                                                                                        n15 = arrstring.length;
                                                                                                                                                        n14 = 4;
                                                                                                                                                    }
                                                                                                                                                    if (bl2) {
                                                                                                                                                        if (n15 == n14) {
                                                                                                                                                            return q.a(arrstring, this.a(true, b10));
                                                                                                                                                        }
                                                                                                                                                        n15 = arrstring.length;
                                                                                                                                                        n14 = 5;
                                                                                                                                                    }
                                                                                                                                                    if (bl2) {
                                                                                                                                                        if (n15 == n14) {
                                                                                                                                                            return q.a(arrstring, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                                                                                                                                                        }
                                                                                                                                                        n15 = arrstring.length;
                                                                                                                                                        n14 = 6;
                                                                                                                                                    }
                                                                                                                                                    if (!bl2) break block91;
                                                                                                                                                    if (n15 == n14) {
                                                                                                                                                        return q.a(arrstring, b10.at());
                                                                                                                                                    }
                                                                                                                                                    arrstring6 = arrstring;
                                                                                                                                                    if (!bl2) break block92;
                                                                                                                                                    n15 = arrstring6.length;
                                                                                                                                                    n14 = 7;
                                                                                                                                                }
                                                                                                                                                if (n15 != n14) break block72;
                                                                                                                                                arrstring6 = arrstring;
                                                                                                                                            }
                                                                                                                                            return q.a(arrstring6, this.a(false, b10));
                                                                                                                                        }
                                                                                                                                        n13 = "tag".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                    }
                                                                                                                                    if (!bl2) break block93;
                                                                                                                                    if (n13 == 0) break block72;
                                                                                                                                    n13 = arrstring.length;
                                                                                                                                }
                                                                                                                                n12 = 3;
                                                                                                                                if (!bl2) break block94;
                                                                                                                                if (n13 == n12) {
                                                                                                                                    return q.a(arrstring, this.b(b10).c());
                                                                                                                                }
                                                                                                                                arrstring5 = arrstring;
                                                                                                                                if (!bl2) break block95;
                                                                                                                                n13 = arrstring5.length;
                                                                                                                                n12 = 4;
                                                                                                                            }
                                                                                                                            if (n13 != n12) break block72;
                                                                                                                            arrstring5 = arrstring;
                                                                                                                        }
                                                                                                                        return q.a(arrstring5, "add", "remove", "list");
                                                                                                                    }
                                                                                                                    n10 = arrstring.length;
                                                                                                                }
                                                                                                                n11 = 3;
                                                                                                                if (!bl2) break block96;
                                                                                                                if (n10 == n11) {
                                                                                                                    return q.a(arrstring, this.b(b10).c());
                                                                                                                }
                                                                                                                n10 = arrstring.length;
                                                                                                                if (!bl2) break block97;
                                                                                                                n11 = 4;
                                                                                                            }
                                                                                                            if (n10 != n11) break block72;
                                                                                                            n10 = "test".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                        }
                                                                                                        if (n10 != 0) {
                                                                                                            return q.a(arrstring, this.a(false, b10));
                                                                                                        }
                                                                                                        break block72;
                                                                                                    }
                                                                                                    n9 = arrstring.length;
                                                                                                }
                                                                                                n8 = 3;
                                                                                                if (!bl2) break block98;
                                                                                                if (n9 == n8) {
                                                                                                    return q.a(arrstring, b10.at());
                                                                                                }
                                                                                                arrstring4 = arrstring;
                                                                                                if (!bl2) break block99;
                                                                                                n9 = arrstring4.length;
                                                                                                n8 = 4;
                                                                                            }
                                                                                            if (n9 != n8) break block72;
                                                                                            arrstring4 = arrstring;
                                                                                        }
                                                                                        return q.a(arrstring4, this.a(true, b10));
                                                                                    }
                                                                                    n3 = "teams".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                }
                                                                                if (!bl2) break block100;
                                                                                if (n3 == 0) break block72;
                                                                                n3 = arrstring.length;
                                                                            }
                                                                            if (bl2) {
                                                                                if (n3 == 2) {
                                                                                    return q.a(arrstring, "add", "remove", "join", "leave", "empty", "list", "option");
                                                                                }
                                                                                n3 = "join".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                            }
                                                                            if (!bl2) break block101;
                                                                            if (n3 == 0) break block102;
                                                                            n7 = arrstring.length;
                                                                            n6 = 3;
                                                                            if (!bl2) break block103;
                                                                            if (n7 == n6) {
                                                                                return q.a(arrstring, this.b(b10).f());
                                                                            }
                                                                            arrstring3 = arrstring;
                                                                            if (!bl2) break block104;
                                                                            n7 = arrstring3.length;
                                                                            n6 = 4;
                                                                        }
                                                                        if (n7 < n6) break block72;
                                                                        arrstring3 = arrstring;
                                                                    }
                                                                    return q.a(arrstring3, b10.at());
                                                                }
                                                                n3 = "leave".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                            }
                                                            if (bl2) {
                                                                if (n3 != 0) {
                                                                    return q.a(arrstring, b10.at());
                                                                }
                                                                n3 = "empty".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                            }
                                                            if (!bl2) break block105;
                                                            if (n3 != 0) break block106;
                                                            n3 = "list".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                            if (!bl2) break block105;
                                                            if (n3 != 0) break block106;
                                                            n3 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                            if (!bl2) break block105;
                                                            if (n3 != 0) break block106;
                                                            n4 = "option".equalsIgnoreCase(arrstring[1]);
                                                            if (!bl2) break block107;
                                                            if (n4 == 0) break block72;
                                                            n4 = arrstring.length;
                                                        }
                                                        n5 = 3;
                                                        if (bl2) {
                                                            if (n4 == n5) {
                                                                return q.a(arrstring, this.b(b10).f());
                                                            }
                                                            n4 = arrstring.length;
                                                            n5 = 4;
                                                        }
                                                        if (!bl2) break block108;
                                                        if (n4 == n5) {
                                                            return q.a(arrstring, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility", "collisionRule");
                                                        }
                                                        n4 = arrstring.length;
                                                        if (!bl2) break block109;
                                                        n5 = 5;
                                                    }
                                                    if (n4 != n5) break block72;
                                                    n4 = "color".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                                                }
                                                if (bl2) {
                                                    if (n4 != 0) {
                                                        return q.a(arrstring, l.a(true, false));
                                                    }
                                                    n4 = "nametagVisibility".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                                                }
                                                if (!bl2) break block110;
                                                if (n4 != 0) break block111;
                                                n4 = "deathMessageVisibility".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                                            }
                                            if (!bl2) break block112;
                                            if (n4 == 0) break block113;
                                        }
                                        return q.a(arrstring, j.a());
                                    }
                                    n4 = "collisionRule".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                                }
                                if (bl2) {
                                    if (n4 != 0) {
                                        return q.a(arrstring, net.minecraft.D.i.a());
                                    }
                                    n4 = "friendlyfire".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                                }
                                if (!bl2) break block114;
                                if (n4 != 0) break block115;
                                n4 = "seeFriendlyInvisibles".equalsIgnoreCase(arrstring[3]) ? 1 : 0;
                            }
                            if (n4 == 0) break block72;
                        }
                        return q.a(arrstring, "true", "false");
                    }
                    arrstring2 = arrstring;
                    if (!bl2) break block116;
                    n3 = arrstring2.length;
                }
                if (n3 != 3) break block72;
                arrstring2 = arrstring;
            }
            return q.a(arrstring2, this.b(b10).f());
        }
        return Collections.emptyList();
    }

    protected void a(J j2, b b10) throws s {
        net.minecraft.D.b b11 = this.b(b10);
        Collection<net.minecraft.D.h> collection = b11.e();
        boolean bl2 = a.b();
        if (collection.isEmpty()) {
            throw new s("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        h h2 = new h("commands.scoreboard.objectives.list.count", collection.size());
        h2.e().a(l.DARK_GREEN);
        j2.a(h2);
        for (net.minecraft.D.h h3 : collection) {
            j2.a(new h("commands.scoreboard.objectives.list.entry", h3.e(), h3.b(), h3.a().a()));
            if (bl2) continue;
        }
    }

    private boolean a(b b10, J j2, String[] arrstring) throws s {
        ArrayList arrayList;
        boolean bl2;
        block16: {
            int n2;
            block18: {
                int n3;
                block17: {
                    block15: {
                        n2 = -1;
                        bl2 = a.c();
                        for (int i2 = 0; i2 < arrstring.length; ++i2) {
                            n3 = this.a(arrstring, i2) ? 1 : 0;
                            if (!bl2) {
                                int n4;
                                if (!bl2) {
                                    if (n3 == 0) continue;
                                    n4 = "*".equals(arrstring[i2]) ? 1 : 0;
                                }
                                if (!bl2) {
                                    if (n4 == false) continue;
                                    n4 = n2;
                                }
                                if (!bl2) {
                                    if (n4 >= 0) {
                                        throw new s("commands.scoreboard.noMultiWildcard", new Object[0]);
                                    }
                                    n4 = i2;
                                }
                                n2 = n4;
                                if (!bl2) continue;
                            }
                            break block15;
                        }
                        n3 = n2;
                    }
                    if (bl2) break block17;
                    if (n3 >= 0) break block18;
                    n3 = 0;
                }
                return n3 != 0;
            }
            ArrayList arrayList2 = Lists.newArrayList(this.b(b10).c());
            String string = arrstring[n2];
            arrayList = Lists.newArrayList();
            Iterator iterator = arrayList2.iterator();
            while (iterator.hasNext()) {
                String string2;
                arrstring[n2] = string2 = (String)iterator.next();
                try {
                    this.a(b10, j2, arrstring);
                    arrayList.add(string2);
                    if (bl2) break block16;
                }
                catch (s s2) {
                    h h2 = new h(s2.getMessage(), s2.a());
                    h2.e().a(l.RED);
                    j2.a(h2);
                }
                if (!bl2) continue;
            }
            arrstring[n2] = string;
            j2.a(net.minecraft.E.d.AFFECTED_ENTITIES, arrayList.size());
        }
        boolean bl3 = arrayList.isEmpty();
        if (!bl2) {
            if (bl3) {
                throw new z("commands.scoreboard.allMatchesFailed", new Object[0]);
            }
            bl3 = true;
        }
        return bl3;
    }

    protected void h(J j2, String[] arrstring, int n2, b b10) throws s {
        block3: {
            m m2;
            block2: {
                net.minecraft.D.b b11 = this.b(b10);
                boolean bl2 = a.c();
                m2 = this.a(arrstring[n2], b10);
                if (bl2) break block2;
                if (m2 == null) break block3;
                b11.c(m2);
            }
            q.a(j2, (F)this, "commands.scoreboard.teams.remove.success", m2.b());
        }
    }

    protected void k(J j2, String[] arrstring, int n2, b b10) throws s {
        boolean bl2;
        block13: {
            int n3;
            e e10;
            e e11;
            String string;
            block28: {
                block29: {
                    block26: {
                        block27: {
                            block24: {
                                block25: {
                                    block21: {
                                        block22: {
                                            e e12;
                                            block23: {
                                                block18: {
                                                    block19: {
                                                        e e13;
                                                        block20: {
                                                            block16: {
                                                                block17: {
                                                                    block14: {
                                                                        block15: {
                                                                            block11: {
                                                                                block12: {
                                                                                    net.minecraft.D.b b11 = this.b(b10);
                                                                                    String string2 = q.f(b10, j2, arrstring[n2++]);
                                                                                    net.minecraft.D.h h2 = this.a(arrstring[n2++], true, b10);
                                                                                    string = arrstring[n2++];
                                                                                    bl2 = a.b();
                                                                                    String string3 = q.f(b10, j2, arrstring[n2++]);
                                                                                    net.minecraft.D.h h3 = this.a(arrstring[n2], false, b10);
                                                                                    int n5 = string2.length();
                                                                                    n5 = 40;
                                                                                    if (bl2) {
                                                                                        if (n4 > n5) {
                                                                                            throw new y("commands.scoreboard.players.name.tooLong", string2, 40);
                                                                                        }
                                                                                        int n5 = string3.length();
                                                                                        n5 = 40;
                                                                                    }
                                                                                    if (n4 > n5) {
                                                                                        throw new y("commands.scoreboard.players.name.tooLong", string3, 40);
                                                                                    }
                                                                                    e11 = b11.d(string2, h2);
                                                                                    net.minecraft.D.b b12 = b11;
                                                                                    String string4 = string3;
                                                                                    net.minecraft.D.h h4 = h3;
                                                                                    if (bl2) {
                                                                                        if (!b12.c(string4, h4)) {
                                                                                            throw new s("commands.scoreboard.players.operation.notFound", h3.e(), string3);
                                                                                        }
                                                                                        b12 = b11;
                                                                                        string4 = string3;
                                                                                        h4 = h3;
                                                                                    }
                                                                                    e10 = b12.d(string4, h4);
                                                                                    n3 = "+=".equals(string);
                                                                                    if (!bl2) break block11;
                                                                                    if (n3 == 0) break block12;
                                                                                    e11.a(e11.a() + e10.a());
                                                                                    if (bl2) break block13;
                                                                                }
                                                                                n3 = "-=".equals(string);
                                                                            }
                                                                            if (!bl2) break block14;
                                                                            if (n3 == 0) break block15;
                                                                            e11.a(e11.a() - e10.a());
                                                                            if (bl2) break block13;
                                                                        }
                                                                        n3 = "*=".equals(string);
                                                                    }
                                                                    if (!bl2) break block16;
                                                                    if (n3 == 0) break block17;
                                                                    e11.a(e11.a() * e10.a());
                                                                    if (bl2) break block13;
                                                                }
                                                                n3 = "/=".equals(string);
                                                            }
                                                            if (!bl2) break block18;
                                                            if (n3 == 0) break block19;
                                                            e13 = e10;
                                                            if (!bl2) break block20;
                                                            if (e13.a() == 0) break block13;
                                                            e13 = e11;
                                                        }
                                                        e13.a(e11.a() / e10.a());
                                                        if (bl2) break block13;
                                                    }
                                                    n3 = "%=".equals(string);
                                                }
                                                if (!bl2) break block21;
                                                if (n3 == 0) break block22;
                                                e12 = e10;
                                                if (!bl2) break block23;
                                                if (e12.a() == 0) break block13;
                                                e12 = e11;
                                            }
                                            e12.a(e11.a() % e10.a());
                                            if (bl2) break block13;
                                        }
                                        n3 = "=".equals(string);
                                    }
                                    if (!bl2) break block24;
                                    if (n3 == 0) break block25;
                                    e11.a(e10.a());
                                    if (bl2) break block13;
                                }
                                n3 = "<".equals(string);
                            }
                            if (!bl2) break block26;
                            if (n3 == 0) break block27;
                            e11.a(Math.min(e11.a(), e10.a()));
                            if (bl2) break block13;
                        }
                        n3 = ">".equals(string);
                    }
                    if (!bl2) break block28;
                    if (n3 == 0) break block29;
                    e11.a(Math.max(e11.a(), e10.a()));
                    if (bl2) break block13;
                }
                n3 = "><".equals(string);
            }
            if (bl2) {
                if (n3 == 0) {
                    throw new s("commands.scoreboard.players.operation.invalidOperation", string);
                }
                n3 = e11.a();
            }
            int n6 = n3;
            e11.a(e10.a());
            e10.a(n6);
        }
        q.a(j2, (F)this, "commands.scoreboard.players.operation.success", new Object[0]);
        if (!net.minecraft.k.m.d()) {
            a.b(!bl2);
        }
    }

    protected void o(J j2, String[] arrstring, int n2, b b10) throws s {
        block7: {
            m m2;
            boolean bl2;
            m m3;
            net.minecraft.D.b b11;
            block8: {
                b11 = this.b(b10);
                m3 = this.a(arrstring[n2], b10);
                bl2 = a.b();
                m2 = m3;
                if (!bl2) break block8;
                if (m2 == null) break block7;
                m2 = m3;
            }
            ArrayList arrayList = Lists.newArrayList(m2.h());
            j2.a(net.minecraft.E.d.AFFECTED_ENTITIES, arrayList.size());
            ArrayList arrayList2 = arrayList;
            if (bl2) {
                if (arrayList2.isEmpty()) {
                    throw new s("commands.scoreboard.teams.empty.alreadyEmpty", m3.b());
                }
                arrayList2 = arrayList;
            }
            for (String string : arrayList2) {
                b11.a(string, m3);
                if (bl2) {
                    if (bl2) continue;
                }
                break block7;
            }
            q.a(j2, (F)this, "commands.scoreboard.teams.empty.success", arrayList.size(), m3.b());
        }
    }

    protected void n(J j2, String[] arrstring, int n2, b b10) throws s {
        block8: {
            Object object;
            Object object2;
            net.minecraft.D.b b11;
            block9: {
                b11 = this.b(b10);
                boolean bl2 = a.b();
                if (arrstring.length <= n2) break block9;
                object2 = q.f(b10, j2, arrstring[n2]);
                object = b11.d((String)object2);
                j2.a(net.minecraft.E.d.QUERY_RESULT, object.size());
                if (object.isEmpty()) {
                    throw new s("commands.scoreboard.players.list.player.empty", object2);
                }
                h h2 = new h("commands.scoreboard.players.list.player.count", object.size(), object2);
                h2.e().a(l.DARK_GREEN);
                j2.a(h2);
                for (e e10 : object.values()) {
                    j2.a(new h("commands.scoreboard.players.list.player.entry", e10.a(), e10.f().b(), e10.f().e()));
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block8;
                }
                if (bl2) break block8;
            }
            object2 = b11.c();
            j2.a(net.minecraft.E.d.QUERY_RESULT, object2.size());
            if (object2.isEmpty()) {
                throw new s("commands.scoreboard.players.list.empty", new Object[0]);
            }
            object = new h("commands.scoreboard.players.list.count", object2.size());
            ((c)object).e().a(l.DARK_GREEN);
            j2.a((k)object);
            j2.a(new g(q.a(object2.toArray())));
        }
    }

    /*
     * Exception decompiling
     */
    protected void i(J var1_1, String[] var2_2, int var3_3, b var4_4) throws s {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block53: {
            block105: {
                int n2;
                int n3;
                block104: {
                    boolean bl2;
                    block100: {
                        block101: {
                            block103: {
                                int n4;
                                block102: {
                                    block94: {
                                        block95: {
                                            block97: {
                                                block99: {
                                                    int n5;
                                                    block98: {
                                                        int n6;
                                                        block96: {
                                                            block92: {
                                                                block93: {
                                                                    block90: {
                                                                        block91: {
                                                                            block88: {
                                                                                block89: {
                                                                                    block86: {
                                                                                        block87: {
                                                                                            block64: {
                                                                                                block65: {
                                                                                                    int n7;
                                                                                                    block84: {
                                                                                                        block85: {
                                                                                                            block80: {
                                                                                                                block81: {
                                                                                                                    block83: {
                                                                                                                        int n8;
                                                                                                                        int n9;
                                                                                                                        block82: {
                                                                                                                            block78: {
                                                                                                                                block79: {
                                                                                                                                    block74: {
                                                                                                                                        block75: {
                                                                                                                                            block77: {
                                                                                                                                                int n10;
                                                                                                                                                int n11;
                                                                                                                                                block76: {
                                                                                                                                                    block72: {
                                                                                                                                                        block73: {
                                                                                                                                                            block70: {
                                                                                                                                                                block71: {
                                                                                                                                                                    block68: {
                                                                                                                                                                        block69: {
                                                                                                                                                                            block66: {
                                                                                                                                                                                block67: {
                                                                                                                                                                                    block54: {
                                                                                                                                                                                        block55: {
                                                                                                                                                                                            block63: {
                                                                                                                                                                                                int n12;
                                                                                                                                                                                                int n13;
                                                                                                                                                                                                block62: {
                                                                                                                                                                                                    block60: {
                                                                                                                                                                                                        block61: {
                                                                                                                                                                                                            block58: {
                                                                                                                                                                                                                block59: {
                                                                                                                                                                                                                    block56: {
                                                                                                                                                                                                                        block57: {
                                                                                                                                                                                                                            block52: {
                                                                                                                                                                                                                                bl2 = a.b();
                                                                                                                                                                                                                                n3 = this.a(b10, j2, arrstring);
                                                                                                                                                                                                                                if (!bl2) break block52;
                                                                                                                                                                                                                                if (n3 != 0) break block53;
                                                                                                                                                                                                                                n3 = arrstring.length;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (bl2) {
                                                                                                                                                                                                                                if (n3 < 1) {
                                                                                                                                                                                                                                    throw new z("commands.scoreboard.usage", new Object[0]);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n3 = "objectives".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!bl2) break block54;
                                                                                                                                                                                                                            if (n3 == 0) break block55;
                                                                                                                                                                                                                            n13 = arrstring.length;
                                                                                                                                                                                                                            if (bl2) {
                                                                                                                                                                                                                                if (n13 == 1) {
                                                                                                                                                                                                                                    throw new z("commands.scoreboard.objectives.usage", new Object[0]);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n13 = "list".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!bl2) break block56;
                                                                                                                                                                                                                            if (n13 == 0) break block57;
                                                                                                                                                                                                                            this.a(j2, b10);
                                                                                                                                                                                                                            if (bl2) break block53;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        n13 = "add".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!bl2) break block58;
                                                                                                                                                                                                                    if (n13 == 0) break block59;
                                                                                                                                                                                                                    if (arrstring.length < 4) {
                                                                                                                                                                                                                        throw new z("commands.scoreboard.objectives.add.usage", new Object[0]);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    this.j(j2, arrstring, 2, b10);
                                                                                                                                                                                                                    if (bl2) break block53;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                n13 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!bl2) break block60;
                                                                                                                                                                                                            if (n13 == 0) break block61;
                                                                                                                                                                                                            if (arrstring.length != 3) {
                                                                                                                                                                                                                throw new z("commands.scoreboard.objectives.remove.usage", new Object[0]);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.a(j2, arrstring[2], b10);
                                                                                                                                                                                                            if (bl2) break block53;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n13 = "setdisplay".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (bl2) {
                                                                                                                                                                                                        if (n13 == 0) {
                                                                                                                                                                                                            throw new z("commands.scoreboard.objectives.usage", new Object[0]);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n13 = arrstring.length;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    n12 = 3;
                                                                                                                                                                                                    if (!bl2) break block62;
                                                                                                                                                                                                    if (n13 == n12) break block63;
                                                                                                                                                                                                    n13 = arrstring.length;
                                                                                                                                                                                                    n12 = 4;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (n13 != n12) {
                                                                                                                                                                                                    throw new z("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            this.m(j2, arrstring, 2, b10);
                                                                                                                                                                                            if (bl2) break block53;
                                                                                                                                                                                        }
                                                                                                                                                                                        n3 = "players".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!bl2) break block64;
                                                                                                                                                                                    if (n3 == 0) break block65;
                                                                                                                                                                                    n7 = arrstring.length;
                                                                                                                                                                                    if (bl2) {
                                                                                                                                                                                        if (n7 == 1) {
                                                                                                                                                                                            throw new z("commands.scoreboard.players.usage", new Object[0]);
                                                                                                                                                                                        }
                                                                                                                                                                                        n7 = "list".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!bl2) break block66;
                                                                                                                                                                                    if (n7 == 0) break block67;
                                                                                                                                                                                    if (arrstring.length > 3) {
                                                                                                                                                                                        throw new z("commands.scoreboard.players.list.usage", new Object[0]);
                                                                                                                                                                                    }
                                                                                                                                                                                    this.n(j2, arrstring, 2, b10);
                                                                                                                                                                                    if (bl2) break block53;
                                                                                                                                                                                }
                                                                                                                                                                                n7 = "add".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                            }
                                                                                                                                                                            if (!bl2) break block68;
                                                                                                                                                                            if (n7 == 0) break block69;
                                                                                                                                                                            if (arrstring.length < 5) {
                                                                                                                                                                                throw new z("commands.scoreboard.players.add.usage", new Object[0]);
                                                                                                                                                                            }
                                                                                                                                                                            this.a(j2, arrstring, 2, b10);
                                                                                                                                                                            if (bl2) break block53;
                                                                                                                                                                        }
                                                                                                                                                                        n7 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                                    }
                                                                                                                                                                    if (!bl2) break block70;
                                                                                                                                                                    if (n7 == 0) break block71;
                                                                                                                                                                    if (arrstring.length < 5) {
                                                                                                                                                                        throw new z("commands.scoreboard.players.remove.usage", new Object[0]);
                                                                                                                                                                    }
                                                                                                                                                                    this.a(j2, arrstring, 2, b10);
                                                                                                                                                                    if (bl2) break block53;
                                                                                                                                                                }
                                                                                                                                                                n7 = "set".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                            }
                                                                                                                                                            if (!bl2) break block72;
                                                                                                                                                            if (n7 == 0) break block73;
                                                                                                                                                            if (arrstring.length < 5) {
                                                                                                                                                                throw new z("commands.scoreboard.players.set.usage", new Object[0]);
                                                                                                                                                            }
                                                                                                                                                            this.a(j2, arrstring, 2, b10);
                                                                                                                                                            if (bl2) break block53;
                                                                                                                                                        }
                                                                                                                                                        n7 = "reset".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                                    }
                                                                                                                                                    if (!bl2) break block74;
                                                                                                                                                    if (n7 == 0) break block75;
                                                                                                                                                    n11 = arrstring.length;
                                                                                                                                                    n10 = 3;
                                                                                                                                                    if (!bl2) break block76;
                                                                                                                                                    if (n11 == n10) break block77;
                                                                                                                                                    n11 = arrstring.length;
                                                                                                                                                    n10 = 4;
                                                                                                                                                }
                                                                                                                                                if (n11 != n10) {
                                                                                                                                                    throw new z("commands.scoreboard.players.reset.usage", new Object[0]);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            this.g(j2, arrstring, 2, b10);
                                                                                                                                            if (bl2) break block53;
                                                                                                                                        }
                                                                                                                                        n7 = "enable".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                                    }
                                                                                                                                    if (!bl2) break block78;
                                                                                                                                    if (n7 == 0) break block79;
                                                                                                                                    if (arrstring.length != 4) {
                                                                                                                                        throw new z("commands.scoreboard.players.enable.usage", new Object[0]);
                                                                                                                                    }
                                                                                                                                    this.l(j2, arrstring, 2, b10);
                                                                                                                                    if (bl2) break block53;
                                                                                                                                }
                                                                                                                                n7 = "test".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                                            }
                                                                                                                            if (!bl2) break block80;
                                                                                                                            if (n7 == 0) break block81;
                                                                                                                            n9 = arrstring.length;
                                                                                                                            n8 = 5;
                                                                                                                            if (!bl2) break block82;
                                                                                                                            if (n9 == n8) break block83;
                                                                                                                            n9 = arrstring.length;
                                                                                                                            n8 = 6;
                                                                                                                        }
                                                                                                                        if (n9 != n8) {
                                                                                                                            throw new z("commands.scoreboard.players.test.usage", new Object[0]);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.i(j2, arrstring, 2, b10);
                                                                                                                    if (bl2) break block53;
                                                                                                                }
                                                                                                                n7 = "operation".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                            }
                                                                                                            if (!bl2) break block84;
                                                                                                            if (n7 == 0) break block85;
                                                                                                            if (arrstring.length != 7) {
                                                                                                                throw new z("commands.scoreboard.players.operation.usage", new Object[0]);
                                                                                                            }
                                                                                                            this.k(j2, arrstring, 2, b10);
                                                                                                            if (bl2) break block53;
                                                                                                        }
                                                                                                        n7 = "tag".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                                    }
                                                                                                    if (bl2) {
                                                                                                        if (n7 == 0) {
                                                                                                            throw new z("commands.scoreboard.players.usage", new Object[0]);
                                                                                                        }
                                                                                                        n7 = arrstring.length;
                                                                                                    }
                                                                                                    if (n7 < 4) {
                                                                                                        throw new z("commands.scoreboard.players.tag.usage", new Object[0]);
                                                                                                    }
                                                                                                    this.a(b10, j2, arrstring, 2);
                                                                                                    if (bl2) break block53;
                                                                                                }
                                                                                                n3 = "teams".equalsIgnoreCase(arrstring[0]) ? 1 : 0;
                                                                                            }
                                                                                            if (bl2) {
                                                                                                if (n3 == 0) {
                                                                                                    throw new z("commands.scoreboard.usage", new Object[0]);
                                                                                                }
                                                                                                n3 = arrstring.length;
                                                                                            }
                                                                                            if (bl2) {
                                                                                                if (n3 == 1) {
                                                                                                    throw new z("commands.scoreboard.teams.usage", new Object[0]);
                                                                                                }
                                                                                                n3 = "list".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                            }
                                                                                            if (!bl2) break block86;
                                                                                            if (n3 == 0) break block87;
                                                                                            if (arrstring.length > 3) {
                                                                                                throw new z("commands.scoreboard.teams.list.usage", new Object[0]);
                                                                                            }
                                                                                            this.e(j2, arrstring, 2, b10);
                                                                                            if (bl2) break block53;
                                                                                        }
                                                                                        n3 = "add".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                                    }
                                                                                    if (!bl2) break block88;
                                                                                    if (n3 == 0) break block89;
                                                                                    if (arrstring.length < 3) {
                                                                                        throw new z("commands.scoreboard.teams.add.usage", new Object[0]);
                                                                                    }
                                                                                    this.b(j2, arrstring, 2, b10);
                                                                                    if (bl2) break block53;
                                                                                }
                                                                                n3 = "remove".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                            }
                                                                            if (!bl2) break block90;
                                                                            if (n3 == 0) break block91;
                                                                            if (arrstring.length != 3) {
                                                                                throw new z("commands.scoreboard.teams.remove.usage", new Object[0]);
                                                                            }
                                                                            this.h(j2, arrstring, 2, b10);
                                                                            if (bl2) break block53;
                                                                        }
                                                                        n3 = "empty".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                                    }
                                                                    if (!bl2) break block92;
                                                                    if (n3 == 0) break block93;
                                                                    if (arrstring.length != 3) {
                                                                        throw new z("commands.scoreboard.teams.empty.usage", new Object[0]);
                                                                    }
                                                                    this.o(j2, arrstring, 2, b10);
                                                                    if (bl2) break block53;
                                                                }
                                                                n3 = "join".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                                            }
                                                            if (!bl2) break block94;
                                                            if (n3 == 0) break block95;
                                                            n5 = arrstring.length;
                                                            n6 = 4;
                                                            if (!bl2) break block96;
                                                            if (n5 >= n6) break block97;
                                                            n5 = arrstring.length;
                                                            if (!bl2) break block98;
                                                            n6 = 3;
                                                        }
                                                        if (n5 != n6) break block99;
                                                        n5 = j2 instanceof net.minecraft.i.j;
                                                    }
                                                    if (n5 != 0) break block97;
                                                }
                                                throw new z("commands.scoreboard.teams.join.usage", new Object[0]);
                                            }
                                            this.d(j2, arrstring, 2, b10);
                                            if (bl2) break block53;
                                        }
                                        n3 = "leave".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                                    }
                                    if (!bl2) break block100;
                                    if (n3 == 0) break block101;
                                    n4 = arrstring.length;
                                    if (!bl2) break block102;
                                    if (n4 >= 3) break block103;
                                    n4 = j2 instanceof net.minecraft.i.j;
                                }
                                if (n4 == 0) {
                                    throw new z("commands.scoreboard.teams.leave.usage", new Object[0]);
                                }
                            }
                            this.f(j2, arrstring, 2, b10);
                            if (bl2) break block53;
                        }
                        n3 = "option".equalsIgnoreCase(arrstring[1]) ? 1 : 0;
                    }
                    if (bl2) {
                        if (n3 == 0) {
                            throw new z("commands.scoreboard.teams.usage", new Object[0]);
                        }
                        n3 = arrstring.length;
                    }
                    n2 = 4;
                    if (!bl2) break block104;
                    if (n3 == n2) break block105;
                    n3 = arrstring.length;
                    n2 = 5;
                }
                if (n3 != n2) {
                    throw new z("commands.scoreboard.teams.option.usage", new Object[0]);
                }
            }
            this.c(j2, arrstring, 2, b10);
        }
    }

    protected net.minecraft.D.b b(b b10) {
        return b10.c(0).c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void d(J var1_1, String[] var2_2, int var3_3, b var4_4) throws s {
        block13: {
            block18: {
                block15: {
                    block16: {
                        block17: {
                            var6_5 = this.b(var4_4);
                            var7_6 = var2_2[var3_3++];
                            var5_7 = a.b();
                            var8_8 = Sets.newHashSet();
                            var9_9 = Sets.newHashSet();
                            v0 = var1_1 instanceof net.minecraft.i.j;
                            if (!var5_7) ** GOTO lbl27
                            if (v0 == 0) break block15;
                            v0 = var3_3;
                            v1 = var2_2.length;
                            if (!var5_7) ** GOTO lbl29
                            if (v0 != v1) break block15;
                            var10_10 = q.a(var1_1).g();
                            v2 = var6_5.a(var10_10, var7_6);
                            if (!var5_7) break block16;
                            if (!v2) break block17;
                            var8_8.add(var10_10);
                            if (var5_7) break block16;
                        }
                        v2 = var9_9.add(var10_10);
                    }
                    if (var5_7) break block18;
                }
                block0: do {
                    block12: {
                        block14: {
                            v0 = var3_3;
lbl27:
                            // 2 sources

                            block1: while (true) {
                                v1 = var2_2.length;
lbl29:
                                // 2 sources

                                if (v0 >= v1) break block0;
                                v3 = var10_10 = var2_2[var3_3++];
                                if (!var5_7) break block12;
                                v4 = a0.a(v3);
                                if (!var5_7) break block13;
                                if (!v4) break block14;
                                for (x var12_12 : q.e(var4_4, var1_1, var10_10)) {
                                    block19: {
                                        block20: {
                                            var13_13 = q.f(var4_4, var1_1, var12_12.a2());
                                            v0 = var6_5.a(var13_13, var7_6) ? 1 : 0;
                                            if (!var5_7) continue block1;
                                            if (!var5_7) break block19;
                                            if (v0 == 0) break block20;
                                            var8_8.add(var13_13);
                                            if (var5_7) break block19;
                                        }
                                        var9_9.add(var13_13);
                                    }
                                    if (var5_7) continue;
                                }
                                break;
                            }
                            if (var5_7) continue;
                        }
                        v3 = q.f(var4_4, var1_1, var10_10);
                    }
                    var11_11 = v3;
                    v5 = var6_5.a(var11_11, var7_6);
                    if (!var5_7) continue;
                    if (v5) {
                        var8_8.add(var11_11);
                        if (var5_7) continue;
                    }
                    v5 = var9_9.add(var11_11);
                } while (var5_7);
            }
            v4 = var8_8.isEmpty();
        }
        if (var5_7) {
            if (!v4) {
                var1_1.a(net.minecraft.E.d.AFFECTED_ENTITIES, var8_8.size());
                q.a(var1_1, (F)this, "commands.scoreboard.teams.join.success", new Object[]{var8_8.size(), var7_6, q.a(var8_8.toArray(new String[var8_8.size()]))});
            }
            v4 = var9_9.isEmpty();
        }
        if (v4 != false) return;
        throw new s("commands.scoreboard.teams.join.failure", new Object[]{var9_9.size(), var7_6, q.a(var9_9.toArray(new String[var9_9.size()]))});
    }

    protected void l(J j2, String[] arrstring, int n2, b b10) throws s {
        String string;
        net.minecraft.D.b b11 = this.b(b10);
        if ((string = q.c(b10, j2, arrstring[n2++])).length() > 40) {
            throw new y("commands.scoreboard.players.name.tooLong", string, 40);
        }
        net.minecraft.D.h h2 = this.a(arrstring[n2], false, b10);
        if (h2.a() != net.minecraft.D.a.f) {
            throw new s("commands.scoreboard.players.enable.noTrigger", h2.e());
        }
        e e10 = b11.d(string, h2);
        e10.a(false);
        q.a(j2, (F)this, "commands.scoreboard.players.enable.success", h2.e(), string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void e(J j2, String[] arrstring, int n2, b b10) throws s {
        block9: {
            Object object;
            Iterable<String> iterable;
            Object object2;
            boolean bl2;
            net.minecraft.D.b b11;
            block8: {
                b11 = this.b(b10);
                bl2 = a.c();
                if (arrstring.length <= n2) break block8;
                Object object3 = object2 = this.a(arrstring[n2], b10);
                if (!bl2) {
                    if (object3 == null) {
                        return;
                    }
                    object3 = object2;
                }
                iterable = ((m)object3).h();
                j2.a(net.minecraft.E.d.QUERY_RESULT, iterable.size());
                if (iterable.isEmpty()) {
                    throw new s("commands.scoreboard.teams.list.player.empty", ((m)object2).b());
                }
                object = new h("commands.scoreboard.teams.list.player.count", iterable.size(), ((m)object2).b());
                ((c)object).e().a(l.DARK_GREEN);
                j2.a((k)object);
                j2.a(new g(q.a(iterable.toArray())));
                if (!bl2) break block9;
            }
            object2 = b11.a();
            j2.a(net.minecraft.E.d.QUERY_RESULT, object2.size());
            if (object2.isEmpty()) {
                throw new s("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            iterable = new h("commands.scoreboard.teams.list.count", object2.size());
            ((c)iterable).e().a(l.DARK_GREEN);
            j2.a((k)iterable);
            object = object2.iterator();
            while (object.hasNext()) {
                m m2 = (m)object.next();
                j2.a(new h("commands.scoreboard.teams.list.entry", m2.b(), m2.a(), m2.h().size()));
                if (!bl2) continue;
            }
        }
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "scoreboard";
    }

    protected void b(J j2, String[] arrstring, int n2, b b10) throws s {
        String string;
        block16: {
            net.minecraft.D.b b11;
            block13: {
                boolean bl2;
                block15: {
                    String string2;
                    block14: {
                        string = arrstring[n2++];
                        b11 = this.b(b10);
                        bl2 = a.b();
                        if (b11.g(string) != null) {
                            throw new s("commands.scoreboard.teams.add.alreadyExists", string);
                        }
                        int n3 = string.length();
                        if (bl2) {
                            if (n3 > 16) {
                                throw new y("commands.scoreboard.teams.add.tooLong", string, 16);
                            }
                            n3 = string.isEmpty() ? 1 : 0;
                        }
                        if (bl2) {
                            if (n3 != 0) {
                                throw new z("commands.scoreboard.teams.add.usage", new Object[0]);
                            }
                            n3 = arrstring.length;
                        }
                        if (n3 <= n2) break block13;
                        string2 = q.a(j2, arrstring, n2).f();
                        int n4 = string2.length();
                        if (bl2) {
                            if (n4 > 32) {
                                throw new y("commands.scoreboard.teams.add.displayTooLong", string2, 32);
                            }
                            n4 = string2.isEmpty() ? 1 : 0;
                        }
                        if (n4 == 0) break block14;
                        b11.e(string);
                        if (bl2) break block15;
                    }
                    b11.e(string).c(string2);
                }
                if (bl2) break block16;
            }
            b11.e(string);
        }
        q.a(j2, (F)this, "commands.scoreboard.teams.add.success", string);
    }

    protected net.minecraft.D.h a(String string, boolean bl2, b b10) throws s {
        net.minecraft.D.h h2;
        block6: {
            net.minecraft.D.h h3;
            block5: {
                boolean bl3;
                block4: {
                    net.minecraft.D.b b11 = this.b(b10);
                    h3 = b11.h(string);
                    boolean bl4 = a.c();
                    if (h3 == null) {
                        throw new s("commands.scoreboard.objectiveNotFound", string);
                    }
                    bl3 = bl2;
                    if (bl4) break block4;
                    if (!bl3) break block5;
                    h2 = h3;
                    if (bl4) break block6;
                    bl3 = h2.a().b();
                }
                if (bl3) {
                    throw new s("commands.scoreboard.objectiveReadOnly", string);
                }
            }
            h2 = h3;
        }
        return h2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(String[] var1_1, int var2_2) {
        var3_3 = a.b();
        v0 = "players".equalsIgnoreCase(var1_1[0]);
        if (var3_3) {
            if (v0 == 0) {
                v1 = "teams".equalsIgnoreCase(var1_1[0]);
                if (var3_3 == false) return v1;
                if (!v1) {
                    return false;
                }
                v2 = var2_2;
                if (var3_3 == false) return (boolean)v2;
                if (v2 != 2) return (boolean)0;
                return (boolean)1;
            }
            v0 = var1_1.length;
        }
        v3 = 1;
        if (var3_3) {
            if (v0 > v3) {
                v0 = "operation".equalsIgnoreCase(var1_1[1]) ? 1 : 0;
                if (var3_3) {
                    if (v0 != 0) {
                        v4 = var2_2;
                        if (var3_3 == false) return (boolean)v4;
                        if (v4 == 2) return (boolean)1;
                        v4 = var2_2;
                        if (var3_3 == false) return (boolean)v4;
                        if (v4 == 5) return (boolean)1;
                        return (boolean)0;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var2_2;
            }
            if (var3_3 == false) return (boolean)v0;
            v3 = 2;
        }
        if (v0 != v3) return (boolean)0;
        return (boolean)1;
    }

    protected List<String> a(boolean bl2, b b10) {
        Collection<net.minecraft.D.h> collection = this.b(b10).e();
        boolean bl3 = a.c();
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.D.h h2 : collection) {
            block3: {
                boolean bl4;
                block4: {
                    bl4 = bl2;
                    if (bl3) break block3;
                    if (!bl4) break block4;
                    bl4 = h2.a().b();
                    if (bl3 || bl4) break block3;
                }
                bl4 = arrayList.add(h2.e());
            }
            if (!bl3) continue;
        }
        return arrayList;
    }

    protected List<String> a(b b10) {
        Collection<net.minecraft.D.h> collection = this.b(b10).e();
        boolean bl2 = a.b();
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.D.h h2 : collection) {
            if (h2.a() == net.minecraft.D.a.f) {
                arrayList.add(h2.e());
            }
            if (bl2) continue;
        }
        return arrayList;
    }

    protected void g(J j2, String[] arrstring, int n2, b b10) throws s {
        block4: {
            String string;
            block2: {
                net.minecraft.D.b b11;
                block3: {
                    b11 = this.b(b10);
                    string = q.f(b10, j2, arrstring[n2++]);
                    boolean bl2 = a.c();
                    if (bl2) break block2;
                    if (arrstring.length <= n2) break block3;
                    net.minecraft.D.h h2 = this.a(arrstring[n2++], false, b10);
                    b11.b(string, h2);
                    q.a(j2, (F)this, "commands.scoreboard.players.resetscore.success", h2.e(), string);
                    if (!bl2) break block4;
                }
                b11.b(string, null);
            }
            q.a(j2, (F)this, "commands.scoreboard.players.reset.success", string);
        }
    }

    protected void a(J j2, String string, b b10) throws s {
        net.minecraft.D.b b11 = this.b(b10);
        net.minecraft.D.h h2 = this.a(string, false, b10);
        b11.c(h2);
        q.a(j2, (F)this, "commands.scoreboard.objectives.remove.success", string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void f(J var1_1, String[] var2_2, int var3_3, b var4_4) throws s {
        block13: {
            block18: {
                block15: {
                    block16: {
                        block17: {
                            var6_5 = this.b(var4_4);
                            var7_6 = Sets.newHashSet();
                            var5_7 = a.b();
                            var8_8 = Sets.newHashSet();
                            v0 = var1_1 instanceof net.minecraft.i.j;
                            if (!var5_7) ** GOTO lbl26
                            if (v0 == 0) break block15;
                            v0 = var3_3;
                            v1 = var2_2.length;
                            if (!var5_7) ** GOTO lbl28
                            if (v0 != v1) break block15;
                            var9_9 = q.a(var1_1).g();
                            v2 = var6_5.c(var9_9);
                            if (!var5_7) break block16;
                            if (!v2) break block17;
                            var7_6.add(var9_9);
                            if (var5_7) break block16;
                        }
                        v2 = var8_8.add(var9_9);
                    }
                    if (var5_7) break block18;
                }
                block0: do {
                    block12: {
                        block14: {
                            v0 = var3_3;
lbl26:
                            // 2 sources

                            block1: while (true) {
                                v1 = var2_2.length;
lbl28:
                                // 2 sources

                                if (v0 >= v1) break block0;
                                v3 = var9_9 = var2_2[var3_3++];
                                if (!var5_7) break block12;
                                v4 = a0.a(v3);
                                if (!var5_7) break block13;
                                if (!v4) break block14;
                                for (x var11_11 : q.e(var4_4, var1_1, var9_9)) {
                                    block19: {
                                        block20: {
                                            var12_12 = q.f(var4_4, var1_1, var11_11.a2());
                                            v0 = var6_5.c(var12_12) ? 1 : 0;
                                            if (!var5_7) continue block1;
                                            if (!var5_7) break block19;
                                            if (v0 == 0) break block20;
                                            var7_6.add(var12_12);
                                            if (var5_7) break block19;
                                        }
                                        var8_8.add(var12_12);
                                    }
                                    if (var5_7) continue;
                                }
                                break;
                            }
                            if (var5_7) continue;
                        }
                        v3 = q.f(var4_4, var1_1, var9_9);
                    }
                    var10_10 = v3;
                    v5 = var6_5.c(var10_10);
                    if (!var5_7) continue;
                    if (v5) {
                        var7_6.add(var10_10);
                        if (var5_7) continue;
                    }
                    v5 = var8_8.add(var10_10);
                } while (var5_7);
            }
            v4 = var7_6.isEmpty();
        }
        if (var5_7) {
            if (!v4) {
                var1_1.a(net.minecraft.E.d.AFFECTED_ENTITIES, var7_6.size());
                q.a(var1_1, (F)this, "commands.scoreboard.teams.leave.success", new Object[]{var7_6.size(), q.a(var7_6.toArray(new String[var7_6.size()]))});
            }
            v4 = var8_8.isEmpty();
        }
        if (v4 != false) return;
        throw new s("commands.scoreboard.teams.leave.failure", new Object[]{var8_8.size(), q.a(var8_8.toArray(new String[var8_8.size()]))});
    }

    protected void m(J j2, String[] arrstring, int n2, b b10) throws s {
        block4: {
            int n3;
            block3: {
                boolean bl2;
                block2: {
                    net.minecraft.D.b b11 = this.b(b10);
                    bl2 = a.c();
                    String string = arrstring[n2++];
                    n3 = net.minecraft.D.b.f(string);
                    net.minecraft.D.h h2 = null;
                    if (arrstring.length == 4) {
                        h2 = this.a(arrstring[n2], false, b10);
                    }
                    if (n3 < 0) {
                        throw new s("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
                    }
                    b11.a(n3, h2);
                    if (bl2) break block2;
                    if (h2 == null) break block3;
                    q.a(j2, (F)this, "commands.scoreboard.objectives.setdisplay.successSet", net.minecraft.D.b.a(n3), h2.e());
                }
                if (!bl2) break block4;
            }
            q.a(j2, (F)this, "commands.scoreboard.objectives.setdisplay.successCleared", net.minecraft.D.b.a(n3));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void a(J var1_1, String[] var2_2, int var3_3, b var4_4) throws s {
        block13: {
            block14: {
                block11: {
                    block12: {
                        var6_5 = var2_2[var3_3 - 1];
                        var7_6 = var3_3;
                        var8_7 = q.f(var4_4, var1_1, var2_2[var3_3++]);
                        var5_8 = a.b();
                        if (var8_7.length() > 40) {
                            throw new y("commands.scoreboard.players.name.tooLong", new Object[]{var8_7, 40});
                        }
                        var9_9 = this.a(var2_2[var3_3++], true, var4_4);
                        v0 = "set";
                        if (!var5_8) ** GOTO lbl14
                        if (v0.equalsIgnoreCase(var6_5)) {
                            v1 = q.d(var2_2[var3_3++]);
                        } else {
                            v0 = var2_2[var3_3++];
lbl14:
                            // 2 sources

                            v1 = var10_10 = q.a(v0, 0);
                        }
                        if (var2_2.length > var3_3) {
                            var11_11 = q.a(var4_4, var1_1, var2_2[var7_6]);
                            try {
                                var12_12 = d.c(q.a(var2_2, var3_3));
                                var13_14 = q.a((x)var11_11);
                                if (!net.minecraft.P.c.a((i)var12_12, var13_14, true)) {
                                    throw new s("commands.scoreboard.players.set.tagMismatch", new Object[]{var8_7});
                                }
                            }
                            catch (net.minecraft.P.a var12_13) {
                                throw new s("commands.scoreboard.players.set.tagError", new Object[]{var12_13.getMessage()});
                            }
                        }
                        var11_11 = this.b(var4_4);
                        var12_12 = var11_11.d(var8_7, var9_9);
                        v2 = "set".equalsIgnoreCase(var6_5);
                        if (!var5_8) break block11;
                        if (!v2) break block12;
                        var12_12.a(var10_10);
                        if (var5_8) break block13;
                    }
                    v2 = "add".equalsIgnoreCase(var6_5);
                }
                if (!v2) break block14;
                var12_12.b(var10_10);
                if (var5_8) break block13;
            }
            var12_12.c(var10_10);
        }
        q.a(var1_1, (F)this, "commands.scoreboard.players.set.success", new Object[]{var9_9.e(), var8_7, var12_12.a()});
    }

    protected void a(b b10, J j2, String[] arrstring, int n2) throws s {
        block23: {
            J j3;
            Object object;
            block28: {
                int n3;
                block27: {
                    boolean bl2;
                    x x2;
                    block25: {
                        String string;
                        block26: {
                            String[] arrstring2;
                            String string2;
                            block24: {
                                int n4;
                                block21: {
                                    block22: {
                                        string2 = q.f(b10, j2, arrstring[n2]);
                                        x2 = q.a(b10, j2, arrstring[n2++]);
                                        bl2 = a.b();
                                        string = arrstring[n2++];
                                        Set<String> set = x2.X();
                                        n4 = "list".equals(string);
                                        if (!bl2) break block21;
                                        if (n4 == 0) break block22;
                                        if (!set.isEmpty()) {
                                            object = new h("commands.scoreboard.players.tag.list", string2);
                                            ((c)object).e().a(l.DARK_GREEN);
                                            j2.a((k)object);
                                            j2.a(new g(q.a(set.toArray())));
                                        }
                                        j2.a(net.minecraft.E.d.QUERY_RESULT, set.size());
                                        if (bl2) break block23;
                                    }
                                    arrstring2 = arrstring;
                                    if (!bl2) break block24;
                                    n4 = arrstring2.length;
                                }
                                if (n4 < 5) {
                                    throw new z("commands.scoreboard.players.tag.usage", new Object[0]);
                                }
                                arrstring2 = arrstring;
                            }
                            object = arrstring2[n2++];
                            n3 = arrstring.length;
                            if (bl2) {
                                if (n3 > n2) {
                                    try {
                                        r r2 = d.c(q.a(arrstring, n2));
                                        r r3 = q.a(x2);
                                        if (!net.minecraft.P.c.a(r2, r3, true)) {
                                            throw new s("commands.scoreboard.players.tag.tagMismatch", string2);
                                        }
                                    }
                                    catch (net.minecraft.P.a a10) {
                                        throw new s("commands.scoreboard.players.tag.tagError", a10.getMessage());
                                    }
                                }
                                n3 = "add".equals(string) ? 1 : 0;
                            }
                            if (!bl2) break block25;
                            if (n3 == 0) break block26;
                            J j4 = x2;
                            if (bl2) {
                                if (!j4.c((String)object)) {
                                    throw new s("commands.scoreboard.players.tag.tooMany", 1024);
                                }
                                j4 = j2;
                            }
                            q.a(j4, (F)this, "commands.scoreboard.players.tag.success.add", object);
                            if (bl2) break block23;
                        }
                        n3 = "remove".equals(string) ? 1 : 0;
                    }
                    if (!bl2) break block27;
                    if (n3 == 0) {
                        throw new z("commands.scoreboard.players.tag.usage", new Object[0]);
                    }
                    j3 = x2;
                    if (!bl2) break block28;
                    n3 = ((x)j3).b((String)object) ? 1 : 0;
                }
                if (n3 == 0) {
                    throw new s("commands.scoreboard.players.tag.notFound", object);
                }
                j3 = j2;
            }
            q.a(j3, (F)this, "commands.scoreboard.players.tag.success.remove", object);
        }
    }
}

