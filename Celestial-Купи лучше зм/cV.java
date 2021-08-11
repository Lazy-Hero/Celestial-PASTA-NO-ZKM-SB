/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.IOException;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.u.h;

public class cV
extends bE {
    private static boolean lambda$onMouseEvent$0(dx dx2) {
        return dx2.a().equals(cV.c.W.g());
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @cL
    public void a(fk fk2) {
        block4: {
            block5: {
                cI cI2;
                block7: {
                    block8: {
                        boolean bl2;
                        m[] arrm;
                        block6: {
                            arrm = h.b();
                            if (arrm != null) break block4;
                            if (fk2.c != 2) break block5;
                            bl2 = cV.c.W instanceof j;
                            if (arrm != null) break block6;
                            if (!bl2) break block5;
                            cI2 = cj.b.g;
                            if (arrm != null) break block7;
                            bl2 = cI2.a().stream().anyMatch(cV::lambda$onMouseEvent$0);
                        }
                        if (!bl2) break block8;
                        cj.b.g.a().remove(cj.b.g.a(cV.c.W.g()));
                        cp.a((Object)ChatFormatting.RED + "Removed " + (Object)ChatFormatting.RESET + "'" + cV.c.W.g() + "' as Friend!");
                        gd.a("MCF", "Removed '" + cV.c.W.g() + "' as Friend!", 4, gD.INFO);
                        if (arrm == null) break block5;
                    }
                    cI2 = cj.b.g;
                }
                cI2.a(new dx(cV.c.W.g()));
                cp.a((Object)ChatFormatting.GREEN + "Added " + (Object)ChatFormatting.RESET + cV.c.W.g() + " as Friend!");
                gd.a("MCF", "Added " + cV.c.W.g() + " as Friend!", 4, gD.SUCCESS);
            }
            try {
                cj.c().a(cm.class).b();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public cV() {
        super("MCF", a5.Player);
    }
}

