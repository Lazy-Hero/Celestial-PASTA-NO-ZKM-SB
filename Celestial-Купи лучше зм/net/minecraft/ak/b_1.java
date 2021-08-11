/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ak;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.ak.ae;
import net.minecraft.ak.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
    private static final /* synthetic */ Logger c;
    private final /* synthetic */ net.minecraft.aq.b b;
    private final /* synthetic */ int d = 3;
    private /* synthetic */ int g;
    private /* synthetic */ int e;
    private final /* synthetic */ Set<ae> f;
    private final /* synthetic */ Set<ae> a;

    private boolean a(ae ae2, ae ae3) {
        String string = h.h();
        boolean bl2 = ae2.c.f() & ae3.c.f();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        c = LogManager.getLogger();
    }

    public void a(int n2, h h2) {
        this.f.add(new ae(this, n2, h2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public b(net.minecraft.aq.b b10) {
        this.f = Sets.newLinkedHashSet();
        this.a = Sets.newLinkedHashSet();
        this.d = 3;
        this.b = b10;
    }

    public void a(int n2) {
        this.g |= n2;
    }

    private boolean b(ae ae2) {
        b b10;
        String string;
        block14: {
            boolean bl2;
            block13: {
                string = h.h();
                bl2 = this.a.isEmpty();
                if (string != null) break block13;
                if (bl2) {
                    return true;
                }
                b10 = this;
                if (string != null) break block14;
                bl2 = b10.b(ae2.c.f());
            }
            if (bl2) {
                return false;
            }
            b10 = this;
        }
        Iterator<ae> iterator = b10.a.iterator();
        while (iterator.hasNext()) {
            block16: {
                boolean bl3;
                block20: {
                    block17: {
                        ae ae3;
                        block18: {
                            boolean bl4;
                            block19: {
                                ae ae4;
                                block15: {
                                    ae4 = ae3 = iterator.next();
                                    if (string != null) break block15;
                                    if (ae4 == ae2) break block16;
                                    ae4 = ae2;
                                }
                                bl3 = ae4.b;
                                if (string != null) break block17;
                                if (bl3 < ae3.b) break block18;
                                bl4 = this.a(ae2, ae3);
                                if (string != null) break block19;
                                if (bl4) break block16;
                                bl4 = false;
                            }
                            return bl4;
                        }
                        bl3 = ae3.c.d();
                    }
                    if (string != null) break block20;
                    if (bl3) break block16;
                    bl3 = false;
                }
                return bl3;
            }
            if (string == null) continue;
        }
        return true;
    }

    public void a(int n2, boolean bl2) {
        block2: {
            block1: {
                String string;
                block0: {
                    string = h.h();
                    if (string != null) break block0;
                    if (!bl2) break block1;
                    this.c(n2);
                }
                if (string == null) break block2;
            }
            this.a(n2);
        }
    }

    private boolean a(ae ae2) {
        return ae2.c.e();
    }

    public void a(h h2) {
        Iterator<ae> iterator = this.f.iterator();
        String string = h.h();
        while (iterator.hasNext()) {
            ae ae2 = iterator.next();
            h h3 = ae2.c;
            if (h3 == h2) {
                boolean bl2 = ae2.d;
                if (string == null && bl2) {
                    ae2.d = false;
                    ae2.c.g();
                    bl2 = this.a.remove(ae2);
                }
                iterator.remove();
                return;
            }
            if (string == null) continue;
        }
    }

    public void c(int n2) {
        this.g &= ~n2;
    }

    public boolean b(int n2) {
        String string = h.h();
        boolean bl2 = this.g & n2;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public void a() {
        block17: {
            Set<ae> set;
            String string;
            block29: {
                boolean bl2;
                block16: {
                    block26: {
                        b b10;
                        block18: {
                            block19: {
                                String string2 = h.h();
                                this.b.b("goalSetup");
                                string = string2;
                                b10 = this;
                                if (string != null) break block18;
                                this.getClass();
                                if (b10.e++ % 3 != 0) break block19;
                                for (ae ae2 : this.f) {
                                    block24: {
                                        boolean bl3;
                                        block25: {
                                            block20: {
                                                block21: {
                                                    block22: {
                                                        boolean bl4;
                                                        block23: {
                                                            bl2 = ae2.d;
                                                            if (string != null) break block16;
                                                            if (string != null) break block20;
                                                            if (!bl2) break block21;
                                                            bl4 = this.b(ae2);
                                                            if (string != null) break block22;
                                                            if (!bl4) break block23;
                                                            bl4 = this.a(ae2);
                                                            if (string != null) break block22;
                                                            if (bl4) break block24;
                                                        }
                                                        ae2.d = false;
                                                        ae2.c.g();
                                                        bl4 = this.a.remove(ae2);
                                                    }
                                                    if (string == null) break block24;
                                                }
                                                bl3 = this.b(ae2);
                                            }
                                            if (string != null) break block25;
                                            if (!bl3) break block24;
                                            bl3 = ae2.c.c();
                                        }
                                        if (string == null && bl3) {
                                            ae2.d = true;
                                            ae2.c.a();
                                            bl3 = this.a.add(ae2);
                                        }
                                    }
                                    if (string == null) continue;
                                }
                                if (string == null) break block26;
                            }
                            b10 = this;
                        }
                        Iterator<ae> iterator = b10.a.iterator();
                        while (iterator.hasNext()) {
                            block28: {
                                block27: {
                                    ae ae2;
                                    ae2 = iterator.next();
                                    if (string != null) break block27;
                                    bl2 = this.a(ae2);
                                    if (string != null) break block16;
                                    if (bl2) break block28;
                                    ae2.d = false;
                                    ae2.c.g();
                                }
                                iterator.remove();
                            }
                            if (string == null) continue;
                        }
                    }
                    this.b.c();
                    set = this.a;
                    if (string != null) break block29;
                    bl2 = set.isEmpty();
                }
                if (bl2) break block17;
                this.b.b("goalTick");
                set = this.a;
            }
            for (ae ae2 : set) {
                ae2.c.b();
                if (string == null) {
                    if (string == null) continue;
                }
                break block17;
            }
            this.b.c();
        }
    }
}

