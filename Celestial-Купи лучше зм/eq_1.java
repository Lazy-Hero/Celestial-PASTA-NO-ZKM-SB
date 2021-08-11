/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Q;

public class eq
extends e2 {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(String ... var1_1) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block20: {
                            var2_2 = e0.a();
                            v0 = var1_1.length;
                            if (!var2_2) break block20;
                            if (v0 <= 1) ** GOTO lbl62
                            v0 = var1_1[0].equals("fakehack") ? 1 : 0;
                        }
                        if (!var2_2) break block16;
                        if (v0 == 0) return;
                        v0 = var1_1[1].equals("add") ? 1 : 0;
                    }
                    if (!var2_2) ** GOTO lbl24
                    if (v0 == 0) break block17;
                    ct.l.add(var1_1[2]);
                    cp.a((Object)ChatFormatting.GREEN + "Added player " + (Object)ChatFormatting.RED + var1_1[2] + (Object)ChatFormatting.WHITE + " as HACKER!");
                    gd.a("FakeHack Manager", (Object)ChatFormatting.GREEN + "Added player " + (Object)ChatFormatting.RED + var1_1[2] + (Object)ChatFormatting.WHITE + " as HACKER!", 4, gD.SUCCESS);
                }
                v0 = var1_1[1].equals("del") ? 1 : 0;
lbl24:
                // 2 sources

                if (!var2_2) ** GOTO lbl44
                if (v0 == 0) break block18;
                v1 = var3_3 = Q.P().e.c(var1_1[2]);
                if (!var2_2) ** GOTO lbl34
                if (v1 != null) ** GOTO lbl33
                cp.a("\u00a7cThat player could not be found!");
                return;
lbl33:
                // 1 sources

                v1 = var3_3;
lbl34:
                // 2 sources

                v0 = ct.a(v1) ? 1 : 0;
                if (!var2_2) ** GOTO lbl44
                if (v0 == 0) break block18;
                ct.b(var3_3);
                cp.a((Object)ChatFormatting.GREEN + "Hacker " + (Object)ChatFormatting.RED + var3_3.g() + " " + (Object)ChatFormatting.WHITE + "was removed!");
                gd.a("FakeHack Manager", (Object)ChatFormatting.GREEN + "Hacker " + (Object)ChatFormatting.WHITE + "was removed!", 4, gD.SUCCESS);
            }
            v0 = var1_1[1].equals("clear") ? 1 : 0;
lbl44:
            // 3 sources

            if (!var2_2) break block19;
            if (v0 == 0) return;
            v2 = ct.l;
            if (!var2_2) ** GOTO lbl58
            v0 = v2.isEmpty() ? 1 : 0;
        }
        try {
            if (v0 != 0) {
                cp.a((Object)ChatFormatting.RED + "Your FakeHack list is empty!");
                gd.a("FakeHack Manager", "Your FakeHack list is empty!", 4, gD.ERROR);
                return;
            }
            v2 = ct.l;
lbl58:
            // 2 sources

            v2.clear();
            cp.a((Object)ChatFormatting.GREEN + "Your FakeHack list " + (Object)ChatFormatting.WHITE + " successfully cleared!");
            gd.a("FakeHack Manager", (Object)ChatFormatting.GREEN + "Your FakeHack list " + (Object)ChatFormatting.WHITE + " successfully cleared!", 4, gD.SUCCESS);
            if (var2_2 != false) return;
lbl62:
            // 2 sources

            cp.a(this.d());
            return;
        }
        catch (Exception var3_4) {
            // empty catch block
        }
    }

    public eq() {
        super("fakehack", "fakehack", "\u00a76.fakehack" + (Object)ChatFormatting.LIGHT_PURPLE + " add | del | clear\u00a73<name>", "\u00a76.fakehack" + (Object)ChatFormatting.LIGHT_PURPLE + " add | del | clear\u00a73<name>", "fakehack");
    }
}

