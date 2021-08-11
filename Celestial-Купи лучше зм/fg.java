/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.Q.az;
import net.minecraft.R.b;
import net.minecraft.ah.A;
import net.minecraft.aw.w;

public class fg
extends A {
    private final /* synthetic */ b ah;

    @Override
    public void L() {
        block6: {
            boolean bl2;
            block5: {
                String string = K.d();
                super.L();
                String string2 = string;
                bl2 = fU.s();
                if (string2 == null) {
                    if (!bl2) {
                        this.a();
                    }
                    bl2 = fU.c;
                }
                if (string2 != null) break block5;
                if (!bl2) break block6;
                bl2 = false;
            }
            fU.c = bl2;
            gR.a(fU.a(), this);
        }
    }

    public fg(b b10, net.minecraft.aw.b b11, w w2, int n2, net.minecraft.aq.b b12) {
        super(b10, b11, w2, n2, b12);
        this.ah = b10;
    }

    private void a() {
        block11: {
            int n2;
            long l2;
            long l3;
            String string;
            block14: {
                block12: {
                    block13: {
                        fg fg2;
                        block10: {
                            string = K.d();
                            fg2 = this;
                            if (string != null) break block10;
                            if (fg2.u.g().c() != 1) break block11;
                            fg2 = this;
                        }
                        l3 = fg2.s();
                        l2 = l3 % 24000L;
                        n2 = fU.bb();
                        if (string != null) break block12;
                        if (n2 == 0) break block13;
                        long l4 = l2 - 1000L;
                        n2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (string == null) {
                            long l5;
                            if (n2 <= 0) {
                                this.b(l3 - l2 + 1001L);
                            }
                            n2 = (l5 = l2 - 11000L) == 0L ? 0 : (l5 < 0L ? -1 : 1);
                        }
                        if (string != null) break block12;
                        if (n2 >= 0) {
                            this.b(l3 - l2 + 24001L);
                        }
                    }
                    n2 = fU.N();
                }
                if (string != null) break block14;
                if (n2 == 0) break block11;
                long l6 = l2 - 14000L;
                n2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
            }
            if (string == null) {
                long l7;
                if (n2 <= 0) {
                    this.b(l3 - l2 + 14001L);
                }
                n2 = (l7 = l2 - 22000L) == 0L ? 0 : (l7 < 0L ? -1 : 1);
            }
            if (n2 >= 0) {
                this.b(l3 - l2 + 24000L + 14001L);
            }
        }
    }

    @Override
    protected void S() {
        String string = K.d();
        if (string == null) {
            if (!fU.e()) {
                this.e();
            }
            super.S();
        }
    }

    private void e() {
        block4: {
            w w2;
            block2: {
                block3: {
                    String string = K.d();
                    w2 = this.u;
                    if (string != null) break block2;
                    if (w2.b()) break block3;
                    w2 = this.u;
                    if (string != null) break block2;
                    if (!w2.k()) break block4;
                }
                this.u.g(0);
                this.u.c(false);
                this.f(0.0f);
                this.u.a(0);
                w2 = this.u;
            }
            w2.a(false);
            this.i(0.0f);
            this.ah.O().a(new az(2, 0.0f));
            this.ah.O().a(new az(7, 0.0f));
            this.ah.O().a(new az(8, 0.0f));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

