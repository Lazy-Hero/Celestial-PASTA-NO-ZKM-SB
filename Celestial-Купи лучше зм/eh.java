/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;

public class eh
extends e2 {
    /* synthetic */ Q f;

    public eh() {
        super("clip", "clip / hclip", "\u00a76.clip / (hclip) + / - \u00a73<value>", "clip", "hclip");
        this.f = Q.P();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String ... arrstring) {
        block19: {
            int n2;
            boolean bl2;
            block18: {
                bl2 = e0.c();
                n2 = arrstring.length;
                if (bl2) break block18;
                if (n2 <= 1) break block19;
                n2 = arrstring[0].equalsIgnoreCase("clip") ? 1 : 0;
            }
            if (!bl2) {
                if (n2 != 0) {
                    try {
                        boolean bl3 = arrstring[1].equals("+");
                        if (!bl2) {
                            if (bl3) {
                                this.f.s.g(this.f.s.a, this.f.s.aF + Double.parseDouble(arrstring[2]), this.f.s.ax);
                            }
                            bl3 = arrstring[1].equals("-");
                        }
                        if (bl3) {
                            this.f.s.g(this.f.s.a, this.f.s.aF - Double.parseDouble(arrstring[2]), this.f.s.ax);
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                n2 = arrstring[0].equalsIgnoreCase("hclip") ? 1 : 0;
            }
            if (n2 == 0) return;
            double d10 = this.f.s.a;
            double d11 = this.f.s.aF;
            double d12 = this.f.s.ax;
            double d13 = (double)this.f.s.e * 0.017453292;
            try {
                boolean bl4 = arrstring[1].equals("+");
                if (!bl2) {
                    if (bl4) {
                        this.f.s.g(d10 - Math.sin(d13) * Double.parseDouble(arrstring[2]), d11, d12 + Math.cos(d13) * Double.parseDouble(arrstring[2]));
                    }
                    bl4 = arrstring[1].equals("-");
                }
                if (bl4) {
                    this.f.s.g(d10 + Math.sin(d13) * Double.parseDouble(arrstring[2]), d11, d12 - Math.cos(d13) * Double.parseDouble(arrstring[2]));
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!bl2) return;
        }
        this.e();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

