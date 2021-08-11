/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.P;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import net.minecraft.P.g;
import net.minecraft.P.i;
import net.minecraft.P.l;
import net.minecraft.P.m;
import net.minecraft.P.n;
import net.minecraft.P.r;
import net.minecraft.P.s;
import net.minecraft.P.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u
extends i {
    private /* synthetic */ byte e;
    private /* synthetic */ List<i> c;
    private static final /* synthetic */ Logger d;

    public int c() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.a();
        u u2 = this;
        if (bl2) {
            if (!super.equals(object)) {
                return false;
            }
            u2 = (u)object;
        }
        u u3 = u2;
        boolean bl3 = this.e;
        if (bl2) {
            if (bl3 != u3.e) return false;
            bl3 = Objects.equals(this.c, u3.c);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public double g(int n2) {
        block3: {
            i i2;
            block4: {
                i i3;
                int n3;
                boolean bl2;
                block2: {
                    bl2 = i.f();
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                }
                if (n3 >= this.c.size()) break block3;
                i2 = i3 = this.c.get(n2);
                if (bl2) break block4;
                if (i2.d() != 6) break block3;
                i2 = i3;
            }
            return ((l)i2).d();
        }
        return 0.0;
    }

    public i h(int n2) {
        return this.c.remove(n2);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    @Override
    public byte d() {
        return 9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    void a(DataInput var1_1, int var2_2, g var3_3) throws IOException {
        v0 = i.f();
        var3_3.a(296L);
        var4_4 = v0;
        v1 = var2_2;
        if (!var4_4) {
            if (v1 > 512) {
                throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
            }
            this.e = var1_1.readByte();
            v1 = var1_1.readInt();
        }
        var5_5 = v1;
        v2 = this.e;
        if (!var4_4) {
            if (v2 == 0) {
                v2 = var5_5;
                if (!var4_4) {
                    if (v2 > 0) {
                        throw new RuntimeException("Missing type on ListTag");
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                var3_3.a(32L * (long)var5_5);
                this.c = Lists.newArrayListWithCapacity((int)var5_5);
                v2 = 0;
            }
        }
        var6_6 = v2;
        do {
            if (var6_6 >= var5_5) return;
            var7_7 = i.a(this.e);
            var7_7.a(var1_1, var2_2 + 1, var3_3);
            this.c.add(var7_7);
            ++var6_6;
        } while (!var4_4);
        net.minecraft.k.m.b(net.minecraft.k.m.d() == false);
    }

    public void a(int n2, i i2) {
        block5: {
            block7: {
                boolean bl2;
                block12: {
                    i i3;
                    block11: {
                        int n3;
                        block9: {
                            block10: {
                                block8: {
                                    block6: {
                                        block3: {
                                            block4: {
                                                bl2 = i.f();
                                                n3 = i2.d();
                                                if (bl2) break block3;
                                                if (n3 != 0) break block4;
                                                d.warn("Invalid TagEnd added to ListTag");
                                                if (!bl2) break block5;
                                            }
                                            n3 = n2;
                                        }
                                        if (bl2) break block6;
                                        if (n3 < 0) break block7;
                                        n3 = n2;
                                    }
                                    if (bl2) break block8;
                                    if (n3 >= this.c.size()) break block7;
                                    n3 = this.e;
                                }
                                if (bl2) break block9;
                                if (n3 != 0) break block10;
                                this.e = i2.d();
                                if (!bl2) break block11;
                            }
                            i3 = this;
                            if (bl2) break block12;
                            n3 = i3.e;
                        }
                        if (n3 != i2.d()) {
                            d.warn("Adding mismatching tag types to tag list");
                            return;
                        }
                    }
                    i3 = this.c.set(n2, i2);
                }
                if (!bl2) break block5;
            }
            d.warn("index out of bounds to set tag in tag list");
        }
    }

    public int b() {
        return this.c.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(i i2) {
        byte by2;
        block8: {
            boolean bl2;
            block6: {
                block7: {
                    bl2 = i.f();
                    by2 = i2.d();
                    if (!bl2) {
                        if (by2 == 0) {
                            d.warn("Invalid TagEnd added to ListTag");
                            if (!bl2) return;
                        }
                        by2 = this.e;
                    }
                    if (bl2) break block6;
                    if (by2 != 0) break block7;
                    this.e = i2.d();
                    if (!bl2) break block8;
                }
                by2 = this.e;
            }
            if (bl2) return;
            if (by2 != i2.d()) {
                d.warn("Adding mismatching tag types to tag list");
                return;
            }
        }
        by2 = (byte)(this.c.add(i2) ? 1 : 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String c(int n2) {
        String string;
        i i2;
        boolean bl2 = i.f();
        int n3 = n2;
        if (!bl2) {
            if (n3 < 0) return "";
            n3 = n2;
        }
        if (n3 >= this.c.size()) return "";
        i i3 = i2 = this.c.get(n2);
        if (!bl2) {
            if (i3.d() == 8) {
                string = i2.b();
                return string;
            }
            i3 = i2;
        }
        string = i3.toString();
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        boolean bl2 = i.a();
        int n3 = n2;
        if (!bl2) return n3;
        if (n3 < 0) return 0;
        n3 = n2;
        if (!bl2) return n3;
        if (n3 >= this.c.size()) return 0;
        i i2 = this.c.get(n2);
        n3 = i2.d();
        if (!bl2) return n3;
        if (n3 != 3) return 0;
        return ((n)i2).f();
    }

    public u a() {
        u u2;
        block2: {
            u u3 = new u();
            boolean bl2 = i.a();
            u3.e = this.e;
            for (i i2 : this.c) {
                i i3 = i2.e();
                u2 = u3;
                if (bl2) {
                    u2.c.add(i3);
                    if (bl2) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    public u() {
        this.c = Lists.newArrayList();
        this.e = 0;
    }

    static {
        d = LogManager.getLogger();
    }

    @Override
    public boolean c() {
        return this.c.isEmpty();
    }

    public float f(int n2) {
        block3: {
            i i2;
            block4: {
                i i3;
                int n3;
                boolean bl2;
                block2: {
                    bl2 = i.a();
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                }
                if (n3 >= this.c.size()) break block3;
                i2 = i3 = this.c.get(n2);
                if (!bl2) break block4;
                if (i2.d() != 5) break block3;
                i2 = i3;
            }
            return ((m)i2).e();
        }
        return 0.0f;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        boolean bl2 = i.f();
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.c.get(i2));
            if (!bl2) continue;
        }
        return stringBuilder.append(']').toString();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int[] e(int n2) {
        boolean bl2 = i.f();
        int n3 = n2;
        if (bl2) return new int[n3];
        if (n3 >= 0) {
            n3 = n2;
            if (bl2) return new int[n3];
            if (n3 < this.c.size()) {
                i i2 = this.c.get(n2);
                n3 = i2.d();
                if (bl2) return new int[n3];
                if (n3 == 11) {
                    return ((t)i2).a();
                }
            }
        }
        n3 = 0;
        return new int[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public i b(int n2) {
        i i2;
        block5: {
            int n3;
            block4: {
                boolean bl2 = i.f();
                n3 = n2;
                if (bl2) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.c.size()) {
                i2 = this.c.get(n2);
                return i2;
            }
        }
        i2 = new s();
        return i2;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        boolean bl2;
        block5: {
            block3: {
                u u2;
                block4: {
                    bl2 = i.f();
                    u2 = this;
                    if (bl2) break block3;
                    if (!u2.c.isEmpty()) break block4;
                    this.e = 0;
                    if (!bl2) break block5;
                }
                u2 = this;
            }
            u2.e = this.c.get(0).d();
        }
        dataOutput.writeByte(this.e);
        dataOutput.writeInt(this.c.size());
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            this.c.get(i2).a(dataOutput);
            if (!bl2) continue;
        }
    }

    public r d(int n2) {
        block3: {
            i i2;
            block4: {
                i i3;
                int n3;
                boolean bl2;
                block2: {
                    bl2 = i.a();
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                }
                if (n3 >= this.c.size()) break block3;
                i2 = i3 = this.c.get(n2);
                if (!bl2) break block4;
                if (i2.d() != 10) break block3;
                i2 = i3;
            }
            return (r)i2;
        }
        return new r();
    }
}

