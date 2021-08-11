/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import net.minecraft.client.D.j;
import net.minecraft.client.v.l;
import net.minecraft.client.v.o;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class D
implements a {
    private final /* synthetic */ a a;

    public D(a a10) {
        this.a = a10;
    }

    @Override
    public BufferedImage c() throws IOException {
        return this.a.c();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public InputStream a(v v2) throws IOException {
        return this.a.a(this.a(v2));
    }

    @Override
    public String b() {
        return this.a.b();
    }

    private v a(v v2) {
        block5: {
            int n2;
            int n3;
            String string;
            block7: {
                boolean bl2;
                block6: {
                    block4: {
                        string = v2.a();
                        bl2 = h.b();
                        n3 = "lang/swg_de.lang".equals(string);
                        if (bl2) break block4;
                        if (n3 != 0) break block5;
                        n3 = string.startsWith("lang/");
                    }
                    if (bl2) break block6;
                    if (n3 == 0) break block5;
                    n3 = string.endsWith(".lang");
                }
                if (bl2) break block7;
                if (n3 == 0) break block5;
                n3 = string.indexOf(95);
            }
            if ((n2 = n3) != -1) {
                String string2 = string.substring(0, n2 + 1) + string.substring(n2 + 1, string.indexOf(46, n2)).toUpperCase() + ".lang";
                return new j(this, v2.c(), "", string2);
            }
        }
        return v2;
    }

    @Override
    public boolean b(v v2) {
        return this.a.b(this.a(v2));
    }

    @Override
    public Set<String> a() {
        return this.a.a();
    }

    @Override
    @Nullable
    public <T extends l> T a(o o2, String string) throws IOException {
        return this.a.a(o2, string);
    }
}

