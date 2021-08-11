/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.E;

import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.client.E.g;
import net.minecraft.client.E.l;
import net.minecraft.k.f;
import net.minecraft.o.a;
import net.minecraft.o.b;
import net.minecraft.o.k;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
implements k {
    private static final /* synthetic */ Logger d;
    private final /* synthetic */ z a;
    private final /* synthetic */ Long2ObjectMap<a> c;
    private final /* synthetic */ a b;

    @Override
    @Nullable
    public a c(int n2, int n3) {
        return (a)this.c.get(f.a(n2, n3));
    }

    @Override
    public a a(int n2, int n3) {
        return (a)MoreObjects.firstNonNull((Object)this.c(n2, n3), (Object)this.b);
    }

    public a b(int n2, int n3) {
        a a10 = new a(this.a, n2, n3);
        this.c.put(f.a(n2, n3), (Object)a10);
        a10.g(true);
        return a10;
    }

    public void a(int n2, int n3) {
        a a10 = this.a(n2, n3);
        String string = l.d();
        Object object = a10;
        if (string == null) {
            if (!((a)object).y()) {
                a10.c();
            }
            object = this.c.remove(f.a(n2, n3));
        }
    }

    @Override
    public String a() {
        return "MultiplayerChunkCache: " + this.c.size() + ", " + this.c.size();
    }

    public n(z z2) {
        this.c = new g(this, 8192);
        this.b = new b(z2, 0, 0);
        this.a = z2;
    }

    static {
        d = LogManager.getLogger();
    }

    @Override
    public boolean b() {
        long l2;
        block9: {
            block8: {
                long l3;
                long l4 = System.currentTimeMillis();
                ObjectIterator objectIterator = this.c.values().iterator();
                String string = l.d();
                while (objectIterator.hasNext()) {
                    a a10 = (a)objectIterator.next();
                    if (string == null) {
                        long l5 = System.currentTimeMillis() - l4 - 5L;
                        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                        if (string == null) {
                            l6 = l6 > 0 ? (long)1 : (long)0;
                        }
                        a10.e((boolean)l6);
                        if (string == null) continue;
                    }
                    break block8;
                }
                l2 = (l3 = System.currentTimeMillis() - l4 - 100L) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (string != null) break block9;
                if (l2 > 0) {
                    d.info("Warning: Clientside chunk ticking took {} ms", (Object)(System.currentTimeMillis() - l4));
                }
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean b(int n2, int n3) {
        return this.c.containsKey(f.a(n2, n3));
    }
}

