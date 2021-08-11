/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.at.g;
import net.minecraft.k.m;

public class cp
implements ag {
    public static /* synthetic */ String e;

    static {
        e = "\u00a77[" + (Object)ChatFormatting.DARK_GREEN + "C" + (Object)ChatFormatting.WHITE + "elestial" + (Object)ChatFormatting.RESET + "\u00a77] \u00a78>> \u00a7f";
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(String string) {
        m[] arrm = ef.b();
        cp.b.s.a(new g(e + string));
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            m.b(!m.c());
        }
    }
}

