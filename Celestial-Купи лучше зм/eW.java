/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  org.lwjgl.input.Keyboard
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.k.m;
import org.lwjgl.input.Keyboard;

public class eW
extends e2 {
    private static Exception a(Exception exception) {
        return exception;
    }

    public eW() {
        boolean bl2 = e0.a();
        super("bind", "bind", "\u00a76.bind" + (Object)ChatFormatting.LIGHT_PURPLE + " add \u00a73<name> \u00a73<key> | \u00a76.bind " + (Object)ChatFormatting.LIGHT_PURPLE + "del \u00a73<name> <key>", "\u00a76.bind" + (Object)ChatFormatting.LIGHT_PURPLE + " add \u00a73<name> \u00a73<key> | \u00a76.bind" + (Object)ChatFormatting.LIGHT_PURPLE + "del \u00a73<name> <key>", "bind");
        boolean bl3 = bl2;
        if (!m.d()) {
            e0.b(!bl3);
        }
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
        block13: {
            block11: {
                block12: {
                    block10: {
                        block14: {
                            var2_2 = e0.c();
                            v0 = var1_1;
                            if (var2_2) break block14;
                            if (v0.length != 4) ** GOTO lbl41
                            v0 = var1_1;
                        }
                        var3_3 = v0[2];
                        var4_5 = var1_1[3].toUpperCase();
                        var5_6 = cj.b.i.a(var3_3);
                        v1 = var1_1[0].equals("bind");
                        if (var2_2) break block10;
                        if (!v1) ** GOTO lbl40
                        v1 = var1_1[1].equals("add");
                    }
                    if (var2_2) break block11;
                    if (!v1) break block12;
                    var5_6.a(Keyboard.getKeyIndex((String)var4_5));
                    cp.a((Object)ChatFormatting.GREEN + var5_6.a() + (Object)ChatFormatting.WHITE + " was set on key " + (Object)ChatFormatting.RED + "\"" + var4_5 + "\"");
                    gd.a("Bind Manager", (Object)ChatFormatting.GREEN + var5_6.a() + (Object)ChatFormatting.WHITE + " was set on key " + (Object)ChatFormatting.RED + "\"" + var4_5 + "\"", 4, gD.SUCCESS);
                }
                v2 = var1_1[1];
                v3 = "del";
                if (var2_2) break block13;
                v1 = v2.equals(v3);
            }
            if (!v1) ** GOTO lbl40
            var5_6.a(0);
            cp.a((Object)ChatFormatting.GREEN + var5_6.a() + (Object)ChatFormatting.WHITE + " bind was deleted from key " + (Object)ChatFormatting.RED + "\"" + var4_5 + "\"");
            v2 = "Bind Manager";
            v3 = (Object)ChatFormatting.GREEN + var5_6.a() + (Object)ChatFormatting.WHITE + " bind was deleted from key " + (Object)ChatFormatting.RED + "\"" + var4_5 + "\"";
        }
        try {
            gd.a(v2, v3, 4, gD.SUCCESS);
lbl40:
            // 3 sources

            if (var2_2 == false) return;
lbl41:
            // 2 sources

            cp.a(this.d());
            return;
        }
        catch (Exception var3_4) {
            // empty catch block
        }
    }
}

