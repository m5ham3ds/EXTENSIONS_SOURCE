package eu.kanade.tachiyomi.extension.ar.mangapro;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/DeferredMediaSerializer;", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/DeferredMediaToken;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeferredMediaSerializer implements KSerializer<DeferredMediaToken> {
    public static final DeferredMediaSerializer INSTANCE = new DeferredMediaSerializer();
    private static final SerialDescriptor descriptor = DeferredMediaToken.INSTANCE.serializer().getDescriptor();

    private DeferredMediaSerializer() {
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public DeferredMediaToken m8deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoder = (JsonDecoder) decoder;
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonPrimitive) {
            return null;
        }
        return (DeferredMediaToken) jsonDecoder.getJson().decodeFromJsonElement(DeferredMediaToken.INSTANCE.serializer(), jsonElementDecodeJsonElement);
    }

    public void serialize(Encoder encoder, DeferredMediaToken value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value == null) {
            encoder.encodeNull();
        } else {
            DeferredMediaToken.INSTANCE.serializer().serialize(encoder, value);
        }
    }
}
