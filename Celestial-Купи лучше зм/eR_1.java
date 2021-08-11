/*
 * Decompiled with CFR 0.150.
 */
public class eR
extends e2 {
    private static gP b(gP gP2) {
        return gP2;
    }

    public eR() {
        super("clientname", "Change text displayed on watermark.", "\u00a76.clientname \u00a73<name>", "clientname", "name", "rename");
    }

    @Override
    public void a(String ... arrstring) {
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    bl2 = e0.a();
                    if (arrstring.length < 2) break block3;
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i2 = 1; i2 < arrstring.length; ++i2) {
                        String string = arrstring[i2];
                        string = string.replace('&', '\u00a7');
                        stringBuilder.append(string).append(" ");
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block2;
                    }
                    cp.a(String.format("\u00a7lChanged client name to \u00a7f\"\u00a7a\u00a7l%s\u00a7f\" was \u00a7f\"\u00a7c\u00a7l%s\u00a7f\".", stringBuilder.toString().trim(), bk.k));
                    bk.k = stringBuilder.toString().trim();
                }
                if (bl2) break block4;
            }
            this.e();
        }
    }
}

