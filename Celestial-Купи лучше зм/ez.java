/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.IOException;
import net.minecraft.client.Q;
import net.minecraft.i.j;

public class ez
extends e2 {
    public ez() {
        super("friend", "1", "\u00a76.friend \u00a73<name>", "friend add", "friend del", "friend");
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(String ... arrstring) {
        block12: {
            boolean bl2 = e0.a();
            try {
                j j2;
                String[] arrstring2 = arrstring;
                if (bl2) {
                    if (arrstring2.length == 1) {
                        cp.a("\u00a7c.friend <name>");
                        return;
                    }
                    arrstring2 = arrstring;
                }
                String string = arrstring2[1];
                j j3 = j2 = Q.P().e.c(string);
                if (bl2) {
                    if (j3 == null) {
                        cp.a("\u00a7cThat player could not be found!");
                        return;
                    }
                    j3 = j2;
                }
                if (j3 == Q.P().s) {
                    cp.a("\u00a7c\u0422\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0448\u044c \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0441\u0430\u043c\u043e\u0433\u043e \u0441\u0435\u0431\u044f!");
                    return;
                }
                cI cI2 = cj.b.g;
                if (bl2) {
                    if (cI2.c(j2.g())) {
                        cj.b.g.d(j2.g());
                        cp.a("\u00a7aRemoved player " + (Object)ChatFormatting.RED + string + (Object)ChatFormatting.WHITE + " \u00a7afrom friend list!");
                        if (bl2) break block12;
                    }
                    cI2 = cj.b.g;
                }
                cI2.a(new dx(j2.g()));
                cp.a("\u00a7aAdded player " + (Object)ChatFormatting.RED + string + (Object)ChatFormatting.WHITE + " \u00a7ato friend-list!");
            }
            catch (Exception exception) {
                cp.a("\u00a7cNo, no, no. Usage: " + this.d());
            }
        }
        try {
            cj.c().a(cm.class).b();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

