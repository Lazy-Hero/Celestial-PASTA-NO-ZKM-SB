/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.P;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.P.b;
import net.minecraft.P.e;
import net.minecraft.P.g;
import net.minecraft.P.i;
import net.minecraft.P.j;
import net.minecraft.P.k;
import net.minecraft.P.l;
import net.minecraft.P.m;
import net.minecraft.P.n;
import net.minecraft.P.o;
import net.minecraft.P.p;
import net.minecraft.P.q;
import net.minecraft.P.t;
import net.minecraft.P.u;
import net.minecraft.P.w;
import net.minecraft.ar.Z;
import net.minecraft.c.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r
extends i {
    private static final /* synthetic */ Pattern e;
    private static /* synthetic */ boolean d;
    private final /* synthetic */ Map<String, i> f;
    private static final /* synthetic */ Logger c;

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && Objects.equals(this.f.entrySet(), ((r)object).f.entrySet());
    }

    public i g(String string) {
        return this.f.get(string);
    }

    private static byte b(DataInput dataInput, g g10) throws IOException {
        return dataInput.readByte();
    }

    public r h(String string) {
        block4: {
            boolean bl2 = i.f();
            try {
                r r2 = this;
                if (!bl2) {
                    if (!r2.a(string, 10)) break block4;
                    r2 = (r)this.f.get(string);
                }
                return r2;
            }
            catch (ClassCastException classCastException) {
                throw new Z(this.a(string, 10, classCastException));
            }
        }
        return new r();
    }

    public int e() {
        return this.f.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        block5: {
            Object object;
            StringBuilder stringBuilder2 = new StringBuilder("{");
            Object object2 = this.f.keySet();
            boolean bl2 = i.a();
            if (c.isDebugEnabled()) {
                object = Lists.newArrayList(this.f.keySet());
                Collections.sort(object);
                object2 = object;
            }
            object = object2.iterator();
            while (object.hasNext()) {
                String string = (String)object.next();
                stringBuilder = stringBuilder2;
                if (bl2) {
                    if (bl2) {
                        if (stringBuilder.length() != 1) {
                            stringBuilder2.append(',');
                        }
                        stringBuilder2.append(r.c(string)).append(':').append(this.f.get(string));
                    }
                    if (bl2) continue;
                }
                break block5;
            }
            stringBuilder = stringBuilder2.append('}');
        }
        return stringBuilder.toString();
    }

    public void a(String string, byte by2) {
        this.f.put(string, new k(by2));
    }

    public void b(String string, int n2) {
        this.f.put(string, new n(n2));
    }

    private static String a(DataInput dataInput, g g10) throws IOException {
        return dataInput.readUTF();
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        byte by2;
        boolean bl2 = i.a();
        g10.a(384L);
        boolean bl3 = bl2;
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.f.clear();
        while ((by2 = r.b(dataInput, g10)) != 0) {
            String string = r.a(dataInput, g10);
            g10.a(224 + 16 * string.length());
            i i2 = r.a(by2, string, dataInput, n2 + 1, g10);
            if (this.f.put(string, i2) != null) {
                g10.a(288L);
            }
            if (bl3) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static boolean g() {
        boolean bl2 = r.b();
        return !bl2;
    }

    public r() {
        this.f = Maps.newHashMap();
    }

    static i a(byte by2, String string, DataInput dataInput, int n2, g g10) throws IOException {
        i i2 = i.a(by2);
        try {
            i2.a(dataInput, n2, g10);
            return i2;
        }
        catch (IOException iOException) {
            f f10 = net.minecraft.c.f.a(iOException, "Loading NBT data");
            net.minecraft.c.l l2 = f10.a("NBT Tag");
            l2.a("Tag name", string);
            l2.a("Tag type", by2);
            throw new Z(f10);
        }
    }

    public static boolean b() {
        return d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte i(String string) {
        i i2 = this.f.get(string);
        boolean bl2 = i.f();
        i i3 = i2;
        if (!bl2) {
            if (i3 == null) {
                return 0;
            }
            i3 = i2;
        }
        byte by2 = i3.d();
        return by2;
    }

    public void k(String string) {
        this.f.remove(string);
    }

    @Nullable
    public UUID l(String string) {
        return new UUID(this.o(string + "Most"), this.o(string + "Least"));
    }

    public void a(r r2) {
        Iterator<String> iterator = r2.f.keySet().iterator();
        boolean bl2 = i.f();
        while (iterator.hasNext()) {
            block7: {
                i i2;
                String string;
                block4: {
                    String string2;
                    r r3;
                    block5: {
                        block6: {
                            byte by2;
                            block3: {
                                string = iterator.next();
                                i2 = r2.f.get(string);
                                by2 = i2.d();
                                if (bl2) break block3;
                                if (by2 != 10) break block4;
                                r3 = this;
                                string2 = string;
                                if (bl2) break block5;
                                by2 = (byte)(r3.a(string2, 10) ? (int)1 : 0);
                            }
                            if (by2 == 0) break block6;
                            r r4 = this.h(string);
                            r4.a((r)i2);
                            if (!bl2) break block7;
                        }
                        r3 = this;
                        string2 = string;
                    }
                    r3.a(string2, i2.e());
                    if (!bl2) break block7;
                }
                this.a(string, i2.e());
            }
            if (!bl2) continue;
        }
    }

    public byte r(String string) {
        block4: {
            boolean bl2 = i.a();
            try {
                byte by2 = this.a(string, 99);
                if (bl2) {
                    if (by2 == 0) break block4;
                    by2 = ((j)this.f.get(string)).b();
                }
                return by2;
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0;
    }

    public int m(String string) {
        block4: {
            boolean bl2 = i.a();
            try {
                int n2 = this.a(string, 99);
                if (bl2) {
                    if (n2 == 0) break block4;
                    n2 = ((j)this.f.get(string)).f();
                }
                return n2;
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0;
    }

    public byte[] a(String string) {
        block4: {
            boolean bl2 = i.a();
            try {
                i i2 = this;
                if (bl2) {
                    if (!i2.a(string, 7)) break block4;
                    i2 = this.f.get(string);
                }
                return ((q)i2).a();
            }
            catch (ClassCastException classCastException) {
                throw new Z(this.a(string, 7, classCastException));
            }
        }
        return new byte[0];
    }

    public r c() {
        r r2;
        block2: {
            r r3 = new r();
            Iterator<String> iterator = this.f.keySet().iterator();
            boolean bl2 = i.a();
            while (iterator.hasNext()) {
                String string = iterator.next();
                r2 = r3;
                if (bl2) {
                    r2.a(string, this.f.get(string).e());
                    if (bl2) continue;
                }
                break block2;
            }
            r2 = r3;
        }
        return r2;
    }

    public void a(String string, String string2) {
        this.f.put(string, new w(string2));
    }

    public void a(String string, double d10) {
        this.f.put(string, new l(d10));
    }

    public boolean b(String string) {
        return this.f.containsKey(string);
    }

    public void a(String string, int[] arrn) {
        this.f.put(string, new t(arrn));
    }

    public short q(String string) {
        block4: {
            boolean bl2 = i.a();
            try {
                short s2 = this.a(string, 99);
                if (bl2) {
                    if (s2 == 0) break block4;
                    s2 = ((j)this.f.get(string)).a();
                }
                return s2;
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0;
    }

    public void a(String string, float f10) {
        this.f.put(string, new m(f10));
    }

    private f a(String string, int n2, ClassCastException classCastException) {
        f f10 = net.minecraft.c.f.a(classCastException, "Reading NBT data");
        net.minecraft.c.l l2 = f10.a("Corrupt NBT tag", 1);
        l2.a("Tag type found", new e(this, string));
        l2.a("Tag type expected", new b(this, n2));
        l2.a("Tag name", string);
        return f10;
    }

    static Map b(r r2) {
        return r2.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public u c(String string, int n2) {
        boolean bl2 = i.f();
        try {
            u u2;
            i i2 = this;
            if (!bl2) {
                if (i2.i(string) != 9) return new u();
                i2 = this.f.get(string);
            }
            u u3 = u2 = (u)i2;
            if (bl2) return u3;
            if (!u3.c()) {
                u3 = u2;
                if (bl2) return u3;
                if (u3.c() != n2) {
                    return new u();
                }
            }
            u3 = u2;
            return u3;
        }
        catch (ClassCastException classCastException) {
            throw new Z(this.a(string, 9, classCastException));
        }
    }

    private static void a(String string, i i2, DataOutput dataOutput) throws IOException {
        block3: {
            i i3;
            block2: {
                boolean bl2 = i.f();
                dataOutput.writeByte(i2.d());
                boolean bl3 = bl2;
                i3 = i2;
                if (bl3) break block2;
                if (i3.d() == 0) break block3;
                dataOutput.writeUTF(string);
                i3 = i2;
            }
            i3.a(dataOutput);
        }
    }

    public void a(String string, byte[] arrby) {
        this.f.put(string, new q(arrby));
    }

    public static void a(boolean bl2) {
        d = bl2;
    }

    @Override
    public boolean c() {
        return this.f.isEmpty();
    }

    static {
        c = LogManager.getLogger();
        e = Pattern.compile("[A-Za-z0-9._+-]+");
        r.a(true);
    }

    public String j(String string) {
        block4: {
            boolean bl2 = i.a();
            try {
                i i2 = this;
                if (bl2) {
                    if (!i2.a(string, 8)) break block4;
                    i2 = this.f.get(string);
                }
                return i2.b();
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return "";
    }

    public void a(String string, i i2) {
        this.f.put(string, i2);
    }

    protected static String c(String string) {
        return e.matcher(string).matches() ? string : w.a(string);
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f.hashCode();
    }

    public void a(String string, boolean bl2) {
        boolean bl3 = i.f();
        boolean bl4 = bl2;
        if (!bl3) {
            bl4 = bl4;
        }
        this.a(string, (byte)(bl4 ? (int)1 : 0));
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        block2: {
            Iterator<String> iterator = this.f.keySet().iterator();
            boolean bl2 = i.f();
            while (iterator.hasNext()) {
                String string = iterator.next();
                i i2 = this.f.get(string);
                r.a(string, i2, dataOutput);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block2;
            }
            dataOutput.writeByte(0);
        }
    }

    public void a(String string, UUID uUID) {
        this.a(string + "Most", uUID.getMostSignificantBits());
        this.a(string + "Least", uUID.getLeastSignificantBits());
    }

    public boolean f(String string) {
        boolean bl2 = i.f();
        boolean bl3 = this.r(string);
        if (!bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean p(String string) {
        boolean bl2 = i.a();
        boolean bl3 = this.a(string + "Most", 99);
        if (bl2) {
            if (!bl3) return false;
            bl3 = this.a(string + "Least", 99);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public void a(String string, short s2) {
        this.f.put(string, new p(s2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, int n2) {
        int n3 = this.i(string);
        boolean bl2 = i.a();
        int n4 = n3;
        int n5 = n2;
        if (bl2) {
            if (n4 == n5) {
                return true;
            }
            n4 = n2;
            n5 = 99;
        }
        if (bl2) {
            if (n4 != n5) {
                return false;
            }
            n4 = n3;
            if (!bl2) return n4 != 0;
            n5 = 1;
        }
        if (n4 == n5) return 1 != 0;
        n4 = n3;
        if (!bl2) return n4 != 0;
        if (n4 == 2) return 1 != 0;
        n4 = n3;
        if (!bl2) return n4 != 0;
        if (n4 == 3) return 1 != 0;
        n4 = n3;
        if (!bl2) return n4 != 0;
        if (n4 == 4) return 1 != 0;
        n4 = n3;
        if (!bl2) return n4 != 0;
        if (n4 == 5) return 1 != 0;
        n4 = n3;
        if (!bl2) return n4 != 0;
        if (n4 != 6) return 0 != 0;
        return 1 != 0;
    }

    public long o(String string) {
        block4: {
            boolean bl2 = i.f();
            try {
                i i2 = this;
                if (!bl2) {
                    if (!i2.a(string, 99)) break block4;
                    i2 = this.f.get(string);
                }
                return ((j)i2).c();
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0L;
    }

    public float d(String string) {
        block4: {
            boolean bl2 = i.f();
            try {
                i i2 = this;
                if (!bl2) {
                    if (!i2.a(string, 99)) break block4;
                    i2 = this.f.get(string);
                }
                return ((j)i2).e();
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0.0f;
    }

    public int[] n(String string) {
        block4: {
            boolean bl2 = i.f();
            try {
                i i2 = this;
                if (!bl2) {
                    if (!i2.a(string, 11)) break block4;
                    i2 = this.f.get(string);
                }
                return ((t)i2).a();
            }
            catch (ClassCastException classCastException) {
                throw new Z(this.a(string, 11, classCastException));
            }
        }
        return new int[0];
    }

    @Override
    public byte d() {
        return 10;
    }

    public void a(String string, long l2) {
        this.f.put(string, new o(l2));
    }

    public Set<String> d() {
        return this.f.keySet();
    }

    public double e(String string) {
        block4: {
            boolean bl2 = i.f();
            try {
                i i2 = this;
                if (!bl2) {
                    if (!i2.a(string, 99)) break block4;
                    i2 = this.f.get(string);
                }
                return ((j)i2).d();
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return 0.0;
    }
}

