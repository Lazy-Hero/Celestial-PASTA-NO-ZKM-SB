/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.aw.s;
import net.minecraft.client.b.aS;
import net.minecraft.client.b.q;
import net.minecraft.client.j.u;

public class af {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<String, aS> b;
    private final /* synthetic */ u c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public s a(@Nullable aS aS2) {
        String[] arrstring = q.b();
        aS aS3 = aS2;
        if (arrstring != null) {
            if (aS3 == null) return null;
            aS3 = aS2;
        }
        s s2 = aS.b(aS3);
        return s2;
    }

    static u a(af af2) {
        return af2.c;
    }

    public void b(s s2) {
        aS.a(this.a(s2));
    }

    private aS a(s s2) {
        aS aS2 = this.b.get(s2.b);
        String[] arrstring = q.b();
        aS aS3 = aS2;
        if (arrstring != null) {
            if (aS3 == null) {
                aS2 = new aS(this, s2, null);
                this.b.put(s2.b, aS2);
            }
            aS3 = aS2;
        }
        return aS3;
    }

    public af(u u2) {
        this.b = Maps.newHashMap();
        this.c = u2;
    }

    static v a() {
        return a;
    }

    public void a(s s2, boolean bl2) {
        aS.a(this.a(s2), bl2);
    }

    static {
        a = new v("textures/map/map_icons.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b() {
        block2: {
            Iterator<aS> iterator = this.b.values().iterator();
            String[] arrstring = q.b();
            while (iterator.hasNext()) {
                aS aS2 = iterator.next();
                this.c.c(aS.c(aS2));
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.b.clear();
        }
    }

    @Nullable
    public aS a(String string) {
        return this.b.get(string);
    }
}

