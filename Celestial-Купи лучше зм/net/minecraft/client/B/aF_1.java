/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.at.c;
import net.minecraft.at.g;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class aF
extends L {
    private final /* synthetic */ L A;
    private /* synthetic */ String B;
    private /* synthetic */ s y;
    private /* synthetic */ s z;
    private /* synthetic */ boolean C;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void r() {
        this.t.clear();
        this.t.add(new s(101, h / 2 - 155, w - 28, 150, 20, net.minecraft.client.D.h.a("lanServer.start", new Object[0])));
        this.t.add(new s(102, h / 2 + 5, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.y = this.b(new s(104, h / 2 - 155, 100, 150, 20, net.minecraft.client.D.h.a("selectWorld.gameMode", new Object[0])));
        this.z = this.b(new s(103, h / 2 + 5, 100, 150, 20, net.minecraft.client.D.h.a("selectWorld.allowCommands", new Object[0])));
        this.a();
    }

    @Override
    protected void a(s s2) throws IOException {
        block9: {
            c c10;
            block21: {
                block20: {
                    int n2;
                    int n3;
                    String[] arrstring;
                    block18: {
                        block19: {
                            block10: {
                                block11: {
                                    block14: {
                                        block17: {
                                            boolean bl2;
                                            block15: {
                                                block16: {
                                                    block12: {
                                                        block13: {
                                                            block7: {
                                                                block8: {
                                                                    arrstring = q.b();
                                                                    n3 = s2.g;
                                                                    n2 = 102;
                                                                    if (arrstring == null) break block7;
                                                                    if (n3 != n2) break block8;
                                                                    this.m.a(this.A);
                                                                    if (arrstring != null) break block9;
                                                                }
                                                                n3 = s2.g;
                                                                n2 = 104;
                                                            }
                                                            if (arrstring == null) break block10;
                                                            if (n3 != n2) break block11;
                                                            bl2 = "spectator".equals(this.B);
                                                            if (arrstring == null) break block12;
                                                            if (!bl2) break block13;
                                                            this.B = "creative";
                                                            if (arrstring != null) break block14;
                                                        }
                                                        bl2 = "creative".equals(this.B);
                                                    }
                                                    if (arrstring == null) break block15;
                                                    if (!bl2) break block16;
                                                    this.B = "adventure";
                                                    if (arrstring != null) break block14;
                                                }
                                                bl2 = "adventure".equals(this.B);
                                            }
                                            if (!bl2) break block17;
                                            this.B = "survival";
                                            if (arrstring != null) break block14;
                                        }
                                        this.B = "spectator";
                                    }
                                    this.a();
                                    if (arrstring != null) break block9;
                                }
                                n3 = s2.g;
                                n2 = 103;
                            }
                            if (arrstring == null) break block18;
                            if (n3 != n2) break block19;
                            boolean bl3 = this.C;
                            if (arrstring != null) {
                                bl3 = !bl3;
                            }
                            this.C = bl3;
                            this.a();
                            if (arrstring != null) break block9;
                        }
                        n3 = s2.g;
                        n2 = 101;
                    }
                    if (n3 != n2) break block9;
                    this.m.a((L)null);
                    String string = this.m.ae().a(net.minecraft.ah.s.a(this.B), this.C);
                    if (string == null) break block20;
                    c10 = new net.minecraft.at.h("commands.publish.started", string);
                    if (arrstring != null) break block21;
                }
                c10 = new g("commands.publish.failed");
            }
            this.m.n.f().a(c10);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("lanServer.title", new Object[0]), h / 2, 50, 0xFFFFFF);
        this.b(this.v, net.minecraft.client.D.h.a("lanServer.otherPlayers", new Object[0]), h / 2, 82, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    public aF(L l2) {
        this.B = "survival";
        this.A = l2;
    }

    private void a() {
        block4: {
            block2: {
                aF aF2;
                block3: {
                    this.y.m = net.minecraft.client.D.h.a("selectWorld.gameMode", new Object[0]) + ": " + net.minecraft.client.D.h.a("selectWorld.gameMode." + this.B, new Object[0]);
                    String[] arrstring = q.b();
                    this.z.m = net.minecraft.client.D.h.a("selectWorld.allowCommands", new Object[0]) + " ";
                    aF2 = this;
                    if (arrstring == null) break block2;
                    if (!aF2.C) break block3;
                    this.z.m = this.z.m + net.minecraft.client.D.h.a("options.on", new Object[0]);
                    if (arrstring != null) break block4;
                }
                aF2 = this;
            }
            aF2.z.m = this.z.m + net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
    }
}

