package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.extension.ar.mangapro.Series;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"eu/kanade/tachiyomi/extension/ar/mangapro/Series.Manga.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Series$Manga$$serializer implements GeneratedSerializer<Series.Manga> {
    public static final Series$Manga$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Series$Manga$$serializer series$Manga$$serializer = new Series$Manga$$serializer();
        INSTANCE = series$Manga$$serializer;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("eu.kanade.tachiyomi.extension.ar.mangapro.Series.Manga", series$Manga$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("slug", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("progress", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        pluginGeneratedSerialDescriptor.addElement("cdn_path", true);
        pluginGeneratedSerialDescriptor.addElement("coverImageApp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Series$Manga$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), Series$Manga$MetaData$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(CoverImage$$serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final Series.Manga m23deserialize(Decoder decoder) throws UnknownFieldException {
        int iDecodeIntElement;
        Series.Manga.MetaData metaData;
        String str;
        String str2;
        String str3;
        CoverImage coverImage;
        int i;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, (Object) null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, (Object) null);
            Series.Manga.MetaData metaData2 = (Series.Manga.MetaData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, Series$Manga$MetaData$$serializer.INSTANCE, (Object) null);
            str3 = strDecodeStringElement2;
            str = strDecodeStringElement;
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, (Object) null);
            metaData = metaData2;
            str2 = str8;
            str5 = strDecodeStringElement3;
            coverImage = (CoverImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CoverImage$$serializer.INSTANCE, (Object) null);
            str4 = str7;
            i = 511;
        } else {
            String str9 = null;
            CoverImage coverImage2 = null;
            Series.Manga.MetaData metaData3 = null;
            String str10 = null;
            String str11 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            iDecodeIntElement = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i2 = 7;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 7;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 7;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        i3 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str10);
                        i3 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        metaData3 = (Series.Manga.MetaData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, Series$Manga$MetaData$$serializer.INSTANCE, metaData3);
                        i3 |= 64;
                        break;
                    case 7:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str9);
                        i3 |= 128;
                        break;
                    case 8:
                        coverImage2 = (CoverImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CoverImage$$serializer.INSTANCE, coverImage2);
                        i3 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str12 = strDecodeStringElement5;
            metaData = metaData3;
            str = strDecodeStringElement4;
            str2 = str10;
            str3 = str12;
            coverImage = coverImage2;
            i = i3;
            str4 = str11;
            str5 = strDecodeStringElement6;
            str6 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Series.Manga(i, iDecodeIntElement, str, str3, str5, str4, str2, metaData, str6, coverImage, (SerializationConstructorMarker) null);
    }

    public final void serialize(Encoder encoder, Series.Manga value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Series.Manga.write$Self$mangapro(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
