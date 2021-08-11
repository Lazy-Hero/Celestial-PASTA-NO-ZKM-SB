/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.ar;

import java.util.List;
import java.util.Random;
import net.minecraft.ar.v;
import net.minecraft.client.b.a5;
import org.apache.commons.lang3.StringUtils;

public class a0 {
    private final /* synthetic */ Random b;
    private final /* synthetic */ String[] a;
    private static final /* synthetic */ a0 c;

    public a0() {
        this.b = new Random();
        this.a = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette".split(" ");
    }

    public void a(long l2) {
        this.b.setSeed(l2);
    }

    public static a0 a() {
        return c;
    }

    static {
        c = new a0();
    }

    public String a(a5 a52, int n2) {
        List<String> list;
        int n3 = this.b.nextInt(2) + 3;
        String string = "";
        int n4 = v.b();
        for (int i2 = 0; i2 < n3; ++i2) {
            if (i2 > 0) {
                string = string + " ";
            }
            string = string + this.a[this.b.nextInt(this.a.length)];
            if (n4 == 0) continue;
        }
        List<String> list2 = list = a52.c(string, n2);
        if (n4 == 0) {
            list2 = list2.size() >= 2 ? list.subList(0, 2) : list;
        }
        return StringUtils.join(list2, (String)" ");
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

