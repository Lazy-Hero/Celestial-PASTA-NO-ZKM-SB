/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.E;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.Q.e;
import net.minecraft.a2;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.a_;
import net.minecraft.ar.v;
import net.minecraft.client.E.b;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.d.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i {
    private final /* synthetic */ Q c;
    @Nullable
    private /* synthetic */ aN b;
    private final /* synthetic */ Map<aN, aS> d;
    @Nullable
    private /* synthetic */ b a;
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ a_ e;

    static {
        f = LogManager.getLogger();
    }

    public void a(@Nullable aN aN2, boolean bl2) {
        block7: {
            b b10;
            block8: {
                i i2;
                String string;
                block6: {
                    aN aN3;
                    block5: {
                        block4: {
                            net.minecraft.client.o.j j2 = this.c.ar();
                            string = l.d();
                            if (j2 == null) break block4;
                            aN3 = aN2;
                            if (string != null) break block5;
                            if (aN3 != null && bl2) {
                                j2.a(j.a(aN2));
                            }
                        }
                        i2 = this;
                        if (string != null) break block6;
                        aN3 = i2.b;
                    }
                    if (aN3 == aN2) break block7;
                    this.b = aN2;
                    i2 = this;
                }
                b10 = i2.a;
                if (string != null) break block8;
                if (b10 == null) break block7;
                b10 = this.a;
            }
            b10.e(aN2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(e e10) {
        String string = l.d();
        e e11 = e10;
        if (string == null) {
            if (e11.c()) {
                this.e.a();
                this.d.clear();
            }
            this.e.a(e10.b());
            this.e.a(e10.a());
            e11 = e10;
        }
        for (Map.Entry<v, aS> entry : e11.d().entrySet()) {
            block20: {
                block14: {
                    block18: {
                        a2 a22;
                        aN aN2;
                        block19: {
                            boolean bl2;
                            block17: {
                                aS aS2;
                                block16: {
                                    b b10;
                                    block15: {
                                        Object object;
                                        block13: {
                                            aN2 = this.e.a(entry.getKey());
                                            object = aN2;
                                            if (string != null) break block13;
                                            if (object == null) break block14;
                                            object = entry.getValue();
                                        }
                                        aS2 = (aS)object;
                                        aS2.a(aN2.i(), aN2.e());
                                        this.d.put(aN2, aS2);
                                        b10 = this.a;
                                        if (string != null) break block15;
                                        if (b10 == null) break block16;
                                        b10 = this.a;
                                    }
                                    b10.a(aN2, aS2);
                                }
                                bl2 = e10.c();
                                if (string != null) break block17;
                                if (bl2) break block18;
                                bl2 = aS2.d();
                            }
                            if (!bl2) break block18;
                            a22 = aN2.d();
                            if (string != null) break block19;
                            if (a22 == null) break block18;
                            a22 = aN2.d();
                        }
                        if (a22.c()) {
                            this.c.ay().a(new net.minecraft.client.n.j(aN2));
                        }
                    }
                    if (string == null) break block20;
                }
                f.warn("Server informed client about progress for unknown advancement " + entry.getKey());
            }
            if (string == null) continue;
        }
    }

    public a_ a() {
        return this.e;
    }

    public i(Q q2) {
        this.e = new a_();
        this.d = Maps.newHashMap();
        this.c = q2;
    }

    public void a(@Nullable b b10) {
        block5: {
            i i2;
            String string;
            block6: {
                this.a = b10;
                string = l.d();
                i2 = this;
                if (string != null) break block6;
                i2.e.a(b10);
                if (b10 == null) break block5;
                i2 = this;
            }
            for (Map.Entry<aN, aS> entry : i2.d.entrySet()) {
                b10.a(entry.getKey(), entry.getValue());
                if (string == null) {
                    if (string == null) continue;
                }
                break block5;
            }
            b10.e(this.b);
        }
    }
}

