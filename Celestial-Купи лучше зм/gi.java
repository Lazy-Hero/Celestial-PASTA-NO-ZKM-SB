/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

public class gi {
    private static final /* synthetic */ Pattern c;
    private static final /* synthetic */ Pattern b;
    private static final /* synthetic */ Set<String> a;

    private static void a(fK fK2, String string, Map<String, dB> map) {
        String[] arrstring = gi.a(fK2, string);
        int n2 = 0;
        String string2 = dB.i();
        while (n2 < arrstring.length) {
            block8: {
                block9: {
                    dB dB2;
                    String string3;
                    dB dB3;
                    block13: {
                        dB dB4;
                        block17: {
                            dB dB5;
                            block18: {
                                dB dB6;
                                block15: {
                                    block16: {
                                        String string4;
                                        block14: {
                                            dB dB7;
                                            block11: {
                                                block12: {
                                                    boolean bl2;
                                                    block10: {
                                                        String string5 = arrstring[n2];
                                                        dB3 = gi.a(string5, string);
                                                        if (string2 == null) break block8;
                                                        if (dB3 == null) break block9;
                                                        bl2 = dB3.l().startsWith(f6.c());
                                                        if (string2 == null) break block10;
                                                        if (bl2) break block9;
                                                        dB7 = dB3;
                                                        if (string2 == null) break block11;
                                                        bl2 = dB7.n();
                                                    }
                                                    if (!bl2) break block12;
                                                    dB7 = dB3;
                                                    if (string2 == null) break block11;
                                                    if (!gi.a(dB7, arrstring)) break block9;
                                                }
                                                dB7 = dB3;
                                            }
                                            string3 = dB7.l();
                                            dB2 = dB5 = map.get(string3);
                                            if (string2 == null) break block9;
                                            if (dB2 == null) break block13;
                                            string4 = dB5.j();
                                            if (string2 == null) break block14;
                                            if (!fU.a((Object)string4, (Object)dB3.j())) {
                                                fU.h("Ambiguous shader option: " + dB3.l());
                                                fU.h(" - in " + fU.a(dB5.d()) + ": " + dB5.j());
                                                fU.h(" - in " + fU.a(dB3.d()) + ": " + dB3.j());
                                                dB5.a(false);
                                            }
                                            dB6 = dB5;
                                            if (string2 == null) break block15;
                                            string4 = dB6.r();
                                        }
                                        if (string4 == null) break block16;
                                        dB4 = dB5;
                                        if (string2 == null) break block17;
                                        if (dB4.r().length() > 0) break block18;
                                    }
                                    dB6 = dB5;
                                }
                                dB6.b(dB3.r());
                            }
                            dB4 = dB5;
                        }
                        dB4.a(dB3.d());
                        if (string2 != null) break block9;
                    }
                    dB2 = map.put(string3, dB3);
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
    }

    private static aC a(String string, Properties properties, Set<String> set, dB[] arrdB) {
        String string2 = "profile.";
        String string3 = dB.i();
        String string4 = string2 + string;
        boolean bl2 = set.contains(string4);
        if (string3 != null) {
            if (bl2) {
                fU.h("[Shaders] Profile already parsed: " + string);
                return null;
            }
            bl2 = set.add(string);
        }
        aC aC2 = new aC(string);
        String string5 = properties.getProperty(string4);
        String[] arrstring = fU.c(string5, " ");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            String string6;
            block37: {
                int n2;
                int n3;
                block26: {
                    block27: {
                        block34: {
                            Object object5;
                            block35: {
                                Object object6;
                                boolean bl3;
                                block36: {
                                    Object object7;
                                    block30: {
                                        block29: {
                                            block33: {
                                                block32: {
                                                    Object object8;
                                                    block31: {
                                                        boolean bl4;
                                                        block28: {
                                                            String string7;
                                                            String string8;
                                                            block22: {
                                                                block23: {
                                                                    block25: {
                                                                        aC aC3;
                                                                        block24: {
                                                                            string8 = string6 = arrstring[i2];
                                                                            string7 = string2;
                                                                            if (string3 == null) break block22;
                                                                            if (!string8.startsWith(string7)) break block23;
                                                                            object4 = string6.substring(string2.length());
                                                                            object3 = gi.a((String)object4, properties, set, arrdB);
                                                                            aC3 = aC2;
                                                                            if (string3 == null) break block24;
                                                                            if (aC3 == null) break block25;
                                                                            aC2.a((aC)object3);
                                                                            aC3 = aC2;
                                                                        }
                                                                        aC3.a(((aC)object3).a());
                                                                    }
                                                                    if (string3 != null) continue;
                                                                }
                                                                string8 = string6;
                                                                string7 = ":=";
                                                            }
                                                            object4 = fU.c(string8, string7);
                                                            n3 = ((String[])object4).length;
                                                            n2 = 1;
                                                            if (string3 == null) break block26;
                                                            if (n3 != n2) break block27;
                                                            object3 = object4[0];
                                                            bl3 = true;
                                                            Object object9 = object3;
                                                            if (string3 != null) {
                                                                if (((String)object9).startsWith("!")) {
                                                                    bl3 = false;
                                                                    object3 = ((String)object3).substring(1);
                                                                }
                                                                object9 = "program.";
                                                            }
                                                            object2 = object9;
                                                            bl4 = bl3;
                                                            if (string3 == null) break block28;
                                                            if (bl4) break block29;
                                                            object7 = object3;
                                                            if (string3 == null) break block30;
                                                            bl4 = ((String)object7).startsWith("program.");
                                                        }
                                                        if (!bl4) break block29;
                                                        object8 = object6 = ((String)object3).substring(((String)object2).length());
                                                        if (string3 == null) break block31;
                                                        if (cS.i((String)object8)) break block32;
                                                        object8 = "Invalid program: " + (String)object6 + " in profile: " + aC2.b();
                                                    }
                                                    fU.h((String)object8);
                                                    if (string3 != null) break block33;
                                                }
                                                aC2.b((String)object6);
                                            }
                                            if (string3 != null) break block34;
                                        }
                                        object7 = object3;
                                    }
                                    object5 = object6 = ds.a((String)object7, arrdB);
                                    if (string3 == null) break block35;
                                    if (object5 instanceof ew) break block36;
                                    fU.h("[Shaders] Invalid option: " + (String)object3);
                                    if (string3 != null) break block34;
                                }
                                aC2.a((String)object3, String.valueOf(bl3));
                                object5 = object6;
                            }
                            ((dB)object5).b(true);
                        }
                        if (string3 != null) continue;
                    }
                    object = object4;
                    if (string3 == null) break block37;
                    n3 = ((String[])object).length;
                    n2 = 2;
                }
                if (n3 != n2) {
                    fU.h("[Shaders] Invalid option value: " + string6);
                    if (string3 != null) continue;
                }
                object = object4;
            }
            object3 = object[0];
            String string9 = object4[1];
            Object object10 = object2 = ds.a((String)object3, arrdB);
            if (string3 != null) {
                if (object10 == null) {
                    fU.h("[Shaders] Invalid option: " + string6);
                    if (string3 != null) continue;
                }
                object10 = object2;
            }
            if (string3 != null) {
                if (!((dB)object10).a(string9)) {
                    fU.h("[Shaders] Invalid value: " + string6);
                    if (string3 != null) continue;
                }
                object10 = object2;
            }
            ((dB)object10).b(true);
            aC2.a((String)object3, string9);
            if (string3 != null) continue;
        }
        return aC2;
    }

    private static String[] a(String string, String[] arrstring) {
        String[] arrstring2;
        block4: {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string2 = dB.i();
            int n2 = 0;
            while (n2 < arrstring.length) {
                arrstring2 = arrstring;
                if (string2 != null) {
                    String string3 = arrstring2[n2];
                    if (string2 != null) {
                        if (string.contains(string3)) {
                            arrayList.add(string3);
                        }
                        ++n2;
                    }
                    if (string2 != null) continue;
                }
                break block4;
            }
            arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        }
        String[] arrstring3 = arrstring2;
        return arrstring3;
    }

    public static BufferedReader a(BufferedReader bufferedReader, String string, fK fK2, int n2, List<String> list, int n3) throws IOException {
        String string2 = "/";
        int n4 = string.lastIndexOf("/");
        String string3 = dB.i();
        if (n4 >= 0) {
            string2 = string.substring(0, n4);
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n5 = -1;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        int n6 = 1;
        block0: while (true) {
            String string4;
            block33: {
                String string5;
                Object object;
                block34: {
                    int n7;
                    block32: {
                        Object object2;
                        block31: {
                            block30: {
                                int n8;
                                block28: {
                                    block27: {
                                        block26: {
                                            block29: {
                                                if ((string4 = bufferedReader.readLine()) != null) break block27;
                                                object2 = charArrayWriter.toCharArray();
                                                n8 = n5;
                                                if (string3 == null) break block28;
                                                if (string3 == null) break block29;
                                                if (n8 < 0) break block26;
                                                n8 = linkedHashSet.size();
                                            }
                                            if (n8 > 0) {
                                                object = new StringBuilder();
                                                for (String string6 : linkedHashSet) {
                                                    object.append("#define ");
                                                    object.append(string6);
                                                    object.append("\n");
                                                    if (string3 != null) {
                                                        if (string3 != null) continue;
                                                    }
                                                    break block26;
                                                }
                                                String string6 = object.toString();
                                                StringBuilder stringBuilder = new StringBuilder(new String((char[])object2));
                                                stringBuilder.insert(n5, string6);
                                                String string7 = stringBuilder.toString();
                                                object2 = string7.toCharArray();
                                            }
                                        }
                                        object = new CharArrayReader((char[])object2);
                                        return new BufferedReader((Reader)object);
                                    }
                                    n8 = n5;
                                }
                                if (n8 >= 0) break block30;
                                object2 = c.matcher(string4);
                                n7 = object2.matches();
                                if (string3 == null) break block31;
                                if (n7 != 0) {
                                    object = f6.a();
                                    String string8 = string4 + "\n" + (String)object;
                                    String string9 = "#line " + (n6 + 1) + " " + n2;
                                    string4 = string8 + string9;
                                    n5 = charArrayWriter.size() + string8.length();
                                }
                            }
                            object2 = b.matcher(string4);
                            n7 = object2.matches();
                        }
                        if (string3 != null) {
                            if (n7 != 0) {
                                object = object2.group(1);
                                boolean bl2 = object.startsWith("/");
                                String string10 = bl2 ? "/shaders" + (String)object : string2 + "/" + (String)object;
                                int n9 = list.contains(string10);
                                if (string3 != null) {
                                    if (n9 == 0) {
                                        list.add(string10);
                                    }
                                    n9 = list.indexOf(string10) + 1;
                                }
                                int n10 = n9;
                                String string11 = string4 = gi.a(string10, fK2, n10, list, n3);
                                if (string3 != null) {
                                    if (string11 == null) {
                                        throw new IOException("Included file not found: " + string);
                                    }
                                    string11 = string4;
                                }
                                if (string3 != null) {
                                    if (string11.endsWith("\n")) {
                                        string4 = string4.substring(0, string4.length() - 1);
                                    }
                                    string11 = "#line 1 " + n10 + "\n" + string4 + "\n#line " + (n6 + 1) + " " + n2;
                                }
                                string4 = string11;
                            }
                            n7 = n5;
                        }
                        if (string3 == null) break block32;
                        if (n7 < 0) break block33;
                        string5 = string4;
                        if (string3 == null) break block34;
                        n7 = string5.contains(f6.c()) ? 1 : 0;
                    }
                    if (n7 == 0) break block33;
                    string5 = string4;
                }
                object = gi.a(string5, f6.f());
                for (int i2 = 0; i2 < ((String[])object).length; ++i2) {
                    String string12 = object[i2];
                    linkedHashSet.add(string12);
                    if (string3 == null) continue block0;
                    if (string3 != null) continue;
                }
            }
            charArrayWriter.write(string4);
            charArrayWriter.write("\n");
            ++n6;
        }
    }

    private static boolean a(String string, Properties properties, Map<String, g2> map, aC[] arraC, dB[] arrdB) {
        Object object;
        String string2;
        Object[] arrobject;
        block15: {
            String string3 = properties.getProperty(string);
            String string4 = dB.i();
            if (string3 == null) {
                return false;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            HashSet<String> hashSet = new HashSet<String>();
            String[] arrstring = fU.c(string3, " ");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string5;
                Object object2;
                block17: {
                    block18: {
                        block21: {
                            block23: {
                                String string6;
                                block22: {
                                    boolean bl2;
                                    block19: {
                                        block20: {
                                            boolean bl3;
                                            block16: {
                                                arrobject = arrstring;
                                                if (string4 == null) break block15;
                                                string2 = arrobject[i2];
                                                bl3 = string2.equals("<empty>");
                                                if (string4 != null) {
                                                    if (bl3) {
                                                        arrayList.add(null);
                                                        if (string4 != null) continue;
                                                    }
                                                    bl3 = hashSet.contains(string2);
                                                }
                                                if (string4 != null) {
                                                    if (bl3) {
                                                        fU.h("[Shaders] Duplicate option: " + string2 + ", key: " + string);
                                                        if (string4 != null) continue;
                                                    }
                                                    hashSet.add(string2);
                                                    bl3 = string2.equals("<profile>");
                                                }
                                                if (string4 != null) {
                                                    if (bl3) {
                                                        if (arraC == null) {
                                                            fU.h("[Shaders] Option profile can not be used, no profiles defined: " + string2 + ", key: " + string);
                                                            if (string4 != null) continue;
                                                        }
                                                        object2 = new d8(arraC, arrdB);
                                                        arrayList.add(object2);
                                                        if (string4 != null) continue;
                                                    }
                                                    bl3 = string2.equals("*");
                                                }
                                                if (string4 == null) break block16;
                                                if (bl3) {
                                                    object2 = new eu("<rest>");
                                                    arrayList.add(object2);
                                                    if (string4 != null) continue;
                                                }
                                                string5 = string2;
                                                if (string4 == null) break block17;
                                                bl3 = string5.startsWith("[");
                                            }
                                            if (!bl3) break block18;
                                            string5 = string2;
                                            if (string4 == null) break block17;
                                            if (!string5.endsWith("]")) break block18;
                                            object2 = dQ.b(string2, "[", "]");
                                            bl2 = ((String)object2).matches("^[a-zA-Z0-9_]+$");
                                            if (string4 == null) break block19;
                                            if (bl2) break block20;
                                            fU.h("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                                            if (string4 != null) break block21;
                                        }
                                        string6 = "screen." + (String)object2;
                                        if (string4 == null) break block22;
                                        bl2 = gi.a(string6, properties, map, arraC, arrdB);
                                    }
                                    if (bl2) break block23;
                                    string6 = "[Shaders] Invalid screen: " + string2 + ", key: " + string;
                                }
                                fU.h(string6);
                                if (string4 != null) break block21;
                            }
                            object = new e1((String)object2);
                            arrayList.add(object);
                        }
                        if (string4 != null) continue;
                    }
                    string5 = string2;
                }
                object2 = ds.a(string5, arrdB);
                dB dB2 = object2;
                if (string4 != null) {
                    if (dB2 == null) {
                        fU.h("[Shaders] Invalid option: " + string2 + ", key: " + string);
                        arrayList.add(null);
                        if (string4 != null) continue;
                    }
                    dB2 = object2;
                }
                dB2.b(true);
                arrayList.add(object2);
                if (string4 != null) continue;
            }
            arrobject = arrayList.toArray(new dB[arrayList.size()]);
        }
        dB[] arrdB2 = (dB[])arrobject;
        string2 = properties.getProperty(string + ".columns");
        int n2 = fU.b(string2, 2);
        object = new g2(string, arrdB2, n2);
        map.put(string, (g2)object);
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static aC[] b(Properties properties, dB[] arrdB) {
        ArrayList<aC> arrayList;
        aC[] arraC;
        ArrayList<aC> arrayList2;
        block12: {
            int n2;
            block9: {
                String string = "profile.";
                arrayList2 = new ArrayList<aC>();
                arraC = properties.keySet().iterator();
                String string2 = dB.i();
                while (arraC.hasNext()) {
                    block11: {
                        String string3;
                        String string4;
                        String string5;
                        block10: {
                            Object object = arraC.next();
                            string4 = string5 = (String)object;
                            string3 = string;
                            if (string2 == null) break block10;
                            n2 = string4.startsWith(string3) ? 1 : 0;
                            if (string2 == null) break block9;
                            if (n2 == 0) break block11;
                            string4 = string5;
                            string3 = string;
                        }
                        String string6 = string4.substring(string3.length());
                        properties.getProperty(string5);
                        HashSet<String> hashSet = new HashSet<String>();
                        aC aC2 = gi.a(string6, properties, hashSet, arrdB);
                        if (aC2 != null) {
                            arrayList2.add(aC2);
                        }
                    }
                    if (string2 != null) continue;
                }
                arrayList = arrayList2;
                if (string2 == null) break block12;
                n2 = arrayList.size();
            }
            if (n2 <= 0) {
                return null;
            }
            arrayList = arrayList2;
        }
        arraC = arrayList.toArray(new aC[arrayList2.size()]);
        return arraC;
    }

    private static String[] a(fK fK2, String string) {
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string2 = gi.a(string, fK2, 0, arrayList, 0);
            if (string2 == null) {
                return new String[0];
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string2.getBytes());
            String[] arrstring = fU.d(byteArrayInputStream);
            return arrstring;
        }
        catch (IOException iOException) {
            fU.b(iOException.getClass().getName() + ": " + iOException.getMessage());
            return new String[0];
        }
    }

    private static dB a(String string, String string2) {
        dB dB2 = null;
        String string3 = dB.i();
        if (dB2 == null) {
            dB2 = ew.a(string, string2);
        }
        dB dB3 = dB2;
        if (string3 != null) {
            if (dB3 == null) {
                dB2 = el.b(string, string2);
            }
            dB3 = dB2;
        }
        if (string3 != null) {
            if (dB3 != null) {
                return dB2;
            }
            dB3 = dB2;
        }
        if (string3 != null) {
            if (dB3 == null) {
                dB2 = ev.b(string, string2);
            }
            dB3 = dB2;
        }
        if (string3 != null) {
            if (dB3 == null) {
                dB2 = eE.a(string, string2);
            }
            dB3 = dB2;
        }
        return dB3 != null && a.contains(dB2.l()) ? dB2 : null;
    }

    private static Set<String> a() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("shadowMapResolution");
        hashSet.add("shadowMapFov");
        hashSet.add("shadowDistance");
        hashSet.add("shadowDistanceRenderMul");
        hashSet.add("shadowIntervalSize");
        hashSet.add("generateShadowMipmap");
        hashSet.add("generateShadowColorMipmap");
        hashSet.add("shadowHardwareFiltering");
        hashSet.add("shadowHardwareFiltering0");
        hashSet.add("shadowHardwareFiltering1");
        hashSet.add("shadowtex0Mipmap");
        hashSet.add("shadowtexMipmap");
        hashSet.add("shadowtex1Mipmap");
        hashSet.add("shadowcolor0Mipmap");
        hashSet.add("shadowColor0Mipmap");
        hashSet.add("shadowcolor1Mipmap");
        hashSet.add("shadowColor1Mipmap");
        hashSet.add("shadowtex0Nearest");
        hashSet.add("shadowtexNearest");
        hashSet.add("shadow0MinMagNearest");
        hashSet.add("shadowtex1Nearest");
        hashSet.add("shadow1MinMagNearest");
        hashSet.add("shadowcolor0Nearest");
        hashSet.add("shadowColor0Nearest");
        hashSet.add("shadowColor0MinMagNearest");
        hashSet.add("shadowcolor1Nearest");
        hashSet.add("shadowColor1Nearest");
        hashSet.add("shadowColor1MinMagNearest");
        hashSet.add("wetnessHalflife");
        hashSet.add("drynessHalflife");
        hashSet.add("eyeBrightnessHalflife");
        hashSet.add("centerDepthHalflife");
        hashSet.add("sunPathRotation");
        hashSet.add("ambientOcclusionLevel");
        hashSet.add("superSamplingLevel");
        hashSet.add("noiseTextureResolution");
        return hashSet;
    }

    public static dB[] a(fK fK2, String[] arrstring, List<Integer> list) {
        dB[] arrdB;
        String string = dB.i();
        if (fK2 == null) {
            return new dB[0];
        }
        HashMap<String, dB> hashMap = new HashMap<String, dB>();
        gi.a(fK2, "/shaders", arrstring, hashMap);
        for (int n2 : list) {
            arrdB = "/shaders/world" + n2;
            gi.a(fK2, (String)arrdB, arrstring, hashMap);
            if (string != null) continue;
        }
        Collection collection = hashMap.values();
        arrdB = collection.toArray(new dB[collection.size()]);
        c8 c82 = new c8();
        Arrays.sort(arrdB, c82);
        return arrdB;
    }

    private static String a(String string, fK fK2, int n2, List<String> list, int n3) throws IOException {
        InputStream inputStream;
        String string2 = dB.i();
        if (string2 != null) {
            if (n3 >= 10) {
                throw new IOException("#include depth exceeded: " + n3 + ", file: " + string);
            }
            ++n3;
        }
        if ((inputStream = fK2.a(string)) == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.US_ASCII);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader = gi.a(bufferedReader, string, fK2, n2, list, n3);
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        while (true) {
            CharArrayWriter charArrayWriter2;
            String string3;
            if ((string3 = bufferedReader.readLine()) == null) {
                charArrayWriter2 = charArrayWriter;
                if (string2 != null) {
                    return charArrayWriter2.toString();
                }
            } else {
                charArrayWriter.write(string3);
                charArrayWriter2 = charArrayWriter;
            }
            charArrayWriter2.write("\n");
        }
    }

    private static boolean a(dB dB2, String[] arrstring) {
        boolean bl2;
        block4: {
            int n2 = 0;
            String string = dB.i();
            while (n2 < arrstring.length) {
                String string2 = arrstring[n2];
                if (string != null) {
                    bl2 = dB2.g(string2);
                    if (string == null) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static Set<String> a(Properties properties, dB[] arrdB) {
        HashSet<String> hashSet = new HashSet<String>();
        String string = properties.getProperty("sliders");
        String string2 = dB.i();
        String string3 = string;
        if (string2 != null) {
            if (string3 == null) {
                return hashSet;
            }
            string3 = string;
        }
        String[] arrstring = fU.c(string3, " ");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string4;
            block7: {
                block6: {
                    string4 = arrstring[i2];
                    dB dB2 = ds.a(string4, arrdB);
                    if (string2 == null) break block6;
                    if (dB2 != null) break block7;
                    fU.h("Invalid shader option: " + string4);
                }
                if (string2 != null) continue;
            }
            hashSet.add(string4);
            if (string2 != null) continue;
        }
        return hashSet;
    }

    static {
        c = Pattern.compile("^\\s*#version\\s+.*$");
        b = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
        a = gi.a();
    }

    public static Map<String, g2> a(Properties properties, aC[] arraC, dB[] arrdB) {
        HashMap<String, g2> hashMap = new HashMap<String, g2>();
        gi.a("screen", properties, hashMap, arraC, arrdB);
        return hashMap.isEmpty() ? null : hashMap;
    }

    private static void a(fK fK2, String string, String[] arrstring, Map<String, dB> map) {
        int n2 = 0;
        String string2 = dB.i();
        while (n2 < arrstring.length) {
            String string3 = arrstring[n2];
            if (string2 != null) {
                if (!string3.equals("")) {
                    String string4 = string + "/" + string3 + ".vsh";
                    String string5 = string + "/" + string3 + ".fsh";
                    gi.a(fK2, string4, map);
                    gi.a(fK2, string5, map);
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
    }
}

