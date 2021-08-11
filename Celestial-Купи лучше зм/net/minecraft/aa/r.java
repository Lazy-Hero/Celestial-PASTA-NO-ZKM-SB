/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aA;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.A.d;
import net.minecraft.aA.h;
import net.minecraft.aA.v;
import net.minecraft.ah.A;
import net.minecraft.ah.w;
import net.minecraft.ah.z;
import net.minecraft.ar.Z;
import net.minecraft.c.l;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.k;
import net.minecraft.t.e;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r
implements k {
    private final /* synthetic */ v d;
    private final /* synthetic */ Set<Long> b;
    private final /* synthetic */ A a;
    private final /* synthetic */ e e;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ Long2ObjectMap<a> c;

    @Override
    public a a(int n2, int n3) {
        a a10 = this.b(n2, n3);
        boolean bl2 = h.a();
        a a11 = a10;
        if (!bl2) {
            if (a11 == null) {
                long l2 = net.minecraft.k.f.a(n2, n3);
                try {
                    a10 = this.d.a(n2, n3);
                }
                catch (Throwable throwable) {
                    net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Exception generating new chunk");
                    l l3 = f10.a("Chunk to be generated");
                    l3.a("Location", String.format("%d,%d", n2, n3));
                    l3.a("Position hash", l2);
                    l3.a("Generator", this.d);
                    throw new Z(f10);
                }
                this.c.put(l2, (Object)a10);
                a10.e();
                a10.a(this, this.d);
            }
            a11 = a10;
        }
        return a11;
    }

    public void c(a a10) {
        block3: {
            block2: {
                boolean bl2 = h.b();
                boolean bl3 = this.a.D.c(a10.t, a10.i);
                if (!bl2) break block2;
                if (!bl3) break block3;
                bl3 = this.b.add(net.minecraft.k.f.a(a10.t, a10.i));
            }
            a10.b = true;
        }
    }

    public List<d> a(net.minecraft.U.k k2, n n2) {
        return this.d.a(k2, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, int n3) {
        boolean bl2 = h.a();
        boolean bl3 = this.c.containsKey(net.minecraft.k.f.a(n2, n3));
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = this.e.a(n2, n3);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public void e() {
        this.e.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private a d(int n2, int n3) {
        a a10;
        a a11;
        block4: {
            boolean bl2 = h.a();
            try {
                a10 = a11 = this.e.a(this.a, n2, n3);
                if (bl2) return a10;
                if (a10 == null) break block4;
            }
            catch (Exception exception) {
                f.error("Couldn't load chunk", (Throwable)exception);
                return null;
            }
            a11.b(this.a.r());
            this.d.a(a11, n2, n3);
        }
        a10 = a11;
        return a10;
    }

    public boolean a(boolean bl2) {
        boolean bl3;
        block6: {
            int n2 = 0;
            boolean bl4 = h.b();
            ArrayList arrayList = Lists.newArrayList((Iterable)this.c.values());
            int n3 = 0;
            while (n3 < arrayList.size()) {
                block9: {
                    block8: {
                        boolean bl5;
                        block10: {
                            int n4;
                            block7: {
                                a a10 = (a)arrayList.get(n3);
                                bl3 = bl2;
                                if (!bl4) break block6;
                                if (bl4) {
                                    if (bl3) {
                                        this.a(a10);
                                    }
                                    n4 = a10.a(bl2);
                                }
                                if (!bl4) break block7;
                                if (n4 == false) break block8;
                                this.b(a10);
                                a10.b(false);
                                ++n2;
                                if (!bl4) break block9;
                                n4 = n2;
                            }
                            if (n4 != 24) break block8;
                            bl5 = bl2;
                            if (!bl4) break block10;
                            if (bl5) break block8;
                            bl5 = false;
                        }
                        return bl5;
                    }
                    ++n3;
                }
                if (bl4) continue;
            }
            bl3 = true;
        }
        return bl3;
    }

    public Collection<a> b() {
        return this.c.values();
    }

    @Override
    @Nullable
    public a c(int n2, int n3) {
        a a10;
        long l2 = net.minecraft.k.f.a(n2, n3);
        boolean bl2 = h.b();
        a a11 = a10 = (a)this.c.get(l2);
        if (bl2) {
            if (a11 != null) {
                a10.b = false;
            }
            a11 = a10;
        }
        return a11;
    }

    public void d() {
        ObjectIterator objectIterator = this.c.values().iterator();
        boolean bl2 = h.b();
        while (objectIterator.hasNext()) {
            a a10 = (a)objectIterator.next();
            this.c(a10);
            if (bl2) continue;
        }
    }

    public boolean a(z z2, String string, n n2) {
        return this.d.a(z2, string, n2);
    }

    public boolean a() {
        boolean bl2 = h.b();
        boolean bl3 = this.a.Y;
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public String a() {
        return "ServerChunkCache: " + this.c.size() + " Drop: " + this.b.size();
    }

    public r(A a10, e e10, v v2) {
        this.b = Sets.newHashSet();
        this.c = new Long2ObjectOpenHashMap(8192);
        this.a = a10;
        this.e = e10;
        this.d = v2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public int c() {
        return this.c.size();
    }

    static {
        f = LogManager.getLogger();
    }

    @Override
    public boolean b() {
        boolean bl2;
        block5: {
            block6: {
                r r2;
                block7: {
                    block8: {
                        boolean bl3 = h.a();
                        bl2 = this.a.Y;
                        if (bl3) break block5;
                        if (bl2) break block6;
                        r2 = this;
                        if (bl3) break block7;
                        if (r2.b.isEmpty()) break block8;
                        Iterator<Long> iterator = this.b.iterator();
                        int n2 = 0;
                        while (n2 < 100) {
                            block9: {
                                block10: {
                                    block11: {
                                        Object object = iterator;
                                        if (!bl3) {
                                            bl2 = object.hasNext();
                                            if (bl3) break block5;
                                            if (!bl2) break;
                                            object = iterator.next();
                                        }
                                        Long l2 = (Long)object;
                                        a a10 = (a)this.c.get((Object)l2);
                                        if (bl3) break block9;
                                        if (a10 == null) break block10;
                                        Object object2 = a10;
                                        if (bl3) break block11;
                                        if (!((a)object2).b) break block10;
                                        a10.c();
                                        this.b(a10);
                                        this.a(a10);
                                        object2 = this.c.remove((Object)l2);
                                    }
                                    ++n2;
                                }
                                iterator.remove();
                            }
                            if (!bl3) continue;
                        }
                    }
                    r2 = this;
                }
                r2.e.a();
            }
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    public a b(int n2, int n3) {
        a a10;
        block4: {
            a a11;
            block5: {
                a11 = this.c(n2, n3);
                boolean bl2 = h.b();
                a10 = a11;
                if (!bl2) break block4;
                if (a10 != null) break block5;
                a10 = a11 = this.d(n2, n3);
                if (!bl2) break block4;
                if (a10 != null) {
                    this.c.put(net.minecraft.k.f.a(n2, n3), (Object)a11);
                    a11.e();
                    a11.a(this, this.d);
                }
            }
            a10 = a11;
        }
        return a10;
    }

    @Nullable
    public n a(z z2, String string, n n2, boolean bl2) {
        return this.d.a(z2, string, n2, bl2);
    }

    public boolean c(int n2, int n3) {
        return this.c.containsKey(net.minecraft.k.f.a(n2, n3));
    }

    private void a(a a10) {
        try {
            this.e.b(this.a, a10);
        }
        catch (Exception exception) {
            f.error("Couldn't save entities", (Throwable)exception);
        }
    }

    private void b(a a10) {
        try {
            a10.b(this.a.r());
            this.e.a(this.a, a10);
        }
        catch (IOException iOException) {
            f.error("Couldn't save chunk", (Throwable)iOException);
        }
        catch (w w2) {
            f.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)w2);
        }
    }
}

