package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.extension.ar.mangapro.Series;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"eu/kanade/tachiyomi/extension/ar/mangapro/Series.Manga.MetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Series$Manga$MetaData$$serializer implements GeneratedSerializer<Series.Manga.MetaData> {
    public static final Series$Manga$MetaData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Series$Manga$MetaData$$serializer series$Manga$MetaData$$serializer = new Series$Manga$MetaData$$serializer();
        INSTANCE = series$Manga$MetaData$$serializer;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("eu.kanade.tachiyomi.extension.ar.mangapro.Series.Manga.MetaData", series$Manga$MetaData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("originalTitle", true);
        pluginGeneratedSerialDescriptor.addElement("altTitles", true);
        pluginGeneratedSerialDescriptor.addElement("author", true);
        pluginGeneratedSerialDescriptor.addElement("artist", true);
        pluginGeneratedSerialDescriptor.addElement("year", true);
        pluginGeneratedSerialDescriptor.addElement("genres", true);
        pluginGeneratedSerialDescriptor.addElement("tags", true);
        pluginGeneratedSerialDescriptor.addElement("origin", true);
        pluginGeneratedSerialDescriptor.addElement("coverImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Series$Manga$MetaData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = Series.Manga.MetaData.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), lazyArr[1].getValue(), StringListSerializer.INSTANCE, StringListSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), lazyArr[5].getValue(), lazyArr[6].getValue(), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final Series.Manga.MetaData m24deserialize(Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        List list2;
        List list3;
        List list4;
        String str2;
        List list5;
        String str3;
        String str4;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = Series.Manga.MetaData.$childSerializers;
        int i2 = 7;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, (Object) null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StringListSerializer.INSTANCE, (Object) null);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, StringListSerializer.INSTANCE, (Object) null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, (Object) null);
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), (Object) null);
            list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
            str = str6;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, (Object) null);
            list = list8;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, (Object) null);
            str4 = str7;
            list3 = list7;
            list5 = list9;
            list2 = list6;
            i = 511;
        } else {
            List list10 = null;
            String str8 = null;
            List list11 = null;
            String str9 = null;
            String str10 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            int i3 = 0;
            char c = 1;
            char c2 = 5;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = 7;
                        c = 1;
                        c2 = 5;
                        z = false;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                        i3 |= 1;
                        i2 = 7;
                        c = 1;
                        c2 = 5;
                        break;
                    case 1:
                        list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[c].getValue(), list13);
                        i3 |= 2;
                        i2 = 7;
                        c = 1;
                        c2 = 5;
                        break;
                    case 2:
                        list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, StringListSerializer.INSTANCE, list14);
                        i3 |= 4;
                        i2 = 7;
                        c2 = 5;
                        break;
                    case 3:
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, StringListSerializer.INSTANCE, list12);
                        i3 |= 8;
                        i2 = 7;
                        c2 = 5;
                        break;
                    case 4:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str10);
                        i3 |= 16;
                        i2 = 7;
                        c2 = 5;
                        break;
                    case 5:
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[c2].getValue(), list11);
                        i3 |= 32;
                        i2 = 7;
                        c2 = 5;
                        break;
                    case 6:
                        list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list10);
                        i3 |= 64;
                        i2 = 7;
                        break;
                    case 7:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        i3 |= 128;
                        break;
                    case 8:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str9);
                        i3 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list15 = list14;
            list = list12;
            str = str5;
            list2 = list13;
            list3 = list15;
            list4 = list10;
            str2 = str8;
            list5 = list11;
            str3 = str9;
            str4 = str10;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Series.Manga.MetaData(i, str, list2, list3, list, str4, list5, list4, str2, str3, (SerializationConstructorMarker) null);
    }

    public final void serialize(Encoder encoder, Series.Manga.MetaData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Series.Manga.MetaData.write$Self$mangapro(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
