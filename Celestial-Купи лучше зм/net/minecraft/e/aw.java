/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.t;
import net.minecraft.E.w;
import net.minecraft.E.z;
import net.minecraft.I.a;
import net.minecraft.I.d;
import net.minecraft.N.j;
import net.minecraft.R.b;
import net.minecraft.at.g;
import net.minecraft.at.l;
import net.minecraft.k.h;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aw
extends K {
    private final /* synthetic */ Random d;
    private static final /* synthetic */ String[] e;

    private static w a(w w2) {
        return w2;
    }

    @Override
    public List<String> b() {
        return Arrays.asList("?");
    }

    protected List<F> a(J j2, b b10) {
        List<F> list = b10.u().a(j2);
        Collections.sort(list);
        return list;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        if (arrstring.length == 1) {
            Set<String> set = this.a(b10).keySet();
            return aw.a(arrstring, set.toArray(new String[set.size()]));
        }
        return Collections.emptyList();
    }

    public aw() {
        this.d = new Random();
    }

    protected Map<String, F> a(b b10) {
        return b10.u().a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block13: {
            block12: {
                var4_4 = s.b();
                v0 = var2_2;
                if (var4_4 == null) break block12;
                if (!(v0 instanceof j)) break block13;
                v0 = var2_2;
            }
            v0.a(new g("Searge says: ").a(aw.e[this.d.nextInt(aw.e.length) % aw.e.length]));
            if (var4_4 != null) return;
        }
        var5_5 = this.a(var2_2, var1_1);
        var6_6 = 7;
        var7_7 = (var5_5.size() - 1) / 7;
        var8_8 = 0;
        try {
            v1 = var3_3.length;
            if (var4_4 == null) ** GOTO lbl21
            if (v1 == 0) {
                v2 = 0;
            } else {
                v1 = aw.a(var3_3[0], 1, var7_7 + 1);
lbl21:
                // 2 sources

                v2 = v1 - 1;
            }
            var8_8 = v2;
        }
        catch (w var9_9) {
            var10_11 = this.a(var1_1);
            var11_13 = var10_11.get(var3_3[0]);
            if (var11_13 != null) {
                throw new z(var11_13.a(var2_2), new Object[0]);
            }
            v3 = h.a(var3_3[0], -1);
            v4 = -1;
            if (var4_4 != null) {
                if (v3 != v4) throw var9_9;
                v3 = h.a(var3_3[0], -2);
                v4 = -2;
            }
            if (v3 != v4) throw var9_9;
            throw new t();
        }
        var9_10 = Math.min((var8_8 + 1) * 7, var5_5.size());
        var10_12 = new net.minecraft.at.h("commands.help.header", new Object[]{var8_8 + 1, var7_7 + 1});
        var10_12.e().a(l.DARK_GREEN);
        var2_2.a(var10_12);
        for (var11_14 = var8_8 * 7; var11_14 < var9_10; ++var11_14) {
            var12_16 = var5_5.get(var11_14);
            var13_17 = new net.minecraft.at.h(var12_16.a(var2_2), new Object[0]);
            var13_17.e().a(new d(a.SUGGEST_COMMAND, "/" + var12_16.a() + " "));
            var2_2.a(var13_17);
            if (var4_4 == null) return;
            if (var4_4 != null) continue;
        }
        if (var8_8 != 0) return;
        var11_15 = new net.minecraft.at.h("commands.help.footer", new Object[0]);
        var11_15.e().a(l.GREEN);
        var2_2.a(var11_15);
    }

    @Override
    public String a() {
        return "help";
    }

    static {
        e = new String[]{"Yolo", "Ask for help on twitter", "/deop @p", "Scoreboard deleted, commands blocked", "Contact helpdesk for help", "/testfornoob @p", "/trigger warning", "Oh my god, it's full of stats", "/kill @p[name=!Searge]", "Have you tried turning it off and on again?", "Sorry, no help today"};
    }

    @Override
    public String a(J j2) {
        return "commands.help.usage";
    }
}

