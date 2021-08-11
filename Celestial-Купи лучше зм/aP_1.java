/*
 * Decompiled with CFR 0.150.
 */
public class aP {
    public /* synthetic */ long b;
    public /* synthetic */ long a;

    public void c() {
        block3: {
            block4: {
                aP aP2;
                boolean bl2;
                block2: {
                    String string = K.d();
                    bl2 = fi.b;
                    if (string != null) break block2;
                    if (!bl2) break block3;
                    aP2 = this;
                    if (string != null) break block4;
                    long l2 = aP2.b - 0L;
                    bl2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                }
                if (bl2) break block3;
                aP2 = this;
            }
            aP2.b = System.nanoTime();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static void a(aP aP2) {
        aP2.b();
    }

    public void a() {
        block3: {
            block4: {
                aP aP2;
                boolean bl2;
                block2: {
                    String string = K.d();
                    bl2 = fi.b;
                    if (string != null) break block2;
                    if (!bl2) break block3;
                    aP2 = this;
                    if (string != null) break block4;
                    long l2 = aP2.b - 0L;
                    bl2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                }
                if (!bl2) break block3;
                this.a += System.nanoTime() - this.b;
                aP2 = this;
            }
            aP2.b = 0L;
        }
    }

    private void b() {
        this.a = 0L;
        this.b = 0L;
    }

    public aP() {
        this.b = 0L;
        this.a = 0L;
    }
}

