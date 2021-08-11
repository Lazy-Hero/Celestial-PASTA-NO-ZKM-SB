/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class dK {
    private /* synthetic */ ArrayList d;
    private /* synthetic */ int c;
    private /* synthetic */ float b;
    private /* synthetic */ int a;

    public boolean d() {
        return this.d.isEmpty();
    }

    public void e() {
        this.d.clear();
        this.c = 0;
    }

    public void b(int n2, Object object) {
        String string = K.d();
        if (string == null) {
            if (object != null) {
                ++this.c;
            }
            this.d.add(n2, object);
        }
    }

    public boolean b(Object object) {
        block0: {
            if (object == null) break block0;
            ++this.c;
        }
        return this.d.add(object);
    }

    public boolean a(Object object) {
        return this.d.contains(object);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public Object a(int n2, Object object) {
        Object object2;
        block6: {
            Object object3;
            block7: {
                object3 = this.d.set(n2, object);
                String string = K.d();
                object2 = object;
                if (string != null) break block6;
                if (object2 == object3) break block7;
                object2 = object3;
                if (string == null) {
                    if (object2 == null) {
                        ++this.c;
                    }
                    object2 = object;
                }
                if (string != null) break block6;
                if (object2 == null) {
                    --this.c;
                }
            }
            object2 = object3;
        }
        return object2;
    }

    public int a() {
        return this.d.size();
    }

    public Object a(int n2) {
        return this.d.get(n2);
    }

    public dK(int n2) {
        this(n2, 0.75f);
    }

    public dK() {
        this(10, 0.75f);
    }

    public int b() {
        return this.c;
    }

    public dK(int n2, float f10) {
        this.d = null;
        this.a = 0;
        this.b = 1.0f;
        this.c = 0;
        this.d = new ArrayList(n2);
        this.a = n2;
        this.b = f10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void c() {
        block13: {
            block14: {
                var1_1 = K.d();
                v0 = this.c;
                if (var1_1 != null) break block13;
                if (v0 > 0) break block14;
                v0 = this.d.size();
                if (var1_1 != null) break block13;
                if (v0 <= 0) {
                    this.e();
                    if (var1_1 == null) return;
                }
            }
            v0 = this.d.size();
        }
        if (var1_1 == null) {
            if (v0 <= this.a) return;
            v0 = this.c;
        }
        var2_2 = (float)v0 * 1.0f / (float)this.d.size();
        cfr_temp_0 = var2_2 - this.b;
        v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        if (var1_1 == null) {
            if (v1 > 0) return;
            v1 = (float)false;
        }
        var3_3 = v1;
        var4_4 = 0;
        while (var4_4 < this.d.size()) {
            block15: {
                var5_5 = this.d.get(var4_4);
                if (var1_1 != null) break block15;
                v2 = var5_5;
                if (var1_1 != null) ** GOTO lbl42
                if (v2 != null) {
                    if (var4_4 != var3_3) {
                        this.d.set((int)var3_3, var5_5);
                    }
                    ++var3_3;
                }
                ++var4_4;
            }
            if (var1_1 == null) continue;
        }
        var4_4 = this.d.size() - 1;
        do {
            if (var4_4 < var3_3) return;
            v2 = this.d.remove(var4_4);
lbl42:
            // 2 sources

            --var4_4;
        } while (var1_1 == null);
    }

    public Object b(int n2) {
        Object e10 = this.d.remove(n2);
        String string = K.d();
        Object e11 = e10;
        if (string == null) {
            if (e11 != null) {
                --this.c;
            }
            e11 = e10;
        }
        return e11;
    }
}

